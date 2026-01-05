package androidx.compose.ui.input.key;

import ex.InterfaceC2139c;
import n3.C4951e;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class KeyInputElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2139c f2118a;

    /* renamed from: b */
    public final InterfaceC2139c f2119b;

    public KeyInputElement(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2) {
        this.f2118a = interfaceC2139c;
        this.f2119b = interfaceC2139c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f2118a == keyInputElement.f2118a && this.f2119b == keyInputElement.f2119b;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C4951e c4951e = new C4951e();
        c4951e.f24635q = this.f2118a;
        c4951e.f24636r = this.f2119b;
        return c4951e;
    }

    public final int hashCode() {
        InterfaceC2139c interfaceC2139c = this.f2118a;
        int iHashCode = (interfaceC2139c != null ? interfaceC2139c.hashCode() : 0) * 31;
        InterfaceC2139c interfaceC2139c2 = this.f2119b;
        return iHashCode + (interfaceC2139c2 != null ? interfaceC2139c2.hashCode() : 0);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C4951e c4951e = (C4951e) abstractC7878q;
        c4951e.f24635q = this.f2118a;
        c4951e.f24636r = this.f2119b;
    }
}
