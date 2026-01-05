package org.apache.http.impl.conn;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.pool.AbstractConnPool;
import org.apache.http.pool.ConnFactory;
import p001o.sia;

@Deprecated
/* loaded from: classes6.dex */
class HttpConnPool extends AbstractConnPool<HttpRoute, OperatedClientConnection, HttpPoolEntry> {
    private static final AtomicLong COUNTER = new AtomicLong();
    private final sia log;
    private final long timeToLive;
    private final TimeUnit timeUnit;

    public static class InternalConnFactory implements ConnFactory<HttpRoute, OperatedClientConnection> {
        private final ClientConnectionOperator connOperator;

        public InternalConnFactory(ClientConnectionOperator clientConnectionOperator) {
            this.connOperator = clientConnectionOperator;
        }

        @Override // org.apache.http.pool.ConnFactory
        public OperatedClientConnection create(HttpRoute httpRoute) {
            return this.connOperator.createConnection();
        }
    }

    public HttpConnPool(sia siaVar, ClientConnectionOperator clientConnectionOperator, int i, int i2, long j, TimeUnit timeUnit) {
        super(new InternalConnFactory(clientConnectionOperator), i, i2);
        this.timeToLive = j;
        this.timeUnit = timeUnit;
    }

    @Override // org.apache.http.pool.AbstractConnPool
    public HttpPoolEntry createEntry(HttpRoute httpRoute, OperatedClientConnection operatedClientConnection) {
        return new HttpPoolEntry(null, Long.toString(COUNTER.getAndIncrement()), httpRoute, operatedClientConnection, this.timeToLive, this.timeUnit);
    }
}
