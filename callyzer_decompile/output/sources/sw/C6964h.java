package sw;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6658h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sw.h */
/* loaded from: classes3.dex */
public final class C6964h extends AbstractC6658h implements Serializable {

    /* renamed from: b */
    public static final C6964h f33723b;

    /* renamed from: a */
    public final C6962f f33724a;

    static {
        C6962f c6962f = C6962f.f33707p;
        f33723b = new C6964h(C6962f.f33707p);
    }

    public C6964h(C6962f backing) {
        AbstractC4154l.m8923f(backing, "backing");
        this.f33724a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f33724a.m13229b(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        this.f33724a.m13231f();
        return super.addAll(elements);
    }

    @Override // rw.AbstractC6658h
    /* renamed from: b */
    public final int mo11347b() {
        return this.f33724a.f33716j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33724a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f33724a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f33724a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C6962f c6962f = this.f33724a;
        c6962f.getClass();
        return new C6960d(c6962f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C6962f c6962f = this.f33724a;
        c6962f.m13231f();
        int iM13236n = c6962f.m13236n(obj);
        if (iM13236n < 0) {
            return false;
        }
        c6962f.m13240r(iM13236n);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        this.f33724a.m13231f();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        this.f33724a.m13231f();
        return super.retainAll(elements);
    }

    public C6964h() {
        this(new C6962f());
    }
}
