package com.google.android.gms.common.api;

import pf.C5904d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: a */
    public final C5904d f6011a;

    public UnsupportedApiCallException(C5904d c5904d) {
        this.f6011a = c5904d;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f6011a));
    }
}
