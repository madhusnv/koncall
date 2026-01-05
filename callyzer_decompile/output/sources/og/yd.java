package og;

import ay.C0496f;
import ay.ExecutorC0495e;
import ex.InterfaceC2139c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import r6.C6472a;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class yd {
    /* renamed from: a */
    public static final LinkedHashMap m11067a(Map map) {
        AbstractC4154l.m8923f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6674x.m12776d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC6663m.d0((List) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static C6472a m11068b(InterfaceC2139c interfaceC2139c, String name) {
        C0496f c0496f = tx.m0.f34659a;
        ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
        tx.u1 u1VarM13481d = tx.c0.m13481d();
        executorC0495e.getClass();
        C8810d c8810dM13479b = tx.c0.m13479b(pg.x5.m11928d(executorC0495e, u1VarM13481d));
        AbstractC4154l.m8923f(name, "name");
        return new C6472a(name, interfaceC2139c, c8810dM13479b);
    }
}
