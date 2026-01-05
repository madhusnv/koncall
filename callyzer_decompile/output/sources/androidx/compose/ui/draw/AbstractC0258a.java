package androidx.compose.ui.draw;

import d3.C1559m;
import ex.InterfaceC2139c;
import i3.AbstractC3166c;
import t3.InterfaceC7023j;
import w2.C7864c;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.ui.draw.a */
/* loaded from: classes.dex */
public abstract class AbstractC0258a {
    /* renamed from: a */
    public static final InterfaceC7879r m707a(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new DrawBehindElement(interfaceC2139c));
    }

    /* renamed from: b */
    public static final InterfaceC7879r m708b(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new DrawWithCacheElement(interfaceC2139c));
    }

    /* renamed from: c */
    public static final InterfaceC7879r m709c(InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c) {
        return interfaceC7879r.mo14852e(new DrawWithContentElement(interfaceC2139c));
    }

    /* renamed from: d */
    public static InterfaceC7879r m710d(InterfaceC7879r interfaceC7879r, AbstractC3166c abstractC3166c, InterfaceC7866e interfaceC7866e, InterfaceC7023j interfaceC7023j, float f6, C1559m c1559m, int i10) {
        if ((i10 & 4) != 0) {
            interfaceC7866e = C7864c.f37646e;
        }
        InterfaceC7866e interfaceC7866e2 = interfaceC7866e;
        if ((i10 & 16) != 0) {
            f6 = 1.0f;
        }
        return interfaceC7879r.mo14852e(new PainterElement(abstractC3166c, interfaceC7866e2, interfaceC7023j, f6, c1559m));
    }
}
