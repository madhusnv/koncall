package p001o;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class x4d extends z8 {

    /* renamed from: a */
    public final t4d f53187a;

    public x4d(t4d t4dVar) {
        sq8.m48649h(t4dVar, "builder");
        this.f53187a = t4dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f53187a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f53187a.containsKey(obj);
    }

    @Override // p001o.z8
    /* renamed from: d */
    public int mo21591d() {
        return this.f53187a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new y4d(this.f53187a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f53187a.containsKey(obj)) {
            return false;
        }
        this.f53187a.remove(obj);
        return true;
    }
}
