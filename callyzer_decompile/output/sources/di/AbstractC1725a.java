package di;

import ai.AbstractC0159p;
import ai.InterfaceC0147d;
import bi.C0665d;
import bi.C0667f;
import hi.o0;
import hi.q2;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: di.a */
/* loaded from: classes.dex */
public abstract class AbstractC1725a {

    /* renamed from: a */
    public static final /* synthetic */ int f8369a = 0;

    static {
        C0665d[] c0665dArr = {new C0665d(InterfaceC0147d.class, 9)};
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
            AbstractC0159p.m369f(new C0667f(o0.class, new C0665d[]{new C0665d(InterfaceC0147d.class, 9)}, 8), true);
            AbstractC0159p.m370g(new C1727c());
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
