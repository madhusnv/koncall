package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class ypb extends jif implements zb9 {

    /* renamed from: f */
    public final Set f55794f;

    /* renamed from: g */
    public final xk7 f55795g;

    /* renamed from: h */
    public final xk7 f55796h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypb(Set set, xk7 xk7Var, xk7 xk7Var2) {
        super(set, xk7Var, xk7Var2);
        sq8.m48649h(set, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        this.f55794f = set;
        this.f55795g = xk7Var;
        this.f55796h = xk7Var2;
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        return this.f55794f.add(this.f55796h.invoke(obj));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f55794f.addAll(d74.m22397a(collection, this.f55796h, this.f55795g));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public void clear() {
        this.f55794f.clear();
    }

    @Override // p001o.y59, java.lang.Iterable, java.util.Collection, java.util.List
    public Iterator iterator() {
        return d74.m22400d(this.f55794f.iterator(), this.f55795g);
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.f55794f.remove(this.f55796h.invoke(obj));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f55794f.removeAll(d74.m22397a(collection, this.f55796h, this.f55795g));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f55794f.retainAll(d74.m22397a(collection, this.f55796h, this.f55795g));
    }
}
