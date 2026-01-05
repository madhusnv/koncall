package rw;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import z7.C8873b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.x */
/* loaded from: classes3.dex */
public abstract class AbstractC6674x {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[EDGE_INSN: B:45:0x0090->B:41:0x0090 BREAK  A[LOOP:0: B:11:0x0018->B:49:?], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List m12773a(ge.C2581m r9, int r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r9, r0)
            java.util.LinkedHashMap r9 = r9.f14060a
            if (r10 != r11) goto Lc
            rw.r r9 = rw.C6668r.f31943a
            return r9
        Lc:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto L12
            r2 = r1
            goto L13
        L12:
            r2 = r0
        L13:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L18:
            if (r2 == 0) goto L1d
            if (r10 >= r11) goto L91
            goto L1f
        L1d:
            if (r10 <= r11) goto L91
        L1f:
            r4 = 0
            if (r2 == 0) goto L3a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L30
        L2e:
            r7 = r4
            goto L50
        L30:
            java.util.NavigableSet r6 = r5.descendingKeySet()
            qw.k r7 = new qw.k
            r7.<init>(r5, r6)
            goto L50
        L3a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r9.get(r5)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L47
            goto L2e
        L47:
            java.util.Set r6 = r5.keySet()
            qw.k r7 = new qw.k
            r7.<init>(r5, r6)
        L50:
            if (r7 != 0) goto L53
            goto L90
        L53:
            java.lang.Object r5 = r7.f30755a
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r7.f30756b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L78
            int r8 = r10 + 1
            if (r8 > r7) goto L5f
            if (r7 > r11) goto L5f
            goto L7c
        L78:
            if (r11 > r7) goto L5f
            if (r7 >= r10) goto L5f
        L7c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r10)
            r3.add(r10)
            r5 = r1
            r10 = r7
            goto L8e
        L8d:
            r5 = r0
        L8e:
            if (r5 != 0) goto L18
        L90:
            return r4
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rw.AbstractC6674x.m12773a(ge.m, int, int):java.util.List");
    }

    /* renamed from: b */
    public static Object m12774b(Map map, Object obj) {
        AbstractC4154l.m8923f(map, "<this>");
        if (map instanceof InterfaceC6673w) {
            return ((InterfaceC6673w) map).m12772c();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    /* renamed from: c */
    public static final boolean m12775c(C8873b c8873b, int i10, int i11) {
        AbstractC4154l.m8923f(c8873b, "<this>");
        if (i10 > i11 && c8873b.f42701l) {
            return false;
        }
        Set set = c8873b.f42702m;
        return c8873b.f42700k && (set == null || !set.contains(Integer.valueOf(i10)));
    }

    /* renamed from: d */
    public static int m12776d(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((i10 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public static Map m12777e(C6361k pair) {
        AbstractC4154l.m8923f(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f30755a, pair.f30756b);
        AbstractC4154l.m8922e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* renamed from: f */
    public static Map m12778f(C6361k... c6361kArr) {
        if (c6361kArr.length <= 0) {
            return C6669s.f31944a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m12776d(c6361kArr.length));
        m12782j(linkedHashMap, c6361kArr);
        return linkedHashMap;
    }

    /* renamed from: g */
    public static LinkedHashMap m12779g(C6361k... c6361kArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(m12776d(c6361kArr.length));
        m12782j(linkedHashMap, c6361kArr);
        return linkedHashMap;
    }

    /* renamed from: h */
    public static LinkedHashMap m12780h(Map map, Map map2) {
        AbstractC4154l.m8923f(map, "<this>");
        AbstractC4154l.m8923f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: i */
    public static Map m12781i(Map map, C6361k c6361k) {
        AbstractC4154l.m8923f(map, "<this>");
        if (map.isEmpty()) {
            return m12777e(c6361k);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(c6361k.f30755a, c6361k.f30756b);
        return linkedHashMap;
    }

    /* renamed from: j */
    public static final void m12782j(HashMap map, C6361k[] c6361kArr) {
        for (C6361k c6361k : c6361kArr) {
            map.put(c6361k.f30755a, c6361k.f30756b);
        }
    }

    /* renamed from: k */
    public static void m12783k(LinkedHashMap linkedHashMap, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C6361k c6361k = (C6361k) it.next();
            linkedHashMap.put(c6361k.f30755a, c6361k.f30756b);
        }
    }

    /* renamed from: l */
    public static Map m12784l(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return m12777e((C6361k) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m12776d(collection.size()));
                m12783k(linkedHashMap, iterable);
                return linkedHashMap;
            }
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            m12783k(linkedHashMap2, iterable);
            int size2 = linkedHashMap2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashMap2 : m12787o(linkedHashMap2);
            }
        }
        return C6669s.f31944a;
    }

    /* renamed from: m */
    public static Map m12785m(Map map) {
        AbstractC4154l.m8923f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m12786n(map) : m12787o(map) : C6669s.f31944a;
    }

    /* renamed from: n */
    public static LinkedHashMap m12786n(Map map) {
        AbstractC4154l.m8923f(map, "<this>");
        return new LinkedHashMap(map);
    }

    /* renamed from: o */
    public static final Map m12787o(Map map) {
        AbstractC4154l.m8923f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC4154l.m8922e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
