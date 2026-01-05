package ky;

import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ky.e */
/* loaded from: classes3.dex */
public final class C4273e extends AbstractC4281m implements List<AbstractC4281m>, InterfaceC2395a {
    public static final C4272d Companion = new C4272d();

    /* renamed from: a */
    public final List f21670a;

    public C4273e(List content) {
        AbstractC4154l.m8923f(content, "content");
        this.f21670a = content;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, AbstractC4281m abstractC4281m) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends AbstractC4281m> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof AbstractC4281m)) {
            return false;
        }
        return this.f21670a.contains((AbstractC4281m) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f21670a.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return AbstractC4154l.m8918a(this.f21670a, obj);
    }

    @Override // java.util.List
    public final AbstractC4281m get(int i10) {
        return (AbstractC4281m) this.f21670a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f21670a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC4281m)) {
            return -1;
        }
        return this.f21670a.indexOf((AbstractC4281m) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21670a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f21670a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC4281m)) {
            return -1;
        }
        return this.f21670a.lastIndexOf((AbstractC4281m) obj);
    }

    @Override // java.util.List
    public final ListIterator<AbstractC4281m> listIterator() {
        return this.f21670a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC4281m remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<AbstractC4281m> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ AbstractC4281m set(int i10, AbstractC4281m abstractC4281m) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21670a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super AbstractC4281m> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<AbstractC4281m> subList(int i10, int i11) {
        return this.f21670a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    public final String toString() {
        return AbstractC6663m.m12748L(this.f21670a, ",", "[", "]", null, 56);
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
    public final ListIterator<AbstractC4281m> listIterator(int i10) {
        return this.f21670a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        return AbstractC4153k.m8917b(this, array);
    }
}
