package p001o;

/* loaded from: classes2.dex */
public abstract class q8d {

    /* renamed from: a */
    public int f41471a;

    /* renamed from: b */
    public int f41472b;

    /* renamed from: c */
    public long f41473c = nl8.m40749a(0, 0);

    /* renamed from: d */
    public long f41474d = r8d.f43154b;

    /* renamed from: e */
    public long f41475e = gl8.f25414a.m29003a();

    /* renamed from: o.q8d$a */
    public static abstract class AbstractC16323a {

        /* renamed from: a */
        public static final a f41476a = new a(null);

        /* renamed from: b */
        public static qh9 f41477b = qh9.Ltr;

        /* renamed from: c */
        public static int f41478c;

        /* renamed from: d */
        public static mh9 f41479d;

        /* renamed from: e */
        public static di9 f41480e;

        /* renamed from: o.q8d$a$a */
        public static final class a extends AbstractC16323a {
            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            @Override // p001o.q8d.AbstractC16323a
            /* renamed from: k */
            public qh9 mo44992k() {
                return AbstractC16323a.f41477b;
            }

            @Override // p001o.q8d.AbstractC16323a
            /* renamed from: l */
            public int mo44993l() {
                return AbstractC16323a.f41478c;
            }

            /* renamed from: y */
            public final boolean m45002y(vla vlaVar) {
                boolean z = false;
                if (vlaVar == null) {
                    AbstractC16323a.f41479d = null;
                    AbstractC16323a.f41480e = null;
                    return false;
                }
                boolean zF0 = vlaVar.f0();
                vla vlaVarC0 = vlaVar.c0();
                if (vlaVarC0 != null && vlaVarC0.f0()) {
                    z = true;
                }
                if (z) {
                    vlaVar.i0(true);
                }
                AbstractC16323a.f41480e = vlaVar.a0().m59413F();
                if (vlaVar.f0() || vlaVar.g0()) {
                    AbstractC16323a.f41479d = null;
                } else {
                    AbstractC16323a.f41479d = vlaVar.mo52912Y();
                }
                return zF0;
            }

            public a() {
            }
        }

        /* renamed from: n */
        public static /* synthetic */ void m44988n(AbstractC16323a abstractC16323a, q8d q8dVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            abstractC16323a.m44994m(q8dVar, i, i2, f);
        }

        /* renamed from: p */
        public static /* synthetic */ void m44989p(AbstractC16323a abstractC16323a, q8d q8dVar, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            abstractC16323a.m44995o(q8dVar, j, f);
        }

        /* renamed from: r */
        public static /* synthetic */ void m44990r(AbstractC16323a abstractC16323a, q8d q8dVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            abstractC16323a.m44996q(q8dVar, i, i2, f);
        }

        /* renamed from: t */
        public static /* synthetic */ void m44991t(AbstractC16323a abstractC16323a, q8d q8dVar, int i, int i2, float f, xk7 xk7Var, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                xk7Var = r8d.f43153a;
            }
            abstractC16323a.m44997s(q8dVar, i, i2, f2, xk7Var);
        }

        /* renamed from: k */
        public abstract qh9 mo44992k();

        /* renamed from: l */
        public abstract int mo44993l();

        /* renamed from: m */
        public final void m44994m(q8d q8dVar, int i, int i2, float f) {
            sq8.m48649h(q8dVar, "<this>");
            long jM30757a = hl8.m30757a(i, i2);
            long j = q8dVar.f41475e;
            q8dVar.mo21320S(hl8.m30757a(gl8.m29001f(jM30757a) + gl8.m29001f(j), gl8.m29002g(jM30757a) + gl8.m29002g(j)), f, null);
        }

        /* renamed from: o */
        public final void m44995o(q8d q8dVar, long j, float f) {
            sq8.m48649h(q8dVar, "$this$place");
            long j2 = q8dVar.f41475e;
            q8dVar.mo21320S(hl8.m30757a(gl8.m29001f(j) + gl8.m29001f(j2), gl8.m29002g(j) + gl8.m29002g(j2)), f, null);
        }

        /* renamed from: q */
        public final void m44996q(q8d q8dVar, int i, int i2, float f) {
            sq8.m48649h(q8dVar, "<this>");
            long jM30757a = hl8.m30757a(i, i2);
            if (mo44992k() == qh9.Ltr || mo44993l() == 0) {
                long j = q8dVar.f41475e;
                q8dVar.mo21320S(hl8.m30757a(gl8.m29001f(jM30757a) + gl8.m29001f(j), gl8.m29002g(jM30757a) + gl8.m29002g(j)), f, null);
            } else {
                long jM30757a2 = hl8.m30757a((mo44993l() - q8dVar.m44974Q()) - gl8.m29001f(jM30757a), gl8.m29002g(jM30757a));
                long j2 = q8dVar.f41475e;
                q8dVar.mo21320S(hl8.m30757a(gl8.m29001f(jM30757a2) + gl8.m29001f(j2), gl8.m29002g(jM30757a2) + gl8.m29002g(j2)), f, null);
            }
        }

        /* renamed from: s */
        public final void m44997s(q8d q8dVar, int i, int i2, float f, xk7 xk7Var) {
            sq8.m48649h(q8dVar, "<this>");
            sq8.m48649h(xk7Var, "layerBlock");
            long jM30757a = hl8.m30757a(i, i2);
            if (mo44992k() == qh9.Ltr || mo44993l() == 0) {
                long j = q8dVar.f41475e;
                q8dVar.mo21320S(hl8.m30757a(gl8.m29001f(jM30757a) + gl8.m29001f(j), gl8.m29002g(jM30757a) + gl8.m29002g(j)), f, xk7Var);
            } else {
                long jM30757a2 = hl8.m30757a((mo44993l() - q8dVar.m44974Q()) - gl8.m29001f(jM30757a), gl8.m29002g(jM30757a));
                long j2 = q8dVar.f41475e;
                q8dVar.mo21320S(hl8.m30757a(gl8.m29001f(jM30757a2) + gl8.m29001f(j2), gl8.m29002g(jM30757a2) + gl8.m29002g(j2)), f, xk7Var);
            }
        }

        /* renamed from: u */
        public final void m44998u(q8d q8dVar, long j, float f, xk7 xk7Var) {
            sq8.m48649h(q8dVar, "$this$placeWithLayer");
            sq8.m48649h(xk7Var, "layerBlock");
            long j2 = q8dVar.f41475e;
            q8dVar.mo21320S(hl8.m30757a(gl8.m29001f(j) + gl8.m29001f(j2), gl8.m29002g(j) + gl8.m29002g(j2)), f, xk7Var);
        }
    }

    /* renamed from: K */
    public final long m44969K() {
        return this.f41475e;
    }

    /* renamed from: L */
    public final int m44970L() {
        return this.f41472b;
    }

    /* renamed from: M */
    public int m44971M() {
        return ml8.m39311d(this.f41473c);
    }

    /* renamed from: N */
    public final long m44972N() {
        return this.f41473c;
    }

    /* renamed from: O */
    public int mo23294O() {
        return ml8.m39312e(this.f41473c);
    }

    /* renamed from: P */
    public final long m44973P() {
        return this.f41474d;
    }

    /* renamed from: Q */
    public final int m44974Q() {
        return this.f41471a;
    }

    /* renamed from: R */
    public final void m44975R() {
        this.f41471a = bce.m18608k(ml8.m39312e(this.f41473c), bu3.m19800l(this.f41474d), bu3.m19798j(this.f41474d));
        this.f41472b = bce.m18608k(ml8.m39311d(this.f41473c), bu3.m19799k(this.f41474d), bu3.m19797i(this.f41474d));
        this.f41475e = hl8.m30757a((this.f41471a - ml8.m39312e(this.f41473c)) / 2, (this.f41472b - ml8.m39311d(this.f41473c)) / 2);
    }

    /* renamed from: S */
    public abstract void mo21320S(long j, float f, xk7 xk7Var);

    /* renamed from: T */
    public final void m44976T(long j) {
        if (ml8.m39310c(this.f41473c, j)) {
            return;
        }
        this.f41473c = j;
        m44975R();
    }

    /* renamed from: U */
    public final void m44977U(long j) {
        if (bu3.m19793e(this.f41474d, j)) {
            return;
        }
        this.f41474d = j;
        m44975R();
    }
}
