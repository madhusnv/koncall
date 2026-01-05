package sz;

import b00.C0529n;
import ph.C5950e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sz.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6969b {

    /* renamed from: a */
    public static final C0529n f33746a;

    static {
        C0529n c0529n = C0529n.f3647d;
        f33746a = C5950e.m11977h("xn--");
    }

    /* renamed from: a */
    public static int m13247a(int i10, int i11, boolean z6) {
        int i12 = z6 ? i10 / 700 : i10 / 2;
        int i13 = (i12 / i11) + i12;
        int i14 = 0;
        while (i13 > 455) {
            i13 /= 35;
            i14 += 36;
        }
        return ((i13 * 36) / (i13 + 38)) + i14;
    }

    /* renamed from: b */
    public static int m13248b(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }
}
