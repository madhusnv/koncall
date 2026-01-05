package p001o;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p001o.xn8;

/* loaded from: classes4.dex */
public final class pra extends LinkedHashMap {

    /* renamed from: b */
    public static final pra f40443b;

    /* renamed from: a */
    public boolean f40444a;

    static {
        pra praVar = new pra();
        f40443b = praVar;
        praVar.m44082u();
    }

    public pra() {
        this.f40444a = true;
    }

    /* renamed from: a */
    public static int m44073a(Map map) {
        int iM44074c = 0;
        for (Map.Entry entry : map.entrySet()) {
            iM44074c += m44074c(entry.getValue()) ^ m44074c(entry.getKey());
        }
        return iM44074c;
    }

    /* renamed from: c */
    public static int m44074c(Object obj) {
        if (obj instanceof byte[]) {
            return xn8.m56502d((byte[]) obj);
        }
        if (obj instanceof xn8.InterfaceC18193a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: f */
    public static void m44075f(Map map) {
        for (Object obj : map.keySet()) {
            xn8.m56499a(obj);
            xn8.m56499a(map.get(obj));
        }
    }

    /* renamed from: g */
    public static pra m44076g() {
        return f40443b;
    }

    /* renamed from: k */
    public static boolean m44077k(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: s */
    public static boolean m44078s(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m44077k(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public pra m44079A() {
        return isEmpty() ? new pra() : new pra(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m44080h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m44078s(this, (Map) obj);
    }

    /* renamed from: h */
    public final void m44080h() {
        if (!m44081t()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m44073a(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        m44080h();
        xn8.m56499a(obj);
        xn8.m56499a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        m44080h();
        m44075f(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m44080h();
        return super.remove(obj);
    }

    /* renamed from: t */
    public boolean m44081t() {
        return this.f40444a;
    }

    /* renamed from: u */
    public void m44082u() {
        this.f40444a = false;
    }

    /* renamed from: y */
    public void m44083y(pra praVar) {
        m44080h();
        if (praVar.isEmpty()) {
            return;
        }
        putAll(praVar);
    }

    public pra(Map map) {
        super(map);
        this.f40444a = true;
    }
}
