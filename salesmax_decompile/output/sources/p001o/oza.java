package p001o;

/* loaded from: classes3.dex */
public abstract class oza {
    /* renamed from: a */
    public static boolean m42802a(float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            if (fArr[i] != f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static float m42803b(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: c */
    public static float m42804c(float f, float f2, float f3, float f4, float f5, float f6) {
        return m42808g(m42803b(f, f2, f3, f4), m42803b(f, f2, f5, f4), m42803b(f, f2, f5, f6), m42803b(f, f2, f3, f6));
    }

    /* renamed from: d */
    public static int m42805d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    /* renamed from: e */
    public static boolean m42806e(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: f */
    public static float m42807f(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: g */
    public static float m42808g(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
