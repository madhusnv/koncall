package p001o;

/* loaded from: classes6.dex */
public abstract class ng2 extends mg2 {

    /* renamed from: d */
    public final nl7 f36809d;

    public ng2(nl7 nl7Var, q74 q74Var, int i, wl1 wl1Var) {
        super(q74Var, i, wl1Var);
        this.f36809d = nl7Var;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m40528n(ng2 ng2Var, ljd ljdVar, n64 n64Var) {
        Object objInvoke = ng2Var.f36809d.invoke(ljdVar, n64Var);
        return objInvoke == uq8.m51918f() ? objInvoke : y3i.f54824a;
    }

    @Override // p001o.mg2
    /* renamed from: h */
    public Object mo20154h(ljd ljdVar, n64 n64Var) {
        return m40528n(this, ljdVar, n64Var);
    }

    @Override // p001o.mg2
    public String toString() {
        return "block[" + this.f36809d + "] -> " + super.toString();
    }
}
