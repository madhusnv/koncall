package p001o;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class epb extends d69 {

    /* renamed from: c */
    public final Iterator f22026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epb(Iterator it, xk7 xk7Var) {
        super(it, xk7Var);
        sq8.m48649h(it, "src");
        sq8.m48649h(xk7Var, "src2Dest");
        this.f22026c = it;
    }

    @Override // p001o.d69, java.util.Iterator
    public void remove() {
        this.f22026c.remove();
    }
}
