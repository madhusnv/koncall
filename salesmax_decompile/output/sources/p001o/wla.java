package p001o;

import java.util.LinkedHashMap;
import java.util.Map;
import p001o.di9;
import p001o.q8d;

/* loaded from: classes2.dex */
public abstract class wla extends vla implements y0b {

    /* renamed from: H */
    public final Map f52299H;

    /* renamed from: h */
    public final xzb f52300h;

    /* renamed from: q */
    public long f52301q;

    /* renamed from: s */
    public Map f52302s;

    /* renamed from: x */
    public final xla f52303x;

    /* renamed from: y */
    public b1b f52304y;

    public wla(xzb xzbVar) {
        sq8.m48649h(xzbVar, "coordinator");
        this.f52300h = xzbVar;
        this.f52301q = gl8.f25414a.m29003a();
        this.f52303x = new xla(this);
        this.f52299H = new LinkedHashMap();
    }

    @Override // p001o.q8d
    /* renamed from: S */
    public final void mo21320S(long j, float f, xk7 xk7Var) {
        if (!gl8.m29000e(d0(), j)) {
            u0(j);
            di9.C12942a c12942aM23245C = a0().m59413F().m23245C();
            if (c12942aM23245C != null) {
                c12942aM23245C.j0();
            }
            e0(this.f52300h);
        }
        if (g0()) {
            return;
        }
        s0();
    }

    @Override // p001o.vla
    /* renamed from: X */
    public vla mo52911X() {
        xzb xzbVarQ0 = this.f52300h.Q0();
        if (xzbVarQ0 != null) {
            return xzbVarQ0.K0();
        }
        return null;
    }

    @Override // p001o.vla
    /* renamed from: Y */
    public mh9 mo52912Y() {
        return this.f52303x;
    }

    @Override // p001o.vla
    /* renamed from: Z */
    public boolean mo52913Z() {
        return this.f52304y != null;
    }

    @Override // p001o.vla
    public zh9 a0() {
        return this.f52300h.a0();
    }

    @Override // p001o.vla
    public b1b b0() {
        b1b b1bVar = this.f52304y;
        if (b1bVar != null) {
            return b1bVar;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // p001o.vla
    public vla c0() {
        xzb xzbVarR0 = this.f52300h.R0();
        if (xzbVarR0 != null) {
            return xzbVarR0.K0();
        }
        return null;
    }

    @Override // p001o.vla
    public long d0() {
        return this.f52301q;
    }

    @Override // p001o.zl5
    public float getDensity() {
        return this.f52300h.getDensity();
    }

    @Override // p001o.rq8
    public qh9 getLayoutDirection() {
        return this.f52300h.getLayoutDirection();
    }

    @Override // p001o.vla
    public void h0() {
        mo21320S(d0(), 0.0f, null);
    }

    public v90 m0() {
        v90 v90VarM23275z = this.f52300h.a0().m59413F().m23275z();
        sq8.m48646e(v90VarM23275z);
        return v90VarM23275z;
    }

    public final int n0(s90 s90Var) {
        sq8.m48649h(s90Var, "alignmentLine");
        Integer num = (Integer) this.f52299H.get(s90Var);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public final Map o0() {
        return this.f52299H;
    }

    public final xzb p0() {
        return this.f52300h;
    }

    public final xla q0() {
        return this.f52303x;
    }

    public Object r0() {
        return this.f52300h.M0();
    }

    public void s0() {
        q8d.AbstractC16323a.a aVar = q8d.AbstractC16323a.f41476a;
        int width = b0().getWidth();
        qh9 layoutDirection = this.f52300h.getLayoutDirection();
        mh9 mh9Var = q8d.AbstractC16323a.f41479d;
        int iMo44993l = aVar.mo44993l();
        qh9 qh9VarMo44992k = aVar.mo44992k();
        di9 di9Var = q8d.AbstractC16323a.f41480e;
        q8d.AbstractC16323a.f41478c = width;
        q8d.AbstractC16323a.f41477b = layoutDirection;
        boolean zM45002y = aVar.m45002y(this);
        b0().mo18090a();
        i0(zM45002y);
        q8d.AbstractC16323a.f41478c = iMo44993l;
        q8d.AbstractC16323a.f41477b = qh9VarMo44992k;
        q8d.AbstractC16323a.f41479d = mh9Var;
        q8d.AbstractC16323a.f41480e = di9Var;
    }

    public final long t0(wla wlaVar) {
        sq8.m48649h(wlaVar, "ancestor");
        long jM29003a = gl8.f25414a.m29003a();
        wla wlaVarK0 = this;
        while (!sq8.m48644c(wlaVarK0, wlaVar)) {
            long jD0 = wlaVarK0.d0();
            jM29003a = hl8.m30757a(gl8.m29001f(jM29003a) + gl8.m29001f(jD0), gl8.m29002g(jM29003a) + gl8.m29002g(jD0));
            xzb xzbVarR0 = wlaVarK0.f52300h.R0();
            sq8.m48646e(xzbVarR0);
            wlaVarK0 = xzbVarR0.K0();
            sq8.m48646e(wlaVarK0);
        }
        return jM29003a;
    }

    public void u0(long j) {
        this.f52301q = j;
    }

    public final void v0(b1b b1bVar) {
        y3i y3iVar;
        if (b1bVar != null) {
            m44976T(nl8.m40749a(b1bVar.getWidth(), b1bVar.getHeight()));
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            m44976T(ml8.f35642a.m39313a());
        }
        if (!sq8.m48644c(this.f52304y, b1bVar) && b1bVar != null) {
            Map map = this.f52302s;
            if ((!(map == null || map.isEmpty()) || (!b1bVar.mo18091b().isEmpty())) && !sq8.m48644c(b1bVar.mo18091b(), this.f52302s)) {
                m0().mo23283b().m51224m();
                Map linkedHashMap = this.f52302s;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.f52302s = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(b1bVar.mo18091b());
            }
        }
        this.f52304y = b1bVar;
    }

    @Override // p001o.zl5
    /* renamed from: x */
    public float mo17436x() {
        return this.f52300h.mo17436x();
    }
}
