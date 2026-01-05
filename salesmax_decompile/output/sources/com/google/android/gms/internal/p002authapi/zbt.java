package com.google.android.gms.internal.p002authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* loaded from: classes3.dex */
public final class zbt extends zba {
    public zbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zbc(zbs zbsVar, zbp zbpVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbsVar);
        zbc.zbc(parcelZba, zbpVar);
        zbb(3, parcelZba);
    }

    public final void zbd(zbs zbsVar, CredentialRequest credentialRequest) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbsVar);
        zbc.zbc(parcelZba, credentialRequest);
        zbb(1, parcelZba);
    }

    public final void zbe(zbs zbsVar, zbu zbuVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbsVar);
        zbc.zbc(parcelZba, zbuVar);
        zbb(2, parcelZba);
    }

    public final void zbf(zbs zbsVar) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, zbsVar);
        zbb(4, parcelZba);
    }
}
