package h1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2141e;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public /* synthetic */ float f15414a;

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        f0 f0Var = new f0(2, interfaceC7559c);
        f0Var.f15414a = ((Number) obj).floatValue();
        return f0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        od.m10798c(obj);
        return Boolean.valueOf(this.f15414a > DefinitionKt.NO_Float_VALUE);
    }
}
