package p001o;

/* loaded from: classes2.dex */
public abstract class vla extends q8d implements c1b {

    /* renamed from: f */
    public boolean f50488f;

    /* renamed from: g */
    public boolean f50489g;

    /* renamed from: V */
    public abstract int mo21321V(s90 s90Var);

    /* renamed from: W */
    public final int m52910W(s90 s90Var) {
        int iMo21321V;
        sq8.m48649h(s90Var, "alignmentLine");
        if (mo52913Z() && (iMo21321V = mo21321V(s90Var)) != Integer.MIN_VALUE) {
            return iMo21321V + gl8.m29002g(m44969K());
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: X */
    public abstract vla mo52911X();

    /* renamed from: Y */
    public abstract mh9 mo52912Y();

    /* renamed from: Z */
    public abstract boolean mo52913Z();

    public abstract zh9 a0();

    public abstract b1b b0();

    public abstract vla c0();

    public abstract long d0();

    public final void e0(xzb xzbVar) {
        u90 u90VarMo23283b;
        sq8.m48649h(xzbVar, "<this>");
        xzb xzbVarQ0 = xzbVar.Q0();
        if (!sq8.m48644c(xzbVarQ0 != null ? xzbVarQ0.a0() : null, xzbVar.a0())) {
            xzbVar.G0().mo23283b().m51224m();
            return;
        }
        v90 v90VarMo23285e = xzbVar.G0().mo23285e();
        if (v90VarMo23285e == null || (u90VarMo23283b = v90VarMo23285e.mo23283b()) == null) {
            return;
        }
        u90VarMo23283b.m51224m();
    }

    public final boolean f0() {
        return this.f50489g;
    }

    public final boolean g0() {
        return this.f50488f;
    }

    public abstract void h0();

    public final void i0(boolean z) {
        this.f50489g = z;
    }

    public final void j0(boolean z) {
        this.f50488f = z;
    }
}
