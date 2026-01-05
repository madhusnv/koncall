package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzii implements Runnable {
    final /* synthetic */ zzim zza;

    public zzii(zzim zzimVar) {
        this.zza = zzimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzim zzimVar = this.zza;
        zzimVar.zza = zzimVar.zzh;
    }
}
