package p001o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p001o.bgg;
import p001o.g32;
import p001o.ifg;
import p001o.yj5;

/* loaded from: classes2.dex */
public class hfg {

    /* renamed from: a */
    public final int f26790a;

    /* renamed from: b */
    public final Matrix f26791b;

    /* renamed from: c */
    public final boolean f26792c;

    /* renamed from: d */
    public final Rect f26793d;

    /* renamed from: e */
    public final boolean f26794e;

    /* renamed from: f */
    public final int f26795f;

    /* renamed from: g */
    public final k7g f26796g;

    /* renamed from: h */
    public int f26797h;

    /* renamed from: i */
    public int f26798i;

    /* renamed from: k */
    public bgg f26800k;

    /* renamed from: l */
    public C13930a f26801l;

    /* renamed from: j */
    public boolean f26799j = false;

    /* renamed from: m */
    public final Set f26802m = new HashSet();

    /* renamed from: n */
    public boolean f26803n = false;

    /* renamed from: o */
    public final List f26804o = new ArrayList();

    /* renamed from: o.hfg$a */
    public static class C13930a extends yj5 {

        /* renamed from: o */
        public final zfa f26805o;

        /* renamed from: p */
        public g32.C13614a f26806p;

        /* renamed from: q */
        public yj5 f26807q;

        /* renamed from: r */
        public lfg f26808r;

        public C13930a(Size size, int i) {
            super(size, i);
            this.f26805o = g32.m28002a(new g32.InterfaceC13616c() { // from class: o.efg
                @Override // p001o.g32.InterfaceC13616c
                public final Object attachCompleter(g32.C13614a c13614a) {
                    return this.f21579a.m30392n(c13614a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ Object m30392n(g32.C13614a c13614a) {
            this.f26806p = c13614a;
            return "SettableFuture hashCode: " + hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m30395w() {
            lfg lfgVar = this.f26808r;
            if (lfgVar != null) {
                lfgVar.m37130o();
            }
            if (this.f26807q == null) {
                this.f26806p.m28006d();
            }
        }

        @Override // p001o.yj5
        /* renamed from: d */
        public void mo30396d() {
            super.mo30396d();
            elh.m25223d(new Runnable() { // from class: o.ffg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23239a.m30395w();
                }
            });
        }

        @Override // p001o.yj5
        /* renamed from: r */
        public zfa mo18935r() {
            return this.f26805o;
        }

        /* renamed from: v */
        public boolean m30397v() {
            elh.m25220a();
            return this.f26807q == null && !m57875m();
        }

        /* renamed from: x */
        public void m30398x(lfg lfgVar) {
            fgd.m26666j(this.f26808r == null, "Consumer can only be linked once.");
            this.f26808r = lfgVar;
        }

        /* renamed from: y */
        public boolean m30399y(final yj5 yj5Var, Runnable runnable) {
            elh.m25220a();
            fgd.m26663g(yj5Var);
            yj5 yj5Var2 = this.f26807q;
            if (yj5Var2 == yj5Var) {
                return false;
            }
            fgd.m26666j(yj5Var2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            fgd.m26658b(m57870h().equals(yj5Var.m57870h()), String.format("The provider's size(%s) must match the parent(%s)", m57870h(), yj5Var.m57870h()));
            fgd.m26658b(m57871i() == yj5Var.m57871i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(m57871i()), Integer.valueOf(yj5Var.m57871i())));
            fgd.m26666j(!m57875m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f26807q = yj5Var;
            bn7.m19408C(yj5Var.m57872j(), this.f26806p);
            yj5Var.m57874l();
            m57873k().addListener(new Runnable() { // from class: o.gfg
                @Override // java.lang.Runnable
                public final void run() {
                    yj5Var.m57867e();
                }
            }, gb2.m28293a());
            yj5Var.m57868f().addListener(runnable, gb2.m28295c());
            return true;
        }
    }

    public hfg(int i, int i2, k7g k7gVar, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f26795f = i;
        this.f26790a = i2;
        this.f26796g = k7gVar;
        this.f26791b = matrix;
        this.f26792c = z;
        this.f26793d = rect;
        this.f26798i = i3;
        this.f26797h = i4;
        this.f26794e = z2;
        this.f26801l = new C13930a(k7gVar.mo35129e(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ zfa m30367w(final C13930a c13930a, int i, ifg.AbstractC14281a abstractC14281a, ifg.AbstractC14281a abstractC14281a2, Surface surface) {
        fgd.m26663g(surface);
        try {
            c13930a.m57874l();
            lfg lfgVar = new lfg(surface, m30388s(), i, this.f26796g.mo35129e(), abstractC14281a, abstractC14281a2, this.f26791b);
            lfgVar.m37129g().addListener(new Runnable() { // from class: o.dfg
                @Override // java.lang.Runnable
                public final void run() {
                    c13930a.m57867e();
                }
            }, gb2.m28293a());
            c13930a.m30398x(lfgVar);
            return bn7.m19430p(lfgVar);
        } catch (yj5.C18418a e) {
            return bn7.m19428n(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m30368x() {
        if (this.f26803n) {
            return;
        }
        m30390u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m30369y() {
        gb2.m28295c().execute(new Runnable() { // from class: o.bfg
            @Override // java.lang.Runnable
            public final void run() {
                this.f16100a.m30368x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m30370z(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (this.f26798i != i) {
            this.f26798i = i;
            z = true;
        } else {
            z = false;
        }
        if (this.f26797h != i2) {
            this.f26797h = i2;
        } else {
            z2 = z;
        }
        if (z2) {
            m30371A();
        }
    }

    /* renamed from: A */
    public final void m30371A() {
        elh.m25220a();
        bgg.AbstractC12390h abstractC12390hM18942g = bgg.AbstractC12390h.m18942g(this.f26793d, this.f26798i, this.f26797h, m30389t(), this.f26791b, this.f26794e);
        bgg bggVar = this.f26800k;
        if (bggVar != null) {
            bggVar.m18923D(abstractC12390hM18942g);
        }
        Iterator it = this.f26804o.iterator();
        while (it.hasNext()) {
            ((hu3) it.next()).accept(abstractC12390hM18942g);
        }
    }

    /* renamed from: B */
    public void m30372B(yj5 yj5Var) {
        elh.m25220a();
        m30377h();
        C13930a c13930a = this.f26801l;
        Objects.requireNonNull(c13930a);
        c13930a.m30399y(yj5Var, new xeg(c13930a));
    }

    /* renamed from: C */
    public void m30373C(final int i, final int i2) {
        elh.m25223d(new Runnable() { // from class: o.afg
            @Override // java.lang.Runnable
            public final void run() {
                this.f14625a.m30370z(i, i2);
            }
        });
    }

    /* renamed from: e */
    public void m30374e(Runnable runnable) {
        elh.m25220a();
        m30377h();
        this.f26802m.add(runnable);
    }

    /* renamed from: f */
    public void m30375f(hu3 hu3Var) {
        fgd.m26663g(hu3Var);
        this.f26804o.add(hu3Var);
    }

    /* renamed from: g */
    public final void m30376g() {
        fgd.m26666j(!this.f26799j, "Consumer can only be linked once.");
        this.f26799j = true;
    }

    /* renamed from: h */
    public final void m30377h() {
        fgd.m26666j(!this.f26803n, "Edge is already closed.");
    }

    /* renamed from: i */
    public final void m30378i() {
        elh.m25220a();
        this.f26801l.mo30396d();
        this.f26803n = true;
    }

    /* renamed from: j */
    public zfa m30379j(final int i, final ifg.AbstractC14281a abstractC14281a, final ifg.AbstractC14281a abstractC14281a2) {
        elh.m25220a();
        m30377h();
        m30376g();
        final C13930a c13930a = this.f26801l;
        return bn7.m19413H(c13930a.m57872j(), new wr0() { // from class: o.cfg
            @Override // p001o.wr0
            public final zfa apply(Object obj) {
                return this.f18042a.m30367w(c13930a, i, abstractC14281a, abstractC14281a2, (Surface) obj);
            }
        }, gb2.m28295c());
    }

    /* renamed from: k */
    public bgg m30380k(v92 v92Var) {
        return m30381l(v92Var, true);
    }

    /* renamed from: l */
    public bgg m30381l(v92 v92Var, boolean z) {
        elh.m25220a();
        m30377h();
        bgg bggVar = new bgg(this.f26796g.mo35129e(), v92Var, z, this.f26796g.mo35126b(), this.f26796g.mo35127c(), new Runnable() { // from class: o.yeg
            @Override // java.lang.Runnable
            public final void run() {
                this.f55382a.m30369y();
            }
        });
        try {
            final yj5 yj5VarM18928m = bggVar.m18928m();
            C13930a c13930a = this.f26801l;
            Objects.requireNonNull(c13930a);
            if (c13930a.m30399y(yj5VarM18928m, new xeg(c13930a))) {
                zfa zfaVarM57873k = c13930a.m57873k();
                Objects.requireNonNull(yj5VarM18928m);
                zfaVarM57873k.addListener(new Runnable() { // from class: o.zeg
                    @Override // java.lang.Runnable
                    public final void run() {
                        yj5VarM18928m.mo30396d();
                    }
                }, gb2.m28293a());
            }
            this.f26800k = bggVar;
            m30371A();
            return bggVar;
        } catch (RuntimeException e) {
            bggVar.m18924E();
            throw e;
        } catch (yj5.C18418a e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        }
    }

    /* renamed from: m */
    public final void m30382m() {
        elh.m25220a();
        m30377h();
        this.f26801l.mo30396d();
    }

    /* renamed from: n */
    public Rect m30383n() {
        return this.f26793d;
    }

    /* renamed from: o */
    public yj5 m30384o() {
        elh.m25220a();
        m30377h();
        m30376g();
        return this.f26801l;
    }

    /* renamed from: p */
    public int m30385p() {
        return this.f26798i;
    }

    /* renamed from: q */
    public Matrix m30386q() {
        return this.f26791b;
    }

    /* renamed from: r */
    public k7g m30387r() {
        return this.f26796g;
    }

    /* renamed from: s */
    public int m30388s() {
        return this.f26795f;
    }

    /* renamed from: t */
    public boolean m30389t() {
        return this.f26792c;
    }

    /* renamed from: u */
    public void m30390u() {
        elh.m25220a();
        m30377h();
        if (this.f26801l.m30397v()) {
            return;
        }
        this.f26799j = false;
        this.f26801l.mo30396d();
        this.f26801l = new C13930a(this.f26796g.mo35129e(), this.f26790a);
        Iterator it = this.f26802m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* renamed from: v */
    public boolean m30391v() {
        return this.f26794e;
    }
}
