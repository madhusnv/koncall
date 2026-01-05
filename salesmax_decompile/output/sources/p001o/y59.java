package p001o;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class y59 implements Iterable, sb9 {

    /* renamed from: a */
    public final Iterable f54944a;

    /* renamed from: b */
    public final xk7 f54945b;

    public y59(Iterable iterable, xk7 xk7Var) {
        sq8.m48649h(iterable, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        this.f54944a = iterable;
        this.f54945b = xk7Var;
    }

    @Override // java.lang.Iterable, java.util.Collection, java.util.List
    public Iterator iterator() {
        return d74.m22398b(this.f54944a.iterator(), this.f54945b);
    }
}
