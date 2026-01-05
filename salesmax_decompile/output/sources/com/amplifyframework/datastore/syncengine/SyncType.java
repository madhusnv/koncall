package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.util.Time;

/* loaded from: classes5.dex */
public enum SyncType {
    BASE,
    DELTA;

    public static SyncType fromSyncTimeAndThreshold(SyncTime syncTime, long j) {
        return SyncTime.never().equals(syncTime) ? BASE : Time.now() - syncTime.toLong() > j ? BASE : DELTA;
    }
}
