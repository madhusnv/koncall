package p001o;

import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class h3e {

    /* renamed from: a */
    public static final h3e f26175a = new h3e();

    /* renamed from: b */
    public static final String f26176b = "xn--";

    /* renamed from: c */
    public static final zq1 f26177c = zq1.f57497d.m59707c("xn--");

    /* renamed from: a */
    public final int m29778a(int i, int i2, boolean z) {
        int i3 = z ? i / Constants.FROZEN_FRAME_TIME : i / 2;
        int i4 = i3 + (i3 / i2);
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return i5 + ((i4 * 36) / (i4 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* renamed from: b */
    public final List m29779b(String str, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            int iCharAt = str.charAt(i);
            if (qh2.m45487h(iCharAt)) {
                int i3 = i + 1;
                char cCharAt = i3 < i2 ? str.charAt(i3) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = 65536 + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i = i3;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i++;
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String m29780c(String str) {
        int iA0;
        sq8.m48649h(str, "string");
        int length = str.length();
        rl1 rl1Var = new rl1();
        for (int i = 0; i < length; i = iA0 + 1) {
            iA0 = f9g.a0(str, '.', i, false, 4, null);
            if (iA0 == -1) {
                iA0 = length;
            }
            if (!m29781d(str, i, iA0, rl1Var)) {
                return null;
            }
            if (iA0 >= length) {
                break;
            }
            rl1Var.T1(46);
        }
        return rl1Var.m46909T();
    }

    /* renamed from: d */
    public final boolean m29781d(String str, int i, int i2, rl1 rl1Var) {
        int i3;
        int i4;
        int i5;
        boolean z = true;
        if (!e9g.m24587A(str, i, f26176b, 0, 4, true)) {
            rl1Var.mo29025i(str, i, i2);
            return true;
        }
        int i6 = i + 4;
        ArrayList arrayList = new ArrayList();
        int iG0 = f9g.g0(str, '-', i2, false, 4, null);
        char c = '[';
        char c2 = '{';
        char c3 = 'A';
        if (iG0 >= i6) {
            while (i6 < iG0) {
                int i7 = i6 + 1;
                char cCharAt = str.charAt(i6);
                if (!(((('a' <= cCharAt && cCharAt < '{') || ('A' <= cCharAt && cCharAt < '[')) || ('0' <= cCharAt && cCharAt < ':')) || cCharAt == '-')) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i6 = i7;
            }
            i6++;
        }
        int i8 = 128;
        int iM29778a = 72;
        int i9 = 0;
        while (i6 < i2) {
            il8 il8VarM18615r = bce.m18615r(bce.m18616s(36, Api.BaseClientBuilder.API_PRIORITY_OTHER), 36);
            int iM32260e = il8VarM18615r.m32260e();
            int iM32261j = il8VarM18615r.m32261j();
            int iM32262n = il8VarM18615r.m32262n();
            if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
                i3 = i9;
                int i10 = 1;
                while (i6 != i2) {
                    int i11 = i6 + 1;
                    char cCharAt2 = str.charAt(i6);
                    if ('a' <= cCharAt2 && cCharAt2 < c2) {
                        i4 = cCharAt2 - 'a';
                    } else {
                        if (c3 <= cCharAt2 && cCharAt2 < c) {
                            i4 = cCharAt2 - 'A';
                        } else {
                            if (!('0' <= cCharAt2 && cCharAt2 < ':')) {
                                return false;
                            }
                            i4 = (cCharAt2 - '0') + 26;
                        }
                    }
                    int i12 = i10;
                    int i13 = i4 * i12;
                    int i14 = i3;
                    if (i14 > Api.BaseClientBuilder.API_PRIORITY_OTHER - i13) {
                        return false;
                    }
                    i3 = i14 + i13;
                    if (iM32260e <= iM29778a) {
                        i5 = 1;
                    } else {
                        i5 = iM32260e < iM29778a + 26 ? iM32260e - iM29778a : 26;
                    }
                    if (i4 >= i5) {
                        int i15 = 36 - i5;
                        if (i12 > Api.BaseClientBuilder.API_PRIORITY_OTHER / i15) {
                            return false;
                        }
                        i10 = i12 * i15;
                        if (iM32260e != iM32261j) {
                            iM32260e += iM32262n;
                            i6 = i11;
                            c = '[';
                            c2 = '{';
                            c3 = 'A';
                        }
                    }
                    i6 = i11;
                }
                return false;
            }
            i3 = i9;
            iM29778a = m29778a(i3 - i9, arrayList.size() + 1, i9 == 0);
            int size = i3 / (arrayList.size() + 1);
            if (i8 > Api.BaseClientBuilder.API_PRIORITY_OTHER - size) {
                return false;
            }
            i8 += size;
            int size2 = i3 % (arrayList.size() + 1);
            if (i8 > 1114111) {
                return false;
            }
            arrayList.add(size2, Integer.valueOf(i8));
            i9 = size2 + 1;
            z = true;
            c = '[';
            c2 = '{';
            c3 = 'A';
        }
        boolean z2 = z;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rl1Var.mo29022G(((Number) it.next()).intValue());
        }
        return z2;
    }

    /* renamed from: e */
    public final String m29782e(String str) {
        int iA0;
        sq8.m48649h(str, "string");
        int length = str.length();
        rl1 rl1Var = new rl1();
        for (int i = 0; i < length; i = iA0 + 1) {
            iA0 = f9g.a0(str, '.', i, false, 4, null);
            if (iA0 == -1) {
                iA0 = length;
            }
            if (!m29783f(str, i, iA0, rl1Var)) {
                return null;
            }
            if (iA0 >= length) {
                break;
            }
            rl1Var.T1(46);
        }
        return rl1Var.m46909T();
    }

    /* renamed from: f */
    public final boolean m29783f(String str, int i, int i2, rl1 rl1Var) {
        int i3;
        int i4;
        if (!m29785h(str, i, i2)) {
            rl1Var.mo29025i(str, i, i2);
            return true;
        }
        rl1Var.M2(f26177c);
        List listM29779b = m29779b(str, i, i2);
        Iterator it = listM29779b.iterator();
        boolean z = false;
        int i5 = 0;
        while (true) {
            i3 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue < 128) {
                rl1Var.T1(iIntValue);
                i5++;
            }
        }
        if (i5 > 0) {
            rl1Var.T1(45);
        }
        int iM29778a = 72;
        int i6 = 0;
        int i7 = i5;
        while (i7 < listM29779b.size()) {
            Iterator it2 = listM29779b.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i3) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i3) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i8 = (iIntValue4 - i3) * (i7 + 1);
            if (i6 > Api.BaseClientBuilder.API_PRIORITY_OTHER - i8) {
                return z;
            }
            int i9 = i6 + i8;
            Iterator it3 = listM29779b.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = ((Number) it3.next()).intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i9 == Integer.MAX_VALUE) {
                        return z;
                    }
                    i9++;
                } else if (iIntValue5 == iIntValue4) {
                    il8 il8VarM18615r = bce.m18615r(bce.m18616s(36, Api.BaseClientBuilder.API_PRIORITY_OTHER), 36);
                    int iM32260e = il8VarM18615r.m32260e();
                    int iM32261j = il8VarM18615r.m32261j();
                    int iM32262n = il8VarM18615r.m32262n();
                    if ((iM32262n > 0 && iM32260e <= iM32261j) || (iM32262n < 0 && iM32261j <= iM32260e)) {
                        i4 = i9;
                        while (true) {
                            int i10 = iM32260e <= iM29778a ? 1 : iM32260e >= iM29778a + 26 ? 26 : iM32260e - iM29778a;
                            if (i4 < i10) {
                                break;
                            }
                            int i11 = i4 - i10;
                            int i12 = 36 - i10;
                            rl1Var.T1(m29784g(i10 + (i11 % i12)));
                            i4 = i11 / i12;
                            if (iM32260e == iM32261j) {
                                break;
                            }
                            iM32260e += iM32262n;
                        }
                    } else {
                        i4 = i9;
                    }
                    rl1Var.T1(m29784g(i4));
                    int i13 = i7 + 1;
                    boolean z2 = i7 == i5;
                    i7 = i13;
                    iM29778a = m29778a(i9, i13, z2);
                    z = false;
                    i9 = 0;
                }
            }
            i6 = i9 + 1;
            i3 = iIntValue4 + 1;
            z = false;
        }
        return true;
    }

    /* renamed from: g */
    public final int m29784g(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return (i - 26) + 48;
        }
        throw new IllegalStateException(("unexpected digit: " + i).toString());
    }

    /* renamed from: h */
    public final boolean m29785h(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) >= 128) {
                return true;
            }
            i++;
        }
        return false;
    }
}
