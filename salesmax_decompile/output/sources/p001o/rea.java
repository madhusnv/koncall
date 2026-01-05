package p001o;

import java.util.ListIterator;

/* loaded from: classes3.dex */
public abstract class rea extends d69 implements ListIterator {

    /* renamed from: c */
    public final ListIterator f43443c;

    /* renamed from: d */
    public final xk7 f43444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rea(ListIterator listIterator, xk7 xk7Var) {
        super(listIterator, xk7Var);
        sq8.m48649h(listIterator, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        this.f43443c = listIterator;
        this.f43444d = xk7Var;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f43443c.hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f43443c.nextIndex();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        return this.f43444d.invoke(this.f43443c.previous());
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f43443c.previousIndex();
    }
}
