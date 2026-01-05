package org.apache.http.impl.conn;

import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
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
import org.apache.http.conn.ConnectionPoolTimeoutException;
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
import org.apache.http.pool.ConnFactory;
import org.apache.http.pool.ConnPoolControl;
import org.apache.http.pool.PoolEntry;
import org.apache.http.pool.PoolEntryCallback;
import org.apache.http.pool.PoolStats;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes6.dex */
public class PoolingHttpClientConnectionManager implements HttpClientConnectionManager, ConnPoolControl<HttpRoute>, Closeable {
    private final ConfigData configData;
    private final HttpClientConnectionOperator connectionOperator;
    private final AtomicBoolean isShutDown;
    private final sia log;
    private final CPool pool;

    /* renamed from: org.apache.http.impl.conn.PoolingHttpClientConnectionManager$1 */
    public class C187611 implements ConnectionRequest {
        final /* synthetic */ Future val$future;
        final /* synthetic */ HttpRoute val$route;

        public C187611(Future future, HttpRoute httpRoute) {
            this.val$future = future;
            this.val$route = httpRoute;
        }

        @Override // org.apache.http.concurrent.Cancellable
        public boolean cancel() {
            return this.val$future.cancel(true);
        }

        @Override // org.apache.http.conn.ConnectionRequest
        public HttpClientConnection get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, ConnectionPoolTimeoutException, TimeoutException {
            HttpClientConnection httpClientConnectionLeaseConnection = PoolingHttpClientConnectionManager.this.leaseConnection(this.val$future, j, timeUnit);
            if (httpClientConnectionLeaseConnection.isOpen()) {
                httpClientConnectionLeaseConnection.setSocketTimeout(PoolingHttpClientConnectionManager.this.resolveSocketConfig(this.val$route.getProxyHost() != null ? this.val$route.getProxyHost() : this.val$route.getTargetHost()).getSoTimeout());
            }
            return httpClientConnectionLeaseConnection;
        }
    }

    /* renamed from: org.apache.http.impl.conn.PoolingHttpClientConnectionManager$2 */
    public class C187622 implements PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> {
        public C187622() {
        }

        @Override // org.apache.http.pool.PoolEntryCallback
        public void process(PoolEntry<HttpRoute, ManagedHttpClientConnection> poolEntry) {
            ManagedHttpClientConnection connection = poolEntry.getConnection();
            if (connection != null) {
                try {
                    connection.shutdown();
                } catch (IOException unused) {
                    PoolingHttpClientConnectionManager.access$100(PoolingHttpClientConnectionManager.this);
                    throw null;
                }
            }
        }
    }

    public static class ConfigData {
        private volatile ConnectionConfig defaultConnectionConfig;
        private volatile SocketConfig defaultSocketConfig;
        private final Map<HttpHost, SocketConfig> socketConfigMap = new ConcurrentHashMap();
        private final Map<HttpHost, ConnectionConfig> connectionConfigMap = new ConcurrentHashMap();

        public ConnectionConfig getConnectionConfig(HttpHost httpHost) {
            return this.connectionConfigMap.get(httpHost);
        }

        public ConnectionConfig getDefaultConnectionConfig() {
            return this.defaultConnectionConfig;
        }

        public SocketConfig getDefaultSocketConfig() {
            return this.defaultSocketConfig;
        }

        public SocketConfig getSocketConfig(HttpHost httpHost) {
            return this.socketConfigMap.get(httpHost);
        }

        public void setConnectionConfig(HttpHost httpHost, ConnectionConfig connectionConfig) {
            this.connectionConfigMap.put(httpHost, connectionConfig);
        }

        public void setDefaultConnectionConfig(ConnectionConfig connectionConfig) {
            this.defaultConnectionConfig = connectionConfig;
        }

        public void setDefaultSocketConfig(SocketConfig socketConfig) {
            this.defaultSocketConfig = socketConfig;
        }

        public void setSocketConfig(HttpHost httpHost, SocketConfig socketConfig) {
            this.socketConfigMap.put(httpHost, socketConfig);
        }
    }

    public static class InternalConnectionFactory implements ConnFactory<HttpRoute, ManagedHttpClientConnection> {
        private final ConfigData configData;
        private final HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> connFactory;

        public InternalConnectionFactory(ConfigData configData, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
            this.configData = configData == null ? new ConfigData() : configData;
            this.connFactory = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        }

        @Override // org.apache.http.pool.ConnFactory
        public ManagedHttpClientConnection create(HttpRoute httpRoute) {
            ConnectionConfig connectionConfig = httpRoute.getProxyHost() != null ? this.configData.getConnectionConfig(httpRoute.getProxyHost()) : null;
            if (connectionConfig == null) {
                connectionConfig = this.configData.getConnectionConfig(httpRoute.getTargetHost());
            }
            if (connectionConfig == null) {
                connectionConfig = this.configData.getDefaultConnectionConfig();
            }
            if (connectionConfig == null) {
                connectionConfig = ConnectionConfig.DEFAULT;
            }
            return (ManagedHttpClientConnection) this.connFactory.create(httpRoute, connectionConfig);
        }
    }

    public PoolingHttpClientConnectionManager() {
        this(getDefaultRegistry());
    }

    public static /* synthetic */ sia access$100(PoolingHttpClientConnectionManager poolingHttpClientConnectionManager) {
        poolingHttpClientConnectionManager.getClass();
        return null;
    }

    private String format(HttpRoute httpRoute, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("[route: ");
        sb.append(httpRoute);
        sb.append("]");
        if (obj != null) {
            sb.append("[state: ");
            sb.append(obj);
            sb.append("]");
        }
        return sb.toString();
    }

    private String formatStats(HttpRoute httpRoute) {
        StringBuilder sb = new StringBuilder();
        PoolStats totalStats = this.pool.getTotalStats();
        PoolStats stats = this.pool.getStats(httpRoute);
        sb.append("[total available: ");
        sb.append(totalStats.getAvailable());
        sb.append("; ");
        sb.append("route allocated: ");
        sb.append(stats.getLeased() + stats.getAvailable());
        sb.append(" of ");
        sb.append(stats.getMax());
        sb.append("; ");
        sb.append("total allocated: ");
        sb.append(totalStats.getLeased() + totalStats.getAvailable());
        sb.append(" of ");
        sb.append(totalStats.getMax());
        sb.append("]");
        return sb.toString();
    }

    private static Registry<ConnectionSocketFactory> getDefaultRegistry() {
        return RegistryBuilder.create().register(HttpHost.DEFAULT_SCHEME_NAME, PlainConnectionSocketFactory.getSocketFactory()).register("https", SSLConnectionSocketFactory.getSocketFactory()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SocketConfig resolveSocketConfig(HttpHost httpHost) {
        SocketConfig socketConfig = this.configData.getSocketConfig(httpHost);
        if (socketConfig == null) {
            socketConfig = this.configData.getDefaultSocketConfig();
        }
        return socketConfig == null ? SocketConfig.DEFAULT : socketConfig;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown();
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void closeExpiredConnections() {
        throw null;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        throw null;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void connect(HttpClientConnection httpClientConnection, HttpRoute httpRoute, int i, HttpContext httpContext) {
        ManagedHttpClientConnection connection;
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            connection = CPoolProxy.getPoolEntry(httpClientConnection).getConnection();
        }
        HttpHost proxyHost = httpRoute.getProxyHost() != null ? httpRoute.getProxyHost() : httpRoute.getTargetHost();
        this.connectionOperator.connect(connection, proxyHost, httpRoute.getLocalSocketAddress(), i, resolveSocketConfig(proxyHost), httpContext);
    }

    public void enumAvailable(PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> poolEntryCallback) {
        this.pool.enumAvailable(poolEntryCallback);
    }

    public void enumLeased(PoolEntryCallback<HttpRoute, ManagedHttpClientConnection> poolEntryCallback) {
        this.pool.enumLeased(poolEntryCallback);
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public ConnectionConfig getConnectionConfig(HttpHost httpHost) {
        return this.configData.getConnectionConfig(httpHost);
    }

    public ConnectionConfig getDefaultConnectionConfig() {
        return this.configData.getDefaultConnectionConfig();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getDefaultMaxPerRoute() {
        return this.pool.getDefaultMaxPerRoute();
    }

    public SocketConfig getDefaultSocketConfig() {
        return this.configData.getDefaultSocketConfig();
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxTotal() {
        return this.pool.getMaxTotal();
    }

    public Set<HttpRoute> getRoutes() {
        return this.pool.getRoutes();
    }

    public SocketConfig getSocketConfig(HttpHost httpHost) {
        return this.configData.getSocketConfig(httpHost);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getTotalStats() {
        return this.pool.getTotalStats();
    }

    public int getValidateAfterInactivity() {
        return this.pool.getValidateAfterInactivity();
    }

    public HttpClientConnection leaseConnection(Future<CPoolEntry> future, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, ConnectionPoolTimeoutException, TimeoutException {
        try {
            CPoolEntry cPoolEntry = future.get(j, timeUnit);
            if (cPoolEntry == null || future.isCancelled()) {
                throw new ExecutionException(new CancellationException("Operation cancelled"));
            }
            Asserts.check(cPoolEntry.getConnection() != null, "Pool entry with no connection");
            throw null;
        } catch (TimeoutException unused) {
            throw new ConnectionPoolTimeoutException("Timeout waiting for connection from pool");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[DONT_GENERATE] */
    @Override // org.apache.http.conn.HttpClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void releaseConnection(HttpClientConnection httpClientConnection, Object obj, long j, TimeUnit timeUnit) {
        CPool cPool;
        Args.notNull(httpClientConnection, "Managed connection");
        synchronized (httpClientConnection) {
            CPoolEntry cPoolEntryDetach = CPoolProxy.detach(httpClientConnection);
            if (cPoolEntryDetach != null) {
                ManagedHttpClientConnection connection = cPoolEntryDetach.getConnection();
                boolean z = true;
                try {
                    if (!connection.isOpen()) {
                        cPool = this.pool;
                        boolean zIsOpen = connection.isOpen();
                        throw null;
                    }
                    if (timeUnit == null) {
                        timeUnit = TimeUnit.MILLISECONDS;
                    }
                    cPoolEntryDetach.setState(obj);
                    cPoolEntryDetach.updateExpiry(j, timeUnit);
                    throw null;
                } finally {
                    cPool = this.pool;
                    if (!connection.isOpen() || !cPoolEntryDetach.isRouteComplete()) {
                        z = false;
                    }
                    cPool.release((CPool) cPoolEntryDetach, z);
                }
            }
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public ConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "HTTP route");
        throw null;
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void routeComplete(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            CPoolProxy.getPoolEntry(httpClientConnection).markRouteComplete();
        }
    }

    public void setConnectionConfig(HttpHost httpHost, ConnectionConfig connectionConfig) {
        this.configData.setConnectionConfig(httpHost, connectionConfig);
    }

    public void setDefaultConnectionConfig(ConnectionConfig connectionConfig) {
        this.configData.setDefaultConnectionConfig(connectionConfig);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setDefaultMaxPerRoute(int i) {
        this.pool.setDefaultMaxPerRoute(i);
    }

    public void setDefaultSocketConfig(SocketConfig socketConfig) {
        this.configData.setDefaultSocketConfig(socketConfig);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxTotal(int i) {
        this.pool.setMaxTotal(i);
    }

    public void setSocketConfig(HttpHost httpHost, SocketConfig socketConfig) {
        this.configData.setSocketConfig(httpHost, socketConfig);
    }

    public void setValidateAfterInactivity(int i) {
        this.pool.setValidateAfterInactivity(i);
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void shutdown() {
        if (this.isShutDown.compareAndSet(false, true)) {
            throw null;
        }
    }

    @Override // org.apache.http.conn.HttpClientConnectionManager
    public void upgrade(HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpContext httpContext) {
        ManagedHttpClientConnection connection;
        Args.notNull(httpClientConnection, "Managed Connection");
        Args.notNull(httpRoute, "HTTP route");
        synchronized (httpClientConnection) {
            connection = CPoolProxy.getPoolEntry(httpClientConnection).getConnection();
        }
        this.connectionOperator.upgrade(connection, httpRoute.getTargetHost(), httpContext);
    }

    public PoolingHttpClientConnectionManager(long j, TimeUnit timeUnit) {
        this(getDefaultRegistry(), null, null, null, j, timeUnit);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public int getMaxPerRoute(HttpRoute httpRoute) {
        return this.pool.getMaxPerRoute(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public PoolStats getStats(HttpRoute httpRoute) {
        return this.pool.getStats(httpRoute);
    }

    @Override // org.apache.http.pool.ConnPoolControl
    public void setMaxPerRoute(HttpRoute httpRoute, int i) {
        this.pool.setMaxPerRoute(httpRoute, i);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry) {
        this(registry, null, null);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, DnsResolver dnsResolver) {
        this(registry, null, dnsResolver);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(registry, httpConnectionFactory, null);
    }

    private String format(CPoolEntry cPoolEntry) {
        StringBuilder sb = new StringBuilder();
        sb.append("[id: ");
        sb.append(cPoolEntry.getId());
        sb.append("]");
        sb.append("[route: ");
        sb.append(cPoolEntry.getRoute());
        sb.append("]");
        Object state = cPoolEntry.getState();
        if (state != null) {
            sb.append("[state: ");
            sb.append(state);
            sb.append("]");
        }
        return sb.toString();
    }

    public PoolingHttpClientConnectionManager(HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory) {
        this(getDefaultRegistry(), httpConnectionFactory, null);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, DnsResolver dnsResolver) {
        this(registry, httpConnectionFactory, null, dnsResolver, -1L, TimeUnit.MILLISECONDS);
    }

    public PoolingHttpClientConnectionManager(Registry<ConnectionSocketFactory> registry, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, SchemePortResolver schemePortResolver, DnsResolver dnsResolver, long j, TimeUnit timeUnit) {
        this(new DefaultHttpClientConnectionOperator(registry, schemePortResolver, dnsResolver), httpConnectionFactory, j, timeUnit);
    }

    public PoolingHttpClientConnectionManager(HttpClientConnectionOperator httpClientConnectionOperator, HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, long j, TimeUnit timeUnit) {
        eja.m25143k(getClass());
        ConfigData configData = new ConfigData();
        this.configData = configData;
        CPool cPool = new CPool(new InternalConnectionFactory(configData, httpConnectionFactory), 2, 20, j, timeUnit);
        this.pool = cPool;
        cPool.setValidateAfterInactivity(2000);
        this.connectionOperator = (HttpClientConnectionOperator) Args.notNull(httpClientConnectionOperator, "HttpClientConnectionOperator");
        this.isShutDown = new AtomicBoolean(false);
    }

    public PoolingHttpClientConnectionManager(CPool cPool, Lookup<ConnectionSocketFactory> lookup, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        eja.m25143k(getClass());
        this.configData = new ConfigData();
        this.pool = cPool;
        this.connectionOperator = new DefaultHttpClientConnectionOperator(lookup, schemePortResolver, dnsResolver);
        this.isShutDown = new AtomicBoolean(false);
    }
}
