package u5;

import android.graphics.Color;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u5.a */
/* loaded from: classes.dex */
public abstract class AbstractC7339a {
    static {
        new ThreadLocal();
    }

    /* renamed from: a */
    public static int m13731a(double d2, double d10, double d11) {
        double d12 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d2))) / 100.0d;
        double d13 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d2))) / 100.0d;
        double d14 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d2))) / 100.0d;
        double dPow = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        double dPow2 = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double dPow3 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    /* renamed from: b */
    public static int m13732b(int i10, int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i12, m13733c(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, i12), m13733c(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, i12), m13733c(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, i12));
    }

    /* renamed from: c */
    public static int m13733c(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * 255) * i11)) / (i14 * 255);
    }

    /* renamed from: d */
    public static int m13734d(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
