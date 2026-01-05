package qw;

import e1.x0;
import fx.InterfaceC2395a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.z */
/* loaded from: classes3.dex */
public final class C6376z implements Collection, InterfaceC2395a {

    /* renamed from: a */
    public final short[] f30776a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        if (!(obj instanceof C6375y)) {
            return false;
        }
        short s5 = ((C6375y) obj).f30775a;
        short[] sArr = this.f30776a;
        int length = sArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (s5 == sArr[i10]) {
                break;
            }
            i10++;
        }
        return i10 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C6375y) {
                    short s5 = ((C6375y) obj).f30775a;
                    short[] sArr = this.f30776a;
                    int length = sArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        }
                        if (s5 == sArr[i10]) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C6376z) {
            return AbstractC4154l.m8918a(this.f30776a, ((C6376z) obj).f30776a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f30776a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f30776a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new x0(6, this.f30776a);
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
        return this.f30776a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f30776a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        return AbstractC4153k.m8917b(this, array);
    }
}
