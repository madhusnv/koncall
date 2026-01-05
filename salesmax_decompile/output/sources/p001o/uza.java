package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public abstract class uza {

    /* renamed from: a */
    public static final int[][] f49703a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    public static final int[][] f49704b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    public static final int[][] f49705c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, Opcodes.FMUL, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, Opcodes.FREM, -1, -1}, new int[]{6, 34, 62, 90, Opcodes.FNEG, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, Opcodes.I2F, -1}, new int[]{6, 34, 60, 86, 112, Opcodes.L2D, -1}, new int[]{6, 30, 58, 86, Opcodes.FREM, Opcodes.D2I, -1}, new int[]{6, 34, 62, 90, Opcodes.FNEG, Opcodes.I2C, -1}, new int[]{6, 30, 54, 78, 102, 126, Opcodes.FCMPG}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, Opcodes.FMUL, Opcodes.IINC, 158}, new int[]{6, 32, 58, 84, 110, Opcodes.L2I, Opcodes.IF_ICMPGE}, new int[]{6, 26, 54, 82, 110, Opcodes.L2D, Opcodes.IF_ACMPNE}, new int[]{6, 30, 58, 86, Opcodes.FREM, Opcodes.D2I, Opcodes.TABLESWITCH}};

    /* renamed from: d */
    public static final int[][] f49706d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    public static void m52181a(xh1 xh1Var, hj6 hj6Var, pti ptiVar, int i, hq1 hq1Var) throws fdj {
        m52183c(hq1Var);
        m52184d(ptiVar, hq1Var);
        m52192l(hj6Var, i, hq1Var);
        m52199s(ptiVar, hq1Var);
        m52186f(xh1Var, i, hq1Var);
    }

    /* renamed from: b */
    public static int m52182b(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iM52194n = m52194n(i2);
        int iM52194n2 = i << (iM52194n - 1);
        while (m52194n(iM52194n2) >= iM52194n) {
            iM52194n2 ^= i2 << (m52194n(iM52194n2) - iM52194n);
        }
        return iM52194n2;
    }

    /* renamed from: c */
    public static void m52183c(hq1 hq1Var) {
        hq1Var.m30981a((byte) -1);
    }

    /* renamed from: d */
    public static void m52184d(pti ptiVar, hq1 hq1Var) throws fdj {
        m52190j(hq1Var);
        m52185e(hq1Var);
        m52198r(ptiVar, hq1Var);
        m52191k(hq1Var);
    }

    /* renamed from: e */
    public static void m52185e(hq1 hq1Var) throws fdj {
        if (hq1Var.m30982b(8, hq1Var.m30984d() - 8) == 0) {
            throw new fdj();
        }
        hq1Var.m30986f(8, hq1Var.m30984d() - 8, 1);
    }

    /* renamed from: f */
    public static void m52186f(xh1 xh1Var, int i, hq1 hq1Var) throws fdj {
        boolean zM56305h;
        int iM30985e = hq1Var.m30985e() - 1;
        int iM30984d = hq1Var.m30984d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (iM30985e > 0) {
            if (iM30985e == 6) {
                iM30985e--;
            }
            while (iM30984d >= 0 && iM30984d < hq1Var.m30984d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = iM30985e - i4;
                    if (m52195o(hq1Var.m30982b(i5, iM30984d))) {
                        if (i2 < xh1Var.m56306i()) {
                            zM56305h = xh1Var.m56305h(i2);
                            i2++;
                        } else {
                            zM56305h = false;
                        }
                        if (i != -1 && xsa.m56780f(i, i5, iM30984d)) {
                            zM56305h = !zM56305h;
                        }
                        hq1Var.m30987g(i5, iM30984d, zM56305h);
                    }
                }
                iM30984d += i3;
            }
            i3 = -i3;
            iM30984d += i3;
            iM30985e -= 2;
        }
        if (i2 == xh1Var.m56306i()) {
            return;
        }
        throw new fdj("Not all bits consumed: " + i2 + '/' + xh1Var.m56306i());
    }

    /* renamed from: g */
    public static void m52187g(int i, int i2, hq1 hq1Var) throws fdj {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!m52195o(hq1Var.m30982b(i4, i2))) {
                throw new fdj();
            }
            hq1Var.m30986f(i4, i2, 0);
        }
    }

    /* renamed from: h */
    public static void m52188h(int i, int i2, hq1 hq1Var) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f49704b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                hq1Var.m30986f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: i */
    public static void m52189i(int i, int i2, hq1 hq1Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f49703a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                hq1Var.m30986f(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: j */
    public static void m52190j(hq1 hq1Var) throws fdj {
        int length = f49703a[0].length;
        m52189i(0, 0, hq1Var);
        m52189i(hq1Var.m30985e() - length, 0, hq1Var);
        m52189i(0, hq1Var.m30985e() - length, hq1Var);
        m52187g(0, 7, hq1Var);
        m52187g(hq1Var.m30985e() - 8, 7, hq1Var);
        m52187g(0, hq1Var.m30985e() - 8, hq1Var);
        m52193m(7, 0, hq1Var);
        m52193m((hq1Var.m30984d() - 7) - 1, 0, hq1Var);
        m52193m(7, hq1Var.m30984d() - 7, hq1Var);
    }

    /* renamed from: k */
    public static void m52191k(hq1 hq1Var) {
        int i = 8;
        while (i < hq1Var.m30985e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m52195o(hq1Var.m30982b(i, 6))) {
                hq1Var.m30986f(i, 6, i3);
            }
            if (m52195o(hq1Var.m30982b(6, i))) {
                hq1Var.m30986f(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    public static void m52192l(hj6 hj6Var, int i, hq1 hq1Var) throws fdj {
        xh1 xh1Var = new xh1();
        m52196p(hj6Var, i, xh1Var);
        for (int i2 = 0; i2 < xh1Var.m56306i(); i2++) {
            boolean zM56305h = xh1Var.m56305h((xh1Var.m56306i() - 1) - i2);
            int[] iArr = f49706d[i2];
            hq1Var.m30987g(iArr[0], iArr[1], zM56305h);
            if (i2 < 8) {
                hq1Var.m30987g((hq1Var.m30985e() - i2) - 1, 8, zM56305h);
            } else {
                hq1Var.m30987g(8, (hq1Var.m30984d() - 7) + (i2 - 8), zM56305h);
            }
        }
    }

    /* renamed from: m */
    public static void m52193m(int i, int i2, hq1 hq1Var) throws fdj {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!m52195o(hq1Var.m30982b(i, i4))) {
                throw new fdj();
            }
            hq1Var.m30986f(i, i4, 0);
        }
    }

    /* renamed from: n */
    public static int m52194n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    public static boolean m52195o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    public static void m52196p(hj6 hj6Var, int i, xh1 xh1Var) throws fdj {
        if (!x3e.m55614b(i)) {
            throw new fdj("Invalid mask pattern");
        }
        int bits = (hj6Var.getBits() << 3) | i;
        xh1Var.m56302c(bits, 5);
        xh1Var.m56302c(m52182b(bits, 1335), 10);
        xh1 xh1Var2 = new xh1();
        xh1Var2.m56302c(21522, 15);
        xh1Var.m56309m(xh1Var2);
        if (xh1Var.m56306i() == 15) {
            return;
        }
        throw new fdj("should not happen but we got: " + xh1Var.m56306i());
    }

    /* renamed from: q */
    public static void m52197q(pti ptiVar, xh1 xh1Var) throws fdj {
        xh1Var.m56302c(ptiVar.m44168f(), 6);
        xh1Var.m56302c(m52182b(ptiVar.m44168f(), 7973), 12);
        if (xh1Var.m56306i() == 18) {
            return;
        }
        throw new fdj("should not happen but we got: " + xh1Var.m56306i());
    }

    /* renamed from: r */
    public static void m52198r(pti ptiVar, hq1 hq1Var) {
        if (ptiVar.m44168f() < 2) {
            return;
        }
        int[] iArr = f49705c[ptiVar.m44168f() - 1];
        for (int i : iArr) {
            if (i >= 0) {
                for (int i2 : iArr) {
                    if (i2 >= 0 && m52195o(hq1Var.m30982b(i2, i))) {
                        m52188h(i2 - 2, i - 2, hq1Var);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static void m52199s(pti ptiVar, hq1 hq1Var) throws fdj {
        if (ptiVar.m44168f() < 7) {
            return;
        }
        xh1 xh1Var = new xh1();
        m52197q(ptiVar, xh1Var);
        int i = 17;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < 3; i3++) {
                boolean zM56305h = xh1Var.m56305h(i);
                i--;
                hq1Var.m30987g(i2, (hq1Var.m30984d() - 11) + i3, zM56305h);
                hq1Var.m30987g((hq1Var.m30984d() - 11) + i3, i2, zM56305h);
            }
        }
    }
}
