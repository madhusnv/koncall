package d3;

import aq.C0408k;
import ex.InterfaceC2139c;
import rw.C6669s;
import t3.w0;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.n */
/* loaded from: classes.dex */
public final class C1560n extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public InterfaceC2139c f7800q;

    public C1560n(InterfaceC2139c interfaceC2139c) {
        this.f7800q = interfaceC2139c;
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        w0 w0VarMo13314z = i0Var.mo13314z(j6);
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, C6669s.f31944a, new C0408k(3, w0VarMo13314z, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f7800q + ')';
    }
}
