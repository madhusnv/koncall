package pg;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import java.util.Arrays;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.InterfaceC7879r;
import w4.C7913e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r6 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11845a(ex.InterfaceC2137a r19, w4.C7922n r20, s2.C6734c r21, k2.InterfaceC3962k r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.r6.m11845a(ex.a, w4.n, s2.c, k2.k, int, int):void");
    }

    /* renamed from: b */
    public static final void m11846b(InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1177876616);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? 32 : 16;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C7913e c7913e = C7913e.f38086b;
            int i12 = ((i11 << 3) & 112) | ((i11 >> 3) & 14) | KyberEngine.KyberPolyBytes;
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            int i14 = ((i12 << 6) & 896) | 6;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c7913e, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            AbstractC1452a.m4576w((i14 >> 6) & 14, interfaceC2141e, c3966o, true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g2.v3(interfaceC7879r, interfaceC2141e, i10, 9);
        }
    }

    /* renamed from: c */
    public static byte[] m11847c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jM11848d = m11848d(0, bArr) & 67108863;
        int i10 = 3;
        long jM11848d2 = (m11848d(3, bArr) >> 2) & 67108611;
        long jM11848d3 = (m11848d(6, bArr) >> 4) & 67092735;
        long jM11848d4 = (m11848d(9, bArr) >> 6) & 66076671;
        long jM11848d5 = (m11848d(12, bArr) >> 8) & 1048575;
        long j6 = jM11848d2 * 5;
        long j10 = jM11848d3 * 5;
        long j11 = jM11848d4 * 5;
        long j12 = jM11848d5 * 5;
        byte[] bArr3 = new byte[17];
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        int i11 = 0;
        while (i11 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jM11848d6 = j17 + (m11848d(0, bArr3) & 67108863);
            long jM11848d7 = j13 + ((m11848d(i10, bArr3) >> 2) & 67108863);
            long jM11848d8 = j14 + ((m11848d(6, bArr3) >> 4) & 67108863);
            long jM11848d9 = j15 + ((m11848d(9, bArr3) >> 6) & 67108863);
            long j18 = jM11848d2;
            long jM11848d10 = j16 + (((m11848d(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j19 = (jM11848d10 * j6) + (jM11848d9 * j10) + (jM11848d8 * j11) + (jM11848d7 * j12) + (jM11848d6 * jM11848d);
            long j20 = (jM11848d10 * j10) + (jM11848d9 * j11) + (jM11848d8 * j12) + (jM11848d7 * jM11848d) + (jM11848d6 * j18);
            long j21 = (jM11848d10 * j11) + (jM11848d9 * j12) + (jM11848d8 * jM11848d) + (jM11848d7 * j18) + (jM11848d6 * jM11848d3);
            long j22 = (jM11848d10 * j12) + (jM11848d9 * jM11848d) + (jM11848d8 * j18) + (jM11848d7 * jM11848d3) + (jM11848d6 * jM11848d4);
            long j23 = jM11848d9 * j18;
            long j24 = jM11848d10 * jM11848d;
            long j25 = j20 + (j19 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j22 + (j26 >> 26);
            long j28 = j24 + j23 + (jM11848d8 * jM11848d3) + (jM11848d7 * jM11848d4) + (jM11848d6 * jM11848d5) + (j27 >> 26);
            long j29 = j28 >> 26;
            j16 = j28 & 67108863;
            long j30 = (j29 * 5) + (j19 & 67108863);
            i11 += 16;
            j14 = j26 & 67108863;
            j15 = j27 & 67108863;
            j17 = j30 & 67108863;
            j13 = (j25 & 67108863) + (j30 >> 26);
            jM11848d2 = j18;
            i10 = 3;
        }
        long j31 = j14 + (j13 >> 26);
        long j32 = j31 & 67108863;
        long j33 = j15 + (j31 >> 26);
        long j34 = j33 & 67108863;
        long j35 = j16 + (j33 >> 26);
        long j36 = j35 & 67108863;
        long j37 = ((j35 >> 26) * 5) + j17;
        long j38 = j37 >> 26;
        long j39 = j37 & 67108863;
        long j40 = (j13 & 67108863) + j38;
        long j41 = j39 + 5;
        long j42 = j41 & 67108863;
        long j43 = j40 + (j41 >> 26);
        long j44 = j32 + (j43 >> 26);
        long j45 = j34 + (j44 >> 26);
        long j46 = j45 & 67108863;
        long j47 = (j36 + (j45 >> 26)) - 67108864;
        long j48 = j47 >> 63;
        long j49 = j39 & j48;
        long j50 = j40 & j48;
        long j51 = j32 & j48;
        long j52 = j34 & j48;
        long j53 = j36 & j48;
        long j54 = ~j48;
        long j55 = j50 | (j43 & 67108863 & j54);
        long j56 = j51 | (j44 & 67108863 & j54);
        long j57 = j52 | (j46 & j54);
        long j58 = (j49 | (j42 & j54) | (j55 << 26)) & 4294967295L;
        long j59 = ((j55 >> 6) | (j56 << 20)) & 4294967295L;
        long j60 = ((j56 >> 12) | (j57 << 14)) & 4294967295L;
        long j61 = ((j57 >> 18) | ((j53 | (j47 & j54)) << 8)) & 4294967295L;
        long jM11848d11 = m11848d(16, bArr) + j58;
        long j62 = jM11848d11 & 4294967295L;
        long jM11848d12 = m11848d(20, bArr) + j59 + (jM11848d11 >> 32);
        long jM11848d13 = m11848d(24, bArr) + j60 + (jM11848d12 >> 32);
        long jM11848d14 = (m11848d(28, bArr) + j61 + (jM11848d13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        m11849e(bArr4, j62, 0);
        m11849e(bArr4, jM11848d12 & 4294967295L, 4);
        m11849e(bArr4, jM11848d13 & 4294967295L, 8);
        m11849e(bArr4, jM11848d14, 12);
        return bArr4;
    }

    /* renamed from: d */
    public static long m11848d(int i10, byte[] bArr) {
        return (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    /* renamed from: e */
    public static void m11849e(byte[] bArr, long j6, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j6);
            i11++;
            j6 >>= 8;
        }
    }
}
