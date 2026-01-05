package androidx.compose.material3.internal;

import c9.C0925t;
import ex.InterfaceC2141e;
import h2.C2814s;
import k1.x0;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends a1 {

    /* renamed from: a */
    public final C0925t f2079a;

    /* renamed from: b */
    public final InterfaceC2141e f2080b;

    /* renamed from: c */
    public final x0 f2081c;

    public DraggableAnchorsElement(C0925t c0925t, InterfaceC2141e interfaceC2141e, x0 x0Var) {
        this.f2079a = c0925t;
        this.f2080b = interfaceC2141e;
        this.f2081c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return AbstractC4154l.m8918a(this.f2079a, draggableAnchorsElement.f2079a) && this.f2080b == draggableAnchorsElement.f2080b && this.f2081c == draggableAnchorsElement.f2081c;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C2814s c2814s = new C2814s();
        c2814s.f15769q = this.f2079a;
        c2814s.f15770r = this.f2080b;
        c2814s.f15771s = this.f2081c;
        return c2814s;
    }

    public final int hashCode() {
        return this.f2081c.hashCode() + ((this.f2080b.hashCode() + (this.f2079a.hashCode() * 31)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C2814s c2814s = (C2814s) abstractC7878q;
        c2814s.f15769q = this.f2079a;
        c2814s.f15770r = this.f2080b;
        c2814s.f15771s = this.f2081c;
    }
}
