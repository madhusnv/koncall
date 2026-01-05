package androidx.compose.ui.draw;

import a3.C0048g;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class DrawWithContentElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2139c f2091a;

    public DrawWithContentElement(InterfaceC2139c interfaceC2139c) {
        this.f2091a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && AbstractC4154l.m8918a(this.f2091a, ((DrawWithContentElement) obj).f2091a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C0048g c0048g = new C0048g();
        c0048g.f204q = this.f2091a;
        return c0048g;
    }

    public final int hashCode() {
        return this.f2091a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        ((C0048g) abstractC7878q).f204q = this.f2091a;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f2091a + ')';
    }
}
