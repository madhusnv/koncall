package p001o;

import java.io.EOFException;

/* loaded from: classes2.dex */
public abstract class wq6 {
    /* renamed from: a */
    public static void m54803a(boolean z, String str) throws byc {
        if (!z) {
            throw byc.m19921a(str, null);
        }
    }

    /* renamed from: b */
    public static boolean m54804b(uq6 uq6Var, byte[] bArr, int i, int i2, boolean z) throws EOFException {
        try {
            return uq6Var.mo40489a(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: c */
    public static int m54805c(uq6 uq6Var, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iMo40495i = uq6Var.mo40495i(bArr, i + i3, i2 - i3);
            if (iMo40495i == -1) {
                break;
            }
            i3 += iMo40495i;
        }
        return i3;
    }

    /* renamed from: d */
    public static boolean m54806d(uq6 uq6Var, byte[] bArr, int i, int i2) {
        try {
            uq6Var.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m54807e(uq6 uq6Var, int i) {
        try {
            uq6Var.mo40496k(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
