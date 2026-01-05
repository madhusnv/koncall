package p001o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class lo0 implements Collection, sb9 {

    /* renamed from: a */
    public final Object[] f34160a;

    /* renamed from: b */
    public final boolean f34161b;

    public lo0(Object[] objArr, boolean z) {
        sq8.m48649h(objArr, "values");
        this.f34160a = objArr;
        this.f34161b = z;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return gp0.m29251R(this.f34160a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public int m37557d() {
        return this.f34160a.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f34160a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return qo0.m45707a(this.f34160a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m37557d();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return bh3.m18960b(this.f34160a, this.f34161b);
    }
}
