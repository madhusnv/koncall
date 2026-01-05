package p001o;

import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class iyh {
    /* renamed from: a */
    public static int m32914a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m32915b(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * Opcodes.NEWARRAY) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static long m32916c(zwc zwcVar, int i, int i2) {
        zwcVar.m60017U(i);
        if (zwcVar.m60020a() < 5) {
            return -9223372036854775807L;
        }
        int iM60036q = zwcVar.m60036q();
        if ((8388608 & iM60036q) != 0 || ((2096896 & iM60036q) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((iM60036q & 32) != 0) && zwcVar.m60004H() >= 7 && zwcVar.m60020a() >= 7) {
            if ((zwcVar.m60004H() & 16) == 16) {
                byte[] bArr = new byte[6];
                zwcVar.m60031l(bArr, 0, 6);
                return m32917d(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public static long m32917d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
