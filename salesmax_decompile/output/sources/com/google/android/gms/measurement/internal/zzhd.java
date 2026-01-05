package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class zzhd implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzhx zzc;

    public zzhd(zzhx zzhxVar, AtomicReference atomicReference, boolean z) {
        this.zzc = zzhxVar;
        this.zza = atomicReference;
        this.zzb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzt.zzt().zzx(this.zza, this.zzb);
    }
}
