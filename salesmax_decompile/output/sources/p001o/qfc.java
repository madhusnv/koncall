package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class qfc {

    /* renamed from: c */
    public double[] f41825c;

    /* renamed from: d */
    public String f41826d;

    /* renamed from: e */
    public olb f41827e;

    /* renamed from: f */
    public int f41828f;

    /* renamed from: a */
    public float[] f41823a = new float[0];

    /* renamed from: b */
    public double[] f41824b = new double[0];

    /* renamed from: g */
    public double f41829g = 6.283185307179586d;

    /* renamed from: h */
    public boolean f41830h = false;

    /* renamed from: a */
    public void m45358a(double d, float f) {
        int length = this.f41823a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f41824b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f41824b = Arrays.copyOf(this.f41824b, length);
        this.f41823a = Arrays.copyOf(this.f41823a, length);
        this.f41825c = new double[length];
        double[] dArr = this.f41824b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f41824b[iBinarySearch] = d;
        this.f41823a[iBinarySearch] = f;
        this.f41830h = false;
    }

    /* renamed from: b */
    public double m45359b(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f41824b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f41823a;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.f41824b;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return (d * d5) + (f2 - (d5 * d4));
    }

    /* renamed from: c */
    public double m45360c(double d) {
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f41824b, d);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f41823a;
        float f = fArr[iBinarySearch];
        int i = iBinarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.f41824b;
        double d3 = dArr[iBinarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return this.f41825c[i] + ((f2 - (d5 * d4)) * (d - d4)) + ((d5 * ((d * d) - (d4 * d4))) / 2.0d);
    }

    /* renamed from: d */
    public double m45361d(double d, double d2, double d3) {
        double dM45360c = d2 + m45360c(d);
        double dM45359b = m45359b(d) + d3;
        switch (this.f41828f) {
            case 1:
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            case 2:
                return dM45359b * 4.0d * Math.signum((((dM45360c * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dM45359b * 2.0d;
            case 4:
                return (-dM45359b) * 2.0d;
            case 5:
                double d4 = this.f41829g;
                return (-d4) * dM45359b * Math.sin(d4 * dM45360c);
            case 6:
                return dM45359b * 4.0d * ((((dM45360c * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f41827e.mo19476f(dM45360c % 1.0d, 0);
            default:
                double d5 = this.f41829g;
                return dM45359b * d5 * Math.cos(d5 * dM45360c);
        }
    }

    /* renamed from: e */
    public double m45362e(double d, double d2) {
        double dAbs;
        double dM45360c = m45360c(d) + d2;
        switch (this.f41828f) {
            case 1:
                return Math.signum(0.5d - (dM45360c % 1.0d));
            case 2:
                dAbs = Math.abs((((dM45360c * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dM45360c * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dM45360c * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f41829g * (d2 + dM45360c));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dM45360c * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f41827e.mo19473c(dM45360c % 1.0d, 0);
            default:
                return Math.sin(this.f41829g * dM45360c);
        }
        return 1.0d - dAbs;
    }

    /* renamed from: f */
    public void m45363f() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            if (i >= this.f41823a.length) {
                break;
            }
            d += r6[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr = this.f41823a;
            if (i2 >= fArr.length) {
                break;
            }
            int i3 = i2 - 1;
            float f = (fArr[i3] + fArr[i2]) / 2.0f;
            double[] dArr = this.f41824b;
            d2 += (dArr[i2] - dArr[i3]) * f;
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr2 = this.f41823a;
            if (i4 >= fArr2.length) {
                break;
            }
            fArr2[i4] = fArr2[i4] * ((float) (d / d2));
            i4++;
        }
        this.f41825c[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr3 = this.f41823a;
            if (i5 >= fArr3.length) {
                this.f41830h = true;
                return;
            }
            int i6 = i5 - 1;
            float f2 = (fArr3[i6] + fArr3[i5]) / 2.0f;
            double[] dArr2 = this.f41824b;
            double d3 = dArr2[i5] - dArr2[i6];
            double[] dArr3 = this.f41825c;
            dArr3[i5] = dArr3[i6] + (d3 * f2);
            i5++;
        }
    }

    /* renamed from: g */
    public void m45364g(int i, String str) {
        this.f41828f = i;
        this.f41826d = str;
        if (str != null) {
            this.f41827e = olb.m42391i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f41824b) + " period=" + Arrays.toString(this.f41823a);
    }
}
