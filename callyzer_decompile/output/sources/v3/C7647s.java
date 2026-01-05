package v3;

import e1.C1924z;
import f1.AbstractC2176a;
import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import rw.AbstractC6662l;
import sw.C6957a;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.s */
/* loaded from: classes.dex */
public final class C7647s implements List, InterfaceC2395a {

    /* renamed from: a */
    public final e1.e0 f36988a = new e1.e0(16);

    /* renamed from: b */
    public final C1924z f36989b = new C1924z(16);

    /* renamed from: c */
    public int f36990c = -1;

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        f1.AbstractC2176a.m5863d("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        throw null;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m14658b() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = v3.AbstractC7634f.m14540a(r0, r1, r1)
            int r2 = r7.f36990c
            int r2 = r2 + 1
            int r3 = og.pe.m10832g(r7)
            if (r2 > r3) goto L44
        L11:
            e1.z r4 = r7.f36989b
            if (r2 < 0) goto L3a
            int r5 = r4.f9092b
            if (r2 >= r5) goto L3d
            long[] r4 = r4.f9091a
            r5 = r4[r2]
            int r4 = v3.AbstractC7634f.m14547h(r5, r0)
            if (r4 >= 0) goto L24
            r0 = r5
        L24:
            float r4 = v3.AbstractC7634f.m14551l(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L34
            boolean r4 = v3.AbstractC7634f.m14556q(r0)
            if (r4 == 0) goto L34
            goto L39
        L34:
            if (r2 == r3) goto L39
            int r2 = r2 + 1
            goto L11
        L39:
            return r0
        L3a:
            r4.getClass()
        L3d:
            java.lang.String r0 = "Index must be between 0 and size"
            f1.AbstractC2176a.m5863d(r0)
            r0 = 0
            throw r0
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.C7647s.m14658b():long");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f36990c = -1;
        this.f36988a.m5545c();
        this.f36989b.f9092b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC7878q) && indexOf((AbstractC7878q) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC7878q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object objM5547e = this.f36988a.m5547e(i10);
        AbstractC4154l.m8921d(objM5547e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC7878q) objM5547e;
    }

    /* renamed from: h */
    public final void m14659h(int i10, int i11) {
        if (i10 >= i11) {
            return;
        }
        this.f36988a.m5553k(i10, i11);
        C1924z c1924z = this.f36989b;
        if (i10 >= 0) {
            int i12 = c1924z.f9092b;
            if (i10 <= i12 && i11 >= 0 && i11 <= i12) {
                if (i11 < i10) {
                    AbstractC2176a.m5862c("The end index must be < start index");
                    throw null;
                }
                if (i11 != i10) {
                    if (i11 < i12) {
                        long[] jArr = c1924z.f9091a;
                        AbstractC6662l.m12718h(i10, jArr, i11, jArr, i12);
                    }
                    c1924z.f9092b -= i11 - i10;
                    return;
                }
                return;
            }
        } else {
            c1924z.getClass();
        }
        AbstractC2176a.m5863d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC7878q)) {
            return -1;
        }
        AbstractC7878q abstractC7878q = (AbstractC7878q) obj;
        int iM10832g = pe.m10832g(this);
        if (iM10832g >= 0) {
            int i10 = 0;
            while (!AbstractC4154l.m8918a(this.f36988a.m5547e(i10), abstractC7878q)) {
                if (i10 != iM10832g) {
                    i10++;
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f36988a.m5549g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C6957a(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC7878q)) {
            return -1;
        }
        AbstractC7878q abstractC7878q = (AbstractC7878q) obj;
        for (int iM10832g = pe.m10832g(this); -1 < iM10832g; iM10832g--) {
            if (AbstractC4154l.m8918a(this.f36988a.m5547e(iM10832g), abstractC7878q)) {
                return iM10832g;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C6957a(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f36988a.f8957b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return new C7646r(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new C6957a(this, i10, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4153k.m8917b(this, objArr);
    }
}
