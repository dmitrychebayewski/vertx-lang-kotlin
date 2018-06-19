package io.vertx.kotlin.ext.shell.term

import io.vertx.ext.shell.term.Tty
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun Tty.stdinHandlerAwait() : String? {
    return awaitEvent{
        this.stdinHandler(it)
    }
}

suspend fun Tty.resizehandlerAwait() : Void? {
    return awaitEvent{
        this.resizehandler(it)
    }
}

