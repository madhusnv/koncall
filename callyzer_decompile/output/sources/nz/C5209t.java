package nz;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nz.t */
/* loaded from: classes3.dex */
public final class C5209t implements InterfaceC5211v {

    /* renamed from: a */
    public final C5206q f25419a;

    public C5209t(C5206q c5206q) {
        this.f25419a = c5206q;
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: a */
    public final InterfaceC5211v mo10166a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: c */
    public final C5206q mo10168c() {
        return this.f25419a;
    }

    @Override // nz.InterfaceC5211v, oz.InterfaceC5780c
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: d */
    public final boolean mo10169d() {
        return true;
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: e */
    public final C5210u mo10170e() {
        throw new IllegalStateException("already connected");
    }

    @Override // nz.InterfaceC5211v
    /* renamed from: g */
    public final C5210u mo10172g() {
        throw new IllegalStateException("already connected");
    }
}
