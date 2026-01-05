package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes3.dex */
public abstract class nza {
    /* renamed from: a */
    public static double m41313a(double d, double d2, double d3) {
        return d3 < d ? d : d3 > d2 ? d2 : d3;
    }

    /* renamed from: b */
    public static int m41314b(int i, int i2, int i3) {
        return i3 < i ? i : i3 > i2 ? i2 : i3;
    }

    /* renamed from: c */
    public static double m41315c(double d, double d2) {
        return 180.0d - Math.abs(Math.abs(d - d2) - 180.0d);
    }

    /* renamed from: d */
    public static double m41316d(double d, double d2, double d3) {
        return ((1.0d - d3) * d) + (d3 * d2);
    }

    /* renamed from: e */
    public static double[] m41317e(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = d2 + (dArr3[1] * d3);
        double d5 = dArr[2];
        double d6 = d4 + (dArr3[2] * d5);
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[0] * d) + (dArr4[1] * d3) + (dArr4[2] * d5);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d * dArr5[0]) + (d3 * dArr5[1]) + (d5 * dArr5[2])};
    }

    /* renamed from: f */
    public static double m41318f(double d) {
        double d2 = d % 360.0d;
        return d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? d2 + 360.0d : d2;
    }

    /* renamed from: g */
    public static int m41319g(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    /* renamed from: h */
    public static int m41320h(double d) {
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return -1;
        }
        return d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 0 : 1;
    }
}
