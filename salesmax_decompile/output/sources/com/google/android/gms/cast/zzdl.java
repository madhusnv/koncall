package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

/* loaded from: classes5.dex */
final class zzdl implements ResultCallback {
    final /* synthetic */ zzdm zza;
    private final long zzb;

    public zzdl(zzdm zzdmVar, long j) {
        this.zza = zzdmVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(Result result) {
        Status status = (Status) result;
        if (status.isSuccess()) {
            return;
        }
        this.zza.zza.zzb.zzP(this.zzb, status.getStatusCode());
    }
}
