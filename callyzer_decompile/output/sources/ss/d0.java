package ss;

import ex.InterfaceC2141e;
import im.EnumC3318t;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33419a;

    /* renamed from: b */
    public int f33420b;

    /* renamed from: c */
    public /* synthetic */ Object f33421c;

    /* renamed from: d */
    public final /* synthetic */ z0 f33422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(z0 z0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f33419a = i10;
        this.f33422d = z0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33419a) {
            case 0:
                d0 d0Var = new d0(this.f33422d, interfaceC7559c, 0);
                d0Var.f33421c = obj;
                return d0Var;
            default:
                d0 d0Var2 = new d0(this.f33422d, interfaceC7559c, 1);
                d0Var2.f33421c = obj;
                return d0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33419a) {
            case 0:
                return ((d0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((d0) create((EnumC3318t) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f33419a) {
            case 0:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f33421c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f33420b;
                z0 z0Var = this.f33422d;
                if (i10 == 0) {
                    od.m10798c(obj);
                    rn.h0 h0Var = z0Var.f33551h;
                    this.f33421c = interfaceC7266z;
                    this.f33420b = 1;
                    obj = h0Var.f31523e.m15619b(this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return qw.a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                InterfaceC7559c interfaceC7559c = null;
                if (((Boolean) obj).booleanValue()) {
                    tx.c0.m13502y(interfaceC7266z, null, null, new b0(z0Var, interfaceC7559c, 8), 3);
                    tx.c0.m13502y(interfaceC7266z, null, null, new c0(z0Var, interfaceC7559c, 3), 3);
                    tx.c0.m13502y(interfaceC7266z, null, null, new b0(z0Var, interfaceC7559c, 9), 3);
                }
                this.f33421c = null;
                this.f33420b = 2;
                if (z0.m13190m(z0Var, this) == enumC7794a) {
                    return enumC7794a;
                }
                return qw.a0.f30746a;
            default:
                EnumC3318t enumC3318t = (EnumC3318t) this.f33421c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f33420b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f33422d.f33569z;
                    this.f33421c = null;
                    this.f33420b = 1;
                    if (c7806h.mo14775g(enumC3318t, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
