package p001o;

import p001o.alb;
import p001o.q8d;

/* loaded from: classes2.dex */
public final class vh9 extends xzb {
    public static final C17577a y0 = new C17577a(null);
    public static final ewc z0;
    public uh9 v0;
    public bu3 w0;
    public wla x0;

    /* renamed from: o.vh9$a */
    public static final class C17577a {
        public C17577a() {
        }

        public /* synthetic */ C17577a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.vh9$b */
    public final class C17578b extends wla {
        public C17578b() {
            super(vh9.this);
        }

        @Override // p001o.vla
        /* renamed from: V */
        public int mo21321V(s90 s90Var) {
            sq8.m48649h(s90Var, "alignmentLine");
            int iM54402b = wh9.m54402b(this, s90Var);
            o0().put(s90Var, Integer.valueOf(iM54402b));
            return iM54402b;
        }

        @Override // p001o.y0b
        /* renamed from: w */
        public q8d mo21322w(long j) {
            vh9 vh9Var = vh9.this;
            m44977U(j);
            vh9Var.w0 = bu3.m19790b(j);
            uh9 uh9VarG1 = vh9Var.G1();
            wla wlaVarK0 = vh9Var.H1().K0();
            sq8.m48646e(wlaVarK0);
            v0(uh9VarG1.mo40259l(this, wlaVarK0, j));
            return this;
        }
    }

    static {
        ewc ewcVarM18808a = bf0.m18808a();
        ewcVarM18808a.mo16978a(lh3.f33793b.m37210b());
        ewcVarM18808a.mo16982e(1.0f);
        ewcVarM18808a.mo16981d(gwc.f25862a.m29552a());
        z0 = ewcVarM18808a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh9(zh9 zh9Var, uh9 uh9Var) {
        super(zh9Var);
        sq8.m48649h(zh9Var, "layoutNode");
        sq8.m48649h(uh9Var, "measureNode");
        this.v0 = uh9Var;
        this.x0 = zh9Var.m59419L() != null ? new C17578b() : null;
    }

    @Override // p001o.xzb
    public void C0() {
        if (K0() == null) {
            J1(new C17578b());
        }
    }

    public final uh9 G1() {
        return this.v0;
    }

    public final xzb H1() {
        xzb xzbVarQ0 = Q0();
        sq8.m48646e(xzbVarQ0);
        return xzbVarQ0;
    }

    public final void I1(uh9 uh9Var) {
        sq8.m48649h(uh9Var, "<set-?>");
        this.v0 = uh9Var;
    }

    public void J1(wla wlaVar) {
        this.x0 = wlaVar;
    }

    @Override // p001o.xzb
    public wla K0() {
        return this.x0;
    }

    @Override // p001o.xzb
    public alb.AbstractC12216c P0() {
        return this.v0.mo17377h();
    }

    @Override // p001o.xzb, p001o.q8d
    /* renamed from: S */
    public void mo21320S(long j, float f, xk7 xk7Var) {
        super.mo21320S(j, f, xk7Var);
        if (g0()) {
            return;
        }
        k1();
        q8d.AbstractC16323a.a aVar = q8d.AbstractC16323a.f41476a;
        int iM39312e = ml8.m39312e(m44972N());
        qh9 layoutDirection = getLayoutDirection();
        mh9 mh9Var = q8d.AbstractC16323a.f41479d;
        int iMo44993l = aVar.mo44993l();
        qh9 qh9VarMo44992k = aVar.mo44992k();
        di9 di9Var = q8d.AbstractC16323a.f41480e;
        q8d.AbstractC16323a.f41478c = iM39312e;
        q8d.AbstractC16323a.f41477b = layoutDirection;
        boolean zM45002y = aVar.m45002y(this);
        b0().mo18090a();
        i0(zM45002y);
        q8d.AbstractC16323a.f41478c = iMo44993l;
        q8d.AbstractC16323a.f41477b = qh9VarMo44992k;
        q8d.AbstractC16323a.f41479d = mh9Var;
        q8d.AbstractC16323a.f41480e = di9Var;
    }

    @Override // p001o.vla
    /* renamed from: V */
    public int mo21321V(s90 s90Var) {
        sq8.m48649h(s90Var, "alignmentLine");
        wla wlaVarK0 = K0();
        return wlaVarK0 != null ? wlaVarK0.n0(s90Var) : wh9.m54402b(this, s90Var);
    }

    @Override // p001o.xzb
    public void m1(mc2 mc2Var) {
        sq8.m48649h(mc2Var, "canvas");
        H1().z0(mc2Var);
        if (ci9.m21298b(a0()).getShowLayoutBounds()) {
            A0(mc2Var, z0);
        }
    }

    @Override // p001o.y0b
    /* renamed from: w */
    public q8d mo21322w(long j) {
        m44977U(j);
        r1(G1().mo40259l(this, H1(), j));
        j1();
        return this;
    }
}
