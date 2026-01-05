package androidx.compose.ui.input.nestedscroll;

import a2.C0036i;
import kotlin.jvm.internal.AbstractC4154l;
import o3.C5281d;
import o3.C5284g;
import o3.InterfaceC5278a;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class NestedScrollElement extends a1 {

    /* renamed from: a */
    public final InterfaceC5278a f2120a;

    /* renamed from: b */
    public final C5281d f2121b;

    public NestedScrollElement(InterfaceC5278a interfaceC5278a, C5281d c5281d) {
        this.f2120a = interfaceC5278a;
        this.f2121b = c5281d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return AbstractC4154l.m8918a(nestedScrollElement.f2120a, this.f2120a) && AbstractC4154l.m8918a(nestedScrollElement.f2121b, this.f2121b);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C5284g(this.f2120a, this.f2121b);
    }

    public final int hashCode() {
        int iHashCode = this.f2120a.hashCode() * 31;
        C5281d c5281d = this.f2121b;
        return iHashCode + (c5281d != null ? c5281d.hashCode() : 0);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C5284g c5284g = (C5284g) abstractC7878q;
        c5284g.f25950q = this.f2120a;
        C5281d c5281d = c5284g.f25951r;
        if (c5281d.f25935a == c5284g) {
            c5281d.f25935a = null;
        }
        C5281d c5281d2 = this.f2121b;
        if (c5281d2 == null) {
            c5284g.f25951r = new C5281d();
        } else if (!c5281d2.equals(c5281d)) {
            c5284g.f25951r = c5281d2;
        }
        if (c5284g.f37683p) {
            C5281d c5281d3 = c5284g.f25951r;
            c5281d3.f25935a = c5284g;
            c5281d3.f25936b = null;
            c5284g.f25952s = null;
            c5281d3.f25937c = new C0036i(29, c5284g);
            c5281d3.f25938d = c5284g.z0();
        }
    }
}
