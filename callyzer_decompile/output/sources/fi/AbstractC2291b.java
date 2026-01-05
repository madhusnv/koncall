package fi;

import ai.AbstractC0159p;
import ai.InterfaceC0154k;
import bi.C0665d;
import bi.C0667f;
import hi.C2935c;
import hi.q2;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fi.b */
/* loaded from: classes.dex */
public abstract class AbstractC2291b {
    static {
        C0665d[] c0665dArr = {new C0665d(InterfaceC0154k.class, 11)};
        HashMap map = new HashMap();
        C0665d c0665d = c0665dArr[0];
        Class cls = c0665d.f4217a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.m14329i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, c0665d);
        Class cls2 = c0665dArr[0].f4217a;
        Collections.unmodifiableMap(map);
        int i10 = q2.CONFIG_NAME_FIELD_NUMBER;
        try {
            m5966a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    /* renamed from: a */
    public static void m5966a() {
        AbstractC0159p.m369f(new C0667f(), true);
        AbstractC0159p.m369f(new C0667f(C2935c.class, new C0665d[]{new C0665d(InterfaceC0154k.class, 10)}, 9), true);
        AbstractC0159p.m370g(new C2293d());
    }
}
