package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public class q26 {

    /* renamed from: b */
    public static q26 f41163b = new q26();

    /* renamed from: c */
    public static String[] f41164c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    public String f41165a = HTTP.IDENTITY_CODING;

    /* renamed from: o.q26$a */
    public static class C16273a extends q26 {

        /* renamed from: h */
        public static double f41166h = 0.01d;

        /* renamed from: i */
        public static double f41167i = 1.0E-4d;

        /* renamed from: d */
        public double f41168d;

        /* renamed from: e */
        public double f41169e;

        /* renamed from: f */
        public double f41170f;

        /* renamed from: g */
        public double f41171g;

        public C16273a(String str) {
            this.f41165a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f41168d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.f41169e = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.f41170f = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.f41171g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // p001o.q26
        /* renamed from: a */
        public double mo20345a(double d) {
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f41166h) {
                d2 *= 0.5d;
                d3 = m44741d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dM44741d = m44741d(d4);
            double d5 = d3 + d2;
            double dM44741d2 = m44741d(d5);
            double dM44742e = m44742e(d4);
            return (((m44742e(d5) - dM44742e) * (d - dM44741d)) / (dM44741d2 - dM44741d)) + dM44742e;
        }

        @Override // p001o.q26
        /* renamed from: b */
        public double mo20346b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f41167i) {
                d2 *= 0.5d;
                d3 = m44741d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (m44742e(d5) - m44742e(d4)) / (m44741d(d5) - m44741d(d4));
        }

        /* renamed from: d */
        public final double m44741d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f41168d * d2 * d3 * d) + (this.f41170f * d3 * d * d) + (d * d * d);
        }

        /* renamed from: e */
        public final double m44742e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f41169e * d2 * d3 * d) + (this.f41171g * d3 * d * d) + (d * d * d);
        }
    }

    /* renamed from: c */
    public static q26 m44740c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C16273a(str);
        }
        if (str.startsWith("spline")) {
            return new x5g(str);
        }
        if (str.startsWith("Schlick")) {
            return new c6f(str);
        }
        switch (str) {
            case "accelerate":
                return new C16273a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new C16273a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new C16273a("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new C16273a("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new C16273a("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new C16273a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f41164c));
                return f41163b;
        }
    }

    /* renamed from: a */
    public double mo20345a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo20346b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f41165a;
    }
}
