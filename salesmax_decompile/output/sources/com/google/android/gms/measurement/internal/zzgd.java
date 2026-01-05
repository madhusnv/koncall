package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzgd implements Runnable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgj zzc;

    public zzgd(zzgj zzgjVar, zzaw zzawVar, String str) {
        this.zzc = zzgjVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzA();
        this.zzc.zza.zzF(this.zza, this.zzb);
    }
}
