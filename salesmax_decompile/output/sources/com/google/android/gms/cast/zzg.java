package com.google.android.gms.cast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes5.dex */
final class zzg extends zzp {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zzm zzmVar, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient);
        this.zza = str;
    }

    @Override // com.google.android.gms.cast.zzp, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        doExecute((com.google.android.gms.cast.internal.zzw) anyClient);
    }

    @Override // com.google.android.gms.cast.zzp
    /* renamed from: zza */
    public final void doExecute(com.google.android.gms.cast.internal.zzw zzwVar) {
        try {
            String str = this.zza;
            LaunchOptions launchOptions = new LaunchOptions();
            launchOptions.setRelaunchIfRunning(false);
            zzwVar.zzM(str, launchOptions, this);
        } catch (IllegalStateException unused) {
            zzc(CastStatusCodes.INVALID_REQUEST);
        }
    }
}
