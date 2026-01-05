package og;

import com.sun.mail.util.AbstractC1452a;
import j3.C3552f;
import nx.AbstractC5166d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class lc {

    /* renamed from: a */
    public static C3552f f26621a;

    /* renamed from: a */
    public static final void m10747a(int i10, String str) {
        if (str.charAt(i10) == '-') {
            return;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "Expected '-' (hyphen) at index ", ", but was '");
        sbM4567n.append(str.charAt(i10));
        sbM4567n.append('\'');
        throw new IllegalArgumentException(sbM4567n.toString().toString());
    }

    /* renamed from: b */
    public static final void m10748b(long j6, byte[] bArr, int i10, int i11, int i12) {
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = AbstractC5166d.f25260a[(int) ((j6 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            bArr[i10] = (byte) (i15 >> 8);
            i10 += 2;
            bArr[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }
}
