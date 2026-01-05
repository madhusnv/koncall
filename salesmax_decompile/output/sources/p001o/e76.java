package p001o;

/* loaded from: classes6.dex */
public abstract class e76 {

    /* renamed from: a */
    public static final int[] f21106a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    public static int[] m24464a(xh1 xh1Var, int i, int i2) {
        int[] iArr = new int[i2];
        int iM56306i = xh1Var.m56306i() / i;
        for (int i3 = 0; i3 < iM56306i; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= xh1Var.m56305h((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    /* renamed from: b */
    public static void m24465b(yh1 yh1Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    yh1Var.m57803h(i5, i4);
                    yh1Var.m57803h(i5, i6);
                    yh1Var.m57803h(i4, i5);
                    yh1Var.m57803h(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        yh1Var.m57803h(i7, i7);
        int i8 = i7 + 1;
        yh1Var.m57803h(i8, i7);
        yh1Var.m57803h(i7, i8);
        int i9 = i + i2;
        yh1Var.m57803h(i9, i7);
        yh1Var.m57803h(i9, i8);
        yh1Var.m57803h(i9, i9 - 1);
    }

    /* renamed from: c */
    public static void m24466c(yh1 yh1Var, boolean z, int i, xh1 xh1Var) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (xh1Var.m56305h(i3)) {
                    yh1Var.m57803h(i4, i2 - 5);
                }
                if (xh1Var.m56305h(i3 + 7)) {
                    yh1Var.m57803h(i2 + 5, i4);
                }
                if (xh1Var.m56305h(20 - i3)) {
                    yh1Var.m57803h(i4, i2 + 5);
                }
                if (xh1Var.m56305h(27 - i3)) {
                    yh1Var.m57803h(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (xh1Var.m56305h(i3)) {
                yh1Var.m57803h(i5, i2 - 7);
            }
            if (xh1Var.m56305h(i3 + 10)) {
                yh1Var.m57803h(i2 + 7, i5);
            }
            if (xh1Var.m56305h(29 - i3)) {
                yh1Var.m57803h(i5, i2 + 7);
            }
            if (xh1Var.m56305h(39 - i3)) {
                yh1Var.m57803h(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static j91 m24467d(byte[] bArr, int i, int i2) {
        xh1 xh1VarM24471h;
        int i3;
        boolean z;
        int iAbs;
        int iM24472i;
        int i4;
        xh1 xh1VarM42765a = new oy7(bArr).m42765a();
        int iM56306i = ((xh1VarM42765a.m56306i() * i) / 100) + 11;
        int iM56306i2 = xh1VarM42765a.m56306i() + iM56306i;
        int i5 = 1;
        if (i2 == 0) {
            xh1 xh1VarM24471h2 = null;
            int i6 = 0;
            int i7 = 0;
            while (i6 <= 32) {
                boolean z2 = i6 <= 3 ? i5 : 0;
                int i8 = z2 != 0 ? i6 + 1 : i6;
                int iM24472i2 = m24472i(i8, z2);
                if (iM56306i2 <= iM24472i2) {
                    if (xh1VarM24471h2 == null || i7 != f21106a[i8]) {
                        int i9 = f21106a[i8];
                        i7 = i9;
                        xh1VarM24471h2 = m24471h(xh1VarM42765a, i9);
                    }
                    int i10 = iM24472i2 - (iM24472i2 % i7);
                    if ((z2 == 0 || xh1VarM24471h2.m56306i() <= (i7 << 6)) && xh1VarM24471h2.m56306i() + iM56306i <= i10) {
                        xh1VarM24471h = xh1VarM24471h2;
                        i3 = i7;
                        z = z2;
                        iAbs = i8;
                        iM24472i = iM24472i2;
                    }
                }
                i6++;
                i5 = i5;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z = i2 < 0;
        iAbs = Math.abs(i2);
        if (iAbs > (z ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
        }
        iM24472i = m24472i(iAbs, z);
        i3 = f21106a[iAbs];
        int i11 = iM24472i - (iM24472i % i3);
        xh1VarM24471h = m24471h(xh1VarM42765a, i3);
        if (xh1VarM24471h.m56306i() + iM56306i > i11) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z && xh1VarM24471h.m56306i() > (i3 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        xh1 xh1VarM24468e = m24468e(xh1VarM24471h, iM24472i, i3);
        int iM56306i3 = xh1VarM24471h.m56306i() / i3;
        xh1 xh1VarM24469f = m24469f(z, iAbs, iM56306i3);
        int i12 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i12];
        int i13 = 2;
        if (z) {
            for (int i14 = 0; i14 < i12; i14++) {
                iArr[i14] = i14;
            }
            i4 = i12;
        } else {
            int i15 = i12 / 2;
            i4 = i12 + 1 + (((i15 - 1) / 15) * 2);
            int i16 = i4 / 2;
            for (int i17 = 0; i17 < i15; i17++) {
                iArr[(i15 - i17) - i5] = (i16 - r14) - 1;
                iArr[i15 + i17] = (i17 / 15) + i17 + i16 + i5;
            }
        }
        yh1 yh1Var = new yh1(i4);
        int i18 = 0;
        int i19 = 0;
        while (i18 < iAbs) {
            int i20 = ((iAbs - i18) << i13) + (z ? 9 : 12);
            int i21 = 0;
            while (i21 < i20) {
                int i22 = i21 << 1;
                int i23 = 0;
                while (i23 < i13) {
                    if (xh1VarM24468e.m56305h(i19 + i22 + i23)) {
                        int i24 = i18 << 1;
                        yh1Var.m57803h(iArr[i24 + i23], iArr[i24 + i21]);
                    }
                    if (xh1VarM24468e.m56305h((i20 << 1) + i19 + i22 + i23)) {
                        int i25 = i18 << 1;
                        yh1Var.m57803h(iArr[i25 + i21], iArr[((i12 - 1) - i25) - i23]);
                    }
                    if (xh1VarM24468e.m56305h((i20 << 2) + i19 + i22 + i23)) {
                        int i26 = (i12 - 1) - (i18 << 1);
                        yh1Var.m57803h(iArr[i26 - i23], iArr[i26 - i21]);
                    }
                    if (xh1VarM24468e.m56305h((i20 * 6) + i19 + i22 + i23)) {
                        int i27 = i18 << 1;
                        yh1Var.m57803h(iArr[((i12 - 1) - i27) - i21], iArr[i27 + i23]);
                    }
                    i23++;
                    i13 = 2;
                }
                i21++;
                i13 = 2;
            }
            i19 += i20 << 3;
            i18++;
            i13 = 2;
        }
        m24466c(yh1Var, z, i4, xh1VarM24469f);
        if (z) {
            m24465b(yh1Var, i4 / 2, 5);
        } else {
            int i28 = i4 / 2;
            m24465b(yh1Var, i28, 7);
            int i29 = 0;
            int i30 = 0;
            while (i30 < (i12 / 2) - 1) {
                for (int i31 = i28 & 1; i31 < i4; i31 += 2) {
                    int i32 = i28 - i29;
                    yh1Var.m57803h(i32, i31);
                    int i33 = i28 + i29;
                    yh1Var.m57803h(i33, i31);
                    yh1Var.m57803h(i31, i32);
                    yh1Var.m57803h(i31, i33);
                }
                i30 += 15;
                i29 += 16;
            }
        }
        j91 j91Var = new j91();
        j91Var.m33420c(z);
        j91Var.m33423f(i4);
        j91Var.m33421d(iAbs);
        j91Var.m33419b(iM56306i3);
        j91Var.m33422e(yh1Var);
        return j91Var;
    }

    /* renamed from: e */
    public static xh1 m24468e(xh1 xh1Var, int i, int i2) {
        int iM56306i = xh1Var.m56306i() / i2;
        cge cgeVar = new cge(m24470g(i2));
        int i3 = i / i2;
        int[] iArrM24464a = m24464a(xh1Var, i2, i3);
        cgeVar.m21199b(iArrM24464a, i3 - iM56306i);
        xh1 xh1Var2 = new xh1();
        xh1Var2.m56302c(0, i % i2);
        for (int i4 : iArrM24464a) {
            xh1Var2.m56302c(i4, i2);
        }
        return xh1Var2;
    }

    /* renamed from: f */
    public static xh1 m24469f(boolean z, int i, int i2) {
        xh1 xh1Var = new xh1();
        if (z) {
            xh1Var.m56302c(i - 1, 2);
            xh1Var.m56302c(i2 - 1, 6);
            return m24468e(xh1Var, 28, 4);
        }
        xh1Var.m56302c(i - 1, 5);
        xh1Var.m56302c(i2 - 1, 11);
        return m24468e(xh1Var, 40, 4);
    }

    /* renamed from: g */
    public static do7 m24470g(int i) {
        if (i == 4) {
            return do7.f20336k;
        }
        if (i == 6) {
            return do7.f20335j;
        }
        if (i == 8) {
            return do7.f20339n;
        }
        if (i == 10) {
            return do7.f20334i;
        }
        if (i == 12) {
            return do7.f20333h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    /* renamed from: h */
    public static xh1 m24471h(xh1 xh1Var, int i) {
        xh1 xh1Var2 = new xh1();
        int iM56306i = xh1Var.m56306i();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < iM56306i) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= iM56306i || xh1Var.m56305h(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                xh1Var2.m56302c(i7, i);
            } else if (i7 == 0) {
                xh1Var2.m56302c(i4 | 1, i);
            } else {
                xh1Var2.m56302c(i4, i);
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return xh1Var2;
    }

    /* renamed from: i */
    public static int m24472i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
