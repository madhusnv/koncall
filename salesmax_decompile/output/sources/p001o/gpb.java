package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public class gpb extends qfa implements vb9 {

    /* renamed from: q */
    public final List f25641q;

    /* renamed from: s */
    public final xk7 f25642s;

    /* renamed from: x */
    public final xk7 f25643x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpb(List list, xk7 xk7Var, xk7 xk7Var2) {
        super(list, xk7Var, xk7Var2);
        sq8.m48649h(list, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        this.f25641q = list;
        this.f25642s = xk7Var;
        this.f25643x = xk7Var2;
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        return this.f25641q.add(this.f25643x.invoke(obj));
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f25641q.addAll(i, d74.m22397a(collection, this.f25643x, this.f25642s));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public void clear() {
        this.f25641q.clear();
    }

    /* renamed from: e */
    public Object m29271e(int i) {
        return this.f25642s.invoke(this.f25641q.remove(i));
    }

    @Override // p001o.y59, java.lang.Iterable, java.util.Collection, java.util.List
    public Iterator iterator() {
        return d74.m22400d(this.f25641q.iterator(), this.f25642s);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return d74.m22401e(this.f25641q.listIterator(), this.f25642s, this.f25643x);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return m29271e(i);
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f25641q.removeAll(d74.m22397a(collection, this.f25643x, this.f25642s));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f25641q.retainAll(d74.m22397a(collection, this.f25643x, this.f25642s));
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return this.f25642s.invoke(this.f25641q.set(i, this.f25643x.invoke(obj)));
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return d74.m22402f(this.f25641q.subList(i, i2), this.f25642s, this.f25643x);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.f25641q.add(i, this.f25643x.invoke(obj));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f25641q.addAll(d74.m22397a(collection, this.f25643x, this.f25642s));
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return d74.m22401e(this.f25641q.listIterator(i), this.f25642s, this.f25643x);
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.f25641q.remove(this.f25643x.invoke(obj));
    }
}
