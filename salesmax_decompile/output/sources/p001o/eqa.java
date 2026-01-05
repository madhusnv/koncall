package p001o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class eqa extends w8 {

    /* renamed from: a */
    public final bqa f22044a;

    public eqa(bqa bqaVar) {
        sq8.m48649h(bqaVar, "backing");
        this.f22044a = bqaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f22044a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f22044a.containsValue(obj);
    }

    @Override // p001o.w8
    /* renamed from: d */
    public int mo25438d() {
        return this.f22044a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f22044a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f22044a.f0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f22044a.d0(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f22044a.m19592t();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f22044a.m19592t();
        return super.retainAll(collection);
    }
}
