package ec;

import fx.InterfaceC2400f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import og.vd;
import rw.AbstractC6663m;
import rw.AbstractC6664n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.g */
/* loaded from: classes.dex */
public final class C2009g implements Set, InterfaceC2400f {

    /* renamed from: a */
    public final Set f9540a;

    public C2009g(Iterable initialValues) {
        AbstractC4154l.m8923f(initialValues, "initialValues");
        this.f9540a = AbstractC6663m.f0(initialValues);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        String element = (String) obj;
        AbstractC4154l.m8923f(element, "element");
        return this.f9540a.add(vd.m11018b(element));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Iterator it = elements.iterator();
        while (true) {
            boolean z6 = false;
            while (it.hasNext()) {
                String element = (String) it.next();
                AbstractC4154l.m8923f(element, "element");
                if (this.f9540a.add(vd.m11018b(element)) || z6) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f9540a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof String) {
            return this.f9540a.contains(vd.m11018b((String) obj));
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C2009g) {
            return AbstractC4154l.m8918a(this.f9540a, ((C2009g) obj).f9540a);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f9540a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f9540a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2008f(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj instanceof String) {
            return this.f9540a.remove(vd.m11018b((String) obj));
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Iterator it = elements.iterator();
        while (true) {
            boolean z6 = false;
            while (it.hasNext()) {
                if (remove((String) it.next()) || z6) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        AbstractC4154l.m8923f(elements, "elements");
        Collection collection = elements;
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(vd.m11018b((String) it.next()));
        }
        Set setG0 = AbstractC6663m.g0(arrayList);
        Set set = this.f9540a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (!setG0.contains((C2010h) obj)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        boolean z6 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            z6 = set.remove((C2010h) obj2) || z6;
        }
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f9540a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    public final String toString() {
        return this.f9540a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC4154l.m8923f(array, "array");
        return AbstractC4153k.m8917b(this, array);
    }
}
