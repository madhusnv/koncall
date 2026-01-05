package w3;

import android.graphics.Outline;
import android.os.Build;
import c3.C0848c;
import c3.C0849d;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1558l;
import d3.C1555i;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a */
    public boolean f37734a = true;

    /* renamed from: b */
    public final Outline f37735b;

    /* renamed from: c */
    public d3.h0 f37736c;

    /* renamed from: d */
    public C1555i f37737d;

    /* renamed from: e */
    public d3.g0 f37738e;

    /* renamed from: f */
    public boolean f37739f;

    /* renamed from: g */
    public boolean f37740g;

    /* renamed from: h */
    public d3.g0 f37741h;

    /* renamed from: i */
    public C0849d f37742i;

    /* renamed from: j */
    public float f37743j;

    /* renamed from: k */
    public long f37744k;

    /* renamed from: l */
    public long f37745l;

    /* renamed from: m */
    public boolean f37746m;

    public b2() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f37735b = outline;
        this.f37744k = 0L;
        this.f37745l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14893a(d3.InterfaceC1563q r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.b2.m14893a(d3.q):void");
    }

    /* renamed from: b */
    public final Outline m14894b() {
        m14897e();
        if (this.f37746m && this.f37734a) {
            return this.f37735b;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m14895c(long j6) {
        d3.h0 h0Var;
        if (this.f37746m && (h0Var = this.f37736c) != null) {
            return m0.m14990q(h0Var, Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)));
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m14896d(d3.h0 h0Var, float f6, boolean z6, float f10, long j6) {
        this.f37735b.setAlpha(f6);
        boolean zM8918a = AbstractC4154l.m8918a(this.f37736c, h0Var);
        boolean z10 = !zM8918a;
        if (!zM8918a) {
            this.f37736c = h0Var;
            this.f37739f = true;
        }
        this.f37745l = j6;
        boolean z11 = h0Var != null && (z6 || f10 > DefinitionKt.NO_Float_VALUE);
        if (this.f37746m != z11) {
            this.f37746m = z11;
            this.f37739f = true;
        }
        return z10;
    }

    /* renamed from: e */
    public final void m14897e() {
        if (this.f37739f) {
            this.f37744k = 0L;
            this.f37743j = DefinitionKt.NO_Float_VALUE;
            this.f37738e = null;
            this.f37739f = false;
            this.f37740g = false;
            d3.h0 h0Var = this.f37736c;
            Outline outline = this.f37735b;
            if (h0Var == null || !this.f37746m || Float.intBitsToFloat((int) (this.f37745l >> 32)) <= DefinitionKt.NO_Float_VALUE || Float.intBitsToFloat((int) (this.f37745l & 4294967295L)) <= DefinitionKt.NO_Float_VALUE) {
                outline.setEmpty();
                return;
            }
            this.f37734a = true;
            if (h0Var instanceof d3.d0) {
                C0848c c0848c = ((d3.d0) h0Var).f7738e;
                float f6 = c0848c.f5354a;
                float f10 = c0848c.f5355b;
                this.f37744k = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                float f11 = c0848c.f5356c;
                float f12 = c0848c.f5357d;
                this.f37745l = (Float.floatToRawIntBits(f12 - f10) & 4294967295L) | (Float.floatToRawIntBits(f11 - f6) << 32);
                outline.setRect(Math.round(f6), Math.round(f10), Math.round(f11), Math.round(f12));
                return;
            }
            if (!(h0Var instanceof d3.e0)) {
                if (h0Var instanceof d3.c0) {
                    m14898f(((d3.c0) h0Var).f7736e);
                    return;
                }
                return;
            }
            C0849d c0849d = ((d3.e0) h0Var).f7743e;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (c0849d.f5362e >> 32));
            float f13 = c0849d.f5358a;
            float f14 = c0849d.f5359b;
            this.f37744k = (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
            float fM2289b = c0849d.m2289b();
            float fM2288a = c0849d.m2288a();
            this.f37745l = (Float.floatToRawIntBits(fM2288a) & 4294967295L) | (Float.floatToRawIntBits(fM2289b) << 32);
            if (og.c2.m10572c(c0849d)) {
                this.f37735b.setRoundRect(Math.round(f13), Math.round(f14), Math.round(c0849d.f5360c), Math.round(c0849d.f5361d), fIntBitsToFloat);
                this.f37743j = fIntBitsToFloat;
                return;
            }
            C1555i c1555iM5178a = this.f37737d;
            if (c1555iM5178a == null) {
                c1555iM5178a = AbstractC1558l.m5178a();
                this.f37737d = c1555iM5178a;
            }
            c1555iM5178a.m5158g();
            d3.g0.m5128b(c1555iM5178a, c0849d);
            m14898f(c1555iM5178a);
        }
    }

    /* renamed from: f */
    public final void m14898f(d3.g0 g0Var) {
        int i10 = Build.VERSION.SDK_INT;
        Outline outline = this.f37735b;
        if (i10 > 28 || ((C1555i) g0Var).f7752a.isConvex()) {
            if (i10 >= 30) {
                c2.f37758a.m14900a(outline, g0Var);
            } else {
                if (!(g0Var instanceof C1555i)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((C1555i) g0Var).f7752a);
            }
            this.f37740g = !outline.canClip();
        } else {
            this.f37734a = false;
            outline.setEmpty();
            this.f37740g = true;
        }
        this.f37738e = g0Var;
    }
}
