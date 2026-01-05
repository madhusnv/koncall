package p001o;

/* loaded from: classes6.dex */
public abstract class xsa {
    /* renamed from: a */
    public static int m56775a(hq1 hq1Var) {
        return m56776b(hq1Var, true) + m56776b(hq1Var, false);
    }

    /* renamed from: b */
    public static int m56776b(hq1 hq1Var, boolean z) {
        int iM30984d = z ? hq1Var.m30984d() : hq1Var.m30985e();
        int iM30985e = z ? hq1Var.m30985e() : hq1Var.m30984d();
        byte[][] bArrM30983c = hq1Var.m30983c();
        int i = 0;
        for (int i2 = 0; i2 < iM30984d; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iM30985e; i4++) {
                byte b2 = z ? bArrM30983c[i2][i4] : bArrM30983c[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += (i3 - 5) + 3;
                    }
                    i3 = 1;
                    b = b2;
                }
            }
            if (i3 >= 5) {
                i += (i3 - 5) + 3;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static int m56777c(hq1 hq1Var) {
        byte[][] bArrM30983c = hq1Var.m30983c();
        int iM30985e = hq1Var.m30985e();
        int iM30984d = hq1Var.m30984d();
        int i = 0;
        for (int i2 = 0; i2 < iM30984d - 1; i2++) {
            byte[] bArr = bArrM30983c[i2];
            int i3 = 0;
            while (i3 < iM30985e - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = bArrM30983c[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    /* renamed from: d */
    public static int m56778d(hq1 hq1Var) {
        byte[][] bArrM30983c = hq1Var.m30983c();
        int iM30985e = hq1Var.m30985e();
        int iM30984d = hq1Var.m30984d();
        int i = 0;
        for (int i2 = 0; i2 < iM30984d; i2++) {
            for (int i3 = 0; i3 < iM30985e; i3++) {
                byte[] bArr = bArrM30983c[i2];
                int i4 = i3 + 6;
                if (i4 < iM30985e && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (m56781g(bArr, i3 - 4, i3) || m56781g(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < iM30984d && bArrM30983c[i2][i3] == 1 && bArrM30983c[i2 + 1][i3] == 0 && bArrM30983c[i2 + 2][i3] == 1 && bArrM30983c[i2 + 3][i3] == 1 && bArrM30983c[i2 + 4][i3] == 1 && bArrM30983c[i2 + 5][i3] == 0 && bArrM30983c[i5][i3] == 1 && (m56782h(bArrM30983c, i3, i2 - 4, i2) || m56782h(bArrM30983c, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    /* renamed from: e */
    public static int m56779e(hq1 hq1Var) {
        byte[][] bArrM30983c = hq1Var.m30983c();
        int iM30985e = hq1Var.m30985e();
        int iM30984d = hq1Var.m30984d();
        int i = 0;
        for (int i2 = 0; i2 < iM30984d; i2++) {
            byte[] bArr = bArrM30983c[i2];
            for (int i3 = 0; i3 < iM30985e; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int iM30984d2 = hq1Var.m30984d() * hq1Var.m30985e();
        return ((Math.abs((i << 1) - iM30984d2) * 10) / iM30984d2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m56780f(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                return i4 != 0;
            case 1:
                i4 = i3 & 1;
                if (i4 != 0) {
                }
                break;
            case 2:
                i4 = i2 % 3;
                if (i4 != 0) {
                }
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                if (i4 != 0) {
                }
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                i3 += i2;
                i4 = i3 & 1;
                if (i4 != 0) {
                }
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                if (i4 != 0) {
                }
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                i4 = i5 & 1;
                if (i4 != 0) {
                }
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                i4 = i5 & 1;
                if (i4 != 0) {
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: g */
    public static boolean m56781g(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, bArr.length);
        for (int iMax = Math.max(i, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m56782h(byte[][] bArr, int i, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i] == 1) {
                return false;
            }
        }
        return true;
    }
}
