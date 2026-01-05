package p001o;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class v0g {

    /* renamed from: a */
    public rd4 f49728a;

    /* renamed from: b */
    public int[] f49729b = new int[10];

    /* renamed from: c */
    public float[] f49730c = new float[10];

    /* renamed from: d */
    public int f49731d;

    /* renamed from: e */
    public String f49732e;

    /* renamed from: o.v0g$a */
    public static class C17490a {
        /* renamed from: a */
        public static void m52205a(int[] iArr, float[] fArr, int i, int i2) {
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
                    int iM52206b = m52206b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = iM52206b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = iM52206b + 1;
                }
            }
        }

        /* renamed from: b */
        public static int m52206b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m52207c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m52207c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m52207c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: a */
    public float m52202a(float f) {
        return (float) this.f49728a.mo19473c(f, 0);
    }

    /* renamed from: b */
    public float m52203b(float f) {
        return (float) this.f49728a.mo19476f(f, 0);
    }

    /* renamed from: c */
    public void mo31331c(int i, float f) {
        int[] iArr = this.f49729b;
        if (iArr.length < this.f49731d + 1) {
            this.f49729b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f49730c;
            this.f49730c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f49729b;
        int i2 = this.f49731d;
        iArr2[i2] = i;
        this.f49730c[i2] = f;
        this.f49731d = i2 + 1;
    }

    /* renamed from: d */
    public void m52204d(String str) {
        this.f49732e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo31332e(int i) {
        int i2 = this.f49731d;
        if (i2 == 0) {
            return;
        }
        C17490a.m52205a(this.f49729b, this.f49730c, 0, i2 - 1);
        int i3 = 1;
        for (int i4 = 1; i4 < this.f49731d; i4++) {
            int[] iArr = this.f49729b;
            if (iArr[i4 - 1] != iArr[i4]) {
                i3++;
            }
        }
        double[] dArr = new double[i3];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i3, 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f49731d; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f49729b;
                if (iArr2[i6] != iArr2[i6 - 1]) {
                    dArr[i5] = this.f49729b[i6] * 0.01d;
                    dArr2[i5][0] = this.f49730c[i6];
                    i5++;
                }
            }
        }
        this.f49728a = rd4.m46542a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f49732e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f49731d; i++) {
            str = str + "[" + this.f49729b[i] + " , " + decimalFormat.format(this.f49730c[i]) + "] ";
        }
        return str;
    }
}
