package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ParametersBuilder {
    private final Bundle zza = new Bundle();

    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(String str, double d) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.zza.putDouble(str, d);
    }

    public final void param(String str, long j) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.zza.putLong(str, j);
    }

    public final void param(String str, Bundle bundle) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(bundle, "value");
        this.zza.putBundle(str, bundle);
    }

    public final void param(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(str2, "value");
        this.zza.putString(str, str2);
    }

    public final void param(String str, Bundle[] bundleArr) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(bundleArr, "value");
        this.zza.putParcelableArray(str, bundleArr);
    }
}
