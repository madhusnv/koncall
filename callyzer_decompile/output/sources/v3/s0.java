package v3;

import a3.C0043b;
import ex.InterfaceC2139c;
import g2.p3;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import s1.C6725t;
import s3.AbstractC6744a;
import s4.C6745a;
import s4.C6754j;
import t3.C7027n;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends t3.w0 implements t3.i0, InterfaceC7629a, b1 {

    /* renamed from: B */
    public boolean f36991B;

    /* renamed from: f */
    public final k0 f36992f;

    /* renamed from: g */
    public boolean f36993g;

    /* renamed from: l */
    public boolean f36997l;

    /* renamed from: m */
    public boolean f36998m;

    /* renamed from: n */
    public boolean f36999n;

    /* renamed from: p */
    public C6745a f37000p;

    /* renamed from: r */
    public InterfaceC2139c f37002r;

    /* renamed from: x */
    public boolean f37007x;

    /* renamed from: z */
    public Object f37009z;

    /* renamed from: h */
    public int f36994h = Integer.MAX_VALUE;

    /* renamed from: j */
    public int f36995j = Integer.MAX_VALUE;

    /* renamed from: k */
    public e0 f36996k = e0.NotUsed;

    /* renamed from: q */
    public long f37001q = 0;

    /* renamed from: s */
    public p0 f37003s = p0.IsNotPlaced;

    /* renamed from: t */
    public final h0 f37004t = new h0(this, 1);

    /* renamed from: v */
    public final C4640e f37005v = new C4640e(new s0[16]);

    /* renamed from: w */
    public boolean f37006w = true;

    /* renamed from: y */
    public boolean f37008y = true;

    public s0(k0 k0Var) {
        this.f36992f = k0Var;
        this.f37009z = k0Var.f36943p.f37069t;
    }

    public final void A0() {
        c0 c0Var;
        this.f36991B = true;
        k0 k0Var = this.f36992f;
        g0 g0VarM14609v = k0Var.f36928a.m14609v();
        p0 p0Var = this.f37003s;
        if ((p0Var != p0.IsPlacedInLookahead && !k0Var.f36930c) || (p0Var != p0.IsPlacedInApproach && k0Var.f36930c)) {
            u0();
            if (this.f36993g && g0VarM14609v != null) {
                g0VarM14609v.m14589T(false);
            }
        }
        if (g0VarM14609v != null) {
            k0 k0Var2 = g0VarM14609v.f36833L;
            if (!this.f36993g && ((c0Var = k0Var2.f36931d) == c0.LayingOut || c0Var == c0.LookaheadLayingOut)) {
                if (this.f36995j != Integer.MAX_VALUE) {
                    AbstractC6744a.m12907b("Place was called on a node which was placed already");
                }
                int i10 = k0Var2.f36935h;
                this.f36995j = i10;
                k0Var2.f36935h = i10 + 1;
            }
        } else {
            this.f36995j = 0;
        }
        mo14521H();
    }

    public final void B0(long j6, InterfaceC2139c interfaceC2139c) {
        k0 k0Var = this.f36992f;
        g0 g0Var = k0Var.f36928a;
        g0 g0Var2 = k0Var.f36928a;
        g0 g0VarM14609v = g0Var.m14609v();
        c0 c0Var = g0VarM14609v != null ? g0VarM14609v.f36833L.f36931d : null;
        c0 c0Var2 = c0.LookaheadLayingOut;
        if (c0Var == c0Var2) {
            k0Var.f36930c = false;
        }
        if (g0Var2.f44836h0) {
            AbstractC6744a.m12906a("place is called on a deactivated node");
        }
        k0Var.f36931d = c0Var2;
        this.f36998m = true;
        this.f36991B = false;
        if (!C6754j.m12940a(j6, this.f37001q)) {
            if (k0Var.f36941n || k0Var.f36940m) {
                k0Var.f36933f = true;
            }
            x0();
        }
        p1 p1VarM14636a = j0.m14636a(g0Var2);
        if (k0Var.f36933f || !mo14522I()) {
            k0Var.m14642f(false);
            this.f37004t.f36884g = false;
            r1 snapshotObserver = ((C7904v) p1VarM14636a).getSnapshotObserver();
            r0 r0Var = new r0(this, p1VarM14636a, j6);
            snapshotObserver.getClass();
            if (g0Var2.f36849h != null) {
                snapshotObserver.m14657a(g0Var2, snapshotObserver.f36986g, r0Var);
            } else {
                snapshotObserver.m14657a(g0Var2, snapshotObserver.f36985f, r0Var);
            }
        } else {
            o0 o0VarR0 = k0Var.m14637a().R0();
            AbstractC4154l.m8920c(o0VarR0);
            o0VarR0.J0(C6754j.m12942c(j6, o0VarR0.f34034e));
            A0();
        }
        this.f37001q = j6;
        this.f37002r = interfaceC2139c;
        k0Var.f36931d = c0.Idle;
    }

    @Override // t3.w0, t3.i0
    /* renamed from: C */
    public final Object mo13310C() {
        return this.f37009z;
    }

    public final boolean C0(long j6) {
        long j10;
        long j11;
        k0 k0Var = this.f36992f;
        g0 g0Var = k0Var.f36928a;
        g0 g0Var2 = k0Var.f36928a;
        if (g0Var.f44836h0) {
            AbstractC6744a.m12906a("measure is called on a deactivated node");
        }
        g0 g0VarM14609v = g0Var2.m14609v();
        g0Var2.f36831I = g0Var2.f36831I || (g0VarM14609v != null && g0VarM14609v.f36831I);
        if (!g0Var2.f36833L.f36932e) {
            C6745a c6745a = this.f37000p;
            if (c6745a == null ? false : C6745a.m12912c(c6745a.f32195a, j6)) {
                p1 p1Var = g0Var2.f36855p;
                if (p1Var != null) {
                    ((C7904v) p1Var).m15031k(g0Var2, true);
                }
                g0Var2.m14591Y();
                return false;
            }
        }
        this.f37000p = new C6745a(j6);
        q0(j6);
        this.f37004t.f36883f = false;
        C4640e c4640eM14613z = g0Var2.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            s0 s0Var = ((g0) objArr[i11]).f36833L.f36944q;
            AbstractC4154l.m8920c(s0Var);
            s0Var.f37004t.f36880c = false;
        }
        if (this.f36999n) {
            j10 = this.f34032c;
        } else {
            long j12 = Integer.MIN_VALUE;
            j10 = (j12 & 4294967295L) | (j12 << 32);
        }
        this.f36999n = true;
        o0 o0VarR0 = k0Var.m14637a().R0();
        if (!(o0VarR0 != null)) {
            AbstractC6744a.m12907b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        s0 s0Var2 = k0Var.f36944q;
        if (s0Var2 != null) {
            c0 c0Var = c0.LookaheadMeasuring;
            k0 k0Var2 = s0Var2.f36992f;
            k0Var2.f36931d = c0Var;
            y0 y0Var = k0Var2.f36943p;
            g0 g0Var3 = k0Var2.f36928a;
            k0Var2.f36932e = false;
            r1 snapshotObserver = ((C7904v) j0.m14636a(g0Var3)).getSnapshotObserver();
            j11 = 4294967295L;
            p3 p3Var = new p3(2, j6, s0Var2);
            snapshotObserver.getClass();
            if (g0Var3.f36849h != null) {
                snapshotObserver.m14657a(g0Var3, snapshotObserver.f36981b, p3Var);
            } else {
                snapshotObserver.m14657a(g0Var3, snapshotObserver.f36982c, p3Var);
            }
            k0Var2.f36933f = true;
            k0Var2.f36934g = true;
            if (AbstractC7634f.m14558s(g0Var3)) {
                y0Var.f37073y = true;
                y0Var.f37074z = true;
            } else {
                y0Var.f37072x = true;
            }
            k0Var2.f36931d = c0.Idle;
        } else {
            j11 = 4294967295L;
        }
        m0((o0VarR0.f34031b & j11) | (o0VarR0.f34030a << 32));
        return (((int) (j10 >> 32)) == o0VarR0.f34030a && ((int) (j10 & j11)) == o0VarR0.f34031b) ? false : true;
    }

    @Override // v3.b1
    /* renamed from: E */
    public final void mo14532E(boolean z6) {
        o0 o0VarR0;
        k0 k0Var = this.f36992f;
        o0 o0VarR02 = k0Var.m14637a().R0();
        if (Boolean.valueOf(z6).equals(o0VarR02 != null ? Boolean.valueOf(o0VarR02.f36954f) : null) || (o0VarR0 = k0Var.m14637a().R0()) == null) {
            return;
        }
        o0VarR0.f36954f = z6;
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: H */
    public final void mo14521H() {
        this.f37007x = true;
        h0 h0Var = this.f37004t;
        h0Var.m14621h();
        k0 k0Var = this.f36992f;
        boolean z6 = k0Var.f36933f;
        g0 g0Var = k0Var.f36928a;
        if (z6) {
            C4640e c4640eM14613z = g0Var.m14613z();
            Object[] objArr = c4640eM14613z.f22884a;
            int i10 = c4640eM14613z.f22886c;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var2 = (g0) objArr[i11];
                k0 k0Var2 = g0Var2.f36833L;
                if (k0Var2.f36932e && g0Var2.m14607t() == e0.InMeasureBlock) {
                    s0 s0Var = k0Var2.f36944q;
                    AbstractC4154l.m8920c(s0Var);
                    s0 s0Var2 = k0Var2.f36944q;
                    C6745a c6745a = s0Var2 != null ? s0Var2.f37000p : null;
                    AbstractC4154l.m8920c(c6745a);
                    if (s0Var.C0(c6745a.f32195a)) {
                        g0.m14567U(g0Var, false, 7);
                    }
                }
            }
        }
        C7648t c7648t = mo14526j().f37017X;
        AbstractC4154l.m8920c(c7648t);
        if (k0Var.f36934g || (!this.f36997l && !c7648t.f36956h && k0Var.f36933f)) {
            k0Var.f36933f = false;
            c0 c0Var = k0Var.f36931d;
            k0Var.f36931d = c0.LookaheadLayingOut;
            p1 p1VarM14636a = j0.m14636a(g0Var);
            k0Var.m14643g(false);
            r1 snapshotObserver = ((C7904v) p1VarM14636a).getSnapshotObserver();
            C0043b c0043b = new C0043b(22, this, c7648t);
            snapshotObserver.getClass();
            if (g0Var.f36849h != null) {
                snapshotObserver.m14657a(g0Var, snapshotObserver.f36987h, c0043b);
            } else {
                snapshotObserver.m14657a(g0Var, snapshotObserver.f36984e, c0043b);
            }
            k0Var.f36931d = c0Var;
            if (k0Var.f36940m && c7648t.f36956h) {
                requestLayout();
            }
            k0Var.f36934g = false;
        }
        if (h0Var.f36881d) {
            h0Var.f36882e = true;
        }
        if (h0Var.f36879b && h0Var.m14618e()) {
            h0Var.m14620g();
        }
        this.f37007x = false;
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: I */
    public final boolean mo14522I() {
        return this.f37003s != p0.IsNotPlaced;
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: W */
    public final void mo14523W() {
        g0.m14567U(this.f36992f.f36928a, false, 7);
    }

    @Override // t3.i0
    public final int a0(int i10) {
        z0();
        o0 o0VarR0 = this.f36992f.m14637a().R0();
        AbstractC4154l.m8920c(o0VarR0);
        return o0VarR0.a0(i10);
    }

    @Override // t3.i0
    /* renamed from: b */
    public final int mo13311b(int i10) {
        z0();
        o0 o0VarR0 = this.f36992f.m14637a().R0();
        AbstractC4154l.m8920c(o0VarR0);
        return o0VarR0.mo13311b(i10);
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: c */
    public final h0 mo14524c() {
        return this.f37004t;
    }

    @Override // t3.w0
    public final int d0(C7027n c7027n) {
        k0 k0Var = this.f36992f;
        g0 g0VarM14609v = k0Var.f36928a.m14609v();
        c0 c0Var = g0VarM14609v != null ? g0VarM14609v.f36833L.f36931d : null;
        c0 c0Var2 = c0.LookaheadMeasuring;
        h0 h0Var = this.f37004t;
        if (c0Var == c0Var2) {
            h0Var.f36880c = true;
        } else {
            g0 g0VarM14609v2 = k0Var.f36928a.m14609v();
            if ((g0VarM14609v2 != null ? g0VarM14609v2.f36833L.f36931d : null) == c0.LookaheadLayingOut) {
                h0Var.f36881d = true;
            }
        }
        this.f36997l = true;
        o0 o0VarR0 = k0Var.m14637a().R0();
        AbstractC4154l.m8920c(o0VarR0);
        int iD0 = o0VarR0.d0(c7027n);
        this.f36997l = false;
        return iD0;
    }

    @Override // t3.w0
    public final int f0() {
        o0 o0VarR0 = this.f36992f.m14637a().R0();
        AbstractC4154l.m8920c(o0VarR0);
        return o0VarR0.f0();
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: h */
    public final void mo14525h(C6725t c6725t) {
        C4640e c4640eM14613z = this.f36992f.f36928a.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            s0 s0Var = ((g0) objArr[i11]).f36833L.f36944q;
            AbstractC4154l.m8920c(s0Var);
            c6725t.invoke(s0Var);
        }
    }

    @Override // t3.w0
    public final int h0() {
        o0 o0VarR0 = this.f36992f.m14637a().R0();
        AbstractC4154l.m8920c(o0VarR0);
        return o0VarR0.h0();
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: j */
    public final C7649u mo14526j() {
        return (C7649u) this.f36992f.f36928a.f36832K.f22539c;
    }

    @Override // t3.w0
    public final void k0(long j6, float f6, InterfaceC2139c interfaceC2139c) {
        B0(j6, interfaceC2139c);
    }

    @Override // v3.InterfaceC7629a
    /* renamed from: r */
    public final InterfaceC7629a mo14527r() {
        k0 k0Var;
        g0 g0VarM14609v = this.f36992f.f36928a.m14609v();
        if (g0VarM14609v == null || (k0Var = g0VarM14609v.f36833L) == null) {
            return null;
        }
        return k0Var.f36944q;
    }

    @Override // v3.InterfaceC7629a
    public final void requestLayout() {
        this.f36992f.f36928a.m14589T(false);
    }

    public final void t0(boolean z6) {
        k0 k0Var = this.f36992f;
        if (z6 && k0Var.f36930c) {
            return;
        }
        if (z6 || k0Var.f36930c) {
            this.f37003s = p0.IsNotPlaced;
            C4640e c4640eM14613z = k0Var.f36928a.m14613z();
            Object[] objArr = c4640eM14613z.f22884a;
            int i10 = c4640eM14613z.f22886c;
            for (int i11 = 0; i11 < i10; i11++) {
                s0 s0Var = ((g0) objArr[i11]).f36833L.f36944q;
                AbstractC4154l.m8920c(s0Var);
                s0Var.t0(true);
            }
        }
    }

    public final void u0() {
        p0 p0Var = this.f37003s;
        k0 k0Var = this.f36992f;
        boolean z6 = k0Var.f36930c;
        g0 g0Var = k0Var.f36928a;
        if (z6) {
            this.f37003s = p0.IsPlacedInApproach;
        } else {
            this.f37003s = p0.IsPlacedInLookahead;
        }
        if (p0Var != p0.IsPlacedInLookahead && k0Var.f36932e) {
            g0.m14567U(g0Var, true, 6);
        }
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            s0 s0Var = g0Var2.f36833L.f36944q;
            if (s0Var == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (s0Var.f36995j != Integer.MAX_VALUE) {
                s0Var.u0();
                g0.m14569X(g0Var2);
            }
        }
    }

    @Override // t3.i0
    /* renamed from: x */
    public final int mo13312x(int i10) {
        z0();
        o0 o0VarR0 = this.f36992f.m14637a().R0();
        AbstractC4154l.m8920c(o0VarR0);
        return o0VarR0.mo13312x(i10);
    }

    public final void x0() {
        k0 k0Var = this.f36992f;
        if (k0Var.f36942o > 0) {
            C4640e c4640eM14613z = k0Var.f36928a.m14613z();
            Object[] objArr = c4640eM14613z.f22884a;
            int i10 = c4640eM14613z.f22886c;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var = (g0) objArr[i11];
                k0 k0Var2 = g0Var.f36833L;
                if ((k0Var2.f36940m || k0Var2.f36941n) && !k0Var2.f36933f) {
                    g0Var.m14589T(false);
                }
                s0 s0Var = k0Var2.f36944q;
                if (s0Var != null) {
                    s0Var.x0();
                }
            }
        }
    }

    @Override // t3.i0
    /* renamed from: y */
    public final int mo13313y(int i10) {
        z0();
        o0 o0VarR0 = this.f36992f.m14637a().R0();
        AbstractC4154l.m8920c(o0VarR0);
        return o0VarR0.mo13313y(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // t3.i0
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t3.w0 mo13314z(long r6) {
        /*
            r5 = this;
            v3.k0 r0 = r5.f36992f
            v3.g0 r1 = r0.f36928a
            v3.g0 r1 = r1.m14609v()
            r2 = 0
            if (r1 == 0) goto L10
            v3.k0 r1 = r1.f36833L
            v3.c0 r1 = r1.f36931d
            goto L11
        L10:
            r1 = r2
        L11:
            v3.c0 r3 = v3.c0.LookaheadMeasuring
            if (r1 == r3) goto L25
            v3.g0 r1 = r0.f36928a
            v3.g0 r1 = r1.m14609v()
            if (r1 == 0) goto L21
            v3.k0 r1 = r1.f36833L
            v3.c0 r2 = r1.f36931d
        L21:
            v3.c0 r1 = v3.c0.LookaheadLayingOut
            if (r2 != r1) goto L28
        L25:
            r1 = 0
            r0.f36929b = r1
        L28:
            v3.g0 r1 = r0.f36928a
            v3.g0 r2 = r1.m14609v()
            if (r2 == 0) goto L77
            v3.k0 r2 = r2.f36833L
            v3.e0 r3 = r5.f36996k
            v3.e0 r4 = v3.e0.NotUsed
            if (r3 == r4) goto L42
            boolean r1 = r1.f36831I
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r1 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            s3.AbstractC6744a.m12907b(r1)
        L42:
            v3.c0 r1 = r2.f36931d
            int[] r3 = v3.q0.f36972a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L72
            r3 = 2
            if (r1 == r3) goto L72
            r3 = 3
            if (r1 == r3) goto L6f
            r3 = 4
            if (r1 != r3) goto L59
            goto L6f
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            r7.<init>(r0)
            v3.c0 r0 = r2.f36931d
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L6f:
            v3.e0 r1 = v3.e0.InLayoutBlock
            goto L74
        L72:
            v3.e0 r1 = v3.e0.InMeasureBlock
        L74:
            r5.f36996k = r1
            goto L7b
        L77:
            v3.e0 r1 = v3.e0.NotUsed
            r5.f36996k = r1
        L7b:
            v3.g0 r0 = r0.f36928a
            v3.e0 r1 = r0.f36829G
            v3.e0 r2 = v3.e0.NotUsed
            if (r1 != r2) goto L86
            r0.m14595e()
        L86:
            r5.C0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.s0.mo13314z(long):t3.w0");
    }

    public final void z0() {
        k0 k0Var = this.f36992f;
        g0.m14567U(k0Var.f36928a, false, 7);
        g0 g0Var = k0Var.f36928a;
        g0 g0VarM14609v = g0Var.m14609v();
        if (g0VarM14609v == null || g0Var.f36829G != e0.NotUsed) {
            return;
        }
        int i10 = q0.f36972a[g0VarM14609v.f36833L.f36931d.ordinal()];
        g0Var.f36829G = i10 != 2 ? i10 != 3 ? g0VarM14609v.f36829G : e0.InLayoutBlock : e0.InMeasureBlock;
    }
}
