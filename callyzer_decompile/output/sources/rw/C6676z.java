package rw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rw.z */
/* loaded from: classes3.dex */
public final class C6676z extends AbstractC6656f {

    /* renamed from: a */
    public final ArrayList f31951a;

    public C6676z(ArrayList arrayList) {
        this.f31951a = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        this.f31951a.add(AbstractC6663m.m12764w(this, i10), obj);
    }

    @Override // rw.AbstractC6656f
    /* renamed from: b */
    public final int mo10411b() {
        return this.f31951a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f31951a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f31951a.get(AbstractC6663m.m12763v(this, i10));
    }

    @Override // rw.AbstractC6656f
    /* renamed from: h */
    public final Object mo10412h(int i10) {
        return this.f31951a.remove(AbstractC6663m.m12763v(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C6675y(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C6675y(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return this.f31951a.set(AbstractC6663m.m12763v(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C6675y(this, i10);
    }
}
