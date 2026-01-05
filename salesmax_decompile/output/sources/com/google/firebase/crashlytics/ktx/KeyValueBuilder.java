package com.google.firebase.crashlytics.ktx;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import p001o.sq8;

/* loaded from: classes4.dex */
public final class KeyValueBuilder {
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(FirebaseCrashlytics firebaseCrashlytics) {
        sq8.m48649h(firebaseCrashlytics, "crashlytics");
        this.crashlytics = firebaseCrashlytics;
    }

    public final void key(String str, boolean z) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.crashlytics.setCustomKey(str, z);
    }

    public final void key(String str, double d) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.crashlytics.setCustomKey(str, d);
    }

    public final void key(String str, float f) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.crashlytics.setCustomKey(str, f);
    }

    public final void key(String str, int i) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.crashlytics.setCustomKey(str, i);
    }

    public final void key(String str, long j) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.crashlytics.setCustomKey(str, j);
    }

    public final void key(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        this.crashlytics.setCustomKey(str, str2);
    }
}
