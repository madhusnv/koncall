package p001o;

import p001o.s9c;

/* loaded from: classes2.dex */
public final class xla implements mh9 {

    /* renamed from: a */
    public final wla f53897a;

    public xla(wla wlaVar) {
        sq8.m48649h(wlaVar, "lookaheadDelegate");
        this.f53897a = wlaVar;
    }

    @Override // p001o.mh9
    /* renamed from: D */
    public long mo39060D(mh9 mh9Var, long j) {
        sq8.m48649h(mh9Var, "sourceCoordinates");
        if (!(mh9Var instanceof xla)) {
            wla wlaVarM57987a = yla.m57987a(this.f53897a);
            return s9c.m48057p(mo39060D(wlaVarM57987a.q0(), j), wlaVarM57987a.p0().mo52912Y().mo39060D(mh9Var, s9c.f45035b.m48063c()));
        }
        wla wlaVar = ((xla) mh9Var).f53897a;
        wlaVar.p0().f1();
        wla wlaVarK0 = m56448a().D0(wlaVar.p0()).K0();
        if (wlaVarK0 != null) {
            long jT0 = wlaVar.t0(wlaVarK0);
            long jM30757a = hl8.m30757a(lza.m38121d(s9c.m48052k(j)), lza.m38121d(s9c.m48053l(j)));
            long jM30757a2 = hl8.m30757a(gl8.m29001f(jT0) + gl8.m29001f(jM30757a), gl8.m29002g(jT0) + gl8.m29002g(jM30757a));
            long jT02 = this.f53897a.t0(wlaVarK0);
            long jM30757a3 = hl8.m30757a(gl8.m29001f(jM30757a2) - gl8.m29001f(jT02), gl8.m29002g(jM30757a2) - gl8.m29002g(jT02));
            return v9c.m52474a(gl8.m29001f(jM30757a3), gl8.m29002g(jM30757a3));
        }
        wla wlaVarM57987a2 = yla.m57987a(wlaVar);
        long jT03 = wlaVar.t0(wlaVarM57987a2);
        long jD0 = wlaVarM57987a2.d0();
        long jM30757a4 = hl8.m30757a(gl8.m29001f(jT03) + gl8.m29001f(jD0), gl8.m29002g(jT03) + gl8.m29002g(jD0));
        long jM30757a5 = hl8.m30757a(lza.m38121d(s9c.m48052k(j)), lza.m38121d(s9c.m48053l(j)));
        long jM30757a6 = hl8.m30757a(gl8.m29001f(jM30757a4) + gl8.m29001f(jM30757a5), gl8.m29002g(jM30757a4) + gl8.m29002g(jM30757a5));
        wla wlaVar2 = this.f53897a;
        long jT04 = wlaVar2.t0(yla.m57987a(wlaVar2));
        long jD02 = yla.m57987a(wlaVar2).d0();
        long jM30757a7 = hl8.m30757a(gl8.m29001f(jT04) + gl8.m29001f(jD02), gl8.m29002g(jT04) + gl8.m29002g(jD02));
        long jM30757a8 = hl8.m30757a(gl8.m29001f(jM30757a6) - gl8.m29001f(jM30757a7), gl8.m29002g(jM30757a6) - gl8.m29002g(jM30757a7));
        xzb xzbVarR0 = yla.m57987a(this.f53897a).p0().R0();
        sq8.m48646e(xzbVarR0);
        xzb xzbVarR02 = wlaVarM57987a2.p0().R0();
        sq8.m48646e(xzbVarR02);
        return xzbVarR0.mo39060D(xzbVarR02, v9c.m52474a(gl8.m29001f(jM30757a8), gl8.m29002g(jM30757a8)));
    }

    @Override // p001o.mh9
    /* renamed from: F */
    public long mo39061F(long j) {
        return m56448a().mo39061F(s9c.m48057p(j, m56449b()));
    }

    /* renamed from: a */
    public final xzb m56448a() {
        return this.f53897a.p0();
    }

    /* renamed from: b */
    public final long m56449b() {
        wla wlaVarM57987a = yla.m57987a(this.f53897a);
        mh9 mh9VarMo52912Y = wlaVarM57987a.mo52912Y();
        s9c.C16789a c16789a = s9c.f45035b;
        return s9c.m48056o(mo39060D(mh9VarMo52912Y, c16789a.m48063c()), m56448a().mo39060D(wlaVarM57987a.p0(), c16789a.m48063c()));
    }

    @Override // p001o.mh9
    /* renamed from: f */
    public boolean mo39062f() {
        return m56448a().mo39062f();
    }

    @Override // p001o.mh9
    /* renamed from: i */
    public long mo39063i() {
        wla wlaVar = this.f53897a;
        return nl8.m40749a(wlaVar.m44974Q(), wlaVar.m44970L());
    }

    @Override // p001o.mh9
    /* renamed from: q */
    public mfe mo39064q(mh9 mh9Var, boolean z) {
        sq8.m48649h(mh9Var, "sourceCoordinates");
        return m56448a().mo39064q(mh9Var, z);
    }

    @Override // p001o.mh9
    /* renamed from: r */
    public long mo39065r(long j) {
        return m56448a().mo39065r(s9c.m48057p(j, m56449b()));
    }

    @Override // p001o.mh9
    /* renamed from: z */
    public mh9 mo39066z() {
        wla wlaVarK0;
        if (!mo39062f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        xzb xzbVarR0 = m56448a().a0().m59429V().R0();
        if (xzbVarR0 == null || (wlaVarK0 = xzbVarR0.K0()) == null) {
            return null;
        }
        return wlaVarK0.mo52912Y();
    }
}
