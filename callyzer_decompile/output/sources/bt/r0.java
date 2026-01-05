package bt;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4910a;

    /* renamed from: b */
    public final /* synthetic */ k2.w0 f4911b;

    public /* synthetic */ r0(k2.w0 w0Var, int i10) {
        this.f4910a = i10;
        this.f4911b = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4910a) {
            case 0:
                this.f4911b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 1:
                this.f4911b.setValue(Boolean.TRUE);
                break;
            case 2:
                this.f4911b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            default:
                this.f4911b.setValue(Boolean.TRUE);
                break;
        }
        return qw.a0.f30746a;
    }
}
