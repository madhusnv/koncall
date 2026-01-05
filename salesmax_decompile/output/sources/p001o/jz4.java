package p001o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes6.dex */
public final class jz4 extends HashMap {

    /* renamed from: a */
    public final xk7 f31281a;

    public jz4(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "create");
        this.f31281a = xk7Var;
    }

    /* renamed from: a */
    public /* bridge */ boolean m34775a(Integer num) {
        return super.containsKey(num);
    }

    /* renamed from: c */
    public Object m34776c(int i) {
        Object obj = super.get(Integer.valueOf(i));
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f31281a.invoke(Integer.valueOf(i));
        put(Integer.valueOf(i), objInvoke);
        return objInvoke;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof Integer) {
            return m34775a((Integer) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return m34777f();
    }

    /* renamed from: f */
    public /* bridge */ Set m34777f() {
        return super.entrySet();
    }

    /* renamed from: g */
    public /* bridge */ Set m34778g() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof Integer) {
            return m34776c(((Number) obj).intValue());
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof Integer) ? obj2 : m34779h((Integer) obj, obj2);
    }

    /* renamed from: h */
    public /* bridge */ Object m34779h(Integer num, Object obj) {
        return super.getOrDefault(num, obj);
    }

    /* renamed from: k */
    public /* bridge */ int m34780k() {
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return m34778g();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof Integer) {
            return m34782t((Integer) obj);
        }
        return null;
    }

    /* renamed from: s */
    public /* bridge */ Collection m34781s() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return m34780k();
    }

    /* renamed from: t */
    public /* bridge */ Object m34782t(Integer num) {
        return super.remove(num);
    }

    /* renamed from: u */
    public /* bridge */ boolean m34783u(Integer num, Object obj) {
        return super.remove(num, obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return m34781s();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof Integer) {
            return m34783u((Integer) obj, obj2);
        }
        return false;
    }
}
