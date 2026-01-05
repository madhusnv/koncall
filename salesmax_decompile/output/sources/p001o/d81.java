package p001o;

import java.util.Set;
import p001o.d81;
import p001o.dx7;
import p001o.gja;
import p001o.m18;
import p001o.z81;

/* loaded from: classes3.dex */
public final class d81 implements q48 {

    /* renamed from: b */
    public static final C12811a f19229b = new C12811a(null);

    /* renamed from: a */
    public final C12812b f19230a;

    /* renamed from: o.d81$a */
    public static final class C12811a {
        public C12811a() {
        }

        public /* synthetic */ C12811a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.d81$b */
    public static final class C12812b {

        /* renamed from: a */
        public v81 f19231a;

        /* renamed from: b */
        public String f19232b;

        /* renamed from: e */
        public boolean f19235e;

        /* renamed from: h */
        public boolean f19238h;

        /* renamed from: j */
        public k16 f19240j;

        /* renamed from: c */
        public t81 f19233c = t81.HTTP_REQUEST_VIA_HEADERS;

        /* renamed from: d */
        public w81 f19234d = w81.SIGV4;

        /* renamed from: f */
        public boolean f19236f = true;

        /* renamed from: g */
        public boolean f19237g = true;

        /* renamed from: i */
        public u81 f19239i = u81.NONE;

        /* renamed from: k */
        public xk7 f19241k = new xk7() { // from class: o.e81
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Boolean.valueOf(d81.C12812b.m22495p((String) obj));
            }
        };

        /* renamed from: p */
        public static final boolean m22495p(String str) {
            sq8.m48649h(str, "<unused var>");
            return true;
        }

        /* renamed from: b */
        public final w81 m22496b() {
            return this.f19234d;
        }

        /* renamed from: c */
        public final k16 m22497c() {
            return this.f19240j;
        }

        /* renamed from: d */
        public final boolean m22498d() {
            return this.f19237g;
        }

        /* renamed from: e */
        public final boolean m22499e() {
            return this.f19238h;
        }

        /* renamed from: f */
        public final String m22500f() {
            return this.f19232b;
        }

        /* renamed from: g */
        public final xk7 m22501g() {
            return this.f19241k;
        }

        /* renamed from: h */
        public final t81 m22502h() {
            return this.f19233c;
        }

        /* renamed from: i */
        public final u81 m22503i() {
            return this.f19239i;
        }

        /* renamed from: j */
        public final v81 m22504j() {
            return this.f19231a;
        }

        /* renamed from: k */
        public final boolean m22505k() {
            return this.f19236f;
        }

        /* renamed from: l */
        public final boolean m22506l() {
            return this.f19235e;
        }

        /* renamed from: m */
        public final void m22507m(w81 w81Var) {
            sq8.m48649h(w81Var, "<set-?>");
            this.f19234d = w81Var;
        }

        /* renamed from: n */
        public final void m22508n(String str) {
            this.f19232b = str;
        }

        /* renamed from: o */
        public final void m22509o(v81 v81Var) {
            this.f19231a = v81Var;
        }
    }

    /* renamed from: o.d81$c */
    public static final class C12813c extends o64 {

        /* renamed from: a */
        public Object f19242a;

        /* renamed from: b */
        public Object f19243b;

        /* renamed from: c */
        public Object f19244c;

        /* renamed from: d */
        public Object f19245d;

        /* renamed from: e */
        public /* synthetic */ Object f19246e;

        /* renamed from: g */
        public int f19248g;

        public C12813c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f19246e = obj;
            this.f19248g |= Integer.MIN_VALUE;
            return d81.this.mo22493a(null, this);
        }
    }

    public d81(C12812b c12812b) {
        sq8.m48649h(c12812b, "config");
        this.f19230a = c12812b;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0221  */
    @Override // p001o.q48
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo22493a(srf srfVar, n64 n64Var) {
        C12813c c12813c;
        z38 z38VarM48820c;
        Object obj;
        String strP0;
        gk8 gk8VarM28956m;
        z81 z81VarM58901b;
        v81 v81VarM22504j;
        qx0 qx0Var;
        d81 d81Var;
        if (n64Var instanceof C12813c) {
            c12813c = (C12813c) n64Var;
            int i = c12813c.f19248g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12813c.f19248g = i - Integer.MIN_VALUE;
            } else {
                c12813c = new C12813c(n64Var);
            }
        }
        Object obj2 = c12813c.f19246e;
        Object objM51918f = uq8.m51918f();
        int i2 = c12813c.f19248g;
        if (i2 == 0) {
            wre.m54934b(obj2);
            if (!(srfVar.m48821d() instanceof ic4)) {
                throw new IllegalArgumentException(("invalid Identity type " + kge.m35689b(srfVar.m48821d().getClass()) + "; expected " + kge.m35689b(ic4.class)).toString());
            }
            qx0 qx0VarM48822e = srfVar.m48822e();
            z38VarM48820c = srfVar.m48820c();
            m18 m18VarM58667d = z38VarM48820c.m58667d();
            x81 x81Var = x81.f53319a;
            dx7 dx7Var = (dx7) qx0VarM48822e.mo18191b(x81Var.m55800d());
            u81 u81VarM22503i = (u81) qx0VarM48822e.mo18191b(x81Var.m55804h());
            String str = (String) tx0.m50737b(qx0VarM48822e, x81Var.m55806j());
            Set set = (Set) qx0VarM48822e.mo18191b(x81Var.m55807k());
            Set set2 = (Set) qx0VarM48822e.mo18191b(x81Var.m55797a());
            Boolean bool = (Boolean) qx0VarM48822e.mo18191b(x81Var.m55809m());
            Boolean bool2 = (Boolean) qx0VarM48822e.mo18191b(x81Var.m55801e());
            String strM22500f = (String) qx0VarM48822e.mo18191b(x81Var.m55808l());
            Boolean bool3 = (Boolean) qx0VarM48822e.mo18191b(x81Var.m55802f());
            Boolean bool4 = (Boolean) qx0VarM48822e.mo18191b(x81Var.m55799c());
            boolean zBooleanValue = bool4 != null ? bool4.booleanValue() : false;
            z81.C18573b c18573b = z81.f56654o;
            C12813c c12813c2 = c12813c;
            z81.C18572a c18572a = new z81.C18572a();
            if (strM22500f == null && (strM22500f = this.f19230a.m22500f()) == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            c18572a.m58924y(strM22500f);
            ib8 ib8VarM48821d = srfVar.m48821d();
            obj = "Required value was null.";
            sq8.m48647f(ib8VarM48821d, "null cannot be cast to non-null type aws.smithy.kotlin.runtime.auth.awscredentials.Credentials");
            c18572a.m58917r((ic4) ib8VarM48821d);
            c18572a.m58916q(this.f19230a.m22496b());
            w81 w81VarM58902c = c18572a.m58902c();
            w81 w81Var = w81.SIGV4_ASYMMETRIC;
            if (w81VarM58902c == w81Var) {
                Set set3 = set2;
                if (!(set3 == null || set3.isEmpty())) {
                    strP0 = kh3.p0(set2, ",", null, null, 0, null, null, 62, null);
                }
                c18572a.m58923x(strP0);
                gk8VarM28956m = (gk8) qx0VarM48822e.mo18191b(x81Var.m55805i());
                if (gk8VarM28956m == null) {
                }
                c18572a.m58899C(gk8VarM28956m);
                c18572a.m58897A(this.f19230a.m22502h());
                c18572a.m58922w(bool3 != null ? bool3.booleanValue() : this.f19230a.m22499e());
                c18572a.m58921v(bool2 != null ? bool2.booleanValue() : this.f19230a.m22498d());
                c18572a.m58900D(bool != null ? bool.booleanValue() : this.f19230a.m22505k());
                c18572a.m58918s(this.f19230a.m22497c());
                c18572a.m58925z(this.f19230a.m22501g());
                if (u81VarM22503i == null) {
                }
                c18572a.m58898B(u81VarM22503i);
                gja gjaVar = (gja) qx0VarM48822e.mo18191b(e7f.f21127a.m24496c());
            } else if (c18572a.m58902c() != w81Var) {
                strP0 = str;
                c18572a.m58923x(strP0);
                gk8VarM28956m = (gk8) qx0VarM48822e.mo18191b(x81Var.m55805i());
                if (gk8VarM28956m == null) {
                    gk8 gk8VarM28963g = gk8.f25374b.m28963g();
                    k16 k16Var = (k16) qx0VarM48822e.mo18191b(s38.f44646a.m47566b());
                    gk8VarM28956m = gk8VarM28963g.m28956m(k16Var != null ? k16Var.m34896X() : k16.f31358b.m34900c());
                }
                c18572a.m58899C(gk8VarM28956m);
                c18572a.m58897A(this.f19230a.m22502h());
                c18572a.m58922w(bool3 != null ? bool3.booleanValue() : this.f19230a.m22499e());
                c18572a.m58921v(bool2 != null ? bool2.booleanValue() : this.f19230a.m22498d());
                c18572a.m58900D(bool != null ? bool.booleanValue() : this.f19230a.m22505k());
                c18572a.m58918s(this.f19230a.m22497c());
                c18572a.m58925z(this.f19230a.m22501g());
                if (u81VarM22503i == null) {
                    u81VarM22503i = this.f19230a.m22503i();
                }
                c18572a.m58898B(u81VarM22503i);
                gja gjaVar2 = (gja) qx0VarM48822e.mo18191b(e7f.f21127a.m24496c());
                c18572a.m58920u(gjaVar2 != null && gjaVar2.m28860a(gja.C13754d.f25333c));
                if (dx7Var == null) {
                    if (m18VarM58667d instanceof m18.C15196d) {
                        dx7Var = dx7.C13051b.f20621b;
                    } else if (l71.m36638c(m18VarM58667d) && zBooleanValue) {
                        dx7Var = z38VarM48820c.m58668e().m59801i("x-amz-trailer") ? this.f19230a.m22506l() ? dx7.C13055f.f20625b : dx7.C13054e.f20624b : dx7.C13053d.f20623b;
                    } else {
                        dx7Var = this.f19230a.m22506l() ? dx7.C13056g.f20626b : dx7.C13050a.f20620a;
                    }
                }
                c18572a.m58919t(dx7Var);
                z81VarM58901b = c18572a.m58901b();
                if (l71.m36637b(z81VarM58901b)) {
                    l71.m36640e(z38VarM48820c);
                }
                v81VarM22504j = this.f19230a.m22504j();
                if (v81VarM22504j != null) {
                    throw new IllegalStateException(obj.toString());
                }
                y38 y38VarM58665b = z38VarM48820c.m58665b();
                c12813c2.f19242a = this;
                c12813c2.f19243b = qx0VarM48822e;
                c12813c2.f19244c = z38VarM48820c;
                c12813c2.f19245d = z81VarM58901b;
                c12813c2.f19248g = 1;
                Object objMo18582c = v81VarM22504j.mo18582c(y38VarM58665b, z81VarM58901b, c12813c2);
                if (objMo18582c == objM51918f) {
                    return objM51918f;
                }
                qx0Var = qx0VarM48822e;
                obj2 = objMo18582c;
                d81Var = this;
            } else {
                Set set4 = set;
                if (!(set4 == null || set4.isEmpty())) {
                    strP0 = kh3.p0(set, ",", null, null, 0, null, null, 62, null);
                }
                c18572a.m58923x(strP0);
                gk8VarM28956m = (gk8) qx0VarM48822e.mo18191b(x81Var.m55805i());
                if (gk8VarM28956m == null) {
                }
                c18572a.m58899C(gk8VarM28956m);
                c18572a.m58897A(this.f19230a.m22502h());
                c18572a.m58922w(bool3 != null ? bool3.booleanValue() : this.f19230a.m22499e());
                c18572a.m58921v(bool2 != null ? bool2.booleanValue() : this.f19230a.m22498d());
                c18572a.m58900D(bool != null ? bool.booleanValue() : this.f19230a.m22505k());
                c18572a.m58918s(this.f19230a.m22497c());
                c18572a.m58925z(this.f19230a.m22501g());
                if (u81VarM22503i == null) {
                }
                c18572a.m58898B(u81VarM22503i);
                gja gjaVar22 = (gja) qx0VarM48822e.mo18191b(e7f.f21127a.m24496c());
                if (gjaVar22 != null) {
                    c18572a.m58920u(gjaVar22 != null && gjaVar22.m28860a(gja.C13754d.f25333c));
                    if (dx7Var == null) {
                    }
                    c18572a.m58919t(dx7Var);
                    z81VarM58901b = c18572a.m58901b();
                    if (l71.m36637b(z81VarM58901b)) {
                    }
                    v81VarM22504j = this.f19230a.m22504j();
                    if (v81VarM22504j != null) {
                    }
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z81VarM58901b = (z81) c12813c.f19245d;
            z38VarM48820c = (z38) c12813c.f19244c;
            qx0Var = (qx0) c12813c.f19243b;
            d81Var = (d81) c12813c.f19242a;
            wre.m54934b(obj2);
            obj = "Required value was null.";
        }
        a91 a91Var = (a91) obj2;
        y38 y38Var = (y38) a91Var.m16689a();
        cl3 cl3Var = (cl3) qx0Var.mo18191b(x81.f53319a.m55803g());
        if (cl3Var != null) {
            ml1.m39301a(cl3Var.complete(a91Var.m16690b()));
        }
        g81.m28164c(z38VarM48820c, y38Var);
        if (l71.m36637b(z81VarM58901b)) {
            v81 v81VarM22504j2 = d81Var.f19230a.m22504j();
            if (v81VarM22504j2 == null) {
                throw new IllegalStateException(obj.toString());
            }
            l71.m36639d(z38VarM48820c, v81VarM22504j2, z81VarM58901b, a91Var.m16690b(), z38VarM48820c.m58670g().m26959t());
        }
        return y3i.f54824a;
    }
}
