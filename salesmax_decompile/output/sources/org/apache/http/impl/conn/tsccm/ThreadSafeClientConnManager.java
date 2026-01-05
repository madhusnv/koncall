package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes6.dex */
public class ThreadSafeClientConnManager implements ClientConnectionManager {
    protected final ClientConnectionOperator connOperator;
    protected final ConnPerRouteBean connPerRoute;
    protected final AbstractConnPool connectionPool;
    private final sia log;
    protected final ConnPoolByRoute pool;
    protected final SchemeRegistry schemeRegistry;

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry) {
        this(schemeRegistry, -1L, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ sia access$000(ThreadSafeClientConnManager threadSafeClientConnManager) {
        threadSafeClientConnManager.getClass();
        return null;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        throw null;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        throw null;
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    @Deprecated
    public AbstractConnPool createConnectionPool(HttpParams httpParams) {
        return new ConnPoolByRoute(this.connOperator, httpParams);
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public int getConnectionsInPool(HttpRoute httpRoute) {
        return this.pool.getConnectionsInPool(httpRoute);
    }

    public int getDefaultMaxPerRoute() {
        return this.connPerRoute.getDefaultMaxPerRoute();
    }

    public int getMaxForRoute(HttpRoute httpRoute) {
        return this.connPerRoute.getMaxForRoute(httpRoute);
    }

    public int getMaxTotal() {
        return this.pool.getMaxTotalConnections();
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.conn.ClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        Args.check(managedClientConnection instanceof BasicPooledConnAdapter, "Connection class mismatch, connection not obtained from this manager");
        BasicPooledConnAdapter basicPooledConnAdapter = (BasicPooledConnAdapter) managedClientConnection;
        if (basicPooledConnAdapter.getPoolEntry() != null) {
            Asserts.check(basicPooledConnAdapter.getManager() == this, "Connection not obtained from this manager");
        }
        synchronized (basicPooledConnAdapter) {
            if (((BasicPoolEntry) basicPooledConnAdapter.getPoolEntry()) != null) {
                try {
                    if (basicPooledConnAdapter.isOpen() && !basicPooledConnAdapter.isMarkedReusable()) {
                        basicPooledConnAdapter.shutdown();
                    }
                    basicPooledConnAdapter.isMarkedReusable();
                    throw null;
                } catch (IOException unused) {
                    throw null;
                }
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public ClientConnectionRequest requestConnection(final HttpRoute httpRoute, Object obj) {
        final PoolEntryRequest poolEntryRequestRequestPoolEntry = this.pool.requestPoolEntry(httpRoute, obj);
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
                poolEntryRequestRequestPoolEntry.abortRequest();
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                Args.notNull(httpRoute, "Route");
                ThreadSafeClientConnManager.access$000(ThreadSafeClientConnManager.this);
                throw null;
            }
        };
    }

    public void setDefaultMaxPerRoute(int i) {
        this.connPerRoute.setDefaultMaxPerRoute(i);
    }

    public void setMaxForRoute(HttpRoute httpRoute, int i) {
        this.connPerRoute.setMaxForRoute(httpRoute, i);
    }

    public void setMaxTotal(int i) {
        this.pool.setMaxTotalConnections(i);
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        throw null;
    }

    public ThreadSafeClientConnManager() {
        this(SchemeRegistryFactory.createDefault());
    }

    public ConnPoolByRoute createConnectionPool(long j, TimeUnit timeUnit) {
        return new ConnPoolByRoute(this.connOperator, this.connPerRoute, 20, j, timeUnit);
    }

    public int getConnectionsInPool() {
        return this.pool.getConnectionsInPool();
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry, long j, TimeUnit timeUnit) {
        this(schemeRegistry, j, timeUnit, new ConnPerRouteBean());
    }

    public ThreadSafeClientConnManager(SchemeRegistry schemeRegistry, long j, TimeUnit timeUnit, ConnPerRouteBean connPerRouteBean) {
        Args.notNull(schemeRegistry, "Scheme registry");
        eja.m25143k(getClass());
        this.schemeRegistry = schemeRegistry;
        this.connPerRoute = connPerRouteBean;
        this.connOperator = createConnectionOperator(schemeRegistry);
        ConnPoolByRoute connPoolByRouteCreateConnectionPool = createConnectionPool(j, timeUnit);
        this.pool = connPoolByRouteCreateConnectionPool;
        this.connectionPool = connPoolByRouteCreateConnectionPool;
    }

    @Deprecated
    public ThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        Args.notNull(schemeRegistry, "Scheme registry");
        eja.m25143k(getClass());
        this.schemeRegistry = schemeRegistry;
        this.connPerRoute = new ConnPerRouteBean();
        this.connOperator = createConnectionOperator(schemeRegistry);
        ConnPoolByRoute connPoolByRoute = (ConnPoolByRoute) createConnectionPool(httpParams);
        this.pool = connPoolByRoute;
        this.connectionPool = connPoolByRoute;
    }
}
