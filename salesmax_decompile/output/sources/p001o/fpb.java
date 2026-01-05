package p001o;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public class fpb extends rea {

    /* renamed from: e */
    public final ListIterator f23902e;

    /* renamed from: f */
    public final xk7 f23903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpb(ListIterator listIterator, xk7 xk7Var, xk7 xk7Var2) {
        super(listIterator, xk7Var);
        sq8.m48649h(listIterator, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        sq8.m48649h(xk7Var2, "dest2Src");
        this.f23902e = listIterator;
        this.f23903f = xk7Var2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        this.f23902e.add(this.f23903f.invoke(obj));
    }

    @Override // p001o.d69, java.util.Iterator
    public void remove() {
        this.f23902e.remove();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        this.f23902e.set(this.f23903f.invoke(obj));
    }
}
