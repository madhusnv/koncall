package t3;

import ex.InterfaceC2141e;
import k2.AbstractC3969r;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33976a;

    /* renamed from: b */
    public final /* synthetic */ f1 f33977b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(f1 f1Var, int i10) {
        super(2);
        this.f33976a = i10;
        this.f33977b = f1Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33976a) {
            case 0:
                this.f33977b.m13292a().f33980b = (AbstractC3969r) obj2;
                break;
            case 1:
                f0 f0VarM13292a = this.f33977b.m13292a();
                ((v3.g0) obj).b0(new c0(f0VarM13292a, (InterfaceC2141e) obj2, f0VarM13292a.f33994r));
                break;
            default:
                v3.g0 g0Var = (v3.g0) obj;
                f1 f1Var = this.f33977b;
                h1 h1Var = f1Var.f33995a;
                f0 f0Var = g0Var.f36834M;
                if (f0Var == null) {
                    f0Var = new f0(g0Var, h1Var);
                    g0Var.f36834M = f0Var;
                }
                f1Var.f33996b = f0Var;
                f1Var.m13292a().m13287d();
                f0 f0VarM13292a2 = f1Var.m13292a();
                if (f0VarM13292a2.f33981c != h1Var) {
                    f0VarM13292a2.f33981c = h1Var;
                    f0VarM13292a2.m13288e(false);
                    v3.g0.m14568W(f0VarM13292a2.f33979a, false, 7);
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
