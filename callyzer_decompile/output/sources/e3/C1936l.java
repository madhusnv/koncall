package e3;

import com.skydoves.balloon.internals.DefinitionKt;
import d3.h0;
import pg.AbstractC5941v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.l */
/* loaded from: classes.dex */
public final class C1936l extends AbstractC1927c {

    /* renamed from: d */
    public static final float[] f9142d;

    /* renamed from: e */
    public static final float[] f9143e;

    /* renamed from: f */
    public static final float[] f9144f;

    /* renamed from: g */
    public static final float[] f9145g;

    static {
        float[] fArrM5690g = AbstractC1934j.m5690g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC1934j.m5686c(C1925a.f9093b.f9094a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f9142d = fArrM5690g;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f9143e = fArr;
        f9144f = AbstractC1934j.m5689f(fArrM5690g);
        f9145g = AbstractC1934j.m5689f(fArr);
    }

    @Override // e3.AbstractC1927c
    /* renamed from: a */
    public final float mo5673a(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // e3.AbstractC1927c
    /* renamed from: b */
    public final float mo5674b(int i10) {
        if (i10 == 0) {
            return DefinitionKt.NO_Float_VALUE;
        }
        return -0.5f;
    }

    @Override // e3.AbstractC1927c
    /* renamed from: d */
    public final long mo5676d(float f6, float f10, float f11) {
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f9145g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f6);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f6);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f6);
        float f16 = f14 * f14 * f14;
        float f17 = f15 * f15 * f15;
        float[] fArr2 = f9144f;
        float f18 = (fArr2[6] * f17) + (fArr2[3] * f16) + (fArr2[0] * f13 * f13 * f13);
        return (Float.floatToRawIntBits((fArr2[7] * f17) + (fArr2[4] * f16) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f18) << 32);
    }

    @Override // e3.AbstractC1927c
    /* renamed from: e */
    public final float mo5677e(float f6, float f10, float f11) {
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f10 < -0.5f) {
            f10 = -0.5f;
        }
        if (f10 > 0.5f) {
            f10 = 0.5f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        float f12 = f11 <= 0.5f ? f11 : 0.5f;
        float[] fArr = f9145g;
        float f13 = (fArr[6] * f12) + (fArr[3] * f10) + (fArr[0] * f6);
        float f14 = (fArr[7] * f12) + (fArr[4] * f10) + (fArr[1] * f6);
        float f15 = (fArr[8] * f12) + (fArr[5] * f10) + (fArr[2] * f6);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = f9144f;
        return (fArr2[8] * f18) + (fArr2[5] * f17) + (fArr2[2] * f16);
    }

    @Override // e3.AbstractC1927c
    /* renamed from: f */
    public final long mo5678f(float f6, float f10, float f11, float f12, AbstractC1927c abstractC1927c) {
        float[] fArr = f9142d;
        float f13 = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f6);
        float f14 = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f6);
        float f15 = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f6);
        float fM11890d = AbstractC5941v.m11890d(f13);
        float fM11890d2 = AbstractC5941v.m11890d(f14);
        float fM11890d3 = AbstractC5941v.m11890d(f15);
        float[] fArr2 = f9143e;
        return h0.m5130b((fArr2[6] * fM11890d3) + (fArr2[3] * fM11890d2) + (fArr2[0] * fM11890d), (fArr2[7] * fM11890d3) + (fArr2[4] * fM11890d2) + (fArr2[1] * fM11890d), (fArr2[8] * fM11890d3) + (fArr2[5] * fM11890d2) + (fArr2[2] * fM11890d), f12, abstractC1927c);
    }
}
