/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.pgclient

import io.vertx.pgclient.PgConnectOptions
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions
import io.vertx.pgclient.SslMode
import java.util.concurrent.TimeUnit

/**
 * A function providing a DSL for building [io.vertx.pgclient.PgConnectOptions] objects.
 *
 *
 * @param cachePreparedStatements  Set whether prepared statements cache should be enabled.
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param database  Specify the default database for the connection.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param host  Specify the host for connecting to the server.
 * @param hostnameVerificationAlgorithm  Set the hostname verification algorithm interval To disable hostname verification, set hostnameVerificationAlgorithm to an empty String
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.pgclient.PgConnectOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param openSslEngineOptions 
 * @param password  Specify the user password to be used for the authentication.
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param pipeliningLimit 
 * @param port  Specify the port for connecting to the server.
 * @param preparedStatementCacheMaxSize  Set the maximum number of prepared statements that the connection will cache.
 * @param preparedStatementCacheSqlLimit  Set the maximum length of prepared statement SQL string that the connection will cache.
 * @param properties  Set properties for this client, which will be sent to server at the connection start.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param sslMode  Set [io.vertx.pgclient.SslMode] for the client, this option can be used to provide different levels of secure protection.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param user  Specify the user account to be used for the authentication.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.pgclient.PgConnectOptions original] using Vert.x codegen.
 */
fun pgConnectOptionsOf(
  cachePreparedStatements: Boolean? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  database: String? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  host: String? = null,
  hostnameVerificationAlgorithm: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  metricsName: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  password: String? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  pipeliningLimit: Int? = null,
  port: Int? = null,
  preparedStatementCacheMaxSize: Int? = null,
  preparedStatementCacheSqlLimit: Int? = null,
  properties: Map<String, String>? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  receiveBufferSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  sslMode: SslMode? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  user: String? = null): PgConnectOptions = io.vertx.pgclient.PgConnectOptions().apply {

  if (cachePreparedStatements != null) {
    this.setCachePreparedStatements(cachePreparedStatements)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (database != null) {
    this.setDatabase(database)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (host != null) {
    this.setHost(host)
  }
  if (hostnameVerificationAlgorithm != null) {
    this.setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (pipeliningLimit != null) {
    this.setPipeliningLimit(pipeliningLimit)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (preparedStatementCacheMaxSize != null) {
    this.setPreparedStatementCacheMaxSize(preparedStatementCacheMaxSize)
  }
  if (preparedStatementCacheSqlLimit != null) {
    this.setPreparedStatementCacheSqlLimit(preparedStatementCacheSqlLimit)
  }
  if (properties != null) {
    this.setProperties(properties)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (sslMode != null) {
    this.setSslMode(sslMode)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (user != null) {
    this.setUser(user)
  }
}

/**
 * A function providing a DSL for building [io.vertx.pgclient.PgConnectOptions] objects.
 *
 *
 * @param cachePreparedStatements  Set whether prepared statements cache should be enabled.
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param database  Specify the default database for the connection.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param host  Specify the host for connecting to the server.
 * @param hostnameVerificationAlgorithm  Set the hostname verification algorithm interval To disable hostname verification, set hostnameVerificationAlgorithm to an empty String
 * @param idleTimeout  Set the idle timeout, default time unit is seconds. Zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout. If you want change default time unit, use [io.vertx.pgclient.PgConnectOptions]
 * @param idleTimeoutUnit  Set the idle timeout unit. If not specified, default is seconds.
 * @param jdkSslEngineOptions 
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param openSslEngineOptions 
 * @param password  Specify the user password to be used for the authentication.
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param pipeliningLimit 
 * @param port  Specify the port for connecting to the server.
 * @param preparedStatementCacheMaxSize  Set the maximum number of prepared statements that the connection will cache.
 * @param preparedStatementCacheSqlLimit  Set the maximum length of prepared statement SQL string that the connection will cache.
 * @param properties  Set properties for this client, which will be sent to server at the connection start.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reconnectAttempts  Set the value of reconnect attempts
 * @param reconnectInterval  Set the reconnect interval
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param sendBufferSize  Set the TCP send buffer size
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param sslHandshakeTimeout  Set the SSL handshake timeout, default time unit is seconds.
 * @param sslHandshakeTimeoutUnit  Set the SSL handshake timeout unit. If not specified, default is seconds.
 * @param sslMode  Set [io.vertx.pgclient.SslMode] for the client, this option can be used to provide different levels of secure protection.
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param useAlpn  Set the ALPN usage.
 * @param user  Specify the user account to be used for the authentication.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.pgclient.PgConnectOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("pgConnectOptionsOf(cachePreparedStatements, connectTimeout, crlPaths, crlValues, database, enabledCipherSuites, enabledSecureTransportProtocols, host, hostnameVerificationAlgorithm, idleTimeout, idleTimeoutUnit, jdkSslEngineOptions, keyStoreOptions, localAddress, logActivity, metricsName, openSslEngineOptions, password, pemKeyCertOptions, pemTrustOptions, pfxKeyCertOptions, pfxTrustOptions, pipeliningLimit, port, preparedStatementCacheMaxSize, preparedStatementCacheSqlLimit, properties, proxyOptions, receiveBufferSize, reconnectAttempts, reconnectInterval, reuseAddress, reusePort, sendBufferSize, soLinger, ssl, sslHandshakeTimeout, sslHandshakeTimeoutUnit, sslMode, tcpCork, tcpFastOpen, tcpKeepAlive, tcpNoDelay, tcpQuickAck, trafficClass, trustAll, trustStoreOptions, useAlpn, user)")
)
fun PgConnectOptions(
  cachePreparedStatements: Boolean? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  database: String? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  host: String? = null,
  hostnameVerificationAlgorithm: String? = null,
  idleTimeout: Int? = null,
  idleTimeoutUnit: TimeUnit? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  metricsName: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  password: String? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  pipeliningLimit: Int? = null,
  port: Int? = null,
  preparedStatementCacheMaxSize: Int? = null,
  preparedStatementCacheSqlLimit: Int? = null,
  properties: Map<String, String>? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  receiveBufferSize: Int? = null,
  reconnectAttempts: Int? = null,
  reconnectInterval: Long? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  sendBufferSize: Int? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  sslHandshakeTimeout: Long? = null,
  sslHandshakeTimeoutUnit: TimeUnit? = null,
  sslMode: SslMode? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  useAlpn: Boolean? = null,
  user: String? = null): PgConnectOptions = io.vertx.pgclient.PgConnectOptions().apply {

  if (cachePreparedStatements != null) {
    this.setCachePreparedStatements(cachePreparedStatements)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (database != null) {
    this.setDatabase(database)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (host != null) {
    this.setHost(host)
  }
  if (hostnameVerificationAlgorithm != null) {
    this.setHostnameVerificationAlgorithm(hostnameVerificationAlgorithm)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (idleTimeoutUnit != null) {
    this.setIdleTimeoutUnit(idleTimeoutUnit)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (pipeliningLimit != null) {
    this.setPipeliningLimit(pipeliningLimit)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (preparedStatementCacheMaxSize != null) {
    this.setPreparedStatementCacheMaxSize(preparedStatementCacheMaxSize)
  }
  if (preparedStatementCacheSqlLimit != null) {
    this.setPreparedStatementCacheSqlLimit(preparedStatementCacheSqlLimit)
  }
  if (properties != null) {
    this.setProperties(properties)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reconnectAttempts != null) {
    this.setReconnectAttempts(reconnectAttempts)
  }
  if (reconnectInterval != null) {
    this.setReconnectInterval(reconnectInterval)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (sslHandshakeTimeout != null) {
    this.setSslHandshakeTimeout(sslHandshakeTimeout)
  }
  if (sslHandshakeTimeoutUnit != null) {
    this.setSslHandshakeTimeoutUnit(sslHandshakeTimeoutUnit)
  }
  if (sslMode != null) {
    this.setSslMode(sslMode)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (user != null) {
    this.setUser(user)
  }
}

