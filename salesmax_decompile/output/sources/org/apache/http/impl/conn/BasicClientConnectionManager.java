package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.HttpClientConnection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE)
@Deprecated
/* loaded from: classes6.dex */
public class BasicClientConnectionManager implements ClientConnectionManager {
    private static final AtomicLong COUNTER = new AtomicLong();
    public static final String MISUSE_MESSAGE = "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.";
    private ManagedClientConnectionImpl conn;
    private final ClientConnectionOperator connOperator;
    private final sia log;
    private HttpPoolEntry poolEntry;
    private final SchemeRegistry schemeRegistry;
    private volatile boolean shutdown;

    public BasicClientConnectionManager(SchemeRegistry schemeRegistry) {
        eja.m25143k(getClass());
        Args.notNull(schemeRegistry, "Scheme registry");
        this.schemeRegistry = schemeRegistry;
        this.connOperator = createConnectionOperator(schemeRegistry);
    }

    private void assertNotShutdown() {
        Asserts.check(!this.shutdown, "Connection manager has been shut down");
    }

    private void shutdownConnection(HttpClientConnection httpClientConnection) {
        try {
            httpClientConnection.shutdown();
        } catch (IOException unused) {
            throw null;
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeExpiredConnections() {
        synchronized (this) {
            assertNotShutdown();
            long jCurrentTimeMillis = System.currentTimeMillis();
            HttpPoolEntry httpPoolEntry = this.poolEntry;
            if (httpPoolEntry != null && httpPoolEntry.isExpired(jCurrentTimeMillis)) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
            }
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        synchronized (this) {
            assertNotShutdown();
            long millis = timeUnit.toMillis(j);
            if (millis < 0) {
                millis = 0;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - millis;
            HttpPoolEntry httpPoolEntry = this.poolEntry;
            if (httpPoolEntry != null && httpPoolEntry.getUpdated() <= jCurrentTimeMillis) {
                this.poolEntry.close();
                this.poolEntry.getTracker().reset();
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
        synchronized (this) {
            assertNotShutdown();
            throw null;
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public SchemeRegistry getSchemeRegistry() {
        return this.schemeRegistry;
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        Args.check(managedClientConnection instanceof ManagedClientConnectionImpl, "Connection class mismatch, connection not obtained from this manager");
        synchronized (((ManagedClientConnectionImpl) managedClientConnection)) {
            throw null;
        }
    }

    @Override // org.apache.http.conn.ClientConnectionManager
    public final ClientConnectionRequest requestConnection(final HttpRoute httpRoute, final Object obj) {
        return new ClientConnectionRequest() { // from class: org.apache.http.impl.conn.BasicClientConnectionManager.1
            @Override // org.apache.http.conn.ClientConnectionRequest
            public void abortRequest() {
            }

            @Override // org.apache.http.conn.ClientConnectionRequest
            public ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
                return BasicClientConnectionManager.this.getConnection(httpRoute, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.http.conn.ClientConnectionManager
    public void shutdown() {
        synchronized (this) {
            this.shutdown = true;
            try {
                HttpPoolEntry httpPoolEntry = this.poolEntry;
                if (httpPoolEntry != null) {
                    httpPoolEntry.close();
                }
            } finally {
                this.poolEntry = null;
                this.conn = null;
            }
        }
    }

    public BasicClientConnectionManager() {
        this(SchemeRegistryFactory.createDefault());
    }
}
