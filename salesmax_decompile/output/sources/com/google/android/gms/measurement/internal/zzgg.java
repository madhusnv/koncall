package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzgg implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzgj zzb;

    public zzgg(zzgj zzgjVar, String str) {
        this.zzb = zzgjVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.zzb.zza.zzA();
        return this.zzb.zza.zzi().zzu(this.zza);
    }
}
