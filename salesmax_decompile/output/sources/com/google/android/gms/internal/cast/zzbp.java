package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes3.dex */
final class zzbp extends BasePendingResult {
    private final zzbq zza;

    public zzbp(zzbq zzbqVar) {
        super((GoogleApiClient) null);
        this.zza = zzbqVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status) {
        int i = CastSession.zza;
        return status;
    }
}
