package d7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends c0 implements InterfaceC1647s {

    /* renamed from: e */
    public final InterfaceC1649u f8070e;

    /* renamed from: f */
    public final /* synthetic */ d0 f8071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, InterfaceC1649u interfaceC1649u, h0 h0Var) {
        super(d0Var, h0Var);
        this.f8071f = d0Var;
        this.f8070e = interfaceC1649u;
    }

    @Override // d7.c0
    /* renamed from: b */
    public final void mo5305b() {
        this.f8070e.getLifecycle().mo5346d(this);
    }

    @Override // d7.c0
    /* renamed from: c */
    public final boolean mo5306c(InterfaceC1649u interfaceC1649u) {
        return this.f8070e == interfaceC1649u;
    }

    @Override // d7.c0
    /* renamed from: d */
    public final boolean mo5302d() {
        return this.f8070e.getLifecycle().mo5344b().isAtLeast(EnumC1645q.STARTED);
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        InterfaceC1649u interfaceC1649u2 = this.f8070e;
        EnumC1645q enumC1645qMo5344b = interfaceC1649u2.getLifecycle().mo5344b();
        if (enumC1645qMo5344b == EnumC1645q.DESTROYED) {
            this.f8071f.mo5320j(this.f8075a);
            return;
        }
        EnumC1645q enumC1645q = null;
        while (enumC1645q != enumC1645qMo5344b) {
            m5308a(mo5302d());
            enumC1645q = enumC1645qMo5344b;
            enumC1645qMo5344b = interfaceC1649u2.getLifecycle().mo5344b();
        }
    }
}
