package u2;

import fx.InterfaceC2397c;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k2.j1;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4166x;
import o2.AbstractC5269b;
import o2.C5273f;
import pg.w9;
import rw.AbstractC6672v;
import rw.C6675y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 implements List, InterfaceC2397c {

    /* renamed from: a */
    public final C7320q f34843a;

    /* renamed from: b */
    public final int f34844b;

    /* renamed from: c */
    public int f34845c;

    /* renamed from: d */
    public int f34846d;

    public b0(C7320q c7320q, int i10, int i11) {
        this.f34843a = c7320q;
        this.f34844b = i10;
        this.f34845c = c7320q.m13702s();
        this.f34846d = i11 - i10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m13639b();
        int i10 = this.f34844b + this.f34846d;
        C7320q c7320q = this.f34843a;
        c7320q.add(i10, obj);
        this.f34846d++;
        this.f34845c = c7320q.m13702s();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f34846d, collection);
    }

    /* renamed from: b */
    public final void m13639b() {
        if (this.f34843a.m13702s() != this.f34845c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i10;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        if (this.f34846d > 0) {
            m13639b();
            C7320q c7320q = this.f34843a;
            int i11 = this.f34844b;
            int i12 = this.f34846d + i11;
            do {
                synchronized (AbstractC7321r.f34905a) {
                    C7319p c7319p = c7320q.f34904a;
                    AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                    i10 = c7319p2.f34902d;
                    abstractC5269b = c7319p2.f34901c;
                }
                AbstractC4154l.m8920c(abstractC5269b);
                C5273f c5273fMo10379r = abstractC5269b.mo10379r();
                c5273fMo10379r.subList(i11, i12).clear();
                AbstractC5269b abstractC5269bM10413j = c5273fMo10379r.m10413j();
                if (AbstractC4154l.m8918a(abstractC5269bM10413j, abstractC5269b)) {
                    break;
                }
                C7319p c7319p3 = c7320q.f34904a;
                AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (AbstractC7316m.f34890b) {
                    abstractC7311hM13686k = AbstractC7316m.m13686k();
                    zM13700q = C7320q.m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, c7320q, abstractC7311hM13686k), i10, abstractC5269bM10413j, true);
                }
                AbstractC7316m.m13689n(abstractC7311hM13686k, c7320q);
            } while (!zM13700q);
            this.f34846d = 0;
            this.f34845c = this.f34843a.m13702s();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    @Override // java.util.List
    public final Object get(int i10) {
        m13639b();
        AbstractC7321r.m13704a(i10, this.f34846d);
        return this.f34843a.get(this.f34844b + i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m13639b();
        int i10 = this.f34846d;
        int i11 = this.f34844b;
        Iterator it = w9.m11919j(i11, i10 + i11).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC6672v) it).nextInt();
            if (AbstractC4154l.m8918a(obj, this.f34843a.get(iNextInt))) {
                return iNextInt - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f34846d == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m13639b();
        int i10 = this.f34846d;
        int i11 = this.f34844b;
        for (int i12 = (i10 + i11) - 1; i12 >= i11; i12--) {
            if (AbstractC4154l.m8918a(obj, this.f34843a.get(i12))) {
                return i12 - i11;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z6 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z6) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i10;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        m13639b();
        C7320q c7320q = this.f34843a;
        int i11 = this.f34844b;
        int i12 = this.f34846d + i11;
        int size = c7320q.size();
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = c7320q.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i10 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            C5273f c5273fMo10379r = abstractC5269b.mo10379r();
            c5273fMo10379r.subList(i11, i12).retainAll(collection);
            AbstractC5269b abstractC5269bM10413j = c5273fMo10379r.m10413j();
            if (AbstractC4154l.m8918a(abstractC5269bM10413j, abstractC5269b)) {
                break;
            }
            C7319p c7319p3 = c7320q.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = C7320q.m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, c7320q, abstractC7311hM13686k), i10, abstractC5269bM10413j, true);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, c7320q);
        } while (!zM13700q);
        int size2 = size - c7320q.size();
        if (size2 > 0) {
            this.f34845c = this.f34843a.m13702s();
            this.f34846d -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        AbstractC7321r.m13704a(i10, this.f34846d);
        m13639b();
        int i11 = i10 + this.f34844b;
        C7320q c7320q = this.f34843a;
        Object obj2 = c7320q.set(i11, obj);
        this.f34845c = c7320q.m13702s();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f34846d;
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= this.f34846d)) {
            j1.m8542a("fromIndex or toIndex are out of bounds");
        }
        m13639b();
        int i12 = this.f34844b;
        return new b0(this.f34843a, i10 + i12, i11 + i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        m13639b();
        C4166x c4166x = new C4166x();
        c4166x.f21162a = i10 - 1;
        return new C6675y(c4166x, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4153k.m8917b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m13639b();
        int i11 = i10 + this.f34844b;
        C7320q c7320q = this.f34843a;
        boolean zAddAll = c7320q.addAll(i11, collection);
        if (zAddAll) {
            this.f34846d = collection.size() + this.f34846d;
            this.f34845c = c7320q.m13702s();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        m13639b();
        int i11 = this.f34844b + i10;
        C7320q c7320q = this.f34843a;
        Object objRemove = c7320q.remove(i11);
        this.f34846d--;
        this.f34845c = c7320q.m13702s();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        m13639b();
        int i11 = this.f34844b + i10;
        C7320q c7320q = this.f34843a;
        c7320q.add(i11, obj);
        this.f34846d++;
        this.f34845c = c7320q.m13702s();
    }
}
