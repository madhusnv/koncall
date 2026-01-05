package pg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import og.tb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ra extends l9 implements List, RandomAccess {

    /* renamed from: b */
    public static final pa f29050b = new pa(ta.f29070e, 0);

    @Override // pg.l9
    /* renamed from: a */
    public int mo11769a(Object[] objArr) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj2 = get(i10);
                        Object obj3 = list.get(i10);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                pa paVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (paVarListIterator.hasNext()) {
                        if (!it.hasNext() || ((next = paVarListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ra subList(int i10, int i11) {
        tb.m10930c(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? ta.f29070e : new qa(this, i10, i12);
    }

    @Override // java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final pa listIterator(int i10) {
        int size = size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(tb.m10931d(i10, size, "index"));
        }
        return isEmpty() ? f29050b : new pa(this, i10);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
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
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
