package p001o;

/* loaded from: classes2.dex */
public final class atb extends xwf {

    /* renamed from: g */
    public final xwf f15228g;

    /* renamed from: h */
    public final xk7 f15229h;

    /* renamed from: o.atb$a */
    public static final class C12248a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f15230a;

        /* renamed from: b */
        public final /* synthetic */ xk7 f15231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12248a(xk7 xk7Var, xk7 xk7Var2) {
            super(1);
            this.f15230a = xk7Var;
            this.f15231b = xk7Var2;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m68982invoke(obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68982invoke(Object obj) {
            sq8.m48649h(obj, "state");
            this.f15230a.invoke(obj);
            this.f15231b.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atb(int i, axf axfVar, xk7 xk7Var, xwf xwfVar) {
        super(i, axfVar, null);
        sq8.m48649h(axfVar, "invalid");
        sq8.m48649h(xwfVar, "parent");
        this.f15228g = xwfVar;
        xwfVar.mo17685m(this);
        if (xk7Var != null) {
            xk7 xk7VarMo17681h = xwfVar.mo17681h();
            if (xk7VarMo17681h != null) {
                xk7Var = new C12248a(xk7Var, xk7VarMo17681h);
            }
        } else {
            xk7Var = xwfVar.mo17681h();
        }
        this.f15229h = xk7Var;
    }

    @Override // p001o.xwf
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Void mo17685m(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.xwf
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void mo17686n(xwf xwfVar) {
        sq8.m48649h(xwfVar, "snapshot");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // p001o.xwf
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Void mo17688p(d5g d5gVar) {
        sq8.m48649h(d5gVar, "state");
        exf.m25792X();
        throw new qe9();
    }

    @Override // p001o.xwf
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public atb mo17691x(xk7 xk7Var) {
        return new atb(mo39744f(), mo39745g(), xk7Var, this.f15228g);
    }

    @Override // p001o.xwf
    /* renamed from: d */
    public void mo17680d() {
        if (m56920e()) {
            return;
        }
        if (mo39744f() != this.f15228g.mo39744f()) {
            m56919b();
        }
        this.f15228g.mo17686n(this);
        super.mo17680d();
    }

    @Override // p001o.xwf
    /* renamed from: h */
    public xk7 mo17681h() {
        return this.f15229h;
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
    /* renamed from: o */
    public void mo17687o() {
    }
}
