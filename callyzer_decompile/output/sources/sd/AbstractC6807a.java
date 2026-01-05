package sd;

import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import nx.AbstractC5185w;
import pg.h9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sd.a */
/* loaded from: classes.dex */
public abstract class AbstractC6807a {
    static {
        int[] iArr = new int[256];
        int i10 = 0;
        while (i10 < 256) {
            iArr[i10] = i10 == 61 ? 255 : AbstractC5178p.m10098I("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i10, 0, 6);
            i10++;
        }
    }

    /* renamed from: a */
    public static final String m12983a(byte[] bArr) {
        AbstractC4154l.m8923f(bArr, "<this>");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length % 3;
        int length2 = (bArr.length + 2) / 3;
        int iM11687a = h9.m11687a(0, bArr.length - 1, 3);
        if (iM11687a >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                int i13 = ((i10 >= bArr.length ? 0 : bArr[i10] & 255) << 16) | ((i12 >= bArr.length ? 0 : bArr[i12] & 255) << 8);
                int i14 = i10 + 2;
                int i15 = i13 | (i14 >= bArr.length ? 0 : bArr[i14] & 255);
                bArr2[i11] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i15 >> 18) & 63);
                bArr2[i11 + 1] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i15 >> 12) & 63);
                int i16 = i11 + 3;
                bArr2[i11 + 2] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((i15 >> 6) & 63);
                i11 += 4;
                bArr2[i16] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i15 & 63);
                if (i10 == iM11687a) {
                    break;
                }
                i10 += 3;
            }
        }
        if (length > 0) {
            int i17 = length2 * 4;
            bArr2[i17 - 1] = 61;
            if (length == 1) {
                bArr2[i17 - 2] = 61;
            }
        }
        return AbstractC5185w.m10126h(bArr2);
    }
}
