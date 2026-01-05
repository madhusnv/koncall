package u2;

import androidx.fragment.app.C0351p;
import b3.C0583o;
import ex.InterfaceC2139c;
import fx.InterfaceC2397c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k2.j1;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import o2.AbstractC5269b;
import o2.C5273f;
import o2.C5276i;
import sw.C6957a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.q */
/* loaded from: classes.dex */
public final class C7320q implements InterfaceC7328y, List, RandomAccess, InterfaceC2397c {

    /* renamed from: a */
    public C7319p f34904a;

    public C7320q() {
        AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
        long jMo13652g = abstractC7311hM13686k.mo13652g();
        C5276i c5276i = C5276i.f25924b;
        C7319p c7319p = new C7319p(jMo13652g, c5276i);
        if (!(abstractC7311hM13686k instanceof C7306c)) {
            c7319p.f34839b = new C7319p(1, c5276i);
        }
        this.f34904a = c7319p;
    }

    /* renamed from: q */
    public static boolean m13700q(C7319p c7319p, int i10, AbstractC5269b abstractC5269b, boolean z6) {
        boolean z10;
        synchronized (AbstractC7321r.f34905a) {
            try {
                int i11 = c7319p.f34902d;
                if (i11 == i10) {
                    c7319p.f34901c = abstractC5269b;
                    z10 = true;
                    if (z6) {
                        c7319p.f34903e++;
                    }
                    c7319p.f34902d = i11 + 1;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i10;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = this.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i10 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            AbstractC5269b abstractC5269bMo10377j = abstractC5269b.mo10377j(obj);
            if (abstractC5269bMo10377j.equals(abstractC5269b)) {
                return false;
            }
            C7319p c7319p3 = this.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, this, abstractC7311hM13686k), i10, abstractC5269bMo10377j, true);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13700q);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        return m13703t(new C0583o(i10, collection));
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: b */
    public final a0 mo8488b() {
        return this.f34904a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC7311h abstractC7311hM13686k;
        C7319p c7319p = this.f34904a;
        AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (AbstractC7316m.f34890b) {
            abstractC7311hM13686k = AbstractC7316m.m13686k();
            C7319p c7319p2 = (C7319p) AbstractC7316m.m13698w(c7319p, this, abstractC7311hM13686k);
            synchronized (AbstractC7321r.f34905a) {
                c7319p2.f34901c = C5276i.f25924b;
                c7319p2.f34902d++;
                c7319p2.f34903e++;
            }
        }
        AbstractC7316m.m13689n(abstractC7311hM13686k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return m13701r().f34901c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return m13701r().f34901c.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return m13701r().f34901c.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return m13701r().f34901c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return m13701r().f34901c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: j */
    public final void mo8493j(a0 a0Var) {
        a0Var.f34839b = this.f34904a;
        this.f34904a = (C7319p) a0Var;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return m13701r().f34901c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C6957a(this, 0);
    }

    /* renamed from: r */
    public final C7319p m13701r() {
        C7319p c7319p = this.f34904a;
        AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C7319p) AbstractC7316m.m13695t(c7319p, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        int i11;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        Object obj = get(i10);
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = this.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i11 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            AbstractC5269b abstractC5269bMo10381t = abstractC5269b.mo10381t(i10);
            if (abstractC5269bMo10381t.equals(abstractC5269b)) {
                break;
            }
            C7319p c7319p3 = this.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, this, abstractC7311hM13686k), i11, abstractC5269bMo10381t, true);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13700q);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i10;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = this.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i10 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            AbstractC5269b abstractC5269bMo10380s = abstractC5269b.mo10380s(new C0351p(1, collection));
            if (AbstractC4154l.m8918a(abstractC5269bMo10380s, abstractC5269b)) {
                return false;
            }
            C7319p c7319p3 = this.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, this, abstractC7311hM13686k), i10, abstractC5269bMo10380s, true);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13700q);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return m13703t(new C0351p(3, collection));
    }

    /* renamed from: s */
    public final int m13702s() {
        C7319p c7319p = this.f34904a;
        AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C7319p) AbstractC7316m.m13684i(c7319p)).f34903e;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        int i11;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        Object obj2 = get(i10);
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = this.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i11 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            AbstractC5269b abstractC5269bMo10382u = abstractC5269b.mo10382u(i10, obj);
            if (abstractC5269bMo10382u.equals(abstractC5269b)) {
                break;
            }
            C7319p c7319p3 = this.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, this, abstractC7311hM13686k), i11, abstractC5269bMo10382u, false);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13700q);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return m13701r().f34901c.mo1628b();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            j1.m8542a("fromIndex or toIndex are out of bounds");
        }
        return new b0(this, i10, i11);
    }

    /* renamed from: t */
    public final boolean m13703t(InterfaceC2139c interfaceC2139c) {
        int i10;
        AbstractC5269b abstractC5269b;
        Object objInvoke;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = this.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i10 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            C5273f c5273fMo10379r = abstractC5269b.mo10379r();
            objInvoke = interfaceC2139c.invoke(c5273fMo10379r);
            AbstractC5269b abstractC5269bM10413j = c5273fMo10379r.m10413j();
            if (AbstractC4154l.m8918a(abstractC5269bM10413j, abstractC5269b)) {
                break;
            }
            C7319p c7319p3 = this.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, this, abstractC7311hM13686k), i10, abstractC5269bM10413j, true);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13700q);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    public final String toString() {
        C7319p c7319p = this.f34904a;
        AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C7319p) AbstractC7316m.m13684i(c7319p)).f34901c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i10;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = this.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i10 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            AbstractC5269b abstractC5269bMo10378q = abstractC5269b.mo10378q(collection);
            if (AbstractC4154l.m8918a(abstractC5269bMo10378q, abstractC5269b)) {
                return false;
            }
            C7319p c7319p3 = this.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, this, abstractC7311hM13686k), i10, abstractC5269bMo10378q, true);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13700q);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C6957a(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4153k.m8917b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = this.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i11 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            AbstractC5269b abstractC5269bMo10376h = abstractC5269b.mo10376h(i10, obj);
            if (abstractC5269bMo10376h.equals(abstractC5269b)) {
                return;
            }
            C7319p c7319p3 = this.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, this, abstractC7311hM13686k), i11, abstractC5269bMo10376h, true);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13700q);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i10;
        AbstractC5269b abstractC5269b;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13700q;
        do {
            synchronized (AbstractC7321r.f34905a) {
                C7319p c7319p = this.f34904a;
                AbstractC4154l.m8921d(c7319p, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C7319p c7319p2 = (C7319p) AbstractC7316m.m13684i(c7319p);
                i10 = c7319p2.f34902d;
                abstractC5269b = c7319p2.f34901c;
            }
            AbstractC4154l.m8920c(abstractC5269b);
            int iIndexOf = abstractC5269b.indexOf(obj);
            AbstractC5269b abstractC5269bMo10381t = iIndexOf != -1 ? abstractC5269b.mo10381t(iIndexOf) : abstractC5269b;
            if (abstractC5269bMo10381t.equals(abstractC5269b)) {
                return false;
            }
            C7319p c7319p3 = this.f34904a;
            AbstractC4154l.m8921d(c7319p3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13700q = m13700q((C7319p) AbstractC7316m.m13698w(c7319p3, this, abstractC7311hM13686k), i10, abstractC5269bMo10381t, true);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13700q);
        return true;
    }
}
