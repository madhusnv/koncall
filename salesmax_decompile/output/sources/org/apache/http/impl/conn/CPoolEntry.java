package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.PoolEntry;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
class CPoolEntry extends PoolEntry<HttpRoute, ManagedHttpClientConnection> {
    private final sia log;
    private volatile boolean routeComplete;

    public CPoolEntry(sia siaVar, String str, HttpRoute httpRoute, ManagedHttpClientConnection managedHttpClientConnection, long j, TimeUnit timeUnit) {
        super(str, httpRoute, managedHttpClientConnection, j, timeUnit);
    }

    @Override // org.apache.http.pool.PoolEntry
    public void close() {
        try {
            closeConnection();
        } catch (IOException unused) {
            throw null;
        }
    }

    public void closeConnection() {
        getConnection().close();
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isClosed() {
        return !getConnection().isOpen();
    }

    @Override // org.apache.http.pool.PoolEntry
    public boolean isExpired(long j) {
        boolean zIsExpired = super.isExpired(j);
        if (zIsExpired) {
            throw null;
        }
        return zIsExpired;
    }

    public boolean isRouteComplete() {
        return this.routeComplete;
    }

    public void markRouteComplete() {
        this.routeComplete = true;
    }

    public void shutdownConnection() {
        getConnection().shutdown();
    }
}
