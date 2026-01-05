package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.AbstractC4154l;
import p3.C5803a;
import p3.C5814l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends a1 {

    /* renamed from: a */
    public final C5803a f2123a;

    public PointerHoverIconModifierElement(C5803a c5803a) {
        this.f2123a = c5803a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && this.f2123a.equals(((PointerHoverIconModifierElement) obj).f2123a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C5814l(this.f2123a, null);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f2123a.f28408b * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C5814l c5814l = (C5814l) abstractC7878q;
        C5803a c5803a = c5814l.f28424r;
        C5803a c5803a2 = this.f2123a;
        if (AbstractC4154l.m8918a(c5803a, c5803a2)) {
            return;
        }
        c5814l.f28424r = c5803a2;
        if (c5814l.f28425s) {
            c5814l.N0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f2123a + ", overrideDescendants=false)";
    }
}
