package androidx.compose.ui.layout;

import ex.InterfaceC2139c;
import t3.s0;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends a1 {

    /* renamed from: a */
    public final InterfaceC2139c f2131a;

    public OnSizeChangedModifier(InterfaceC2139c interfaceC2139c) {
        this.f2131a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f2131a == ((OnSizeChangedModifier) obj).f2131a;
        }
        return false;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        s0 s0Var = new s0();
        s0Var.f34024q = this.f2131a;
        long j6 = Integer.MIN_VALUE;
        s0Var.f34025r = (j6 & 4294967295L) | (j6 << 32);
        return s0Var;
    }

    public final int hashCode() {
        return this.f2131a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        s0 s0Var = (s0) abstractC7878q;
        s0Var.f34024q = this.f2131a;
        long j6 = Integer.MIN_VALUE;
        s0Var.f34025r = (j6 & 4294967295L) | (j6 << 32);
    }
}
