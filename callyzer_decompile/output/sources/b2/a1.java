package b2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import aq.C0405h;
import cp.C1476g;
import g2.o5;
import i1.AbstractC3126e;
import i1.C3128g;
import k1.r1;
import p3.InterfaceC5822t;
import q3.C6105e;
import t1.AbstractC7000y;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import y1.C8529a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ int f3693a;

    /* renamed from: b */
    public final /* synthetic */ Object f3694b;

    public /* synthetic */ a1(int i10, Object obj) {
        this.f3693a = i10;
        this.f3694b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        switch (this.f3693a) {
            case 0:
                Object objM13488k = tx.c0.m13488k(new C0405h(interfaceC5822t, (x1.d1) this.f3694b, null, 23), interfaceC7559c);
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                qw.a0 a0Var = qw.a0.f30746a;
                if (objM13488k != enumC7794a) {
                    objM13488k = a0Var;
                }
                if (objM13488k == enumC7794a) {
                    break;
                }
                break;
            case 1:
                Object objP0 = ((AbstractC3126e) this.f3694b).P0(interfaceC5822t, interfaceC7559c);
                if (objP0 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objM8472c = r1.m8472c(interfaceC5822t, new o5((C3128g) this.f3694b, null, 1), interfaceC7559c);
                if (objM8472c != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                C6105e c6105e = new C6105e();
                k1.f0 f0Var = (k1.f0) this.f3694b;
                Object objM13488k2 = tx.c0.m13488k(new fk.t0(f0Var, interfaceC5822t, new j0(7, f0Var, c6105e), new C0566x(15, c6105e, interfaceC5822t, f0Var), new k1.a0(f0Var, 0), new k1.a0(f0Var, 1), new C1476g(15, c6105e, f0Var), null, 1), interfaceC7559c);
                if (objM13488k2 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objM13488k3 = tx.c0.m13488k(new ps.c0(interfaceC5822t, (AbstractC7000y) this.f3694b, null, 24), interfaceC7559c);
                if (objM13488k3 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objM8472c2 = r1.m8472c(interfaceC5822t, new C0567y((C8529a) this.f3694b, null, 2), interfaceC7559c);
                if (objM8472c2 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
