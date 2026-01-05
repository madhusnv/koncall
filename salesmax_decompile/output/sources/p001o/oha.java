package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class oha implements Collection, sb9 {

    /* renamed from: c */
    public static final C15801a f38361c = new C15801a(null);

    /* renamed from: a */
    public final List f38362a;

    /* renamed from: b */
    public final int f38363b;

    /* renamed from: o.oha$a */
    public static final class C15801a {
        public C15801a() {
        }

        public /* synthetic */ C15801a(id5 id5Var) {
            this();
        }
    }

    public oha(List list) {
        sq8.m48649h(list, "localeList");
        this.f38362a = list;
        this.f38363b = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof mha) {
            return m42242d((mha) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f38362a.containsAll(collection);
    }

    /* renamed from: d */
    public boolean m42242d(mha mhaVar) {
        sq8.m48649h(mhaVar, "element");
        return this.f38362a.contains(mhaVar);
    }

    /* renamed from: e */
    public final List m42243e() {
        return this.f38362a;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oha) && sq8.m48644c(this.f38362a, ((oha) obj).f38362a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f38362a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f38362a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f38362a.iterator();
    }

    /* renamed from: j */
    public int m42244j() {
        return this.f38363b;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m42244j();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return yg3.m57773a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f38362a + ')';
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
