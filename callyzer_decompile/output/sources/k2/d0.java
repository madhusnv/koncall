package k2;

import ex.InterfaceC2139c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 implements r1 {

    /* renamed from: a */
    public final InterfaceC2139c f20364a;

    /* renamed from: b */
    public e0 f20365b;

    public d0(InterfaceC2139c interfaceC2139c) {
        this.f20364a = interfaceC2139c;
    }

    @Override // k2.r1
    /* renamed from: c */
    public final void mo5875c() {
        e0 e0Var = this.f20365b;
        if (e0Var != null) {
            e0Var.dispose();
        }
        this.f20365b = null;
    }

    @Override // k2.r1
    /* renamed from: e */
    public final void mo5876e() {
        this.f20365b = (e0) this.f20364a.invoke(C3953b.f20348b);
    }

    @Override // k2.r1
    /* renamed from: b */
    public final void mo5874b() {
    }
}
