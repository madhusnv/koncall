package e1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C1900b implements Set {

    /* renamed from: a */
    public final /* synthetic */ C1903e f8930a;

    public C1900b(C1903e c1903e) {
        this.f8930a = c1903e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f8930a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8930a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f8930a.m5540p(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C1903e c1903e = this.f8930a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (c1903e.f9065c == set.size()) {
                return c1903e.m5540p(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C1903e c1903e = this.f8930a;
        int iHashCode = 0;
        for (int i10 = c1903e.f9065c - 1; i10 >= 0; i10--) {
            Object objM5634j = c1903e.m5634j(i10);
            iHashCode += objM5634j == null ? 0 : objM5634j.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f8930a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1899a(this.f8930a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C1903e c1903e = this.f8930a;
        int iM5632h = c1903e.m5632h(obj);
        if (iM5632h < 0) {
            return false;
        }
        c1903e.m5635l(iM5632h);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f8930a.m5541q(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f8930a.m5542r(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f8930a.f9065c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C1903e c1903e = this.f8930a;
        int i10 = c1903e.f9065c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c1903e.m5634j(i11);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1903e c1903e = this.f8930a;
        int i10 = c1903e.f9065c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c1903e.m5634j(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
