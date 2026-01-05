package p001o;

import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f4e {

    /* renamed from: a */
    public int[] f22664a;

    /* renamed from: b */
    public int[] f22665b;

    /* renamed from: c */
    public int[] f22666c;

    /* renamed from: d */
    public int[] f22667d;

    /* renamed from: e */
    public double[] f22668e;

    /* renamed from: f */
    public C13325b[] f22669f;

    /* renamed from: o.f4e$b */
    public static final class C13325b {

        /* renamed from: a */
        public int f22670a;

        /* renamed from: b */
        public int f22671b;

        /* renamed from: c */
        public int f22672c;

        /* renamed from: d */
        public int f22673d;

        /* renamed from: e */
        public int f22674e;

        /* renamed from: f */
        public int f22675f;

        /* renamed from: g */
        public int f22676g;

        public C13325b() {
            this.f22670a = 0;
            this.f22671b = 0;
            this.f22672c = 0;
            this.f22673d = 0;
            this.f22674e = 0;
            this.f22675f = 0;
            this.f22676g = 0;
        }
    }

    /* renamed from: o.f4e$c */
    public static final class C13326c {

        /* renamed from: a */
        public int f22677a;

        public C13326c(int i, int i2) {
            this.f22677a = i2;
        }
    }

    /* renamed from: o.f4e$d */
    public enum EnumC13327d {
        RED,
        GREEN,
        BLUE
    }

    /* renamed from: o.f4e$e */
    public static final class C13328e {

        /* renamed from: a */
        public int f22678a;

        /* renamed from: b */
        public double f22679b;

        public C13328e(int i, double d) {
            this.f22678a = i;
            this.f22679b = d;
        }
    }

    /* renamed from: a */
    public static int m26056a(C13325b c13325b, EnumC13327d enumC13327d, int[] iArr) {
        int i;
        int i2;
        int iOrdinal = enumC13327d.ordinal();
        if (iOrdinal == 0) {
            i = (-iArr[m26057g(c13325b.f22670a, c13325b.f22673d, c13325b.f22675f)]) + iArr[m26057g(c13325b.f22670a, c13325b.f22673d, c13325b.f22674e)] + iArr[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22675f)];
            i2 = iArr[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22674e)];
        } else if (iOrdinal == 1) {
            i = (-iArr[m26057g(c13325b.f22671b, c13325b.f22672c, c13325b.f22675f)]) + iArr[m26057g(c13325b.f22671b, c13325b.f22672c, c13325b.f22674e)] + iArr[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22675f)];
            i2 = iArr[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22674e)];
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("unexpected direction " + enumC13327d);
            }
            i = (-iArr[m26057g(c13325b.f22671b, c13325b.f22673d, c13325b.f22674e)]) + iArr[m26057g(c13325b.f22671b, c13325b.f22672c, c13325b.f22674e)] + iArr[m26057g(c13325b.f22670a, c13325b.f22673d, c13325b.f22674e)];
            i2 = iArr[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22674e)];
        }
        return i - i2;
    }

    /* renamed from: g */
    public static int m26057g(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    /* renamed from: j */
    public static int m26058j(C13325b c13325b, EnumC13327d enumC13327d, int i, int[] iArr) {
        int i2;
        int i3;
        int iOrdinal = enumC13327d.ordinal();
        if (iOrdinal == 0) {
            i2 = (iArr[m26057g(i, c13325b.f22673d, c13325b.f22675f)] - iArr[m26057g(i, c13325b.f22673d, c13325b.f22674e)]) - iArr[m26057g(i, c13325b.f22672c, c13325b.f22675f)];
            i3 = iArr[m26057g(i, c13325b.f22672c, c13325b.f22674e)];
        } else if (iOrdinal == 1) {
            i2 = (iArr[m26057g(c13325b.f22671b, i, c13325b.f22675f)] - iArr[m26057g(c13325b.f22671b, i, c13325b.f22674e)]) - iArr[m26057g(c13325b.f22670a, i, c13325b.f22675f)];
            i3 = iArr[m26057g(c13325b.f22670a, i, c13325b.f22674e)];
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("unexpected direction " + enumC13327d);
            }
            i2 = (iArr[m26057g(c13325b.f22671b, c13325b.f22673d, i)] - iArr[m26057g(c13325b.f22671b, c13325b.f22672c, i)]) - iArr[m26057g(c13325b.f22670a, c13325b.f22673d, i)];
            i3 = iArr[m26057g(c13325b.f22670a, c13325b.f22672c, i)];
        }
        return i2 + i3;
    }

    /* renamed from: l */
    public static int m26059l(C13325b c13325b, int[] iArr) {
        return ((((((iArr[m26057g(c13325b.f22671b, c13325b.f22673d, c13325b.f22675f)] - iArr[m26057g(c13325b.f22671b, c13325b.f22673d, c13325b.f22674e)]) - iArr[m26057g(c13325b.f22671b, c13325b.f22672c, c13325b.f22675f)]) + iArr[m26057g(c13325b.f22671b, c13325b.f22672c, c13325b.f22674e)]) - iArr[m26057g(c13325b.f22670a, c13325b.f22673d, c13325b.f22675f)]) + iArr[m26057g(c13325b.f22670a, c13325b.f22673d, c13325b.f22674e)]) + iArr[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22675f)]) - iArr[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22674e)];
    }

    /* renamed from: b */
    public void m26060b(Map map) {
        this.f22664a = new int[35937];
        this.f22665b = new int[35937];
        this.f22666c = new int[35937];
        this.f22667d = new int[35937];
        this.f22668e = new double[35937];
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int iM39105o = mi3.m39105o(iIntValue);
            int iM39098h = mi3.m39098h(iIntValue);
            int iM39096f = mi3.m39096f(iIntValue);
            int iM26057g = m26057g((iM39105o >> 3) + 1, (iM39098h >> 3) + 1, (iM39096f >> 3) + 1);
            int[] iArr = this.f22664a;
            iArr[iM26057g] = iArr[iM26057g] + iIntValue2;
            int[] iArr2 = this.f22665b;
            iArr2[iM26057g] = iArr2[iM26057g] + (iM39105o * iIntValue2);
            int[] iArr3 = this.f22666c;
            iArr3[iM26057g] = iArr3[iM26057g] + (iM39098h * iIntValue2);
            int[] iArr4 = this.f22667d;
            iArr4[iM26057g] = iArr4[iM26057g] + (iM39096f * iIntValue2);
            double[] dArr = this.f22668e;
            dArr[iM26057g] = dArr[iM26057g] + (iIntValue2 * ((iM39105o * iM39105o) + (iM39098h * iM39098h) + (iM39096f * iM39096f)));
        }
    }

    /* renamed from: c */
    public C13326c m26061c(int i) {
        int i2;
        this.f22669f = new C13325b[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f22669f[i3] = new C13325b();
        }
        double[] dArr = new double[i];
        C13325b c13325b = this.f22669f[0];
        c13325b.f22671b = 32;
        c13325b.f22673d = 32;
        c13325b.f22675f = 32;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            if (i5 >= i) {
                i2 = i;
                break;
            }
            C13325b[] c13325bArr = this.f22669f;
            if (m26064f(c13325bArr[i4], c13325bArr[i5]).booleanValue()) {
                C13325b c13325b2 = this.f22669f[i4];
                dArr[i4] = c13325b2.f22676g > 1 ? m26067k(c13325b2) : 0.0d;
                C13325b c13325b3 = this.f22669f[i5];
                dArr[i5] = c13325b3.f22676g > 1 ? m26067k(c13325b3) : 0.0d;
            } else {
                dArr[i4] = 0.0d;
                i5--;
            }
            double d = dArr[0];
            int i6 = 0;
            for (int i7 = 1; i7 <= i5; i7++) {
                double d2 = dArr[i7];
                if (d2 > d) {
                    i6 = i7;
                    d = d2;
                }
            }
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                i2 = i5 + 1;
                break;
            }
            i5++;
            i4 = i6;
        }
        return new C13326c(i, i2);
    }

    /* renamed from: d */
    public void m26062d() {
        int i = 1;
        while (true) {
            int i2 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i3 = 1;
            while (i3 < i2) {
                int i4 = 0;
                int i5 = 0;
                double d = 0.0d;
                int i6 = 1;
                int i7 = 0;
                int i8 = 0;
                while (i6 < i2) {
                    int iM26057g = m26057g(i, i3, i6);
                    int i9 = i4 + this.f22664a[iM26057g];
                    i7 += this.f22665b[iM26057g];
                    i8 += this.f22666c[iM26057g];
                    i5 += this.f22667d[iM26057g];
                    d += this.f22668e[iM26057g];
                    iArr[i6] = iArr[i6] + i9;
                    iArr2[i6] = iArr2[i6] + i7;
                    iArr3[i6] = iArr3[i6] + i8;
                    iArr4[i6] = iArr4[i6] + i5;
                    dArr[i6] = dArr[i6] + d;
                    int iM26057g2 = m26057g(i - 1, i3, i6);
                    int[] iArr5 = this.f22664a;
                    iArr5[iM26057g] = iArr5[iM26057g2] + iArr[i6];
                    int[] iArr6 = this.f22665b;
                    iArr6[iM26057g] = iArr6[iM26057g2] + iArr2[i6];
                    int[] iArr7 = this.f22666c;
                    iArr7[iM26057g] = iArr7[iM26057g2] + iArr3[i6];
                    int[] iArr8 = this.f22667d;
                    iArr8[iM26057g] = iArr8[iM26057g2] + iArr4[i6];
                    double[] dArr2 = this.f22668e;
                    dArr2[iM26057g] = dArr2[iM26057g2] + dArr[i6];
                    i6++;
                    i4 = i9;
                    i2 = 33;
                }
                i3++;
                i2 = 33;
            }
            i++;
        }
    }

    /* renamed from: e */
    public List m26063e(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C13325b c13325b = this.f22669f[i2];
            int iM26059l = m26059l(c13325b, this.f22664a);
            if (iM26059l > 0) {
                int iM26059l2 = m26059l(c13325b, this.f22665b) / iM26059l;
                int iM26059l3 = m26059l(c13325b, this.f22666c) / iM26059l;
                int iM26059l4 = m26059l(c13325b, this.f22667d) / iM26059l;
                arrayList.add(Integer.valueOf((iM26059l4 & Constants.MAX_HOST_LENGTH) | ((iM26059l2 & Constants.MAX_HOST_LENGTH) << 16) | (-16777216) | ((iM26059l3 & Constants.MAX_HOST_LENGTH) << 8)));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public Boolean m26064f(C13325b c13325b, C13325b c13325b2) {
        int iM26059l = m26059l(c13325b, this.f22665b);
        int iM26059l2 = m26059l(c13325b, this.f22666c);
        int iM26059l3 = m26059l(c13325b, this.f22667d);
        int iM26059l4 = m26059l(c13325b, this.f22664a);
        EnumC13327d enumC13327d = EnumC13327d.RED;
        C13328e c13328eM26065h = m26065h(c13325b, enumC13327d, c13325b.f22670a + 1, c13325b.f22671b, iM26059l, iM26059l2, iM26059l3, iM26059l4);
        EnumC13327d enumC13327d2 = EnumC13327d.GREEN;
        C13328e c13328eM26065h2 = m26065h(c13325b, enumC13327d2, c13325b.f22672c + 1, c13325b.f22673d, iM26059l, iM26059l2, iM26059l3, iM26059l4);
        EnumC13327d enumC13327d3 = EnumC13327d.BLUE;
        C13328e c13328eM26065h3 = m26065h(c13325b, enumC13327d3, c13325b.f22674e + 1, c13325b.f22675f, iM26059l, iM26059l2, iM26059l3, iM26059l4);
        double d = c13328eM26065h.f22679b;
        double d2 = c13328eM26065h2.f22679b;
        double d3 = c13328eM26065h3.f22679b;
        if (d < d2 || d < d3) {
            enumC13327d = (d2 < d || d2 < d3) ? enumC13327d3 : enumC13327d2;
        } else if (c13328eM26065h.f22678a < 0) {
            return Boolean.FALSE;
        }
        c13325b2.f22671b = c13325b.f22671b;
        c13325b2.f22673d = c13325b.f22673d;
        c13325b2.f22675f = c13325b.f22675f;
        int iOrdinal = enumC13327d.ordinal();
        if (iOrdinal == 0) {
            int i = c13328eM26065h.f22678a;
            c13325b.f22671b = i;
            c13325b2.f22670a = i;
            c13325b2.f22672c = c13325b.f22672c;
            c13325b2.f22674e = c13325b.f22674e;
        } else if (iOrdinal == 1) {
            int i2 = c13328eM26065h2.f22678a;
            c13325b.f22673d = i2;
            c13325b2.f22670a = c13325b.f22670a;
            c13325b2.f22672c = i2;
            c13325b2.f22674e = c13325b.f22674e;
        } else if (iOrdinal == 2) {
            int i3 = c13328eM26065h3.f22678a;
            c13325b.f22675f = i3;
            c13325b2.f22670a = c13325b.f22670a;
            c13325b2.f22672c = c13325b.f22672c;
            c13325b2.f22674e = i3;
        }
        c13325b.f22676g = (c13325b.f22671b - c13325b.f22670a) * (c13325b.f22673d - c13325b.f22672c) * (c13325b.f22675f - c13325b.f22674e);
        c13325b2.f22676g = (c13325b2.f22671b - c13325b2.f22670a) * (c13325b2.f22673d - c13325b2.f22672c) * (c13325b2.f22675f - c13325b2.f22674e);
        return Boolean.TRUE;
    }

    /* renamed from: h */
    public C13328e m26065h(C13325b c13325b, EnumC13327d enumC13327d, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        f4e f4eVar = this;
        C13325b c13325b2 = c13325b;
        EnumC13327d enumC13327d2 = enumC13327d;
        int iM26056a = m26056a(c13325b2, enumC13327d2, f4eVar.f22665b);
        int iM26056a2 = m26056a(c13325b2, enumC13327d2, f4eVar.f22666c);
        int iM26056a3 = m26056a(c13325b2, enumC13327d2, f4eVar.f22667d);
        int iM26056a4 = m26056a(c13325b2, enumC13327d2, f4eVar.f22664a);
        int i8 = -1;
        double d = 0.0d;
        int i9 = i;
        while (i9 < i2) {
            int iM26058j = m26058j(c13325b2, enumC13327d2, i9, f4eVar.f22665b) + iM26056a;
            int iM26058j2 = m26058j(c13325b2, enumC13327d2, i9, f4eVar.f22666c) + iM26056a2;
            int iM26058j3 = m26058j(c13325b2, enumC13327d2, i9, f4eVar.f22667d) + iM26056a3;
            int iM26058j4 = m26058j(c13325b2, enumC13327d2, i9, f4eVar.f22664a) + iM26056a4;
            if (iM26058j4 == 0) {
                i7 = iM26056a;
            } else {
                i7 = iM26056a;
                double d2 = (((iM26058j * iM26058j) + (iM26058j2 * iM26058j2)) + (iM26058j3 * iM26058j3)) / iM26058j4;
                int i10 = i3 - iM26058j;
                int i11 = i4 - iM26058j2;
                int i12 = i5 - iM26058j3;
                int i13 = i6 - iM26058j4;
                if (i13 != 0) {
                    double d3 = d2 + ((((i10 * i10) + (i11 * i11)) + (i12 * i12)) / i13);
                    if (d3 > d) {
                        d = d3;
                        i8 = i9;
                    }
                }
            }
            i9++;
            f4eVar = this;
            c13325b2 = c13325b;
            enumC13327d2 = enumC13327d;
            iM26056a = i7;
        }
        return new C13328e(i8, d);
    }

    /* renamed from: i */
    public d4e m26066i(int[] iArr, int i) {
        m26060b(new c4e().m20197a(iArr, i).f19090a);
        m26062d();
        List listM26063e = m26063e(m26061c(i).f22677a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = listM26063e.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(((Integer) it.next()).intValue()), 0);
        }
        return new d4e(linkedHashMap);
    }

    /* renamed from: k */
    public double m26067k(C13325b c13325b) {
        int iM26059l = m26059l(c13325b, this.f22665b);
        int iM26059l2 = m26059l(c13325b, this.f22666c);
        int iM26059l3 = m26059l(c13325b, this.f22667d);
        return (((((((this.f22668e[m26057g(c13325b.f22671b, c13325b.f22673d, c13325b.f22675f)] - this.f22668e[m26057g(c13325b.f22671b, c13325b.f22673d, c13325b.f22674e)]) - this.f22668e[m26057g(c13325b.f22671b, c13325b.f22672c, c13325b.f22675f)]) + this.f22668e[m26057g(c13325b.f22671b, c13325b.f22672c, c13325b.f22674e)]) - this.f22668e[m26057g(c13325b.f22670a, c13325b.f22673d, c13325b.f22675f)]) + this.f22668e[m26057g(c13325b.f22670a, c13325b.f22673d, c13325b.f22674e)]) + this.f22668e[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22675f)]) - this.f22668e[m26057g(c13325b.f22670a, c13325b.f22672c, c13325b.f22674e)]) - ((((iM26059l * iM26059l) + (iM26059l2 * iM26059l2)) + (iM26059l3 * iM26059l3)) / m26059l(c13325b, this.f22664a));
    }
}
