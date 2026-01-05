package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.q */
/* loaded from: classes.dex */
public final class C1390q {

    /* renamed from: a */
    public static volatile C1390q f7087a;

    /* renamed from: b */
    public static final C1390q f7088b;

    static {
        C1390q c1390q = new C1390q();
        Map map = Collections.EMPTY_MAP;
        f7088b = c1390q;
    }

    /* renamed from: a */
    public static C1390q m4366a() {
        C1390q c1390q;
        C1390q c1390q2 = f7087a;
        if (c1390q2 != null) {
            return c1390q2;
        }
        synchronized (C1390q.class) {
            try {
                c1390q = f7087a;
                if (c1390q == null) {
                    Class cls = AbstractC1389p.f7084a;
                    C1390q c1390q3 = null;
                    if (cls != null) {
                        try {
                            c1390q3 = (C1390q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c1390q = c1390q3 != null ? c1390q3 : f7088b;
                    f7087a = c1390q;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c1390q;
    }
}
