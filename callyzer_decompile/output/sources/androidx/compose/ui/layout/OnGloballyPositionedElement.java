package androidx.compose.ui.layout;

import ex.InterfaceC2139c;
import t3.r0;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2139c f2130a;

    public OnGloballyPositionedElement(InterfaceC2139c interfaceC2139c) {
        this.f2130a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f2130a == ((OnGloballyPositionedElement) obj).f2130a;
        }
        return false;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        r0 r0Var = new r0();
        r0Var.f34021q = this.f2130a;
        return r0Var;
    }

    public final int hashCode() {
        return this.f2130a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((r0) abstractC7878q).f34021q = this.f2130a;
    }
}
