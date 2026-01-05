package p001o;

import java.util.Collection;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class zg3 extends y59 implements Collection {

    /* renamed from: c */
    public final Collection f57159c;

    /* renamed from: d */
    public final xk7 f57160d;

    /* renamed from: e */
    public final xk7 f57161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg3(Collection collection, xk7 xk7Var, xk7 xk7Var2) {
        super(collection, xk7Var);
        sq8.m48649h(collection, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        this.f57159c = collection;
        this.f57160d = xk7Var;
        this.f57161e = xk7Var2;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f57159c.contains(this.f57161e.invoke(obj));
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f57159c.containsAll(d74.m22397a(collection, this.f57161e, this.f57160d));
    }

    /* renamed from: d */
    public int m59387d() {
        return this.f57159c.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f57159c.isEmpty();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m59387d();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return yg3.m57773a(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        sq8.m48649h(objArr, "array");
        return yg3.m57774b(this, objArr);
    }
}
