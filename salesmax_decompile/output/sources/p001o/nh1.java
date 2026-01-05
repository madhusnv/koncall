package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class nh1 {

    /* renamed from: a */
    public static final char[] f36844a = m40569b();

    /* renamed from: b */
    public static final byte[] f36845b = m40568a();

    /* renamed from: a */
    public static byte[] m40568a() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 16; i++) {
            bArr["0123456789abcdef".charAt(i)] = (byte) i;
        }
        return bArr;
    }

    /* renamed from: b */
    public static char[] m40569b() {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        return cArr;
    }

    /* renamed from: c */
    public static void m40570c(byte b, char[] cArr, int i) {
        int i2 = b & 255;
        char[] cArr2 = f36844a;
        cArr[i] = cArr2[i2];
        cArr[i + 1] = cArr2[i2 | 256];
    }

    /* renamed from: d */
    public static void m40571d(long j, char[] cArr, int i) {
        m40570c((byte) ((j >> 56) & 255), cArr, i);
        m40570c((byte) ((j >> 48) & 255), cArr, i + 2);
        m40570c((byte) ((j >> 40) & 255), cArr, i + 4);
        m40570c((byte) ((j >> 32) & 255), cArr, i + 6);
        m40570c((byte) ((j >> 24) & 255), cArr, i + 8);
        m40570c((byte) ((j >> 16) & 255), cArr, i + 10);
        m40570c((byte) ((j >> 8) & 255), cArr, i + 12);
        m40570c((byte) (j & 255), cArr, i + 14);
    }

    /* renamed from: e */
    public static void m40572e(long j, byte[] bArr, int i) {
        kri.m36135a(bArr.length >= i + 8, "array too small");
        bArr[i + 7] = (byte) (j & 255);
        bArr[i + 6] = (byte) ((j >> 8) & 255);
        bArr[i + 5] = (byte) ((j >> 16) & 255);
        bArr[i + 4] = (byte) ((j >> 24) & 255);
        bArr[i + 3] = (byte) ((j >> 32) & 255);
        bArr[i + 2] = (byte) ((j >> 40) & 255);
        bArr[i + 1] = (byte) ((j >> 48) & 255);
        bArr[i] = (byte) ((j >> 56) & 255);
    }
}
