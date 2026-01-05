package com.google.android.gms.internal.cast;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes3.dex */
final class zzdg extends zzdk {
    public zzdg(zzdm zzdmVar, GoogleApiClient googleApiClient) {
        super(zzdmVar, googleApiClient);
    }

    @Override // com.google.android.gms.internal.cast.zzdk, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        doExecute((zzdp) anyClient);
    }

    @Override // com.google.android.gms.internal.cast.zzdk
    /* renamed from: zza */
    public final void doExecute(zzdp zzdpVar) {
        zzdpVar.zzs(new zzdj(this));
    }
}
