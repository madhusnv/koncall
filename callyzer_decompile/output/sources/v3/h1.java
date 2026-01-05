package v3;

import c3.C0846a;
import c3.C0847b;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import cp.C1476g;
import d3.AbstractC1571y;
import d3.InterfaceC1563q;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.j3;
import g3.C2474b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4535g;
import m2.C4640e;
import og.pe;
import og.ue;
import og.xe;
import og.ze;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p3.InterfaceC5807e;
import s3.AbstractC6744a;
import s4.C6754j;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import t3.C7027n;
import t3.InterfaceC7033t;
import u2.AbstractC7311h;
import u2.AbstractC7321r;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h1 extends n0 implements t3.i0, InterfaceC7033t, q1 {

    /* renamed from: L */
    public static final d3.i0 f36888L;

    /* renamed from: M */
    public static final C7650v f36889M;

    /* renamed from: N */
    public static final float[] f36890N;

    /* renamed from: O */
    public static final C7632d f36891O;

    /* renamed from: T */
    public static final C7632d f36892T;

    /* renamed from: B */
    public float f36893B;

    /* renamed from: C */
    public C0846a f36894C;

    /* renamed from: D */
    public C7650v f36895D;

    /* renamed from: E */
    public C2474b f36896E;

    /* renamed from: F */
    public InterfaceC1563q f36897F;

    /* renamed from: G */
    public C1476g f36898G;

    /* renamed from: I */
    public boolean f36900I;

    /* renamed from: K */
    public o1 f36901K;

    /* renamed from: m */
    public final g0 f36902m;

    /* renamed from: n */
    public h1 f36903n;

    /* renamed from: p */
    public h1 f36904p;

    /* renamed from: q */
    public boolean f36905q;

    /* renamed from: r */
    public boolean f36906r;

    /* renamed from: s */
    public InterfaceC2139c f36907s;

    /* renamed from: t */
    public InterfaceC6747c f36908t;

    /* renamed from: v */
    public EnumC6757m f36909v;

    /* renamed from: x */
    public t3.k0 f36911x;

    /* renamed from: y */
    public e1.d0 f36912y;

    /* renamed from: w */
    public float f36910w = 0.8f;

    /* renamed from: z */
    public long f36913z = 0;

    /* renamed from: H */
    public final e1 f36899H = new e1(this, 1);

    static {
        d3.i0 i0Var = new d3.i0();
        i0Var.f7757b = 1.0f;
        i0Var.f7758c = 1.0f;
        i0Var.f7759d = 1.0f;
        long j6 = AbstractC1571y.f7823a;
        i0Var.f7763h = j6;
        i0Var.f7764j = j6;
        i0Var.f7768n = 8.0f;
        i0Var.f7769p = d3.p0.f7805b;
        i0Var.f7770q = d3.h0.f7748a;
        i0Var.f7772s = 0;
        i0Var.f7773t = 9205357640488583168L;
        i0Var.f7774v = ue.m10985a();
        i0Var.f7775w = EnumC6757m.Ltr;
        f36888L = i0Var;
        f36889M = new C7650v();
        f36890N = d3.b0.m5094a();
        f36891O = new C7632d(1);
        f36892T = new C7632d(2);
    }

    public h1(g0 g0Var) {
        this.f36902m = g0Var;
        this.f36908t = g0Var.f36825C;
        this.f36909v = g0Var.f36826D;
    }

    public static h1 m1(InterfaceC7033t interfaceC7033t) {
        h1 h1Var;
        t3.h0 h0Var = interfaceC7033t instanceof t3.h0 ? (t3.h0) interfaceC7033t : null;
        if (h0Var != null && (h1Var = h0Var.f34004a.f36966m) != null) {
            return h1Var;
        }
        AbstractC4154l.m8921d(interfaceC7033t, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (h1) interfaceC7033t;
    }

    @Override // v3.n0
    public final boolean A0() {
        return this.f36911x != null;
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: B */
    public final long mo13295B(long j6) {
        if (!T0().f37683p) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC7033t interfaceC7033tM13279h = t3.c1.m13279h(this);
        C7904v c7904v = (C7904v) j0.m14636a(this.f36902m);
        c7904v.m15022D();
        return c1(interfaceC7033tM13279h, C0847b.m2275f(d3.b0.m5095b(j6, c7904v.f44837a1), interfaceC7033tM13279h.mo13299V(0L)));
    }

    @Override // v3.n0
    public final g0 B0() {
        return this.f36902m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // t3.w0, t3.i0
    /* renamed from: C */
    public final Object mo13310C() {
        g0 g0Var = this.f36902m;
        if (!g0Var.f36832K.m9386d(64)) {
            return null;
        }
        T0();
        Object objA0 = null;
        for (AbstractC7878q abstractC7878q = (x1) g0Var.f36832K.f22541e; abstractC7878q != null; abstractC7878q = abstractC7878q.f37674e) {
            if ((abstractC7878q.f37672c & 64) != 0) {
                AbstractC7642n abstractC7642nM14545f = abstractC7878q;
                ?? c4640e = 0;
                while (abstractC7642nM14545f != 0) {
                    if (abstractC7642nM14545f instanceof s1) {
                        objA0 = ((s1) abstractC7642nM14545f).a0(g0Var.f36825C, objA0);
                    } else if ((abstractC7642nM14545f.f37672c & 64) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                        AbstractC7878q abstractC7878q2 = abstractC7642nM14545f.f36953r;
                        int i10 = 0;
                        abstractC7642nM14545f = abstractC7642nM14545f;
                        c4640e = c4640e;
                        while (abstractC7878q2 != null) {
                            if ((abstractC7878q2.f37672c & 64) != 0) {
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
        }
        return objA0;
    }

    @Override // v3.n0
    public final t3.k0 C0() {
        t3.k0 k0Var = this.f36911x;
        if (k0Var != null) {
            return k0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: D */
    public final InterfaceC7033t mo13296D() {
        if (!T0().f37683p) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e1();
        return ((h1) this.f36902m.f36832K.f22540d).f36904p;
    }

    @Override // v3.n0
    public final n0 D0() {
        return this.f36904p;
    }

    @Override // v3.n0
    public final long E0() {
        return this.f36913z;
    }

    @Override // v3.n0
    public final void G0() {
        k0(this.f36913z, this.f36893B, this.f36907s);
    }

    public final void H0(h1 h1Var, C0846a c0846a, boolean z6) {
        if (h1Var == this) {
            return;
        }
        h1 h1Var2 = this.f36904p;
        if (h1Var2 != null) {
            h1Var2.H0(h1Var, c0846a, z6);
        }
        long j6 = this.f36913z;
        float f6 = (int) (j6 >> 32);
        c0846a.f5348b -= f6;
        c0846a.f5350d -= f6;
        float f10 = (int) (j6 & 4294967295L);
        c0846a.f5349c -= f10;
        c0846a.f5351e -= f10;
        o1 o1Var = this.f36901K;
        if (o1Var != null) {
            o1Var.mo14650f(c0846a, true);
            if (this.f36906r && z6) {
                long j10 = this.f34032c;
                c0846a.m2267e(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, (int) (j10 >> 32), (int) (j10 & 4294967295L));
            }
        }
    }

    public final long I0(h1 h1Var, long j6) {
        if (h1Var == this) {
            return j6;
        }
        h1 h1Var2 = this.f36904p;
        return (h1Var2 == null || AbstractC4154l.m8918a(h1Var, h1Var2)) ? P0(j6) : P0(h1Var2.I0(h1Var, j6));
    }

    public final long J0(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - h0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - f0();
        float fMax = Math.max(DefinitionKt.NO_Float_VALUE, fIntBitsToFloat / 2.0f);
        float fMax2 = Math.max(DefinitionKt.NO_Float_VALUE, fIntBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(fMax2) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float K0(long j6, long j10) {
        if (h0() >= Float.intBitsToFloat((int) (j10 >> 32)) && f0() >= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jJ0 = J0(j10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jJ0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jJ0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32));
        float fMax = Math.max(DefinitionKt.NO_Float_VALUE, fIntBitsToFloat3 < DefinitionKt.NO_Float_VALUE ? -fIntBitsToFloat3 : fIntBitsToFloat3 - h0());
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(DefinitionKt.NO_Float_VALUE, Float.intBitsToFloat((int) (j6 & 4294967295L)) < DefinitionKt.NO_Float_VALUE ? -r9 : r9 - f0())) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
        if (fIntBitsToFloat > DefinitionKt.NO_Float_VALUE || fIntBitsToFloat2 > DefinitionKt.NO_Float_VALUE) {
            int i10 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i10) <= fIntBitsToFloat) {
                int i11 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i11) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i11);
                    return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void L0(InterfaceC1563q interfaceC1563q, C2474b c2474b) {
        o1 o1Var = this.f36901K;
        if (o1Var != null) {
            o1Var.mo14655k(interfaceC1563q, c2474b);
            return;
        }
        long j6 = this.f36913z;
        float f6 = (int) (j6 >> 32);
        float f10 = (int) (j6 & 4294967295L);
        interfaceC1563q.mo5112n(f6, f10);
        M0(interfaceC1563q, c2474b);
        interfaceC1563q.mo5112n(-f6, -f10);
    }

    public final void M0(InterfaceC1563q interfaceC1563q, C2474b c2474b) {
        InterfaceC1563q interfaceC1563q2;
        C2474b c2474b2;
        AbstractC7878q abstractC7878qU0 = U0(4);
        if (abstractC7878qU0 == null) {
            i1(interfaceC1563q, c2474b);
            return;
        }
        g0 g0Var = this.f36902m;
        g0Var.getClass();
        i0 sharedDrawScope = ((C7904v) j0.m14636a(g0Var)).getSharedDrawScope();
        long jM11098d = ze.m11098d(this.f34032c);
        sharedDrawScope.getClass();
        C4640e c4640e = null;
        while (abstractC7878qU0 != null) {
            if (abstractC7878qU0 instanceof InterfaceC7644p) {
                interfaceC1563q2 = interfaceC1563q;
                c2474b2 = c2474b;
                sharedDrawScope.m14623c(interfaceC1563q2, jM11098d, this, (InterfaceC7644p) abstractC7878qU0, c2474b2);
            } else {
                interfaceC1563q2 = interfaceC1563q;
                c2474b2 = c2474b;
                if ((abstractC7878qU0.f37672c & 4) != 0 && (abstractC7878qU0 instanceof AbstractC7642n)) {
                    int i10 = 0;
                    for (AbstractC7878q abstractC7878q = ((AbstractC7642n) abstractC7878qU0).f36953r; abstractC7878q != null; abstractC7878q = abstractC7878q.f37675f) {
                        if ((abstractC7878q.f37672c & 4) != 0) {
                            i10++;
                            if (i10 == 1) {
                                abstractC7878qU0 = abstractC7878q;
                            } else {
                                if (c4640e == null) {
                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                }
                                if (abstractC7878qU0 != null) {
                                    c4640e.m9506b(abstractC7878qU0);
                                    abstractC7878qU0 = null;
                                }
                                c4640e.m9506b(abstractC7878q);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                interfaceC1563q = interfaceC1563q2;
                c2474b = c2474b2;
            }
            abstractC7878qU0 = AbstractC7634f.m14545f(c4640e);
            interfaceC1563q = interfaceC1563q2;
            c2474b = c2474b2;
        }
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: N */
    public final long mo13297N(long j6) {
        if (!T0().f37683p) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return c1(t3.c1.m13279h(this), ((C7904v) j0.m14636a(this.f36902m)).m15026H(j6));
    }

    public abstract void N0();

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f36902m.f36825C.mo154O();
    }

    public final h1 O0(h1 h1Var) {
        g0 g0VarM14609v = h1Var.f36902m;
        g0 g0Var = this.f36902m;
        if (g0VarM14609v == g0Var) {
            AbstractC7878q abstractC7878qT0 = h1Var.T0();
            AbstractC7878q abstractC7878qT02 = T0();
            if (!abstractC7878qT02.f37670a.f37683p) {
                AbstractC6744a.m12907b("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC7878q abstractC7878q = abstractC7878qT02.f37670a.f37674e; abstractC7878q != null; abstractC7878q = abstractC7878q.f37674e) {
                if ((abstractC7878q.f37672c & 2) != 0 && abstractC7878q == abstractC7878qT0) {
                    return h1Var;
                }
            }
            return this;
        }
        while (g0VarM14609v.f36857r > g0Var.f36857r) {
            g0VarM14609v = g0VarM14609v.m14609v();
            AbstractC4154l.m8920c(g0VarM14609v);
        }
        g0 g0VarM14609v2 = g0Var;
        while (g0VarM14609v2.f36857r > g0VarM14609v.f36857r) {
            g0VarM14609v2 = g0VarM14609v2.m14609v();
            AbstractC4154l.m8920c(g0VarM14609v2);
        }
        while (g0VarM14609v != g0VarM14609v2) {
            g0VarM14609v = g0VarM14609v.m14609v();
            g0VarM14609v2 = g0VarM14609v2.m14609v();
            if (g0VarM14609v == null || g0VarM14609v2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (g0VarM14609v2 != g0Var) {
            if (g0VarM14609v != h1Var.f36902m) {
                return (C7649u) g0VarM14609v.f36832K.f22539c;
            }
            return h1Var;
        }
        return this;
    }

    public final long P0(long j6) {
        long j10 = this.f36913z;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - ((int) (j10 >> 32));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        o1 o1Var = this.f36901K;
        return o1Var != null ? o1Var.mo14654j(true, jFloatToRawIntBits) : jFloatToRawIntBits;
    }

    public final InterfaceC2141e Q0() {
        C1476g c1476g = this.f36898G;
        if (c1476g != null) {
            return c1476g;
        }
        C1476g c1476g2 = new C1476g(25, this, new e1(this, 0));
        this.f36898G = c1476g2;
        return c1476g2;
    }

    public abstract o0 R0();

    @Override // t3.InterfaceC7033t
    /* renamed from: S */
    public final C0848c mo13298S(InterfaceC7033t interfaceC7033t, boolean z6) {
        if (!T0().f37683p) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC7033t.mo13305s()) {
            AbstractC6744a.m12907b("LayoutCoordinates " + interfaceC7033t + " is not attached!");
        }
        h1 h1VarM1 = m1(interfaceC7033t);
        h1VarM1.e1();
        h1 h1VarO0 = O0(h1VarM1);
        C0846a c0846a = this.f36894C;
        if (c0846a == null) {
            c0846a = new C0846a();
            this.f36894C = c0846a;
        }
        c0846a.f5348b = DefinitionKt.NO_Float_VALUE;
        c0846a.f5349c = DefinitionKt.NO_Float_VALUE;
        c0846a.f5350d = (int) (interfaceC7033t.mo13307v() >> 32);
        c0846a.f5351e = (int) (interfaceC7033t.mo13307v() & 4294967295L);
        while (h1VarM1 != h1VarO0) {
            h1VarM1.k1(c0846a, z6, false);
            if (c0846a.m2268f()) {
                return C0848c.f5353e;
            }
            h1VarM1 = h1VarM1.f36904p;
            AbstractC4154l.m8920c(h1VarM1);
        }
        H0(h1VarO0, c0846a, z6);
        return new C0848c(c0846a.f5348b, c0846a.f5349c, c0846a.f5350d, c0846a.f5351e);
    }

    public final long S0() {
        return this.f36908t.l0(this.f36902m.f36827E.mo14530d());
    }

    public abstract AbstractC7878q T0();

    public final AbstractC7878q U0(int i10) {
        boolean zM14630g = i1.m14630g(i10);
        AbstractC7878q abstractC7878qT0 = T0();
        if (!zM14630g && (abstractC7878qT0 = abstractC7878qT0.f37674e) == null) {
            return null;
        }
        for (AbstractC7878q abstractC7878qV0 = V0(zM14630g); abstractC7878qV0 != null && (abstractC7878qV0.f37673d & i10) != 0; abstractC7878qV0 = abstractC7878qV0.f37675f) {
            if ((abstractC7878qV0.f37672c & i10) != 0) {
                return abstractC7878qV0;
            }
            if (abstractC7878qV0 == abstractC7878qT0) {
                return null;
            }
        }
        return null;
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: V */
    public final long mo13299V(long j6) {
        if (!T0().f37683p) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e1();
        for (h1 h1Var = this; h1Var != null; h1Var = h1Var.f36904p) {
            o1 o1Var = h1Var.f36901K;
            if (o1Var != null) {
                j6 = o1Var.mo14654j(false, j6);
            }
            j6 = xe.m11047d(j6, h1Var.f36913z);
        }
        return j6;
    }

    public final AbstractC7878q V0(boolean z6) {
        AbstractC7878q abstractC7878qT0;
        C4535g c4535g = this.f36902m.f36832K;
        if (((h1) c4535g.f22540d) == this) {
            return (AbstractC7878q) c4535g.f22542f;
        }
        if (!z6) {
            h1 h1Var = this.f36904p;
            if (h1Var != null) {
                return h1Var.T0();
            }
            return null;
        }
        h1 h1Var2 = this.f36904p;
        if (h1Var2 == null || (abstractC7878qT0 = h1Var2.T0()) == null) {
            return null;
        }
        return abstractC7878qT0.f37675f;
    }

    public final void W0(AbstractC7878q abstractC7878q, C7632d c7632d, long j6, C7647s c7647s, int i10, boolean z6) {
        if (abstractC7878q == null) {
            Z0(c7632d, j6, c7647s, i10, z6);
            return;
        }
        int i11 = c7647s.f36990c;
        e1.e0 e0Var = c7647s.f36988a;
        c7647s.m14659h(i11 + 1, e0Var.f8957b);
        c7647s.f36990c++;
        e0Var.m5543a(abstractC7878q);
        c7647s.f36989b.m5670a(AbstractC7634f.m14540a(-1.0f, z6, false));
        W0(AbstractC7634f.m14544e(abstractC7878q, c7632d.m14537b()), c7632d, j6, c7647s, i10, z6);
        c7647s.f36990c = i11;
    }

    public final void X0(AbstractC7878q abstractC7878q, C7632d c7632d, long j6, C7647s c7647s, int i10, boolean z6, float f6) {
        if (abstractC7878q == null) {
            Z0(c7632d, j6, c7647s, i10, z6);
            return;
        }
        int i11 = c7647s.f36990c;
        e1.e0 e0Var = c7647s.f36988a;
        c7647s.m14659h(i11 + 1, e0Var.f8957b);
        c7647s.f36990c++;
        e0Var.m5543a(abstractC7878q);
        c7647s.f36989b.m5670a(AbstractC7634f.m14540a(f6, z6, false));
        h1(AbstractC7634f.m14544e(abstractC7878q, c7632d.m14537b()), c7632d, j6, c7647s, i10, z6, f6, true);
        c7647s.f36990c = i11;
    }

    public final void Y0(C7632d c7632d, long j6, C7647s c7647s, int i10, boolean z6) {
        boolean z10;
        boolean z11;
        AbstractC7878q abstractC7878qU0 = U0(c7632d.m14537b());
        if (!r1(j6)) {
            if (i10 == 1) {
                float fK0 = K0(j6, S0());
                if ((Float.floatToRawIntBits(fK0) & Integer.MAX_VALUE) < 2139095040) {
                    if (c7647s.f36990c != pe.m10832g(c7647s)) {
                        if (AbstractC7634f.m14547h(c7647s.m14658b(), AbstractC7634f.m14540a(fK0, false, false)) <= 0) {
                            return;
                        }
                    }
                    X0(abstractC7878qU0, c7632d, j6, c7647s, i10, false, fK0);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC7878qU0 == null) {
            Z0(c7632d, j6, c7647s, i10, z6);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        if (fIntBitsToFloat >= DefinitionKt.NO_Float_VALUE && fIntBitsToFloat2 >= DefinitionKt.NO_Float_VALUE && fIntBitsToFloat < h0() && fIntBitsToFloat2 < f0()) {
            W0(abstractC7878qU0, c7632d, j6, c7647s, i10, z6);
            return;
        }
        float fK02 = i10 == 1 ? K0(j6, S0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fK02) & Integer.MAX_VALUE) < 2139095040) {
            if (c7647s.f36990c != pe.m10832g(c7647s)) {
                z10 = z6;
                if (AbstractC7634f.m14547h(c7647s.m14658b(), AbstractC7634f.m14540a(fK02, z10, false)) > 0) {
                }
                h1(abstractC7878qU0, c7632d, j6, c7647s, i10, z10, fK02, z11);
            }
            z10 = z6;
            z11 = true;
            h1(abstractC7878qU0, c7632d, j6, c7647s, i10, z10, fK02, z11);
        }
        z10 = z6;
        z11 = false;
        h1(abstractC7878qU0, c7632d, j6, c7647s, i10, z10, fK02, z11);
    }

    public void Z0(C7632d c7632d, long j6, C7647s c7647s, int i10, boolean z6) {
        h1 h1Var = this.f36903n;
        if (h1Var != null) {
            h1Var.Y0(c7632d, h1Var.P0(j6), c7647s, i10, z6);
        }
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f36902m.f36825C.mo155a();
    }

    public final void a1() {
        o1 o1Var = this.f36901K;
        if (o1Var != null) {
            o1Var.invalidate();
            return;
        }
        h1 h1Var = this.f36904p;
        if (h1Var != null) {
            h1Var.a1();
        }
    }

    public final boolean b1() {
        if (this.f36901K != null && this.f36910w <= DefinitionKt.NO_Float_VALUE) {
            return true;
        }
        h1 h1Var = this.f36904p;
        if (h1Var != null) {
            return h1Var.b1();
        }
        return false;
    }

    @Override // t3.InterfaceC7033t
    public final long c0(InterfaceC7033t interfaceC7033t, long j6) {
        return c1(interfaceC7033t, j6);
    }

    public final long c1(InterfaceC7033t interfaceC7033t, long j6) {
        if (interfaceC7033t instanceof t3.h0) {
            t3.h0 h0Var = (t3.h0) interfaceC7033t;
            h0Var.f34004a.f36966m.e1();
            return h0Var.m13301b(this, j6 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        h1 h1VarM1 = m1(interfaceC7033t);
        h1VarM1.e1();
        h1 h1VarO0 = O0(h1VarM1);
        while (h1VarM1 != h1VarO0) {
            o1 o1Var = h1VarM1.f36901K;
            if (o1Var != null) {
                j6 = o1Var.mo14654j(false, j6);
            }
            j6 = xe.m11047d(j6, h1VarM1.f36913z);
            h1VarM1 = h1VarM1.f36904p;
            AbstractC4154l.m8920c(h1VarM1);
        }
        return I0(h1VarO0, j6);
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: d */
    public final void mo13302d(InterfaceC7033t interfaceC7033t, float[] fArr) {
        h1 h1VarM1 = m1(interfaceC7033t);
        h1VarM1.e1();
        h1 h1VarO0 = O0(h1VarM1);
        d3.b0.m5097d(fArr);
        h1VarM1.o1(h1VarO0, fArr);
        n1(h1VarO0, fArr);
    }

    public final void d1() {
        if (this.f36901K != null || this.f36907s == null) {
            return;
        }
        o1 o1VarM14656a = p1.m14656a(j0.m14636a(this.f36902m), Q0(), this.f36899H, false, 8);
        o1VarM14656a.mo14648d(this.f34032c);
        o1VarM14656a.mo14651g(this.f36913z);
        o1VarM14656a.invalidate();
        this.f36901K = o1VarM14656a;
    }

    public final void e1() {
        k0 k0Var = this.f36902m.f36833L;
        c0 c0Var = k0Var.f36928a.f36833L.f36931d;
        if (c0Var == c0.LayingOut || c0Var == c0.LookaheadLayingOut) {
            if (k0Var.f36943p.f37046E) {
                k0Var.m14641e(true);
            } else {
                k0Var.m14640d(true);
            }
        }
        if (c0Var == c0.LookaheadLayingOut) {
            s0 s0Var = k0Var.f36944q;
            if (s0Var == null || !s0Var.f37007x) {
                k0Var.m14642f(true);
            } else {
                k0Var.m14643g(true);
            }
        }
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: f */
    public final long mo13303f(long j6) {
        long jMo13299V = mo13299V(j6);
        C7904v c7904v = (C7904v) j0.m14636a(this.f36902m);
        c7904v.m15022D();
        return d3.b0.m5095b(jMo13299V, c7904v.Z0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r7v7, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void f1() {
        AbstractC7878q abstractC7878qT0;
        boolean zM14630g = i1.m14630g(128);
        AbstractC7878q abstractC7878qV0 = V0(zM14630g);
        if (abstractC7878qV0 == null || (abstractC7878qV0.f37670a.f37673d & 128) == 0) {
            return;
        }
        AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
        InterfaceC2139c interfaceC2139cMo13650e = abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null;
        AbstractC7311h abstractC7311hM13707d = AbstractC7321r.m13707d(abstractC7311hM13706c);
        try {
            if (!zM14630g) {
                abstractC7878qT0 = T0().f37674e;
                if (abstractC7878qT0 == null) {
                }
            }
            abstractC7878qT0 = T0();
            for (AbstractC7878q abstractC7878qV02 = V0(zM14630g); abstractC7878qV02 != null; abstractC7878qV02 = abstractC7878qV02.f37675f) {
                if ((abstractC7878qV02.f37673d & 128) == 0) {
                    break;
                }
                if ((abstractC7878qV02.f37672c & 128) != 0) {
                    AbstractC7642n abstractC7642nM14545f = abstractC7878qV02;
                    ?? c4640e = 0;
                    while (abstractC7642nM14545f != 0) {
                        if (abstractC7642nM14545f instanceof InterfaceC7651w) {
                            ((InterfaceC7651w) abstractC7642nM14545f).mo5878k(this.f34032c);
                        } else if ((abstractC7642nM14545f.f37672c & 128) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                            AbstractC7878q abstractC7878q = abstractC7642nM14545f.f36953r;
                            int i10 = 0;
                            abstractC7642nM14545f = abstractC7642nM14545f;
                            c4640e = c4640e;
                            while (abstractC7878q != null) {
                                if ((abstractC7878q.f37672c & 128) != 0) {
                                    i10++;
                                    c4640e = c4640e;
                                    if (i10 == 1) {
                                        abstractC7642nM14545f = abstractC7878q;
                                    } else {
                                        if (c4640e == 0) {
                                            c4640e = new C4640e(new AbstractC7878q[16]);
                                        }
                                        if (abstractC7642nM14545f != 0) {
                                            c4640e.m9506b(abstractC7642nM14545f);
                                            abstractC7642nM14545f = 0;
                                        }
                                        c4640e.m9506b(abstractC7878q);
                                    }
                                }
                                abstractC7878q = abstractC7878q.f37675f;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e = c4640e;
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                    }
                }
                if (abstractC7878qV02 == abstractC7878qT0) {
                    break;
                }
            }
        } finally {
            AbstractC7321r.m13709f(abstractC7311hM13706c, abstractC7311hM13707d, interfaceC2139cMo13650e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void g1() {
        boolean zM14630g = i1.m14630g(128);
        AbstractC7878q abstractC7878qT0 = T0();
        if (!zM14630g && (abstractC7878qT0 = abstractC7878qT0.f37674e) == null) {
            return;
        }
        for (AbstractC7878q abstractC7878qV0 = V0(zM14630g); abstractC7878qV0 != null && (abstractC7878qV0.f37673d & 128) != 0; abstractC7878qV0 = abstractC7878qV0.f37675f) {
            if ((abstractC7878qV0.f37672c & 128) != 0) {
                AbstractC7642n abstractC7642nM14545f = abstractC7878qV0;
                ?? c4640e = 0;
                while (abstractC7642nM14545f != 0) {
                    if (abstractC7642nM14545f instanceof InterfaceC7651w) {
                        ((InterfaceC7651w) abstractC7642nM14545f).f0(this);
                    } else if ((abstractC7642nM14545f.f37672c & 128) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                        AbstractC7878q abstractC7878q = abstractC7642nM14545f.f36953r;
                        int i10 = 0;
                        abstractC7642nM14545f = abstractC7642nM14545f;
                        c4640e = c4640e;
                        while (abstractC7878q != null) {
                            if ((abstractC7878q.f37672c & 128) != 0) {
                                i10++;
                                c4640e = c4640e;
                                if (i10 == 1) {
                                    abstractC7642nM14545f = abstractC7878q;
                                } else {
                                    if (c4640e == 0) {
                                        c4640e = new C4640e(new AbstractC7878q[16]);
                                    }
                                    if (abstractC7642nM14545f != 0) {
                                        c4640e.m9506b(abstractC7642nM14545f);
                                        abstractC7642nM14545f = 0;
                                    }
                                    c4640e.m9506b(abstractC7878q);
                                }
                            }
                            abstractC7878q = abstractC7878q.f37675f;
                            abstractC7642nM14545f = abstractC7642nM14545f;
                            c4640e = c4640e;
                        }
                        if (i10 == 1) {
                        }
                    }
                    abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                }
            }
            if (abstractC7878qV0 == abstractC7878qT0) {
                return;
            }
        }
    }

    @Override // t3.InterfaceC7028o
    public final EnumC6757m getLayoutDirection() {
        return this.f36902m.f36826D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018f A[PHI: r5
      0x018f: PHI (r5v3 m2.e) = (r5v1 m2.e), (r5v1 m2.e), (r5v5 m2.e) binds: [B:52:0x015b, B:54:0x015f, B:68:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h1(w2.AbstractC7878q r18, v3.C7632d r19, long r20, v3.C7647s r22, int r23, boolean r24, float r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.h1.h1(w2.q, v3.d, long, v3.s, int, boolean, float, boolean):void");
    }

    public abstract void i1(InterfaceC1563q interfaceC1563q, C2474b c2474b);

    public final void j1(long j6, float f6, InterfaceC2139c interfaceC2139c) {
        p1(interfaceC2139c, false);
        if (!C6754j.m12940a(this.f36913z, j6)) {
            this.f36913z = j6;
            g0 g0Var = this.f36902m;
            g0Var.f36833L.f36943p.z0();
            o1 o1Var = this.f36901K;
            if (o1Var != null) {
                o1Var.mo14651g(j6);
            } else {
                h1 h1Var = this.f36904p;
                if (h1Var != null) {
                    h1Var.a1();
                }
            }
            n0.F0(this);
            p1 p1Var = g0Var.f36855p;
            if (p1Var != null) {
                ((C7904v) p1Var).m15043z(g0Var);
            }
        }
        this.f36893B = f6;
        if (this.f36956h) {
            return;
        }
        u0(new t1(C0(), this));
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: k */
    public final InterfaceC7033t mo13304k() {
        if (!T0().f37683p) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e1();
        return this.f36904p;
    }

    public final void k1(C0846a c0846a, boolean z6, boolean z10) {
        o1 o1Var = this.f36901K;
        if (o1Var != null) {
            if (this.f36906r) {
                if (z10) {
                    long jS0 = S0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jS0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jS0 & 4294967295L)) / 2.0f;
                    long j6 = this.f34032c;
                    c0846a.m2267e(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j6 >> 32)) + fIntBitsToFloat, ((int) (j6 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z6) {
                    long j10 = this.f34032c;
                    c0846a.m2267e(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, (int) (j10 >> 32), (int) (j10 & 4294967295L));
                }
                if (c0846a.m2268f()) {
                    return;
                }
            }
            o1Var.mo14650f(c0846a, false);
        }
        long j11 = this.f36913z;
        float f6 = (int) (j11 >> 32);
        c0846a.f5348b += f6;
        c0846a.f5350d += f6;
        float f10 = (int) (j11 & 4294967295L);
        c0846a.f5349c += f10;
        c0846a.f5351e += f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [m2.e] */
    public final void l1(t3.k0 k0Var) {
        h1 h1Var;
        t3.k0 k0Var2 = this.f36911x;
        if (k0Var != k0Var2) {
            this.f36911x = k0Var;
            g0 g0Var = this.f36902m;
            int i10 = 0;
            if (k0Var2 == null || k0Var.mo12108b() != k0Var2.mo12108b() || k0Var.getHeight() != k0Var2.getHeight()) {
                int iMo12108b = k0Var.mo12108b();
                int height = k0Var.getHeight();
                o1 o1Var = this.f36901K;
                if (o1Var != null) {
                    o1Var.mo14648d((iMo12108b << 32) | (height & 4294967295L));
                } else if (g0Var.m14579I() && (h1Var = this.f36904p) != null) {
                    h1Var.a1();
                }
                m0((height & 4294967295L) | (iMo12108b << 32));
                if (this.f36907s != null) {
                    q1(false);
                }
                boolean zM14630g = i1.m14630g(4);
                AbstractC7878q abstractC7878qT0 = T0();
                if (zM14630g || (abstractC7878qT0 = abstractC7878qT0.f37674e) != null) {
                    for (AbstractC7878q abstractC7878qV0 = V0(zM14630g); abstractC7878qV0 != null && (abstractC7878qV0.f37673d & 4) != 0; abstractC7878qV0 = abstractC7878qV0.f37675f) {
                        if ((abstractC7878qV0.f37672c & 4) != 0) {
                            AbstractC7642n abstractC7642nM14545f = abstractC7878qV0;
                            ?? c4640e = 0;
                            while (abstractC7642nM14545f != 0) {
                                if (abstractC7642nM14545f instanceof InterfaceC7644p) {
                                    ((InterfaceC7644p) abstractC7642nM14545f).mo151C();
                                } else if ((abstractC7642nM14545f.f37672c & 4) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                    AbstractC7878q abstractC7878q = abstractC7642nM14545f.f36953r;
                                    int i11 = 0;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e = c4640e;
                                    while (abstractC7878q != null) {
                                        if ((abstractC7878q.f37672c & 4) != 0) {
                                            i11++;
                                            c4640e = c4640e;
                                            if (i11 == 1) {
                                                abstractC7642nM14545f = abstractC7878q;
                                            } else {
                                                if (c4640e == 0) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7642nM14545f != 0) {
                                                    c4640e.m9506b(abstractC7642nM14545f);
                                                    abstractC7642nM14545f = 0;
                                                }
                                                c4640e.m9506b(abstractC7878q);
                                            }
                                        }
                                        abstractC7878q = abstractC7878q.f37675f;
                                        abstractC7642nM14545f = abstractC7642nM14545f;
                                        c4640e = c4640e;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                        if (abstractC7878qV0 == abstractC7878qT0) {
                            break;
                        }
                    }
                }
                p1 p1Var = g0Var.f36855p;
                if (p1Var != null) {
                    ((C7904v) p1Var).m15043z(g0Var);
                }
            }
            e1.d0 d0Var = this.f36912y;
            if ((d0Var == null || d0Var.f8951e == 0) && k0Var.mo12109c().isEmpty()) {
                return;
            }
            e1.d0 d0Var2 = this.f36912y;
            Map mapMo12109c = k0Var.mo12109c();
            if (d0Var2 != null && d0Var2.f8951e == mapMo12109c.size()) {
                Object[] objArr = d0Var2.f8948b;
                int[] iArr = d0Var2.f8949c;
                long[] jArr = d0Var2.f8947a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i12 = 0;
                loop0: while (true) {
                    long j6 = jArr[i12];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = i10; i14 < i13; i14++) {
                            if ((255 & j6) < 128) {
                                int i15 = (i12 << 3) + i14;
                                Object obj = objArr[i15];
                                int i16 = iArr[i15];
                                Integer num = (Integer) mapMo12109c.get((C7027n) obj);
                                if (num == null || num.intValue() != i16) {
                                    break loop0;
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i13 != 8) {
                            return;
                        }
                    }
                    if (i12 == length) {
                        return;
                    }
                    i12++;
                    i10 = 0;
                }
            }
            g0Var.f36833L.f36943p.f37043B.m14619f();
            e1.d0 d0Var3 = this.f36912y;
            if (d0Var3 == null) {
                e1.d0 d0Var4 = e1.o0.f9033a;
                d0Var3 = new e1.d0();
                this.f36912y = d0Var3;
            }
            d0Var3.m5532a();
            for (Map.Entry entry : k0Var.mo12109c().entrySet()) {
                d0Var3.m5539h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    @Override // v3.q1
    /* renamed from: n */
    public final boolean mo14534n() {
        return (this.f36901K == null || this.f36905q || !this.f36902m.m14578H()) ? false : true;
    }

    public final void n1(h1 h1Var, float[] fArr) {
        if (AbstractC4154l.m8918a(h1Var, this)) {
            return;
        }
        h1 h1Var2 = this.f36904p;
        AbstractC4154l.m8920c(h1Var2);
        h1Var2.n1(h1Var, fArr);
        if (!C6754j.m12940a(this.f36913z, 0L)) {
            float[] fArr2 = f36890N;
            d3.b0.m5097d(fArr2);
            long j6 = this.f36913z;
            d3.b0.m5099f(fArr2, -((int) (j6 >> 32)), -((int) (j6 & 4294967295L)));
            d3.b0.m5098e(fArr, fArr2);
        }
        o1 o1Var = this.f36901K;
        if (o1Var != null) {
            o1Var.mo14649e(fArr);
        }
    }

    public final void o1(h1 h1Var, float[] fArr) {
        h1 h1Var2 = this;
        while (!h1Var2.equals(h1Var)) {
            o1 o1Var = h1Var2.f36901K;
            if (o1Var != null) {
                o1Var.mo14645a(fArr);
            }
            if (!C6754j.m12940a(h1Var2.f36913z, 0L)) {
                float[] fArr2 = f36890N;
                d3.b0.m5097d(fArr2);
                d3.b0.m5099f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                d3.b0.m5098e(fArr, fArr2);
            }
            h1Var2 = h1Var2.f36904p;
            AbstractC4154l.m8920c(h1Var2);
        }
    }

    public final void p1(InterfaceC2139c interfaceC2139c, boolean z6) {
        p1 p1Var;
        g0 g0Var = this.f36902m;
        boolean z10 = (!z6 && this.f36907s == interfaceC2139c && AbstractC4154l.m8918a(this.f36908t, g0Var.f36825C) && this.f36909v == g0Var.f36826D) ? false : true;
        this.f36908t = g0Var.f36825C;
        this.f36909v = g0Var.f36826D;
        boolean zM14578H = g0Var.m14578H();
        e1 e1Var = this.f36899H;
        if (!zM14578H || interfaceC2139c == null) {
            this.f36907s = null;
            o1 o1Var = this.f36901K;
            if (o1Var != null) {
                o1Var.destroy();
                g0Var.f36836O = true;
                e1Var.invoke();
                if (T0().f37683p && g0Var.m14579I() && (p1Var = g0Var.f36855p) != null) {
                    ((C7904v) p1Var).m15043z(g0Var);
                }
            }
            this.f36901K = null;
            this.f36900I = false;
            return;
        }
        this.f36907s = interfaceC2139c;
        if (this.f36901K != null) {
            if (z10 && q1(true)) {
                ((C7904v) j0.m14636a(g0Var)).getRectManager().m5698e(g0Var);
                return;
            }
            return;
        }
        o1 o1VarM14656a = p1.m14656a(j0.m14636a(g0Var), Q0(), e1Var, g0Var.f36848g, 4);
        o1VarM14656a.mo14648d(this.f34032c);
        o1VarM14656a.mo14651g(this.f36913z);
        this.f36901K = o1VarM14656a;
        q1(true);
        g0Var.f36836O = true;
        e1Var.invoke();
    }

    public final boolean q1(boolean z6) {
        p1 p1Var;
        o1 o1Var = this.f36901K;
        boolean z10 = false;
        if (o1Var == null) {
            if (this.f36907s == null) {
                return false;
            }
            AbstractC6744a.m12907b("null layer with a non-null layerBlock");
            return false;
        }
        InterfaceC2139c interfaceC2139c = this.f36907s;
        if (interfaceC2139c == null) {
            throw p020v.a1.m14342v("updateLayerParameters requires a non-null layerBlock");
        }
        d3.i0 i0Var = f36888L;
        i0Var.m5167k(1.0f);
        i0Var.m5168n(1.0f);
        i0Var.m5161b(1.0f);
        i0Var.m5173x(DefinitionKt.NO_Float_VALUE);
        i0Var.m5174y(DefinitionKt.NO_Float_VALUE);
        i0Var.m5169r(DefinitionKt.NO_Float_VALUE);
        long j6 = AbstractC1571y.f7823a;
        i0Var.m5162c(j6);
        i0Var.m5171t(j6);
        i0Var.m5164f(DefinitionKt.NO_Float_VALUE);
        i0Var.m5165h(DefinitionKt.NO_Float_VALUE);
        i0Var.m5166j(DefinitionKt.NO_Float_VALUE);
        if (i0Var.f7768n != 8.0f) {
            i0Var.f7756a |= NewHope.SENDB_BYTES;
            i0Var.f7768n = 8.0f;
        }
        i0Var.m5172v(d3.p0.f7805b);
        i0Var.m5170s(d3.h0.f7748a);
        i0Var.m5163d(false);
        if (i0Var.f7772s != 0) {
            i0Var.f7756a |= 32768;
            i0Var.f7772s = 0;
        }
        i0Var.f7773t = 9205357640488583168L;
        i0Var.f7776x = null;
        i0Var.f7756a = 0;
        g0 g0Var = this.f36902m;
        i0Var.f7774v = g0Var.f36825C;
        i0Var.f7775w = g0Var.f36826D;
        i0Var.f7773t = ze.m11098d(this.f34032c);
        ((C7904v) j0.m14636a(g0Var)).getSnapshotObserver().m14657a(this, C7633e.f36798e, new j3(3, interfaceC2139c));
        C7650v c7650v = this.f36895D;
        if (c7650v == null) {
            c7650v = new C7650v();
            this.f36895D = c7650v;
        }
        C7650v c7650v2 = f36889M;
        c7650v2.getClass();
        c7650v2.f37019a = c7650v.f37019a;
        c7650v2.f37020b = c7650v.f37020b;
        c7650v2.f37021c = c7650v.f37021c;
        c7650v2.f37022d = c7650v.f37022d;
        c7650v2.f37023e = c7650v.f37023e;
        c7650v2.f37024f = c7650v.f37024f;
        c7650v2.f37025g = c7650v.f37025g;
        c7650v2.f37026h = c7650v.f37026h;
        c7650v2.f37027i = c7650v.f37027i;
        c7650v.f37019a = i0Var.f7757b;
        c7650v.f37020b = i0Var.f7758c;
        c7650v.f37021c = i0Var.f7760e;
        c7650v.f37022d = i0Var.f7761f;
        c7650v.f37023e = i0Var.f7765k;
        c7650v.f37024f = i0Var.f7766l;
        c7650v.f37025g = i0Var.f7767m;
        c7650v.f37026h = i0Var.f7768n;
        c7650v.f37027i = i0Var.f7769p;
        o1Var.mo14653i(i0Var);
        boolean z11 = this.f36906r;
        this.f36906r = i0Var.f7771r;
        this.f36910w = i0Var.f7759d;
        if (c7650v2.f37019a == c7650v.f37019a && c7650v2.f37020b == c7650v.f37020b && c7650v2.f37021c == c7650v.f37021c && c7650v2.f37022d == c7650v.f37022d && c7650v2.f37023e == c7650v.f37023e && c7650v2.f37024f == c7650v.f37024f && c7650v2.f37025g == c7650v.f37025g && c7650v2.f37026h == c7650v.f37026h && d3.p0.m5180a(c7650v2.f37027i, c7650v.f37027i)) {
            z10 = true;
        }
        boolean z12 = !z10;
        if (z6 && ((!z10 || z11 != this.f36906r) && (p1Var = g0Var.f36855p) != null)) {
            ((C7904v) p1Var).m15043z(g0Var);
        }
        return z12;
    }

    public final boolean r1(long j6) {
        if ((((9187343241974906880L ^ (j6 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        o1 o1Var = this.f36901K;
        return o1Var == null || !this.f36906r || o1Var.mo14646b(j6);
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: s */
    public final boolean mo13305s() {
        return T0().f37683p;
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: t */
    public final void mo13306t(float[] fArr) {
        p1 p1VarM14636a = j0.m14636a(this.f36902m);
        h1 h1VarM1 = m1(t3.c1.m13279h(this));
        o1(h1VarM1, fArr);
        if (p1VarM14636a instanceof InterfaceC5807e) {
            ((C7904v) ((InterfaceC5807e) p1VarM14636a)).m15036r(fArr);
            return;
        }
        if (!h1VarM1.T0().f37683p) {
            AbstractC6744a.m12907b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long jM15037s = ((C7904v) j0.m14636a(h1VarM1.f36902m)).m15037s(h1VarM1.mo13299V(0L));
        if ((9223372034707292159L & jM15037s) != 9205357640488583168L) {
            d3.b0.m5099f(fArr, Float.intBitsToFloat((int) (jM15037s >> 32)), Float.intBitsToFloat((int) (jM15037s & 4294967295L)));
        }
    }

    @Override // t3.InterfaceC7033t
    /* renamed from: v */
    public final long mo13307v() {
        return this.f34032c;
    }

    @Override // v3.n0
    public final n0 x0() {
        return this.f36903n;
    }

    @Override // v3.n0
    public final InterfaceC7033t z0() {
        return this;
    }
}
