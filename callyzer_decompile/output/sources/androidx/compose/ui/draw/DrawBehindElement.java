package androidx.compose.ui.draw;

import a3.C0047f;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class DrawBehindElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2139c f2089a;

    public DrawBehindElement(InterfaceC2139c interfaceC2139c) {
        this.f2089a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && AbstractC4154l.m8918a(this.f2089a, ((DrawBehindElement) obj).f2089a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C0047f c0047f = new C0047f();
        c0047f.f203q = this.f2089a;
        return c0047f;
    }

    public final int hashCode() {
        return this.f2089a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C0047f) abstractC7878q).f203q = this.f2089a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f2089a + ')';
    }
}
