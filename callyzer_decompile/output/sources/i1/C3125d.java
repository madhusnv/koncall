package i1;

import ex.InterfaceC2141e;
import gs.C2715a;
import m1.C4626h;
import m1.C4627i;
import m1.InterfaceC4630l;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.d */
/* loaded from: classes.dex */
public final class C3125d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16817a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC3126e f16818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3125d(AbstractC3126e abstractC3126e, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16817a = i10;
        this.f16818b = abstractC3126e;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16817a) {
            case 0:
                return new C3125d(this.f16818b, interfaceC7559c, 0);
            default:
                return new C3125d(this.f16818b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f16817a) {
            case 0:
                C3125d c3125d = (C3125d) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c3125d.invokeSuspend(a0Var);
                return a0Var;
            default:
                C3125d c3125d2 = (C3125d) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c3125d2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f16817a;
        qw.a0 a0Var = qw.a0.f30746a;
        InterfaceC7559c interfaceC7559c = null;
        AbstractC3126e abstractC3126e = this.f16818b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (abstractC3126e.f16835E == null) {
                    C4626h c4626h = new C4626h();
                    InterfaceC4630l interfaceC4630l = abstractC3126e.f16841s;
                    if (interfaceC4630l != null) {
                        tx.c0.m13502y(abstractC3126e.z0(), null, null, new C2715a(interfaceC4630l, c4626h, interfaceC7559c, 9), 3);
                    }
                    abstractC3126e.f16835E = c4626h;
                    break;
                }
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C4626h c4626h2 = abstractC3126e.f16835E;
                if (c4626h2 != null) {
                    C4627i c4627i = new C4627i(c4626h2);
                    InterfaceC4630l interfaceC4630l2 = abstractC3126e.f16841s;
                    if (interfaceC4630l2 != null) {
                        tx.c0.m13502y(abstractC3126e.z0(), null, null, new C2715a(interfaceC4630l2, c4627i, interfaceC7559c, 10), 3);
                    }
                    abstractC3126e.f16835E = null;
                    break;
                }
                break;
        }
        return a0Var;
    }
}
