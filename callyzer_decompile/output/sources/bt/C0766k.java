package bt;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0766k implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4859a = 1;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f4860b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f4861c;

    /* renamed from: d */
    public final /* synthetic */ k2.w0 f4862d;

    public /* synthetic */ C0766k(InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, k2.w0 w0Var) {
        this.f4860b = interfaceC2137a;
        this.f4861c = interfaceC2137a2;
        this.f4862d = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4859a) {
            case 0:
                this.f4862d.setValue(Boolean.FALSE);
                this.f4860b.invoke();
                this.f4861c.invoke();
                break;
            default:
                this.f4862d.setValue(Boolean.FALSE);
                this.f4860b.invoke();
                this.f4861c.invoke();
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C0766k(k2.w0 w0Var, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2) {
        this.f4862d = w0Var;
        this.f4860b = interfaceC2137a;
        this.f4861c = interfaceC2137a2;
    }
}
