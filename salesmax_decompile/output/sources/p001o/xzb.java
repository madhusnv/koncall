package p001o;

import java.util.LinkedHashMap;
import java.util.Map;
import p001o.alb;

/* loaded from: classes2.dex */
public abstract class xzb extends vla implements y0b, mh9, vgc, xk7 {
    public static final C18274e n0 = new C18274e(null);
    public static final xk7 o0 = C18273d.f54616a;
    public static final xk7 p0 = C18272c.f54615a;
    public static final dte q0 = new dte();
    public static final jh9 r0 = new jh9();
    public static final float[] s0 = qza.m45993b(null, 1, null);
    public static final InterfaceC18275f t0 = new C18270a();
    public static final InterfaceC18275f u0 = new C18271b();

    /* renamed from: H */
    public xk7 f54603H;

    /* renamed from: L */
    public zl5 f54604L;

    /* renamed from: M */
    public qh9 f54605M;

    /* renamed from: Q */
    public float f54606Q;

    /* renamed from: X */
    public b1b f54607X;

    /* renamed from: Y */
    public Map f54608Y;

    /* renamed from: Z */
    public long f54609Z;

    /* renamed from: h */
    public final zh9 f54610h;
    public float h0;
    public vpb i0;
    public jh9 j0;
    public final uk7 k0;
    public boolean l0;
    public rgc m0;

    /* renamed from: q */
    public xzb f54611q;

    /* renamed from: s */
    public xzb f54612s;

    /* renamed from: x */
    public boolean f54613x;

    /* renamed from: y */
    public boolean f54614y;

    /* renamed from: o.xzb$a */
    public static final class C18270a implements InterfaceC18275f {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p001o.xzb.InterfaceC18275f
        /* renamed from: a */
        public boolean mo57035a(alb.AbstractC12216c abstractC12216c) {
            sq8.m48649h(abstractC12216c, "node");
            int iM60153a = zzb.m60153a(16);
            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216c; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                if (abstractC12216cM48434f instanceof bdd) {
                    if (((bdd) abstractC12216cM48434f).mo18660e()) {
                        return true;
                    }
                } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                }
            }
            return false;
        }

        @Override // p001o.xzb.InterfaceC18275f
        /* renamed from: b */
        public int mo57036b() {
            return zzb.m60153a(16);
        }

        @Override // p001o.xzb.InterfaceC18275f
        /* renamed from: c */
        public boolean mo57037c(zh9 zh9Var) {
            sq8.m48649h(zh9Var, "parentLayoutNode");
            return true;
        }

        @Override // p001o.xzb.InterfaceC18275f
        /* renamed from: d */
        public void mo57038d(zh9 zh9Var, long j, uy7 uy7Var, boolean z, boolean z2) {
            sq8.m48649h(zh9Var, "layoutNode");
            sq8.m48649h(uy7Var, "hitTestResult");
            zh9Var.f0(j, uy7Var, z, z2);
        }
    }

    /* renamed from: o.xzb$b */
    public static final class C18271b implements InterfaceC18275f {
        @Override // p001o.xzb.InterfaceC18275f
        /* renamed from: a */
        public boolean mo57035a(alb.AbstractC12216c abstractC12216c) {
            sq8.m48649h(abstractC12216c, "node");
            return false;
        }

        @Override // p001o.xzb.InterfaceC18275f
        /* renamed from: b */
        public int mo57036b() {
            return zzb.m60153a(8);
        }

        @Override // p001o.xzb.InterfaceC18275f
        /* renamed from: c */
        public boolean mo57037c(zh9 zh9Var) {
            sq8.m48649h(zh9Var, "parentLayoutNode");
            kcf kcfVarM59446x = zh9Var.m59446x();
            boolean z = false;
            if (kcfVarM59446x != null && kcfVarM59446x.m35419r()) {
                z = true;
            }
            return !z;
        }

        @Override // p001o.xzb.InterfaceC18275f
        /* renamed from: d */
        public void mo57038d(zh9 zh9Var, long j, uy7 uy7Var, boolean z, boolean z2) {
            sq8.m48649h(zh9Var, "layoutNode");
            sq8.m48649h(uy7Var, "hitTestResult");
            zh9Var.h0(j, uy7Var, z, z2);
        }
    }

    /* renamed from: o.xzb$c */
    public static final class C18272c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18272c f54615a = new C18272c();

        public C18272c() {
            super(1);
        }

        /* renamed from: a */
        public final void m57039a(xzb xzbVar) {
            sq8.m48649h(xzbVar, "coordinator");
            rgc rgcVarJ0 = xzbVar.J0();
            if (rgcVarJ0 != null) {
                rgcVarJ0.invalidate();
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m57039a((xzb) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.xzb$d */
    public static final class C18273d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18273d f54616a = new C18273d();

        public C18273d() {
            super(1);
        }

        /* renamed from: a */
        public final void m57040a(xzb xzbVar) {
            sq8.m48649h(xzbVar, "coordinator");
            if (xzbVar.mo40261s()) {
                jh9 jh9Var = xzbVar.j0;
                if (jh9Var == null) {
                    xzb.D1(xzbVar, false, 1, null);
                    return;
                }
                xzb.r0.m33839b(jh9Var);
                xzb.D1(xzbVar, false, 1, null);
                if (xzb.r0.m33840c(jh9Var)) {
                    return;
                }
                zh9 zh9VarA0 = xzbVar.a0();
                di9 di9VarM59413F = zh9VarA0.m59413F();
                if (di9VarM59413F.m23267r() > 0) {
                    if (di9VarM59413F.m23268s() || di9VarM59413F.m23269t()) {
                        zh9.S0(zh9VarA0, false, 1, null);
                    }
                    di9VarM59413F.m23246D().k0();
                }
                sgc sgcVarM59430W = zh9VarA0.m59430W();
                if (sgcVarM59430W != null) {
                    sgcVarM59430W.mo5075t(zh9VarA0);
                }
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m57040a((xzb) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.xzb$e */
    public static final class C18274e {
        public C18274e() {
        }

        public /* synthetic */ C18274e(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC18275f m57041a() {
            return xzb.t0;
        }

        /* renamed from: b */
        public final InterfaceC18275f m57042b() {
            return xzb.u0;
        }
    }

    /* renamed from: o.xzb$f */
    public interface InterfaceC18275f {
        /* renamed from: a */
        boolean mo57035a(alb.AbstractC12216c abstractC12216c);

        /* renamed from: b */
        int mo57036b();

        /* renamed from: c */
        boolean mo57037c(zh9 zh9Var);

        /* renamed from: d */
        void mo57038d(zh9 zh9Var, long j, uy7 uy7Var, boolean z, boolean z2);
    }

    /* renamed from: o.xzb$g */
    public static final class C18276g extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ alb.AbstractC12216c f54618b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC18275f f54619c;

        /* renamed from: d */
        public final /* synthetic */ long f54620d;

        /* renamed from: e */
        public final /* synthetic */ uy7 f54621e;

        /* renamed from: f */
        public final /* synthetic */ boolean f54622f;

        /* renamed from: g */
        public final /* synthetic */ boolean f54623g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18276g(alb.AbstractC12216c abstractC12216c, InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2) {
            super(0);
            this.f54618b = abstractC12216c;
            this.f54619c = interfaceC18275f;
            this.f54620d = j;
            this.f54621e = uy7Var;
            this.f54622f = z;
            this.f54623g = z2;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69050invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69050invoke() {
            xzb.this.W0(yzb.m58561b(this.f54618b, this.f54619c.mo57036b(), zzb.m60153a(2)), this.f54619c, this.f54620d, this.f54621e, this.f54622f, this.f54623g);
        }
    }

    /* renamed from: o.xzb$h */
    public static final class C18277h extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ alb.AbstractC12216c f54625b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC18275f f54626c;

        /* renamed from: d */
        public final /* synthetic */ long f54627d;

        /* renamed from: e */
        public final /* synthetic */ uy7 f54628e;

        /* renamed from: f */
        public final /* synthetic */ boolean f54629f;

        /* renamed from: g */
        public final /* synthetic */ boolean f54630g;

        /* renamed from: h */
        public final /* synthetic */ float f54631h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18277h(alb.AbstractC12216c abstractC12216c, InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2, float f) {
            super(0);
            this.f54625b = abstractC12216c;
            this.f54626c = interfaceC18275f;
            this.f54627d = j;
            this.f54628e = uy7Var;
            this.f54629f = z;
            this.f54630g = z2;
            this.f54631h = f;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69051invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69051invoke() {
            xzb.this.X0(yzb.m58561b(this.f54625b, this.f54626c.mo57036b(), zzb.m60153a(2)), this.f54626c, this.f54627d, this.f54628e, this.f54629f, this.f54630g, this.f54631h);
        }
    }

    /* renamed from: o.xzb$i */
    public static final class C18278i extends kf9 implements uk7 {
        public C18278i() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69052invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69052invoke() {
            xzb xzbVarR0 = xzb.this.R0();
            if (xzbVarR0 != null) {
                xzbVarR0.a1();
            }
        }
    }

    /* renamed from: o.xzb$j */
    public static final class C18279j extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ mc2 f54634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18279j(mc2 mc2Var) {
            super(0);
            this.f54634b = mc2Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69053invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69053invoke() {
            xzb.this.B0(this.f54634b);
        }
    }

    /* renamed from: o.xzb$k */
    public static final class C18280k extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ alb.AbstractC12216c f54636b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC18275f f54637c;

        /* renamed from: d */
        public final /* synthetic */ long f54638d;

        /* renamed from: e */
        public final /* synthetic */ uy7 f54639e;

        /* renamed from: f */
        public final /* synthetic */ boolean f54640f;

        /* renamed from: g */
        public final /* synthetic */ boolean f54641g;

        /* renamed from: h */
        public final /* synthetic */ float f54642h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18280k(alb.AbstractC12216c abstractC12216c, InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2, float f) {
            super(0);
            this.f54636b = abstractC12216c;
            this.f54637c = interfaceC18275f;
            this.f54638d = j;
            this.f54639e = uy7Var;
            this.f54640f = z;
            this.f54641g = z2;
            this.f54642h = f;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69054invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69054invoke() {
            xzb.this.w1(yzb.m58561b(this.f54636b, this.f54637c.mo57036b(), zzb.m60153a(2)), this.f54637c, this.f54638d, this.f54639e, this.f54640f, this.f54641g, this.f54642h);
        }
    }

    /* renamed from: o.xzb$l */
    public static final class C18281l extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ xk7 f54643a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18281l(xk7 xk7Var) {
            super(0);
            this.f54643a = xk7Var;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m69055invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m69055invoke() {
            this.f54643a.invoke(xzb.q0);
        }
    }

    public xzb(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "layoutNode");
        this.f54610h = zh9Var;
        this.f54604L = a0().m59447y();
        this.f54605M = a0().getLayoutDirection();
        this.f54606Q = 0.8f;
        this.f54609Z = gl8.f25414a.m29003a();
        this.k0 = new C18278i();
    }

    public static /* synthetic */ void B1(xzb xzbVar, xk7 xk7Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        xzbVar.A1(xk7Var, z);
    }

    public static /* synthetic */ void D1(xzb xzbVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        xzbVar.C1(z);
    }

    public static /* synthetic */ void q1(xzb xzbVar, vpb vpbVar, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        xzbVar.p1(vpbVar, z, z2);
    }

    public final void A0(mc2 mc2Var, ewc ewcVar) {
        sq8.m48649h(mc2Var, "canvas");
        sq8.m48649h(ewcVar, "paint");
        mc2Var.m38704f(new mfe(0.5f, 0.5f, ml8.m39312e(m44972N()) - 0.5f, ml8.m39311d(m44972N()) - 0.5f), ewcVar);
    }

    public final void A1(xk7 xk7Var, boolean z) {
        sgc sgcVarM59430W;
        zh9 zh9VarA0 = a0();
        boolean z2 = (!z && this.f54603H == xk7Var && sq8.m48644c(this.f54604L, zh9VarA0.m59447y()) && this.f54605M == zh9VarA0.getLayoutDirection()) ? false : true;
        this.f54603H = xk7Var;
        this.f54604L = zh9VarA0.m59447y();
        this.f54605M = zh9VarA0.getLayoutDirection();
        if (!mo39062f() || xk7Var == null) {
            rgc rgcVar = this.m0;
            if (rgcVar != null) {
                rgcVar.mo5107f();
                zh9VarA0.a1(true);
                this.k0.invoke();
                if (mo39062f() && (sgcVarM59430W = zh9VarA0.m59430W()) != null) {
                    sgcVarM59430W.mo5065d(zh9VarA0);
                }
            }
            this.m0 = null;
            this.l0 = false;
            return;
        }
        if (this.m0 != null) {
            if (z2) {
                D1(this, false, 1, null);
                return;
            }
            return;
        }
        rgc rgcVarMo5067i = ci9.m21298b(zh9VarA0).mo5067i(this, this.k0);
        rgcVarMo5067i.mo5105d(m44972N());
        rgcVarMo5067i.mo5110i(d0());
        this.m0 = rgcVarMo5067i;
        D1(this, false, 1, null);
        zh9VarA0.a1(true);
        this.k0.invoke();
    }

    public final void B0(mc2 mc2Var) {
        alb.AbstractC12216c abstractC12216cU0 = U0(zzb.m60153a(4));
        if (abstractC12216cU0 == null) {
            m1(mc2Var);
        } else {
            a0().m59420M().m19174a(mc2Var, nl8.m40750b(mo39063i()), this, abstractC12216cU0);
        }
    }

    public abstract void C0();

    public final void C1(boolean z) {
        sgc sgcVarM59430W;
        rgc rgcVar = this.m0;
        if (rgcVar == null) {
            if (!(this.f54603H == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            return;
        }
        xk7 xk7Var = this.f54603H;
        if (xk7Var == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        dte dteVar = q0;
        dteVar.m23806n();
        dteVar.m23812w(a0().m59447y());
        dteVar.m23793M(nl8.m40750b(mo39063i()));
        O0().m54368h(this, o0, new C18281l(xk7Var));
        jh9 jh9Var = this.j0;
        if (jh9Var == null) {
            jh9Var = new jh9();
            this.j0 = jh9Var;
        }
        jh9Var.m33838a(dteVar);
        float fMo19862p = dteVar.mo19862p();
        float fMo19857G = dteVar.mo19857G();
        float fM23798a = dteVar.m23798a();
        float fMo19855B = dteVar.mo19855B();
        float fMo19863y = dteVar.mo19863y();
        float fM23803f = dteVar.m23803f();
        long jM23799b = dteVar.m23799b();
        long jM23805j = dteVar.m23805j();
        float fMo19856C = dteVar.mo19856C();
        float fMo19858h = dteVar.mo19858h();
        float fMo19859k = dteVar.mo19859k();
        float fMo19860l = dteVar.mo19860l();
        long jMo19861m = dteVar.mo19861m();
        xkf xkfVarM23804i = dteVar.m23804i();
        boolean zM23800c = dteVar.m23800c();
        dteVar.m23802e();
        rgcVar.mo5103b(fMo19862p, fMo19857G, fM23798a, fMo19855B, fMo19863y, fM23803f, fMo19856C, fMo19858h, fMo19859k, fMo19860l, jMo19861m, xkfVarM23804i, zM23800c, null, jM23799b, jM23805j, dteVar.m23801d(), a0().getLayoutDirection(), a0().m59447y());
        this.f54614y = dteVar.m23800c();
        this.f54606Q = dteVar.m23798a();
        if (!z || (sgcVarM59430W = a0().m59430W()) == null) {
            return;
        }
        sgcVarM59430W.mo5065d(a0());
    }

    @Override // p001o.mh9
    /* renamed from: D */
    public long mo39060D(mh9 mh9Var, long j) {
        sq8.m48649h(mh9Var, "sourceCoordinates");
        if (mh9Var instanceof xla) {
            return s9c.m48059r(mh9Var.mo39060D(this, s9c.m48059r(j)));
        }
        xzb xzbVarX1 = x1(mh9Var);
        xzbVarX1.f1();
        xzb xzbVarD0 = D0(xzbVarX1);
        while (xzbVarX1 != xzbVarD0) {
            j = xzbVarX1.y1(j);
            xzbVarX1 = xzbVarX1.f54612s;
            sq8.m48646e(xzbVarX1);
        }
        return w0(xzbVarD0, j);
    }

    public final xzb D0(xzb xzbVar) {
        sq8.m48649h(xzbVar, "other");
        zh9 zh9VarA0 = xzbVar.a0();
        zh9 zh9VarA02 = a0();
        if (zh9VarA0 == zh9VarA02) {
            alb.AbstractC12216c abstractC12216cP0 = xzbVar.P0();
            alb.AbstractC12216c abstractC12216cP02 = P0();
            int iM60153a = zzb.m60153a(2);
            if (!abstractC12216cP02.mo17377h().m17361J()) {
                throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
            }
            for (alb.AbstractC12216c abstractC12216cM17358G = abstractC12216cP02.mo17377h().m17358G(); abstractC12216cM17358G != null; abstractC12216cM17358G = abstractC12216cM17358G.m17358G()) {
                if ((abstractC12216cM17358G.m17356E() & iM60153a) != 0 && abstractC12216cM17358G == abstractC12216cP0) {
                    return xzbVar;
                }
            }
            return this;
        }
        while (zh9VarA0.m59448z() > zh9VarA02.m59448z()) {
            zh9VarA0 = zh9VarA0.m59431X();
            sq8.m48646e(zh9VarA0);
        }
        while (zh9VarA02.m59448z() > zh9VarA0.m59448z()) {
            zh9VarA02 = zh9VarA02.m59431X();
            sq8.m48646e(zh9VarA02);
        }
        while (zh9VarA0 != zh9VarA02) {
            zh9VarA0 = zh9VarA0.m59431X();
            zh9VarA02 = zh9VarA02.m59431X();
            if (zh9VarA0 == null || zh9VarA02 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return zh9VarA02 == a0() ? this : zh9VarA0 == xzbVar.a0() ? xzbVar : zh9VarA0.m59410C();
    }

    public long E0(long j) {
        long jM30758b = hl8.m30758b(j, d0());
        rgc rgcVar = this.m0;
        return rgcVar != null ? rgcVar.mo5104c(jM30758b, true) : jM30758b;
    }

    public final boolean E1(long j) {
        if (!v9c.m52475b(j)) {
            return false;
        }
        rgc rgcVar = this.m0;
        return rgcVar == null || !this.f54614y || rgcVar.mo5108g(j);
    }

    @Override // p001o.mh9
    /* renamed from: F */
    public long mo39061F(long j) {
        if (!mo39062f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        f1();
        for (xzb xzbVar = this; xzbVar != null; xzbVar = xzbVar.f54612s) {
            j = xzbVar.y1(j);
        }
        return j;
    }

    public final void F0(vpb vpbVar, boolean z) {
        float fM29001f = gl8.m29001f(d0());
        vpbVar.m53188i(vpbVar.m53181b() - fM29001f);
        vpbVar.m53189j(vpbVar.m53182c() - fM29001f);
        float fM29002g = gl8.m29002g(d0());
        vpbVar.m53190k(vpbVar.m53183d() - fM29002g);
        vpbVar.m53187h(vpbVar.m53180a() - fM29002g);
        rgc rgcVar = this.m0;
        if (rgcVar != null) {
            rgcVar.mo5109h(vpbVar, true);
            if (this.f54614y && z) {
                vpbVar.m53184e(0.0f, 0.0f, ml8.m39312e(mo39063i()), ml8.m39311d(mo39063i()));
                vpbVar.m53185f();
            }
        }
    }

    public v90 G0() {
        return a0().m59413F().m23266q();
    }

    public final boolean H0() {
        return this.l0;
    }

    public final long I0() {
        return m44973P();
    }

    public final rgc J0() {
        return this.m0;
    }

    public abstract wla K0();

    public final long L0() {
        return this.f54604L.mo19173E(a0().a0().mo59450a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object M0() {
        if (!a0().m59428U().m4993q(zzb.m60153a(64))) {
            return null;
        }
        P0();
        gge ggeVar = new gge();
        for (alb.AbstractC12216c abstractC12216cM4991o = a0().m59428U().m4991o(); abstractC12216cM4991o != null; abstractC12216cM4991o = abstractC12216cM4991o.m17358G()) {
            if ((zzb.m60153a(64) & abstractC12216cM4991o.m17356E()) != 0) {
                int iM60153a = zzb.m60153a(64);
                for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM4991o; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                    if (abstractC12216cM48434f instanceof uwc) {
                        ggeVar.f25106a = ((uwc) abstractC12216cM48434f).mo40260o(a0().m59447y(), ggeVar.f25106a);
                    } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                    }
                }
            }
        }
        return ggeVar.f25106a;
    }

    public final vpb N0() {
        vpb vpbVar = this.i0;
        if (vpbVar != null) {
            return vpbVar;
        }
        vpb vpbVar2 = new vpb(0.0f, 0.0f, 0.0f, 0.0f);
        this.i0 = vpbVar2;
        return vpbVar2;
    }

    public final wgc O0() {
        return ci9.m21298b(a0()).getSnapshotObserver();
    }

    public abstract alb.AbstractC12216c P0();

    public final xzb Q0() {
        return this.f54611q;
    }

    public final xzb R0() {
        return this.f54612s;
    }

    @Override // p001o.q8d
    /* renamed from: S */
    public void mo21320S(long j, float f, xk7 xk7Var) {
        n1(j, f, xk7Var);
    }

    public final float S0() {
        return this.h0;
    }

    public final boolean T0(int i) {
        alb.AbstractC12216c abstractC12216cV0 = V0(a0c.m16306i(i));
        return abstractC12216cV0 != null && sk5.m48433e(abstractC12216cV0, i);
    }

    public final alb.AbstractC12216c U0(int i) {
        boolean zM16306i = a0c.m16306i(i);
        alb.AbstractC12216c abstractC12216cP0 = P0();
        if (!zM16306i && (abstractC12216cP0 = abstractC12216cP0.m17358G()) == null) {
            return null;
        }
        for (alb.AbstractC12216c abstractC12216cV0 = V0(zM16306i); abstractC12216cV0 != null && (abstractC12216cV0.m17352A() & i) != 0; abstractC12216cV0 = abstractC12216cV0.m17353B()) {
            if ((abstractC12216cV0.m17356E() & i) != 0) {
                return abstractC12216cV0;
            }
            if (abstractC12216cV0 == abstractC12216cP0) {
                return null;
            }
        }
        return null;
    }

    public final alb.AbstractC12216c V0(boolean z) {
        alb.AbstractC12216c abstractC12216cP0;
        if (a0().m59429V() == this) {
            return a0().m59428U().m4987k();
        }
        if (z) {
            xzb xzbVar = this.f54612s;
            if (xzbVar != null && (abstractC12216cP0 = xzbVar.P0()) != null) {
                return abstractC12216cP0.m17353B();
            }
        } else {
            xzb xzbVar2 = this.f54612s;
            if (xzbVar2 != null) {
                return xzbVar2.P0();
            }
        }
        return null;
    }

    public final void W0(alb.AbstractC12216c abstractC12216c, InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2) {
        if (abstractC12216c == null) {
            Z0(interfaceC18275f, j, uy7Var, z, z2);
        } else {
            uy7Var.m52137A(abstractC12216c, z2, new C18276g(abstractC12216c, interfaceC18275f, j, uy7Var, z, z2));
        }
    }

    @Override // p001o.vla
    /* renamed from: X */
    public vla mo52911X() {
        return this.f54611q;
    }

    public final void X0(alb.AbstractC12216c abstractC12216c, InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2, float f) {
        if (abstractC12216c == null) {
            Z0(interfaceC18275f, j, uy7Var, z, z2);
        } else {
            uy7Var.m52138B(abstractC12216c, f, z2, new C18277h(abstractC12216c, interfaceC18275f, j, uy7Var, z, z2, f));
        }
    }

    @Override // p001o.vla
    /* renamed from: Y */
    public mh9 mo52912Y() {
        return this;
    }

    public final void Y0(InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2) {
        sq8.m48649h(interfaceC18275f, "hitTestSource");
        sq8.m48649h(uy7Var, "hitTestResult");
        alb.AbstractC12216c abstractC12216cU0 = U0(interfaceC18275f.mo57036b());
        if (!E1(j)) {
            if (z) {
                float fY0 = y0(j, L0());
                if (((Float.isInfinite(fY0) || Float.isNaN(fY0)) ? false : true) && uy7Var.m52140G(fY0, false)) {
                    X0(abstractC12216cU0, interfaceC18275f, j, uy7Var, z, false, fY0);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC12216cU0 == null) {
            Z0(interfaceC18275f, j, uy7Var, z, z2);
            return;
        }
        if (c1(j)) {
            W0(abstractC12216cU0, interfaceC18275f, j, uy7Var, z, z2);
            return;
        }
        float fY02 = !z ? Float.POSITIVE_INFINITY : y0(j, L0());
        if (((Float.isInfinite(fY02) || Float.isNaN(fY02)) ? false : true) && uy7Var.m52140G(fY02, z2)) {
            X0(abstractC12216cU0, interfaceC18275f, j, uy7Var, z, z2, fY02);
        } else {
            w1(abstractC12216cU0, interfaceC18275f, j, uy7Var, z, z2, fY02);
        }
    }

    @Override // p001o.vla
    /* renamed from: Z */
    public boolean mo52913Z() {
        return this.f54607X != null;
    }

    public void Z0(InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2) {
        sq8.m48649h(interfaceC18275f, "hitTestSource");
        sq8.m48649h(uy7Var, "hitTestResult");
        xzb xzbVar = this.f54611q;
        if (xzbVar != null) {
            xzbVar.Y0(interfaceC18275f, xzbVar.E0(j), uy7Var, z, z2);
        }
    }

    @Override // p001o.vla
    public zh9 a0() {
        return this.f54610h;
    }

    public void a1() {
        rgc rgcVar = this.m0;
        if (rgcVar != null) {
            rgcVar.invalidate();
            return;
        }
        xzb xzbVar = this.f54612s;
        if (xzbVar != null) {
            xzbVar.a1();
        }
    }

    @Override // p001o.vla
    public b1b b0() {
        b1b b1bVar = this.f54607X;
        if (b1bVar != null) {
            return b1bVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public void b1(mc2 mc2Var) {
        sq8.m48649h(mc2Var, "canvas");
        if (!a0().mo49883a()) {
            this.l0 = true;
        } else {
            O0().m54368h(this, p0, new C18279j(mc2Var));
            this.l0 = false;
        }
    }

    @Override // p001o.vla
    public vla c0() {
        return this.f54612s;
    }

    public final boolean c1(long j) {
        float fM48052k = s9c.m48052k(j);
        float fM48053l = s9c.m48053l(j);
        return fM48052k >= 0.0f && fM48053l >= 0.0f && fM48052k < ((float) mo23294O()) && fM48053l < ((float) m44971M());
    }

    @Override // p001o.vla
    public long d0() {
        return this.f54609Z;
    }

    public final boolean d1() {
        if (this.m0 != null && this.f54606Q <= 0.0f) {
            return true;
        }
        xzb xzbVar = this.f54612s;
        if (xzbVar != null) {
            return xzbVar.d1();
        }
        return false;
    }

    public final long e1(long j) {
        float fM48052k = s9c.m48052k(j);
        float fMax = Math.max(0.0f, fM48052k < 0.0f ? -fM48052k : fM48052k - mo23294O());
        float fM48053l = s9c.m48053l(j);
        return v9c.m52474a(fMax, Math.max(0.0f, fM48053l < 0.0f ? -fM48053l : fM48053l - m44971M()));
    }

    @Override // p001o.mh9
    /* renamed from: f */
    public boolean mo39062f() {
        return !this.f54613x && a0().s0();
    }

    public final void f1() {
        a0().m59413F().m23257O();
    }

    public void g1() {
        rgc rgcVar = this.m0;
        if (rgcVar != null) {
            rgcVar.invalidate();
        }
    }

    @Override // p001o.zl5
    public float getDensity() {
        return a0().m59447y().getDensity();
    }

    @Override // p001o.rq8
    public qh9 getLayoutDirection() {
        return a0().getLayoutDirection();
    }

    @Override // p001o.vla
    public void h0() {
        mo21320S(d0(), this.h0, this.f54603H);
    }

    public final void h1() {
        A1(this.f54603H, true);
        rgc rgcVar = this.m0;
        if (rgcVar != null) {
            rgcVar.invalidate();
        }
    }

    @Override // p001o.mh9
    /* renamed from: i */
    public final long mo39063i() {
        return m44972N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i1(int i, int i2) {
        rgc rgcVar = this.m0;
        if (rgcVar != null) {
            rgcVar.mo5105d(nl8.m40749a(i, i2));
        } else {
            xzb xzbVar = this.f54612s;
            if (xzbVar != null) {
                xzbVar.a1();
            }
        }
        m44976T(nl8.m40749a(i, i2));
        C1(false);
        int iM60153a = zzb.m60153a(4);
        boolean zM16306i = a0c.m16306i(iM60153a);
        alb.AbstractC12216c abstractC12216cP0 = P0();
        if (zM16306i || (abstractC12216cP0 = abstractC12216cP0.m17358G()) != null) {
            for (alb.AbstractC12216c abstractC12216cV0 = V0(zM16306i); abstractC12216cV0 != null && (abstractC12216cV0.m17352A() & iM60153a) != 0; abstractC12216cV0 = abstractC12216cV0.m17353B()) {
                if ((abstractC12216cV0.m17356E() & iM60153a) != 0) {
                    for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cV0; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                        if (abstractC12216cM48434f instanceof yx5) {
                            ((yx5) abstractC12216cM48434f).mo40262u();
                        } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        }
                    }
                }
                if (abstractC12216cV0 == abstractC12216cP0) {
                    break;
                }
            }
        }
        sgc sgcVarM59430W = a0().m59430W();
        if (sgcVarM59430W != null) {
            sgcVarM59430W.mo5065d(a0());
        }
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b1((mc2) obj);
        return y3i.f54824a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j1() {
        alb.AbstractC12216c abstractC12216cM17358G;
        if (T0(zzb.m60153a(128))) {
            xwf xwfVarM56927a = xwf.f54441e.m56927a();
            try {
                xwf xwfVarM56921l = xwfVarM56927a.m56921l();
                try {
                    int iM60153a = zzb.m60153a(128);
                    boolean zM16306i = a0c.m16306i(iM60153a);
                    if (!zM16306i) {
                        abstractC12216cM17358G = P0().m17358G();
                        if (abstractC12216cM17358G == null) {
                        }
                        y3i y3iVar = y3i.f54824a;
                    }
                    abstractC12216cM17358G = P0();
                    for (alb.AbstractC12216c abstractC12216cV0 = V0(zM16306i); abstractC12216cV0 != null && (abstractC12216cV0.m17352A() & iM60153a) != 0; abstractC12216cV0 = abstractC12216cV0.m17353B()) {
                        if ((abstractC12216cV0.m17356E() & iM60153a) != 0) {
                            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cV0; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                                if (abstractC12216cM48434f instanceof lh9) {
                                    ((lh9) abstractC12216cM48434f).mo37217a(m44972N());
                                } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                                }
                            }
                        }
                        if (abstractC12216cV0 == abstractC12216cM17358G) {
                            break;
                        }
                    }
                    y3i y3iVar2 = y3i.f54824a;
                } finally {
                    xwfVarM56927a.m56923s(xwfVarM56921l);
                }
            } finally {
                xwfVarM56927a.mo17680d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1() {
        int iM60153a = zzb.m60153a(128);
        boolean zM16306i = a0c.m16306i(iM60153a);
        alb.AbstractC12216c abstractC12216cP0 = P0();
        if (!zM16306i && (abstractC12216cP0 = abstractC12216cP0.m17358G()) == null) {
            return;
        }
        for (alb.AbstractC12216c abstractC12216cV0 = V0(zM16306i); abstractC12216cV0 != null && (abstractC12216cV0.m17352A() & iM60153a) != 0; abstractC12216cV0 = abstractC12216cV0.m17353B()) {
            if ((abstractC12216cV0.m17356E() & iM60153a) != 0) {
                for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cV0; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                    if (abstractC12216cM48434f instanceof lh9) {
                        ((lh9) abstractC12216cM48434f).mo37218w(this);
                    } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                    }
                }
            }
            if (abstractC12216cV0 == abstractC12216cP0) {
                return;
            }
        }
    }

    public final void l1() {
        this.f54613x = true;
        if (this.m0 != null) {
            B1(this, null, false, 2, null);
        }
    }

    public abstract void m1(mc2 mc2Var);

    public final void n1(long j, float f, xk7 xk7Var) {
        B1(this, xk7Var, false, 2, null);
        if (!gl8.m29000e(d0(), j)) {
            s1(j);
            a0().m59413F().m23246D().k0();
            rgc rgcVar = this.m0;
            if (rgcVar != null) {
                rgcVar.mo5110i(j);
            } else {
                xzb xzbVar = this.f54612s;
                if (xzbVar != null) {
                    xzbVar.a1();
                }
            }
            e0(this);
            sgc sgcVarM59430W = a0().m59430W();
            if (sgcVarM59430W != null) {
                sgcVarM59430W.mo5065d(a0());
            }
        }
        this.h0 = f;
    }

    public final void o1(long j, float f, xk7 xk7Var) {
        long jM44969K = m44969K();
        n1(hl8.m30757a(gl8.m29001f(j) + gl8.m29001f(jM44969K), gl8.m29002g(j) + gl8.m29002g(jM44969K)), f, xk7Var);
    }

    public final void p1(vpb vpbVar, boolean z, boolean z2) {
        sq8.m48649h(vpbVar, "bounds");
        rgc rgcVar = this.m0;
        if (rgcVar != null) {
            if (this.f54614y) {
                if (z2) {
                    long jL0 = L0();
                    float fM25657f = evf.m25657f(jL0) / 2.0f;
                    float fM25656e = evf.m25656e(jL0) / 2.0f;
                    vpbVar.m53184e(-fM25657f, -fM25656e, ml8.m39312e(mo39063i()) + fM25657f, ml8.m39311d(mo39063i()) + fM25656e);
                } else if (z) {
                    vpbVar.m53184e(0.0f, 0.0f, ml8.m39312e(mo39063i()), ml8.m39311d(mo39063i()));
                }
                if (vpbVar.m53185f()) {
                    return;
                }
            }
            rgcVar.mo5109h(vpbVar, false);
        }
        float fM29001f = gl8.m29001f(d0());
        vpbVar.m53188i(vpbVar.m53181b() + fM29001f);
        vpbVar.m53189j(vpbVar.m53182c() + fM29001f);
        float fM29002g = gl8.m29002g(d0());
        vpbVar.m53190k(vpbVar.m53183d() + fM29002g);
        vpbVar.m53187h(vpbVar.m53180a() + fM29002g);
    }

    @Override // p001o.mh9
    /* renamed from: q */
    public mfe mo39064q(mh9 mh9Var, boolean z) {
        sq8.m48649h(mh9Var, "sourceCoordinates");
        if (!mo39062f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        if (!mh9Var.mo39062f()) {
            throw new IllegalStateException(("LayoutCoordinates " + mh9Var + " is not attached!").toString());
        }
        xzb xzbVarX1 = x1(mh9Var);
        xzbVarX1.f1();
        xzb xzbVarD0 = D0(xzbVarX1);
        vpb vpbVarN0 = N0();
        vpbVarN0.m53188i(0.0f);
        vpbVarN0.m53190k(0.0f);
        vpbVarN0.m53189j(ml8.m39312e(mh9Var.mo39063i()));
        vpbVarN0.m53187h(ml8.m39311d(mh9Var.mo39063i()));
        while (xzbVarX1 != xzbVarD0) {
            q1(xzbVarX1, vpbVarN0, z, false, 4, null);
            if (vpbVarN0.m53185f()) {
                return mfe.f35356e.m38953a();
            }
            xzbVarX1 = xzbVarX1.f54612s;
            sq8.m48646e(xzbVarX1);
        }
        v0(xzbVarD0, vpbVarN0, z);
        return wpb.m54799a(vpbVarN0);
    }

    @Override // p001o.mh9
    /* renamed from: r */
    public long mo39065r(long j) {
        return ci9.m21298b(a0()).mo5064c(mo39061F(j));
    }

    public void r1(b1b b1bVar) {
        sq8.m48649h(b1bVar, "value");
        b1b b1bVar2 = this.f54607X;
        if (b1bVar != b1bVar2) {
            this.f54607X = b1bVar;
            if (b1bVar2 == null || b1bVar.getWidth() != b1bVar2.getWidth() || b1bVar.getHeight() != b1bVar2.getHeight()) {
                i1(b1bVar.getWidth(), b1bVar.getHeight());
            }
            Map map = this.f54608Y;
            if ((!(map == null || map.isEmpty()) || (!b1bVar.mo18091b().isEmpty())) && !sq8.m48644c(b1bVar.mo18091b(), this.f54608Y)) {
                G0().mo23283b().m51224m();
                Map linkedHashMap = this.f54608Y;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.f54608Y = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(b1bVar.mo18091b());
            }
        }
    }

    @Override // p001o.vgc
    /* renamed from: s */
    public boolean mo40261s() {
        return this.m0 != null && mo39062f();
    }

    public void s1(long j) {
        this.f54609Z = j;
    }

    public final void t1(xzb xzbVar) {
        this.f54611q = xzbVar;
    }

    public final void u1(xzb xzbVar) {
        this.f54612s = xzbVar;
    }

    public final void v0(xzb xzbVar, vpb vpbVar, boolean z) {
        if (xzbVar == this) {
            return;
        }
        xzb xzbVar2 = this.f54612s;
        if (xzbVar2 != null) {
            xzbVar2.v0(xzbVar, vpbVar, z);
        }
        F0(vpbVar, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v1() {
        alb.AbstractC12216c abstractC12216cV0 = V0(a0c.m16306i(zzb.m60153a(16)));
        if (abstractC12216cV0 == null) {
            return false;
        }
        int iM60153a = zzb.m60153a(16);
        if (!abstractC12216cV0.mo17377h().m17361J()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cMo17377h = abstractC12216cV0.mo17377h();
        if ((abstractC12216cMo17377h.m17352A() & iM60153a) != 0) {
            for (alb.AbstractC12216c abstractC12216cM17353B = abstractC12216cMo17377h.m17353B(); abstractC12216cM17353B != null; abstractC12216cM17353B = abstractC12216cM17353B.m17353B()) {
                if ((abstractC12216cM17353B.m17356E() & iM60153a) != 0) {
                    for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cM17353B; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                        if (abstractC12216cM48434f instanceof bdd) {
                            if (((bdd) abstractC12216cM48434f).mo18663x()) {
                                return true;
                            }
                        } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long w0(xzb xzbVar, long j) {
        if (xzbVar == this) {
            return j;
        }
        xzb xzbVar2 = this.f54612s;
        return (xzbVar2 == null || sq8.m48644c(xzbVar, xzbVar2)) ? E0(j) : E0(xzbVar2.w0(xzbVar, j));
    }

    public final void w1(alb.AbstractC12216c abstractC12216c, InterfaceC18275f interfaceC18275f, long j, uy7 uy7Var, boolean z, boolean z2, float f) {
        if (abstractC12216c == null) {
            Z0(interfaceC18275f, j, uy7Var, z, z2);
        } else if (interfaceC18275f.mo57035a(abstractC12216c)) {
            uy7Var.m52143L(abstractC12216c, f, z2, new C18280k(abstractC12216c, interfaceC18275f, j, uy7Var, z, z2, f));
        } else {
            w1(yzb.m58561b(abstractC12216c, interfaceC18275f.mo57036b(), zzb.m60153a(2)), interfaceC18275f, j, uy7Var, z, z2, f);
        }
    }

    @Override // p001o.zl5
    /* renamed from: x */
    public float mo17436x() {
        return a0().m59447y().mo17436x();
    }

    public final long x0(long j) {
        return jvf.m34585a(Math.max(0.0f, (evf.m25657f(j) - mo23294O()) / 2.0f), Math.max(0.0f, (evf.m25656e(j) - m44971M()) / 2.0f));
    }

    public final xzb x1(mh9 mh9Var) {
        xzb xzbVarM56448a;
        xla xlaVar = mh9Var instanceof xla ? (xla) mh9Var : null;
        if (xlaVar != null && (xzbVarM56448a = xlaVar.m56448a()) != null) {
            return xzbVarM56448a;
        }
        sq8.m48647f(mh9Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (xzb) mh9Var;
    }

    public final float y0(long j, long j2) {
        if (mo23294O() >= evf.m25657f(j2) && m44971M() >= evf.m25656e(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long jX0 = x0(j2);
        float fM25657f = evf.m25657f(jX0);
        float fM25656e = evf.m25656e(jX0);
        long jE1 = e1(j);
        if ((fM25657f > 0.0f || fM25656e > 0.0f) && s9c.m48052k(jE1) <= fM25657f && s9c.m48053l(jE1) <= fM25656e) {
            return s9c.m48051j(jE1);
        }
        return Float.POSITIVE_INFINITY;
    }

    public long y1(long j) {
        rgc rgcVar = this.m0;
        if (rgcVar != null) {
            j = rgcVar.mo5104c(j, false);
        }
        return hl8.m30759c(j, d0());
    }

    @Override // p001o.mh9
    /* renamed from: z */
    public final mh9 mo39066z() {
        if (!mo39062f()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        f1();
        return a0().m59429V().f54612s;
    }

    public final void z0(mc2 mc2Var) {
        sq8.m48649h(mc2Var, "canvas");
        rgc rgcVar = this.m0;
        if (rgcVar != null) {
            rgcVar.mo5106e(mc2Var);
            return;
        }
        float fM29001f = gl8.m29001f(d0());
        float fM29002g = gl8.m29002g(d0());
        mc2Var.mo20333c(fM29001f, fM29002g);
        B0(mc2Var);
        mc2Var.mo20333c(-fM29001f, -fM29002g);
    }

    public final mfe z1() {
        if (!mo39062f()) {
            return mfe.f35356e.m38953a();
        }
        mh9 mh9VarM40601d = nh9.m40601d(this);
        vpb vpbVarN0 = N0();
        long jX0 = x0(L0());
        vpbVarN0.m53188i(-evf.m25657f(jX0));
        vpbVarN0.m53190k(-evf.m25656e(jX0));
        vpbVarN0.m53189j(mo23294O() + evf.m25657f(jX0));
        vpbVarN0.m53187h(m44971M() + evf.m25656e(jX0));
        xzb xzbVar = this;
        while (xzbVar != mh9VarM40601d) {
            xzbVar.p1(vpbVarN0, false, true);
            if (vpbVarN0.m53185f()) {
                return mfe.f35356e.m38953a();
            }
            xzbVar = xzbVar.f54612s;
            sq8.m48646e(xzbVar);
        }
        return wpb.m54799a(vpbVarN0);
    }
}
