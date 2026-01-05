package g2;

import ab.C0084b;
import androidx.compose.material3.AbstractC0256a;
import h1.C2772c;
import m1.InterfaceC4629k;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.AbstractC6753i;
import s4.C6745a;
import uw.InterfaceC7559c;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class uc extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public InterfaceC4629k f12904q;

    /* renamed from: r */
    public boolean f12905r;

    /* renamed from: s */
    public boolean f12906s;

    /* renamed from: t */
    public C2772c f12907t;

    /* renamed from: v */
    public C2772c f12908v;

    /* renamed from: w */
    public float f12909w;

    /* renamed from: x */
    public float f12910x;

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        tx.c0.m13502y(z0(), null, null, new C0084b(this, null, 14), 3);
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        float fMo8435T = l0Var.mo8435T(this.f12906s ? j2.k0.f18642n : ((i0Var.mo13311b(C6745a.m12918i(j6)) != 0 && i0Var.mo13313y(C6745a.m12917h(j6)) != 0) || this.f12905r) ? AbstractC0256a.f2072a : AbstractC0256a.f2073b);
        C2772c c2772c = this.f12908v;
        int iFloatValue = (int) (c2772c != null ? ((Number) c2772c.m6775d()).floatValue() : fMo8435T);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            AbstractC6753i.m12938a("width and height must be >= 0");
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(AbstractC6746b.m12930h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fMo8435T2 = l0Var.mo8435T((AbstractC0256a.f2075d - l0Var.mo8434J(fMo8435T)) / 2.0f);
        float fMo8435T3 = l0Var.mo8435T((AbstractC0256a.f2074c - AbstractC0256a.f2072a) - AbstractC0256a.f2076e);
        boolean z6 = this.f12906s;
        if (z6 && this.f12905r) {
            fMo8435T2 = fMo8435T3 - l0Var.mo8435T(j2.k0.f18649u);
        } else if (z6 && !this.f12905r) {
            fMo8435T2 = l0Var.mo8435T(j2.k0.f18649u);
        } else if (this.f12905r) {
            fMo8435T2 = fMo8435T3;
        }
        C2772c c2772c2 = this.f12908v;
        InterfaceC7559c interfaceC7559c = null;
        Float f6 = c2772c2 != null ? (Float) c2772c2.f15362e.getValue() : null;
        if (f6 == null || f6.floatValue() != fMo8435T) {
            tx.c0.m13502y(z0(), null, null, new tc(this, fMo8435T, interfaceC7559c, 0), 3);
        }
        C2772c c2772c3 = this.f12907t;
        Float f10 = c2772c3 != null ? (Float) c2772c3.f15362e.getValue() : null;
        if (f10 == null || f10.floatValue() != fMo8435T2) {
            tx.c0.m13502y(z0(), null, null, new tc(this, fMo8435T2, interfaceC7559c, 1), 3);
        }
        if (Float.isNaN(this.f12910x) && Float.isNaN(this.f12909w)) {
            this.f12910x = fMo8435T;
            this.f12909w = fMo8435T2;
        }
        return l0Var.g0(iFloatValue, iFloatValue, C6669s.f31944a, new jb(w0VarMo13314z, this, fMo8435T2, 1));
    }
}
