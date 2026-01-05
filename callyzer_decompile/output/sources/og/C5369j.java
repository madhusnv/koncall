package og;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.j */
/* loaded from: classes.dex */
public final class C5369j extends AbstractMap {

    /* renamed from: a */
    public transient C5367h f26548a;

    /* renamed from: b */
    public transient C5380u f26549b;

    /* renamed from: c */
    public final transient Map f26550c;

    /* renamed from: d */
    public final /* synthetic */ C5375p f26551d;

    public C5369j(C5375p c5375p, Map map) {
        this.f26551d = c5375p;
        this.f26550c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f26550c;
        C5375p c5375p = this.f26551d;
        if (map != c5375p.f26714c) {
            C5368i c5368i = new C5368i(this);
            while (c5368i.hasNext()) {
                c5368i.next();
                c5368i.remove();
            }
            return;
        }
        C5381v c5381v = c5375p.f26714c;
        Iterator it = c5381v.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        c5381v.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f26550c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C5367h c5367h = this.f26548a;
        if (c5367h != null) {
            return c5367h;
        }
        C5367h c5367h2 = new C5367h(this);
        this.f26548a = c5367h2;
        return c5367h2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f26550c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f26550c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C5375p c5375p = this.f26551d;
        c5375p.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C5370k(c5375p, obj, list, null) : new C5372m(c5375p, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f26550c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f26551d.m10788b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f26550c.remove(obj);
        if (collection == null) {
            return null;
        }
        this.f26551d.getClass();
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f26550c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f26550c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C5380u c5380u = this.f26549b;
        if (c5380u != null) {
            return c5380u;
        }
        C5380u c5380u2 = new C5380u(this);
        this.f26549b = c5380u2;
        return c5380u2;
    }
}
