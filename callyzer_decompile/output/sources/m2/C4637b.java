package m2;

import fx.InterfaceC2397c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m2.b */
/* loaded from: classes.dex */
public final class C4637b implements List, InterfaceC2397c {

    /* renamed from: a */
    public final C4640e f22878a;

    public C4637b(C4640e c4640e) {
        this.f22878a = c4640e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f22878a.m9506b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        C4640e c4640e = this.f22878a;
        return c4640e.m9509e(c4640e.f22886c, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f22878a.m9511h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22878a.m9512j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C4640e c4640e = this.f22878a;
        c4640e.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c4640e.m9512j(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC4641f.m9519a(this, i10);
        return this.f22878a.f22884a[i10];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f22878a.m9513k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f22878a.f22886c == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C4639d(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C4640e c4640e = this.f22878a;
        Object[] objArr = c4640e.f22884a;
        for (int i10 = c4640e.f22886c - 1; i10 >= 0; i10--) {
            if (AbstractC4154l.m8918a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C4639d(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f22878a.m9514l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C4640e c4640e = this.f22878a;
        c4640e.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = c4640e.f22886c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c4640e.m9514l(it.next());
        }
        return i10 != c4640e.f22886c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C4640e c4640e = this.f22878a;
        int i10 = c4640e.f22886c;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(c4640e.f22884a[i11])) {
                c4640e.m9515m(i11);
            }
        }
        return i10 != c4640e.f22886c;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        AbstractC4641f.m9519a(this, i10);
        Object[] objArr = this.f22878a.f22884a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f22878a.f22886c;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        AbstractC4641f.m9520b(this, i10, i11);
        return new C4638c(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        this.f22878a.m9505a(i10, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C4639d(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        AbstractC4641f.m9519a(this, i10);
        return this.f22878a.m9515m(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4153k.m8917b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return this.f22878a.m9509e(i10, collection);
    }
}
