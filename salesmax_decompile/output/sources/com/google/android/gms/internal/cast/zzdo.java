package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
final class zzdo extends zzdt {
    final /* synthetic */ zzdu zza;
    final /* synthetic */ zzdp zzb;

    public zzdo(zzdp zzdpVar, zzdu zzduVar) {
        this.zzb = zzdpVar;
        this.zza = zzduVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdu
    public final void zzb(int i) {
        zzdp.zze.m13795d("onRemoteDisplayEnded", new Object[0]);
        zzdu zzduVar = this.zza;
        if (zzduVar != null) {
            zzduVar.zzb(i);
        }
        zzdp zzdpVar = this.zzb;
        if (zzdpVar.zzf != null) {
            zzdpVar.zzf.onRemoteDisplayEnded(new Status(i));
        }
    }
}
