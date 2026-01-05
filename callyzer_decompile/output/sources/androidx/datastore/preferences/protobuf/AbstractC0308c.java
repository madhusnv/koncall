package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.c */
/* loaded from: classes.dex */
public abstract class AbstractC0308c {

    /* renamed from: a */
    public static final Class f2298a;

    /* renamed from: b */
    public static final boolean f2299b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2298a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f2299b = cls2 != null;
    }

    /* renamed from: a */
    public static boolean m852a() {
        return (f2298a == null || f2299b) ? false : true;
    }
}
