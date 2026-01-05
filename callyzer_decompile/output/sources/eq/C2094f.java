package eq;

import eo.C2082h;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import og.od;
import pg.f9;
import qp.C6264a;
import qr.C6294r;
import qw.a0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import tx.c0;
import tx.s1;
import ur.j0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import wx.v0;
import wx.w0;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eq.f */
/* loaded from: classes3.dex */
public final class C2094f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9804a;

    /* renamed from: b */
    public int f9805b;

    /* renamed from: c */
    public final /* synthetic */ C2100l f9806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2094f(C2100l c2100l, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9804a = i10;
        this.f9806c = c2100l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9804a) {
            case 0:
                return new C2094f(this.f9806c, interfaceC7559c, 0);
            case 1:
                return new C2094f(this.f9806c, interfaceC7559c, 1);
            case 2:
                return new C2094f(this.f9806c, interfaceC7559c, 2);
            case 3:
                return new C2094f(this.f9806c, interfaceC7559c, 3);
            case 4:
                return new C2094f(this.f9806c, interfaceC7559c, 4);
            default:
                return new C2094f(this.f9806c, interfaceC7559c, 5);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9804a) {
        }
        return ((C2094f) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9804a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f9805b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f9806c.f36254d;
                    this.f9805b = 1;
                    if (c7806h.mo14775g(j0.f36232a, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f9805b;
                C2100l c2100l = this.f9806c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f9805b = 1;
                    if (C2100l.m5803j(c2100l, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                s1 s1Var = c2100l.f9849u;
                if (s1Var != null) {
                    s1Var.mo13510j(null);
                }
                c2100l.f9842n.m16232g("AnalyticsViewModel", "Fetching analysis list with current state: " + c2100l.f9845q);
                c2100l.f9849u = c0.m13502y(c2100l.f9840l, null, null, new C2095g(c2100l, (InterfaceC7559c) null), 3);
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f9805b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C2100l c2100l2 = this.f9806c;
                    c2100l2.f9836h.getClass();
                    v0 v0Var = x1.f40990o;
                    C2090b c2090b = new C2090b(c2100l2, null, 1);
                    this.f9805b = 1;
                    if (c1.m15379j(v0Var, c2090b, this) == enumC7794a3) {
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
                C2100l c2100l3 = this.f9806c;
                w0 w0Var = c2100l3.f9845q;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f9805b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    LocalDateTime localDateTime = ((C6264a) w0Var.f39340a.getValue()).f30362f;
                    LocalDateTime localDateTime2 = ((C6264a) w0Var.f39340a.getValue()).f30363g;
                    String strM11628b = f9.m11628b(c2100l3.f9834f, c2100l3.f9851w.m12314o().f36215a);
                    this.f9805b = 1;
                    if (C2100l.m5804k(c2100l3, localDateTime, localDateTime2, strM11628b, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 4:
                C2100l c2100l4 = this.f9806c;
                C6294r c6294r = c2100l4.f9851w;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f9805b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    LocalDateTime localDateTimeMo14292b = c6294r.m12314o().mo14292b();
                    LocalDateTime localDateTimeMo14291a = c6294r.m12314o().mo14291a();
                    String strM11628b2 = f9.m11628b(c2100l4.f9834f, c6294r.m12314o().f36215a);
                    this.f9805b = 1;
                    if (C2100l.m5804k(c2100l4, localDateTimeMo14292b, localDateTimeMo14291a, strM11628b2, this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f9805b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    C2100l c2100l5 = this.f9806c;
                    C2082h c2082h = c2100l5.f9838j;
                    EnumC7204p enumC7204p = c2100l5.f9852x.m12322o().f36248a;
                    this.f9805b = 1;
                    if (c2082h.m5799h(enumC7204p, this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
