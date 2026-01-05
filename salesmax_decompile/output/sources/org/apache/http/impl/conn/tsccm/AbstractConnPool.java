package org.apache.http.impl.conn.tsccm;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.IdleConnectionHandler;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Deprecated
/* loaded from: classes6.dex */
public abstract class AbstractConnPool {
    protected IdleConnectionHandler idleConnHandler;
    protected volatile boolean isShutDown;
    protected Set<BasicPoolEntryRef> issuedConnections;
    protected Set<BasicPoolEntry> leasedConnections;
    private final sia log;
    protected int numConnections;
    protected final Lock poolLock;
    protected ReferenceQueue<Object> refQueue;

    public AbstractConnPool() {
        eja.m25143k(getClass());
        this.leasedConnections = new HashSet();
        this.idleConnHandler = new IdleConnectionHandler();
        this.poolLock = new ReentrantLock();
    }

    public void closeConnection(OperatedClientConnection operatedClientConnection) {
        if (operatedClientConnection != null) {
            try {
                operatedClientConnection.close();
            } catch (IOException unused) {
                throw null;
            }
        }
    }

    public void closeExpiredConnections() {
        this.poolLock.lock();
        try {
            this.idleConnHandler.closeExpiredConnections();
        } finally {
            this.poolLock.unlock();
        }
    }

    public void closeIdleConnections(long j, TimeUnit timeUnit) {
        Args.notNull(timeUnit, "Time unit");
        this.poolLock.lock();
        try {
            this.idleConnHandler.closeIdleConnections(timeUnit.toMillis(j));
        } finally {
            this.poolLock.unlock();
        }
    }

    public abstract void deleteClosedConnections();

    public void enableConnectionGC() {
    }

    public abstract void freeEntry(BasicPoolEntry basicPoolEntry, boolean z, long j, TimeUnit timeUnit);

    public final BasicPoolEntry getEntry(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit) {
        return requestPoolEntry(httpRoute, obj).getPoolEntry(j, timeUnit);
    }

    public abstract void handleLostEntry(HttpRoute httpRoute);

    public void handleReference(Reference<?> reference) {
    }

    public abstract PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj);

    public void shutdown() {
        this.poolLock.lock();
        try {
            if (this.isShutDown) {
                return;
            }
            Iterator<BasicPoolEntry> it = this.leasedConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry next = it.next();
                it.remove();
                closeConnection(next.getConnection());
            }
            this.idleConnHandler.removeAll();
            this.isShutDown = true;
        } finally {
            this.poolLock.unlock();
        }
    }
}
