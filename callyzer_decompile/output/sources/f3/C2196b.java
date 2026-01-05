package f3;

import a1.C0005d;
import android.graphics.Paint;
import android.graphics.Shader;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1561o;
import d3.C1552f;
import d3.C1559m;
import d3.C1565s;
import d3.InterfaceC1563q;
import d3.g0;
import d3.h0;
import d3.o0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import of.C5359n;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f3.b */
/* loaded from: classes.dex */
public final class C2196b implements InterfaceC2198d {

    /* renamed from: a */
    public final C2195a f10123a;

    /* renamed from: b */
    public final C0005d f10124b;

    /* renamed from: c */
    public C5359n f10125c;

    /* renamed from: d */
    public C5359n f10126d;

    public C2196b() {
        EnumC6757m enumC6757m = EnumC6757m.Ltr;
        C2195a c2195a = new C2195a();
        c2195a.f10119a = AbstractC2197c.f10127a;
        c2195a.f10120b = enumC6757m;
        c2195a.f10121c = C2200f.f10128a;
        c2195a.f10122d = 0L;
        this.f10123a = c2195a;
        this.f10124b = new C0005d(this);
    }

    /* renamed from: b */
    public static C5359n m5895b(C2196b c2196b, long j6, AbstractC2199e abstractC2199e, float f6, C1559m c1559m, int i10) {
        C5359n c5359nM5902f = c2196b.m5902f(abstractC2199e);
        Paint paint = (Paint) c5359nM5902f.f26304b;
        if (f6 != 1.0f) {
            j6 = C1565s.m5186b(C1565s.m5188d(j6) * f6, 14, j6);
        }
        if (!C1565s.m5187c(h0.m5131c(paint.getColor()), j6)) {
            c5359nM5902f.m10514u(j6);
        }
        if (((Shader) c5359nM5902f.f26305c) != null) {
            c5359nM5902f.m10517x(null);
        }
        if (!AbstractC4154l.m8918a((C1559m) c5359nM5902f.f26306d, c1559m)) {
            c5359nM5902f.m10515v(c1559m);
        }
        if (c5359nM5902f.f26303a != i10) {
            c5359nM5902f.m10513t(i10);
        }
        if (paint.isFilterBitmap()) {
            return c5359nM5902f;
        }
        c5359nM5902f.m10516w(1);
        return c5359nM5902f;
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: L */
    public final void mo5896L(g0 g0Var, AbstractC1561o abstractC1561o, float f6, AbstractC2199e abstractC2199e, int i10) {
        this.f10123a.f10121c.mo5115q(g0Var, m5900c(abstractC1561o, abstractC2199e, f6, null, i10, 1));
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f10123a.f10119a.mo154O();
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: Q */
    public final void mo5897Q(o0 o0Var, long j6, long j10, AbstractC2199e abstractC2199e) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        this.f10123a.f10121c.mo5106h(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11), DefinitionKt.NO_Float_VALUE, 360.0f, m5900c(o0Var, abstractC2199e, 1.0f, null, 3, 1));
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: U */
    public final void mo5898U(long j6, float f6, long j10, AbstractC2199e abstractC2199e, int i10) {
        this.f10123a.f10121c.mo5114p(f6, j10, m5895b(this, j6, abstractC2199e, 1.0f, null, i10));
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: X */
    public final C0005d mo5899X() {
        return this.f10124b;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f10123a.f10119a.mo155a();
    }

    /* renamed from: c */
    public final C5359n m5900c(AbstractC1561o abstractC1561o, AbstractC2199e abstractC2199e, float f6, C1559m c1559m, int i10, int i11) {
        C5359n c5359nM5902f = m5902f(abstractC2199e);
        Paint paint = (Paint) c5359nM5902f.f26304b;
        if (abstractC1561o != null) {
            abstractC1561o.mo5176a(f6, mo5913e(), c5359nM5902f);
        } else {
            if (((Shader) c5359nM5902f.f26305c) != null) {
                c5359nM5902f.m10517x(null);
            }
            long jM5131c = h0.m5131c(paint.getColor());
            long j6 = C1565s.f7809b;
            if (!C1565s.m5187c(jM5131c, j6)) {
                c5359nM5902f.m10514u(j6);
            }
            if (paint.getAlpha() / 255.0f != f6) {
                c5359nM5902f.m10512s(f6);
            }
        }
        if (!AbstractC4154l.m8918a((C1559m) c5359nM5902f.f26306d, c1559m)) {
            c5359nM5902f.m10515v(c1559m);
        }
        if (c5359nM5902f.f26303a != i10) {
            c5359nM5902f.m10513t(i10);
        }
        if (paint.isFilterBitmap() == i11) {
            return c5359nM5902f;
        }
        c5359nM5902f.m10516w(i11);
        return c5359nM5902f;
    }

    /* renamed from: d */
    public final void m5901d(C1552f c1552f, C1559m c1559m) {
        this.f10123a.f10121c.mo5116r(c1552f, m5900c(null, C2201g.f10129a, 1.0f, c1559m, 3, 1));
    }

    /* renamed from: f */
    public final C5359n m5902f(AbstractC2199e abstractC2199e) {
        if (AbstractC4154l.m8918a(abstractC2199e, C2201g.f10129a)) {
            C5359n c5359n = this.f10125c;
            if (c5359n != null) {
                return c5359n;
            }
            C5359n c5359nM5135g = h0.m5135g();
            c5359nM5135g.m10487B(0);
            this.f10125c = c5359nM5135g;
            return c5359nM5135g;
        }
        if (!(abstractC2199e instanceof C2202h)) {
            throw new NoWhenBranchMatchedException();
        }
        C5359n c5359nM5135g2 = this.f10126d;
        if (c5359nM5135g2 == null) {
            c5359nM5135g2 = h0.m5135g();
            c5359nM5135g2.m10487B(1);
            this.f10126d = c5359nM5135g2;
        }
        Paint paint = (Paint) c5359nM5135g2.f26304b;
        float strokeWidth = paint.getStrokeWidth();
        C2202h c2202h = (C2202h) abstractC2199e;
        float f6 = c2202h.f10130a;
        if (strokeWidth != f6) {
            c5359nM5135g2.m10486A(f6);
        }
        int iM10499e = c5359nM5135g2.m10499e();
        int i10 = c2202h.f10132c;
        if (iM10499e != i10) {
            c5359nM5135g2.m10518y(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f10 = c2202h.f10131b;
        if (strokeMiter != f10) {
            paint.setStrokeMiter(f10);
        }
        int iM10500f = c5359nM5135g2.m10500f();
        int i11 = c2202h.f10133d;
        if (iM10500f == i11) {
            return c5359nM5135g2;
        }
        c5359nM5135g2.m10519z(i11);
        return c5359nM5135g2;
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: g */
    public final void mo5903g(g0 g0Var, long j6, float f6, AbstractC2199e abstractC2199e) {
        this.f10123a.f10121c.mo5115q(g0Var, m5895b(this, j6, abstractC2199e, f6, null, 3));
    }

    @Override // f3.InterfaceC2198d
    public final EnumC6757m getLayoutDirection() {
        return this.f10123a.f10120b;
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: i */
    public final void mo5904i(long j6, float f6, float f10, long j10, long j11, float f11, AbstractC2199e abstractC2199e) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.f10123a.f10121c.mo5106h(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i11), f6, f10, m5895b(this, j6, abstractC2199e, f11, null, 3));
    }

    @Override // f3.InterfaceC2198d
    /* renamed from: o */
    public final void mo5905o(long j6, long j10, long j11, float f6, C1559m c1559m, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.f10123a.f10121c.mo5100a(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i12), m5895b(this, j6, C2201g.f10129a, f6, c1559m, i10));
    }

    @Override // f3.InterfaceC2198d
    public final void p0(long j6, long j10, long j11, long j12, AbstractC2199e abstractC2199e, int i10) {
        int i11 = (int) (j10 >> 32);
        int i12 = (int) (j10 & 4294967295L);
        this.f10123a.f10121c.mo5117s(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), m5895b(this, j6, abstractC2199e, 1.0f, null, i10));
    }

    @Override // f3.InterfaceC2198d
    public final void r0(long j6, long j10, long j11, float f6, int i10, int i11) {
        InterfaceC1563q interfaceC1563q = this.f10123a.f10121c;
        C5359n c5359nM5135g = this.f10126d;
        if (c5359nM5135g == null) {
            c5359nM5135g = h0.m5135g();
            c5359nM5135g.m10487B(1);
            this.f10126d = c5359nM5135g;
        }
        Paint paint = (Paint) c5359nM5135g.f26304b;
        if (!C1565s.m5187c(h0.m5131c(paint.getColor()), j6)) {
            c5359nM5135g.m10514u(j6);
        }
        if (((Shader) c5359nM5135g.f26305c) != null) {
            c5359nM5135g.m10517x(null);
        }
        if (!AbstractC4154l.m8918a((C1559m) c5359nM5135g.f26306d, null)) {
            c5359nM5135g.m10515v(null);
        }
        if (c5359nM5135g.f26303a != i11) {
            c5359nM5135g.m10513t(i11);
        }
        if (paint.getStrokeWidth() != f6) {
            c5359nM5135g.m10486A(f6);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c5359nM5135g.m10499e() != i10) {
            c5359nM5135g.m10518y(i10);
        }
        if (c5359nM5135g.m10500f() != 0) {
            c5359nM5135g.m10519z(0);
        }
        if (!paint.isFilterBitmap()) {
            c5359nM5135g.m10516w(1);
        }
        interfaceC1563q.mo5105g(j10, j11, c5359nM5135g);
    }

    @Override // f3.InterfaceC2198d
    public final void v0(C1552f c1552f, long j6, long j10, long j11, float f6, C1559m c1559m, int i10) {
        this.f10123a.f10121c.mo5101b(c1552f, j6, j10, j11, m5900c(null, C2201g.f10129a, f6, c1559m, 3, i10));
    }
}
