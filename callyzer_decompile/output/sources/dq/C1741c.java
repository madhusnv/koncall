package dq;

import eo.C2082h;
import ex.InterfaceC2141e;
import lv.C4531c;
import og.od;
import qp.C6274k;
import qw.a0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import ur.j0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import wx.m1;
import wx.v0;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dq.c */
/* loaded from: classes3.dex */
public final class C1741c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8414a;

    /* renamed from: b */
    public int f8415b;

    /* renamed from: c */
    public final /* synthetic */ C1750l f8416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1741c(C1750l c1750l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8414a = i10;
        this.f8416c = c1750l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8414a) {
            case 0:
                return new C1741c(this.f8416c, interfaceC7559c, 0);
            case 1:
                return new C1741c(this.f8416c, interfaceC7559c, 1);
            case 2:
                return new C1741c(this.f8416c, interfaceC7559c, 2);
            case 3:
                return new C1741c(this.f8416c, interfaceC7559c, 3);
            default:
                return new C1741c(this.f8416c, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8414a) {
        }
        return ((C1741c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM15700p;
        Object value;
        switch (this.f8414a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f8415b;
                C1750l c1750l = this.f8416c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2082h c2082h = c1750l.f8469h;
                    this.f8415b = 1;
                    objM15700p = c2082h.f9747b.m15700p(this);
                    if (objM15700p == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM15700p = obj;
                }
                EnumC7204p enumC7204p = (EnumC7204p) objM15700p;
                m1 m1Var = c1750l.f8475n;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6274k.m12278a((C6274k) value, null, false, enumC7204p, null, null, null, false, false, false, false, false, false, 0, false, false, 262127)));
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f8415b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f8416c.f36254d;
                    this.f8415b = 1;
                    if (c7806h.mo14775g(j0.f36232a, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f8415b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C1750l c1750l2 = this.f8416c;
                    c1750l2.f8473l.getClass();
                    v0 v0Var = x1.f40990o;
                    C1747i c1747i = new C1747i(c1750l2, null, 0);
                    this.f8415b = 1;
                    if (c1.m15379j(v0Var, c1747i, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f8415b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = this.f8416c.f8477p;
                    this.f8415b = 1;
                    if (c4531c.m9378b(this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f8415b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    this.f8415b = 1;
                    if (C1750l.m5441k(this.f8416c, this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
