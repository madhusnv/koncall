package og;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.websoptimization.callyzerbiz.R;
import cv.C1519o;
import k2.C3966o;
import k2.InterfaceC3962k;
import ng.AbstractC5068s;
import nx.AbstractC5178p;
import w2.C7876o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ge {

    /* renamed from: a */
    public static Thread f26475a;

    /* renamed from: a */
    public static final void m10671a(String str, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-422235483);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            C7876o c7876o = C7876o.f37669a;
            if (str == null || AbstractC5178p.m10101L(str)) {
                c3966o.m8607Y(1142023663);
                sq.b1.m13113q(t0.m10920c(c3966o, R.string.no_notes_attached_yet), AbstractC0242a.m657k(c7876o, 10, 5), AbstractC5068s.m9996a(c3966o, R.color.notes_na_icon_color), null, null, 0, 0, 0L, null, null, c3966o, 48, 1016);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(1142279661);
                float f6 = 10;
                float f10 = 5;
                sq.g2.m13129G(str, ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12970q, null, AbstractC0242a.m659m(c7876o, f6, f10, f6, f10), c3966o, i11 & 14);
                c3966o.m8623p(false);
            }
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1519o(str, i10, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10672b(java.lang.String r27, boolean r28, w2.InterfaceC7879r r29, final ex.InterfaceC2137a r30, k2.InterfaceC3962k r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og.ge.m10672b(java.lang.String, boolean, w2.r, ex.a, k2.k, int, int):void");
    }
}
