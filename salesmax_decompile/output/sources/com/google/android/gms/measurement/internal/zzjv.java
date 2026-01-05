package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzjv implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkc zzb;

    public zzjv(zzkc zzkcVar, long j) {
        this.zzb = zzkcVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc.zzj(this.zzb, this.zza);
    }
}
