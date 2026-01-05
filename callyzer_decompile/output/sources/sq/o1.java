package sq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import uq.C7503i;
import vq.EnumC7729a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f33106a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f33107b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f33108c;

    /* renamed from: d */
    public final /* synthetic */ k2.w0 f33109d;

    public /* synthetic */ o1(InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c, k2.w0 w0Var, int i10) {
        this.f33106a = i10;
        this.f33107b = interfaceC2137a;
        this.f33108c = interfaceC2139c;
        this.f33109d = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f33106a) {
            case 0:
                this.f33107b.invoke();
                this.f33109d.setValue("");
                this.f33108c.invoke("");
                break;
            default:
                this.f33107b.invoke();
                this.f33109d.setValue(Boolean.FALSE);
                this.f33108c.invoke(new C7503i(EnumC7729a.Custom.getIndex()));
                break;
        }
        return qw.a0.f30746a;
    }
}
