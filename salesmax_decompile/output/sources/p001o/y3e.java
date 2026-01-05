package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public final class y3e implements ddj {
    /* renamed from: b */
    public static yh1 m57186b(x3e x3eVar, int i, int i2, int i3) {
        hq1 hq1VarM55615a = x3eVar.m55615a();
        if (hq1VarM55615a == null) {
            throw new IllegalStateException();
        }
        int iM30985e = hq1VarM55615a.m30985e();
        int iM30984d = hq1VarM55615a.m30984d();
        int i4 = i3 << 1;
        int i5 = iM30985e + i4;
        int i6 = i4 + iM30984d;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (iM30985e * iMin)) / 2;
        int i8 = (iMax2 - (iM30984d * iMin)) / 2;
        yh1 yh1Var = new yh1(iMax, iMax2);
        int i9 = 0;
        while (i9 < iM30984d) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < iM30985e) {
                if (hq1VarM55615a.m30982b(i10, i9) == 1) {
                    yh1Var.m57804i(i11, i8, iMin, iMin);
                }
                i10++;
                i11 += iMin;
            }
            i9++;
            i8 += iMin;
        }
        return yh1Var;
    }

    @Override // p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) throws NumberFormatException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (va1Var != va1.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(va1Var)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        hj6 hj6VarValueOf = hj6.L;
        int i3 = 4;
        if (map != null) {
            z66 z66Var = z66.ERROR_CORRECTION;
            if (map.containsKey(z66Var)) {
                hj6VarValueOf = hj6.valueOf(map.get(z66Var).toString());
            }
            z66 z66Var2 = z66.MARGIN;
            if (map.containsKey(z66Var2)) {
                i3 = Integer.parseInt(map.get(z66Var2).toString());
            }
        }
        return m57186b(g76.m28128n(str, hj6VarValueOf, map), i, i2, i3);
    }
}
