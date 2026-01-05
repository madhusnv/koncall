package com.google.mlkit.common;

import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MlKitException extends Exception {

    /* renamed from: a */
    public final int f7208a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i10) {
        super(str);
        AbstractC6840z.m13034e(str, "Provided message must not be empty.");
        this.f7208a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, Exception exc) {
        super(str, exc);
        AbstractC6840z.m13034e(str, "Provided message must not be empty.");
        this.f7208a = 13;
    }
}
