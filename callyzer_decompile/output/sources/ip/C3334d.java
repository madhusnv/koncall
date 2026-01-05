package ip;

import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import qp.C6266c;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ip.d */
/* loaded from: classes3.dex */
public final class C3334d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f17636a;

    /* renamed from: b */
    public final /* synthetic */ C3342l f17637b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3334d(C3342l c3342l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f17636a = i10;
        this.f17637b = c3342l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f17636a) {
            case 0:
                return new C3334d(this.f17637b, interfaceC7559c, 0);
            default:
                return new C3334d(this.f17637b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17636a) {
            case 0:
                C3334d c3334d = (C3334d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c3334d.invokeSuspend(a0Var);
                return a0Var;
            default:
                return ((C3334d) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f17636a;
        C3342l c3342l = this.f17637b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c3342l.f17691g, null, null, new C3333c(c3342l, null, 2), 3);
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((C6266c) c3342l.f17699o.f39340a.getValue()).f30389p + 1);
        }
    }
}
