package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

@dff(with = r79.class)
/* loaded from: classes6.dex */
public final class q79 extends k89 implements List<k89>, sb9 {
    public static final C16316a Companion = new C16316a(null);

    /* renamed from: a */
    public final List f41430a;

    /* renamed from: o.q79$a */
    public static final class C16316a {
        public C16316a() {
        }

        public /* synthetic */ C16316a(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return r79.f43112a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q79(List list) {
        super(null);
        sq8.m48649h(list, FirebaseAnalytics.Param.CONTENT);
        this.f41430a = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, k89 k89Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends k89> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k89) {
            return m44926d((k89) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f41430a.containsAll(collection);
    }

    /* renamed from: d */
    public boolean m44926d(k89 k89Var) {
        sq8.m48649h(k89Var, "element");
        return this.f41430a.contains(k89Var);
    }

    @Override // java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public k89 get(int i) {
        return (k89) this.f41430a.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return sq8.m48644c(this.f41430a, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f41430a.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k89) {
            return m44929o((k89) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f41430a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f41430a.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k89) {
            return m44930r((k89) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<k89> listIterator() {
        return this.f41430a.listIterator();
    }

    /* renamed from: n */
    public int m44928n() {
        return this.f41430a.size();
    }

    /* renamed from: o */
    public int m44929o(k89 k89Var) {
        sq8.m48649h(k89Var, "element");
        return this.f41430a.indexOf(k89Var);
    }

    /* renamed from: r */
    public int m44930r(k89 k89Var) {
        sq8.m48649h(k89Var, "element");
        return this.f41430a.lastIndexOf(k89Var);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ k89 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<k89> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ k89 set(int i, k89 k89Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m44928n();
    }

    @Override // java.util.List
    public void sort(Comparator<? super k89> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<k89> subList(int i, int i2) {
        return this.f41430a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return yg3.m57773a(this);
    }

    public String toString() {
        return kh3.p0(this.f41430a, ",", "[", "]", 0, null, null, 56, null);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<k89> listIterator(int i) {
        return this.f41430a.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
