package p001o;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public final class whf extends z8 implements Serializable {

    /* renamed from: b */
    public static final C17869a f52006b = new C17869a(null);

    /* renamed from: c */
    public static final whf f52007c = new whf(bqa.f16681L.m19599e());

    /* renamed from: a */
    public final bqa f52008a;

    /* renamed from: o.whf$a */
    public static final class C17869a {
        public C17869a() {
        }

        public /* synthetic */ C17869a(id5 id5Var) {
            this();
        }
    }

    public whf(bqa bqaVar) {
        sq8.m48649h(bqaVar, "backing");
        this.f52008a = bqaVar;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f52008a.m19581R()) {
            return new kff(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f52008a.m19589o(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f52008a.m19592t();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f52008a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f52008a.containsKey(obj);
    }

    @Override // p001o.z8
    /* renamed from: d */
    public int mo21591d() {
        return this.f52008a.size();
    }

    /* renamed from: e */
    public final Set m54431e() {
        this.f52008a.m19591s();
        return size() > 0 ? this : f52007c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f52008a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f52008a.m19582S();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f52008a.c0(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f52008a.m19592t();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        this.f52008a.m19592t();
        return super.retainAll(collection);
    }

    public whf() {
        this(new bqa());
    }

    public whf(int i) {
        this(new bqa(i));
    }
}
