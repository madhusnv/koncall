package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzeo implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzep zzb;

    public zzeo(zzep zzepVar, boolean z) {
        this.zzb = zzepVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzJ(this.zza);
    }
}
