package og;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.u */
/* loaded from: classes.dex */
public final class C5380u extends AbstractCollection {

    /* renamed from: a */
    public final /* synthetic */ int f26819a = 1;

    /* renamed from: b */
    public final AbstractMap f26820b;

    public C5380u(C5369j c5369j) {
        this.f26820b = c5369j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f26819a) {
            case 0:
                ((C5381v) this.f26820b).clear();
                break;
            default:
                ((C5369j) this.f26820b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f26819a) {
            case 1:
                return ((C5369j) this.f26820b).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f26819a) {
            case 1:
                return ((C5369j) this.f26820b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f26819a) {
            case 0:
                C5381v c5381v = (C5381v) this.f26820b;
                Map mapM11001h = c5381v.m11001h();
                return mapM11001h != null ? mapM11001h.values().iterator() : new C5376q(c5381v, 2);
            default:
                return new c0(((C5369j) this.f26820b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f26819a) {
            case 1:
                C5369j c5369j = (C5369j) this.f26820b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : c5369j.entrySet()) {
                        if (pa.m10818e(obj, entry.getValue())) {
                            c5369j.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f26819a) {
            case 1:
                C5369j c5369j = (C5369j) this.f26820b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : c5369j.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c5369j.f26551d.m10788b().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f26819a) {
            case 1:
                C5369j c5369j = (C5369j) this.f26820b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : c5369j.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c5369j.f26551d.m10788b().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f26819a) {
            case 0:
                return ((C5381v) this.f26820b).size();
            default:
                return ((C5369j) this.f26820b).f26550c.size();
        }
    }

    public C5380u(C5381v c5381v) {
        this.f26820b = c5381v;
    }
}
