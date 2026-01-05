package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public class xe3 extends occ {
    /* renamed from: f */
    public static int m56147f(boolean[] zArr, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            zArr[i] = iArr[i2] != 0;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* renamed from: g */
    public static int m56148g(String str, int i) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    /* renamed from: h */
    public static void m56149h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // p001o.occ, p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (va1Var == va1.CODE_93) {
            return super.mo16332a(str, va1Var, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(va1Var)));
    }

    @Override // p001o.occ
    /* renamed from: c */
    public boolean[] mo16333c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 2 + 2) * 9) + 1;
        m56149h(we3.f51842b[47], iArr);
        boolean[] zArr = new boolean[length2];
        int iM56147f = m56147f(zArr, 0, iArr);
        for (int i = 0; i < length; i++) {
            m56149h(we3.f51842b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
            iM56147f += m56147f(zArr, iM56147f, iArr);
        }
        int iM56148g = m56148g(str, 20);
        int[] iArr2 = we3.f51842b;
        m56149h(iArr2[iM56148g], iArr);
        int iM56147f2 = iM56147f + m56147f(zArr, iM56147f, iArr);
        m56149h(iArr2[m56148g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iM56148g), 15)], iArr);
        int iM56147f3 = iM56147f2 + m56147f(zArr, iM56147f2, iArr);
        m56149h(iArr2[47], iArr);
        zArr[iM56147f3 + m56147f(zArr, iM56147f3, iArr)] = true;
        return zArr;
    }
}
