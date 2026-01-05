package yh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import pg.s7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yh.d */
/* loaded from: classes.dex */
public abstract class AbstractC8660d extends AbstractC8657a implements List, RandomAccess {

    /* renamed from: b */
    public static final C8658b f41962b = new C8658b(C8664h.f41970e, 0);

    /* renamed from: h */
    public static C8664h m16000h(int i10, Object[] objArr) {
        return i10 == 0 ? C8664h.f41970e : new C8664h(i10, objArr);
    }

    @Override // yh.AbstractC8657a
    /* renamed from: a */
    public int mo15993a(Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = get(i10);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // yh.AbstractC8657a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = list.iterator();
                        for (Object obj2 : this) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (obj2 != next && (obj2 == null || !obj2.equals(next))) {
                                    return false;
                                }
                            }
                        }
                        return !it.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj3 = get(i10);
                        Object obj4 = list.get(i10);
                        if (obj3 != obj4 && (obj3 == null || !obj3.equals(obj4))) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C8658b listIterator(int i10) {
        s7.m11860c(i10, size());
        return isEmpty() ? f41962b : new C8658b(this, i10);
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC8660d subList(int i10, int i11) {
        s7.m11861d(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? C8664h.f41970e : new C8659c(this, i10, i12);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
