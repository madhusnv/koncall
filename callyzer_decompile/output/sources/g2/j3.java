package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j3 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f11846a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f11847b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(int i10, InterfaceC2139c interfaceC2139c) {
        super(0);
        this.f11846a = i10;
        this.f11847b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f11846a) {
            case 0:
                this.f11847b.invoke(new a5(1));
                break;
            case 1:
                this.f11847b.invoke(new a5(0));
                break;
            case 2:
                this.f11847b.invoke(Boolean.FALSE);
                break;
            default:
                d3.i0 i0Var = v3.h1.f36888L;
                this.f11847b.invoke(i0Var);
                i0Var.f7776x = i0Var.f7770q.mo399i(i0Var.f7773t, i0Var.f7775w, i0Var.f7774v);
                break;
        }
        return qw.a0.f30746a;
    }
}
