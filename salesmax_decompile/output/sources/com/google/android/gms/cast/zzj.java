package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes5.dex */
final class zzj extends com.google.android.gms.cast.internal.zzad {
    public zzj(zzm zzmVar, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.cast.internal.zzad, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        doExecute((com.google.android.gms.cast.internal.zzw) anyClient);
    }

    @Override // com.google.android.gms.cast.internal.zzad
    /* renamed from: zza */
    public final void doExecute(com.google.android.gms.cast.internal.zzw zzwVar) {
        try {
            zzwVar.zzN(this);
        } catch (IllegalStateException unused) {
            zzc(CastStatusCodes.INVALID_REQUEST);
        }
    }
}
