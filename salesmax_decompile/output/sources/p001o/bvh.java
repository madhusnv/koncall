package p001o;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class bvh implements Iterator {

    /* renamed from: a */
    public final Iterator f16877a;

    public bvh(Iterator it) {
        this.f16877a = (Iterator) dgd.m23062o(it);
    }

    /* renamed from: a */
    public abstract Object mo19878a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16877a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo19878a(this.f16877a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f16877a.remove();
    }
}
