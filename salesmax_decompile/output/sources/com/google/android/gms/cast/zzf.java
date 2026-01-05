package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes5.dex */
final class zzf extends com.google.android.gms.cast.internal.zzad {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzm zzmVar, GoogleApiClient googleApiClient, String str, String str2) {
        super(googleApiClient);
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.cast.internal.zzad, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        doExecute((com.google.android.gms.cast.internal.zzw) anyClient);
    }

    @Override // com.google.android.gms.cast.internal.zzad
    /* renamed from: zza */
    public final void doExecute(com.google.android.gms.cast.internal.zzw zzwVar) {
        try {
            zzwVar.zzQ(this.zza, this.zzb, this);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            zzc(CastStatusCodes.INVALID_REQUEST);
        }
    }
}
