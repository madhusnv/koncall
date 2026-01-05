package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzdp extends zzdu {
    final /* synthetic */ zzdv zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdp(zzef zzefVar, zzdv zzdvVar) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = zzdvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).setEventInterceptor(this.zza);
    }
}
