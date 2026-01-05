package com.websoptimization.callyzerbiz.common.exception;

import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AppNotConnected extends Exception {

    /* renamed from: a */
    public final String f7318a;

    public AppNotConnected() {
        this(null);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strM7378k;
        String str = this.f7318a;
        return (str == null || (strM7378k = m0.m7378k("App Not connected found on this ", str)) == null) ? super.getMessage() : strM7378k;
    }

    public AppNotConnected(String str) {
        this.f7318a = str;
    }
}
