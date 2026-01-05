package pg;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import sk.C6863k;
import wj.C8078d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class u6 {
    /* renamed from: a */
    public static byte[] m11880a(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* renamed from: b */
    public static final boolean m11881b(C6863k c6863k) {
        return (c6863k == null || c6863k.f32611b == 0 || c6863k.f32610a == 0) ? false : true;
    }

    /* renamed from: c */
    public static byte[] m11882c(C8078d c8078d) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = c8078d.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return m11880a(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            long j6 = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j6 > 2147483647L ? Integer.MAX_VALUE : j6 < -2147483648L ? Integer.MIN_VALUE : (int) j6;
        }
        if (c8078d.read() == -1) {
            return m11880a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
