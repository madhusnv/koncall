package p001o;

import android.graphics.Color;

/* loaded from: classes2.dex */
public abstract class p32 {

    /* renamed from: a */
    public static final float[][] f39276a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    public static final float[][] f39277b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    public static final float[] f39278c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    public static final float[][] f39279d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: a */
    public static int m42938a(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f39278c;
        return ni3.m40611c(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* renamed from: b */
    public static float m42939b(int i) {
        return m42940c(m42944g(i));
    }

    /* renamed from: c */
    public static float m42940c(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    /* renamed from: d */
    public static float m42941d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: e */
    public static float m42942e(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* renamed from: f */
    public static void m42943f(int i, float[] fArr) {
        float fM42942e = m42942e(Color.red(i));
        float fM42942e2 = m42942e(Color.green(i));
        float fM42942e3 = m42942e(Color.blue(i));
        float[][] fArr2 = f39279d;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fM42942e) + (fArr3[1] * fM42942e2) + (fArr3[2] * fM42942e3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fM42942e) + (fArr4[1] * fM42942e2) + (fArr4[2] * fM42942e3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fM42942e * fArr5[0]) + (fM42942e2 * fArr5[1]) + (fM42942e3 * fArr5[2]);
    }

    /* renamed from: g */
    public static float m42944g(int i) {
        float fM42942e = m42942e(Color.red(i));
        float fM42942e2 = m42942e(Color.green(i));
        float fM42942e3 = m42942e(Color.blue(i));
        float[] fArr = f39279d[1];
        return (fM42942e * fArr[0]) + (fM42942e2 * fArr[1]) + (fM42942e3 * fArr[2]);
    }

    /* renamed from: h */
    public static float m42945h(float f) {
        return (f > 8.0f ? (float) Math.pow((f + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
