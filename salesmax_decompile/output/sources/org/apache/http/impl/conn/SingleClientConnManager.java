package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.params.HttpParams;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes6.dex */
public class SingleClientConnManager implements ClientConnectionManager {
    public static final String MISUSE_MESSAGE = "Invalid use of SingleClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    protected final boolean alwaysShutDown;
    protected final ClientConnectionOperator connOperator;
    protected volatile long connectionExpiresTime;
    protected volatile boolean isShutDown;
    protected volatile long lastReleaseTime;
    private final sia log;
    protected volatile ConnAdapter managedConn;
    protected final SchemeRegistry schemeRegistry;
    protected volatile PoolEntry uniquePoolEntry;

    public class ConnAdapter extends AbstractPooledConnAdapter {
        public ConnAdapter(PoolEntry poolEntry, HttpRoute httpRoute) {
            super(SingleClientConnManager.this, poolEntry);
            markReusable();
            poolEntry.route = httpRoute;
        }
    }

    public class PoolEntry extends AbstractPoolEntry {
        public PoolEntry() {
            super(SingleClientConnManager.this.connOperator, null);
        }

        public void close() {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.close();
            }
        }

        public void shutdown() {
            shutdownEntry();
            if (this.connection.isOpen()) {
                this.connection.shutdown();
            }
        }
    }

    @Deprecated
    public SingleClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        this(schemeRegistry);
    }

    public final void assertStillUp() {
        Asserts.check(!this.isShutDown, "Manager is shut down");
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        if (System.currentTimeMillis() >= this.connectionExpiresTime) {
            closeIdleConnections(0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        assertStillUp();
        Args.notNull(timeUnit, "Time unit");
        synchronized (this) {
            if (this.managedConn == null && this.uniquePoolEntry.connection.isOpen()) {
                if (this.lastReleaseTime <= System.currentTimeMillis() - timeUnit.toMillis(j)) {
                    try {
                        this.uniquePoolEntry.close();
                    } catch (IOException unused) {
                        throw null;
                    }
                }
            }
        }
    }

    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry) {
        return new DefaultClientConnectionOperator(schemeRegistry);
    }

    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public ManagedClientConnection getConnection(HttpRoute httpRoute, Object obj) {
        Args.notNull(httpRoute, "Route");
        assertStillUp();
        throw null;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        Args.check(managedClientConnection instanceof ConnAdapter, "Connection class mismatch, connection not obtained from this manager");
        assertStillUp();
        throw null;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.SingleClientConnManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return SingleClientConnManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    public void revokeConnection() {
        ConnAdapter connAdapter = this.managedConn;
        if (connAdapter == null) {
            return;
        }
        connAdapter.detach();
        synchronized (this) {
            try {
                try {
                    this.uniquePoolEntry.shutdown();
                } catch (IOException unused) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.http.conn.ClientConnectionManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void shutdown() {
        this.isShutDown = true;
        synchronized (this) {
            try {
                try {
                    if (this.uniquePoolEntry != null) {
                        this.uniquePoolEntry.shutdown();
                    }
                } catch (IOException unused) {
                    throw null;
                }
            } finally {
                this.uniquePoolEntry = null;
                this.managedConn = null;
            }
        }
    }

    public SingleClientConnManager(SchemeRegistry schemeRegistry) {
        eja.m25143k(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
        this.uniquePoolEntry = new PoolEntry();
        this.managedConn = null;
        this.lastReleaseTime = -1L;
        this.alwaysShutDown = false;
        this.isShutDown = false;
    }

    public SingleClientConnManager() {
        this(SchemeRegistryFactory.createDefault());
    }
}
