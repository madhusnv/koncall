package t5;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t5.k */
/* loaded from: classes.dex */
public final class C7053k {

    /* renamed from: k */
    public static final C7053k f34091k;

    /* renamed from: a */
    public final float f34092a;

    /* renamed from: b */
    public final float f34093b;

    /* renamed from: c */
    public final float f34094c;

    /* renamed from: d */
    public final float f34095d;

    /* renamed from: e */
    public final float f34096e;

    /* renamed from: f */
    public final float f34097f;

    /* renamed from: g */
    public final float[] f34098g;

    /* renamed from: h */
    public final float f34099h;

    /* renamed from: i */
    public final float f34100i;

    /* renamed from: j */
    public final float f34101j;

    static {
        float fM13339l = (float) ((AbstractC7044b.m13339l() * 63.66197723675813d) / 100.0d);
        float[] fArr = AbstractC7044b.f34068c;
        float f6 = fArr[0];
        float[][] fArr2 = AbstractC7044b.f34066a;
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f6;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f6);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f6 * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fM13339l) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d2 = fExp;
        if (d2 > 1.0d) {
            fExp = 1.0f;
        } else if (d2 < 0.0d) {
            fExp = DefinitionKt.NO_Float_VALUE;
        }
        float f18 = 1.0f / ((5.0f * fM13339l) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float fCbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(fM13339l * 5.0d))) + (f19 * fM13339l);
        float fM13339l2 = AbstractC7044b.m13339l() / fArr[1];
        double d10 = fM13339l2;
        float fSqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r2[0] * fCbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((r2[1] * fCbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r2[2] * fCbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr6[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr6[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr6[2];
        float[] fArr7 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        f34091k = new C7053k(fM13339l2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f17, 1.0f, new float[]{(((100.0f / f14) * fExp) + 1.0f) - fExp, (((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public C7053k(float f6, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f34097f = f6;
        this.f34092a = f10;
        this.f34093b = f11;
        this.f34094c = f12;
        this.f34095d = f13;
        this.f34096e = f14;
        this.f34098g = fArr;
        this.f34099h = f15;
        this.f34100i = f16;
        this.f34101j = f17;
    }
}
