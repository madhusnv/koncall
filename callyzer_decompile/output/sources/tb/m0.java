package tb;

import hc.C2878a;
import kx.C4264f;
import og.d2;
import pg.w9;
import rw.AbstractC6662l;
import sd.AbstractC6812f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a */
    public static final C2878a f34278a;

    static {
        char[] cArr = AbstractC6812f.f32356a;
        byte[] bArr = new byte[32];
        C4264f c4264fM11917h = w9.m11917h(2, w9.m11919j(0, 64));
        int i10 = c4264fM11917h.f21646a;
        int i11 = c4264fM11917h.f21647b;
        int i12 = c4264fM11917h.f21648c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                bArr[i13] = (byte) (d2.m10600c("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC63254F".charAt(i10 + 1)) | (d2.m10600c("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC63254F".charAt(i10)) << 4));
                if (i10 == i11) {
                    break;
                }
                i10 += i12;
                i13 = i14;
            }
        }
        f34278a = new C2878a(AbstractC6662l.m12705H(new byte[]{0}, bArr));
    }
}
