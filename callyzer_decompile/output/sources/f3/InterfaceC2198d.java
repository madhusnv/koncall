package f3;

import a1.C0005d;
import android.graphics.Paint;
import d3.AbstractC1561o;
import d3.C1552f;
import d3.C1559m;
import d3.InterfaceC1563q;
import d3.g0;
import d3.h0;
import d3.o0;
import kotlin.jvm.internal.AbstractC4154l;
import of.C5359n;
import og.d2;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import v3.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f3.d */
/* loaded from: classes.dex */
public interface InterfaceC2198d extends InterfaceC6747c {
    /* renamed from: K */
    static long m5907K(long j6, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    /* renamed from: P */
    static /* synthetic */ void m5908P(InterfaceC2198d interfaceC2198d, g0 g0Var, AbstractC1561o abstractC1561o, float f6, C2202h c2202h, int i10) {
        if ((i10 & 4) != 0) {
            f6 = 1.0f;
        }
        float f10 = f6;
        AbstractC2199e abstractC2199e = c2202h;
        if ((i10 & 8) != 0) {
            abstractC2199e = C2201g.f10129a;
        }
        interfaceC2198d.mo5896L(g0Var, abstractC1561o, f10, abstractC2199e, (i10 & 32) != 0 ? 3 : 0);
    }

    /* renamed from: Y */
    static void m5909Y(i0 i0Var, AbstractC1561o abstractC1561o, long j6, long j10, long j11, AbstractC2199e abstractC2199e, int i10) {
        long j12 = (i10 & 2) != 0 ? 0L : j6;
        long jM5907K = (i10 & 4) != 0 ? m5907K(i0Var.f36917a.mo5913e(), j12) : j10;
        AbstractC2199e abstractC2199e2 = (i10 & 32) != 0 ? C2201g.f10129a : abstractC2199e;
        C2196b c2196b = i0Var.f36917a;
        int i11 = (int) (j12 >> 32);
        int i12 = (int) (j12 & 4294967295L);
        c2196b.f10123a.f10121c.mo5117s(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (jM5907K >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (jM5907K & 4294967295L)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), c2196b.m5900c(abstractC1561o, abstractC2199e2, 1.0f, null, 3, 1));
    }

    static /* synthetic */ void o0(InterfaceC2198d interfaceC2198d, long j6, long j10, long j11, float f6, C1559m c1559m, int i10) {
        long j12 = (i10 & 2) != 0 ? 0L : j10;
        interfaceC2198d.mo5905o(j6, j12, (i10 & 4) != 0 ? m5907K(interfaceC2198d.mo5913e(), j12) : j11, (i10 & 8) != 0 ? 1.0f : f6, (i10 & 32) != 0 ? null : c1559m, (i10 & 64) != 0 ? 3 : 0);
    }

    /* renamed from: q */
    static /* synthetic */ void m5910q(InterfaceC2198d interfaceC2198d, long j6, float f6, long j10, AbstractC2199e abstractC2199e, int i10, int i11) {
        if ((i11 & 4) != 0) {
            j10 = interfaceC2198d.i0();
        }
        interfaceC2198d.mo5898U(j6, f6, j10, (i11 & 16) != 0 ? C2201g.f10129a : abstractC2199e, (i11 & 64) != 0 ? 3 : i10);
    }

    /* renamed from: w */
    static void m5912w(i0 i0Var, AbstractC1561o abstractC1561o, long j6, long j10, float f6, float f10, int i10) {
        if ((i10 & 64) != 0) {
            f10 = 1.0f;
        }
        C2196b c2196b = i0Var.f36917a;
        InterfaceC1563q interfaceC1563q = c2196b.f10123a.f10121c;
        C5359n c5359nM5135g = c2196b.f10126d;
        if (c5359nM5135g == null) {
            c5359nM5135g = h0.m5135g();
            c5359nM5135g.m10487B(1);
            c2196b.f10126d = c5359nM5135g;
        }
        Paint paint = (Paint) c5359nM5135g.f26304b;
        if (abstractC1561o != null) {
            abstractC1561o.mo5176a(f10, c2196b.mo5913e(), c5359nM5135g);
        } else if (paint.getAlpha() / 255.0f != f10) {
            c5359nM5135g.m10512s(f10);
        }
        if (!AbstractC4154l.m8918a((C1559m) c5359nM5135g.f26306d, null)) {
            c5359nM5135g.m10515v(null);
        }
        if (c5359nM5135g.f26303a != 3) {
            c5359nM5135g.m10513t(3);
        }
        if (paint.getStrokeWidth() != f6) {
            c5359nM5135g.m10486A(f6);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c5359nM5135g.m10499e() != 0) {
            c5359nM5135g.m10518y(0);
        }
        if (c5359nM5135g.m10500f() != 0) {
            c5359nM5135g.m10519z(0);
        }
        if (!paint.isFilterBitmap()) {
            c5359nM5135g.m10516w(1);
        }
        interfaceC1563q.mo5105g(j6, j10, c5359nM5135g);
    }

    static /* synthetic */ void w0(InterfaceC2198d interfaceC2198d, g0 g0Var, long j6, float f6, AbstractC2199e abstractC2199e, int i10) {
        if ((i10 & 4) != 0) {
            f6 = 1.0f;
        }
        interfaceC2198d.mo5903g(g0Var, j6, f6, abstractC2199e);
    }

    static void y0(InterfaceC2198d interfaceC2198d, C1552f c1552f, long j6, long j10, float f6, C1559m c1559m, int i10, int i11) {
        interfaceC2198d.v0(c1552f, 0L, j6, (i11 & 16) != 0 ? j6 : j10, (i11 & 32) != 0 ? 1.0f : f6, c1559m, (i11 & 512) != 0 ? 1 : i10);
    }

    /* renamed from: L */
    void mo5896L(g0 g0Var, AbstractC1561o abstractC1561o, float f6, AbstractC2199e abstractC2199e, int i10);

    /* renamed from: Q */
    void mo5897Q(o0 o0Var, long j6, long j10, AbstractC2199e abstractC2199e);

    /* renamed from: U */
    void mo5898U(long j6, float f6, long j10, AbstractC2199e abstractC2199e, int i10);

    /* renamed from: X */
    C0005d mo5899X();

    /* renamed from: e */
    default long mo5913e() {
        return mo5899X().m81z();
    }

    /* renamed from: g */
    void mo5903g(g0 g0Var, long j6, float f6, AbstractC2199e abstractC2199e);

    EnumC6757m getLayoutDirection();

    /* renamed from: i */
    void mo5904i(long j6, float f6, float f10, long j10, long j11, float f11, AbstractC2199e abstractC2199e);

    default long i0() {
        return d2.m10602e(mo5899X().m81z());
    }

    /* renamed from: o */
    void mo5905o(long j6, long j10, long j11, float f6, C1559m c1559m, int i10);

    void p0(long j6, long j10, long j11, long j12, AbstractC2199e abstractC2199e, int i10);

    void r0(long j6, long j10, long j11, float f6, int i10, int i11);

    void v0(C1552f c1552f, long j6, long j10, long j11, float f6, C1559m c1559m, int i10);
}
