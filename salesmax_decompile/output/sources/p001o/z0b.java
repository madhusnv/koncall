package p001o;

import p001o.sgc;
import p001o.zh9;

/* loaded from: classes2.dex */
public final class z0b {

    /* renamed from: a */
    public final zh9 f56358a;

    /* renamed from: b */
    public final gm5 f56359b;

    /* renamed from: c */
    public boolean f56360c;

    /* renamed from: d */
    public final acc f56361d;

    /* renamed from: e */
    public final fqb f56362e;

    /* renamed from: f */
    public long f56363f;

    /* renamed from: g */
    public final fqb f56364g;

    /* renamed from: h */
    public bu3 f56365h;

    /* renamed from: i */
    public final fi9 f56366i;

    /* renamed from: o.z0b$a */
    public static final class C18538a {

        /* renamed from: a */
        public final zh9 f56367a;

        /* renamed from: b */
        public final boolean f56368b;

        /* renamed from: c */
        public final boolean f56369c;

        public C18538a(zh9 zh9Var, boolean z, boolean z2) {
            sq8.m48649h(zh9Var, "node");
            this.f56367a = zh9Var;
            this.f56368b = z;
            this.f56369c = z2;
        }

        /* renamed from: a */
        public final zh9 m58621a() {
            return this.f56367a;
        }

        /* renamed from: b */
        public final boolean m58622b() {
            return this.f56369c;
        }

        /* renamed from: c */
        public final boolean m58623c() {
            return this.f56368b;
        }
    }

    /* renamed from: o.z0b$b */
    public /* synthetic */ class C18539b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56370a;

        static {
            int[] iArr = new int[zh9.EnumC18640e.values().length];
            try {
                iArr[zh9.EnumC18640e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zh9.EnumC18640e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zh9.EnumC18640e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zh9.EnumC18640e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zh9.EnumC18640e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f56370a = iArr;
        }
    }

    /* renamed from: o.z0b$c */
    public static final class C18540c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ boolean f56371a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18540c(boolean z) {
            super(1);
            this.f56371a = z;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(zh9 zh9Var) {
            sq8.m48649h(zh9Var, "it");
            return Boolean.valueOf(this.f56371a ? zh9Var.m59417J() : zh9Var.m59422O());
        }
    }

    public z0b(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "root");
        this.f56358a = zh9Var;
        sgc.C16839a c16839a = sgc.f45399w;
        gm5 gm5Var = new gm5(c16839a.m48319a());
        this.f56359b = gm5Var;
        this.f56361d = new acc();
        this.f56362e = new fqb(new sgc.InterfaceC16840b[16], 0);
        this.f56363f = 1L;
        fqb fqbVar = new fqb(new C18538a[16], 0);
        this.f56364g = fqbVar;
        this.f56366i = c16839a.m48319a() ? new fi9(zh9Var, gm5Var, fqbVar.m27348h()) : null;
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m58590B(z0b z0bVar, zh9 zh9Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return z0bVar.m58598A(zh9Var, z);
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m58591D(z0b z0bVar, zh9 zh9Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return z0bVar.m58599C(zh9Var, z);
    }

    /* renamed from: e */
    public static /* synthetic */ void m58594e(z0b z0bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        z0bVar.m58602d(z);
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m58595t(z0b z0bVar, zh9 zh9Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return z0bVar.m58616s(zh9Var, z);
    }

    /* renamed from: w */
    public static /* synthetic */ boolean m58596w(z0b z0bVar, zh9 zh9Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return z0bVar.m58618v(zh9Var, z);
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m58597y(z0b z0bVar, zh9 zh9Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return z0bVar.m58619x(zh9Var, z);
    }

    /* renamed from: A */
    public final boolean m58598A(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "layoutNode");
        int i = C18539b.f56370a[zh9Var.m59415H().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            fi9 fi9Var = this.f56366i;
            if (fi9Var != null) {
                fi9Var.m26746a();
            }
        } else {
            if (i != 5) {
                throw new szb();
            }
            if (z || !(zh9Var.m59422O() || zh9Var.m59414G())) {
                zh9Var.y0();
                if (zh9Var.mo49883a()) {
                    zh9 zh9VarM59431X = zh9Var.m59431X();
                    if (!(zh9VarM59431X != null && zh9VarM59431X.m59414G())) {
                        if (!(zh9VarM59431X != null && zh9VarM59431X.m59422O())) {
                            this.f56359b.m29035c(zh9Var, false);
                        }
                    }
                }
                if (!this.f56360c) {
                    return true;
                }
            } else {
                fi9 fi9Var2 = this.f56366i;
                if (fi9Var2 != null) {
                    fi9Var2.m26746a();
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m58599C(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "layoutNode");
        int i = C18539b.f56370a[zh9Var.m59415H().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.f56364g.m27344c(new C18538a(zh9Var, false, z));
                fi9 fi9Var = this.f56366i;
                if (fi9Var != null) {
                    fi9Var.m26746a();
                }
            } else {
                if (i != 5) {
                    throw new szb();
                }
                if (!zh9Var.m59422O() || z) {
                    zh9Var.B0();
                    if (zh9Var.mo49883a() || m58606i(zh9Var)) {
                        zh9 zh9VarM59431X = zh9Var.m59431X();
                        if (!(zh9VarM59431X != null && zh9VarM59431X.m59422O())) {
                            this.f56359b.m29035c(zh9Var, false);
                        }
                    }
                    if (!this.f56360c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m58600E(long j) {
        bu3 bu3Var = this.f56365h;
        if (bu3Var == null ? false : bu3.m19793e(bu3Var.m19803o(), j)) {
            return;
        }
        if (!(!this.f56360c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f56365h = bu3.m19790b(j);
        if (this.f56358a.m59419L() != null) {
            this.f56358a.A0();
        }
        this.f56358a.B0();
        gm5 gm5Var = this.f56359b;
        zh9 zh9Var = this.f56358a;
        gm5Var.m29035c(zh9Var, zh9Var.m59419L() != null);
    }

    /* renamed from: c */
    public final void m58601c() {
        fqb fqbVar = this.f56362e;
        int iM27354o = fqbVar.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVar.m27353n();
            int i = 0;
            do {
                ((sgc.InterfaceC16840b) objArrM27353n[i]).mo48320d();
                i++;
            } while (i < iM27354o);
        }
        this.f56362e.m27349i();
    }

    /* renamed from: d */
    public final void m58602d(boolean z) {
        if (z) {
            this.f56361d.m16874e(this.f56358a);
        }
        this.f56361d.m16870a();
    }

    /* renamed from: f */
    public final boolean m58603f(zh9 zh9Var, bu3 bu3Var) {
        if (zh9Var.m59419L() == null) {
            return false;
        }
        boolean zV0 = bu3Var != null ? zh9Var.v0(bu3Var) : zh9.w0(zh9Var, null, 1, null);
        zh9 zh9VarM59431X = zh9Var.m59431X();
        if (zV0 && zh9VarM59431X != null) {
            if (zh9VarM59431X.m59419L() == null) {
                m58591D(this, zh9VarM59431X, false, 2, null);
            } else if (zh9Var.m59425R() == zh9.EnumC18642g.InMeasureBlock) {
                m58597y(this, zh9VarM59431X, false, 2, null);
            } else if (zh9Var.m59425R() == zh9.EnumC18642g.InLayoutBlock) {
                m58596w(this, zh9VarM59431X, false, 2, null);
            }
        }
        return zV0;
    }

    /* renamed from: g */
    public final boolean m58604g(zh9 zh9Var, bu3 bu3Var) {
        boolean zI0 = bu3Var != null ? zh9Var.I0(bu3Var) : zh9.J0(zh9Var, null, 1, null);
        zh9 zh9VarM59431X = zh9Var.m59431X();
        if (zI0 && zh9VarM59431X != null) {
            if (zh9Var.m59424Q() == zh9.EnumC18642g.InMeasureBlock) {
                m58591D(this, zh9VarM59431X, false, 2, null);
            } else if (zh9Var.m59424Q() == zh9.EnumC18642g.InLayoutBlock) {
                m58590B(this, zh9VarM59431X, false, 2, null);
            }
        }
        return zI0;
    }

    /* renamed from: h */
    public final void m58605h(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "layoutNode");
        if (this.f56359b.m29038f()) {
            return;
        }
        if (!this.f56360c) {
            throw new IllegalStateException("Check failed.".toString());
        }
        C18540c c18540c = new C18540c(z);
        if (!(!((Boolean) c18540c.invoke(zh9Var)).booleanValue())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        fqb fqbVarE0 = zh9Var.e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var2 = (zh9) objArrM27353n[i];
                if (((Boolean) c18540c.invoke(zh9Var2)).booleanValue() && this.f56359b.m29041i(zh9Var2, z)) {
                    m58616s(zh9Var2, z);
                }
                if (!((Boolean) c18540c.invoke(zh9Var2)).booleanValue()) {
                    m58605h(zh9Var2, z);
                }
                i++;
            } while (i < iM27354o);
        }
        if (((Boolean) c18540c.invoke(zh9Var)).booleanValue() && this.f56359b.m29041i(zh9Var, z)) {
            m58595t(this, zh9Var, false, 2, null);
        }
    }

    /* renamed from: i */
    public final boolean m58606i(zh9 zh9Var) {
        return zh9Var.m59422O() && m58610m(zh9Var);
    }

    /* renamed from: j */
    public final boolean m58607j(zh9 zh9Var) {
        u90 u90VarMo23283b;
        if (!zh9Var.m59417J()) {
            return false;
        }
        if (zh9Var.m59425R() != zh9.EnumC18642g.InMeasureBlock) {
            v90 v90VarM23275z = zh9Var.m59413F().m23275z();
            if (!((v90VarM23275z == null || (u90VarMo23283b = v90VarM23275z.mo23283b()) == null || !u90VarMo23283b.m51222k()) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m58608k() {
        return this.f56359b.m29039g();
    }

    /* renamed from: l */
    public final boolean m58609l() {
        return this.f56361d.m16872c();
    }

    /* renamed from: m */
    public final boolean m58610m(zh9 zh9Var) {
        return zh9Var.m59424Q() == zh9.EnumC18642g.InMeasureBlock || zh9Var.m59413F().m23266q().mo23283b().m51222k();
    }

    /* renamed from: n */
    public final long m58611n() {
        if (this.f56360c) {
            return this.f56363f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    /* renamed from: o */
    public final boolean m58612o(uk7 uk7Var) {
        boolean z;
        if (!this.f56358a.s0()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.f56358a.mo49883a()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f56360c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z2 = false;
        if (this.f56365h != null) {
            this.f56360c = true;
            try {
                if (this.f56359b.m29039g()) {
                    gm5 gm5Var = this.f56359b;
                    z = false;
                    while (gm5Var.m29039g()) {
                        boolean z3 = !gm5Var.f25441a.m27039d();
                        zh9 zh9VarM27040e = (z3 ? gm5Var.f25441a : gm5Var.f25442b).m27040e();
                        boolean zM58616s = m58616s(zh9VarM27040e, z3);
                        if (zh9VarM27040e == this.f56358a && zM58616s) {
                            z = true;
                        }
                    }
                    if (uk7Var != null) {
                        uk7Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.f56360c = false;
                fi9 fi9Var = this.f56366i;
                if (fi9Var != null) {
                    fi9Var.m26746a();
                }
                z2 = z;
            } catch (Throwable th) {
                this.f56360c = false;
                throw th;
            }
        }
        m58601c();
        return z2;
    }

    /* renamed from: p */
    public final void m58613p() {
        if (!this.f56358a.s0()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.f56358a.mo49883a()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f56360c)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f56365h != null) {
            this.f56360c = true;
            try {
                m58615r(this.f56358a);
                this.f56360c = false;
                fi9 fi9Var = this.f56366i;
                if (fi9Var != null) {
                    fi9Var.m26746a();
                }
            } catch (Throwable th) {
                this.f56360c = false;
                throw th;
            }
        }
    }

    /* renamed from: q */
    public final void m58614q(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
        this.f56359b.m29040h(zh9Var);
    }

    /* renamed from: r */
    public final void m58615r(zh9 zh9Var) {
        m58617u(zh9Var);
        fqb fqbVarE0 = zh9Var.e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                zh9 zh9Var2 = (zh9) objArrM27353n[i];
                if (m58610m(zh9Var2)) {
                    m58615r(zh9Var2);
                }
                i++;
            } while (i < iM27354o);
        }
        m58617u(zh9Var);
    }

    /* renamed from: s */
    public final boolean m58616s(zh9 zh9Var, boolean z) {
        bu3 bu3Var;
        boolean zM58603f;
        boolean zM58604g;
        int i = 0;
        if (!zh9Var.mo49883a() && !m58606i(zh9Var) && !sq8.m48644c(zh9Var.t0(), Boolean.TRUE) && !m58607j(zh9Var) && !zh9Var.m59441r()) {
            return false;
        }
        if (zh9Var.m59417J() || zh9Var.m59422O()) {
            if (zh9Var == this.f56358a) {
                bu3Var = this.f56365h;
                sq8.m48646e(bu3Var);
            } else {
                bu3Var = null;
            }
            zM58603f = (zh9Var.m59417J() && z) ? m58603f(zh9Var, bu3Var) : false;
            zM58604g = m58604g(zh9Var, bu3Var);
        } else {
            zM58604g = false;
            zM58603f = false;
        }
        if ((zM58603f || zh9Var.m59416I()) && sq8.m48644c(zh9Var.t0(), Boolean.TRUE) && z) {
            zh9Var.x0();
        }
        if (zh9Var.m59414G() && zh9Var.mo49883a()) {
            if (zh9Var == this.f56358a) {
                zh9Var.G0(0, 0);
            } else {
                zh9Var.M0();
            }
            this.f56361d.m16873d(zh9Var);
            fi9 fi9Var = this.f56366i;
            if (fi9Var != null) {
                fi9Var.m26746a();
            }
        }
        if (this.f56364g.m27357r()) {
            fqb fqbVar = this.f56364g;
            int iM27354o = fqbVar.m27354o();
            if (iM27354o > 0) {
                Object[] objArrM27353n = fqbVar.m27353n();
                do {
                    C18538a c18538a = (C18538a) objArrM27353n[i];
                    if (c18538a.m58621a().s0()) {
                        if (c18538a.m58623c()) {
                            m58619x(c18538a.m58621a(), c18538a.m58622b());
                        } else {
                            m58599C(c18538a.m58621a(), c18538a.m58622b());
                        }
                    }
                    i++;
                } while (i < iM27354o);
            }
            this.f56364g.m27349i();
        }
        return zM58604g;
    }

    /* renamed from: u */
    public final void m58617u(zh9 zh9Var) {
        bu3 bu3Var;
        if (zh9Var.m59422O() || zh9Var.m59417J()) {
            if (zh9Var == this.f56358a) {
                bu3Var = this.f56365h;
                sq8.m48646e(bu3Var);
            } else {
                bu3Var = null;
            }
            if (zh9Var.m59417J()) {
                m58603f(zh9Var, bu3Var);
            }
            m58604g(zh9Var, bu3Var);
        }
    }

    /* renamed from: v */
    public final boolean m58618v(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "layoutNode");
        int i = C18539b.f56370a[zh9Var.m59415H().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new szb();
                    }
                }
            }
            if ((zh9Var.m59417J() || zh9Var.m59416I()) && !z) {
                fi9 fi9Var = this.f56366i;
                if (fi9Var == null) {
                    return false;
                }
                fi9Var.m26746a();
                return false;
            }
            zh9Var.z0();
            zh9Var.y0();
            if (sq8.m48644c(zh9Var.t0(), Boolean.TRUE)) {
                zh9 zh9VarM59431X = zh9Var.m59431X();
                if (!(zh9VarM59431X != null && zh9VarM59431X.m59417J())) {
                    if (!(zh9VarM59431X != null && zh9VarM59431X.m59416I())) {
                        this.f56359b.m29035c(zh9Var, true);
                    }
                }
            }
            return !this.f56360c;
        }
        fi9 fi9Var2 = this.f56366i;
        if (fi9Var2 == null) {
            return false;
        }
        fi9Var2.m26746a();
        return false;
    }

    /* renamed from: x */
    public final boolean m58619x(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "layoutNode");
        if (!(zh9Var.m59419L() != null)) {
            throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
        }
        int i = C18539b.f56370a[zh9Var.m59415H().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                this.f56364g.m27344c(new C18538a(zh9Var, true, z));
                fi9 fi9Var = this.f56366i;
                if (fi9Var != null) {
                    fi9Var.m26746a();
                }
            } else {
                if (i != 5) {
                    throw new szb();
                }
                if (!zh9Var.m59417J() || z) {
                    zh9Var.A0();
                    zh9Var.B0();
                    if (sq8.m48644c(zh9Var.t0(), Boolean.TRUE) || m58607j(zh9Var)) {
                        zh9 zh9VarM59431X = zh9Var.m59431X();
                        if (!(zh9VarM59431X != null && zh9VarM59431X.m59417J())) {
                            this.f56359b.m29035c(zh9Var, true);
                        }
                    }
                    if (!this.f56360c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: z */
    public final void m58620z(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "layoutNode");
        this.f56361d.m16873d(zh9Var);
    }
}
