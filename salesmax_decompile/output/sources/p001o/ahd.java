package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p001o.bhf;
import p001o.c9i;
import p001o.d9i;
import p001o.mne;
import p001o.mq3;

/* loaded from: classes2.dex */
public final class ahd extends w8i {

    /* renamed from: x */
    public static final C12174b f14715x = new C12174b();

    /* renamed from: y */
    public static final Executor f14716y = gb2.m28295c();

    /* renamed from: p */
    public InterfaceC12175c f14717p;

    /* renamed from: q */
    public Executor f14718q;

    /* renamed from: r */
    public bhf.C12402b f14719r;

    /* renamed from: s */
    public yj5 f14720s;

    /* renamed from: t */
    public hfg f14721t;

    /* renamed from: u */
    public bgg f14722u;

    /* renamed from: v */
    public rfg f14723v;

    /* renamed from: w */
    public bhf.C12403c f14724w;

    /* renamed from: o.ahd$a */
    public static final class C12173a implements c9i.InterfaceC12595a {

        /* renamed from: a */
        public final qpb f14725a;

        public C12173a() {
            this(qpb.a0());
        }

        /* renamed from: d */
        public static C12173a m17072d(mq3 mq3Var) {
            return new C12173a(qpb.b0(mq3Var));
        }

        @Override // p001o.hp6
        /* renamed from: a */
        public vob mo17073a() {
            return this.f14725a;
        }

        /* renamed from: c */
        public ahd m17075c() {
            bhd bhdVarMo17074b = mo17074b();
            qd8.m45153U(bhdVarMo17074b);
            return new ahd(bhdVarMo17074b);
        }

        @Override // p001o.c9i.InterfaceC12595a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public bhd mo17074b() {
            return new bhd(tec.m49792Y(this.f14725a));
        }

        /* renamed from: f */
        public C12173a m17077f(d9i.EnumC12848b enumC12848b) {
            mo17073a().mo45760N(c9i.f17561E, enumC12848b);
            return this;
        }

        /* renamed from: g */
        public C12173a m17078g(y16 y16Var) {
            mo17073a().mo45760N(kd8.f31943i, y16Var);
            return this;
        }

        /* renamed from: h */
        public C12173a m17079h(mne mneVar) {
            mo17073a().mo45760N(qd8.f41692r, mneVar);
            return this;
        }

        /* renamed from: i */
        public C12173a m17080i(int i) {
            mo17073a().mo45760N(c9i.f17557A, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C12173a m17081j(int i) {
            if (i == -1) {
                i = 0;
            }
            mo17073a().mo45760N(qd8.f41684j, Integer.valueOf(i));
            return this;
        }

        /* renamed from: k */
        public C12173a m17082k(Class cls) {
            mo17073a().mo45760N(sjg.f45490v, cls);
            if (mo17073a().mo36958d(sjg.f45489u, null) == null) {
                m17083l(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: l */
        public C12173a m17083l(String str) {
            mo17073a().mo45760N(sjg.f45489u, str);
            return this;
        }

        public C12173a(qpb qpbVar) {
            this.f14725a = qpbVar;
            Class cls = (Class) qpbVar.mo36958d(sjg.f45490v, null);
            if (cls != null && !cls.equals(ahd.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m17077f(d9i.EnumC12848b.PREVIEW);
            m17082k(ahd.class);
            mq3.AbstractC15402a abstractC15402a = qd8.f41687m;
            if (((Integer) qpbVar.mo36958d(abstractC15402a, -1)).intValue() == -1) {
                qpbVar.mo45760N(abstractC15402a, 2);
            }
        }
    }

    /* renamed from: o.ahd$b */
    public static final class C12174b {

        /* renamed from: a */
        public static final mne f14726a;

        /* renamed from: b */
        public static final bhd f14727b;

        /* renamed from: c */
        public static final y16 f14728c;

        static {
            mne mneVarM39401a = new mne.C15369a().m39403d(mp0.f35798c).m39404e(one.f38634c).m39401a();
            f14726a = mneVarM39401a;
            y16 y16Var = y16.f54702c;
            f14728c = y16Var;
            f14727b = new C12173a().m17080i(2).m17081j(0).m17079h(mneVarM39401a).m17078g(y16Var).mo17074b();
        }

        /* renamed from: a */
        public bhd m17084a() {
            return f14727b;
        }
    }

    /* renamed from: o.ahd$c */
    public interface InterfaceC12175c {
        /* renamed from: a */
        void mo4739a(bgg bggVar);
    }

    public ahd(bhd bhdVar) {
        super(bhdVar);
        this.f14718q = f14716y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(bhf bhfVar, bhf.EnumC12407g enumC12407g) {
        if (m54087f() == null) {
            return;
        }
        k0((bhd) m54090i(), m54085d());
        m54073F();
    }

    @Override // p001o.w8i
    /* renamed from: J */
    public c9i mo17063J(u92 u92Var, c9i.InterfaceC12595a interfaceC12595a) {
        interfaceC12595a.mo17073a().mo45760N(kd8.f31942h, 34);
        return interfaceC12595a.mo17074b();
    }

    @Override // p001o.w8i
    /* renamed from: M */
    public k7g mo17064M(mq3 mq3Var) {
        this.f14719r.m19044g(mq3Var);
        m54079U(t3c.m49220a(new Object[]{this.f14719r.m19052o()}));
        return m54085d().mo35131g().mo35135d(mq3Var).mo35132a();
    }

    @Override // p001o.w8i
    /* renamed from: N */
    public k7g mo17065N(k7g k7gVar, k7g k7gVar2) {
        k0((bhd) m54090i(), k7gVar);
        return k7gVar;
    }

    @Override // p001o.w8i
    /* renamed from: O */
    public void mo17066O() {
        a0();
    }

    @Override // p001o.w8i
    /* renamed from: S */
    public void mo17067S(Rect rect) {
        super.mo17067S(rect);
        g0();
    }

    /* renamed from: Z */
    public final void m17068Z(bhf.C12402b c12402b, k7g k7gVar) {
        if (this.f14717p != null) {
            c12402b.m19050m(this.f14720s, k7gVar.mo35126b(), m54095o(), m54093m());
        }
        bhf.C12403c c12403c = this.f14724w;
        if (c12403c != null) {
            c12403c.m19063b();
        }
        bhf.C12403c c12403c2 = new bhf.C12403c(new bhf.InterfaceC12404d() { // from class: o.zgd
            @Override // p001o.bhf.InterfaceC12404d
            /* renamed from: a */
            public final void mo19062a(bhf bhfVar, bhf.EnumC12407g enumC12407g) {
                this.f57168a.d0(bhfVar, enumC12407g);
            }
        });
        this.f14724w = c12403c2;
        c12402b.m19054r(c12403c2);
    }

    public final void a0() {
        bhf.C12403c c12403c = this.f14724w;
        if (c12403c != null) {
            c12403c.m19063b();
            this.f14724w = null;
        }
        yj5 yj5Var = this.f14720s;
        if (yj5Var != null) {
            yj5Var.mo30396d();
            this.f14720s = null;
        }
        rfg rfgVar = this.f14723v;
        if (rfgVar != null) {
            rfgVar.m46666i();
            this.f14723v = null;
        }
        hfg hfgVar = this.f14721t;
        if (hfgVar != null) {
            hfgVar.m30378i();
            this.f14721t = null;
        }
        this.f14722u = null;
    }

    public final bhf.C12402b b0(bhd bhdVar, k7g k7gVar) {
        elh.m25220a();
        v92 v92VarM54087f = m54087f();
        Objects.requireNonNull(v92VarM54087f);
        v92 v92Var = v92VarM54087f;
        a0();
        fgd.m26665i(this.f14721t == null);
        Matrix matrixM54101u = m54101u();
        boolean zMo42848p = v92Var.mo42848p();
        Rect rectC0 = c0(k7gVar.mo35129e());
        Objects.requireNonNull(rectC0);
        this.f14721t = new hfg(1, 34, k7gVar, matrixM54101u, zMo42848p, rectC0, m54097q(v92Var, m54069B(v92Var)), m54084c(), j0(v92Var));
        m54091k();
        this.f14721t.m30374e(new Runnable() { // from class: o.xgd
            @Override // java.lang.Runnable
            public final void run() {
                this.f53751a.m54073F();
            }
        });
        bgg bggVarM30380k = this.f14721t.m30380k(v92Var);
        this.f14722u = bggVarM30380k;
        this.f14720s = bggVarM30380k.m18928m();
        if (this.f14717p != null) {
            f0();
        }
        bhf.C12402b c12402bM19037p = bhf.C12402b.m19037p(bhdVar, k7gVar.mo35129e());
        c12402bM19037p.m19055s(k7gVar.mo35127c());
        c12402bM19037p.m19059w(bhdVar.m20530B());
        if (k7gVar.mo35128d() != null) {
            c12402bM19037p.m19044g(k7gVar.mo35128d());
        }
        m17068Z(c12402bM19037p, k7gVar);
        return c12402bM19037p;
    }

    public final Rect c0(Size size) {
        if (m54104z() != null) {
            return m54104z();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public final void f0() {
        g0();
        final InterfaceC12175c interfaceC12175c = (InterfaceC12175c) fgd.m26663g(this.f14717p);
        final bgg bggVar = (bgg) fgd.m26663g(this.f14722u);
        this.f14718q.execute(new Runnable() { // from class: o.ygd
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC12175c.mo4739a(bggVar);
            }
        });
    }

    public final void g0() {
        v92 v92VarM54087f = m54087f();
        hfg hfgVar = this.f14721t;
        if (v92VarM54087f == null || hfgVar == null) {
            return;
        }
        hfgVar.m30373C(m54097q(v92VarM54087f, m54069B(v92VarM54087f)), m54084c());
    }

    public void h0(Executor executor, InterfaceC12175c interfaceC12175c) {
        elh.m25220a();
        if (interfaceC12175c == null) {
            this.f14717p = null;
            m54072E();
            return;
        }
        this.f14717p = interfaceC12175c;
        this.f14718q = executor;
        if (m54086e() != null) {
            k0((bhd) m54090i(), m54085d());
            m54073F();
        }
        m54071D();
    }

    public void i0(InterfaceC12175c interfaceC12175c) {
        h0(f14716y, interfaceC12175c);
    }

    @Override // p001o.w8i
    /* renamed from: j */
    public c9i mo17069j(boolean z, d9i d9iVar) {
        C12174b c12174b = f14715x;
        mq3 mq3VarMo22642a = d9iVar.mo22642a(c12174b.m17084a().mo20533M(), 1);
        if (z) {
            mq3VarMo22642a = mq3.m39506z(mq3VarMo22642a, c12174b.m17084a());
        }
        if (mq3VarMo22642a == null) {
            return null;
        }
        return mo17071y(mq3VarMo22642a).mo17074b();
    }

    public final boolean j0(v92 v92Var) {
        return v92Var.mo42848p() && m54069B(v92Var);
    }

    public final void k0(bhd bhdVar, k7g k7gVar) {
        bhf.C12402b c12402bB0 = b0(bhdVar, k7gVar);
        this.f14719r = c12402bB0;
        m54079U(t3c.m49220a(new Object[]{c12402bB0.m19052o()}));
    }

    public String toString() {
        return "Preview:" + m54094n();
    }

    @Override // p001o.w8i
    /* renamed from: w */
    public Set mo17070w() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // p001o.w8i
    /* renamed from: y */
    public c9i.InterfaceC12595a mo17071y(mq3 mq3Var) {
        return C12173a.m17072d(mq3Var);
    }
}
