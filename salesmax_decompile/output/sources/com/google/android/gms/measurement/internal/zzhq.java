package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhq implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzhx zzb;

    public zzhq(zzhx zzhxVar, Boolean bool) {
        this.zzb = zzhxVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
