package nz;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.j */
/* loaded from: classes3.dex */
public final class C5199j implements InterfaceC5211v {

    /* renamed from: a */
    public final C5210u f25344a;

    public C5199j(Throwable th2) {
        this.f25344a = new C5210u(this, null, th2, 2);
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: a */
    public final InterfaceC5211v mo10166a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: c */
    public final C5206q mo10168c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // nz.InterfaceC5211v, oz.InterfaceC5780c
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: d */
    public final boolean mo10169d() {
        return false;
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: e */
    public final C5210u mo10170e() {
        return this.f25344a;
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: g */
    public final C5210u mo10172g() {
        return this.f25344a;
    }
}
