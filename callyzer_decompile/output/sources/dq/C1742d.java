package dq;

import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import qp.C6274k;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dq.d */
/* loaded from: classes3.dex */
public final class C1742d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8417a;

    /* renamed from: b */
    public final /* synthetic */ C1750l f8418b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1742d(C1750l c1750l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8417a = i10;
        this.f8418b = c1750l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8417a) {
            case 0:
                return new C1742d(this.f8418b, interfaceC7559c, 0);
            case 1:
                return new C1742d(this.f8418b, interfaceC7559c, 1);
            default:
                return new C1742d(this.f8418b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8417a) {
            case 0:
                C1742d c1742d = (C1742d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c1742d.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                return ((C1742d) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                C1742d c1742d2 = (C1742d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c1742d2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f8417a;
        a0 a0Var = a0.f30746a;
        C1750l c1750l = this.f8418b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c1750l.f8468g, null, null, new C1741c(c1750l, null, 2), 3);
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((C6274k) c1750l.f8476o.f39340a.getValue()).f30481p + 1);
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c1750l.m14294g();
                return a0Var;
        }
    }
}
