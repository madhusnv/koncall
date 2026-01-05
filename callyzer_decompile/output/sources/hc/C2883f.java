package hc;

import fx.InterfaceC2395a;
import java.util.ArrayList;
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
/* renamed from: hc.f */
/* loaded from: classes.dex */
public final class C2883f extends AbstractC2887j implements List, InterfaceC2395a {

    /* renamed from: a */
    public final ArrayList f15910a;

    public C2883f(ArrayList arrayList) {
        this.f15910a = arrayList;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof AbstractC2887j) {
            return this.f15910a.contains((AbstractC2887j) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        return this.f15910a.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2883f) && this.f15910a.equals(((C2883f) obj).f15910a);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return (AbstractC2887j) this.f15910a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f15910a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof AbstractC2887j) {
            return this.f15910a.indexOf((AbstractC2887j) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f15910a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f15910a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof AbstractC2887j) {
            return this.f15910a.lastIndexOf((AbstractC2887j) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f15910a.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
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
        return this.f15910a.size();
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        return this.f15910a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    public final String toString() {
        return AbstractC6663m.m12748L(this.f15910a, ",", "[", "]", null, 56);
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
        return this.f15910a.listIterator(i10);
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
