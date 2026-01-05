package v3;

import c9.C0910e;
import d3.C1565s;
import d3.InterfaceC1563q;
import ex.InterfaceC2139c;
import g3.C2474b;
import m2.C4640e;
import of.C5359n;
import t3.C7027n;
import w2.AbstractC7878q;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.u */
/* loaded from: classes.dex */
public final class C7649u extends h1 {

    /* renamed from: Y */
    public static final C5359n f37015Y;

    /* renamed from: V */
    public final x1 f37016V;

    /* renamed from: X */
    public C7648t f37017X;

    static {
        C5359n c5359nM5135g = d3.h0.m5135g();
        int i10 = C1565s.f7818k;
        c5359nM5135g.m10514u(C1565s.f7813f);
        c5359nM5135g.m10486A(1.0f);
        c5359nM5135g.m10487B(1);
        f37015Y = c5359nM5135g;
    }

    public C7649u(g0 g0Var) {
        super(g0Var);
        x1 x1Var = new x1();
        x1Var.f37673d = 0;
        this.f37016V = x1Var;
        x1Var.f37677h = this;
        this.f37017X = g0Var.f36849h != null ? new C7648t(this) : null;
    }

    @Override // v3.h1
    public final void N0() {
        if (this.f37017X == null) {
            this.f37017X = new C7648t(this);
        }
    }

    @Override // v3.h1
    public final o0 R0() {
        return this.f37017X;
    }

    @Override // v3.h1
    public final AbstractC7878q T0() {
        return this.f37016V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // v3.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z0(v3.C7632d r19, long r20, v3.C7647s r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.C7649u.Z0(v3.d, long, v3.s, int, boolean):void");
    }

    @Override // t3.i0
    public final int a0(int i10) {
        C0910e c0910eM14608u = this.f36902m.m14608u();
        t3.j0 j0VarM2612v = c0910eM14608u.m2612v();
        g0 g0Var = (g0) c0910eM14608u.f5579b;
        return j0VarM2612v.minIntrinsicHeight((h1) g0Var.f36832K.f22540d, g0Var.m14602o(), i10);
    }

    @Override // t3.i0
    /* renamed from: b */
    public final int mo13311b(int i10) {
        C0910e c0910eM14608u = this.f36902m.m14608u();
        t3.j0 j0VarM2612v = c0910eM14608u.m2612v();
        g0 g0Var = (g0) c0910eM14608u.f5579b;
        return j0VarM2612v.maxIntrinsicHeight((h1) g0Var.f36832K.f22540d, g0Var.m14602o(), i10);
    }

    @Override // v3.h1
    public final void i1(InterfaceC1563q interfaceC1563q, C2474b c2474b) {
        g0 g0Var = this.f36902m;
        p1 p1VarM14636a = j0.m14636a(g0Var);
        C4640e c4640eM14612y = g0Var.m14612y();
        Object[] objArr = c4640eM14612y.f22884a;
        int i10 = c4640eM14612y.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (g0Var2.m14579I()) {
                g0Var2.m14599i(interfaceC1563q, c2474b);
            }
        }
        if (((C7904v) p1VarM14636a).getShowLayoutBounds()) {
            long j6 = this.f34032c;
            interfaceC1563q.mo5100a(0.5f, 0.5f, ((int) (j6 >> 32)) - 0.5f, ((int) (j6 & 4294967295L)) - 0.5f, f37015Y);
        }
    }

    @Override // t3.w0
    public final void k0(long j6, float f6, InterfaceC2139c interfaceC2139c) {
        j1(j6, f6, interfaceC2139c);
        if (this.f36955g) {
            return;
        }
        this.f36902m.f36833L.f36943p.B0();
    }

    @Override // v3.n0
    public final int t0(C7027n c7027n) {
        C7648t c7648t = this.f37017X;
        if (c7648t != null) {
            return c7648t.t0(c7027n);
        }
        y0 y0Var = this.f36902m.f36833L.f36943p;
        h0 h0Var = y0Var.f37043B;
        if (!y0Var.f37064n) {
            if (y0Var.f37057f.f36931d == c0.Measuring) {
                h0Var.f36883f = true;
                if (h0Var.f36879b) {
                    y0Var.f37073y = true;
                    y0Var.f37074z = true;
                }
            } else {
                h0Var.f36884g = true;
            }
        }
        y0Var.mo14526j().f36956h = true;
        y0Var.mo14521H();
        y0Var.mo14526j().f36956h = false;
        Integer num = (Integer) h0Var.f36886i.get(c7027n);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // t3.i0
    /* renamed from: x */
    public final int mo13312x(int i10) {
        C0910e c0910eM14608u = this.f36902m.m14608u();
        t3.j0 j0VarM2612v = c0910eM14608u.m2612v();
        g0 g0Var = (g0) c0910eM14608u.f5579b;
        return j0VarM2612v.minIntrinsicWidth((h1) g0Var.f36832K.f22540d, g0Var.m14602o(), i10);
    }

    @Override // t3.i0
    /* renamed from: y */
    public final int mo13313y(int i10) {
        C0910e c0910eM14608u = this.f36902m.m14608u();
        t3.j0 j0VarM2612v = c0910eM14608u.m2612v();
        g0 g0Var = (g0) c0910eM14608u.f5579b;
        return j0VarM2612v.maxIntrinsicWidth((h1) g0Var.f36832K.f22540d, g0Var.m14602o(), i10);
    }

    @Override // t3.i0
    /* renamed from: z */
    public final t3.w0 mo13314z(long j6) {
        q0(j6);
        g0 g0Var = this.f36902m;
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((g0) objArr[i11]).f36833L.f36943p.f37063m = e0.NotUsed;
        }
        l1(g0Var.f36864z.mo16554measure3p2s80s(this, g0Var.m14602o(), j6));
        f1();
        return this;
    }
}
