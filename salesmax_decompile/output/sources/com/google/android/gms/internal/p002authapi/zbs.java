package com.google.android.gms.internal.p002authapi;

import android.os.IInterface;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public interface zbs extends IInterface {
    void zbb(Status status, Credential credential);

    void zbc(Status status);

    void zbd(Status status, String str);
}
