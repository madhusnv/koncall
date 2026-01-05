package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.o */
/* loaded from: classes.dex */
public final class C0320o {

    /* renamed from: a */
    public static volatile C0320o f2386a;

    /* renamed from: b */
    public static final C0320o f2387b;

    static {
        C0320o c0320o = new C0320o();
        Map map = Collections.EMPTY_MAP;
        f2387b = c0320o;
    }

    /* renamed from: a */
    public static C0320o m1022a() {
        C0320o c0320o;
        x0 x0Var = x0.f2424c;
        C0320o c0320o2 = f2386a;
        if (c0320o2 != null) {
            return c0320o2;
        }
        synchronized (C0320o.class) {
            try {
                c0320o = f2386a;
                if (c0320o == null) {
                    Class cls = AbstractC0319n.f2376a;
                    C0320o c0320o3 = null;
                    if (cls != null) {
                        try {
                            c0320o3 = (C0320o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0320o = c0320o3 != null ? c0320o3 : f2387b;
                    f2386a = c0320o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0320o;
    }
}
