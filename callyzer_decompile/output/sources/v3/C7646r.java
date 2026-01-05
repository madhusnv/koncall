package v3;

import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import sw.C6957a;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.r */
/* loaded from: classes.dex */
public final class C7646r implements List, InterfaceC2395a {

    /* renamed from: a */
    public final int f36974a;

    /* renamed from: b */
    public final int f36975b;

    /* renamed from: c */
    public final /* synthetic */ C7647s f36976c;

    public C7646r(C7647s c7647s, int i10, int i11) {
        this.f36976c = c7647s;
        this.f36974a = i10;
        this.f36975b = i11;
    }

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

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        Object objM5547e = this.f36976c.f36988a.m5547e(i10 + this.f36974a);
        AbstractC4154l.m8921d(objM5547e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC7878q) objM5547e;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC7878q)) {
            return -1;
        }
        AbstractC7878q abstractC7878q = (AbstractC7878q) obj;
        int i10 = this.f36974a;
        int i11 = this.f36975b;
        if (i10 <= i11) {
            int i12 = i10;
            while (!AbstractC4154l.m8918a(this.f36976c.f36988a.m5547e(i12), abstractC7878q)) {
                if (i12 != i11) {
                    i12++;
                }
            }
            return i12 - i10;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f36974a;
        return new C6957a(this.f36976c, i10, i10, this.f36975b);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC7878q)) {
            return -1;
        }
        AbstractC7878q abstractC7878q = (AbstractC7878q) obj;
        int i10 = this.f36975b;
        int i11 = this.f36974a;
        if (i11 <= i10) {
            while (!AbstractC4154l.m8918a(this.f36976c.f36988a.m5547e(i10), abstractC7878q)) {
                if (i10 != i11) {
                    i10--;
                }
            }
            return i10 - i11;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i10 = this.f36974a;
        return new C6957a(this.f36976c, i10, i10, this.f36975b);
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
        return this.f36975b - this.f36974a;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f36974a;
        return new C7646r(this.f36976c, i10 + i12, i12 + i11);
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
        int i11 = this.f36974a;
        int i12 = this.f36975b;
        return new C6957a(this.f36976c, i10 + i11, i11, i12);
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
