package d7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.b */
/* loaded from: classes.dex */
public final class C1629b {

    /* renamed from: a */
    public final HashMap f8068a = new HashMap();

    /* renamed from: b */
    public final HashMap f8069b;

    public C1629b(HashMap map) {
        this.f8069b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1644p enumC1644p = (EnumC1644p) entry.getValue();
            List arrayList = (List) this.f8068a.get(enumC1644p);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f8068a.put(enumC1644p, arrayList);
            }
            arrayList.add((C1630c) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m5304a(List list, InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1630c c1630c = (C1630c) list.get(size);
                Method method = c1630c.f8074b;
                try {
                    int i10 = c1630c.f8073a;
                    if (i10 == 0) {
                        method.invoke(obj, null);
                    } else if (i10 == 1) {
                        method.invoke(obj, interfaceC1649u);
                    } else if (i10 == 2) {
                        method.invoke(obj, interfaceC1649u, enumC1644p);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}
