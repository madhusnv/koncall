package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes3.dex */
public abstract class s64 {
    /* renamed from: a */
    public static double m47894a(double d, double d2) {
        if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d <= 100.0d) {
            double dM39108r = mi3.m39108r(d);
            double d3 = ((dM39108r + 5.0d) / d2) - 5.0d;
            if (d3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d3 <= 100.0d) {
                double dM47899f = m47899f(dM39108r, d3);
                double dAbs = Math.abs(dM47899f - d2);
                if (dM47899f < d2 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double dM39104n = mi3.m39104n(d3) - 0.4d;
                if (dM39104n >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dM39104n <= 100.0d) {
                    return dM39104n;
                }
            }
        }
        return -1.0d;
    }

    /* renamed from: b */
    public static double m47895b(double d, double d2) {
        return Math.max(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, m47894a(d, d2));
    }

    /* renamed from: c */
    public static double m47896c(double d, double d2) {
        if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d <= 100.0d) {
            double dM39108r = mi3.m39108r(d);
            double d3 = ((dM39108r + 5.0d) * d2) - 5.0d;
            if (d3 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d3 <= 100.0d) {
                double dM47899f = m47899f(d3, dM39108r);
                double dAbs = Math.abs(dM47899f - d2);
                if (dM47899f < d2 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double dM39104n = mi3.m39104n(d3) + 0.4d;
                if (dM39104n >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dM39104n <= 100.0d) {
                    return dM39104n;
                }
            }
        }
        return -1.0d;
    }

    /* renamed from: d */
    public static double m47897d(double d, double d2) {
        double dM47896c = m47896c(d, d2);
        if (dM47896c < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return 100.0d;
        }
        return dM47896c;
    }

    /* renamed from: e */
    public static double m47898e(double d, double d2) {
        return m47899f(mi3.m39108r(d), mi3.m39108r(d2));
    }

    /* renamed from: f */
    public static double m47899f(double d, double d2) {
        double dMax = Math.max(d, d2);
        if (dMax != d2) {
            d = d2;
        }
        return (dMax + 5.0d) / (d + 5.0d);
    }
}
