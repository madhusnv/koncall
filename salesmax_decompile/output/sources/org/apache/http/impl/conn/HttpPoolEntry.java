package org.apache.http.impl.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.pool.PoolEntry;
import p001o.sia;

@Deprecated
/* loaded from: classes6.dex */
class HttpPoolEntry extends PoolEntry<HttpRoute, OperatedClientConnection> {
    private final sia log;
    private final RouteTracker tracker;

    public HttpPoolEntry(sia siaVar, String str, HttpRoute httpRoute, OperatedClientConnection operatedClientConnection, long j, TimeUnit timeUnit) {
        super(str, httpRoute, operatedClientConnection, j, timeUnit);
        this.tracker = new RouteTracker(httpRoute);
    }

    @Override // org.apache.http.pool.PoolEntry
    public void close() {
        try {
            getConnection().close();
        } catch (IOException unused) {
            throw null;
        }
    }

    public HttpRoute getEffectiveRoute() {
        return this.tracker.toRoute();
    }

    public HttpRoute getPlannedRoute() {
        return getRoute();
    }

    public RouteTracker getTracker() {
        return this.tracker;
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
}
