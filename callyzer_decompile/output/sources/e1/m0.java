package e1;

import fx.InterfaceC2395a;
import fx.InterfaceC2400f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 implements InterfaceC2400f, Set, InterfaceC2395a {

    /* renamed from: a */
    public final k0 f9028a;

    /* renamed from: b */
    public final k0 f9029b;

    public m0(k0 k0Var) {
        this.f9028a = k0Var;
        this.f9029b = k0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f9029b.m5581a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        k0 k0Var = this.f9029b;
        k0Var.getClass();
        int i10 = k0Var.f9008d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            k0Var.m5591k(it.next());
        }
        return i10 != k0Var.f9008d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f9029b.m5582b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9028a.m5583c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f9028a.m5583c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC4154l.m8918a(this.f9028a, ((m0) obj).f9028a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f9028a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f9028a.m5587g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new h0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f9029b.m5592l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        k0 k0Var = this.f9029b;
        k0Var.getClass();
        int i10 = k0Var.f9008d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            k0Var.m5589i(it.next());
        }
        return i10 != k0Var.f9008d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        boolean z6;
        AbstractC4154l.m8923f(elements, "elements");
        k0 k0Var = this.f9029b;
        k0Var.getClass();
        Object[] objArr = k0Var.f9006b;
        int i10 = k0Var.f9008d;
        long[] jArr = k0Var.f9005a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j6 = jArr[i11];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j6) < 128) {
                            int i14 = (i11 << 3) + i13;
                            if (!AbstractC6663m.m12767z(elements, objArr[i14])) {
                                k0Var.m5593m(i14);
                            }
                        }
                        j6 >>= 8;
                    }
                    z6 = false;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    z6 = false;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        } else {
            z6 = false;
        }
        if (i10 != k0Var.f9008d) {
            return true;
        }
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f9028a.f9008d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    public final String toString() {
        return this.f9028a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        return AbstractC4153k.m8917b(this, array);
    }
}
