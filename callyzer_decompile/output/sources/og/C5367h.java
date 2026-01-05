package og;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: og.h */
/* loaded from: classes.dex */
public final class C5367h extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ int f26484a = 0;

    /* renamed from: b */
    public final Map f26485b;

    public C5367h(C5369j c5369j) {
        this.f26485b = c5369j;
    }

    /* renamed from: a */
    public final boolean m10677a(Collection collection) {
        return ua.m10957e(this, collection);
    }

    /* renamed from: b */
    public final boolean m10678b(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f26484a) {
            case 0:
                ((C5369j) this.f26485b).clear();
                break;
            default:
                Iterator it = iterator();
                while (true) {
                    com.google.android.gms.internal.mlkit_vision_barcode_bundled.c2 c2Var = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.c2) it;
                    if (!c2Var.hasNext()) {
                        break;
                    } else {
                        c2Var.next();
                        c2Var.remove();
                    }
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f26484a) {
            case 0:
                Set setEntrySet = ((C5369j) this.f26485b).f26550c.entrySet();
                setEntrySet.getClass();
                try {
                    return setEntrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return this.f26485b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f26484a) {
            case 1:
                return this.f26485b.keySet().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        switch (this.f26484a) {
            case 1:
                return this == obj || this.f26485b.keySet().equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f26484a) {
            case 1:
                return this.f26485b.keySet().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f26484a) {
            case 0:
                return ((C5369j) this.f26485b).isEmpty();
            default:
                return this.f26485b.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f26484a) {
            case 0:
                return new C5368i((C5369j) this.f26485b);
            default:
                return new com.google.android.gms.internal.mlkit_vision_barcode_bundled.c2(this, this.f26485b.entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        switch (this.f26484a) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                C5369j c5369j = (C5369j) this.f26485b;
                try {
                    objRemove = c5369j.f26551d.f26714c.remove(entry.getKey());
                } catch (ClassCastException | NullPointerException unused) {
                    objRemove = null;
                }
                Collection collection = (Collection) objRemove;
                if (collection != null) {
                    collection.size();
                    collection.clear();
                }
                return true;
            default:
                Collection collection2 = (Collection) this.f26485b.remove(obj);
                if (collection2 != null) {
                    int size = collection2.size();
                    collection2.clear();
                    if (size > 0) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.f26484a) {
            case 0:
                try {
                    if (collection != null) {
                        return ua.m10957e(this, collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    Iterator it = collection.iterator();
                    boolean zRemove = false;
                    while (it.hasNext()) {
                        zRemove |= remove(it.next());
                    }
                    return zRemove;
                }
            default:
                return m10677a(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        int iCeil;
        switch (this.f26484a) {
            case 0:
                try {
                    if (collection != null) {
                        return m10678b(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    int size = collection.size();
                    if (size >= 3) {
                        iCeil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
                    } else {
                        if (size < 0) {
                            throw new IllegalArgumentException(AbstractC4801l.m9730d(size, "expectedSize cannot be negative but was: "));
                        }
                        iCeil = size + 1;
                    }
                    HashSet hashSet = new HashSet(iCeil);
                    for (Object obj : collection) {
                        if (contains(obj) && (obj instanceof Map.Entry)) {
                            hashSet.add(((Map.Entry) obj).getKey());
                        }
                    }
                    return ((C5367h) ((C5369j) this.f26485b).f26551d.m10788b()).retainAll(hashSet);
                }
            default:
                return m10678b(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f26484a) {
            case 0:
                return ((C5369j) this.f26485b).f26550c.size();
            default:
                return this.f26485b.size();
        }
    }

    public C5367h(C5375p c5375p, Map map) {
        this.f26485b = map;
    }
}
