package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzgh implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgj zzb;

    public zzgh(zzgj zzgjVar, zzq zzqVar) {
        this.zzb = zzgjVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzA();
        this.zzb.zza.zzL(this.zza);
    }
}
