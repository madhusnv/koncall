package p001o;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z4d extends w8 {

    /* renamed from: a */
    public final t4d f56518a;

    public z4d(t4d t4dVar) {
        sq8.m48649h(t4dVar, "builder");
        this.f56518a = t4dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f56518a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f56518a.containsValue(obj);
    }

    @Override // p001o.w8
    /* renamed from: d */
    public int mo25438d() {
        return this.f56518a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a5d(this.f56518a);
    }
}
