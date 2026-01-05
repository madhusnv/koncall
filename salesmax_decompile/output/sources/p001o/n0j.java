package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public final class n0j {

    /* renamed from: k */
    public static final n0j f36189k = m39963k(p32.f39278c, (float) ((p32.m42945h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f36190a;

    /* renamed from: b */
    public final float f36191b;

    /* renamed from: c */
    public final float f36192c;

    /* renamed from: d */
    public final float f36193d;

    /* renamed from: e */
    public final float f36194e;

    /* renamed from: f */
    public final float f36195f;

    /* renamed from: g */
    public final float[] f36196g;

    /* renamed from: h */
    public final float f36197h;

    /* renamed from: i */
    public final float f36198i;

    /* renamed from: j */
    public final float f36199j;

    public n0j(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f36195f = f;
        this.f36190a = f2;
        this.f36191b = f3;
        this.f36192c = f4;
        this.f36193d = f5;
        this.f36194e = f6;
        this.f36196g = fArr;
        this.f36197h = f7;
        this.f36198i = f8;
        this.f36199j = f9;
    }

    /* renamed from: k */
    public static n0j m39963k(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = p32.f39276a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float fM42941d = ((double) f12) >= 0.9d ? p32.m42941d(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : p32.m42941d(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float fExp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * fExp) + 1.0f) - fExp, (((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float fCbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(f * 5.0d)));
        float fM42945h = p32.m42945h(f2) / fArr[1];
        double d2 = fM42945h;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float fPow2 = (float) Math.pow(((fArr6[2] * fCbrt) * f11) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f10) / 100.0d, 0.42d), fPow2};
        float f16 = fArr7[0];
        float f17 = fArr7[1];
        return new n0j(fM42945h, ((((f16 * 400.0f) / (f16 + 27.13f)) * 2.0f) + ((f17 * 400.0f) / (f17 + 27.13f)) + (((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f)) * fPow, fPow, fPow, fM42941d, f12, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    /* renamed from: a */
    public float m39964a() {
        return this.f36190a;
    }

    /* renamed from: b */
    public float m39965b() {
        return this.f36193d;
    }

    /* renamed from: c */
    public float m39966c() {
        return this.f36197h;
    }

    /* renamed from: d */
    public float m39967d() {
        return this.f36198i;
    }

    /* renamed from: e */
    public float m39968e() {
        return this.f36195f;
    }

    /* renamed from: f */
    public float m39969f() {
        return this.f36191b;
    }

    /* renamed from: g */
    public float m39970g() {
        return this.f36194e;
    }

    /* renamed from: h */
    public float m39971h() {
        return this.f36192c;
    }

    /* renamed from: i */
    public float[] m39972i() {
        return this.f36196g;
    }

    /* renamed from: j */
    public float m39973j() {
        return this.f36199j;
    }
}
