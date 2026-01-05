package og;

import e1.C1903e;
import ex.InterfaceC2139c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;
import rw.AbstractC6674x;
import sw.C6962f;
import sw.C6964h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class qe {
    /* renamed from: a */
    public static C6964h m10855a(C6964h c6964h) {
        C6962f c6962f = c6964h.f33724a;
        c6962f.m13230d();
        return c6962f.f33716j > 0 ? c6964h : C6964h.f33723b;
    }

    /* renamed from: b */
    public static Set m10856b(Set set, Iterable iterable) {
        Collection<?> collectionC0 = iterable instanceof Collection ? (Collection) iterable : AbstractC6663m.c0(iterable);
        if (collectionC0.isEmpty()) {
            return AbstractC6663m.g0(set);
        }
        if (!(collectionC0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionC0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionC0).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: c */
    public static Set m10857c(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6674x.m12776d(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    public static LinkedHashSet m10858d(Set set, Iterable elements) {
        AbstractC4154l.m8923f(set, "<this>");
        AbstractC4154l.m8923f(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6674x.m12776d(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        AbstractC6663m.m12765x(linkedHashSet, elements);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static LinkedHashSet m10859e(Set set, Object obj) {
        AbstractC4154l.m8923f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC6674x.m12776d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* renamed from: f */
    public static final void m10860f(C1903e map, InterfaceC2139c interfaceC2139c) {
        AbstractC4154l.m8923f(map, "map");
        C1903e c1903e = new C1903e(999);
        int i10 = map.f9065c;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            c1903e.put(map.m5634j(i11), map.m5637o(i11));
            i11++;
            i12++;
            if (i12 == 999) {
                interfaceC2139c.invoke(c1903e);
                c1903e.clear();
                i12 = 0;
            }
        }
        if (i12 > 0) {
            interfaceC2139c.invoke(c1903e);
        }
    }

    /* renamed from: g */
    public static final void m10861g(HashMap map, InterfaceC2139c interfaceC2139c) {
        int i10;
        AbstractC4154l.m8923f(map, "map");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i10 = 0;
            for (Object obj : map.keySet()) {
                AbstractC4154l.m8922e(obj, "next(...)");
                map2.put(obj, map.get(obj));
                i10++;
                if (i10 == 999) {
                    break;
                }
            }
            interfaceC2139c.invoke(map2);
            map2.clear();
        }
        if (i10 > 0) {
            interfaceC2139c.invoke(map2);
        }
    }

    /* renamed from: h */
    public static Set m10862h(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC4154l.m8922e(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
