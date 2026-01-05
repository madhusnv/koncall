package p001o;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p001o.yn8;

/* loaded from: classes6.dex */
public final class ora extends LinkedHashMap {

    /* renamed from: b */
    public static final ora f38792b;

    /* renamed from: a */
    public boolean f38793a;

    static {
        ora oraVar = new ora();
        f38792b = oraVar;
        oraVar.m42598u();
    }

    public ora() {
        this.f38793a = true;
    }

    /* renamed from: a */
    public static int m42589a(Map map) {
        int iM42590c = 0;
        for (Map.Entry entry : map.entrySet()) {
            iM42590c += m42590c(entry.getValue()) ^ m42590c(entry.getKey());
        }
        return iM42590c;
    }

    /* renamed from: c */
    public static int m42590c(Object obj) {
        if (obj instanceof byte[]) {
            return yn8.m58015d((byte[]) obj);
        }
        if (obj instanceof yn8.InterfaceC18439c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: f */
    public static void m42591f(Map map) {
        for (Object obj : map.keySet()) {
            yn8.m58012a(obj);
            yn8.m58012a(map.get(obj));
        }
    }

    /* renamed from: g */
    public static ora m42592g() {
        return f38792b;
    }

    /* renamed from: k */
    public static boolean m42593k(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: s */
    public static boolean m42594s(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m42593k(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public ora m42595A() {
        return isEmpty() ? new ora() : new ora(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m42596h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m42594s(this, (Map) obj);
    }

    /* renamed from: h */
    public final void m42596h() {
        if (!m42597t()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m42589a(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        m42596h();
        yn8.m58012a(obj);
        yn8.m58012a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        m42596h();
        m42591f(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m42596h();
        return super.remove(obj);
    }

    /* renamed from: t */
    public boolean m42597t() {
        return this.f38793a;
    }

    /* renamed from: u */
    public void m42598u() {
        this.f38793a = false;
    }

    /* renamed from: y */
    public void m42599y(ora oraVar) {
        m42596h();
        if (oraVar.isEmpty()) {
            return;
        }
        putAll(oraVar);
    }

    public ora(Map map) {
        super(map);
        this.f38793a = true;
    }
}
