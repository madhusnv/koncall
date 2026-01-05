package p001o;

import p001o.k16;
import p001o.x18;

/* loaded from: classes3.dex */
public abstract class z18 implements x18 {

    /* renamed from: a */
    public final long f56401a;

    /* renamed from: b */
    public final long f56402b;

    /* renamed from: c */
    public final long f56403c;

    /* renamed from: d */
    public final long f56404d;

    /* renamed from: e */
    public final long f56405e;

    /* renamed from: f */
    public final int f56406f;

    /* renamed from: g */
    public final y2e f56407g;

    /* renamed from: h */
    public final b18 f56408h;

    /* renamed from: i */
    public final cnh f56409i;

    /* renamed from: j */
    public final vdh f56410j;

    /* renamed from: o.z18$a */
    public static class C18543a implements x18.InterfaceC18030a {

        /* renamed from: a */
        public long f56411a;

        /* renamed from: b */
        public long f56412b;

        /* renamed from: c */
        public long f56413c;

        /* renamed from: d */
        public long f56414d;

        /* renamed from: e */
        public long f56415e;

        /* renamed from: f */
        public int f56416f;

        /* renamed from: g */
        public y2e f56417g;

        /* renamed from: h */
        public b18 f56418h;

        /* renamed from: i */
        public cnh f56419i;

        /* renamed from: j */
        public vdh f56420j;

        /* JADX WARN: Multi-variable type inference failed */
        public C18543a() {
            k16.C14700a c14700a = k16.f31358b;
            o16 o16Var = o16.SECONDS;
            this.f56411a = m16.m38175s(30, o16Var);
            this.f56412b = m16.m38175s(30, o16Var);
            this.f56413c = m16.m38175s(2, o16Var);
            this.f56414d = m16.m38175s(10, o16Var);
            this.f56415e = m16.m38175s(60, o16Var);
            this.f56416f = 128;
            this.f56417g = new vi6(null, 1, 0 == true ? 1 : 0);
            this.f56418h = b18.f15444a.m18089a();
            this.f56419i = cnh.f18414c.m21488a();
            this.f56420j = vdh.f50220a.m52646a();
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: b */
        public long mo55551b() {
            return this.f56411a;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: c */
        public void mo55552c(long j) {
            this.f56415e = j;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: d */
        public void mo55553d(y2e y2eVar) {
            sq8.m48649h(y2eVar, "<set-?>");
            this.f56417g = y2eVar;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: e */
        public b18 mo55554e() {
            return this.f56418h;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: f */
        public long mo55555f() {
            return this.f56412b;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: h */
        public long mo55556h() {
            return this.f56413c;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: i */
        public int mo55557i() {
            return this.f56416f;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: j */
        public cnh mo55558j() {
            return this.f56419i;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: k */
        public void mo55559k(long j) {
            this.f56412b = j;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: l */
        public void mo55560l(cnh cnhVar) {
            sq8.m48649h(cnhVar, "<set-?>");
            this.f56419i = cnhVar;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: m */
        public long mo55561m() {
            return this.f56415e;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: n */
        public void mo55562n(int i) {
            this.f56416f = i;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: o */
        public void mo55563o(long j) {
            this.f56411a = j;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: p */
        public void mo55564p(long j) {
            this.f56413c = j;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: q */
        public void mo55565q(b18 b18Var) {
            sq8.m48649h(b18Var, "<set-?>");
            this.f56418h = b18Var;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: r */
        public void mo55566r(long j) {
            this.f56414d = j;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: s */
        public long mo55567s() {
            return this.f56414d;
        }

        @Override // p001o.x18.InterfaceC18030a
        /* renamed from: t */
        public y2e mo55568t() {
            return this.f56417g;
        }
    }

    public z18(x18.InterfaceC18030a interfaceC18030a) {
        sq8.m48649h(interfaceC18030a, "builder");
        this.f56401a = interfaceC18030a.mo55551b();
        this.f56402b = interfaceC18030a.mo55555f();
        this.f56403c = interfaceC18030a.mo55556h();
        this.f56404d = interfaceC18030a.mo55567s();
        this.f56405e = interfaceC18030a.mo55561m();
        this.f56406f = interfaceC18030a.mo55557i();
        this.f56407g = interfaceC18030a.mo55568t();
        this.f56408h = interfaceC18030a.mo55554e();
        this.f56409i = interfaceC18030a.mo55558j();
        this.f56410j = interfaceC18030a.mo38635a();
    }

    /* renamed from: m */
    public static final y3i m58640m(z18 z18Var, x18.InterfaceC18030a interfaceC18030a) {
        sq8.m48649h(interfaceC18030a, "<this>");
        interfaceC18030a.mo55563o(z18Var.m58647i());
        interfaceC18030a.mo55559k(z18Var.m58648j());
        interfaceC18030a.mo55564p(z18Var.m58641c());
        interfaceC18030a.mo55566r(z18Var.m58642d());
        interfaceC18030a.mo55552c(z18Var.m58643e());
        interfaceC18030a.mo55562n(z18Var.m58645g());
        interfaceC18030a.mo55553d(z18Var.m58646h());
        interfaceC18030a.mo55565q(z18Var.m58644f());
        interfaceC18030a.mo55560l(z18Var.m58650l());
        interfaceC18030a.mo38636g(z18Var.m58649k());
        return y3i.f54824a;
    }

    @Override // p001o.x18
    /* renamed from: a */
    public xk7 mo38632a() {
        return new xk7() { // from class: o.y18
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return z18.m58640m(this.f54712a, (x18.InterfaceC18030a) obj);
            }
        };
    }

    /* renamed from: c */
    public long m58641c() {
        return this.f56403c;
    }

    /* renamed from: d */
    public long m58642d() {
        return this.f56404d;
    }

    /* renamed from: e */
    public long m58643e() {
        return this.f56405e;
    }

    /* renamed from: f */
    public b18 m58644f() {
        return this.f56408h;
    }

    /* renamed from: g */
    public int m58645g() {
        return this.f56406f;
    }

    /* renamed from: h */
    public y2e m58646h() {
        return this.f56407g;
    }

    /* renamed from: i */
    public long m58647i() {
        return this.f56401a;
    }

    /* renamed from: j */
    public long m58648j() {
        return this.f56402b;
    }

    /* renamed from: k */
    public vdh m58649k() {
        return this.f56410j;
    }

    /* renamed from: l */
    public cnh m58650l() {
        return this.f56409i;
    }
}
