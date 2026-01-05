package com.google.android.gms.common.api;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ApiException extends Exception {

    /* renamed from: a */
    public final Status f5997a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i10 = status.f6007a;
        String str = status.f6008b;
        super(i10 + ": " + (str == null ? "" : str));
        this.f5997a = status;
    }
}
