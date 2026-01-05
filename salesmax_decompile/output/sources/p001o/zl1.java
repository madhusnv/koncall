package p001o;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import java.io.UnsupportedEncodingException;

/* loaded from: classes6.dex */
public abstract class zl1 {

    /* renamed from: a */
    public static final byte[] f57355a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

    /* renamed from: b */
    public static int[] f57356b = {1000000000, 100000000, 10000000, 1000000, 100000, TransferRecord.MAXIMUM_UPLOAD_PARTS, 1000, 100, 10, 1};

    /* renamed from: c */
    public static int[] f57357c = {268435456, 16777216, 1048576, 65536, 4096, 256, 16, 1};

    /* renamed from: d */
    public static final long[] f57358d = {1000000000000000000L, 100000000000000000L, 10000000000000000L, 1000000000000000L, 100000000000000L, 10000000000000L, 1000000000000L, 100000000000L, 10000000000L, 1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};

    /* renamed from: a */
    public static boolean m59571a(sl1 sl1Var, sl1 sl1Var2) {
        if (sl1Var.length() > sl1Var2.length()) {
            return false;
        }
        int iMo48451r = sl1Var2.mo48451r();
        int iMo48451r2 = sl1Var.mo48451r();
        while (iMo48451r2 < sl1Var.Y2()) {
            int i = iMo48451r + 1;
            if (sl1Var.mo41185o(iMo48451r2) != sl1Var2.mo41185o(iMo48451r)) {
                return false;
            }
            iMo48451r2++;
            iMo48451r = i;
        }
        return true;
    }

    /* renamed from: b */
    public static void m59572b(sl1 sl1Var, int i) {
        boolean z;
        if (i == 0) {
            int iMo48451r = sl1Var.mo48451r() - 1;
            sl1Var.v0(iMo48451r, (byte) 48);
            sl1Var.w2(iMo48451r);
            return;
        }
        if (i < 0) {
            i = -i;
            z = true;
        } else {
            z = false;
        }
        int iMo48451r2 = sl1Var.mo48451r();
        while (i > 0) {
            int i2 = i & 15;
            i >>= 4;
            iMo48451r2--;
            sl1Var.v0(iMo48451r2, f57355a[i2]);
        }
        if (z) {
            iMo48451r2--;
            sl1Var.v0(iMo48451r2, (byte) 45);
        }
        sl1Var.w2(iMo48451r2);
    }

    /* renamed from: c */
    public static void m59573c(sl1 sl1Var) {
        sl1Var.d1((byte) 13);
        sl1Var.d1((byte) 10);
    }

    /* renamed from: d */
    public static void m59574d(sl1 sl1Var, long j) {
        if (j < 0) {
            sl1Var.d1((byte) 45);
            if (j == Long.MIN_VALUE) {
                sl1Var.d1((byte) 57);
                j = 223372036854775808L;
            } else {
                j = -j;
            }
        }
        if (j < 10) {
            sl1Var.d1(f57355a[(int) j]);
            return;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long[] jArr = f57358d;
            if (i >= jArr.length) {
                return;
            }
            long j2 = jArr[i];
            if (j >= j2) {
                long j3 = j / j2;
                sl1Var.d1(f57355a[(int) j3]);
                j -= j3 * jArr[i];
                z = true;
            } else if (z) {
                sl1Var.d1((byte) 48);
            }
            i++;
        }
    }

    /* renamed from: e */
    public static void m59575e(sl1 sl1Var, int i) {
        if (i < 0) {
            sl1Var.d1((byte) 45);
            if (i == Integer.MIN_VALUE) {
                sl1Var.d1((byte) 56);
                sl1Var.d1((byte) 48);
                sl1Var.d1((byte) 48);
                sl1Var.d1((byte) 48);
                sl1Var.d1((byte) 48);
                sl1Var.d1((byte) 48);
                sl1Var.d1((byte) 48);
                sl1Var.d1((byte) 48);
                return;
            }
            i = -i;
        }
        if (i < 16) {
            sl1Var.d1(f57355a[i]);
            return;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            int[] iArr = f57357c;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            if (i >= i3) {
                int i4 = i / i3;
                sl1Var.d1(f57355a[i4]);
                i -= i4 * f57357c[i2];
                z = true;
            } else if (z) {
                sl1Var.d1((byte) 48);
            }
            i2++;
        }
    }

    /* renamed from: f */
    public static String m59576f(sl1 sl1Var) {
        if (sl1Var.y0()) {
            return sl1Var.toString();
        }
        try {
            byte[] bArrJ0 = sl1Var.j0();
            if (bArrJ0 != null) {
                return new String(bArrJ0, sl1Var.mo48451r(), sl1Var.length(), s8g.f44982b);
            }
            StringBuffer stringBuffer = new StringBuffer(sl1Var.length());
            int iMo48451r = sl1Var.mo48451r();
            for (int i = 0; i < sl1Var.length(); i++) {
                stringBuffer.append((char) (sl1Var.mo41185o(iMo48451r) & 127));
                iMo48451r++;
            }
            return stringBuffer.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return sl1Var.toString();
        }
    }

    /* renamed from: g */
    public static sl1 m59577g(long j) {
        pp1 pp1Var = new pp1(16);
        m59574d(pp1Var, j);
        return pp1Var;
    }

    /* renamed from: h */
    public static int m59578h(sl1 sl1Var) {
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (int iMo48451r = sl1Var.mo48451r(); iMo48451r < sl1Var.Y2(); iMo48451r++) {
            byte bMo41185o = sl1Var.mo41185o(iMo48451r);
            if (bMo41185o > 32) {
                if (bMo41185o >= 48 && bMo41185o <= 57) {
                    i = (i * 10) + (bMo41185o - 48);
                    z = true;
                } else {
                    if (bMo41185o != 45 || z) {
                        break;
                    }
                    z2 = true;
                }
            } else {
                if (z) {
                    break;
                }
            }
        }
        if (z) {
            return z2 ? -i : i;
        }
        throw new NumberFormatException(sl1Var.toString());
    }

    /* renamed from: i */
    public static long m59579i(sl1 sl1Var) {
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        for (int iMo48451r = sl1Var.mo48451r(); iMo48451r < sl1Var.Y2(); iMo48451r++) {
            byte bMo41185o = sl1Var.mo41185o(iMo48451r);
            if (bMo41185o > 32) {
                if (bMo41185o >= 48 && bMo41185o <= 57) {
                    j = (j * 10) + (bMo41185o - 48);
                    z = true;
                } else {
                    if (bMo41185o != 45 || z) {
                        break;
                    }
                    z2 = true;
                }
            } else {
                if (z) {
                    break;
                }
            }
        }
        if (z) {
            return z2 ? -j : j;
        }
        throw new NumberFormatException(sl1Var.toString());
    }
}
