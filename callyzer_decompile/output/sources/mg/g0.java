package mg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a */
    public static final char[] f23643a = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z6;
        if (obj instanceof g0) {
            byte[] bArr = ((f0) this).f23641b;
            int length = bArr.length * 8;
            byte[] bArr2 = ((f0) ((g0) obj)).f23641b;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z6 = true;
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        z6 &= bArr[i10] == bArr2[i10];
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((f0) this).f23641b;
        if (bArr.length * 8 < 32) {
            int i10 = bArr[0] & 255;
            for (int i11 = 1; i11 < bArr.length; i11++) {
                i10 |= (bArr[i11] & 255) << (i11 * 8);
            }
            return i10;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(AbstractC4723b.m9601c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i12 = bArr[0] & 255;
        int i13 = bArr[1] & 255;
        int i14 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i12 | (i13 << 8) | (i14 << 16);
    }

    public final String toString() {
        byte[] bArr = ((f0) this).f23641b;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = f23643a;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
