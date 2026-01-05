package e1;

import fx.InterfaceC2395a;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import og.h1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 implements Collection, InterfaceC2395a {

    /* renamed from: a */
    public final /* synthetic */ int f9089a = 1;

    /* renamed from: b */
    public final Object f9090b;

    public y0() {
        int i10 = q0.f9041a;
        this.f9090b = new f0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f9089a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f9090b).m5557a(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f9089a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f9089a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((f0) this.f9090b).m5558b();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f9089a) {
            case 0:
                return ((j0) this.f9090b).m5571d(obj);
            default:
                return ((f0) this.f9090b).m5559c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f9089a) {
            case 0:
                AbstractC4154l.m8923f(elements, "elements");
                Collection collection = elements;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!((j0) this.f9090b).m5571d(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!((f0) this.f9090b).m5559c(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f9089a) {
            case 0:
                return ((j0) this.f9090b).m5576i();
            default:
                return ((f0) this.f9090b).f8967g == 0;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f9089a) {
            case 0:
                return h1.m10679a(new C1905g(this, null, 2));
            default:
                f0 f0Var = (f0) this.f9090b;
                f0Var.getClass();
                return new h0(new i0(f0Var));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f9089a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f9090b).m5563g(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f9089a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f9090b).m5563g(collection);
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f9089a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f9089a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                return ((f0) this.f9090b).m5565i(collection);
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f9089a) {
            case 0:
                return ((j0) this.f9090b).f9002e;
            default:
                return ((f0) this.f9090b).f8967g;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f9089a) {
        }
        return AbstractC4153k.m8916a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f9089a) {
            case 0:
                AbstractC4154l.m8923f(array, "array");
                break;
        }
        return AbstractC4153k.m8917b(this, array);
    }

    public y0(j0 parent) {
        AbstractC4154l.m8923f(parent, "parent");
        this.f9090b = parent;
    }
}
