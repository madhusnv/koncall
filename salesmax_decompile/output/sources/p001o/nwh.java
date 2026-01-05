package p001o;

/* loaded from: classes2.dex */
public final class nwh extends xwf {

    /* renamed from: g */
    public final xwf f37369g;

    /* renamed from: h */
    public final boolean f37370h;

    /* renamed from: i */
    public final boolean f37371i;

    /* renamed from: j */
    public final xk7 f37372j;

    /* renamed from: k */
    public final xk7 f37373k;

    /* renamed from: l */
    public final xwf f37374l;

    public nwh(xwf xwfVar, xk7 xk7Var, boolean z, boolean z2) {
        xk7 xk7VarMo17681h;
        super(0, axf.f15344e.m17959a(), null);
        this.f37369g = xwfVar;
        this.f37370h = z;
        this.f37371i = z2;
        this.f37372j = exf.m25777I(xk7Var, (xwfVar == null || (xk7VarMo17681h = xwfVar.mo17681h()) == null) ? ((rt7) exf.f22346j.get()).mo17681h() : xk7VarMo17681h, z);
        this.f37374l = this;
    }

    /* renamed from: A */
    public final xwf m41196A() {
        xwf xwfVar = this.f37369g;
        if (xwfVar != null) {
            return xwfVar;
        }
        Object obj = exf.f22346j.get();
        sq8.m48648g(obj, "currentGlobalSnapshot.get()");
        return (xwf) obj;
    }

    @Override // p001o.xwf
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void mo17685m(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.xwf
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void mo17686n(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.xwf
    /* renamed from: d */
    public void mo17680d() {
        xwf xwfVar;
        m56924t(true);
        if (!this.f37371i || (xwfVar = this.f37369g) == null) {
            return;
        }
        xwfVar.mo17680d();
    }

    @Override // p001o.xwf
    /* renamed from: f */
    public int mo39744f() {
        return m41196A().mo39744f();
    }

    @Override // p001o.xwf
    /* renamed from: g */
    public axf mo39745g() {
        return m41196A().mo39745g();
    }

    @Override // p001o.xwf
    /* renamed from: h */
    public xk7 mo17681h() {
        return this.f37372j;
    }

    @Override // p001o.xwf
    /* renamed from: i */
    public boolean mo17682i() {
        return m41196A().mo17682i();
    }

    @Override // p001o.xwf
    /* renamed from: k */
    public xk7 mo17684k() {
        return this.f37373k;
    }

    @Override // p001o.xwf
    /* renamed from: o */
    public void mo17687o() {
        m41196A().mo17687o();
    }

    @Override // p001o.xwf
    /* renamed from: p */
    public void mo17688p(d5g d5gVar) {
        sq8.m48649h(d5gVar, "state");
        m41196A().mo17688p(d5gVar);
    }

    @Override // p001o.xwf
    /* renamed from: x */
    public xwf mo17691x(xk7 xk7Var) {
        xk7 xk7VarM25778J = exf.m25778J(xk7Var, mo17681h(), false, 4, null);
        return !this.f37370h ? exf.m25770B(m41196A().mo17691x(null), xk7VarM25778J, true) : m41196A().mo17691x(xk7VarM25778J);
    }
}
