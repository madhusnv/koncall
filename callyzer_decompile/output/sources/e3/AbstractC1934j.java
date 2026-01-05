package e3;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.j */
/* loaded from: classes.dex */
public abstract class AbstractC1934j {

    /* renamed from: a */
    public static final C1943s f9136a = new C1943s(0.31006f, 0.31616f);

    /* renamed from: b */
    public static final C1943s f9137b = new C1943s(0.34567f, 0.3585f);

    /* renamed from: c */
    public static final C1943s f9138c = new C1943s(0.32168f, 0.33767f);

    /* renamed from: d */
    public static final C1943s f9139d = new C1943s(0.31271f, 0.32902f);

    /* renamed from: e */
    public static final float[] f9140e = {0.964212f, 1.0f, 0.825188f};

    /* renamed from: a */
    public static AbstractC1927c m5684a(AbstractC1927c abstractC1927c) {
        if (AbstractC1926b.m5671a(abstractC1927c.f9101b, AbstractC1926b.f9095a)) {
            C1941q c1941q = (C1941q) abstractC1927c;
            C1943s c1943s = c1941q.f9155d;
            C1943s c1943s2 = f9137b;
            if (!m5687d(c1943s, c1943s2)) {
                return new C1941q(c1941q.f9100a, c1941q.f9159h, c1943s2, m5690g(m5686c(C1925a.f9093b.f9094a, c1943s.m5692a(), c1943s2.m5692a()), c1941q.f9160i), c1941q.f9162k, c1941q.f9165n, c1941q.f9156e, c1941q.f9157f, c1941q.f9158g, -1);
            }
        }
        return abstractC1927c;
    }

    /* renamed from: b */
    public static float m5685b(float[] fArr) {
        if (fArr.length < 6) {
            return DefinitionKt.NO_Float_VALUE;
        }
        float f6 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = (((((f11 * f14) + ((f10 * f13) + (f6 * f12))) - (f12 * f13)) - (f10 * f11)) - (f6 * f14)) * 0.5f;
        return f15 < DefinitionKt.NO_Float_VALUE ? -f15 : f15;
    }

    /* renamed from: c */
    public static final float[] m5686c(float[] fArr, float[] fArr2, float[] fArr3) {
        m5691h(fArr, fArr2);
        m5691h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM5689f = m5689f(fArr);
        float f6 = fArr4[0];
        float f10 = fArr[0] * f6;
        float f11 = fArr4[1];
        float f12 = fArr[1] * f11;
        float f13 = fArr4[2];
        return m5690g(fArrM5689f, new float[]{f10, f12, fArr[2] * f13, fArr[3] * f6, fArr[4] * f11, fArr[5] * f13, f6 * fArr[6], f11 * fArr[7], f13 * fArr[8]});
    }

    /* renamed from: d */
    public static final boolean m5687d(C1943s c1943s, C1943s c1943s2) {
        if (c1943s == c1943s2) {
            return true;
        }
        return Math.abs(c1943s.f9176a - c1943s2.f9176a) < 0.001f && Math.abs(c1943s.f9177b - c1943s2.f9177b) < 0.001f;
    }

    /* renamed from: e */
    public static final C1931g m5688e(AbstractC1927c abstractC1927c, AbstractC1927c abstractC1927c2) {
        if (abstractC1927c == abstractC1927c2) {
            return new C1929e(abstractC1927c, abstractC1927c, 1);
        }
        long j6 = abstractC1927c.f9101b;
        long j10 = AbstractC1926b.f9095a;
        return (AbstractC1926b.m5671a(j6, j10) && AbstractC1926b.m5671a(abstractC1927c2.f9101b, j10)) ? new C1930f((C1941q) abstractC1927c, (C1941q) abstractC1927c2) : new C1931g(abstractC1927c, abstractC1927c2, 0);
    }

    /* renamed from: f */
    public static final float[] m5689f(float[] fArr) {
        float f6 = fArr[0];
        float f10 = fArr[3];
        float f11 = fArr[6];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[7];
        float f15 = fArr[2];
        float f16 = fArr[5];
        float f17 = fArr[8];
        float f18 = (f13 * f17) - (f14 * f16);
        float f19 = (f14 * f15) - (f12 * f17);
        float f20 = (f12 * f16) - (f13 * f15);
        float f21 = (f11 * f20) + (f10 * f19) + (f6 * f18);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f18 / f21;
        fArr2[1] = f19 / f21;
        fArr2[2] = f20 / f21;
        fArr2[3] = ((f11 * f16) - (f10 * f17)) / f21;
        fArr2[4] = ((f17 * f6) - (f11 * f15)) / f21;
        fArr2[5] = ((f15 * f10) - (f16 * f6)) / f21;
        fArr2[6] = ((f10 * f14) - (f11 * f13)) / f21;
        fArr2[7] = ((f11 * f12) - (f14 * f6)) / f21;
        fArr2[8] = ((f6 * f13) - (f10 * f12)) / f21;
        return fArr2;
    }

    /* renamed from: g */
    public static final float[] m5690g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f6 = fArr[0] * fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        fArr3[0] = (f12 * f13) + (f10 * f11) + f6;
        float f14 = fArr[1];
        float f15 = fArr2[0];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = f17 * f13;
        fArr3[1] = f18 + (f11 * f16) + (f14 * f15);
        float f19 = fArr[2] * f15;
        float f20 = fArr[5];
        float f21 = (fArr2[1] * f20) + f19;
        float f22 = fArr[8];
        fArr3[2] = (f13 * f22) + f21;
        float f23 = fArr[0];
        float f24 = fArr2[3] * f23;
        float f25 = fArr2[4];
        float f26 = (f10 * f25) + f24;
        float f27 = fArr2[5];
        fArr3[3] = (f12 * f27) + f26;
        float f28 = fArr[1];
        float f29 = fArr2[3];
        float f30 = f16 * f25;
        fArr3[4] = (f17 * f27) + f30 + (f28 * f29);
        float f31 = fArr[2];
        float f32 = f27 * f22;
        fArr3[5] = f32 + (f20 * fArr2[4]) + (f29 * f31);
        float f33 = f23 * fArr2[6];
        float f34 = fArr[3];
        float f35 = fArr2[7];
        float f36 = (f34 * f35) + f33;
        float f37 = fArr2[8];
        fArr3[6] = (f12 * f37) + f36;
        float f38 = fArr2[6];
        float f39 = f17 * f37;
        fArr3[7] = f39 + (fArr[4] * f35) + (f28 * f38);
        float f40 = f22 * f37;
        fArr3[8] = f40 + (fArr[5] * fArr2[7]) + (f31 * f38);
        return fArr3;
    }

    /* renamed from: h */
    public static final float[] m5691h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f6 = fArr2[0];
        float f10 = fArr2[1];
        float f11 = fArr2[2];
        fArr2[0] = (fArr[6] * f11) + (fArr[3] * f10) + (fArr[0] * f6);
        fArr2[1] = (fArr[7] * f11) + (fArr[4] * f10) + (fArr[1] * f6);
        fArr2[2] = (fArr[8] * f11) + (fArr[5] * f10) + (fArr[2] * f6);
        return fArr2;
    }
}
