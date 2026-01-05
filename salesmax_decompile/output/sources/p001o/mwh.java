package p001o;

/* loaded from: classes2.dex */
public final class mwh extends aqb {

    /* renamed from: s */
    public final aqb f36052s;

    /* renamed from: t */
    public final boolean f36053t;

    /* renamed from: u */
    public final boolean f36054u;

    public mwh(aqb aqbVar, xk7 xk7Var, xk7 xk7Var2, boolean z, boolean z2) {
        xk7 xk7VarMo17684k;
        xk7 xk7VarMo17681h;
        super(0, axf.f15344e.m17959a(), exf.m25777I(xk7Var, (aqbVar == null || (xk7VarMo17681h = aqbVar.mo17681h()) == null) ? ((rt7) exf.f22346j.get()).mo17681h() : xk7VarMo17681h, z), exf.m25779K(xk7Var2, (aqbVar == null || (xk7VarMo17684k = aqbVar.mo17684k()) == null) ? ((rt7) exf.f22346j.get()).mo17684k() : xk7VarMo17684k));
        this.f36052s = aqbVar;
        this.f36053t = z;
        this.f36054u = z2;
    }

    @Override // p001o.aqb
    /* renamed from: C */
    public ywf mo17663C() {
        return m39741S().mo17663C();
    }

    @Override // p001o.aqb
    /* renamed from: E */
    public lb8 mo17665E() {
        return m39741S().mo17665E();
    }

    @Override // p001o.aqb
    /* renamed from: O */
    public void mo17675O(lb8 lb8Var) {
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.aqb
    /* renamed from: P */
    public aqb mo17676P(xk7 xk7Var, xk7 xk7Var2) {
        xk7 xk7VarM25778J = exf.m25778J(xk7Var, mo17681h(), false, 4, null);
        xk7 xk7VarM25779K = exf.m25779K(xk7Var2, mo17684k());
        return !this.f36053t ? new mwh(m39741S().mo17676P(null, xk7VarM25779K), xk7VarM25778J, xk7VarM25779K, false, true) : m39741S().mo17676P(xk7VarM25778J, xk7VarM25779K);
    }

    /* renamed from: S */
    public final aqb m39741S() {
        aqb aqbVar = this.f36052s;
        if (aqbVar != null) {
            return aqbVar;
        }
        Object obj = exf.f22346j.get();
        sq8.m48648g(obj, "currentGlobalSnapshot.get()");
        return (aqb) obj;
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public Void mo17685m(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public Void mo17686n(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: d */
    public void mo17680d() {
        aqb aqbVar;
        m56924t(true);
        if (!this.f36054u || (aqbVar = this.f36052s) == null) {
            return;
        }
        aqbVar.mo17680d();
    }

    @Override // p001o.xwf
    /* renamed from: f */
    public int mo39744f() {
        return m39741S().mo39744f();
    }

    @Override // p001o.xwf
    /* renamed from: g */
    public axf mo39745g() {
        return m39741S().mo39745g();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: i */
    public boolean mo17682i() {
        return m39741S().mo17682i();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: j */
    public int mo17683j() {
        return m39741S().mo17683j();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: o */
    public void mo17687o() {
        m39741S().mo17687o();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: p */
    public void mo17688p(d5g d5gVar) {
        sq8.m48649h(d5gVar, "state");
        m39741S().mo17688p(d5gVar);
    }

    @Override // p001o.xwf
    /* renamed from: u */
    public void mo39746u(int i) {
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.xwf
    /* renamed from: v */
    public void mo39747v(axf axfVar) {
        sq8.m48649h(axfVar, "value");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: w */
    public void mo17690w(int i) {
        m39741S().mo17690w(i);
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: x */
    public xwf mo17691x(xk7 xk7Var) {
        xk7 xk7VarM25778J = exf.m25778J(xk7Var, mo17681h(), false, 4, null);
        return !this.f36053t ? exf.m25770B(m39741S().mo17691x(null), xk7VarM25778J, true) : m39741S().mo17691x(xk7VarM25778J);
    }
}
