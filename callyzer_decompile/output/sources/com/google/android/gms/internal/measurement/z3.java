package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class z3 {

    /* renamed from: a */
    public static final p013o.i2 f6467a;

    static {
        p013o.i2 i2Var;
        Uri uri = a4.f6054a;
        synchronized (b4.class) {
            try {
                if (b4.f6075a == null) {
                    p013o.i2 i2Var2 = new p013o.i2();
                    synchronized (b4.class) {
                        if (b4.f6075a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        b4.f6075a = i2Var2;
                    }
                }
                i2Var = b4.f6075a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f6467a = i2Var;
    }
}
