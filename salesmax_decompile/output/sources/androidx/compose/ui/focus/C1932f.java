package androidx.compose.ui.focus;

import androidx.compose.ui.node.C1939a;
import p001o.alb;
import p001o.ch1;
import p001o.d77;
import p001o.dh1;
import p001o.flb;
import p001o.gge;
import p001o.h77;
import p001o.kf9;
import p001o.p9c;
import p001o.q9c;
import p001o.r67;
import p001o.s67;
import p001o.sk5;
import p001o.sq8;
import p001o.tq;
import p001o.uk7;
import p001o.y3i;
import p001o.zh9;
import p001o.zzb;

/* renamed from: androidx.compose.ui.focus.f */
/* loaded from: classes2.dex */
public final class C1932f extends alb.AbstractC12216c implements p9c, flb {

    /* renamed from: L */
    public boolean f6278L;

    /* renamed from: M */
    public boolean f6279M;

    /* renamed from: Q */
    public h77 f6280Q = h77.Inactive;

    /* renamed from: androidx.compose.ui.focus.f$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6281a;

        static {
            int[] iArr = new int[h77.values().length];
            try {
                iArr[h77.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h77.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h77.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h77.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6281a = iArr;
        }
    }

    /* renamed from: androidx.compose.ui.focus.f$b */
    public static final class b extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ gge f6282a;

        /* renamed from: b */
        public final /* synthetic */ C1932f f6283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gge ggeVar, C1932f c1932f) {
            super(0);
            this.f6282a = ggeVar;
            this.f6283b = c1932f;
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68689invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68689invoke() {
            this.f6282a.f25106a = this.f6283b.e0();
        }
    }

    @Override // p001o.alb.AbstractC12216c
    /* renamed from: O */
    public void mo4912O() {
        int i = a.f6281a[g0().ordinal()];
        if (i == 1 || i == 2) {
            sk5.m48437i(this).getFocusOwner().mo4858n(true);
            return;
        }
        if (i == 3) {
            i0();
            j0(h77.Inactive);
        } else {
            if (i != 4) {
                return;
            }
            i0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1929c e0() {
        C1939a c1939aM59428U;
        C1930d c1930d = new C1930d();
        int iM60153a = zzb.m60153a(2048);
        int iM60153a2 = zzb.m60153a(1024);
        alb.AbstractC12216c abstractC12216cMo17377h = mo17377h();
        int i = iM60153a | iM60153a2;
        if (!mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cMo17377h2 = mo17377h();
        zh9 zh9VarM48436h = sk5.m48436h(this);
        loop0: while (zh9VarM48436h != null) {
            if ((zh9VarM48436h.m59428U().m4987k().m17352A() & i) != 0) {
                while (abstractC12216cMo17377h2 != null) {
                    if ((abstractC12216cMo17377h2.m17356E() & i) != 0) {
                        if (abstractC12216cMo17377h2 != abstractC12216cMo17377h) {
                            if ((abstractC12216cMo17377h2.m17356E() & iM60153a2) != 0) {
                                break loop0;
                            }
                        }
                        if ((abstractC12216cMo17377h2.m17356E() & iM60153a) != 0) {
                            for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cMo17377h2; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
                                if (abstractC12216cM48434f instanceof d77) {
                                    ((d77) abstractC12216cM48434f).mo22407p(c1930d);
                                } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
                                }
                            }
                        }
                    }
                    abstractC12216cMo17377h2 = abstractC12216cMo17377h2.m17358G();
                }
            }
            zh9VarM48436h = zh9VarM48436h.m59431X();
            abstractC12216cMo17377h2 = (zh9VarM48436h == null || (c1939aM59428U = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U.m4991o();
        }
        return c1930d;
    }

    public final ch1 f0() {
        tq.m50332a(m27028g(dh1.m23081a()));
        return null;
    }

    public h77 g0() {
        return this.f6280Q;
    }

    public final void h0() {
        InterfaceC1929c interfaceC1929c;
        int i = a.f6281a[g0().ordinal()];
        if (i == 1 || i == 2) {
            gge ggeVar = new gge();
            q9c.m45034a(this, new b(ggeVar, this));
            Object obj = ggeVar.f25106a;
            if (obj == null) {
                sq8.m48667z("focusProperties");
                interfaceC1929c = null;
            } else {
                interfaceC1929c = (InterfaceC1929c) obj;
            }
            if (interfaceC1929c.mo4900j()) {
                return;
            }
            sk5.m48437i(this).getFocusOwner().mo4858n(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        C1939a c1939aM59428U;
        alb.AbstractC12216c abstractC12216cMo17377h = mo17377h();
        int iM60153a = zzb.m60153a(4096);
        for (alb.AbstractC12216c abstractC12216cM48434f = abstractC12216cMo17377h; abstractC12216cM48434f != 0; abstractC12216cM48434f = sk5.m48434f(null)) {
            if (abstractC12216cM48434f instanceof r67) {
                s67.m47903b((r67) abstractC12216cM48434f);
            } else if ((abstractC12216cM48434f.m17356E() & iM60153a) != 0) {
            }
        }
        int iM60153a2 = zzb.m60153a(4096) | zzb.m60153a(1024);
        if (!mo17377h().m17361J()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        alb.AbstractC12216c abstractC12216cM17358G = mo17377h().m17358G();
        zh9 zh9VarM48436h = sk5.m48436h(this);
        while (zh9VarM48436h != null) {
            if ((zh9VarM48436h.m59428U().m4987k().m17352A() & iM60153a2) != 0) {
                while (abstractC12216cM17358G != null) {
                    if ((abstractC12216cM17358G.m17356E() & iM60153a2) != 0) {
                        if (!((zzb.m60153a(1024) & abstractC12216cM17358G.m17356E()) != 0) && abstractC12216cM17358G.m17361J()) {
                            int iM60153a3 = zzb.m60153a(4096);
                            for (alb.AbstractC12216c abstractC12216cM48434f2 = abstractC12216cM17358G; abstractC12216cM48434f2 != 0; abstractC12216cM48434f2 = sk5.m48434f(null)) {
                                if (abstractC12216cM48434f2 instanceof r67) {
                                    s67.m47903b((r67) abstractC12216cM48434f2);
                                } else if ((abstractC12216cM48434f2.m17356E() & iM60153a3) != 0) {
                                }
                            }
                        }
                    }
                    abstractC12216cM17358G = abstractC12216cM17358G.m17358G();
                }
            }
            zh9VarM48436h = zh9VarM48436h.m59431X();
            abstractC12216cM17358G = (zh9VarM48436h == null || (c1939aM59428U = zh9VarM48436h.m59428U()) == null) ? null : c1939aM59428U.m4991o();
        }
    }

    @Override // p001o.p9c
    /* renamed from: j */
    public void mo4913j() {
        h77 h77VarG0 = g0();
        h0();
        if (h77VarG0 != g0()) {
            s67.m47904c(this);
        }
    }

    public void j0(h77 h77Var) {
        sq8.m48649h(h77Var, "<set-?>");
        this.f6280Q = h77Var;
    }
}
