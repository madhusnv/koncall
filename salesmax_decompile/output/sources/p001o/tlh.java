package p001o;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public abstract class tlh {

    /* renamed from: k */
    public static float f47392k = 6.2831855f;

    /* renamed from: a */
    public rd4 f47393a;

    /* renamed from: e */
    public int f47397e;

    /* renamed from: f */
    public String f47398f;

    /* renamed from: i */
    public long f47401i;

    /* renamed from: b */
    public int f47394b = 0;

    /* renamed from: c */
    public int[] f47395c = new int[10];

    /* renamed from: d */
    public float[][] f47396d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g */
    public float[] f47399g = new float[3];

    /* renamed from: h */
    public boolean f47400h = false;

    /* renamed from: j */
    public float f47402j = Float.NaN;

    /* renamed from: o.tlh$a */
    public static class C17155a {
        /* renamed from: a */
        public static void m50178a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int iM50179b = m50179b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = iM50179b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = iM50179b + 1;
                }
            }
        }

        /* renamed from: b */
        public static int m50179b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m50180c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m50180c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m50180c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: a */
    public float m50175a(float f) {
        float fAbs;
        switch (this.f47394b) {
            case 1:
                return Math.signum(f * f47392k);
            case 2:
                fAbs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * f47392k);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f * f47392k);
        }
        return 1.0f - fAbs;
    }

    /* renamed from: b */
    public void mo42827b(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f47395c;
        int i3 = this.f47397e;
        iArr[i3] = i;
        float[] fArr = this.f47396d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f47394b = Math.max(this.f47394b, i2);
        this.f47397e++;
    }

    /* renamed from: c */
    public void m50176c(long j) {
        this.f47401i = j;
    }

    /* renamed from: d */
    public void m50177d(String str) {
        this.f47398f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo42828e(int i) {
        int i2 = this.f47397e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f47398f);
            return;
        }
        C17155a.m50178a(this.f47395c, this.f47396d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f47395c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f47397e; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f47395c;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = this.f47395c[i6] * 0.01d;
                    double[] dArr3 = dArr2[i5];
                    float[] fArr = this.f47396d[i6];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i5++;
                }
            }
        }
        this.f47393a = rd4.m46542a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f47398f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f47397e; i++) {
            str = str + "[" + this.f47395c[i] + " , " + decimalFormat.format(this.f47396d[i]) + "] ";
        }
        return str;
    }
}
