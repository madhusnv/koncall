package ge;

import d7.AbstractC1646r;
import d7.InterfaceC1633f;
import d7.InterfaceC1649u;
import tx.e1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.a */
/* loaded from: classes.dex */
public final class C2569a implements InterfaceC1633f {

    /* renamed from: a */
    public final AbstractC1646r f13981a;

    /* renamed from: b */
    public final e1 f13982b;

    public C2569a(AbstractC1646r abstractC1646r, e1 e1Var) {
        this.f13981a = abstractC1646r;
        this.f13982b = e1Var;
    }

    @Override // d7.InterfaceC1633f
    public final void onDestroy(InterfaceC1649u interfaceC1649u) {
        this.f13982b.mo13510j(null);
    }
}
