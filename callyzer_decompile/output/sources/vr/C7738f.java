package vr;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import is.C3348b;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vr.f */
/* loaded from: classes3.dex */
public final class C7738f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37304a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f37305b;

    /* renamed from: c */
    public final /* synthetic */ C3348b f37306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7738f(InterfaceC2139c interfaceC2139c, C3348b c3348b, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f37304a = i10;
        this.f37305b = interfaceC2139c;
        this.f37306c = c3348b;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f37304a) {
            case 0:
                return new C7738f(this.f37305b, this.f37306c, interfaceC7559c, 0);
            default:
                return new C7738f(this.f37305b, this.f37306c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f37304a) {
            case 0:
                C7738f c7738f = (C7738f) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c7738f.invokeSuspend(a0Var);
                return a0Var;
            default:
                C7738f c7738f2 = (C7738f) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c7738f2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f37304a;
        qw.a0 a0Var = qw.a0.f30746a;
        C3348b c3348b = this.f37306c;
        InterfaceC2139c interfaceC2139c = this.f37305b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                interfaceC2139c.invoke(new Integer(c3348b.f17717e));
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                interfaceC2139c.invoke(new Integer(c3348b.f17717e));
                break;
        }
        return a0Var;
    }
}
