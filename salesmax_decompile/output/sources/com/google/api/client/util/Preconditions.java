package com.google.api.client.util;

import p001o.dgd;

/* loaded from: classes3.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z) {
        dgd.m23051d(z);
    }

    public static <T> T checkNotNull(T t) {
        return (T) dgd.m23062o(t);
    }

    public static void checkState(boolean z) {
        dgd.m23068u(z);
    }

    public static void checkArgument(boolean z, Object obj) {
        dgd.m23052e(z, obj);
    }

    public static <T> T checkNotNull(T t, Object obj) {
        return (T) dgd.m23063p(t, obj);
    }

    public static void checkState(boolean z, Object obj) {
        dgd.m23069v(z, obj);
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        dgd.m23059l(z, str, objArr);
    }

    public static <T> T checkNotNull(T t, String str, Object... objArr) {
        return (T) dgd.m23064q(t, str, objArr);
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        dgd.m23073z(z, str, objArr);
    }
}
