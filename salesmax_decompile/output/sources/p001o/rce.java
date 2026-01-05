package p001o;

/* loaded from: classes2.dex */
public final class rce extends xwf {

    /* renamed from: g */
    public final xk7 f43379g;

    /* renamed from: h */
    public int f43380h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rce(int i, axf axfVar, xk7 xk7Var) {
        super(i, axfVar, null);
        sq8.m48649h(axfVar, "invalid");
        this.f43379g = xk7Var;
        this.f43380h = 1;
    }

    @Override // p001o.xwf
    /* renamed from: d */
    public void mo17680d() {
        if (m56920e()) {
            return;
        }
        mo17686n(this);
        super.mo17680d();
    }

    @Override // p001o.xwf
    /* renamed from: h */
    public xk7 mo17681h() {
        return this.f43379g;
    }

    @Override // p001o.xwf
    /* renamed from: i */
    public boolean mo17682i() {
        return true;
    }

    @Override // p001o.xwf
    /* renamed from: k */
    public xk7 mo17684k() {
        return null;
    }

    @Override // p001o.xwf
    /* renamed from: m */
    public void mo17685m(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        this.f43380h++;
    }

    @Override // p001o.xwf
    /* renamed from: n */
    public void mo17686n(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        int i = this.f43380h - 1;
        this.f43380h = i;
        if (i == 0) {
            m56919b();
        }
    }

    @Override // p001o.xwf
    /* renamed from: o */
    public void mo17687o() {
    }

    @Override // p001o.xwf
    /* renamed from: p */
    public void mo17688p(d5g d5gVar) {
        sq8.m48649h(d5gVar, "state");
        exf.m25792X();
        throw new qe9();
    }

    @Override // p001o.xwf
    /* renamed from: x */
    public xwf mo17691x(xk7 xk7Var) {
        exf.e0(this);
        return new atb(mo39744f(), mo39745g(), xk7Var, this);
    }
}
