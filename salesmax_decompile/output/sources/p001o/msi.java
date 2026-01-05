package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class msi {

    /* renamed from: a */
    public long[] f35932a;

    /* renamed from: b */
    public float[] f35933b = new float[20];

    /* renamed from: c */
    public int f35934c = 0;

    public msi() {
        long[] jArr = new long[20];
        this.f35932a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    /* renamed from: a */
    public void m39627a(long j, float f) {
        int i = (this.f35934c + 1) % 20;
        this.f35934c = i;
        this.f35932a[i] = j;
        this.f35933b[i] = f;
    }

    /* renamed from: b */
    public float m39628b() {
        float fM39629c;
        int i = this.f35934c;
        if (i == 0 && this.f35932a[i] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j = this.f35932a[i];
        int i2 = 0;
        long j2 = j;
        while (true) {
            long j3 = this.f35932a[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            }
            float f = j - j3;
            float fAbs = Math.abs(j3 - j2);
            if (f > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            j2 = j3;
        }
        if (i2 < 2) {
            return 0.0f;
        }
        if (i2 == 2) {
            int i3 = this.f35934c;
            int i4 = i3 == 0 ? 19 : i3 - 1;
            long[] jArr = this.f35932a;
            float f2 = jArr[i3] - jArr[i4];
            if (f2 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f35933b;
            fM39629c = (fArr[i3] - fArr[i4]) / f2;
        } else {
            int i5 = this.f35934c;
            int i6 = (((i5 - i2) + 20) + 1) % 20;
            int i7 = ((i5 + 1) + 20) % 20;
            long j4 = this.f35932a[i6];
            float f3 = this.f35933b[i6];
            int i8 = i6 + 1;
            float fM39629c2 = 0.0f;
            for (int i9 = i8 % 20; i9 != i7; i9 = (i9 + 1) % 20) {
                long j5 = this.f35932a[i9];
                float f4 = j5 - j4;
                if (f4 != 0.0f) {
                    float f5 = this.f35933b[i9];
                    float f6 = (f5 - f3) / f4;
                    fM39629c2 += (f6 - m39629c(fM39629c2)) * Math.abs(f6);
                    if (i9 == i8) {
                        fM39629c2 *= 0.5f;
                    }
                    f3 = f5;
                    j4 = j5;
                }
            }
            fM39629c = m39629c(fM39629c2);
        }
        return fM39629c * 1000.0f;
    }

    /* renamed from: c */
    public final float m39629c(float f) {
        return (float) (Math.signum(f) * Math.sqrt(Math.abs(f) * 2.0f));
    }
}
