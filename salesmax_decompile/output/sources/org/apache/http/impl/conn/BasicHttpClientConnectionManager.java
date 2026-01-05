package org.apache.http.impl.conn;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.config.Lookup;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.config.SocketConfig;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.HttpClientConnectionOperator;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes6.dex */
public class BasicHttpClientConnectionManager implements HttpClientConnectionManager, Closeable {
    private ManagedHttpClientConnection conn;
    private ConnectionConfig connConfig;
    private final HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory;
    private final HttpClientConnectionOperator connectionOperator;
    private long expiry;
    private final AtomicBoolean isShutdown;
    private boolean leased;
    private final sia log;
    private HttpRoute route;
    private SocketConfig socketConfig;
    private Object state;
    private long updated;

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        this(new DefaultHttpClientConnectionOperator(lookup, schemePortResolver, dnsResolver), httpConnectionFactory);
    }

    private void checkExpiry() {
        if (this.conn != null && System.currentTimeMillis() >= this.expiry) {
            throw null;
        }
    }

    private synchronized void closeConnection() {
        if (this.conn != null) {
            throw null;
        }
    }

    private static Registry<ConnectionSocketFactory> getDefaultRegistry() {
        return RegistryBuilder.create().register(HttpHost.DEFAULT_SCHEME_NAME, PlainConnectionSocketFactory.getSocketFactory()).register("https", SSLConnectionSocketFactory.getSocketFactory()).build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.isShutdown.compareAndSet(false, true)) {
            closeConnection();
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void closeExpiredConnections() {
        if (this.isShutdown.get()) {
            return;
        }
        if (!this.leased) {
            checkExpiry();
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        if (this.isShutdown.get()) {
            return;
        }
        if (!this.leased) {
            long millis = timeUnit.toMillis(j);
            if (millis < 0) {
                millis = 0;
            }
            if (this.updated <= System.currentTimeMillis() - millis) {
                closeConnection();
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) {
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
        HttpHost proxyHost = httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost();
        this.connectionOperator.connect(this.conn, proxyHost, httpRoute.getLocalSocketAddress(), i, this.socketConfig, httpContext);
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public synchronized HttpClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        Asserts.check(!this.isShutdown.get(), "Connection manager has been shut down");
        throw null;
    }

    public synchronized ConnectionConfig getConnectionConfig() {
        return this.connConfig;
    }

    public HttpRoute getRoute() {
        return this.route;
    }

    public synchronized SocketConfig getSocketConfig() {
        return this.socketConfig;
    }

    public Object getState() {
        return this.state;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public synchronized void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        Args.notNull(httpClientConnection, "Connection");
        Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
        throw null;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public final ConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        Args.notNull(httpRoute, "Route");
        return new ConnectionRequest() { // from class: org.apache.http.impl.conn.BasicHttpClientConnectionManager.1
            @Override // org.apache.http.concurrent.Cancellable
            public boolean cancel() {
                return false;
            }

            @Override // org.apache.http.conn.ConnectionRequest
            public HttpClientConnection get(long j, TimeUnit timeUnit) {
                return BasicHttpClientConnectionManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
    }

    public synchronized void setConnectionConfig(ConnectionConfig connectionConfig) {
        if (connectionConfig != null) {
            this.connConfig = connectionConfig;
        } else {
            connectionConfig = ConnectionConfig.DEFAULT;
            this.connConfig = connectionConfig;
        }
    }

    public synchronized void setSocketConfig(SocketConfig socketConfig) {
        if (socketConfig != null) {
            this.socketConfig = socketConfig;
        } else {
            socketConfig = SocketConfig.DEFAULT;
            this.socketConfig = socketConfig;
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void shutdown() {
        if (this.isShutdown.compareAndSet(false, true) && this.conn != null) {
            throw null;
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        Args.notNull(httpClientConnection, "Connection");
        Args.notNull(httpRoute, "HTTP route");
        Asserts.check(httpClientConnection == this.conn, "Connection not obtained from this manager");
        this.connectionOperator.upgrade(this.conn, httpRoute.getTargetHost(), httpContext);
    }

    public BasicHttpClientConnectionManager(HttpClientConnectionOperator httpClientConnectionOperator, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        eja.m25143k(getClass());
        this.connectionOperator = (HttpClientConnectionOperator) Args.notNull(httpClientConnectionOperator, "Connection operator");
        this.connFactory = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        this.expiry = Long.MAX_VALUE;
        this.socketConfig = SocketConfig.DEFAULT;
        this.connConfig = ConnectionConfig.DEFAULT;
        this.isShutdown = new AtomicBoolean(false);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(lookup, httpConnectionFactory, null, null);
    }

    public BasicHttpClientConnectionManager(Lookup<ConnectionSocketFactory> lookup) {
        this(lookup, null, null, null);
    }

    public BasicHttpClientConnectionManager() {
        this(getDefaultRegistry(), null, null, null);
    }
}
