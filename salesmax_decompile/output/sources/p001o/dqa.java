package p001o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class dqa extends z8 {

    /* renamed from: a */
    public final bqa f20410a;

    public dqa(bqa bqaVar) {
        sq8.m48649h(bqaVar, "backing");
        this.f20410a = bqaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f20410a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f20410a.containsKey(obj);
    }

    @Override // p001o.z8
    /* renamed from: d */
    public int mo21591d() {
        return this.f20410a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f20410a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f20410a.m19582S();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f20410a.c0(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f20410a.m19592t();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f20410a.m19592t();
        return super.retainAll(collection);
    }
}
