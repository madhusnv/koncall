package x1;

import ch.C0972b;
import com.sun.mail.util.AbstractC1452a;
import g4.C2492h;
import l4.C4373r;
import l4.InterfaceC4374s;
import n1.AbstractC4941a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a */
    public static final C0972b f39729a = new C0972b(C4373r.f21928a, 0, 0);

    /* renamed from: a */
    public static final l4.i0 m15483a(l4.k0 k0Var, C2492h c2492h) {
        l4.i0 i0VarMo6334y = k0Var.mo6334y(c2492h);
        int length = c2492h.f13620b.length();
        C2492h c2492h2 = i0VarMo6334y.f21909a;
        InterfaceC4374s interfaceC4374s = i0VarMo6334y.f21910b;
        int length2 = c2492h2.f13620b.length();
        int iMin = Math.min(length, 100);
        for (int i10 = 0; i10 < iMin; i10++) {
            m15484b(interfaceC4374s.mo2733Y(i10), length2, i10);
        }
        m15484b(interfaceC4374s.mo2733Y(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < iMin2; i11++) {
            m15485c(interfaceC4374s.mo2753w(i11), length, i11);
        }
        m15485c(interfaceC4374s.mo2753w(length2), length, length2);
        return new l4.i0(c2492h2, new C0972b(interfaceC4374s, c2492h.f13620b.length(), c2492h2.f13620b.length()));
    }

    /* renamed from: b */
    public static final void m15484b(int i10, int i11, int i12) {
        boolean z6 = false;
        if (i10 >= 0 && i10 <= i11) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbM4566m = AbstractC1452a.m4566m(i12, i10, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        sbM4566m.append(i11);
        sbM4566m.append(']');
        AbstractC4941a.m9886c(sbM4566m.toString());
    }

    /* renamed from: c */
    public static final void m15485c(int i10, int i11, int i12) {
        boolean z6 = false;
        if (i10 >= 0 && i10 <= i11) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        StringBuilder sbM4566m = AbstractC1452a.m4566m(i12, i10, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        sbM4566m.append(i11);
        sbM4566m.append(']');
        AbstractC4941a.m9886c(sbM4566m.toString());
    }
}
