package com.google.android.gms.cast.internal;

/* loaded from: classes5.dex */
final class zzal implements zzat {
    final /* synthetic */ zzat zza;
    final /* synthetic */ zzaq zzb;

    public zzal(zzaq zzaqVar, zzat zzatVar) {
        this.zzb = zzaqVar;
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void zza(long j, int i, Object obj) {
        this.zzb.zzx = null;
        zzat zzatVar = this.zza;
        if (zzatVar != null) {
            zzatVar.zza(j, i, obj);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void zzb(long j) {
        zzat zzatVar = this.zza;
        if (zzatVar != null) {
            zzatVar.zzb(j);
        }
    }
}
