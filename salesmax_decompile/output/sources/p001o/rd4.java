package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public abstract class rd4 {

    /* renamed from: o.rd4$a */
    public static class C16592a extends rd4 {

        /* renamed from: a */
        public double f43393a;

        /* renamed from: b */
        public double[] f43394b;

        public C16592a(double d, double[] dArr) {
            this.f43393a = d;
            this.f43394b = dArr;
        }

        @Override // p001o.rd4
        /* renamed from: c */
        public double mo19473c(double d, int i) {
            return this.f43394b[i];
        }

        @Override // p001o.rd4
        /* renamed from: d */
        public void mo19474d(double d, double[] dArr) {
            double[] dArr2 = this.f43394b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // p001o.rd4
        /* renamed from: e */
        public void mo19475e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f43394b;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // p001o.rd4
        /* renamed from: f */
        public double mo19476f(double d, int i) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        @Override // p001o.rd4
        /* renamed from: g */
        public void mo19477g(double d, double[] dArr) {
            for (int i = 0; i < this.f43394b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // p001o.rd4
        /* renamed from: h */
        public double[] mo19478h() {
            return new double[]{this.f43393a};
        }
    }

    /* renamed from: a */
    public static rd4 m46542a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new nda(dArr, dArr2) : new C16592a(dArr[0], dArr2[0]) : new olb(dArr, dArr2);
    }

    /* renamed from: b */
    public static rd4 m46543b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new bo0(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo19473c(double d, int i);

    /* renamed from: d */
    public abstract void mo19474d(double d, double[] dArr);

    /* renamed from: e */
    public abstract void mo19475e(double d, float[] fArr);

    /* renamed from: f */
    public abstract double mo19476f(double d, int i);

    /* renamed from: g */
    public abstract void mo19477g(double d, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo19478h();
}
