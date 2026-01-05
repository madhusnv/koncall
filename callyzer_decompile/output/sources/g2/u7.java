package g2;

import ex.InterfaceC2139c;
import ex.InterfaceC2142f;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u7 extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public /* synthetic */ float f12872a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f12873b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f12873b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        u7 u7Var = new u7(this.f12873b, (InterfaceC7559c) obj3);
        u7Var.f12872a = fFloatValue;
        qw.a0 a0Var = qw.a0.f30746a;
        u7Var.invokeSuspend(a0Var);
        return a0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        og.od.m10798c(obj);
        this.f12873b.invoke(new Float(this.f12872a));
        return qw.a0.f30746a;
    }
}
