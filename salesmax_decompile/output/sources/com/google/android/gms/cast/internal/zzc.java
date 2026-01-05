package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes5.dex */
public abstract class zzc extends BaseImplementation.ApiMethodImpl {
    public zzc(GoogleApiClient googleApiClient) {
        super(Cast.API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzc) obj);
    }

    public final void zzc(int i) {
        setResult((zzc) createFailedResult(new Status(CastStatusCodes.INVALID_REQUEST)));
    }
}
