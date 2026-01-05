package p001o;

/* loaded from: classes3.dex */
public final class uk8 extends xle {

    /* renamed from: b */
    public final xle f49016b;

    /* renamed from: c */
    public final nlb f49017c;

    /* renamed from: d */
    public final qx0 f49018d;

    public uk8(xle xleVar, nlb nlbVar, qx0 qx0Var) {
        sq8.m48649h(xleVar, "delegate");
        sq8.m48649h(nlbVar, "counter");
        sq8.m48649h(qx0Var, "attributes");
        this.f49016b = xleVar;
        this.f49017c = nlbVar;
        this.f49018d = qx0Var;
    }

    @Override // p001o.xle
    /* renamed from: a */
    public long mo18953a() {
        return this.f49016b.mo18953a();
    }

    @Override // p001o.xle
    /* renamed from: b */
    public y9b mo18954b() {
        return this.f49016b.mo18954b();
    }

    @Override // p001o.xle
    /* renamed from: g */
    public boolean mo49546g() {
        return this.f49016b.mo49546g();
    }

    @Override // p001o.xle
    /* renamed from: h */
    public boolean mo42498h() {
        return this.f49016b.mo42498h();
    }

    @Override // p001o.xle
    /* renamed from: i */
    public void mo18955i(gm1 gm1Var) {
        sq8.m48649h(gm1Var, "sink");
        gm1 gm1VarM51309b = uac.m51309b(new wk8(gm1Var, this.f49017c, this.f49018d));
        this.f49016b.mo18955i(gm1VarM51309b);
        if (gm1VarM51309b.isOpen()) {
            gm1VarM51309b.mo29024b();
        }
    }
}
