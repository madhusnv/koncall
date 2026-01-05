package p001o;

import com.google.firebase.perf.util.Constants;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class hzf {

    /* renamed from: a */
    public final int f27833a;

    /* renamed from: b */
    public final int f27834b;

    /* renamed from: c */
    public final float f27835c;

    /* renamed from: d */
    public final float f27836d;

    /* renamed from: e */
    public final float f27837e;

    /* renamed from: f */
    public final int f27838f;

    /* renamed from: g */
    public final int f27839g;

    /* renamed from: h */
    public final int f27840h;

    /* renamed from: i */
    public final short[] f27841i;

    /* renamed from: j */
    public short[] f27842j;

    /* renamed from: k */
    public int f27843k;

    /* renamed from: l */
    public short[] f27844l;

    /* renamed from: m */
    public int f27845m;

    /* renamed from: n */
    public short[] f27846n;

    /* renamed from: o */
    public int f27847o;

    /* renamed from: p */
    public int f27848p;

    /* renamed from: q */
    public int f27849q;

    /* renamed from: r */
    public int f27850r;

    /* renamed from: s */
    public int f27851s;

    /* renamed from: t */
    public int f27852t;

    /* renamed from: u */
    public int f27853u;

    /* renamed from: v */
    public int f27854v;

    public hzf(int i, int i2, float f, float f2, int i3) {
        this.f27833a = i;
        this.f27834b = i2;
        this.f27835c = f;
        this.f27836d = f2;
        this.f27837e = i / i3;
        this.f27838f = i / 400;
        int i4 = i / 65;
        this.f27839g = i4;
        int i5 = i4 * 2;
        this.f27840h = i5;
        this.f27841i = new short[i5];
        this.f27842j = new short[i5 * i2];
        this.f27844l = new short[i5 * i2];
        this.f27846n = new short[i5 * i2];
    }

    /* renamed from: p */
    public static void m31301p(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void m31302a(float f, int i) {
        int i2;
        int i3;
        if (this.f27845m == i) {
            return;
        }
        int i4 = this.f27833a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        m31316o(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f27847o;
            if (i6 >= i7 - 1) {
                m31321u(i7 - 1);
                return;
            }
            while (true) {
                i2 = this.f27848p;
                int i8 = (i2 + 1) * i5;
                i3 = this.f27849q;
                if (i8 <= i3 * i4) {
                    break;
                }
                this.f27844l = m31307f(this.f27844l, this.f27845m, 1);
                int i9 = 0;
                while (true) {
                    int i10 = this.f27834b;
                    if (i9 < i10) {
                        this.f27844l[(this.f27845m * i10) + i9] = m31315n(this.f27846n, (i10 * i6) + i9, i4, i5);
                        i9++;
                    }
                }
                this.f27849q++;
                this.f27845m++;
            }
            int i11 = i2 + 1;
            this.f27848p = i11;
            if (i11 == i4) {
                this.f27848p = 0;
                op0.m42517g(i3 == i5);
                this.f27849q = 0;
            }
            i6++;
        }
    }

    /* renamed from: b */
    public final void m31303b(float f) {
        int iM31323w;
        int i = this.f27843k;
        if (i < this.f27840h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f27850r > 0) {
                iM31323w = m31304c(i2);
            } else {
                int iM31308g = m31308g(this.f27842j, i2);
                iM31323w = ((double) f) > 1.0d ? iM31308g + m31323w(this.f27842j, i2, f, iM31308g) : m31314m(this.f27842j, i2, f, iM31308g);
            }
            i2 += iM31323w;
        } while (this.f27840h + i2 <= i);
        m31322v(i2);
    }

    /* renamed from: c */
    public final int m31304c(int i) {
        int iMin = Math.min(this.f27840h, this.f27850r);
        m31305d(this.f27842j, i, iMin);
        this.f27850r -= iMin;
        return iMin;
    }

    /* renamed from: d */
    public final void m31305d(short[] sArr, int i, int i2) {
        short[] sArrM31307f = m31307f(this.f27844l, this.f27845m, i2);
        this.f27844l = sArrM31307f;
        int i3 = this.f27834b;
        System.arraycopy(sArr, i * i3, sArrM31307f, this.f27845m * i3, i3 * i2);
        this.f27845m += i2;
    }

    /* renamed from: e */
    public final void m31306e(short[] sArr, int i, int i2) {
        int i3 = this.f27840h / i2;
        int i4 = this.f27834b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f27841i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    public final short[] m31307f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f27834b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    public final int m31308g(short[] sArr, int i) {
        int iM31309h;
        int i2 = this.f27833a;
        int i3 = i2 > 4000 ? i2 / 4000 : 1;
        if (this.f27834b == 1 && i3 == 1) {
            iM31309h = m31309h(sArr, i, this.f27838f, this.f27839g);
        } else {
            m31306e(sArr, i, i3);
            int iM31309h2 = m31309h(this.f27841i, 0, this.f27838f / i3, this.f27839g / i3);
            if (i3 != 1) {
                int i4 = iM31309h2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.f27838f;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.f27839g;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.f27834b == 1) {
                    iM31309h = m31309h(sArr, i, i6, i7);
                } else {
                    m31306e(sArr, i, 1);
                    iM31309h = m31309h(this.f27841i, 0, i6, i7);
                }
            } else {
                iM31309h = iM31309h2;
            }
        }
        int i10 = m31317q(this.f27853u, this.f27854v) ? this.f27851s : iM31309h;
        this.f27852t = this.f27853u;
        this.f27851s = iM31309h;
        return i10;
    }

    /* renamed from: h */
    public final int m31309h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f27834b;
        int i5 = Constants.MAX_HOST_LENGTH;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f27853u = i6 / i7;
        this.f27854v = i8 / i5;
        return i7;
    }

    /* renamed from: i */
    public void m31310i() {
        this.f27843k = 0;
        this.f27845m = 0;
        this.f27847o = 0;
        this.f27848p = 0;
        this.f27849q = 0;
        this.f27850r = 0;
        this.f27851s = 0;
        this.f27852t = 0;
        this.f27853u = 0;
        this.f27854v = 0;
    }

    /* renamed from: j */
    public void m31311j(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f27834b, this.f27845m);
        shortBuffer.put(this.f27844l, 0, this.f27834b * iMin);
        int i = this.f27845m - iMin;
        this.f27845m = i;
        short[] sArr = this.f27844l;
        int i2 = this.f27834b;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    /* renamed from: k */
    public int m31312k() {
        return this.f27845m * this.f27834b * 2;
    }

    /* renamed from: l */
    public int m31313l() {
        return this.f27843k * this.f27834b * 2;
    }

    /* renamed from: m */
    public final int m31314m(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f27850r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArrM31307f = m31307f(this.f27844l, this.f27845m, i4);
        this.f27844l = sArrM31307f;
        int i5 = this.f27834b;
        System.arraycopy(sArr, i * i5, sArrM31307f, this.f27845m * i5, i5 * i2);
        m31301p(i3, this.f27834b, this.f27844l, this.f27845m + i2, sArr, i + i2, sArr, i);
        this.f27845m += i4;
        return i3;
    }

    /* renamed from: n */
    public final short m31315n(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f27834b];
        int i4 = this.f27849q * i2;
        int i5 = this.f27848p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: o */
    public final void m31316o(int i) {
        int i2 = this.f27845m - i;
        short[] sArrM31307f = m31307f(this.f27846n, this.f27847o, i2);
        this.f27846n = sArrM31307f;
        short[] sArr = this.f27844l;
        int i3 = this.f27834b;
        System.arraycopy(sArr, i * i3, sArrM31307f, this.f27847o * i3, i3 * i2);
        this.f27845m = i;
        this.f27847o += i2;
    }

    /* renamed from: q */
    public final boolean m31317q(int i, int i2) {
        return i != 0 && this.f27851s != 0 && i2 <= i * 3 && i * 2 > this.f27852t * 3;
    }

    /* renamed from: r */
    public final void m31318r() {
        int i = this.f27845m;
        float f = this.f27835c;
        float f2 = this.f27836d;
        float f3 = f / f2;
        float f4 = this.f27837e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            m31303b(f3);
        } else {
            m31305d(this.f27842j, 0, this.f27843k);
            this.f27843k = 0;
        }
        if (f4 != 1.0f) {
            m31302a(f4, i);
        }
    }

    /* renamed from: s */
    public void m31319s() {
        int i;
        int i2 = this.f27843k;
        float f = this.f27835c;
        float f2 = this.f27836d;
        int i3 = this.f27845m + ((int) ((((i2 / (f / f2)) + this.f27847o) / (this.f27837e * f2)) + 0.5f));
        this.f27842j = m31307f(this.f27842j, i2, (this.f27840h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f27840h;
            int i5 = this.f27834b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f27842j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f27843k += i * 2;
        m31318r();
        if (this.f27845m > i3) {
            this.f27845m = i3;
        }
        this.f27843k = 0;
        this.f27850r = 0;
        this.f27847o = 0;
    }

    /* renamed from: t */
    public void m31320t(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f27834b;
        int i2 = iRemaining / i;
        short[] sArrM31307f = m31307f(this.f27842j, this.f27843k, i2);
        this.f27842j = sArrM31307f;
        shortBuffer.get(sArrM31307f, this.f27843k * this.f27834b, ((i * i2) * 2) / 2);
        this.f27843k += i2;
        m31318r();
    }

    /* renamed from: u */
    public final void m31321u(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f27846n;
        int i2 = this.f27834b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f27847o - i) * i2);
        this.f27847o -= i;
    }

    /* renamed from: v */
    public final void m31322v(int i) {
        int i2 = this.f27843k - i;
        short[] sArr = this.f27842j;
        int i3 = this.f27834b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f27843k = i2;
    }

    /* renamed from: w */
    public final int m31323w(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f27850r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] sArrM31307f = m31307f(this.f27844l, this.f27845m, i3);
        this.f27844l = sArrM31307f;
        m31301p(i3, this.f27834b, sArrM31307f, this.f27845m, sArr, i, sArr, i + i2);
        this.f27845m += i3;
        return i3;
    }
}
