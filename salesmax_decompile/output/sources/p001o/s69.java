package p001o;

/* loaded from: classes6.dex */
public class s69 extends d79 implements kl3 {

    /* renamed from: c */
    public final boolean f44874c;

    public s69(p69 p69Var) {
        super(true);
        o0(p69Var);
        this.f44874c = S0();
    }

    public final boolean S0() {
        d79 d79VarM18249u;
        c93 c93VarH0 = h0();
        d93 d93Var = c93VarH0 instanceof d93 ? (d93) c93VarH0 : null;
        if (d93Var != null && (d79VarM18249u = d93Var.m18249u()) != null) {
            while (!d79VarM18249u.b0()) {
                c93 c93VarH02 = d79VarM18249u.h0();
                d93 d93Var2 = c93VarH02 instanceof d93 ? (d93) c93VarH02 : null;
                if (d93Var2 == null || (d79VarM18249u = d93Var2.m18249u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p001o.d79
    public boolean b0() {
        return this.f44874c;
    }

    @Override // p001o.kl3
    /* renamed from: c */
    public boolean mo35824c() {
        return v0(y3i.f54824a);
    }

    @Override // p001o.d79
    public boolean c0() {
        return true;
    }

    @Override // p001o.kl3
    /* renamed from: d */
    public boolean mo35825d(Throwable th) {
        return v0(new lm3(th, false, 2, null));
    }
}
