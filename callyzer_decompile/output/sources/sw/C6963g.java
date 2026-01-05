package sw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6658h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sw.g */
/* loaded from: classes3.dex */
public final class C6963g extends AbstractC6658h {

    /* renamed from: a */
    public final /* synthetic */ int f33721a;

    /* renamed from: b */
    public final C6962f f33722b;

    public /* synthetic */ C6963g(C6962f c6962f, int i10) {
        this.f33721a = i10;
        this.f33722b = c6962f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f33721a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                AbstractC4154l.m8923f(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f33721a) {
            case 0:
                AbstractC4154l.m8923f(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC4154l.m8923f(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // rw.AbstractC6658h
    /* renamed from: b */
    public final int mo11347b() {
        switch (this.f33721a) {
        }
        return this.f33722b.f33716j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f33721a) {
            case 0:
                this.f33722b.clear();
                break;
            default:
                this.f33722b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f33721a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f33722b.m13234j((Map.Entry) obj);
            default:
                return this.f33722b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f33721a) {
            case 0:
                AbstractC4154l.m8923f(elements, "elements");
                return this.f33722b.m13233i(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f33721a) {
        }
        return this.f33722b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f33721a) {
            case 0:
                C6962f c6962f = this.f33722b;
                c6962f.getClass();
                return new C6960d(c6962f, 0);
            default:
                C6962f c6962f2 = this.f33722b;
                c6962f2.getClass();
                return new C6960d(c6962f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f33721a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C6962f c6962f = this.f33722b;
                    c6962f.getClass();
                    c6962f.m13231f();
                    int iM13236n = c6962f.m13236n(entry.getKey());
                    if (iM13236n >= 0) {
                        Object[] objArr = c6962f.f33709b;
                        AbstractC4154l.m8920c(objArr);
                        if (AbstractC4154l.m8918a(objArr[iM13236n], entry.getValue())) {
                            c6962f.m13240r(iM13236n);
                            break;
                        }
                    }
                }
                break;
            default:
                C6962f c6962f2 = this.f33722b;
                c6962f2.m13231f();
                int iM13236n2 = c6962f2.m13236n(obj);
                if (iM13236n2 >= 0) {
                    c6962f2.m13240r(iM13236n2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f33721a) {
            case 0:
                AbstractC4154l.m8923f(elements, "elements");
                this.f33722b.m13231f();
                break;
            default:
                AbstractC4154l.m8923f(elements, "elements");
                this.f33722b.m13231f();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f33721a) {
            case 0:
                AbstractC4154l.m8923f(elements, "elements");
                this.f33722b.m13231f();
                break;
            default:
                AbstractC4154l.m8923f(elements, "elements");
                this.f33722b.m13231f();
                break;
        }
        return super.retainAll(elements);
    }
}
