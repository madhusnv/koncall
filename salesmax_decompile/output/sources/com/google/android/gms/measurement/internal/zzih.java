package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
final class zzih implements Runnable {
    final /* synthetic */ zzie zza;
    final /* synthetic */ zzie zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzim zze;

    public zzih(zzim zzimVar, zzie zzieVar, zzie zzieVar2, long j, boolean z) {
        this.zze = zzimVar;
        this.zza = zzieVar;
        this.zzb = zzieVar2;
        this.zzc = j;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
