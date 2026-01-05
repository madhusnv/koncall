package mg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mg.n */
/* loaded from: classes.dex */
public abstract class AbstractC4735n extends AbstractC4730i implements List, RandomAccess {

    /* renamed from: b */
    public static final C4731j f23678b = new C4731j(C4746y.f23712e, 0);

    /* renamed from: k */
    public static C4746y m9626k(int i10, Object[] objArr) {
        return i10 == 0 ? C4746y.f23712e : new C4746y(i10, objArr);
    }

    /* renamed from: m */
    public static C4746y m9627m(Object[] objArr) {
        if (objArr.length == 0) {
            return C4746y.f23712e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr2[i10] == null) {
                throw new NullPointerException(AbstractC4801l.m9730d(i10, "at index "));
            }
        }
        return m9626k(length, objArr2);
    }

    @Override // mg.AbstractC4730i
    /* renamed from: a */
    public int mo9588a(Object[] objArr) {
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
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: e */
    public final e0 mo9591e() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (AbstractC4723b.m9606h(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                C4731j c4731jListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (c4731jListIterator.hasNext()) {
                        if (!it.hasNext() || !AbstractC4723b.m9606h(c4731jListIterator.next(), it.next())) {
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

    /* renamed from: h */
    public AbstractC4735n mo9623h() {
        return size() <= 1 ? this : new C4733l(this);
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

    public int indexOf(Object obj) {
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
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC4735n subList(int i10, int i11) {
        AbstractC4723b.m9611m(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? C4746y.f23712e : new C4734m(this, i10, i12);
    }

    public int lastIndexOf(Object obj) {
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
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final C4731j listIterator(int i10) {
        int size = size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(AbstractC4723b.m9612n(i10, size, "index"));
        }
        return isEmpty() ? f23678b : new C4731j(this, i10);
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
