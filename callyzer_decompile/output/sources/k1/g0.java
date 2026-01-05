package k1;

import c3.C0847b;
import ex.InterfaceC2142f;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f20102a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i10, int i11, InterfaceC7559c interfaceC7559c) {
        super(i10, interfaceC7559c);
        this.f20102a = i11;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f20102a) {
            case 0:
                long j6 = ((C0847b) obj2).f5352a;
                g0 g0Var = new g0(3, 0, (InterfaceC7559c) obj3);
                qw.a0 a0Var = qw.a0.f30746a;
                g0Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                ((Number) obj2).floatValue();
                g0 g0Var2 = new g0(3, 1, (InterfaceC7559c) obj3);
                qw.a0 a0Var2 = qw.a0.f30746a;
                g0Var2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                long j10 = ((C0847b) obj2).f5352a;
                g0 g0Var3 = new g0(3, 2, (InterfaceC7559c) obj3);
                qw.a0 a0Var3 = qw.a0.f30746a;
                g0Var3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f20102a;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                break;
        }
        return a0Var;
    }
}
