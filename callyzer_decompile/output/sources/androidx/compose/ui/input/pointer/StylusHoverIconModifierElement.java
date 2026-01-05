package androidx.compose.ui.input.pointer;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import p3.C5803a;
import p3.C5828z;
import v3.C7643o;
import v3.a1;
import w2.AbstractC7878q;
import x1.r0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends a1 {

    /* renamed from: a */
    public final C7643o f2124a;

    public StylusHoverIconModifierElement(C7643o c7643o) {
        this.f2124a = c7643o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        C5803a c5803a = r0.f39667c;
        return c5803a.equals(c5803a) && AbstractC4154l.m8918a(this.f2124a, stylusHoverIconModifierElement.f2124a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C5828z(r0.f39667c, this.f2124a);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(1022 * 31, 31, false);
        C7643o c7643o = this.f2124a;
        return iM4558e + (c7643o != null ? c7643o.hashCode() : 0);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C5828z c5828z = (C5828z) abstractC7878q;
        C5803a c5803a = r0.f39667c;
        if (!AbstractC4154l.m8918a(c5828z.f28424r, c5803a)) {
            c5828z.f28424r = c5803a;
            if (c5828z.f28425s) {
                c5828z.N0();
            }
        }
        c5828z.f28423q = this.f2124a;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + r0.f39667c + ", overrideDescendants=false, touchBoundsExpansion=" + this.f2124a + ')';
    }
}
