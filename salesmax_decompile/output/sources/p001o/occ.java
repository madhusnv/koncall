package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public abstract class occ implements ddj {
    /* renamed from: b */
    public static int m41970b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: e */
    public static yh1 m41971e(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int iMax = Math.max(i, i4);
        int iMax2 = Math.max(1, i2);
        int i5 = iMax / i4;
        int i6 = (iMax - (length * i5)) / 2;
        yh1 yh1Var = new yh1(iMax, iMax2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                yh1Var.m57804i(i6, 0, i5, iMax2);
            }
            i7++;
            i6 += i5;
        }
        return yh1Var;
    }

    @Override // p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) throws NumberFormatException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int iMo41972d = mo41972d();
        if (map != null) {
            z66 z66Var = z66.MARGIN;
            if (map.containsKey(z66Var)) {
                iMo41972d = Integer.parseInt(map.get(z66Var).toString());
            }
        }
        return m41971e(mo16333c(str), i, i2, iMo41972d);
    }

    /* renamed from: c */
    public abstract boolean[] mo16333c(String str);

    /* renamed from: d */
    public int mo41972d() {
        return 10;
    }
}
