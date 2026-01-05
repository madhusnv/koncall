package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes3.dex */
public abstract class cb1 {

    /* renamed from: a */
    public static final int[] f17663a;

    static {
        int[] iArr = new int[256];
        int i = 0;
        while (i < 256) {
            iArr[i] = i == 61 ? Constants.MAX_HOST_LENGTH : f9g.a0("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i, 0, false, 6, null);
            i++;
        }
        f17663a = iArr;
    }

    /* renamed from: a */
    public static final int m20633a(int i) {
        return ((i + 2) / 3) * 4;
    }

    /* renamed from: b */
    public static final byte[] m20634b(byte[] bArr) {
        sq8.m48649h(bArr, "<this>");
        byte[] bArr2 = new byte[m20633a(bArr.length)];
        int length = bArr.length % 3;
        int length2 = (bArr.length + 2) / 3;
        int i = 0;
        int iM21478c = cnd.m21478c(0, bArr.length - 1, 3);
        if (iM21478c >= 0) {
            int i2 = 0;
            while (true) {
                int iM20636d = m20636d(bArr, i + 2, Integer.valueOf(Constants.MAX_HOST_LENGTH)) | (m20636d(bArr, i, Integer.valueOf(Constants.MAX_HOST_LENGTH)) << 16) | (m20636d(bArr, i + 1, Integer.valueOf(Constants.MAX_HOST_LENGTH)) << 8);
                int i3 = i2 + 1;
                bArr2[i2] = m20637e((iM20636d >> 18) & 63);
                int i4 = i3 + 1;
                bArr2[i3] = m20637e((iM20636d >> 12) & 63);
                int i5 = i4 + 1;
                bArr2[i4] = m20637e((iM20636d >> 6) & 63);
                i2 = i5 + 1;
                bArr2[i5] = m20637e(iM20636d & 63);
                if (i == iM21478c) {
                    break;
                }
                i += 3;
            }
        }
        if (length > 0) {
            int i6 = length2 * 4;
            bArr2[i6 - 1] = 61;
            if (length == 1) {
                bArr2[i6 - 2] = 61;
            }
        }
        return bArr2;
    }

    /* renamed from: c */
    public static final String m20635c(byte[] bArr) {
        sq8.m48649h(bArr, "<this>");
        return e9g.m24600r(m20634b(bArr));
    }

    /* renamed from: d */
    public static final int m20636d(byte[] bArr, int i, Integer num) {
        if (i >= bArr.length) {
            return 0;
        }
        int i2 = bArr[i];
        return num != null ? i2 & num.intValue() : i2;
    }

    /* renamed from: e */
    public static final byte m20637e(int i) {
        return (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i);
    }
}
