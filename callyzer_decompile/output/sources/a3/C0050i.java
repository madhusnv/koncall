package a3;

import a2.C0037j;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1559m;
import f3.C2196b;
import i3.AbstractC3166c;
import nf.C5047i;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import t3.InterfaceC7023j;
import t3.c1;
import t3.i0;
import t3.k0;
import t3.l0;
import t3.w0;
import v3.InterfaceC7644p;
import v3.InterfaceC7652x;
import v3.n0;
import w2.AbstractC7878q;
import w2.InterfaceC7866e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a3.i */
/* loaded from: classes.dex */
public final class C0050i extends AbstractC7878q implements InterfaceC7652x, InterfaceC7644p {

    /* renamed from: q */
    public AbstractC3166c f208q;

    /* renamed from: r */
    public boolean f209r;

    /* renamed from: s */
    public InterfaceC7866e f210s;

    /* renamed from: t */
    public InterfaceC7023j f211t;

    /* renamed from: v */
    public float f212v;

    /* renamed from: w */
    public C1559m f213w;

    public static boolean M0(long j6) {
        return !C0850e.m2290a(j6, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean N0(long j6) {
        return !C0850e.m2290a(j6, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: H */
    public final int mo146H(n0 n0Var, i0 i0Var, int i10) {
        if (!L0()) {
            return i0Var.a0(i10);
        }
        long jO0 = O0(AbstractC6746b.m12924b(i10, 0, 13));
        return Math.max(C6745a.m12919j(jO0), i0Var.a0(i10));
    }

    public final boolean L0() {
        return this.f209r && this.f208q.mo7533h() != 9205357640488583168L;
    }

    public final long O0(long j6) {
        boolean z6 = false;
        boolean z10 = C6745a.m12914e(j6) && C6745a.m12913d(j6);
        if (C6745a.m12916g(j6) && C6745a.m12915f(j6)) {
            z6 = true;
        }
        if ((!L0() && z10) || z6) {
            return C6745a.m12911b(j6, C6745a.m12918i(j6), 0, C6745a.m12917h(j6), 0, 10);
        }
        long jMo7533h = this.f208q.mo7533h();
        int iRound = N0(jMo7533h) ? Math.round(Float.intBitsToFloat((int) (jMo7533h >> 32))) : C6745a.m12920k(j6);
        int iRound2 = M0(jMo7533h) ? Math.round(Float.intBitsToFloat((int) (jMo7533h & 4294967295L))) : C6745a.m12919j(j6);
        int iM12929g = AbstractC6746b.m12929g(iRound, j6);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(AbstractC6746b.m12928f(iRound2, j6)) & 4294967295L) | (Float.floatToRawIntBits(iM12929g) << 32);
        if (L0()) {
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!N0(this.f208q.mo7533h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f208q.mo7533h() >> 32))) << 32) | (Float.floatToRawIntBits(!M0(this.f208q.mo7533h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f208q.mo7533h() & 4294967295L))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == DefinitionKt.NO_Float_VALUE || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == DefinitionKt.NO_Float_VALUE) ? 0L : c1.m13281j(jFloatToRawIntBits2, this.f211t.mo13315a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return C6745a.m12911b(j6, AbstractC6746b.m12929g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j6), 0, AbstractC6746b.m12928f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j6), 0, 10);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: V */
    public final int mo147V(n0 n0Var, i0 i0Var, int i10) {
        if (!L0()) {
            return i0Var.mo13311b(i10);
        }
        long jO0 = O0(AbstractC6746b.m12924b(i10, 0, 13));
        return Math.max(C6745a.m12919j(jO0), i0Var.mo13311b(i10));
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final k0 mo148b(l0 l0Var, i0 i0Var, long j6) {
        w0 w0VarMo13314z = i0Var.mo13314z(O0(j6));
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0037j(w0VarMo13314z, 2));
    }

    @Override // v3.InterfaceC7644p
    public final void h0(v3.i0 i0Var) {
        C2196b c2196b = i0Var.f36917a;
        long jMo7533h = this.f208q.mo7533h();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(N0(jMo7533h) ? Float.intBitsToFloat((int) (jMo7533h >> 32)) : Float.intBitsToFloat((int) (c2196b.mo5913e() >> 32))) << 32) | (Float.floatToRawIntBits(M0(jMo7533h) ? Float.intBitsToFloat((int) (jMo7533h & 4294967295L)) : Float.intBitsToFloat((int) (c2196b.mo5913e() & 4294967295L))) & 4294967295L);
        long jM13281j = (Float.intBitsToFloat((int) (c2196b.mo5913e() >> 32)) == DefinitionKt.NO_Float_VALUE || Float.intBitsToFloat((int) (c2196b.mo5913e() & 4294967295L)) == DefinitionKt.NO_Float_VALUE) ? 0L : c1.m13281j(jFloatToRawIntBits, this.f211t.mo13315a(jFloatToRawIntBits, c2196b.mo5913e()));
        long jMo14848a = this.f210s.mo14848a((Math.round(Float.intBitsToFloat((int) (jM13281j >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jM13281j & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (c2196b.mo5913e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (c2196b.mo5913e() & 4294967295L))) & 4294967295L), i0Var.getLayoutDirection());
        float f6 = (int) (jMo14848a >> 32);
        float f10 = (int) (jMo14848a & 4294967295L);
        ((C5047i) c2196b.f10124b.f24b).m9985W(f6, f10);
        try {
            this.f208q.m7536g(i0Var, jM13281j, this.f212v, this.f213w);
            ((C5047i) c2196b.f10124b.f24b).m9985W(-f6, -f10);
            i0Var.m14622b();
        } catch (Throwable th2) {
            ((C5047i) c2196b.f10124b.f24b).m9985W(-f6, -f10);
            throw th2;
        }
    }

    @Override // v3.InterfaceC7652x
    public final int k0(n0 n0Var, i0 i0Var, int i10) {
        if (!L0()) {
            return i0Var.mo13313y(i10);
        }
        long jO0 = O0(AbstractC6746b.m12924b(0, i10, 7));
        return Math.max(C6745a.m12920k(jO0), i0Var.mo13313y(i10));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f208q + ", sizeToIntrinsics=" + this.f209r + ", alignment=" + this.f210s + ", alpha=" + this.f212v + ", colorFilter=" + this.f213w + ')';
    }

    @Override // v3.InterfaceC7652x
    public final int x0(n0 n0Var, i0 i0Var, int i10) {
        if (!L0()) {
            return i0Var.mo13312x(i10);
        }
        long jO0 = O0(AbstractC6746b.m12924b(0, i10, 7));
        return Math.max(C6745a.m12920k(jO0), i0Var.mo13312x(i10));
    }
}
