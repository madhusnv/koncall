package p001o;

import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes3.dex */
public final class n32 {

    /* renamed from: k */
    public static final double[][] f36292k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* renamed from: l */
    public static final double[][] f36293l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* renamed from: a */
    public final double f36294a;

    /* renamed from: b */
    public final double f36295b;

    /* renamed from: c */
    public final double f36296c;

    /* renamed from: d */
    public final double f36297d;

    /* renamed from: e */
    public final double f36298e;

    /* renamed from: f */
    public final double f36299f;

    /* renamed from: g */
    public final double f36300g;

    /* renamed from: h */
    public final double f36301h;

    /* renamed from: i */
    public final double f36302i;

    /* renamed from: j */
    public final double[] f36303j = {FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE};

    public n32(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f36294a = d;
        this.f36295b = d2;
        this.f36296c = d3;
        this.f36297d = d4;
        this.f36298e = d5;
        this.f36299f = d6;
        this.f36300g = d7;
        this.f36301h = d8;
        this.f36302i = d9;
    }

    /* renamed from: a */
    public static n32 m40029a(int i) {
        return m40030b(i, m0j.f34613k);
    }

    /* renamed from: b */
    public static n32 m40030b(int i, m0j m0jVar) {
        int i2 = i & Constants.MAX_HOST_LENGTH;
        double dM39102l = mi3.m39102l((16711680 & i) >> 16);
        double dM39102l2 = mi3.m39102l((65280 & i) >> 8);
        double dM39102l3 = mi3.m39102l(i2);
        return m40031c((0.41233895d * dM39102l) + (0.35762064d * dM39102l2) + (0.18051042d * dM39102l3), (0.2126d * dM39102l) + (0.7152d * dM39102l2) + (0.0722d * dM39102l3), (dM39102l * 0.01932141d) + (dM39102l2 * 0.11916382d) + (dM39102l3 * 0.95034478d), m0jVar);
    }

    /* renamed from: c */
    public static n32 m40031c(double d, double d2, double d3, m0j m0jVar) {
        double[][] dArr = f36292k;
        double[] dArr2 = dArr[0];
        double d4 = (dArr2[0] * d) + (dArr2[1] * d2) + (dArr2[2] * d3);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[0] * d) + (dArr3[1] * d2) + (dArr3[2] * d3);
        double[] dArr4 = dArr[2];
        double d6 = (dArr4[0] * d) + (dArr4[1] * d2) + (dArr4[2] * d3);
        double d7 = m0jVar.m38153j()[0] * d4;
        double d8 = m0jVar.m38153j()[1] * d5;
        double d9 = m0jVar.m38153j()[2] * d6;
        double dPow = Math.pow((m0jVar.m38147d() * Math.abs(d7)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((m0jVar.m38147d() * Math.abs(d8)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((m0jVar.m38147d() * Math.abs(d9)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d7) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d8) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d9) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d10 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d11 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d12 = dSignum2 * 20.0d;
        double d13 = (((dSignum * 20.0d) + d12) + (21.0d * dSignum3)) / 20.0d;
        double d14 = (((dSignum * 40.0d) + d12) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d11, d10));
        if (degrees < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d15 = degrees;
        double radians = Math.toRadians(d15);
        double dPow4 = Math.pow((d14 * m0jVar.m38150g()) / m0jVar.m38145b(), m0jVar.m38146c() * m0jVar.m38154k()) * 100.0d;
        double d16 = dPow4 / 100.0d;
        double dM38146c = (4.0d / m0jVar.m38146c()) * Math.sqrt(d16) * (m0jVar.m38145b() + 4.0d) * m0jVar.m38148e();
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, m0jVar.m38149f()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d15 < 20.14d ? d15 + 360.0d : d15) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * m0jVar.m38151h()) * m0jVar.m38152i()) * Math.hypot(d10, d11)) / (d13 + 0.305d), 0.9d);
        double dSqrt = Math.sqrt(d16) * dPow5;
        double dM38148e = dSqrt * m0jVar.m38148e();
        double dLog1p = Math.log1p(dM38148e * 0.0228d) * 43.859649122807014d;
        return new n32(d15, dSqrt, dPow4, dM38146c, dM38148e, Math.sqrt((dPow5 * m0jVar.m38146c()) / (m0jVar.m38145b() + 4.0d)) * 50.0d, (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d), dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    /* renamed from: d */
    public double m40032d() {
        return this.f36295b;
    }

    /* renamed from: e */
    public double m40033e() {
        return this.f36294a;
    }
}
