package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class cqa extends n8 {

    /* renamed from: a */
    public final bqa f18511a;

    public cqa(bqa bqaVar) {
        sq8.m48649h(bqaVar, "backing");
        this.f18511a = bqaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f18511a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f18511a.m19594y(collection);
    }

    @Override // p001o.z8
    /* renamed from: d */
    public int mo21591d() {
        return this.f18511a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f18511a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f18511a.m19571G();
    }

    @Override // p001o.n8
    /* renamed from: j */
    public boolean mo21592j(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        return this.f18511a.m19567A(entry);
    }

    @Override // p001o.n8
    /* renamed from: o */
    public boolean mo21593o(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        return this.f18511a.m19588Z(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f18511a.m19592t();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f18511a.m19592t();
        return super.retainAll(collection);
    }
}
