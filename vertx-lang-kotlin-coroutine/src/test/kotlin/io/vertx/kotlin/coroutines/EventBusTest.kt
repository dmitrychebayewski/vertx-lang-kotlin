package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.ReplyException
import io.vertx.core.eventbus.ReplyFailure
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner::class)
class EventBusTest {

  private lateinit var vertx: Vertx

  @Before
  fun before() {
    vertx = Vertx.vertx()
  }

  @After
  fun after(testContext: TestContext) {
    vertx.close(testContext.asyncAssertSuccess())
  }

  @Test
  fun testUnregister(testContext: TestContext) {
    val bus = vertx.eventBus()
    val consumer = bus.consumer<Int>("the-address")
    val channel = toChannel(vertx, consumer.bodyStream())
    val async = testContext.async()
    vertx.launch {
      val list = ArrayList<Int>()
      for (msg in channel) {
        list += msg
      }
      testContext.assertEquals(listOf(0, 1, 2, 3, 4), list)
      async.complete()
    }
    for (index in listOf(0, 1, 2, 3, 4)) {
      bus.send("the-address", index)
    }
    vertx.setTimer(50) {
      consumer.unregister()
    }
  }

  @Test
  fun testReply(testContext: TestContext) {
    val bus = vertx.eventBus()
    val consumer = bus.consumer<Int>("the-address")
    val channel = toChannel(vertx, consumer.bodyStream())
    val async = testContext.async()
    bus.consumer<Int>("another-address") { msg ->
      val v = msg.body()
      if (v < 5) {
        println("replying")
        msg.reply(4)
      } else {
        println("ending")
        msg.reply(null)
      }
    }
    vertx.launch {
      var count = 0
      for (msg in channel) {
        val reply = awaitResult<Message<Int?>> {
          bus.send("another-address", msg, it);
        }
        val v = reply.body()
        if (v == null) {
          break
        } else {
          count += v
        }
      }
      async.complete()
    }
    for (index in listOf(0, 1, 2, 3, 4, 5)) {
      bus.send("the-address", index)
    }
  }

  @Test
  fun testReplyFailure(testContext: TestContext) {
    val bus = vertx.eventBus()
    val async = testContext.async()
    bus.consumer<Int>("the-address") { msg ->
      msg.fail(5, "it-failed")
    }
    vertx.launch {
      try {
        val reply = awaitResult<Message<Int?>> {
          bus.send("the-address", "the-body", it);
        }
      } catch(e: Exception) {
        testContext.assertTrue(e is ReplyException)
        val err : ReplyException = e as ReplyException
        testContext.assertEquals(5, err.failureCode())
        testContext.assertEquals(ReplyFailure.RECIPIENT_FAILURE, err.failureType())
        testContext.assertEquals("it-failed", err.message)
        async.complete()
      }
    }
  }
}