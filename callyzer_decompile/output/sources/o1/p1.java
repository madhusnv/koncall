package o1;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import p1.AbstractC5788a;
import w2.C7870i;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 implements o1 {

    /* renamed from: a */
    public static final p1 f25811a = new p1();

    @Override // o1.o1
    /* renamed from: a */
    public final InterfaceC7879r mo10363a(InterfaceC7879r interfaceC7879r, C7870i c7870i) {
        return interfaceC7879r.mo14852e(new VerticalAlignElement(c7870i));
    }

    @Override // o1.o1
    /* renamed from: b */
    public final InterfaceC7879r mo10364b(float f6, InterfaceC7879r interfaceC7879r, boolean z6) {
        if (f6 <= 0.0d) {
            AbstractC5788a.m11338a("invalid weight; must be greater than zero");
        }
        if (f6 > Float.MAX_VALUE) {
            f6 = Float.MAX_VALUE;
        }
        return interfaceC7879r.mo14852e(new LayoutWeightElement(f6, z6));
    }
}
