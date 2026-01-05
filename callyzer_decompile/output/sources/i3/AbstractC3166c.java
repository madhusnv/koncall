package i3;

import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1559m;
import d3.InterfaceC1563q;
import d3.h0;
import f3.C2196b;
import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;
import of.C5359n;
import og.b2;
import s4.EnumC6757m;
import v3.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i3.c */
/* loaded from: classes.dex */
public abstract class AbstractC3166c {

    /* renamed from: a */
    public C5359n f17089a;

    /* renamed from: b */
    public boolean f17090b;

    /* renamed from: c */
    public C1559m f17091c;

    /* renamed from: d */
    public float f17092d = 1.0f;

    /* renamed from: e */
    public EnumC6757m f17093e = EnumC6757m.Ltr;

    /* renamed from: a */
    public boolean mo7531a(float f6) {
        return false;
    }

    /* renamed from: d */
    public boolean mo7532d(C1559m c1559m) {
        return false;
    }

    /* renamed from: g */
    public final void m7536g(i0 i0Var, long j6, float f6, C1559m c1559m) {
        C2196b c2196b = i0Var.f36917a;
        if (this.f17092d != f6) {
            if (!mo7531a(f6)) {
                if (f6 == 1.0f) {
                    C5359n c5359n = this.f17089a;
                    if (c5359n != null) {
                        c5359n.m10512s(f6);
                    }
                    this.f17090b = false;
                } else {
                    C5359n c5359nM5135g = this.f17089a;
                    if (c5359nM5135g == null) {
                        c5359nM5135g = h0.m5135g();
                        this.f17089a = c5359nM5135g;
                    }
                    c5359nM5135g.m10512s(f6);
                    this.f17090b = true;
                }
            }
            this.f17092d = f6;
        }
        if (!AbstractC4154l.m8918a(this.f17091c, c1559m)) {
            if (!mo7532d(c1559m)) {
                if (c1559m == null) {
                    C5359n c5359n2 = this.f17089a;
                    if (c5359n2 != null) {
                        c5359n2.m10515v(null);
                    }
                    this.f17090b = false;
                } else {
                    C5359n c5359nM5135g2 = this.f17089a;
                    if (c5359nM5135g2 == null) {
                        c5359nM5135g2 = h0.m5135g();
                        this.f17089a = c5359nM5135g2;
                    }
                    c5359nM5135g2.m10515v(c1559m);
                    this.f17090b = true;
                }
            }
            this.f17091c = c1559m;
        }
        EnumC6757m layoutDirection = i0Var.getLayoutDirection();
        if (this.f17093e != layoutDirection) {
            mo7535f(layoutDirection);
            this.f17093e = layoutDirection;
        }
        int i10 = (int) (j6 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2196b.mo5913e() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j6 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2196b.mo5913e() & 4294967295L)) - Float.intBitsToFloat(i11);
        ((C5047i) c2196b.f10124b.f24b).m9979J(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, fIntBitsToFloat, fIntBitsToFloat2);
        if (f6 > DefinitionKt.NO_Float_VALUE) {
            try {
                if (Float.intBitsToFloat(i10) > DefinitionKt.NO_Float_VALUE && Float.intBitsToFloat(i11) > DefinitionKt.NO_Float_VALUE) {
                    if (this.f17090b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
                        C0848c c0848cM10543a = b2.m10543a(0L, (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        InterfaceC1563q interfaceC1563qM75t = c2196b.f10124b.m75t();
                        C5359n c5359nM5135g3 = this.f17089a;
                        if (c5359nM5135g3 == null) {
                            c5359nM5135g3 = h0.m5135g();
                            this.f17089a = c5359nM5135g3;
                        }
                        try {
                            interfaceC1563qM75t.mo5104f(c0848cM10543a, c5359nM5135g3);
                            mo7534i(i0Var);
                            interfaceC1563qM75t.mo5113o();
                        } catch (Throwable th2) {
                            interfaceC1563qM75t.mo5113o();
                            throw th2;
                        }
                    } else {
                        mo7534i(i0Var);
                    }
                }
            } catch (Throwable th3) {
                ((C5047i) c2196b.f10124b.f24b).m9979J(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        ((C5047i) c2196b.f10124b.f24b).m9979J(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    /* renamed from: h */
    public abstract long mo7533h();

    /* renamed from: i */
    public abstract void mo7534i(i0 i0Var);

    /* renamed from: f */
    public void mo7535f(EnumC6757m enumC6757m) {
    }
}
