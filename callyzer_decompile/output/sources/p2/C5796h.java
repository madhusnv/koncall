package p2;

import fx.InterfaceC2396b;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import sw.C6960d;
import sw.C6962f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p2.h */
/* loaded from: classes.dex */
public final class C5796h extends AbstractCollection implements Collection, InterfaceC2396b {

    /* renamed from: a */
    public final /* synthetic */ int f28394a;

    /* renamed from: b */
    public final Object f28395b;

    public /* synthetic */ C5796h(int i10, Object obj) {
        this.f28394a = i10;
        this.f28395b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f28394a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.f28394a) {
            case 1:
                AbstractC4154l.m8923f(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f28394a) {
            case 0:
                ((C5792d) this.f28395b).clear();
                break;
            default:
                ((C6962f) this.f28395b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f28394a) {
            case 0:
                return ((C5792d) this.f28395b).containsValue(obj);
            default:
                return ((C6962f) this.f28395b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f28394a) {
            case 1:
                return ((C6962f) this.f28395b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f28394a) {
            case 0:
                C5792d c5792d = (C5792d) this.f28395b;
                AbstractC5800l[] abstractC5800lArr = new AbstractC5800l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC5800lArr[i10] = new C5801m(2);
                }
                return new C5795g(c5792d, abstractC5800lArr);
            default:
                C6962f c6962f = (C6962f) this.f28395b;
                c6962f.getClass();
                return new C6960d(c6962f, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f28394a) {
            case 1:
                C6962f c6962f = (C6962f) this.f28395b;
                c6962f.m13231f();
                int iM13237o = c6962f.m13237o(obj);
                if (iM13237o < 0) {
                    return false;
                }
                c6962f.m13240r(iM13237o);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.f28394a) {
            case 1:
                AbstractC4154l.m8923f(elements, "elements");
                ((C6962f) this.f28395b).m13231f();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.f28394a) {
            case 1:
                AbstractC4154l.m8923f(elements, "elements");
                ((C6962f) this.f28395b).m13231f();
                break;
        }
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f28394a) {
            case 0:
                return ((C5792d) this.f28395b).size();
            default:
                return ((C6962f) this.f28395b).f33716j;
        }
    }
}
