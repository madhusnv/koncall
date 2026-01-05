package g2;

import c3.C0847b;
import ex.InterfaceC2142f;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t1 extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public /* synthetic */ long f12728a;

    /* renamed from: b */
    public final /* synthetic */ u1 f12729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f12729b = u1Var;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j6 = ((C0847b) obj2).f5352a;
        t1 t1Var = new t1(this.f12729b, (InterfaceC7559c) obj3);
        t1Var.f12728a = j6;
        qw.a0 a0Var = qw.a0.f30746a;
        t1Var.invokeSuspend(a0Var);
        return a0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        og.od.m10798c(obj);
        long j6 = this.f12728a;
        float fM2273d = C0847b.m2273d(j6);
        u1 u1Var = this.f12729b;
        u1Var.f12826w = fM2273d;
        u1Var.f12827x = C0847b.m2274e(j6);
        return qw.a0.f30746a;
    }
}
