package org.apache.http.impl.conn;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpConnection;
import p001o.eja;
import p001o.sia;

@Deprecated
/* loaded from: classes6.dex */
public class IdleConnectionHandler {
    private final Map<HttpConnection, TimeValues> connectionToTimes;
    private final sia log;

    public static class TimeValues {
        private final long timeAdded;
        private final long timeExpires;

        public TimeValues(long j, long j2, TimeUnit timeUnit) {
            this.timeAdded = j;
            if (j2 > 0) {
                this.timeExpires = j + timeUnit.toMillis(j2);
            } else {
                this.timeExpires = Long.MAX_VALUE;
            }
        }
    }

    public IdleConnectionHandler() {
        eja.m25143k(getClass());
        this.connectionToTimes = new HashMap();
    }

    public void add(HttpConnection httpConnection, long j, TimeUnit timeUnit) {
        System.currentTimeMillis();
        throw null;
    }

    public void closeExpiredConnections() {
        System.currentTimeMillis();
        throw null;
    }

    public void closeIdleConnections(long j) {
        System.currentTimeMillis();
        throw null;
    }

    public boolean remove(HttpConnection httpConnection) {
        TimeValues timeValuesRemove = this.connectionToTimes.remove(httpConnection);
        timeValuesRemove.getClass();
        return System.currentTimeMillis() <= timeValuesRemove.timeExpires;
    }

    public void removeAll() {
        this.connectionToTimes.clear();
    }
}
