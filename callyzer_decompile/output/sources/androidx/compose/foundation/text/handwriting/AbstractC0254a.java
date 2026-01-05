package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import ex.InterfaceC2137a;
import v3.C7643o;
import w2.C7876o;
import w2.InterfaceC7879r;
import y1.AbstractC8530b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.text.handwriting.a */
/* loaded from: classes.dex */
public abstract class AbstractC0254a {

    /* renamed from: a */
    public static final C7643o f2030a;

    static {
        float f6 = 40;
        float f10 = 10;
        f2030a = new C7643o(f10, f6, f10, f6);
    }

    /* renamed from: a */
    public static final InterfaceC7879r m700a(boolean z6, boolean z10, InterfaceC2137a interfaceC2137a) {
        InterfaceC7879r stylusHoverIconModifierElement = C7876o.f37669a;
        if (!z6 || !AbstractC8530b.f41455a) {
            return stylusHoverIconModifierElement;
        }
        if (z10) {
            stylusHoverIconModifierElement = new StylusHoverIconModifierElement(f2030a);
        }
        return stylusHoverIconModifierElement.mo14852e(new StylusHandwritingElement(interfaceC2137a));
    }
}
