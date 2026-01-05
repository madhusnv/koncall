package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public final class ou4 implements ddj {
    /* renamed from: b */
    public static yh1 m42698b(hq1 hq1Var, int i, int i2) {
        yh1 yh1Var;
        int iM30985e = hq1Var.m30985e();
        int iM30984d = hq1Var.m30984d();
        int iMax = Math.max(i, iM30985e);
        int iMax2 = Math.max(i2, iM30984d);
        int iMin = Math.min(iMax / iM30985e, iMax2 / iM30984d);
        int i3 = (iMax - (iM30985e * iMin)) / 2;
        int i4 = (iMax2 - (iM30984d * iMin)) / 2;
        if (i2 < iM30984d || i < iM30985e) {
            yh1Var = new yh1(iM30985e, iM30984d);
            i3 = 0;
            i4 = 0;
        } else {
            yh1Var = new yh1(i, i2);
        }
        yh1Var.clear();
        int i5 = 0;
        while (i5 < iM30984d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < iM30985e) {
                if (hq1Var.m30982b(i7, i5) == 1) {
                    yh1Var.m57804i(i6, i4, iMin, iMin);
                }
                i7++;
                i6 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return yh1Var;
    }

    /* renamed from: c */
    public static yh1 m42699c(wf5 wf5Var, mgg mggVar, int i, int i2) {
        int iM39014h = mggVar.m39014h();
        int iM39013g = mggVar.m39013g();
        hq1 hq1Var = new hq1(mggVar.m39016j(), mggVar.m39015i());
        int i3 = 0;
        for (int i4 = 0; i4 < iM39013g; i4++) {
            if (i4 % mggVar.f35419e == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < mggVar.m39016j(); i6++) {
                    hq1Var.m30987g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < iM39014h; i8++) {
                if (i8 % mggVar.f35418d == 0) {
                    hq1Var.m30987g(i7, i3, true);
                    i7++;
                }
                hq1Var.m30987g(i7, i3, wf5Var.m54322e(i8, i4));
                i7++;
                int i9 = mggVar.f35418d;
                if (i8 % i9 == i9 - 1) {
                    hq1Var.m30987g(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = mggVar.f35419e;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < mggVar.m39016j(); i12++) {
                    hq1Var.m30987g(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return m42698b(hq1Var, i, i2);
    }

    @Override // p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (va1Var != va1.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(va1Var)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        ngg nggVar = ngg.FORCE_NONE;
        if (map != null) {
            ngg nggVar2 = (ngg) map.get(z66.DATA_MATRIX_SHAPE);
            if (nggVar2 != null) {
                nggVar = nggVar2;
            }
            tq.m50332a(map.get(z66.MIN_SIZE));
            tq.m50332a(map.get(z66.MAX_SIZE));
        }
        String strM44286b = py7.m44286b(str, nggVar, null, null);
        mgg mggVarM39006l = mgg.m39006l(strM44286b.length(), nggVar, null, null, true);
        wf5 wf5Var = new wf5(gj6.m28851c(strM44286b, mggVarM39006l), mggVarM39006l.m39014h(), mggVarM39006l.m39013g());
        wf5Var.m54325h();
        return m42699c(wf5Var, mggVarM39006l, i, i2);
    }
}
