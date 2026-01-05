package e1;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.d */
/* loaded from: classes.dex */
public final class C1902d implements Collection {

    /* renamed from: a */
    public final /* synthetic */ C1903e f8946a;

    public C1902d(C1903e c1903e) {
        this.f8946a = c1903e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8946a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8946a.m5629b(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8946a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1899a(this.f8946a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1903e c1903e = this.f8946a;
        int iM5629b = c1903e.m5629b(obj);
        if (iM5629b < 0) {
            return false;
        }
        c1903e.m5635l(iM5629b);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1903e c1903e = this.f8946a;
        int i10 = c1903e.f9065c;
        int i11 = 0;
        boolean z6 = false;
        while (i11 < i10) {
            if (collection.contains(c1903e.m5637o(i11))) {
                c1903e.m5635l(i11);
                i11--;
                i10--;
                z6 = true;
            }
            i11++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C1903e c1903e = this.f8946a;
        int i10 = c1903e.f9065c;
        int i11 = 0;
        boolean z6 = false;
        while (i11 < i10) {
            if (!collection.contains(c1903e.m5637o(i11))) {
                c1903e.m5635l(i11);
                i11--;
                i10--;
                z6 = true;
            }
            i11++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8946a.f9065c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1903e c1903e = this.f8946a;
        int i10 = c1903e.f9065c;
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c1903e.m5637o(i11);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1903e c1903e = this.f8946a;
        int i10 = c1903e.f9065c;
        if (objArr.length < i10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i10);
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = c1903e.m5637o(i11);
        }
        if (objArr.length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
