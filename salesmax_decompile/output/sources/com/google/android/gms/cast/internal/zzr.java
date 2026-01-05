package com.google.android.gms.cast.internal;

/* loaded from: classes5.dex */
final class zzr implements Runnable {
    final /* synthetic */ zzw zza;
    final /* synthetic */ int zzb;

    public zzr(zzv zzvVar, zzw zzwVar, int i) {
        this.zza = zzwVar;
        this.zzb = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzj.onApplicationDisconnected(this.zzb);
    }
}
