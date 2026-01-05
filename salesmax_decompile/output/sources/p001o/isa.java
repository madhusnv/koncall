package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class isa extends hsa {
    /* renamed from: h */
    public static final Map m32681h() {
        l66 l66Var = l66.f33300a;
        sq8.m48647f(l66Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return l66Var;
    }

    /* renamed from: i */
    public static final Object m32682i(Map map, Object obj) {
        sq8.m48649h(map, "<this>");
        return gsa.m29448a(map, obj);
    }

    /* renamed from: j */
    public static final HashMap m32683j(hwc... hwcVarArr) {
        sq8.m48649h(hwcVarArr, "pairs");
        HashMap map = new HashMap(hsa.m31055e(hwcVarArr.length));
        m32690q(map, hwcVarArr);
        return map;
    }

    /* renamed from: k */
    public static final Map m32684k(hwc... hwcVarArr) {
        sq8.m48649h(hwcVarArr, "pairs");
        return hwcVarArr.length > 0 ? m32695v(hwcVarArr, new LinkedHashMap(hsa.m31055e(hwcVarArr.length))) : m32681h();
    }

    /* renamed from: l */
    public static final Map m32685l(hwc... hwcVarArr) {
        sq8.m48649h(hwcVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(hwcVarArr.length));
        m32690q(linkedHashMap, hwcVarArr);
        return linkedHashMap;
    }

    /* renamed from: m */
    public static final Map m32686m(Map map) {
        sq8.m48649h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : hsa.m31057g(map) : m32681h();
    }

    /* renamed from: n */
    public static final Map m32687n(Map map, Map map2) {
        sq8.m48649h(map, "<this>");
        sq8.m48649h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: o */
    public static final Map m32688o(Map map, hwc hwcVar) {
        sq8.m48649h(map, "<this>");
        sq8.m48649h(hwcVar, "pair");
        if (map.isEmpty()) {
            return hsa.m31056f(hwcVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(hwcVar.m31229c(), hwcVar.m31230d());
        return linkedHashMap;
    }

    /* renamed from: p */
    public static final void m32689p(Map map, Iterable iterable) {
        sq8.m48649h(map, "<this>");
        sq8.m48649h(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hwc hwcVar = (hwc) it.next();
            map.put(hwcVar.m31227a(), hwcVar.m31228b());
        }
    }

    /* renamed from: q */
    public static final void m32690q(Map map, hwc[] hwcVarArr) {
        sq8.m48649h(map, "<this>");
        sq8.m48649h(hwcVarArr, "pairs");
        for (hwc hwcVar : hwcVarArr) {
            map.put(hwcVar.m31227a(), hwcVar.m31228b());
        }
    }

    /* renamed from: r */
    public static final Map m32691r(Iterable iterable) {
        sq8.m48649h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m32686m(m32692s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m32681h();
        }
        if (size != 1) {
            return m32692s(iterable, new LinkedHashMap(hsa.m31055e(collection.size())));
        }
        return hsa.m31056f((hwc) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    /* renamed from: s */
    public static final Map m32692s(Iterable iterable, Map map) {
        sq8.m48649h(iterable, "<this>");
        sq8.m48649h(map, FirebaseAnalytics.Param.DESTINATION);
        m32689p(map, iterable);
        return map;
    }

    /* renamed from: t */
    public static final Map m32693t(Map map) {
        sq8.m48649h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m32696w(map) : hsa.m31057g(map) : m32681h();
    }

    /* renamed from: u */
    public static final Map m32694u(hwc[] hwcVarArr) {
        sq8.m48649h(hwcVarArr, "<this>");
        int length = hwcVarArr.length;
        return length != 0 ? length != 1 ? m32695v(hwcVarArr, new LinkedHashMap(hsa.m31055e(hwcVarArr.length))) : hsa.m31056f(hwcVarArr[0]) : m32681h();
    }

    /* renamed from: v */
    public static final Map m32695v(hwc[] hwcVarArr, Map map) {
        sq8.m48649h(hwcVarArr, "<this>");
        sq8.m48649h(map, FirebaseAnalytics.Param.DESTINATION);
        m32690q(map, hwcVarArr);
        return map;
    }

    /* renamed from: w */
    public static final Map m32696w(Map map) {
        sq8.m48649h(map, "<this>");
        return new LinkedHashMap(map);
    }
}
