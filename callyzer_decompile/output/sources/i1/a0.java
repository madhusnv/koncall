package i1;

import ab.C0084b;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import f3.C2196b;
import f3.InterfaceC2198d;
import m1.InterfaceC4629k;
import v3.InterfaceC7644p;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC7878q implements InterfaceC7644p {

    /* renamed from: q */
    public final InterfaceC4629k f16783q;

    /* renamed from: r */
    public boolean f16784r;

    /* renamed from: s */
    public boolean f16785s;

    /* renamed from: t */
    public boolean f16786t;

    public a0(InterfaceC4629k interfaceC4629k) {
        this.f16783q = interfaceC4629k;
    }

    @Override // w2.AbstractC7878q
    public final void D0() {
        tx.c0.m13502y(z0(), null, null, new C0084b(this, null, 23), 3);
    }

    @Override // v3.InterfaceC7644p
    public final void h0(v3.i0 i0Var) {
        i0Var.m14622b();
        C2196b c2196b = i0Var.f36917a;
        if (this.f16784r) {
            InterfaceC2198d.o0(i0Var, C1565s.m5186b(0.3f, 14, C1565s.f7809b), 0L, c2196b.mo5913e(), DefinitionKt.NO_Float_VALUE, null, 122);
        } else if (this.f16785s || this.f16786t) {
            InterfaceC2198d.o0(i0Var, C1565s.m5186b(0.1f, 14, C1565s.f7809b), 0L, c2196b.mo5913e(), DefinitionKt.NO_Float_VALUE, null, 122);
        }
    }
}
