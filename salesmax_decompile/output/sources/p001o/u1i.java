package p001o;

/* loaded from: classes5.dex */
public abstract class u1i {
    /* renamed from: a */
    public static final int m50864a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: b */
    public static final long m50865b(byte[] bArr, int i) {
        return ((m50864a(bArr, i + 4) << 32) >>> 32) | (m50864a(bArr, i) << 32);
    }

    /* renamed from: c */
    public static long m50866c(long j) {
        return ((j << 2) >>> 2) | Long.MIN_VALUE;
    }
}
