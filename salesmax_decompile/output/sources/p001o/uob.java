package p001o;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class uob extends zg3 implements tb9 {

    /* renamed from: f */
    public final Collection f49278f;

    /* renamed from: g */
    public final xk7 f49279g;

    /* renamed from: h */
    public final xk7 f49280h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uob(Collection collection, xk7 xk7Var, xk7 xk7Var2) {
        super(collection, xk7Var, xk7Var2);
        sq8.m48649h(collection, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        this.f49278f = collection;
        this.f49279g = xk7Var;
        this.f49280h = xk7Var2;
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        return this.f49278f.add(this.f49280h.invoke(obj));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f49278f.addAll(d74.m22397a(collection, this.f49280h, this.f49279g));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public void clear() {
        this.f49278f.clear();
    }

    @Override // p001o.y59, java.lang.Iterable, java.util.Collection, java.util.List
    public Iterator iterator() {
        return d74.m22400d(this.f49278f.iterator(), this.f49279g);
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.f49278f.remove(this.f49280h.invoke(obj));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f49278f.removeAll(d74.m22397a(collection, this.f49280h, this.f49279g));
    }

    @Override // p001o.zg3, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        return this.f49278f.retainAll(d74.m22397a(collection, this.f49280h, this.f49279g));
    }
}
