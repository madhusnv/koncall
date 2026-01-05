package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public final class zzdj extends zzdh {
    final /* synthetic */ zzdk zza;

    public zzdj(zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzd(int i) {
        zzdm.zza.m13795d("onError: %d", Integer.valueOf(i));
        zzdm.zzf(this.zza.zzc);
        this.zza.setResult((zzdk) new zzdl(Status.RESULT_INTERNAL_ERROR));
    }

    @Override // com.google.android.gms.internal.cast.zzdh, com.google.android.gms.internal.cast.zzdr
    public final void zzf() {
        zzdm.zza.m13795d("onDisconnected", new Object[0]);
        zzdm.zzf(this.zza.zzc);
        this.zza.setResult((zzdk) new zzdl(Status.RESULT_SUCCESS));
    }
}
