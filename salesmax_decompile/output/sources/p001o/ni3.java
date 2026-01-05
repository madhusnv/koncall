package p001o;

import android.graphics.Color;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes2.dex */
public abstract class ni3 {

    /* renamed from: a */
    public static final ThreadLocal f36871a = new ThreadLocal();

    /* renamed from: a */
    public static void m40609a(int i, int i2, int i3, float[] fArr) {
        float f;
        float fAbs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fAbs = 0.0f;
        } else {
            f = fMax == f2 ? ((f3 - f4) / f5) % 6.0f : fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            fAbs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m40621m(f7, 0.0f, 360.0f);
        fArr[1] = m40621m(fAbs, 0.0f, 1.0f);
        fArr[2] = m40621m(f6, 0.0f, 1.0f);
    }

    /* renamed from: b */
    public static void m40610b(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = i / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = i2 / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = i3 / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    /* renamed from: c */
    public static int m40611c(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(m40622n((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, Constants.MAX_HOST_LENGTH), m40622n((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, Constants.MAX_HOST_LENGTH), m40622n((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, Constants.MAX_HOST_LENGTH));
    }

    /* renamed from: d */
    public static int m40612d(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), (int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: e */
    public static double m40613e(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = m40619k(i, i2);
        }
        double dM40614f = m40614f(i) + 0.05d;
        double dM40614f2 = m40614f(i2) + 0.05d;
        return Math.max(dM40614f, dM40614f2) / Math.min(dM40614f, dM40614f2);
    }

    /* renamed from: f */
    public static double m40614f(int i) {
        double[] dArrM40623o = m40623o();
        m40617i(i, dArrM40623o);
        return dArrM40623o[1] / 100.0d;
    }

    /* renamed from: g */
    public static int m40615g(int i, int i2, float f) {
        int iAlpha = Color.alpha(i2);
        int i3 = Constants.MAX_HOST_LENGTH;
        if (iAlpha != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        double d = f;
        if (m40613e(m40624p(i, Constants.MAX_HOST_LENGTH), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (m40613e(m40624p(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    /* renamed from: h */
    public static void m40616h(int i, float[] fArr) {
        m40609a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: i */
    public static void m40617i(int i, double[] dArr) {
        m40610b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: j */
    public static int m40618j(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: k */
    public static int m40619k(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int iM40618j = m40618j(iAlpha2, iAlpha);
        return Color.argb(iM40618j, m40620l(Color.red(i), iAlpha2, Color.red(i2), iAlpha, iM40618j), m40620l(Color.green(i), iAlpha2, Color.green(i2), iAlpha, iM40618j), m40620l(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, iM40618j));
    }

    /* renamed from: l */
    public static int m40620l(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * Constants.MAX_HOST_LENGTH) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: m */
    public static float m40621m(float f, float f2, float f3) {
        return f < f2 ? f2 : Math.min(f, f3);
    }

    /* renamed from: n */
    public static int m40622n(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* renamed from: o */
    public static double[] m40623o() {
        ThreadLocal threadLocal = f36871a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    /* renamed from: p */
    public static int m40624p(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
