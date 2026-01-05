package v3;

import ex.InterfaceC2139c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import m2.C4637b;
import m2.C4640e;
import s1.C6725t;
import s3.AbstractC6744a;
import s4.AbstractC6746b;
import s4.C6745a;
import s4.C6754j;
import s4.C6756l;
import t3.C7027n;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 extends t3.w0 implements t3.i0, InterfaceC7629a, b1 {

    /* renamed from: E */
    public boolean f37046E;

    /* renamed from: I */
    public float f37050I;

    /* renamed from: K */
    public boolean f37051K;

    /* renamed from: L */
    public InterfaceC2139c f37052L;

    /* renamed from: N */
    public float f37054N;

    /* renamed from: T */
    public boolean f37056T;

    /* renamed from: f */
    public final k0 f37057f;

    /* renamed from: g */
    public boolean f37058g;

    /* renamed from: k */
    public boolean f37061k;

    /* renamed from: l */
    public boolean f37062l;

    /* renamed from: n */
    public boolean f37064n;

    /* renamed from: q */
    public InterfaceC2139c f37066q;

    /* renamed from: r */
    public float f37067r;

    /* renamed from: t */
    public Object f37069t;

    /* renamed from: v */
    public boolean f37070v;

    /* renamed from: w */
    public boolean f37071w;

    /* renamed from: x */
    public boolean f37072x;

    /* renamed from: y */
    public boolean f37073y;

    /* renamed from: z */
    public boolean f37074z;

    /* renamed from: h */
    public int f37059h = Integer.MAX_VALUE;

    /* renamed from: j */
    public int f37060j = Integer.MAX_VALUE;

    /* renamed from: m */
    public e0 f37063m = e0.NotUsed;

    /* renamed from: p */
    public long f37065p = 0;

    /* renamed from: s */
    public boolean f37068s = true;

    /* renamed from: B */
    public final h0 f37043B = new h0(this, 0);

    /* renamed from: C */
    public final C4640e f37044C = new C4640e(new y0[16]);

    /* renamed from: D */
    public boolean f37045D = true;

    /* renamed from: F */
    public long f37047F = AbstractC6746b.m12924b(0, 0, 15);

    /* renamed from: G */
    public final x0 f37048G = new x0(this, 1);

    /* renamed from: H */
    public final x0 f37049H = new x0(this, 0);

    /* renamed from: M */
    public long f37053M = 0;

    /* renamed from: O */
    public final x0 f37055O = new x0(this, 2);

    public y0(k0 k0Var) {
        this.f37057f = k0Var;
    }

    public final void A0() {
        k0 k0Var = this.f37057f;
        g0.m14568W(k0Var.f36928a, false, 7);
        g0 g0Var = k0Var.f36928a;
        g0 g0VarM14609v = g0Var.m14609v();
        if (g0VarM14609v == null || g0Var.f36829G != e0.NotUsed) {
            return;
        }
        int i10 = w0.f37037a[g0VarM14609v.f36833L.f36931d.ordinal()];
        g0Var.f36829G = i10 != 1 ? i10 != 2 ? g0VarM14609v.f36829G : e0.InLayoutBlock : e0.InMeasureBlock;
    }

    public final void B0() {
        this.f37051K = true;
        k0 k0Var = this.f37057f;
        g0 g0VarM14609v = k0Var.f36928a.m14609v();
        float f6 = mo14526j().f36893B;
        g0 g0Var = k0Var.f36928a;
        C4535g c4535g = g0Var.f36832K;
        C7649u c7649u = (C7649u) c4535g.f22539c;
        for (h1 h1Var = (h1) c4535g.f22540d; h1Var != c7649u; h1Var = h1Var.f36903n) {
            AbstractC4154l.m8921d(h1Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f6 += ((C7654z) h1Var).f36893B;
        }
        if (f6 != this.f37050I) {
            this.f37050I = f6;
            if (g0VarM14609v != null) {
                g0VarM14609v.m14584N();
            }
            if (g0VarM14609v != null) {
                g0VarM14609v.m14573C();
            }
        }
        if (this.f37070v) {
            ((C7649u) g0Var.f36832K.f22539c).g1();
        } else {
            if (g0VarM14609v != null) {
                g0VarM14609v.m14573C();
            }
            u0();
            if (this.f37058g && g0VarM14609v != null) {
                g0VarM14609v.m14590V(false);
            }
        }
        if (g0VarM14609v != null) {
            k0 k0Var2 = g0VarM14609v.f36833L;
            if (!this.f37058g && k0Var2.f36931d == c0.LayingOut) {
                if (this.f37060j != Integer.MAX_VALUE) {
                    AbstractC6744a.m12907b("Place was called on a node which was placed already");
                }
                int i10 = k0Var2.f36936i;
                this.f37060j = i10;
                k0Var2.f36936i = i10 + 1;
            }
        } else {
            this.f37060j = 0;
        }
        mo14521H();
    }

    @Override // t3.w0, t3.i0
    /* renamed from: C */
    public final Object mo13310C() {
        return this.f37069t;
    }

    public final void C0(long j6, float f6, InterfaceC2139c interfaceC2139c) {
        k0 k0Var = this.f37057f;
        g0 g0Var = k0Var.f36928a;
        g0 g0Var2 = k0Var.f36928a;
        if (g0Var.f44836h0) {
            AbstractC6744a.m12906a("place is called on a deactivated node");
        }
        k0Var.f36931d = c0.LayingOut;
        boolean z6 = !this.f37062l;
        this.f37065p = j6;
        this.f37067r = f6;
        this.f37066q = interfaceC2139c;
        this.f37062l = true;
        this.f37051K = false;
        C7904v c7904v = (C7904v) j0.m14636a(g0Var2);
        c7904v.getRectManager().m5699f(g0Var2, j6, z6);
        if (this.f37073y || !this.f37070v) {
            this.f37043B.f36884g = false;
            k0Var.m14640d(false);
            this.f37052L = interfaceC2139c;
            this.f37053M = j6;
            this.f37054N = f6;
            r1 snapshotObserver = c7904v.getSnapshotObserver();
            snapshotObserver.m14657a(g0Var2, snapshotObserver.f36985f, this.f37055O);
        } else {
            h1 h1VarM14637a = k0Var.m14637a();
            h1VarM14637a.j1(C6754j.m12942c(j6, h1VarM14637a.f34034e), f6, interfaceC2139c);
            B0();
        }
        k0Var.f36931d = c0.Idle;
    }

    public final boolean D0(long j6) {
        k0 k0Var = this.f37057f;
        g0 g0Var = k0Var.f36928a;
        g0 g0Var2 = k0Var.f36928a;
        if (g0Var.f44836h0) {
            AbstractC6744a.m12906a("measure is called on a deactivated node");
        }
        p1 p1VarM14636a = j0.m14636a(g0Var2);
        g0 g0VarM14609v = g0Var2.m14609v();
        boolean z6 = true;
        g0Var2.f36831I = g0Var2.f36831I || (g0VarM14609v != null && g0VarM14609v.f36831I);
        if (!g0Var2.m14606s() && C6745a.m12912c(this.f34033d, j6)) {
            ((C7904v) p1VarM14636a).m15031k(g0Var2, false);
            g0Var2.m14591Y();
            return false;
        }
        this.f37043B.f36883f = false;
        C4640e c4640eM14613z = g0Var2.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g0) objArr[i11]).f36833L.f36943p.f37043B.f36880c = false;
        }
        this.f37061k = true;
        long j10 = k0Var.m14637a().f34032c;
        q0(j6);
        c0 c0Var = k0Var.f36931d;
        c0 c0Var2 = c0.Idle;
        if (c0Var != c0Var2) {
            AbstractC6744a.m12907b("layout state is not idle before measure starts");
        }
        this.f37047F = j6;
        c0 c0Var3 = c0.Measuring;
        k0Var.f36931d = c0Var3;
        this.f37072x = false;
        r1 snapshotObserver = ((C7904v) j0.m14636a(g0Var2)).getSnapshotObserver();
        snapshotObserver.m14657a(g0Var2, snapshotObserver.f36982c, this.f37048G);
        if (k0Var.f36931d == c0Var3) {
            this.f37073y = true;
            this.f37074z = true;
            k0Var.f36931d = c0Var2;
        }
        if (C6756l.m12948a(k0Var.m14637a().f34032c, j10) && k0Var.m14637a().f34030a == this.f34030a && k0Var.m14637a().f34031b == this.f34031b) {
            z6 = false;
        }
        m0((k0Var.m14637a().f34031b & 4294967295L) | (k0Var.m14637a().f34030a << 32));
        return z6;
    }

    @Override // v3.b1
    /* renamed from: E */
    public final void mo14532E(boolean z6) {
        k0 k0Var = this.f37057f;
        if (z6 != k0Var.m14637a().f36954f) {
            k0Var.m14637a().f36954f = z6;
            this.f37056T = true;
        }
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: H */
    public final void mo14521H() {
        this.f37046E = true;
        h0 h0Var = this.f37043B;
        h0Var.m14621h();
        boolean z6 = this.f37073y;
        k0 k0Var = this.f37057f;
        if (z6) {
            C4640e c4640eM14613z = k0Var.f36928a.m14613z();
            Object[] objArr = c4640eM14613z.f22884a;
            int i10 = c4640eM14613z.f22886c;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var = (g0) objArr[i11];
                if (g0Var.m14606s() && g0Var.f36833L.f36943p.f37063m == e0.InMeasureBlock && g0.m14566P(g0Var)) {
                    g0.m14568W(k0Var.f36928a, false, 7);
                }
            }
        }
        if (this.f37074z || (!this.f37064n && !mo14526j().f36956h && this.f37073y)) {
            this.f37073y = false;
            c0 c0Var = k0Var.f36931d;
            k0Var.f36931d = c0.LayingOut;
            k0Var.m14641e(false);
            g0 g0Var2 = k0Var.f36928a;
            r1 snapshotObserver = ((C7904v) j0.m14636a(g0Var2)).getSnapshotObserver();
            snapshotObserver.m14657a(g0Var2, snapshotObserver.f36984e, this.f37049H);
            k0Var.f36931d = c0Var;
            if (mo14526j().f36956h && k0Var.f36937j) {
                requestLayout();
            }
            this.f37074z = false;
        }
        if (h0Var.f36881d) {
            h0Var.f36882e = true;
        }
        if (h0Var.f36879b && h0Var.m14618e()) {
            h0Var.m14620g();
        }
        this.f37046E = false;
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: I */
    public final boolean mo14522I() {
        return this.f37070v;
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: W */
    public final void mo14523W() {
        g0.m14568W(this.f37057f.f36928a, false, 7);
    }

    @Override // t3.i0
    public final int a0(int i10) {
        k0 k0Var = this.f37057f;
        if (!AbstractC7634f.m14558s(k0Var.f36928a)) {
            A0();
            return k0Var.m14637a().a0(i10);
        }
        s0 s0Var = k0Var.f36944q;
        AbstractC4154l.m8920c(s0Var);
        return s0Var.a0(i10);
    }

    @Override // t3.i0
    /* renamed from: b */
    public final int mo13311b(int i10) {
        k0 k0Var = this.f37057f;
        if (!AbstractC7634f.m14558s(k0Var.f36928a)) {
            A0();
            return k0Var.m14637a().mo13311b(i10);
        }
        s0 s0Var = k0Var.f36944q;
        AbstractC4154l.m8920c(s0Var);
        return s0Var.mo13311b(i10);
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: c */
    public final h0 mo14524c() {
        return this.f37043B;
    }

    @Override // t3.w0
    public final int d0(C7027n c7027n) {
        k0 k0Var = this.f37057f;
        g0 g0VarM14609v = k0Var.f36928a.m14609v();
        c0 c0Var = g0VarM14609v != null ? g0VarM14609v.f36833L.f36931d : null;
        c0 c0Var2 = c0.Measuring;
        h0 h0Var = this.f37043B;
        if (c0Var == c0Var2) {
            h0Var.f36880c = true;
        } else {
            g0 g0VarM14609v2 = k0Var.f36928a.m14609v();
            if ((g0VarM14609v2 != null ? g0VarM14609v2.f36833L.f36931d : null) == c0.LayingOut) {
                h0Var.f36881d = true;
            }
        }
        this.f37064n = true;
        int iD0 = k0Var.m14637a().d0(c7027n);
        this.f37064n = false;
        return iD0;
    }

    @Override // t3.w0
    public final int f0() {
        return this.f37057f.m14637a().f0();
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: h */
    public final void mo14525h(C6725t c6725t) {
        C4640e c4640eM14613z = this.f37057f.f36928a.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            c6725t.invoke(((g0) objArr[i11]).f36833L.f36943p);
        }
    }

    @Override // t3.w0
    public final int h0() {
        return this.f37057f.m14637a().h0();
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: j */
    public final C7649u mo14526j() {
        return (C7649u) this.f37057f.f36928a.f36832K.f22539c;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    @Override // t3.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(long r9, float r11, ex.InterfaceC2139c r12) {
        /*
            r8 = this;
            r0 = 1
            r8.f37071w = r0
            long r1 = r8.f37065p
            boolean r1 = s4.C6754j.m12940a(r9, r1)
            r2 = 0
            v3.k0 r3 = r8.f37057f
            if (r1 == 0) goto L12
            boolean r1 = r8.f37056T
            if (r1 == 0) goto L25
        L12:
            boolean r1 = r3.f36938k
            if (r1 != 0) goto L1e
            boolean r1 = r3.f36937j
            if (r1 != 0) goto L1e
            boolean r1 = r8.f37056T
            if (r1 == 0) goto L22
        L1e:
            r8.f37073y = r0
            r8.f37056T = r2
        L22:
            r8.z0()
        L25:
            v3.s0 r1 = r3.f36944q
            v3.g0 r4 = r3.f36928a
            if (r1 == 0) goto L49
            v3.k0 r5 = r1.f36992f
            v3.g0 r6 = r5.f36928a
            boolean r6 = v3.AbstractC7634f.m14558s(r6)
            if (r6 == 0) goto L37
            r1 = r0
            goto L45
        L37:
            v3.p0 r1 = r1.f37003s
            v3.p0 r6 = v3.p0.IsNotPlaced
            if (r1 != r6) goto L43
            boolean r1 = r5.f36929b
            if (r1 != 0) goto L43
            r5.f36930c = r0
        L43:
            boolean r1 = r5.f36930c
        L45:
            if (r1 != r0) goto L49
            r1 = r0
            goto L4a
        L49:
            r1 = r2
        L4a:
            if (r1 == 0) goto L85
            v3.h1 r1 = r3.m14637a()
            v3.h1 r1 = r1.f36904p
            if (r1 == 0) goto L58
            t3.g0 r1 = r1.f36957j
            if (r1 != 0) goto L62
        L58:
            v3.p1 r1 = v3.j0.m14636a(r4)
            w3.v r1 = (w3.C7904v) r1
            t3.v0 r1 = r1.getPlacementScope()
        L62:
            v3.s0 r5 = r3.f36944q
            kotlin.jvm.internal.AbstractC4154l.m8920c(r5)
            v3.g0 r4 = r4.m14609v()
            if (r4 == 0) goto L71
            v3.k0 r4 = r4.f36833L
            r4.f36935h = r2
        L71:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5.f36995j = r4
            r4 = 32
            long r6 = r9 >> r4
            int r4 = (int) r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            int r6 = (int) r6
            t3.v0.m13317e(r1, r5, r4, r6)
        L85:
            v3.s0 r1 = r3.f36944q
            if (r1 == 0) goto L8e
            boolean r1 = r1.f36998m
            if (r1 != 0) goto L8e
            goto L8f
        L8e:
            r0 = r2
        L8f:
            if (r0 == 0) goto L96
            java.lang.String r0 = "Error: Placement happened before lookahead."
            s3.AbstractC6744a.m12907b(r0)
        L96:
            r8.C0(r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.y0.k0(long, float, ex.c):void");
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: r */
    public final InterfaceC7629a mo14527r() {
        k0 k0Var;
        g0 g0VarM14609v = this.f37057f.f36928a.m14609v();
        if (g0VarM14609v == null || (k0Var = g0VarM14609v.f36833L) == null) {
            return null;
        }
        return k0Var.f36943p;
    }

    @Override // v3.InterfaceC7629a
    public final void requestLayout() {
        this.f37057f.f36928a.m14590V(false);
    }

    public final List t0() {
        k0 k0Var = this.f37057f;
        k0Var.f36928a.e0();
        boolean z6 = this.f37045D;
        C4640e c4640e = this.f37044C;
        if (!z6) {
            return c4640e.m9510g();
        }
        g0 g0Var = k0Var.f36928a;
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (c4640e.f22886c <= i11) {
                c4640e.m9506b(g0Var2.f36833L.f36943p);
            } else {
                y0 y0Var = g0Var2.f36833L.f36943p;
                Object[] objArr2 = c4640e.f22884a;
                Object obj = objArr2[i11];
                objArr2[i11] = y0Var;
            }
        }
        c4640e.m9516n(((C4637b) g0Var.m14603p()).f22878a.f22886c, c4640e.f22886c);
        this.f37045D = false;
        return c4640e.m9510g();
    }

    public final void u0() {
        boolean z6 = this.f37070v;
        this.f37070v = true;
        g0 g0Var = this.f37057f.f36928a;
        C4535g c4535g = g0Var.f36832K;
        if (!z6) {
            ((C7649u) c4535g.f22539c).g1();
            if (g0Var.m14606s()) {
                g0.m14568W(g0Var, true, 6);
            } else if (g0Var.f36833L.f36932e) {
                g0.m14567U(g0Var, true, 6);
            }
        }
        h1 h1Var = ((C7649u) c4535g.f22539c).f36903n;
        for (h1 h1Var2 = (h1) c4535g.f22540d; !AbstractC4154l.m8918a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f36903n) {
            if (h1Var2.f36900I) {
                h1Var2.a1();
            }
        }
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (g0Var2.m14610w() != Integer.MAX_VALUE) {
                g0Var2.f36833L.f36943p.u0();
                g0.m14569X(g0Var2);
            }
        }
    }

    @Override // t3.i0
    /* renamed from: x */
    public final int mo13312x(int i10) {
        k0 k0Var = this.f37057f;
        if (!AbstractC7634f.m14558s(k0Var.f36928a)) {
            A0();
            return k0Var.m14637a().mo13312x(i10);
        }
        s0 s0Var = k0Var.f36944q;
        AbstractC4154l.m8920c(s0Var);
        return s0Var.mo13312x(i10);
    }

    public final void x0() {
        if (this.f37070v) {
            this.f37070v = false;
            k0 k0Var = this.f37057f;
            C4535g c4535g = k0Var.f36928a.f36832K;
            h1 h1Var = ((C7649u) c4535g.f22539c).f36903n;
            for (h1 h1Var2 = (h1) c4535g.f22540d; !AbstractC4154l.m8918a(h1Var2, h1Var) && h1Var2 != null; h1Var2 = h1Var2.f36903n) {
                AbstractC7878q abstractC7878qV0 = h1Var2.V0(i1.m14630g(1048576));
                if (abstractC7878qV0 != null && (abstractC7878qV0.f37670a.f37673d & 1048576) != 0) {
                    boolean zM14630g = i1.m14630g(1048576);
                    AbstractC7878q abstractC7878qT0 = h1Var2.T0();
                    if (zM14630g || (abstractC7878qT0 = abstractC7878qT0.f37674e) != null) {
                        for (AbstractC7878q abstractC7878qV02 = h1Var2.V0(zM14630g); abstractC7878qV02 != null && (abstractC7878qV02.f37673d & 1048576) != 0; abstractC7878qV02 = abstractC7878qV02.f37675f) {
                            if ((abstractC7878qV02.f37672c & 1048576) != 0) {
                                AbstractC7878q abstractC7878qM14545f = abstractC7878qV02;
                                C4640e c4640e = null;
                                while (abstractC7878qM14545f != null) {
                                    if ((abstractC7878qM14545f.f37672c & 1048576) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                        int i10 = 0;
                                        for (AbstractC7878q abstractC7878q = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
                                            if ((abstractC7878q.f37672c & 1048576) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    abstractC7878qM14545f = abstractC7878q;
                                                } else {
                                                    if (c4640e == null) {
                                                        c4640e = new C4640e(new AbstractC7878q[16]);
                                                    }
                                                    if (abstractC7878qM14545f != null) {
                                                        c4640e.m9506b(abstractC7878qM14545f);
                                                        abstractC7878qM14545f = null;
                                                    }
                                                    c4640e.m9506b(abstractC7878q);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e);
                                }
                            }
                            if (abstractC7878qV02 == abstractC7878qT0) {
                                break;
                            }
                        }
                    }
                }
                if (h1Var2.f36901K != null) {
                    h1Var2.p1(null, false);
                    h1Var2.f36902m.m14590V(false);
                }
            }
            C4640e c4640eM14613z = k0Var.f36928a.m14613z();
            Object[] objArr = c4640eM14613z.f22884a;
            int i11 = c4640eM14613z.f22886c;
            for (int i12 = 0; i12 < i11; i12++) {
                ((g0) objArr[i12]).f36833L.f36943p.x0();
            }
        }
    }

    @Override // t3.i0
    /* renamed from: y */
    public final int mo13313y(int i10) {
        k0 k0Var = this.f37057f;
        if (!AbstractC7634f.m14558s(k0Var.f36928a)) {
            A0();
            return k0Var.m14637a().mo13313y(i10);
        }
        s0 s0Var = k0Var.f36944q;
        AbstractC4154l.m8920c(s0Var);
        return s0Var.mo13313y(i10);
    }

    @Override // t3.i0
    /* renamed from: z */
    public final t3.w0 mo13314z(long j6) {
        e0 e0Var;
        k0 k0Var = this.f37057f;
        g0 g0Var = k0Var.f36928a;
        e0 e0Var2 = g0Var.f36829G;
        e0 e0Var3 = e0.NotUsed;
        if (e0Var2 == e0Var3) {
            g0Var.m14595e();
        }
        if (AbstractC7634f.m14558s(k0Var.f36928a)) {
            s0 s0Var = k0Var.f36944q;
            AbstractC4154l.m8920c(s0Var);
            s0Var.f36996k = e0Var3;
            s0Var.mo13314z(j6);
        }
        g0 g0Var2 = k0Var.f36928a;
        g0 g0VarM14609v = g0Var2.m14609v();
        if (g0VarM14609v != null) {
            k0 k0Var2 = g0VarM14609v.f36833L;
            if (this.f37063m != e0Var3 && !g0Var2.f36831I) {
                AbstractC6744a.m12907b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i10 = w0.f37037a[k0Var2.f36931d.ordinal()];
            if (i10 == 1) {
                e0Var = e0.InMeasureBlock;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + k0Var2.f36931d);
                }
                e0Var = e0.InLayoutBlock;
            }
            this.f37063m = e0Var;
        } else {
            this.f37063m = e0Var3;
        }
        D0(j6);
        return this;
    }

    public final void z0() {
        k0 k0Var = this.f37057f;
        if (k0Var.f36939l > 0) {
            C4640e c4640eM14613z = k0Var.f36928a.m14613z();
            Object[] objArr = c4640eM14613z.f22884a;
            int i10 = c4640eM14613z.f22886c;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var = (g0) objArr[i11];
                k0 k0Var2 = g0Var.f36833L;
                boolean z6 = k0Var2.f36937j;
                y0 y0Var = k0Var2.f36943p;
                if ((z6 || k0Var2.f36938k) && !y0Var.f37073y) {
                    g0Var.m14590V(false);
                }
                y0Var.z0();
            }
        }
    }
}
