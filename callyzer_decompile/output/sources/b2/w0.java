package b2;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3852a;

    /* renamed from: b */
    public final /* synthetic */ y0 f3853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(y0 y0Var, int i10) {
        super(0);
        this.f3852a = i10;
        this.f3853b = y0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ex.a, kotlin.jvm.internal.m] */
    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f3852a) {
            case 0:
                ?? r02 = this.f3853b.f3872g;
                if (r02 != 0) {
                    r02.invoke();
                }
                break;
            case 1:
                y0 y0Var = this.f3853b;
                InterfaceC7266z interfaceC7266z = y0Var.f3874i;
                if (interfaceC7266z != null) {
                    tx.c0.m13502y(interfaceC7266z, null, tx.b0.UNDISPATCHED, new x0(y0Var, null, 0), 1);
                }
                y0Var.m1702l();
                break;
            case 2:
                y0 y0Var2 = this.f3853b;
                InterfaceC7266z interfaceC7266z2 = y0Var2.f3874i;
                if (interfaceC7266z2 != null) {
                    tx.c0.m13502y(interfaceC7266z2, null, tx.b0.UNDISPATCHED, new x0(y0Var2, null, 1), 1);
                }
                y0Var2.m1702l();
                break;
            case 3:
                y0 y0Var3 = this.f3853b;
                InterfaceC7266z interfaceC7266z3 = y0Var3.f3874i;
                if (interfaceC7266z3 != null) {
                    tx.c0.m13502y(interfaceC7266z3, null, tx.b0.UNDISPATCHED, new x0(y0Var3, null, 2), 1);
                }
                y0Var3.m1702l();
                break;
            default:
                this.f3853b.m1704n();
                break;
        }
        return qw.a0.f30746a;
    }
}
