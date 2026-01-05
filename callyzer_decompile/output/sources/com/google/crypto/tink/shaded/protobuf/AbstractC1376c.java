package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.c */
/* loaded from: classes.dex */
public abstract class AbstractC1376c {

    /* renamed from: a */
    public static final Class f7022a;

    /* renamed from: b */
    public static final boolean f7023b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f7022a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f7023b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m4171a() {
        return (f7022a == null || f7023b) ? false : true;
    }
}
