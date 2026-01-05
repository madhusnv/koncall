package androidx.compose.ui.graphics;

import d3.C1560n;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import v3.AbstractC7634f;
import v3.a1;
import v3.h1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends a1 {

    /* renamed from: a */
    public final InterfaceC2139c f2107a;

    public BlockGraphicsLayerElement(InterfaceC2139c interfaceC2139c) {
        this.f2107a = interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && AbstractC4154l.m8918a(this.f2107a, ((BlockGraphicsLayerElement) obj).f2107a);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C1560n(this.f2107a);
    }

    public final int hashCode() {
        return this.f2107a.hashCode();
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C1560n c1560n = (C1560n) abstractC7878q;
        c1560n.f7800q = this.f2107a;
        h1 h1Var = AbstractC7634f.m14561v(c1560n, 2).f36903n;
        if (h1Var != null) {
            h1Var.p1(c1560n.f7800q, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f2107a + ')';
    }
}
