package mg;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC4741t {

    /* renamed from: g */
    public static final a0 f23624g;

    /* renamed from: f */
    public final transient AbstractC4735n f23625f;

    static {
        C4731j c4731j = AbstractC4735n.f23678b;
        f23624g = new a0(C4746y.f23712e, C4744w.f23706b);
    }

    public a0(AbstractC4735n abstractC4735n, Comparator comparator) {
        super(comparator);
        this.f23625f = abstractC4735n;
    }

    @Override // mg.AbstractC4730i
    /* renamed from: a */
    public final int mo9588a(Object[] objArr) {
        return this.f23625f.mo9588a(objArr);
    }

    @Override // mg.AbstractC4730i
    /* renamed from: b */
    public final int mo9589b() {
        return this.f23625f.mo9589b();
    }

    @Override // mg.AbstractC4730i
    /* renamed from: c */
    public final int mo9590c() {
        return this.f23625f.mo9590c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM9595u = m9595u(obj, true);
        AbstractC4735n abstractC4735n = this.f23625f;
        if (iM9595u == abstractC4735n.size()) {
            return null;
        }
        return abstractC4735n.get(iM9595u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f23625f, obj, this.f23696d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC4743v) {
            collection = ((InterfaceC4743v) collection).zza();
        }
        Comparator comparator = this.f23696d;
        if (!AbstractC4723b.m9607i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C4731j c4731jListIterator = this.f23625f.listIterator(0);
        Iterator it = collection.iterator();
        if (c4731jListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = c4731jListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!c4731jListIterator.hasNext()) {
                            break;
                        }
                        next2 = c4731jListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f23625f.mo9623h().listIterator(0);
    }

    @Override // mg.AbstractC4730i
    /* renamed from: e */
    public final e0 mo9591e() {
        return this.f23625f.listIterator(0);
    }

    @Override // mg.AbstractC4737p, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            AbstractC4735n abstractC4735n = this.f23625f;
            if (abstractC4735n.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f23696d;
                if (!AbstractC4723b.m9607i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    C4731j c4731jListIterator = abstractC4735n.listIterator(0);
                    while (c4731jListIterator.hasNext()) {
                        Object next = c4731jListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // mg.AbstractC4741t, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f23625f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM9594t = m9594t(obj, true) - 1;
        if (iM9594t == -1) {
            return null;
        }
        return this.f23625f.get(iM9594t);
    }

    @Override // mg.AbstractC4730i
    /* renamed from: g */
    public final Object[] mo9592g() {
        return this.f23625f.mo9592g();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM9595u = m9595u(obj, false);
        AbstractC4735n abstractC4735n = this.f23625f;
        if (iM9595u == abstractC4735n.size()) {
            return null;
        }
        return abstractC4735n.get(iM9595u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f23625f.listIterator(0);
    }

    @Override // mg.AbstractC4737p
    /* renamed from: k */
    public final AbstractC4735n mo9593k() {
        return this.f23625f;
    }

    @Override // mg.AbstractC4741t, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f23625f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM9594t = m9594t(obj, false) - 1;
        if (iM9594t == -1) {
            return null;
        }
        return this.f23625f.get(iM9594t);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f23625f.size();
    }

    /* renamed from: t */
    public final int m9594t(Object obj, boolean z6) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f23625f, obj, this.f23696d);
        return iBinarySearch >= 0 ? z6 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    /* renamed from: u */
    public final int m9595u(Object obj, boolean z6) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f23625f, obj, this.f23696d);
        return iBinarySearch >= 0 ? z6 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    /* renamed from: v */
    public final a0 m9596v(int i10, int i11) {
        AbstractC4735n abstractC4735n = this.f23625f;
        if (i10 == 0) {
            if (i11 == abstractC4735n.size()) {
                return this;
            }
            i10 = 0;
        }
        Comparator comparator = this.f23696d;
        return i10 < i11 ? new a0(abstractC4735n.subList(i10, i11), comparator) : AbstractC4741t.m9641s(comparator);
    }
}
