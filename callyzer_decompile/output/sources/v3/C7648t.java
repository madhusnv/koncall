package v3;

import c9.C0910e;
import kotlin.jvm.internal.AbstractC4154l;
import m2.C4640e;
import t3.C7027n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.t */
/* loaded from: classes.dex */
public final class C7648t extends o0 {
    @Override // v3.o0
    public final void I0() {
        s0 s0Var = this.f36966m.f36902m.f36833L.f36944q;
        AbstractC4154l.m8920c(s0Var);
        s0Var.A0();
    }

    @Override // t3.i0
    public final int a0(int i10) {
        C0910e c0910eM14608u = this.f36966m.f36902m.m14608u();
        t3.j0 j0VarM2612v = c0910eM14608u.m2612v();
        g0 g0Var = (g0) c0910eM14608u.f5579b;
        return j0VarM2612v.minIntrinsicHeight((h1) g0Var.f36832K.f22540d, g0Var.m14601m(), i10);
    }

    @Override // t3.i0
    /* renamed from: b */
    public final int mo13311b(int i10) {
        C0910e c0910eM14608u = this.f36966m.f36902m.m14608u();
        t3.j0 j0VarM2612v = c0910eM14608u.m2612v();
        g0 g0Var = (g0) c0910eM14608u.f5579b;
        return j0VarM2612v.maxIntrinsicHeight((h1) g0Var.f36832K.f22540d, g0Var.m14601m(), i10);
    }

    @Override // v3.n0
    public final int t0(C7027n c7027n) {
        s0 s0Var = this.f36966m.f36902m.f36833L.f36944q;
        AbstractC4154l.m8920c(s0Var);
        h0 h0Var = s0Var.f37004t;
        if (!s0Var.f36997l) {
            k0 k0Var = s0Var.f36992f;
            if (k0Var.f36931d == c0.LookaheadMeasuring) {
                h0Var.f36883f = true;
                if (h0Var.f36879b) {
                    k0Var.f36933f = true;
                    k0Var.f36934g = true;
                }
            } else {
                h0Var.f36884g = true;
            }
        }
        C7648t c7648t = s0Var.mo14526j().f37017X;
        if (c7648t != null) {
            c7648t.f36956h = true;
        }
        s0Var.mo14521H();
        C7648t c7648t2 = s0Var.mo14526j().f37017X;
        if (c7648t2 != null) {
            c7648t2.f36956h = false;
        }
        Integer num = (Integer) h0Var.f36886i.get(c7027n);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f36971s.m5539h(iIntValue, c7027n);
        return iIntValue;
    }

    @Override // t3.i0
    /* renamed from: x */
    public final int mo13312x(int i10) {
        C0910e c0910eM14608u = this.f36966m.f36902m.m14608u();
        t3.j0 j0VarM2612v = c0910eM14608u.m2612v();
        g0 g0Var = (g0) c0910eM14608u.f5579b;
        return j0VarM2612v.minIntrinsicWidth((h1) g0Var.f36832K.f22540d, g0Var.m14601m(), i10);
    }

    @Override // t3.i0
    /* renamed from: y */
    public final int mo13313y(int i10) {
        C0910e c0910eM14608u = this.f36966m.f36902m.m14608u();
        t3.j0 j0VarM2612v = c0910eM14608u.m2612v();
        g0 g0Var = (g0) c0910eM14608u.f5579b;
        return j0VarM2612v.maxIntrinsicWidth((h1) g0Var.f36832K.f22540d, g0Var.m14601m(), i10);
    }

    @Override // t3.i0
    /* renamed from: z */
    public final t3.w0 mo13314z(long j6) {
        q0(j6);
        h1 h1Var = this.f36966m;
        C4640e c4640eM14613z = h1Var.f36902m.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            s0 s0Var = ((g0) objArr[i11]).f36833L.f36944q;
            AbstractC4154l.m8920c(s0Var);
            s0Var.f36996k = e0.NotUsed;
        }
        g0 g0Var = h1Var.f36902m;
        o0.H0(this, g0Var.f36864z.mo16554measure3p2s80s(this, g0Var.m14601m(), j6));
        return this;
    }
}
