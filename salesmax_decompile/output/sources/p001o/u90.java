package p001o;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class u90 {

    /* renamed from: a */
    public final v90 f48566a;

    /* renamed from: b */
    public boolean f48567b;

    /* renamed from: c */
    public boolean f48568c;

    /* renamed from: d */
    public boolean f48569d;

    /* renamed from: e */
    public boolean f48570e;

    /* renamed from: f */
    public boolean f48571f;

    /* renamed from: g */
    public boolean f48572g;

    /* renamed from: h */
    public v90 f48573h;

    /* renamed from: i */
    public final Map f48574i;

    /* renamed from: o.u90$a */
    public static final class C17335a extends kf9 implements xk7 {
        public C17335a() {
            super(1);
        }

        /* renamed from: a */
        public final void m51233a(v90 v90Var) {
            sq8.m48649h(v90Var, "childOwner");
            if (v90Var.mo23282a()) {
                if (v90Var.mo23283b().m51219g()) {
                    v90Var.mo23286n();
                }
                Map map = v90Var.mo23283b().f48574i;
                u90 u90Var = u90.this;
                for (Map.Entry entry : map.entrySet()) {
                    u90Var.m51217c((s90) entry.getKey(), ((Number) entry.getValue()).intValue(), v90Var.mo23287t());
                }
                xzb xzbVarR0 = v90Var.mo23287t().R0();
                sq8.m48646e(xzbVarR0);
                while (!sq8.m48644c(xzbVarR0, u90.this.m51218f().mo23287t())) {
                    Set<s90> setKeySet = u90.this.mo17149e(xzbVarR0).keySet();
                    u90 u90Var2 = u90.this;
                    for (s90 s90Var : setKeySet) {
                        u90Var2.m51217c(s90Var, u90Var2.mo17150i(xzbVarR0, s90Var), xzbVarR0);
                    }
                    xzbVarR0 = xzbVarR0.R0();
                    sq8.m48646e(xzbVarR0);
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51233a((v90) obj);
            return y3i.f54824a;
        }
    }

    public /* synthetic */ u90(v90 v90Var, id5 id5Var) {
        this(v90Var);
    }

    /* renamed from: c */
    public final void m51217c(s90 s90Var, int i, xzb xzbVar) {
        float f = i;
        long jM52474a = v9c.m52474a(f, f);
        while (true) {
            jM52474a = mo17148d(xzbVar, jM52474a);
            xzbVar = xzbVar.R0();
            sq8.m48646e(xzbVar);
            if (sq8.m48644c(xzbVar, this.f48566a.mo23287t())) {
                break;
            } else if (mo17149e(xzbVar).containsKey(s90Var)) {
                float fMo17150i = mo17150i(xzbVar, s90Var);
                jM52474a = v9c.m52474a(fMo17150i, fMo17150i);
            }
        }
        int iM38121d = s90Var instanceof v08 ? lza.m38121d(s9c.m48053l(jM52474a)) : lza.m38121d(s9c.m48052k(jM52474a));
        Map map = this.f48574i;
        if (map.containsKey(s90Var)) {
            iM38121d = t90.m49569a(s90Var, ((Number) isa.m32682i(this.f48574i, s90Var)).intValue(), iM38121d);
        }
        map.put(s90Var, Integer.valueOf(iM38121d));
    }

    /* renamed from: d */
    public abstract long mo17148d(xzb xzbVar, long j);

    /* renamed from: e */
    public abstract Map mo17149e(xzb xzbVar);

    /* renamed from: f */
    public final v90 m51218f() {
        return this.f48566a;
    }

    /* renamed from: g */
    public final boolean m51219g() {
        return this.f48567b;
    }

    /* renamed from: h */
    public final Map m51220h() {
        return this.f48574i;
    }

    /* renamed from: i */
    public abstract int mo17150i(xzb xzbVar, s90 s90Var);

    /* renamed from: j */
    public final boolean m51221j() {
        return this.f48568c || this.f48570e || this.f48571f || this.f48572g;
    }

    /* renamed from: k */
    public final boolean m51222k() {
        m51226o();
        return this.f48573h != null;
    }

    /* renamed from: l */
    public final boolean m51223l() {
        return this.f48569d;
    }

    /* renamed from: m */
    public final void m51224m() {
        this.f48567b = true;
        v90 v90VarMo23285e = this.f48566a.mo23285e();
        if (v90VarMo23285e == null) {
            return;
        }
        if (this.f48568c) {
            v90VarMo23285e.mo23278H();
        } else if (this.f48570e || this.f48569d) {
            v90VarMo23285e.requestLayout();
        }
        if (this.f48571f) {
            this.f48566a.mo23278H();
        }
        if (this.f48572g) {
            this.f48566a.requestLayout();
        }
        v90VarMo23285e.mo23283b().m51224m();
    }

    /* renamed from: n */
    public final void m51225n() {
        this.f48574i.clear();
        this.f48566a.mo23288v(new C17335a());
        this.f48574i.putAll(mo17149e(this.f48566a.mo23287t()));
        this.f48567b = false;
    }

    /* renamed from: o */
    public final void m51226o() {
        v90 v90Var;
        u90 u90VarMo23283b;
        u90 u90VarMo23283b2;
        if (m51221j()) {
            v90Var = this.f48566a;
        } else {
            v90 v90VarMo23285e = this.f48566a.mo23285e();
            if (v90VarMo23285e == null) {
                return;
            }
            v90Var = v90VarMo23285e.mo23283b().f48573h;
            if (v90Var == null || !v90Var.mo23283b().m51221j()) {
                v90 v90Var2 = this.f48573h;
                if (v90Var2 == null || v90Var2.mo23283b().m51221j()) {
                    return;
                }
                v90 v90VarMo23285e2 = v90Var2.mo23285e();
                if (v90VarMo23285e2 != null && (u90VarMo23283b2 = v90VarMo23285e2.mo23283b()) != null) {
                    u90VarMo23283b2.m51226o();
                }
                v90 v90VarMo23285e3 = v90Var2.mo23285e();
                v90Var = (v90VarMo23285e3 == null || (u90VarMo23283b = v90VarMo23285e3.mo23283b()) == null) ? null : u90VarMo23283b.f48573h;
            }
        }
        this.f48573h = v90Var;
    }

    /* renamed from: p */
    public final void m51227p() {
        this.f48567b = true;
        this.f48568c = false;
        this.f48570e = false;
        this.f48569d = false;
        this.f48571f = false;
        this.f48572g = false;
        this.f48573h = null;
    }

    /* renamed from: q */
    public final void m51228q(boolean z) {
        this.f48570e = z;
    }

    /* renamed from: r */
    public final void m51229r(boolean z) {
        this.f48572g = z;
    }

    /* renamed from: s */
    public final void m51230s(boolean z) {
        this.f48571f = z;
    }

    /* renamed from: t */
    public final void m51231t(boolean z) {
        this.f48569d = z;
    }

    /* renamed from: u */
    public final void m51232u(boolean z) {
        this.f48568c = z;
    }

    public u90(v90 v90Var) {
        this.f48566a = v90Var;
        this.f48567b = true;
        this.f48574i = new HashMap();
    }
}
