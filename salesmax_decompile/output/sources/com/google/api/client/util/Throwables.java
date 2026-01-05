package com.google.api.client.util;

import p001o.mlh;

/* loaded from: classes3.dex */
public final class Throwables {
    private Throwables() {
    }

    public static RuntimeException propagate(Throwable th) {
        return mlh.m39321e(th);
    }

    public static void propagateIfPossible(Throwable th) {
        if (th != null) {
            mlh.m39326j(th);
        }
    }

    public static <X extends Throwable> void propagateIfPossible(Throwable th, Class<X> cls) throws Throwable {
        mlh.m39324h(th, cls);
    }
}
