package o1;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import mm.AbstractC4801l;
import p1.AbstractC5788a;
import w2.C7869h;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 implements InterfaceC5262u {

    /* renamed from: a */
    public static final e0 f25719a = new e0();

    @Override // o1.InterfaceC5262u
    /* renamed from: a */
    public final InterfaceC7879r mo10337a(InterfaceC7879r interfaceC7879r, boolean z6) {
        if (1.0f <= 0.0d) {
            AbstractC5788a.m11338a("invalid weight; must be greater than zero");
        }
        return AbstractC4801l.m9747u(1.0f, interfaceC7879r, z6);
    }

    @Override // o1.InterfaceC5262u
    /* renamed from: b */
    public final InterfaceC7879r mo10338b(InterfaceC7879r interfaceC7879r, C7869h c7869h) {
        return interfaceC7879r.mo14852e(new HorizontalAlignElement(c7869h));
    }
}
