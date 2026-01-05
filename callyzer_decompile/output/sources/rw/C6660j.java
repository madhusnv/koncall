package rw;

import fx.InterfaceC2395a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.j */
/* loaded from: classes3.dex */
public final class C6660j implements Collection, InterfaceC2395a {

    /* renamed from: a */
    public final Object[] f31936a;

    /* renamed from: b */
    public final boolean f31937b;

    public C6660j(Object[] values, boolean z6) {
        AbstractC4154l.m8923f(values, "values");
        this.f31936a = values;
        this.f31937b = z6;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC6662l.m12713c(this.f31936a, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!AbstractC6662l.m12713c(this.f31936a, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f31936a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC4154l.m8925h(this.f31936a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f31936a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        return AbstractC4153k.m8917b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f31936a;
        AbstractC4154l.m8923f(objArr, "<this>");
        if (this.f31937b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC4154l.m8922e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }
}
