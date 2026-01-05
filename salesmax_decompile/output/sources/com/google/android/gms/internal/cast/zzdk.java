package com.google.android.gms.internal.cast;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
class zzdk extends BaseImplementation.ApiMethodImpl {
    final /* synthetic */ zzdm zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzdm zzdmVar, GoogleApiClient googleApiClient) {
        super((Api<?>) zzdmVar.zzb, googleApiClient);
        this.zzc = zzdmVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzdl(status);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzdk) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    @VisibleForTesting
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void doExecute(zzdp zzdpVar) {
        throw null;
    }
}
