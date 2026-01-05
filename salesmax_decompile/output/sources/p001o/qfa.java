package p001o;

import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

/* loaded from: classes3.dex */
public abstract class qfa extends zg3 implements List {

    /* renamed from: f */
    public final List f41820f;

    /* renamed from: g */
    public final xk7 f41821g;

    /* renamed from: h */
    public final xk7 f41822h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfa(List list, xk7 xk7Var, xk7 xk7Var2) {
        super(list, xk7Var, xk7Var2);
        sq8.m48649h(list, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        this.f41820f = list;
        this.f41821g = xk7Var;
        this.f41822h = xk7Var2;
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.f41821g.invoke(this.f41820f.get(i));
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f41820f.indexOf(this.f41822h.invoke(obj));
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f41820f.lastIndexOf(this.f41822h.invoke(obj));
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
