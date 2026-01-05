package yp;

import eq.C2095g;
import ex.InterfaceC2141e;
import lv.C4531c;
import og.od;
import pg.e9;
import qp.C6273j;
import qr.g0;
import qw.C6364n;
import qw.a0;
import rw.C6668r;
import tx.InterfaceC7266z;
import tx.c0;
import ur.j0;
import ur.r0;
import ur.u0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.C8219t;
import wx.c1;
import wx.m1;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yp.c */
/* loaded from: classes3.dex */
public final class C8723c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42194a;

    /* renamed from: b */
    public int f42195b;

    /* renamed from: c */
    public final /* synthetic */ C8735o f42196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8723c(C8735o c8735o, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42194a = i10;
        this.f42196c = c8735o;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42194a) {
            case 0:
                return new C8723c(this.f42196c, interfaceC7559c, 0);
            case 1:
                return new C8723c(this.f42196c, interfaceC7559c, 1);
            case 2:
                return new C8723c(this.f42196c, interfaceC7559c, 2);
            case 3:
                return new C8723c(this.f42196c, interfaceC7559c, 3);
            case 4:
                return new C8723c(this.f42196c, interfaceC7559c, 4);
            case 5:
                return new C8723c(this.f42196c, interfaceC7559c, 5);
            default:
                return new C8723c(this.f42196c, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f42194a) {
        }
        return ((C8723c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object value;
        Object value2;
        int i10 = this.f42194a;
        InterfaceC7559c interfaceC7559c = null;
        int i11 = 0;
        a0 a0Var = a0.f30746a;
        C8735o c8735o = this.f42196c;
        int i12 = 1;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f42195b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f42195b = 1;
                    Object objM16113i = C8735o.m16113i(c8735o, this);
                    if (objM16113i == enumC7794a) {
                        return enumC7794a;
                    }
                    obj2 = objM16113i;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    obj2 = ((C6364n) obj).f30758a;
                }
                return new C6364n(obj2);
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f42195b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                C7806h c7806h = c8735o.f36254d;
                this.f42195b = 1;
                return c7806h.mo14775g(j0.f36232a, this) == enumC7794a2 ? enumC7794a2 : a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f42195b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    c0.m13502y(c8735o.f42270i, null, null, new C2095g(c8735o, (InterfaceC7559c) null), 3);
                    C4531c c4531c = c8735o.f42284w;
                    this.f42195b = 1;
                    if (c4531c.m9378b(this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                m1 m1Var = c8735o.f42276o;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6273j.m12277a((C6273j) value, null, false, false, false, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 4194301)));
                return a0Var;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f42195b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    c8735o.f42273l.getClass();
                    C8219t c8219t = new C8219t(new C8727g(c8735o, interfaceC7559c, i12), x1.f40990o);
                    C8728h c8728h = new C8728h(c8735o, interfaceC7559c, i11);
                    this.f42195b = 1;
                    if (c1.m15379j(c8219t, c8728h, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                c8735o.f42281t = true;
                return a0Var;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f42195b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                C4531c c4531c2 = c8735o.f42284w;
                this.f42195b = 1;
                return c4531c2.m9378b(this) == enumC7794a5 ? enumC7794a5 : a0Var;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f42195b;
                if (i18 == 0) {
                    od.m10798c(obj);
                    this.f42195b = 1;
                    return C8735o.m16115k(c8735o, this) == enumC7794a6 ? enumC7794a6 : a0Var;
                }
                if (i18 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return a0Var;
            default:
                g0 g0Var = c8735o.f42266B;
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f42195b;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                m1 m1Var2 = c8735o.f42276o;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C6273j.m12277a((C6273j) value2, C6668r.f31943a, false, false, false, false, e9.m11603a(g0Var), 0, null, null, false, null, null, null, null, e9.m11604b(g0Var, r0.f36258c, u0.f36264c), false, false, null, null, false, 4128670)));
                C4531c c4531c3 = c8735o.f42284w;
                this.f42195b = 1;
                return c4531c3.m9381e(this) == enumC7794a7 ? enumC7794a7 : a0Var;
        }
    }
}
