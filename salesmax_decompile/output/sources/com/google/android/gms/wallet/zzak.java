package com.google.android.gms.wallet;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes3.dex */
public abstract class zzak<R extends Result> extends BaseImplementation.ApiMethodImpl<R, com.google.android.gms.internal.wallet.zzab> {
    public zzak(GoogleApiClient googleApiClient) {
        super(Wallet.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzak<R>) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract void doExecute(com.google.android.gms.internal.wallet.zzab zzabVar);
}
