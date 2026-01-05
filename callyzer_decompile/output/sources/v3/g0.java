package v3;

import a3.C0043b;
import bg.C0657b;
import c9.C0908c;
import c9.C0910e;
import c9.C0917l;
import cj.C0975a;
import d3.InterfaceC1563q;
import d4.AbstractC1586n;
import d4.AbstractC1592t;
import d4.C1583k;
import e1.C1923y;
import g3.C2474b;
import java.util.List;
import k2.C3973v;
import k2.InterfaceC3960i;
import k2.InterfaceC3974w;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import lv.C4535g;
import m2.C4637b;
import m2.C4640e;
import p3.C5826x;
import s3.AbstractC6744a;
import s4.C6745a;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import uf.C7427b;
import v4.C7658d;
import v4.C7672r;
import w2.AbstractC7878q;
import w2.C7873l;
import w2.C7876o;
import w2.InterfaceC7877p;
import w2.InterfaceC7879r;
import w3.C7904v;
import w3.t2;
import x2.C8279c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 implements InterfaceC3960i, q1, InterfaceC7639k {

    /* renamed from: B */
    public C0910e f36824B;

    /* renamed from: C */
    public InterfaceC6747c f36825C;

    /* renamed from: D */
    public EnumC6757m f36826D;

    /* renamed from: E */
    public t2 f36827E;

    /* renamed from: F */
    public InterfaceC3974w f36828F;

    /* renamed from: G */
    public e0 f36829G;

    /* renamed from: H */
    public e0 f36830H;

    /* renamed from: I */
    public boolean f36831I;

    /* renamed from: K */
    public final C4535g f36832K;

    /* renamed from: L */
    public final k0 f36833L;

    /* renamed from: M */
    public t3.f0 f36834M;

    /* renamed from: N */
    public h1 f36835N;

    /* renamed from: O */
    public boolean f36836O;

    /* renamed from: T */
    public InterfaceC7879r f36837T;

    /* renamed from: V */
    public InterfaceC7879r f36838V;

    /* renamed from: X */
    public C7658d f36839X;

    /* renamed from: Y */
    public C5826x f36840Y;

    /* renamed from: Z */
    public boolean f36841Z;

    /* renamed from: a */
    public final boolean f36842a;

    /* renamed from: b */
    public int f36843b;

    /* renamed from: c */
    public long f36844c;

    /* renamed from: d */
    public long f36845d;

    /* renamed from: e */
    public long f36846e;

    /* renamed from: f */
    public boolean f36847f;

    /* renamed from: g */
    public boolean f36848g;

    /* renamed from: h */
    public g0 f36849h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f44836h0;

    /* renamed from: j */
    public int f36850j;

    /* renamed from: k */
    public final C0917l f36851k;

    /* renamed from: l */
    public C4640e f36852l;

    /* renamed from: m */
    public boolean f36853m;

    /* renamed from: n */
    public g0 f36854n;

    /* renamed from: p */
    public p1 f36855p;

    /* renamed from: q */
    public C7672r f36856q;

    /* renamed from: r */
    public int f36857r;

    /* renamed from: s */
    public boolean f36858s;

    /* renamed from: t */
    public boolean f36859t;

    /* renamed from: v */
    public C1583k f36860v;

    /* renamed from: w */
    public boolean f36861w;

    /* renamed from: x */
    public final C4640e f36862x;

    /* renamed from: y */
    public boolean f36863y;

    /* renamed from: z */
    public t3.j0 f36864z;

    /* renamed from: t0, reason: collision with root package name */
    public static final b0 f44835t0 = new b0("Undefined intrinsics block and it is required");
    public static final a0 X0 = new a0();
    public static final C0975a Y0 = new C0975a(9);

    public g0(int i10) {
        this((i10 & 1) == 0, AbstractC1586n.f7872a.addAndGet(1));
    }

    /* renamed from: P */
    public static boolean m14566P(g0 g0Var) {
        y0 y0Var = g0Var.f36833L.f36943p;
        return g0Var.m14585O(y0Var.f37061k ? new C6745a(y0Var.f34033d) : null);
    }

    /* renamed from: U */
    public static void m14567U(g0 g0Var, boolean z6, int i10) {
        g0 g0VarM14609v;
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        boolean z10 = (i10 & 2) != 0;
        boolean z11 = (i10 & 4) != 0;
        if (g0Var.f36849h == null) {
            AbstractC6744a.m12907b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        p1 p1Var = g0Var.f36855p;
        if (p1Var == null || g0Var.f36858s || g0Var.f36842a) {
            return;
        }
        ((C7904v) p1Var).m15019A(g0Var, true, z6, z10);
        if (z11) {
            s0 s0Var = g0Var.f36833L.f36944q;
            AbstractC4154l.m8920c(s0Var);
            k0 k0Var = s0Var.f36992f;
            g0 g0VarM14609v2 = k0Var.f36928a.m14609v();
            e0 e0Var = k0Var.f36928a.f36829G;
            if (g0VarM14609v2 == null || e0Var == e0.NotUsed) {
                return;
            }
            while (g0VarM14609v2.f36829G == e0Var && (g0VarM14609v = g0VarM14609v2.m14609v()) != null) {
                g0VarM14609v2 = g0VarM14609v;
            }
            int i11 = q0.f36973b[e0Var.ordinal()];
            if (i11 == 1) {
                if (g0VarM14609v2.f36849h != null) {
                    m14567U(g0VarM14609v2, z6, 6);
                    return;
                } else {
                    m14568W(g0VarM14609v2, z6, 6);
                    return;
                }
            }
            if (i11 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (g0VarM14609v2.f36849h != null) {
                g0VarM14609v2.m14589T(z6);
            } else {
                g0VarM14609v2.m14590V(z6);
            }
        }
    }

    /* renamed from: W */
    public static void m14568W(g0 g0Var, boolean z6, int i10) {
        p1 p1Var;
        g0 g0VarM14609v;
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        boolean z10 = (i10 & 2) != 0;
        boolean z11 = (i10 & 4) != 0;
        if (g0Var.f36858s || g0Var.f36842a || (p1Var = g0Var.f36855p) == null) {
            return;
        }
        ((C7904v) p1Var).m15019A(g0Var, false, z6, z10);
        if (z11) {
            k0 k0Var = g0Var.f36833L.f36943p.f37057f;
            g0 g0VarM14609v2 = k0Var.f36928a.m14609v();
            e0 e0Var = k0Var.f36928a.f36829G;
            if (g0VarM14609v2 == null || e0Var == e0.NotUsed) {
                return;
            }
            while (g0VarM14609v2.f36829G == e0Var && (g0VarM14609v = g0VarM14609v2.m14609v()) != null) {
                g0VarM14609v2 = g0VarM14609v;
            }
            int i11 = w0.f37038b[e0Var.ordinal()];
            if (i11 == 1) {
                m14568W(g0VarM14609v2, z6, 6);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                g0VarM14609v2.m14590V(z6);
            }
        }
    }

    /* renamed from: X */
    public static void m14569X(g0 g0Var) {
        k0 k0Var = g0Var.f36833L;
        if (f0.f36812a[k0Var.f36931d.ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + k0Var.f36931d);
        }
        if (k0Var.f36932e) {
            m14567U(g0Var, true, 6);
            return;
        }
        if (k0Var.f36933f) {
            g0Var.m14589T(true);
        }
        if (g0Var.m14606s()) {
            m14568W(g0Var, true, 6);
        } else if (g0Var.m14605r()) {
            g0Var.m14590V(true);
        }
    }

    /* renamed from: k */
    private final String m14570k(g0 g0Var) {
        StringBuilder sb2 = new StringBuilder("Cannot insert ");
        sb2.append(g0Var);
        sb2.append(" because it already has a parent or an owner. This tree: ");
        sb2.append(m14597g(0));
        sb2.append(" Other tree: ");
        g0 g0Var2 = g0Var.f36854n;
        sb2.append(g0Var2 != null ? g0Var2.m14597g(0) : null);
        return sb2.toString();
    }

    /* renamed from: A */
    public final void m14571A(long j6, C7647s c7647s, int i10, boolean z6) {
        C4535g c4535g = this.f36832K;
        h1 h1Var = (h1) c4535g.f22540d;
        d3.i0 i0Var = h1.f36888L;
        ((h1) c4535g.f22540d).Y0(h1.f36891O, h1Var.P0(j6), c7647s, i10, z6);
    }

    /* renamed from: B */
    public final void m14572B(int i10, g0 g0Var) {
        if (g0Var.f36854n != null && g0Var.f36855p != null) {
            AbstractC6744a.m12907b(m14570k(g0Var));
        }
        g0Var.f36854n = this;
        C0917l c0917l = this.f36851k;
        ((C4640e) c0917l.f5594b).m9505a(i10, g0Var);
        ((o6.b0) c0917l.f5595c).invoke();
        m14584N();
        if (g0Var.f36842a) {
            this.f36850j++;
        }
        m14577G();
        p1 p1Var = this.f36855p;
        if (p1Var != null) {
            g0Var.m14594d(p1Var);
        }
        if (g0Var.f36833L.f36939l > 0) {
            k0 k0Var = this.f36833L;
            k0Var.m14638b(k0Var.f36939l + 1);
        }
    }

    /* renamed from: C */
    public final void m14573C() {
        if (this.f36836O) {
            C4535g c4535g = this.f36832K;
            h1 h1Var = (C7649u) c4535g.f22539c;
            h1 h1Var2 = ((h1) c4535g.f22540d).f36904p;
            this.f36835N = null;
            while (true) {
                if (AbstractC4154l.m8918a(h1Var, h1Var2)) {
                    break;
                }
                if ((h1Var != null ? h1Var.f36901K : null) != null) {
                    this.f36835N = h1Var;
                    break;
                }
                h1Var = h1Var != null ? h1Var.f36904p : null;
            }
        }
        h1 h1Var3 = this.f36835N;
        if (h1Var3 != null && h1Var3.f36901K == null) {
            throw p020v.a1.m14342v("layer was not set");
        }
        if (h1Var3 != null) {
            h1Var3.a1();
            return;
        }
        g0 g0VarM14609v = m14609v();
        if (g0VarM14609v != null) {
            g0VarM14609v.m14573C();
        }
    }

    /* renamed from: D */
    public final void m14574D() {
        C4535g c4535g = this.f36832K;
        C7649u c7649u = (C7649u) c4535g.f22539c;
        for (h1 h1Var = (h1) c4535g.f22540d; h1Var != c7649u; h1Var = h1Var.f36903n) {
            AbstractC4154l.m8921d(h1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            o1 o1Var = ((C7654z) h1Var).f36901K;
            if (o1Var != null) {
                o1Var.invalidate();
            }
        }
        o1 o1Var2 = ((C7649u) c4535g.f22539c).f36901K;
        if (o1Var2 != null) {
            o1Var2.invalidate();
        }
    }

    /* renamed from: E */
    public final void m14575E() {
        this.f36847f = true;
        if (this.f36849h != null) {
            m14567U(this, false, 7);
        } else {
            m14568W(this, false, 7);
        }
    }

    /* renamed from: F */
    public final void m14576F() {
        if (this.f36861w) {
            return;
        }
        this.f36832K.getClass();
        if (d1.f36794a.f37675f != null || this.f36838V != null) {
            this.f36859t = true;
            return;
        }
        C1583k c1583k = this.f36860v;
        this.f36861w = true;
        C4168z c4168z = new C4168z();
        c4168z.f21164a = new C1583k();
        r1 snapshotObserver = ((C7904v) j0.m14636a(this)).getSnapshotObserver();
        snapshotObserver.m14657a(this, snapshotObserver.f36983d, new C0043b(20, this, c4168z));
        this.f36861w = false;
        this.f36860v = (C1583k) c4168z.f21164a;
        this.f36859t = false;
        C7904v c7904v = (C7904v) j0.m14636a(this);
        c7904v.getSemanticsOwner().m5222b(this, c1583k);
        c7904v.m15021C();
    }

    /* renamed from: G */
    public final void m14577G() {
        g0 g0Var;
        if (this.f36850j > 0) {
            this.f36853m = true;
        }
        if (!this.f36842a || (g0Var = this.f36854n) == null) {
            return;
        }
        g0Var.m14577G();
    }

    /* renamed from: H */
    public final boolean m14578H() {
        return this.f36855p != null;
    }

    /* renamed from: I */
    public final boolean m14579I() {
        return this.f36833L.f36943p.f37070v;
    }

    /* renamed from: J */
    public final Boolean m14580J() {
        s0 s0Var = this.f36833L.f36944q;
        if (s0Var != null) {
            return Boolean.valueOf(s0Var.mo14522I());
        }
        return null;
    }

    /* renamed from: K */
    public final void m14581K() {
        g0 g0VarM14609v;
        if (this.f36829G == e0.NotUsed) {
            m14596f();
        }
        s0 s0Var = this.f36833L.f36944q;
        AbstractC4154l.m8920c(s0Var);
        try {
            s0Var.f36993g = true;
            if (!s0Var.f36998m) {
                AbstractC6744a.m12907b("replace() called on item that was not placed");
            }
            s0Var.f36991B = false;
            boolean zMo14522I = s0Var.mo14522I();
            s0Var.B0(s0Var.f37001q, s0Var.f37002r);
            if (zMo14522I && !s0Var.f36991B && (g0VarM14609v = s0Var.f36992f.f36928a.m14609v()) != null) {
                g0VarM14609v.m14589T(false);
            }
            s0Var.f36993g = false;
        } catch (Throwable th2) {
            s0Var.f36993g = false;
            throw th2;
        }
    }

    /* renamed from: L */
    public final void m14582L(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            C0917l c0917l = this.f36851k;
            C4640e c4640e = (C4640e) c0917l.f5594b;
            o6.b0 b0Var = (o6.b0) c0917l.f5595c;
            Object objM9515m = c4640e.m9515m(i14);
            b0Var.invoke();
            ((C4640e) c0917l.f5594b).m9505a(i15, (g0) objM9515m);
            b0Var.invoke();
        }
        m14584N();
        m14577G();
        m14575E();
    }

    /* renamed from: M */
    public final void m14583M(g0 g0Var) {
        if (g0Var.f36833L.f36939l > 0) {
            this.f36833L.m14638b(r0.f36939l - 1);
        }
        if (this.f36855p != null) {
            g0Var.m14598h();
        }
        g0Var.f36854n = null;
        ((h1) g0Var.f36832K.f22540d).f36904p = null;
        if (g0Var.f36842a) {
            this.f36850j--;
            C4640e c4640e = (C4640e) g0Var.f36851k.f5594b;
            Object[] objArr = c4640e.f22884a;
            int i10 = c4640e.f22886c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((h1) ((g0) objArr[i11]).f36832K.f22540d).f36904p = null;
            }
        }
        m14577G();
        m14584N();
    }

    /* renamed from: N */
    public final void m14584N() {
        if (!this.f36842a) {
            this.f36863y = true;
            return;
        }
        g0 g0VarM14609v = m14609v();
        if (g0VarM14609v != null) {
            g0VarM14609v.m14584N();
        }
    }

    /* renamed from: O */
    public final boolean m14585O(C6745a c6745a) {
        if (c6745a == null) {
            return false;
        }
        if (this.f36829G == e0.NotUsed) {
            m14595e();
        }
        return this.f36833L.f36943p.D0(c6745a.f32195a);
    }

    /* renamed from: Q */
    public final void m14586Q() {
        C0917l c0917l = this.f36851k;
        C4640e c4640e = (C4640e) c0917l.f5594b;
        C4640e c4640e2 = (C4640e) c0917l.f5594b;
        int i10 = c4640e.f22886c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                c4640e2.m9511h();
                ((o6.b0) c0917l.f5595c).invoke();
                return;
            }
            m14583M((g0) c4640e2.f22884a[i10]);
        }
    }

    /* renamed from: R */
    public final void m14587R(int i10, int i11) {
        if (i11 < 0) {
            AbstractC6744a.m12906a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 > i12) {
            return;
        }
        while (true) {
            C0917l c0917l = this.f36851k;
            m14583M((g0) ((C4640e) c0917l.f5594b).f22884a[i12]);
            Object objM9515m = ((C4640e) c0917l.f5594b).m9515m(i12);
            ((o6.b0) c0917l.f5595c).invoke();
            if (i12 == i10) {
                return;
            } else {
                i12--;
            }
        }
    }

    /* renamed from: S */
    public final void m14588S() {
        g0 g0VarM14609v;
        if (this.f36829G == e0.NotUsed) {
            m14596f();
        }
        y0 y0Var = this.f36833L.f36943p;
        y0Var.getClass();
        try {
            y0Var.f37058g = true;
            if (!y0Var.f37062l) {
                AbstractC6744a.m12907b("replace called on unplaced item");
            }
            boolean z6 = y0Var.f37070v;
            y0Var.C0(y0Var.f37065p, y0Var.f37067r, y0Var.f37066q);
            if (z6 && !y0Var.f37051K && (g0VarM14609v = y0Var.f37057f.f36928a.m14609v()) != null) {
                g0VarM14609v.m14590V(false);
            }
            y0Var.f37058g = false;
        } catch (Throwable th2) {
            y0Var.f37058g = false;
            throw th2;
        }
    }

    /* renamed from: T */
    public final void m14589T(boolean z6) {
        p1 p1Var;
        if (this.f36842a || (p1Var = this.f36855p) == null) {
            return;
        }
        ((C7904v) p1Var).m15020B(this, true, z6);
    }

    /* renamed from: V */
    public final void m14590V(boolean z6) {
        p1 p1Var;
        this.f36847f = true;
        if (this.f36842a || (p1Var = this.f36855p) == null) {
            return;
        }
        ((C7904v) p1Var).m15020B(this, false, z6);
    }

    /* renamed from: Y */
    public final void m14591Y() {
        C4640e c4640eM14613z = m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) objArr[i11];
            e0 e0Var = g0Var.f36830H;
            g0Var.f36829G = e0Var;
            if (e0Var != e0.NotUsed) {
                g0Var.m14591Y();
            }
        }
    }

    /* renamed from: Z */
    public final void m14592Z(InterfaceC6747c interfaceC6747c) {
        if (AbstractC4154l.m8918a(this.f36825C, interfaceC6747c)) {
            return;
        }
        this.f36825C = interfaceC6747c;
        m14575E();
        g0 g0VarM14609v = m14609v();
        if (g0VarM14609v != null) {
            g0VarM14609v.m14573C();
        }
        m14574D();
        for (AbstractC7878q abstractC7878q = (AbstractC7878q) this.f36832K.f22542f; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
            abstractC7878q.mo153c();
        }
    }

    @Override // k2.InterfaceC3960i
    /* renamed from: a */
    public final void mo8538a() {
        C7672r c7672r = this.f36856q;
        if (c7672r != null) {
            c7672r.mo8538a();
        }
        t3.f0 f0Var = this.f36834M;
        if (f0Var != null) {
            f0Var.mo8538a();
        }
        C4535g c4535g = this.f36832K;
        h1 h1Var = ((C7649u) c4535g.f22539c).f36903n;
        for (h1 h1Var2 = (h1) c4535g.f22540d; !AbstractC4154l.m8918a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f36903n) {
            h1Var2.f36905q = true;
            h1Var2.f36899H.invoke();
            if (h1Var2.f36901K != null) {
                h1Var2.p1(null, false);
                h1Var2.f36902m.m14590V(false);
            }
        }
    }

    public final void a0(g0 g0Var) {
        if (AbstractC4154l.m8918a(g0Var, this.f36849h)) {
            return;
        }
        this.f36849h = g0Var;
        k0 k0Var = this.f36833L;
        if (g0Var != null) {
            if (k0Var.f36944q == null) {
                k0Var.f36944q = new s0(k0Var);
            }
            C4535g c4535g = this.f36832K;
            h1 h1Var = ((C7649u) c4535g.f22539c).f36903n;
            for (h1 h1Var2 = (h1) c4535g.f22540d; !AbstractC4154l.m8918a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f36903n) {
                h1Var2.N0();
            }
        } else {
            k0Var.f36944q = null;
        }
        m14575E();
    }

    @Override // k2.InterfaceC3960i
    /* renamed from: b */
    public final void mo8539b() {
        C8279c c8279c;
        C7672r c7672r = this.f36856q;
        if (c7672r != null) {
            c7672r.mo8539b();
        }
        t3.f0 f0Var = this.f36834M;
        if (f0Var != null) {
            f0Var.m13288e(true);
        }
        this.f44836h0 = true;
        C4535g c4535g = this.f36832K;
        for (AbstractC7878q abstractC7878q = (x1) c4535g.f22541e; abstractC7878q != null; abstractC7878q = abstractC7878q.f37674e) {
            if (abstractC7878q.f37683p) {
                abstractC7878q.G0();
            }
        }
        c4535g.m9391i();
        for (AbstractC7878q abstractC7878q2 = (x1) c4535g.f22541e; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37674e) {
            if (abstractC7878q2.f37683p) {
                abstractC7878q2.C0();
            }
        }
        if (m14578H()) {
            this.f36860v = null;
            this.f36859t = false;
        }
        p1 p1Var = this.f36855p;
        if (p1Var != null) {
            C7904v c7904v = (C7904v) p1Var;
            c7904v.getRectManager().m5700h(this);
            if (C7904v.m15013g() && (c8279c = c7904v.f38008G) != null && c8279c.f39810h.m5668e(this.f36843b)) {
                c8279c.f39803a.m1925h(c8279c.f39805c, this.f36843b, false);
            }
        }
    }

    public final void b0(t3.j0 j0Var) {
        if (AbstractC4154l.m8918a(this.f36864z, j0Var)) {
            return;
        }
        this.f36864z = j0Var;
        C0910e c0910e = this.f36824B;
        if (c0910e != null) {
            ((k2.e1) c0910e.f5580c).setValue(j0Var);
        }
        m14575E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [w2.q] */
    /* renamed from: c */
    public final void m14593c(InterfaceC7879r interfaceC7879r) {
        C4640e c4640e;
        C4535g c4535g;
        C4640e c4640e2;
        boolean z6;
        this.f36837T = interfaceC7879r;
        C4535g c4535g2 = this.f36832K;
        C7649u c7649u = (C7649u) c4535g2.f22539c;
        x1 x1Var = (x1) c4535g2.f22541e;
        g0 g0Var = (g0) c4535g2.f22538b;
        AbstractC7878q abstractC7878q = (AbstractC7878q) c4535g2.f22542f;
        AbstractC7878q abstractC7878qM9383b = d1.f36794a;
        if (abstractC7878q == abstractC7878qM9383b) {
            AbstractC6744a.m12907b("padChain called on already padded chain");
        }
        AbstractC7878q abstractC7878q2 = (AbstractC7878q) c4535g2.f22542f;
        abstractC7878q2.f37674e = abstractC7878qM9383b;
        abstractC7878qM9383b.f37675f = abstractC7878q2;
        C4640e c4640e3 = (C4640e) c4535g2.f22543g;
        int i10 = c4640e3 != null ? c4640e3.f22886c : 0;
        C4640e c4640e4 = (C4640e) c4535g2.f22544h;
        if (c4640e4 == null) {
            c4640e4 = new C4640e(new InterfaceC7877p[16]);
        }
        int i11 = c4640e4.f22886c;
        if (i11 < 16) {
            i11 = 16;
        }
        C4640e c4640e5 = new C4640e(new InterfaceC7879r[i11]);
        c4640e5.m9506b(interfaceC7879r);
        o1.l0 l0Var = null;
        while (true) {
            int i12 = c4640e5.f22886c;
            if (i12 == 0) {
                break;
            }
            InterfaceC7879r interfaceC7879r2 = (InterfaceC7879r) c4640e5.m9515m(i12 - 1);
            if (interfaceC7879r2 instanceof C7873l) {
                C7873l c7873l = (C7873l) interfaceC7879r2;
                c4640e5.m9506b(c7873l.f37666b);
                c4640e5.m9506b(c7873l.f37665a);
            } else if (interfaceC7879r2 instanceof InterfaceC7877p) {
                c4640e4.m9506b(interfaceC7879r2);
            } else {
                if (l0Var == null) {
                    l0Var = new o1.l0(1, c4640e4);
                }
                interfaceC7879r2.mo14851c(l0Var);
                l0Var = l0Var;
            }
        }
        int i13 = c4640e4.f22886c;
        if (i13 == i10) {
            AbstractC7878q abstractC7878q3 = abstractC7878qM9383b.f37675f;
            int i14 = 0;
            while (true) {
                if (abstractC7878q3 == null || i14 >= i10) {
                    break;
                }
                if (c4640e3 == null) {
                    throw p020v.a1.m14342v("expected prior modifier list to be non-empty");
                }
                InterfaceC7877p interfaceC7877p = (InterfaceC7877p) c4640e3.f22884a[i14];
                InterfaceC7877p interfaceC7877p2 = (InterfaceC7877p) c4640e4.f22884a[i14];
                char c2 = AbstractC4154l.m8918a(interfaceC7877p, interfaceC7877p2) ? (char) 2 : interfaceC7877p.getClass() == interfaceC7877p2.getClass() ? (char) 1 : (char) 0;
                if (c2 == 0) {
                    abstractC7878q3 = abstractC7878q3.f37674e;
                    break;
                }
                if (c2 == 1) {
                    C4535g.m9385n(interfaceC7877p, interfaceC7877p2, abstractC7878q3);
                }
                abstractC7878q3 = abstractC7878q3.f37675f;
                i14++;
            }
            if (i14 >= i10) {
                c4535g2 = c4535g2;
                c4535g = c4535g2;
                c4640e2 = c4640e4;
                z6 = false;
            } else {
                if (c4640e3 == null) {
                    throw p020v.a1.m14342v("expected prior modifier list to be non-empty");
                }
                if (abstractC7878q3 == null) {
                    throw p020v.a1.m14342v("structuralUpdate requires a non-null tail");
                }
                boolean z10 = g0Var.f36838V != null;
                AbstractC7878q abstractC7878q4 = abstractC7878q3;
                c4535g = c4535g2;
                c4640e = c4640e3;
                c4640e2 = c4640e4;
                c4535g.m9394l(i14, c4640e, c4640e2, abstractC7878q4, !z10);
                c4640e3 = c4640e;
                z6 = true;
            }
        } else {
            InterfaceC7879r interfaceC7879r3 = g0Var.f36838V;
            if (interfaceC7879r3 != null && i10 == 0) {
                for (int i15 = 0; i15 < c4640e4.f22886c; i15++) {
                    abstractC7878qM9383b = C4535g.m9383b((InterfaceC7877p) c4640e4.f22884a[i15], abstractC7878qM9383b);
                }
                int i16 = 0;
                for (AbstractC7878q abstractC7878q5 = x1Var.f37674e; abstractC7878q5 != null && abstractC7878q5 != d1.f36794a; abstractC7878q5 = abstractC7878q5.f37674e) {
                    i16 |= abstractC7878q5.f37672c;
                    abstractC7878q5.f37673d = i16;
                }
                c4535g = c4535g2;
                c4640e2 = c4640e4;
                z6 = true;
            } else if (i13 != 0) {
                if (c4640e3 == null) {
                    c4640e3 = new C4640e(new InterfaceC7877p[16]);
                }
                c4640e = c4640e3;
                c4535g = c4535g2;
                c4640e2 = c4640e4;
                c4535g.m9394l(0, c4640e, c4640e2, abstractC7878qM9383b, !(interfaceC7879r3 != null));
                c4640e3 = c4640e;
                z6 = true;
            } else {
                if (c4640e3 == null) {
                    throw p020v.a1.m14342v("expected prior modifier list to be non-empty");
                }
                AbstractC7878q abstractC7878q6 = abstractC7878qM9383b.f37675f;
                for (int i17 = 0; abstractC7878q6 != null && i17 < c4640e3.f22886c; i17++) {
                    abstractC7878q6 = C4535g.m9384c(abstractC7878q6).f37675f;
                }
                g0 g0VarM14609v = g0Var.m14609v();
                c7649u.f36904p = g0VarM14609v != null ? (C7649u) g0VarM14609v.f36832K.f22539c : null;
                c4535g2.f22540d = c7649u;
                c4535g = c4535g2;
                c4640e2 = c4640e4;
                z6 = false;
            }
        }
        c4535g.f22543g = c4640e2;
        if (c4640e3 != null) {
            c4640e3.m9511h();
        } else {
            c4640e3 = null;
        }
        c4535g.f22544h = c4640e3;
        c1 c1Var = d1.f36794a;
        ?? r32 = c1Var.f37675f;
        if (r32 != 0) {
            x1Var = r32;
        }
        x1Var.f37674e = null;
        c1Var.f37675f = null;
        c1Var.f37673d = -1;
        c1Var.f37677h = null;
        if (x1Var == c1Var) {
            AbstractC6744a.m12907b("trimChain did not update the head");
        }
        c4535g.f22542f = x1Var;
        if (z6) {
            c4535g.m9395m();
        }
        this.f36833L.m14644h();
        if (this.f36849h == null && c4535g.m9386d(512)) {
            a0(this);
        }
    }

    public final void c0(InterfaceC7879r interfaceC7879r) {
        if (this.f36842a && this.f36837T != C7876o.f37669a) {
            AbstractC6744a.m12906a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.f44836h0) {
            AbstractC6744a.m12906a("modifier is updated when deactivated");
        }
        if (!m14578H()) {
            this.f36838V = interfaceC7879r;
            return;
        }
        m14593c(interfaceC7879r);
        if (this.f36859t) {
            m14576F();
        }
    }

    /* renamed from: d */
    public final void m14594d(p1 p1Var) {
        g0 g0Var;
        C8279c c8279c;
        C1583k c1583kM14611x;
        if (this.f36855p != null) {
            AbstractC6744a.m12907b("Cannot attach " + this + " as it already is attached.  Tree: " + m14597g(0));
        }
        g0 g0Var2 = this.f36854n;
        if (g0Var2 != null && !AbstractC4154l.m8918a(g0Var2.f36855p, p1Var)) {
            StringBuilder sb2 = new StringBuilder("Attaching to a different owner(");
            sb2.append(p1Var);
            sb2.append(") than the parent's owner(");
            g0 g0VarM14609v = m14609v();
            sb2.append(g0VarM14609v != null ? g0VarM14609v.f36855p : null);
            sb2.append("). This tree: ");
            sb2.append(m14597g(0));
            sb2.append(" Parent tree: ");
            g0 g0Var3 = this.f36854n;
            sb2.append(g0Var3 != null ? g0Var3.m14597g(0) : null);
            AbstractC6744a.m12907b(sb2.toString());
        }
        g0 g0VarM14609v2 = m14609v();
        k0 k0Var = this.f36833L;
        if (g0VarM14609v2 == null) {
            k0Var.f36943p.f37070v = true;
            s0 s0Var = k0Var.f36944q;
            if (s0Var != null) {
                s0Var.f37003s = p0.IsPlacedInLookahead;
            }
        }
        C4535g c4535g = this.f36832K;
        ((h1) c4535g.f22540d).f36904p = g0VarM14609v2 != null ? (C7649u) g0VarM14609v2.f36832K.f22539c : null;
        this.f36855p = p1Var;
        this.f36857r = (g0VarM14609v2 != null ? g0VarM14609v2.f36857r : -1) + 1;
        InterfaceC7879r interfaceC7879r = this.f36838V;
        if (interfaceC7879r != null) {
            m14593c(interfaceC7879r);
        }
        this.f36838V = null;
        C7904v c7904v = (C7904v) p1Var;
        c7904v.getLayoutNodes().m5663h(this.f36843b, this);
        g0 g0Var4 = this.f36854n;
        if (g0Var4 == null || (g0Var = g0Var4.f36849h) == null) {
            g0Var = this.f36849h;
        }
        a0(g0Var);
        if (this.f36849h == null && c4535g.m9386d(512)) {
            a0(this);
        }
        if (!this.f44836h0) {
            for (AbstractC7878q abstractC7878q = (AbstractC7878q) c4535g.f22542f; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
                abstractC7878q.B0();
            }
        }
        C4640e c4640e = (C4640e) this.f36851k.f5594b;
        Object[] objArr = c4640e.f22884a;
        int i10 = c4640e.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g0) objArr[i11]).m14594d(p1Var);
        }
        if (!this.f44836h0) {
            c4535g.m9390h();
        }
        m14575E();
        if (g0VarM14609v2 != null) {
            g0VarM14609v2.m14575E();
        }
        h1 h1Var = ((C7649u) c4535g.f22539c).f36903n;
        for (h1 h1Var2 = (h1) c4535g.f22540d; !AbstractC4154l.m8918a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f36903n) {
            h1Var2.p1(h1Var2.f36907s, true);
            o1 o1Var = h1Var2.f36901K;
            if (o1Var != null) {
                o1Var.invalidate();
            }
        }
        C7658d c7658d = this.f36839X;
        if (c7658d != null) {
            c7658d.invoke(p1Var);
        }
        k0Var.m14644h();
        if (!this.f44836h0 && c4535g.m9386d(8)) {
            m14576F();
        }
        c7904v.getClass();
        if (!C7904v.m15013g() || (c8279c = c7904v.f38008G) == null || (c1583kM14611x = m14611x()) == null || !c1583kM14611x.f7868a.m5569b(AbstractC1592t.f7932p)) {
            return;
        }
        c8279c.f39810h.m5664a(this.f36843b);
        c8279c.f39803a.m1925h(c8279c.f39805c, this.f36843b, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void d0(t2 t2Var) {
        if (AbstractC4154l.m8918a(this.f36827E, t2Var)) {
            return;
        }
        this.f36827E = t2Var;
        AbstractC7878q abstractC7878q = (AbstractC7878q) this.f36832K.f22542f;
        if ((abstractC7878q.f37673d & 16) != 0) {
            while (abstractC7878q != null) {
                if ((abstractC7878q.f37672c & 16) != 0) {
                    AbstractC7642n abstractC7642nM14545f = abstractC7878q;
                    ?? c4640e = 0;
                    while (abstractC7642nM14545f != 0) {
                        if (abstractC7642nM14545f instanceof u1) {
                            ((u1) abstractC7642nM14545f).m0();
                        } else if ((abstractC7642nM14545f.f37672c & 16) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                            AbstractC7878q abstractC7878q2 = abstractC7642nM14545f.f36953r;
                            int i10 = 0;
                            abstractC7642nM14545f = abstractC7642nM14545f;
                            c4640e = c4640e;
                            while (abstractC7878q2 != null) {
                                if ((abstractC7878q2.f37672c & 16) != 0) {
                                    i10++;
                                    c4640e = c4640e;
                                    if (i10 == 1) {
                                        abstractC7642nM14545f = abstractC7878q2;
                                    } else {
                                        if (c4640e == 0) {
                                            c4640e = new C4640e(new AbstractC7878q[16]);
                                        }
                                        if (abstractC7642nM14545f != 0) {
                                            c4640e.m9506b(abstractC7642nM14545f);
                                            abstractC7642nM14545f = 0;
                                        }
                                        c4640e.m9506b(abstractC7878q2);
                                    }
                                }
                                abstractC7878q2 = abstractC7878q2.f37675f;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e = c4640e;
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                    }
                }
                if ((abstractC7878q.f37673d & 16) == 0) {
                    return;
                } else {
                    abstractC7878q = abstractC7878q.f37675f;
                }
            }
        }
    }

    /* renamed from: e */
    public final void m14595e() {
        this.f36830H = this.f36829G;
        this.f36829G = e0.NotUsed;
        C4640e c4640eM14613z = m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) objArr[i11];
            if (g0Var.f36829G != e0.NotUsed) {
                g0Var.m14595e();
            }
        }
    }

    public final void e0() {
        if (this.f36850j <= 0 || !this.f36853m) {
            return;
        }
        this.f36853m = false;
        C4640e c4640e = this.f36852l;
        if (c4640e == null) {
            c4640e = new C4640e(new g0[16]);
            this.f36852l = c4640e;
        }
        c4640e.m9511h();
        C4640e c4640e2 = (C4640e) this.f36851k.f5594b;
        Object[] objArr = c4640e2.f22884a;
        int i10 = c4640e2.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) objArr[i11];
            if (g0Var.f36842a) {
                c4640e.m9507c(c4640e.f22886c, g0Var.m14613z());
            } else {
                c4640e.m9506b(g0Var);
            }
        }
        k0 k0Var = this.f36833L;
        k0Var.f36943p.f37045D = true;
        s0 s0Var = k0Var.f36944q;
        if (s0Var != null) {
            s0Var.f37006w = true;
        }
    }

    /* renamed from: f */
    public final void m14596f() {
        this.f36830H = this.f36829G;
        this.f36829G = e0.NotUsed;
        C4640e c4640eM14613z = m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var = (g0) objArr[i11];
            if (g0Var.f36829G == e0.InLayoutBlock) {
                g0Var.m14596f();
            }
        }
    }

    /* renamed from: g */
    public final String m14597g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        C4640e c4640eM14613z = m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i12 = c4640eM14613z.f22886c;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(((g0) objArr[i13]).m14597g(i10 + 1));
        }
        String string = sb2.toString();
        if (i10 != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        AbstractC4154l.m8922e(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* renamed from: h */
    public final void m14598h() {
        C8279c c8279c;
        h0 h0Var;
        p1 p1Var = this.f36855p;
        if (p1Var == null) {
            StringBuilder sb2 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            g0 g0VarM14609v = m14609v();
            sb2.append(g0VarM14609v != null ? g0VarM14609v.m14597g(0) : null);
            AbstractC6744a.m12908c(sb2.toString());
            throw new KotlinNothingValueException();
        }
        g0 g0VarM14609v2 = m14609v();
        k0 k0Var = this.f36833L;
        if (g0VarM14609v2 != null) {
            g0VarM14609v2.m14573C();
            g0VarM14609v2.m14575E();
            y0 y0Var = k0Var.f36943p;
            e0 e0Var = e0.NotUsed;
            y0Var.f37063m = e0Var;
            s0 s0Var = k0Var.f36944q;
            if (s0Var != null) {
                s0Var.f36996k = e0Var;
            }
        }
        h0 h0Var2 = k0Var.f36943p.f37043B;
        h0Var2.f36879b = true;
        h0Var2.f36880c = false;
        h0Var2.f36882e = false;
        h0Var2.f36881d = false;
        h0Var2.f36883f = false;
        h0Var2.f36884g = false;
        h0Var2.f36885h = null;
        s0 s0Var2 = k0Var.f36944q;
        if (s0Var2 != null && (h0Var = s0Var2.f37004t) != null) {
            h0Var.f36879b = true;
            h0Var.f36880c = false;
            h0Var.f36882e = false;
            h0Var.f36881d = false;
            h0Var.f36883f = false;
            h0Var.f36884g = false;
            h0Var.f36885h = null;
        }
        C5826x c5826x = this.f36840Y;
        if (c5826x != null) {
            c5826x.invoke(p1Var);
        }
        C4535g c4535g = this.f36832K;
        c4535g.m9391i();
        this.f36858s = true;
        C4640e c4640e = (C4640e) this.f36851k.f5594b;
        Object[] objArr = c4640e.f22884a;
        int i10 = c4640e.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g0) objArr[i11]).m14598h();
        }
        this.f36858s = false;
        for (AbstractC7878q abstractC7878q = (x1) c4535g.f22541e; abstractC7878q != null; abstractC7878q = abstractC7878q.f37674e) {
            if (abstractC7878q.f37683p) {
                abstractC7878q.C0();
            }
        }
        C7904v c7904v = (C7904v) p1Var;
        c7904v.getLayoutNodes().m5662g(this.f36843b);
        v0 v0Var = c7904v.f44844h0;
        C0908c c0908c = v0Var.f37029b;
        ((C7427b) c0908c.f5574b).m13820o(this);
        ((C7427b) c0908c.f5575c).m13820o(this);
        ((C4640e) v0Var.f37032e.f5668b).m9514l(this);
        c7904v.f38009H = true;
        c7904v.getRectManager().m5700h(this);
        if (C7904v.m15013g() && (c8279c = c7904v.f38008G) != null && c8279c.f39810h.m5668e(this.f36843b)) {
            c8279c.f39803a.m1925h(c8279c.f39805c, this.f36843b, false);
        }
        this.f36855p = null;
        a0(null);
        this.f36857r = 0;
        y0 y0Var2 = k0Var.f36943p;
        y0Var2.f37060j = Integer.MAX_VALUE;
        y0Var2.f37059h = Integer.MAX_VALUE;
        y0Var2.f37070v = false;
        s0 s0Var3 = k0Var.f36944q;
        if (s0Var3 != null) {
            s0Var3.f36995j = Integer.MAX_VALUE;
            s0Var3.f36994h = Integer.MAX_VALUE;
            s0Var3.f37003s = p0.IsNotPlaced;
        }
        if (c4535g.m9386d(8)) {
            C1583k c1583k = this.f36860v;
            this.f36860v = null;
            this.f36859t = false;
            c7904v.getSemanticsOwner().m5222b(this, c1583k);
            c7904v.m15021C();
        }
    }

    /* renamed from: i */
    public final void m14599i(InterfaceC1563q interfaceC1563q, C2474b c2474b) {
        ((h1) this.f36832K.f22540d).L0(interfaceC1563q, c2474b);
    }

    @Override // k2.InterfaceC3960i
    /* renamed from: j */
    public final void mo8540j() {
        C8279c c8279c;
        if (!m14578H()) {
            AbstractC6744a.m12906a("onReuse is only expected on attached node");
        }
        C7672r c7672r = this.f36856q;
        if (c7672r != null) {
            c7672r.mo8540j();
        }
        t3.f0 f0Var = this.f36834M;
        if (f0Var != null) {
            f0Var.m13288e(false);
        }
        this.f36861w = false;
        boolean z6 = this.f44836h0;
        C4535g c4535g = this.f36832K;
        if (z6) {
            this.f44836h0 = false;
        } else {
            for (AbstractC7878q abstractC7878q = (x1) c4535g.f22541e; abstractC7878q != null; abstractC7878q = abstractC7878q.f37674e) {
                if (abstractC7878q.f37683p) {
                    abstractC7878q.G0();
                }
            }
            c4535g.m9391i();
            for (AbstractC7878q abstractC7878q2 = (x1) c4535g.f22541e; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37674e) {
                if (abstractC7878q2.f37683p) {
                    abstractC7878q2.C0();
                }
            }
        }
        int i10 = this.f36843b;
        this.f36843b = AbstractC1586n.f7872a.addAndGet(1);
        p1 p1Var = this.f36855p;
        if (p1Var != null) {
            C7904v c7904v = (C7904v) p1Var;
            c7904v.getLayoutNodes().m5662g(i10);
            c7904v.getLayoutNodes().m5663h(this.f36843b, this);
        }
        for (AbstractC7878q abstractC7878q3 = (AbstractC7878q) c4535g.f22542f; abstractC7878q3 != null; abstractC7878q3 = abstractC7878q3.f37675f) {
            abstractC7878q3.B0();
        }
        c4535g.m9390h();
        if (c4535g.m9386d(8)) {
            m14576F();
        }
        m14569X(this);
        p1 p1Var2 = this.f36855p;
        if (p1Var2 != null) {
            C7904v c7904v2 = (C7904v) p1Var2;
            if (C7904v.m15013g() && (c8279c = c7904v2.f38008G) != null) {
                C7904v c7904v3 = c8279c.f39805c;
                C0657b c0657b = c8279c.f39803a;
                C1923y c1923y = c8279c.f39810h;
                if (c1923y.m5668e(i10)) {
                    c0657b.m1925h(c7904v3, i10, false);
                }
                C1583k c1583kM14611x = m14611x();
                if (c1583kM14611x != null && c1583kM14611x.f7868a.m5569b(AbstractC1592t.f7932p)) {
                    c1923y.m5664a(this.f36843b);
                    c0657b.m1925h(c7904v3, this.f36843b, true);
                }
            }
            c7904v2.getRectManager().m5699f(this, this.f36833L.f36943p.f37065p, true);
        }
    }

    /* renamed from: l */
    public final void m14600l() {
        if (this.f36849h != null) {
            m14567U(this, false, 5);
        } else {
            m14568W(this, false, 5);
        }
        y0 y0Var = this.f36833L.f36943p;
        C6745a c6745a = y0Var.f37061k ? new C6745a(y0Var.f34033d) : null;
        if (c6745a != null) {
            p1 p1Var = this.f36855p;
            if (p1Var != null) {
                ((C7904v) p1Var).m15039v(this, c6745a.f32195a);
                return;
            }
            return;
        }
        p1 p1Var2 = this.f36855p;
        if (p1Var2 != null) {
            ((C7904v) p1Var2).m15038t(true);
        }
    }

    /* renamed from: m */
    public final List m14601m() {
        s0 s0Var = this.f36833L.f36944q;
        AbstractC4154l.m8920c(s0Var);
        C4640e c4640e = s0Var.f37005v;
        k0 k0Var = s0Var.f36992f;
        k0Var.f36928a.m14603p();
        if (!s0Var.f37006w) {
            return c4640e.m9510g();
        }
        g0 g0Var = k0Var.f36928a;
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (c4640e.f22886c <= i11) {
                s0 s0Var2 = g0Var2.f36833L.f36944q;
                AbstractC4154l.m8920c(s0Var2);
                c4640e.m9506b(s0Var2);
            } else {
                s0 s0Var3 = g0Var2.f36833L.f36944q;
                AbstractC4154l.m8920c(s0Var3);
                Object[] objArr2 = c4640e.f22884a;
                Object obj = objArr2[i11];
                objArr2[i11] = s0Var3;
            }
        }
        c4640e.m9516n(((C4637b) g0Var.m14603p()).f22878a.f22886c, c4640e.f22886c);
        s0Var.f37006w = false;
        return c4640e.m9510g();
    }

    @Override // v3.q1
    /* renamed from: n */
    public final boolean mo14534n() {
        return m14578H();
    }

    /* renamed from: o */
    public final List m14602o() {
        return this.f36833L.f36943p.t0();
    }

    /* renamed from: p */
    public final List m14603p() {
        return m14613z().m9510g();
    }

    /* renamed from: q */
    public final List m14604q() {
        return ((C4640e) this.f36851k.f5594b).m9510g();
    }

    /* renamed from: r */
    public final boolean m14605r() {
        return this.f36833L.f36943p.f37073y;
    }

    /* renamed from: s */
    public final boolean m14606s() {
        return this.f36833L.f36943p.f37072x;
    }

    /* renamed from: t */
    public final e0 m14607t() {
        e0 e0Var;
        s0 s0Var = this.f36833L.f36944q;
        return (s0Var == null || (e0Var = s0Var.f36996k) == null) ? e0.NotUsed : e0Var;
    }

    public final String toString() {
        return w3.m0.m14995v(this) + " children: " + ((C4637b) m14603p()).f22878a.f22886c + " measurePolicy: " + this.f36864z;
    }

    /* renamed from: u */
    public final C0910e m14608u() {
        C0910e c0910e = this.f36824B;
        if (c0910e != null) {
            return c0910e;
        }
        C0910e c0910e2 = new C0910e(this, this.f36864z);
        this.f36824B = c0910e2;
        return c0910e2;
    }

    /* renamed from: v */
    public final g0 m14609v() {
        g0 g0Var = this.f36854n;
        while (g0Var != null && g0Var.f36842a) {
            g0Var = g0Var.f36854n;
        }
        return g0Var;
    }

    /* renamed from: w */
    public final int m14610w() {
        return this.f36833L.f36943p.f37060j;
    }

    /* renamed from: x */
    public final C1583k m14611x() {
        if (m14578H() && !this.f44836h0 && this.f36832K.m9386d(8)) {
            return this.f36860v;
        }
        return null;
    }

    /* renamed from: y */
    public final C4640e m14612y() {
        boolean z6 = this.f36863y;
        C4640e c4640e = this.f36862x;
        if (z6) {
            c4640e.m9511h();
            c4640e.m9507c(c4640e.f22886c, m14613z());
            c4640e.m9518q(Y0);
            this.f36863y = false;
        }
        return c4640e;
    }

    /* renamed from: z */
    public final C4640e m14613z() {
        e0();
        if (this.f36850j == 0) {
            return (C4640e) this.f36851k.f5594b;
        }
        C4640e c4640e = this.f36852l;
        AbstractC4154l.m8920c(c4640e);
        return c4640e;
    }

    public g0(boolean z6, int i10) {
        this.f36842a = z6;
        this.f36843b = i10;
        this.f36844c = 9223372034707292159L;
        this.f36845d = 0L;
        this.f36846e = 9223372034707292159L;
        this.f36847f = true;
        this.f36851k = new C0917l(20, new C4640e(new g0[16]), new o6.b0(11, this));
        this.f36862x = new C4640e(new g0[16]);
        this.f36863y = true;
        this.f36864z = f44835t0;
        this.f36825C = j0.f36927a;
        this.f36826D = EnumC6757m.Ltr;
        this.f36827E = X0;
        InterfaceC3974w.K0.getClass();
        this.f36828F = C3973v.f20592b;
        e0 e0Var = e0.NotUsed;
        this.f36829G = e0Var;
        this.f36830H = e0Var;
        this.f36832K = new C4535g(this);
        this.f36833L = new k0(this);
        this.f36836O = true;
        this.f36837T = C7876o.f37669a;
    }
}
