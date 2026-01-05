package com.websoptimization.callyzerbiz.common.exception;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class FirebaseBlankException extends Exception {

    /* renamed from: a */
    public final String f7323a;

    public FirebaseBlankException() {
        super("");
        this.f7323a = "";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f7323a;
        return str.length() == 0 ? super.getMessage() : str;
    }

    public FirebaseBlankException(String str) {
        super(str);
        this.f7323a = str;
    }
}
