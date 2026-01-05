package p001o;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public final class va9 {

    /* renamed from: a */
    public static final char[] f50072a = mh2.m39048e();

    /* renamed from: b */
    public static final byte[] f50073b = mh2.m39047d();

    /* renamed from: c */
    public static final va9 f50074c = new va9();

    /* renamed from: a */
    public static int m52495a(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    /* renamed from: b */
    public static void m52496b(int i) {
        throw new IllegalArgumentException(q1i.m44737d(i));
    }

    /* renamed from: d */
    public static va9 m52497d() {
        return f50074c;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m52498c(String str) {
        int i;
        int i2;
        int length = str.length();
        int length2 = 200;
        byte[] bArrM47040f = new byte[200];
        rp1 rp1VarM47036g = null;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            int i5 = i3 + 1;
            int iCharAt = str.charAt(i3);
            while (iCharAt <= 127) {
                if (i4 >= length2) {
                    if (rp1VarM47036g == null) {
                        rp1VarM47036g = rp1.m47036g(bArrM47040f, i4);
                    }
                    byte[] bArrM47040f2 = rp1VarM47036g.m47040f();
                    i4 = 0;
                    bArrM47040f = bArrM47040f2;
                    length2 = bArrM47040f2.length;
                }
                int i6 = i4 + 1;
                bArrM47040f[i4] = (byte) iCharAt;
                if (i5 >= length) {
                    i4 = i6;
                    break loop0;
                }
                int iCharAt2 = str.charAt(i5);
                i5++;
                iCharAt = iCharAt2;
                i4 = i6;
            }
            if (rp1VarM47036g == null) {
                rp1VarM47036g = rp1.m47036g(bArrM47040f, i4);
            }
            if (i4 >= length2) {
                bArrM47040f = rp1VarM47036g.m47040f();
                length2 = bArrM47040f.length;
                i4 = 0;
            }
            if (iCharAt < 2048) {
                i = i4 + 1;
                bArrM47040f[i4] = (byte) ((iCharAt >> 6) | Opcodes.CHECKCAST);
            } else if (iCharAt < 55296 || iCharAt > 57343) {
                int i7 = i4 + 1;
                bArrM47040f[i4] = (byte) ((iCharAt >> 12) | 224);
                if (i7 >= length2) {
                    byte[] bArrM47040f3 = rp1VarM47036g.m47040f();
                    i7 = 0;
                    bArrM47040f = bArrM47040f3;
                    length2 = bArrM47040f3.length;
                }
                bArrM47040f[i7] = (byte) (((iCharAt >> 6) & 63) | 128);
                i = i7 + 1;
            } else {
                if (iCharAt > 56319) {
                    m52496b(iCharAt);
                }
                if (i5 >= length) {
                    m52496b(iCharAt);
                }
                int i8 = i5 + 1;
                int iM52495a = m52495a(iCharAt, str.charAt(i5));
                if (iM52495a > 1114111) {
                    m52496b(iM52495a);
                }
                int i9 = i4 + 1;
                bArrM47040f[i4] = (byte) ((iM52495a >> 18) | 240);
                if (i9 >= length2) {
                    bArrM47040f = rp1VarM47036g.m47040f();
                    length2 = bArrM47040f.length;
                    i9 = 0;
                }
                int i10 = i9 + 1;
                bArrM47040f[i9] = (byte) (((iM52495a >> 12) & 63) | 128);
                if (i10 >= length2) {
                    byte[] bArrM47040f4 = rp1VarM47036g.m47040f();
                    i10 = 0;
                    bArrM47040f = bArrM47040f4;
                    length2 = bArrM47040f4.length;
                }
                int i11 = i10 + 1;
                bArrM47040f[i10] = (byte) (((iM52495a >> 6) & 63) | 128);
                i2 = iM52495a;
                i3 = i8;
                i = i11;
                if (i < length2) {
                    byte[] bArrM47040f5 = rp1VarM47036g.m47040f();
                    i = 0;
                    bArrM47040f = bArrM47040f5;
                    length2 = bArrM47040f5.length;
                }
                bArrM47040f[i] = (byte) ((i2 & 63) | 128);
                i4 = i + 1;
            }
            i2 = iCharAt;
            i3 = i5;
            if (i < length2) {
            }
            bArrM47040f[i] = (byte) ((i2 & 63) | 128);
            i4 = i + 1;
        }
        return rp1VarM47036g == null ? Arrays.copyOfRange(bArrM47040f, 0, i4) : rp1VarM47036g.m47039d(i4);
    }
}
