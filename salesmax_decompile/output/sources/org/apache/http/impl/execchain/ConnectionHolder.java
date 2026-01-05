package org.apache.http.impl.execchain;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpClientConnection;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.concurrent.Cancellable;
import org.apache.http.conn.ConnectionReleaseTrigger;
import org.apache.http.conn.HttpClientConnectionManager;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
class ConnectionHolder implements ConnectionReleaseTrigger, Cancellable, Closeable {
    private final sia log;
    private final HttpClientConnection managedConn;
    private final HttpClientConnectionManager manager;
    private final AtomicBoolean released = new AtomicBoolean(false);
    private volatile boolean reusable;
    private volatile Object state;
    private volatile TimeUnit timeUnit;
    private volatile long validDuration;

    public ConnectionHolder(sia siaVar, HttpClientConnectionManager httpClientConnectionManager, HttpClientConnection httpClientConnection) {
        this.manager = httpClientConnectionManager;
        this.managedConn = httpClientConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void releaseConnection(boolean z) {
        if (this.released.compareAndSet(false, true)) {
            synchronized (this.managedConn) {
                if (!z) {
                    try {
                        try {
                            this.managedConn.close();
                            throw null;
                        } catch (IOException unused) {
                            throw null;
                        }
                    } catch (Throwable th) {
                        this.manager.releaseConnection(this.managedConn, null, 0L, TimeUnit.MILLISECONDS);
                        throw th;
                    }
                }
                this.manager.releaseConnection(this.managedConn, this.state, this.validDuration, this.timeUnit);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void abortConnection() {
        if (this.released.compareAndSet(false, true)) {
            synchronized (this.managedConn) {
                try {
                    try {
                        this.managedConn.shutdown();
                        throw null;
                    } catch (IOException unused) {
                        throw null;
                    }
                } catch (Throwable th) {
                    this.manager.releaseConnection(this.managedConn, null, 0L, TimeUnit.MILLISECONDS);
                    throw th;
                }
            }
        }
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        this.released.get();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        releaseConnection(false);
    }

    public boolean isReleased() {
        return this.released.get();
    }

    public boolean isReusable() {
        return this.reusable;
    }

    public void markNonReusable() {
        this.reusable = false;
    }

    public void markReusable() {
        this.reusable = true;
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public void setValidFor(long j, TimeUnit timeUnit) {
        synchronized (this.managedConn) {
            this.validDuration = j;
            this.timeUnit = timeUnit;
        }
    }

    @Override // org.apache.http.conn.ConnectionReleaseTrigger
    public void releaseConnection() {
        releaseConnection(this.reusable);
    }
}
