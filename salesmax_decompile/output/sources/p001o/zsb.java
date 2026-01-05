package p001o;

import java.util.Map;
import p001o.ywf;

/* loaded from: classes2.dex */
public final class zsb extends aqb {

    /* renamed from: s */
    public final aqb f57600s;

    /* renamed from: t */
    public boolean f57601t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsb(int i, axf axfVar, xk7 xk7Var, xk7 xk7Var2, aqb aqbVar) {
        super(i, axfVar, xk7Var, xk7Var2);
        sq8.m48649h(axfVar, "invalid");
        sq8.m48649h(aqbVar, "parent");
        this.f57600s = aqbVar;
        aqbVar.mo17685m(this);
    }

    @Override // p001o.aqb
    /* renamed from: C */
    public ywf mo17663C() {
        Map mapM25784P;
        if (this.f57600s.m17664D() || this.f57600s.m56920e()) {
            return new ywf.C18516a(this);
        }
        lb8 lb8VarMo17665E = mo17665E();
        int iMo39744f = mo39744f();
        if (lb8VarMo17665E != null) {
            aqb aqbVar = this.f57600s;
            mapM25784P = exf.m25784P(aqbVar, this, aqbVar.mo39745g());
        } else {
            mapM25784P = null;
        }
        synchronized (exf.m25775G()) {
            exf.e0(this);
            if (lb8VarMo17665E == null || lb8VarMo17665E.size() == 0) {
                m56919b();
            } else {
                ywf ywfVarM17668H = m17668H(this.f57600s.mo39744f(), mapM25784P, this.f57600s.mo39745g());
                if (!sq8.m48644c(ywfVarM17668H, ywf.C18517b.f56218a)) {
                    return ywfVarM17668H;
                }
                lb8 lb8VarMo17665E2 = this.f57600s.mo17665E();
                if (lb8VarMo17665E2 != null) {
                    lb8VarMo17665E2.m36852e(lb8VarMo17665E);
                } else {
                    this.f57600s.mo17675O(lb8VarMo17665E);
                    mo17675O(null);
                }
            }
            if (this.f57600s.mo39744f() < iMo39744f) {
                this.f57600s.m17662B();
            }
            aqb aqbVar2 = this.f57600s;
            aqbVar2.mo39747v(aqbVar2.mo39745g().m17955r(iMo39744f).m17954p(m17666F()));
            this.f57600s.m17669I(iMo39744f);
            this.f57600s.m17671K(m56925y());
            this.f57600s.m17670J(m17666F());
            this.f57600s.m17672L(m17667G());
            y3i y3iVar = y3i.f54824a;
            m17674N(true);
            m59817S();
            return ywf.C18517b.f56218a;
        }
    }

    /* renamed from: S */
    public final void m59817S() {
        if (this.f57601t) {
            return;
        }
        this.f57601t = true;
        this.f57600s.mo17686n(this);
    }

    @Override // p001o.aqb, p001o.xwf
    /* renamed from: d */
    public void mo17680d() {
        if (m56920e()) {
            return;
        }
        super.mo17680d();
        m59817S();
    }
}
