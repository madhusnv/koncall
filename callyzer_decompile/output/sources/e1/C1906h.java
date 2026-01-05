package e1;

import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import og.h1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.h */
/* loaded from: classes.dex */
public final class C1906h implements Set, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f8988a;

    /* renamed from: b */
    public final j0 f8989b;

    public C1906h(j0 parent, int i10) {
        this.f8988a = i10;
        switch (i10) {
            case 1:
                AbstractC4154l.m8923f(parent, "parent");
                this.f8989b = parent;
                break;
            default:
                AbstractC4154l.m8923f(parent, "parent");
                this.f8989b = parent;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f8988a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f8988a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f8988a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f8988a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC4154l.m8918a(this.f8989b.m5574g(entry.getKey()), entry.getValue());
            default:
                return this.f8989b.m5570c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f8988a) {
            case 0:
                AbstractC4154l.m8923f(elements, "elements");
                Collection<Map.Entry> collection = elements;
                if (!collection.isEmpty()) {
                    for (Map.Entry entry : collection) {
                        if (!AbstractC4154l.m8918a(this.f8989b.m5574g(entry.getKey()), entry.getValue())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                AbstractC4154l.m8923f(elements, "elements");
                Collection collection2 = elements;
                if (!collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!this.f8989b.m5570c(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f8988a) {
        }
        return this.f8989b.m5576i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8988a) {
            case 0:
                return h1.m10679a(new C1905g(this, null, 0));
            default:
                return h1.m10679a(new C1905g(this, null, 1));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f8988a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f8988a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f8988a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f8988a) {
        }
        return this.f8989b.f9002e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f8988a) {
        }
        return AbstractC4153k.m8916a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f8988a) {
            case 0:
                AbstractC4154l.m8923f(array, "array");
                break;
            default:
                AbstractC4154l.m8923f(array, "array");
                break;
        }
        return AbstractC4153k.m8917b(this, array);
    }
}
