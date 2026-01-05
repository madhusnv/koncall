package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzcq extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ zzef zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(zzef zzefVar, String str) {
        super(zzefVar, true);
        this.zzb = zzefVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final void zza() {
        ((zzcc) Preconditions.checkNotNull(this.zzb.zzj)).setUserId(this.zza, this.zzh);
    }
}
