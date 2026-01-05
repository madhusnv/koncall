package com.google.android.gms.cast.internal;

/* loaded from: classes5.dex */
final class zzam implements zzat {
    final /* synthetic */ zzat zza;
    final /* synthetic */ zzaq zzb;

    public zzam(zzaq zzaqVar, zzat zzatVar) {
        this.zzb = zzaqVar;
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.cast.internal.zzat
    public final void zza(long j, int i, Object obj) {
        if (this.zza != null) {
            if (i == 2001) {
                zzaq zzaqVar = this.zzb;
                zzaqVar.zza.m13802w("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", Integer.valueOf(zzaqVar.zzz));
                this.zzb.zzy.zzl();
                i = 2001;
            }
            this.zza.zza(j, i, obj);
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
