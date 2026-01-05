package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes3.dex */
public final class m0j {

    /* renamed from: k */
    public static final m0j f34613k = m38143a(50.0d);

    /* renamed from: a */
    public final double f34614a;

    /* renamed from: b */
    public final double f34615b;

    /* renamed from: c */
    public final double f34616c;

    /* renamed from: d */
    public final double f34617d;

    /* renamed from: e */
    public final double f34618e;

    /* renamed from: f */
    public final double f34619f;

    /* renamed from: g */
    public final double[] f34620g;

    /* renamed from: h */
    public final double f34621h;

    /* renamed from: i */
    public final double f34622i;

    /* renamed from: j */
    public final double f34623j;

    public m0j(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f34619f = d;
        this.f34614a = d2;
        this.f34615b = d3;
        this.f34616c = d4;
        this.f34617d = d5;
        this.f34618e = d6;
        this.f34620g = dArr;
        this.f34621h = d7;
        this.f34622i = d8;
        this.f34623j = d9;
    }

    /* renamed from: a */
    public static m0j m38143a(double d) {
        return m38144l(mi3.m39106p(), (mi3.m39108r(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    /* renamed from: l */
    public static m0j m38144l(double[] dArr, double d, double d2, double d3, boolean z) {
        double dMax = Math.max(0.1d, d2);
        double[][] dArr2 = n32.f36292k;
        double d4 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d5 = dArr3[0] * d4;
        double d6 = dArr[1];
        double d7 = d5 + (dArr3[1] * d6);
        double d8 = dArr[2];
        double d9 = d7 + (dArr3[2] * d8);
        double[] dArr4 = dArr2[1];
        double d10 = (dArr4[0] * d4) + (dArr4[1] * d6) + (dArr4[2] * d8);
        double[] dArr5 = dArr2[2];
        double d11 = (d4 * dArr5[0]) + (d6 * dArr5[1]) + (d8 * dArr5[2]);
        double d12 = (d3 / 10.0d) + 0.8d;
        double dM41316d = d12 >= 0.9d ? nza.m41316d(0.59d, 0.69d, (d12 - 0.9d) * 10.0d) : nza.m41316d(0.525d, 0.59d, (d12 - 0.8d) * 10.0d);
        double dM41313a = nza.m41313a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, z ? 1.0d : (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d12);
        double[] dArr6 = {(((100.0d / d9) * dM41313a) + 1.0d) - dM41313a, (((100.0d / d10) * dM41313a) + 1.0d) - dM41313a, (((100.0d / d11) * dM41313a) + 1.0d) - dM41313a};
        double d13 = 5.0d * d;
        double d14 = 1.0d / (d13 + 1.0d);
        double d15 = d14 * d14 * d14 * d14;
        double d16 = 1.0d - d15;
        double dCbrt = (d15 * d) + (0.1d * d16 * d16 * Math.cbrt(d13));
        double dM39108r = mi3.m39108r(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dM39108r) + 1.48d;
        double dPow = 0.725d / Math.pow(dM39108r, 0.2d);
        double dPow2 = Math.pow(((dArr6[2] * dCbrt) * d11) / 100.0d, 0.42d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d9) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d10) / 100.0d, 0.42d), dPow2};
        double d17 = dArr7[0];
        double d18 = (d17 * 400.0d) / (d17 + 27.13d);
        double d19 = dArr7[1];
        return new m0j(dM39108r, ((d18 * 2.0d) + ((d19 * 400.0d) / (d19 + 27.13d)) + (((400.0d * dPow2) / (dPow2 + 27.13d)) * 0.05d)) * dPow, dPow, dPow, dM41316d, d12, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    /* renamed from: b */
    public double m38145b() {
        return this.f34614a;
    }

    /* renamed from: c */
    public double m38146c() {
        return this.f34617d;
    }

    /* renamed from: d */
    public double m38147d() {
        return this.f34621h;
    }

    /* renamed from: e */
    public double m38148e() {
        return this.f34622i;
    }

    /* renamed from: f */
    public double m38149f() {
        return this.f34619f;
    }

    /* renamed from: g */
    public double m38150g() {
        return this.f34615b;
    }

    /* renamed from: h */
    public double m38151h() {
        return this.f34618e;
    }

    /* renamed from: i */
    public double m38152i() {
        return this.f34616c;
    }

    /* renamed from: j */
    public double[] m38153j() {
        return this.f34620g;
    }

    /* renamed from: k */
    public double m38154k() {
        return this.f34623j;
    }
}
