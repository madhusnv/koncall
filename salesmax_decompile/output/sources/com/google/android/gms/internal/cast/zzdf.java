package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes3.dex */
final class zzdf extends zzdk {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdm zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzdm zzdmVar, GoogleApiClient googleApiClient, String str) {
        super(zzdmVar, googleApiClient);
        this.zzb = zzdmVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.cast.zzdk, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        doExecute((zzdp) anyClient);
    }

    @Override // com.google.android.gms.internal.cast.zzdk
    /* renamed from: zza */
    public final void doExecute(zzdp zzdpVar) {
        zzdpVar.zzr(new zzdi(this, zzdpVar), this.zzb.zzd, this.zza);
    }
}
