package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class olb extends rd4 {

    /* renamed from: a */
    public double[] f38543a;

    /* renamed from: b */
    public double[][] f38544b;

    /* renamed from: c */
    public double[][] f38545c;

    /* renamed from: d */
    public boolean f38546d = true;

    /* renamed from: e */
    public double[] f38547e;

    public olb(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f38547e = new double[length2];
        int i = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr[i4] - dArr[i3];
                double[] dArr5 = dArr3[i3];
                double d2 = (dArr2[i4][i2] - dArr2[i3][i2]) / d;
                dArr5[i2] = d2;
                if (i3 == 0) {
                    dArr4[i3][i2] = d2;
                } else {
                    dArr4[i3][i2] = (dArr3[i3 - 1][i2] + d2) * 0.5d;
                }
                i3 = i4;
            }
            dArr4[i][i2] = dArr3[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d3 = dArr3[i5][i6];
                if (d3 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dArr4[i5][i6] = 0.0d;
                    dArr4[i5 + 1][i6] = 0.0d;
                } else {
                    double d4 = dArr4[i5][i6] / d3;
                    int i7 = i5 + 1;
                    double d5 = dArr4[i7][i6] / d3;
                    double dHypot = Math.hypot(d4, d5);
                    if (dHypot > 9.0d) {
                        double d6 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i5];
                        double[] dArr7 = dArr3[i5];
                        dArr6[i6] = d4 * d6 * dArr7[i6];
                        dArr4[i7][i6] = d6 * d5 * dArr7[i6];
                    }
                }
            }
        }
        this.f38543a = dArr;
        this.f38544b = dArr2;
        this.f38545c = dArr4;
    }

    /* renamed from: i */
    public static olb m42391i(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return m42392j(Arrays.copyOf(dArr, i + 1));
    }

    /* renamed from: j */
    public static olb m42392j(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = i * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        return new olb(dArr3, dArr2);
    }

    /* renamed from: k */
    public static double m42393k(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 3.0d * d;
        return ((((((((((-6.0d) * d7) * d4) + (d8 * d4)) + ((6.0d * d7) * d3)) - (d8 * d3)) + ((d9 * d6) * d7)) + ((d9 * d5) * d7)) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2)) + (d * d5);
    }

    /* renamed from: l */
    public static double m42394l(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = ((((((-2.0d) * d8) * d4) + (d9 * d4)) + ((d8 * 2.0d) * d3)) - (d9 * d3)) + d3;
        double d11 = d * d6;
        double d12 = d * d5;
        return ((((d10 + (d11 * d8)) + (d8 * d12)) - (d11 * d7)) - (((d * 2.0d) * d5) * d7)) + (d12 * d2);
    }

    @Override // p001o.rd4
    /* renamed from: c */
    public double mo19473c(double d, int i) {
        double d2;
        double d3;
        double dMo19476f;
        double[] dArr = this.f38543a;
        int length = dArr.length;
        int i2 = 0;
        if (this.f38546d) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.f38544b[0][i];
                d3 = d - d4;
                dMo19476f = mo19476f(d4, i);
            } else {
                int i3 = length - 1;
                double d5 = dArr[i3];
                if (d >= d5) {
                    d2 = this.f38544b[i3][i];
                    d3 = d - d5;
                    dMo19476f = mo19476f(d5, i);
                }
            }
            return d2 + (d3 * dMo19476f);
        }
        if (d <= dArr[0]) {
            return this.f38544b[0][i];
        }
        int i4 = length - 1;
        if (d >= dArr[i4]) {
            return this.f38544b[i4][i];
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f38543a;
            double d6 = dArr2[i2];
            if (d == d6) {
                return this.f38544b[i2][i];
            }
            int i5 = i2 + 1;
            double d7 = dArr2[i5];
            if (d < d7) {
                double d8 = d7 - d6;
                double d9 = (d - d6) / d8;
                double[][] dArr3 = this.f38544b;
                double d10 = dArr3[i2][i];
                double d11 = dArr3[i5][i];
                double[][] dArr4 = this.f38545c;
                return m42394l(d8, d9, d10, d11, dArr4[i2][i], dArr4[i5][i]);
            }
            i2 = i5;
        }
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p001o.rd4
    /* renamed from: d */
    public void mo19474d(double d, double[] dArr) {
        double[] dArr2 = this.f38543a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f38544b[0].length;
        if (this.f38546d) {
            double d2 = dArr2[0];
            if (d <= d2) {
                mo19477g(d2, this.f38547e);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f38544b[0][i2] + ((d - this.f38543a[0]) * this.f38547e[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                mo19477g(d3, this.f38547e);
                while (i < length2) {
                    dArr[i] = this.f38544b[i3][i] + ((d - this.f38543a[i3]) * this.f38547e[i]);
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr2[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    dArr[i4] = this.f38544b[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f38544b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f38543a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f38544b[i6][i7];
                }
            }
            double[] dArr3 = this.f38543a;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr4 = this.f38544b;
                    double d8 = dArr4[i6][i];
                    double d9 = dArr4[i8][i];
                    double[][] dArr5 = this.f38545c;
                    dArr[i] = m42394l(d6, d7, d8, d9, dArr5[i6][i], dArr5[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // p001o.rd4
    /* renamed from: e */
    public void mo19475e(double d, float[] fArr) {
        double[] dArr = this.f38543a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f38544b[0].length;
        if (this.f38546d) {
            double d2 = dArr[0];
            if (d <= d2) {
                mo19477g(d2, this.f38547e);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f38544b[0][i2] + ((d - this.f38543a[0]) * this.f38547e[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                mo19477g(d3, this.f38547e);
                while (i < length2) {
                    fArr[i] = (float) (this.f38544b[i3][i] + ((d - this.f38543a[i3]) * this.f38547e[i]));
                    i++;
                }
                return;
            }
        } else {
            if (d <= dArr[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    fArr[i4] = (float) this.f38544b[0][i4];
                }
                return;
            }
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f38544b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f38543a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f38544b[i6][i7];
                }
            }
            double[] dArr2 = this.f38543a;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double[][] dArr3 = this.f38544b;
                    double d8 = dArr3[i6][i];
                    double d9 = dArr3[i8][i];
                    double[][] dArr4 = this.f38545c;
                    fArr[i] = (float) m42394l(d6, d7, d8, d9, dArr4[i6][i], dArr4[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // p001o.rd4
    /* renamed from: f */
    public double mo19476f(double d, int i) {
        double[] dArr = this.f38543a;
        int length = dArr.length;
        int i2 = 0;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f38543a;
            int i3 = i2 + 1;
            double d3 = dArr2[i3];
            if (d2 <= d3) {
                double d4 = dArr2[i2];
                double d5 = d3 - d4;
                double[][] dArr3 = this.f38544b;
                double d6 = dArr3[i2][i];
                double d7 = dArr3[i3][i];
                double[][] dArr4 = this.f38545c;
                return m42393k(d5, (d2 - d4) / d5, d6, d7, dArr4[i2][i], dArr4[i3][i]) / d5;
            }
            i2 = i3;
        }
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // p001o.rd4
    /* renamed from: g */
    public void mo19477g(double d, double[] dArr) {
        double[] dArr2 = this.f38543a;
        int length = dArr2.length;
        int length2 = this.f38544b[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            double[] dArr3 = this.f38543a;
            int i2 = i + 1;
            double d3 = dArr3[i2];
            if (d2 <= d3) {
                double d4 = dArr3[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double[][] dArr4 = this.f38544b;
                    double d7 = dArr4[i][i3];
                    double d8 = dArr4[i2][i3];
                    double[][] dArr5 = this.f38545c;
                    dArr[i3] = m42393k(d5, d6, d7, d8, dArr5[i][i3], dArr5[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // p001o.rd4
    /* renamed from: h */
    public double[] mo19478h() {
        return this.f38543a;
    }
}
