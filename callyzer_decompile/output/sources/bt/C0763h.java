package bt;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0763h implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4834a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f4835b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f4836c;

    public /* synthetic */ C0763h(InterfaceC2137a interfaceC2137a, k2.w0 w0Var, int i10) {
        this.f4834a = i10;
        this.f4835b = interfaceC2137a;
        this.f4836c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4834a) {
            case 0:
                this.f4835b.invoke();
                this.f4836c.setValue(Boolean.FALSE);
                break;
            case 1:
                k2.w0 w0Var = this.f4836c;
                if (!((Boolean) w0Var.getValue()).booleanValue()) {
                    w0Var.setValue(Boolean.TRUE);
                    this.f4835b.invoke();
                }
                return qw.a0.f30746a;
            case 2:
                this.f4835b.invoke();
                this.f4836c.setValue(Boolean.FALSE);
                break;
            case 3:
                this.f4835b.invoke();
                this.f4836c.setValue(Boolean.FALSE);
                break;
            case 4:
                InterfaceC2137a interfaceC2137a = this.f4835b;
                if (interfaceC2137a != null) {
                    interfaceC2137a.invoke();
                }
                this.f4836c.setValue(Boolean.TRUE);
                break;
            default:
                this.f4836c.setValue(Boolean.FALSE);
                this.f4835b.invoke();
                break;
        }
        return qw.a0.f30746a;
    }
}
