package ec;

import fx.InterfaceC2399e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import mx.C4914j;
import mx.InterfaceC4911g;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.t */
/* loaded from: classes.dex */
public final class C2022t implements Map, InterfaceC2017o, InterfaceC2399e {

    /* renamed from: a */
    public final LinkedHashMap f9580a;

    public C2022t(LinkedHashMap linkedHashMap) {
        this.f9580a = linkedHashMap;
    }

    @Override // ec.InterfaceC2017o
    /* renamed from: a */
    public final InterfaceC4911g mo261a() {
        return new C4914j(new C2020r(this, null, 1));
    }

    @Override // java.util.Map
    public final void clear() {
        this.f9580a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f9580a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!d0.m8910g(obj)) {
            return false;
        }
        List value = (List) obj;
        AbstractC4154l.m8923f(value, "value");
        return this.f9580a.containsValue(value);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f9580a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2022t.class != obj.getClass()) {
            return false;
        }
        return this.f9580a.equals(((C2022t) obj).f9580a);
    }

    @Override // ec.InterfaceC2017o
    /* renamed from: g */
    public final boolean mo266g(Object obj, String str) {
        Object arrayList = get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            put((Object) str, arrayList);
        }
        return ((List) arrayList).add(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return (List) this.f9580a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9580a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9580a.isEmpty();
    }

    @Override // ec.InterfaceC2017o
    /* renamed from: k */
    public final boolean mo270k(Object obj, Collection values) {
        AbstractC4154l.m8923f(values, "values");
        Object arrayList = get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            put(obj, arrayList);
        }
        return ((List) arrayList).addAll(values);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f9580a.keySet();
    }

    @Override // java.util.Map, ec.InterfaceC2017o
    public final List put(Object obj, Object obj2) {
        return (List) put(obj, (Object) pe.m10835j(obj2));
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC4154l.m8923f(from, "from");
        this.f9580a.putAll(from);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return (List) this.f9580a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9580a.size();
    }

    public final String toString() {
        return this.f9580a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f9580a.values();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        List value = (List) obj2;
        AbstractC4154l.m8923f(value, "value");
        return (List) this.f9580a.put(obj, value);
    }
}
