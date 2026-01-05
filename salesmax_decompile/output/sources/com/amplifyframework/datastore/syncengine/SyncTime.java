package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.util.Time;
import p001o.s6c;

/* loaded from: classes5.dex */
final class SyncTime {
    private final Long time;

    private SyncTime(Long l) {
        this.time = l;
    }

    public static SyncTime at(long j) {
        return new SyncTime(Long.valueOf(j));
    }

    public static SyncTime from(Long l) {
        return new SyncTime(l);
    }

    public static SyncTime never() {
        return new SyncTime(null);
    }

    public static SyncTime now() {
        return new SyncTime(Long.valueOf(Time.now()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SyncTime.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(this.time, ((SyncTime) obj).time);
    }

    public boolean exists() {
        return this.time != null;
    }

    public int hashCode() {
        Long l = this.time;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public long toLong() {
        Long l = this.time;
        if (l != null) {
            return l.longValue();
        }
        throw new IllegalStateException("No last sync time!");
    }

    public String toString() {
        return "LastSyncTime{time=" + this.time + '}';
    }
}
