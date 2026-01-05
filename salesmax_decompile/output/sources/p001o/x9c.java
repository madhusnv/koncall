package p001o;

/* loaded from: classes2.dex */
public class x9c implements tq6 {

    /* renamed from: d */
    public static final yq6 f53400d = new yq6() { // from class: o.w9c
        @Override // p001o.yq6
        /* renamed from: f */
        public final tq6[] mo17519f() {
            return x9c.m55880e();
        }
    };

    /* renamed from: a */
    public vq6 f53401a;

    /* renamed from: b */
    public a7g f53402b;

    /* renamed from: c */
    public boolean f53403c;

    /* renamed from: e */
    public static /* synthetic */ tq6[] m55880e() {
        return new tq6[]{new x9c()};
    }

    /* renamed from: g */
    public static zwc m55881g(zwc zwcVar) {
        zwcVar.m60017U(0);
        return zwcVar;
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        a7g a7gVar = this.f53402b;
        if (a7gVar != null) {
            a7gVar.m16575m(j, j2);
        }
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        try {
            return m55882h(uq6Var);
        } catch (byc unused) {
            return false;
        }
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        this.f53401a = vq6Var;
    }

    /* renamed from: h */
    public final boolean m55882h(uq6 uq6Var) {
        aac aacVar = new aac();
        if (aacVar.m16768a(uq6Var, true) && (aacVar.f14383b & 2) == 2) {
            int iMin = Math.min(aacVar.f14390i, 8);
            zwc zwcVar = new zwc(iMin);
            uq6Var.mo40498m(zwcVar.m60024e(), 0, iMin);
            if (h27.m29755p(m55881g(zwcVar))) {
                this.f53402b = new h27();
            } else if (o2j.m41477r(m55881g(zwcVar))) {
                this.f53402b = new o2j();
            } else if (uec.m51402o(m55881g(zwcVar))) {
                this.f53402b = new uec();
            }
            return true;
        }
        return false;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) throws byc {
        op0.m42519i(this.f53401a);
        if (this.f53402b == null) {
            if (!m55882h(uq6Var)) {
                throw byc.m19921a("Failed to determine bitstream type", null);
            }
            uq6Var.mo40490c();
        }
        if (!this.f53403c) {
            uth uthVarMo32487f = this.f53401a.mo32487f(0, 1);
            this.f53401a.mo32489p();
            this.f53402b.m16566d(this.f53401a, uthVarMo32487f);
            this.f53403c = true;
        }
        return this.f53402b.m16569g(uq6Var, uedVar);
    }

    @Override // p001o.tq6
    public void release() {
    }
}
