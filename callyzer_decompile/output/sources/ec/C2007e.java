package ec;

import fx.InterfaceC2399e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.vd;
import rw.AbstractC6663m;
import rw.AbstractC6664n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.e */
/* loaded from: classes.dex */
public final class C2007e implements Map, InterfaceC2399e {

    /* renamed from: a */
    public final LinkedHashMap f9537a = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f9537a.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return this.f9537a.containsKey(vd.m11018b((String) obj));
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f9537a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set<Map.Entry> setEntrySet = this.f9537a.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C2006d(((C2010h) entry.getKey()).f9542b, entry.getValue()));
        }
        return AbstractC6663m.f0(arrayList);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof C2007e) {
            return AbstractC4154l.m8918a(this.f9537a, ((C2007e) obj).f9537a);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            return this.f9537a.get(vd.m11018b((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9537a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9537a.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C2009g(this.f9537a.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        String key = (String) obj;
        AbstractC4154l.m8923f(key, "key");
        return this.f9537a.put(vd.m11018b(key), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC4154l.m8923f(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC4154l.m8923f(key, "key");
            this.f9537a.put(vd.m11018b(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            return this.f9537a.remove(vd.m11018b((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9537a.size();
    }

    public final String toString() {
        return this.f9537a.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f9537a.values();
    }
}
