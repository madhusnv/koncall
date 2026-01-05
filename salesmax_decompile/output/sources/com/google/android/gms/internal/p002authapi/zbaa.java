package com.google.android.gms.internal.p002authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* loaded from: classes3.dex */
public final class zbaa extends zba {
    public zbaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbz zbzVar, AuthorizationRequest authorizationRequest) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbzVar);
        zbc.zbc(parcelZba, authorizationRequest);
        zbb(1, parcelZba);
    }
}
