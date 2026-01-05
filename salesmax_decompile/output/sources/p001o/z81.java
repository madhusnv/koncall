package p001o;

import p001o.dx7;
import p001o.z81;

/* loaded from: classes3.dex */
public final class z81 {

    /* renamed from: o */
    public static final C18573b f56654o = new C18573b(null);

    /* renamed from: a */
    public final String f56655a;

    /* renamed from: b */
    public final String f56656b;

    /* renamed from: c */
    public final gk8 f56657c;

    /* renamed from: d */
    public final xk7 f56658d;

    /* renamed from: e */
    public final w81 f56659e;

    /* renamed from: f */
    public final t81 f56660f;

    /* renamed from: g */
    public final boolean f56661g;

    /* renamed from: h */
    public final boolean f56662h;

    /* renamed from: i */
    public final boolean f56663i;

    /* renamed from: j */
    public final dx7 f56664j;

    /* renamed from: k */
    public final u81 f56665k;

    /* renamed from: l */
    public final ic4 f56666l;

    /* renamed from: m */
    public final k16 f56667m;

    /* renamed from: n */
    public final boolean f56668n;

    /* renamed from: o.z81$a */
    public static final class C18572a {

        /* renamed from: a */
        public String f56669a;

        /* renamed from: b */
        public String f56670b;

        /* renamed from: c */
        public gk8 f56671c;

        /* renamed from: i */
        public boolean f56677i;

        /* renamed from: j */
        public dx7 f56678j;

        /* renamed from: l */
        public ic4 f56680l;

        /* renamed from: m */
        public k16 f56681m;

        /* renamed from: n */
        public boolean f56682n;

        /* renamed from: d */
        public xk7 f56672d = new xk7() { // from class: o.y81
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Boolean.valueOf(z81.C18572a.m58895E((String) obj));
            }
        };

        /* renamed from: e */
        public w81 f56673e = w81.SIGV4;

        /* renamed from: f */
        public t81 f56674f = t81.HTTP_REQUEST_VIA_HEADERS;

        /* renamed from: g */
        public boolean f56675g = true;

        /* renamed from: h */
        public boolean f56676h = true;

        /* renamed from: k */
        public u81 f56679k = u81.NONE;

        /* renamed from: E */
        public static final boolean m58895E(String str) {
            sq8.m48649h(str, "<unused var>");
            return true;
        }

        /* renamed from: A */
        public final void m58897A(t81 t81Var) {
            sq8.m48649h(t81Var, "<set-?>");
            this.f56674f = t81Var;
        }

        /* renamed from: B */
        public final void m58898B(u81 u81Var) {
            sq8.m48649h(u81Var, "<set-?>");
            this.f56679k = u81Var;
        }

        /* renamed from: C */
        public final void m58899C(gk8 gk8Var) {
            this.f56671c = gk8Var;
        }

        /* renamed from: D */
        public final void m58900D(boolean z) {
            this.f56675g = z;
        }

        /* renamed from: b */
        public final z81 m58901b() {
            return new z81(this);
        }

        /* renamed from: c */
        public final w81 m58902c() {
            return this.f56673e;
        }

        /* renamed from: d */
        public final ic4 m58903d() {
            return this.f56680l;
        }

        /* renamed from: e */
        public final k16 m58904e() {
            return this.f56681m;
        }

        /* renamed from: f */
        public final dx7 m58905f() {
            return this.f56678j;
        }

        /* renamed from: g */
        public final boolean m58906g() {
            return this.f56682n;
        }

        /* renamed from: h */
        public final boolean m58907h() {
            return this.f56676h;
        }

        /* renamed from: i */
        public final boolean m58908i() {
            return this.f56677i;
        }

        /* renamed from: j */
        public final String m58909j() {
            return this.f56669a;
        }

        /* renamed from: k */
        public final String m58910k() {
            return this.f56670b;
        }

        /* renamed from: l */
        public final xk7 m58911l() {
            return this.f56672d;
        }

        /* renamed from: m */
        public final t81 m58912m() {
            return this.f56674f;
        }

        /* renamed from: n */
        public final u81 m58913n() {
            return this.f56679k;
        }

        /* renamed from: o */
        public final gk8 m58914o() {
            return this.f56671c;
        }

        /* renamed from: p */
        public final boolean m58915p() {
            return this.f56675g;
        }

        /* renamed from: q */
        public final void m58916q(w81 w81Var) {
            sq8.m48649h(w81Var, "<set-?>");
            this.f56673e = w81Var;
        }

        /* renamed from: r */
        public final void m58917r(ic4 ic4Var) {
            this.f56680l = ic4Var;
        }

        /* renamed from: s */
        public final void m58918s(k16 k16Var) {
            this.f56681m = k16Var;
        }

        /* renamed from: t */
        public final void m58919t(dx7 dx7Var) {
            this.f56678j = dx7Var;
        }

        /* renamed from: u */
        public final void m58920u(boolean z) {
            this.f56682n = z;
        }

        /* renamed from: v */
        public final void m58921v(boolean z) {
            this.f56676h = z;
        }

        /* renamed from: w */
        public final void m58922w(boolean z) {
            this.f56677i = z;
        }

        /* renamed from: x */
        public final void m58923x(String str) {
            this.f56669a = str;
        }

        /* renamed from: y */
        public final void m58924y(String str) {
            this.f56670b = str;
        }

        /* renamed from: z */
        public final void m58925z(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "<set-?>");
            this.f56672d = xk7Var;
        }
    }

    /* renamed from: o.z81$b */
    public static final class C18573b {
        public C18573b() {
        }

        public /* synthetic */ C18573b(id5 id5Var) {
            this();
        }
    }

    public z81(C18572a c18572a) {
        sq8.m48649h(c18572a, "builder");
        String strM58909j = c18572a.m58909j();
        if (strM58909j == null) {
            throw new IllegalArgumentException("Signing config must specify a region".toString());
        }
        this.f56655a = strM58909j;
        String strM58910k = c18572a.m58910k();
        if (strM58910k == null) {
            throw new IllegalArgumentException("Signing config must specify a service".toString());
        }
        this.f56656b = strM58910k;
        gk8 gk8VarM58914o = c18572a.m58914o();
        this.f56657c = gk8VarM58914o == null ? gk8.f25374b.m28963g() : gk8VarM58914o;
        this.f56658d = c18572a.m58911l();
        this.f56659e = c18572a.m58902c();
        this.f56660f = c18572a.m58912m();
        this.f56661g = c18572a.m58915p();
        this.f56662h = c18572a.m58907h();
        this.f56663i = c18572a.m58908i();
        dx7 dx7VarM58905f = c18572a.m58905f();
        this.f56664j = dx7VarM58905f == null ? dx7.C13050a.f20620a : dx7VarM58905f;
        this.f56665k = c18572a.m58913n();
        ic4 ic4VarM58903d = c18572a.m58903d();
        if (ic4VarM58903d == null) {
            throw new IllegalArgumentException("Signing config must specify credentials".toString());
        }
        this.f56666l = ic4VarM58903d;
        this.f56667m = c18572a.m58904e();
        this.f56668n = c18572a.m58906g();
    }

    /* renamed from: a */
    public final w81 m58880a() {
        return this.f56659e;
    }

    /* renamed from: b */
    public final ic4 m58881b() {
        return this.f56666l;
    }

    /* renamed from: c */
    public final k16 m58882c() {
        return this.f56667m;
    }

    /* renamed from: d */
    public final dx7 m58883d() {
        return this.f56664j;
    }

    /* renamed from: e */
    public final boolean m58884e() {
        return this.f56668n;
    }

    /* renamed from: f */
    public final boolean m58885f() {
        return this.f56662h;
    }

    /* renamed from: g */
    public final boolean m58886g() {
        return this.f56663i;
    }

    /* renamed from: h */
    public final String m58887h() {
        return this.f56655a;
    }

    /* renamed from: i */
    public final String m58888i() {
        return this.f56656b;
    }

    /* renamed from: j */
    public final xk7 m58889j() {
        return this.f56658d;
    }

    /* renamed from: k */
    public final t81 m58890k() {
        return this.f56660f;
    }

    /* renamed from: l */
    public final u81 m58891l() {
        return this.f56665k;
    }

    /* renamed from: m */
    public final gk8 m58892m() {
        return this.f56657c;
    }

    /* renamed from: n */
    public final boolean m58893n() {
        return this.f56661g;
    }

    /* renamed from: o */
    public final C18572a m58894o() {
        C18572a c18572a = new C18572a();
        c18572a.m58923x(this.f56655a);
        c18572a.m58924y(this.f56656b);
        c18572a.m58899C(this.f56657c);
        c18572a.m58925z(this.f56658d);
        c18572a.m58916q(this.f56659e);
        c18572a.m58897A(this.f56660f);
        c18572a.m58900D(this.f56661g);
        c18572a.m58921v(this.f56662h);
        c18572a.m58922w(this.f56663i);
        c18572a.m58919t(this.f56664j);
        c18572a.m58898B(this.f56665k);
        c18572a.m58917r(this.f56666l);
        c18572a.m58918s(this.f56667m);
        c18572a.m58920u(this.f56668n);
        return c18572a;
    }
}
