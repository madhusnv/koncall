package com.onesignal.user.internal.operations.impl.states;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class NewRecordsState {
    private final ConfigModelStore _configModelStore;
    private final ITime _time;
    private final Map<String, Long> records;

    public NewRecordsState(ITime iTime, ConfigModelStore configModelStore) {
        sq8.m48649h(iTime, "_time");
        sq8.m48649h(configModelStore, "_configModelStore");
        this._time = iTime;
        this._configModelStore = configModelStore;
        this.records = new LinkedHashMap();
    }

    public final void add(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.records.put(str, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Long l = this.records.get(str);
        if (l != null) {
            return this._time.getCurrentTimeMillis() - l.longValue() >= this._configModelStore.getModel().getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        Long l = this.records.get(str);
        if (l != null) {
            return this._time.getCurrentTimeMillis() - l.longValue() <= this._configModelStore.getModel().getOpRepoPostCreateRetryUpTo();
        }
        return false;
    }
}
