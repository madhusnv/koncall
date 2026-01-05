package xs;

import c9.C0908c;
import ex.InterfaceC2141e;
import gn.x2;
import im.EnumC3308j;
import java.util.List;
import l4.C4367l;
import lv.C4531c;
import og.od;
import qw.a0;
import tb.C7105p;
import tx.InterfaceC7266z;
import ug.g1;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ws.C8161b;
import ws.C8177r;
import ws.C8178s;
import ws.C8181v;
import ww.AbstractC8199i;
import wx.c1;
import wx.m1;
import wx.w0;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xs.c */
/* loaded from: classes3.dex */
public final class C8441c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41171a;

    /* renamed from: b */
    public int f41172b;

    /* renamed from: c */
    public final /* synthetic */ C8449k f41173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8441c(C8449k c8449k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41171a = i10;
        this.f41173c = c8449k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41171a) {
            case 0:
                return new C8441c(this.f41173c, interfaceC7559c, 0);
            case 1:
                return new C8441c(this.f41173c, interfaceC7559c, 1);
            case 2:
                return new C8441c(this.f41173c, interfaceC7559c, 2);
            case 3:
                return new C8441c(this.f41173c, interfaceC7559c, 3);
            case 4:
                return new C8441c(this.f41173c, interfaceC7559c, 4);
            case 5:
                return new C8441c(this.f41173c, interfaceC7559c, 5);
            default:
                return new C8441c(this.f41173c, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41171a) {
        }
        return ((C8441c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15705u;
        Object value;
        Object value2;
        m1 m1Var;
        Object value3;
        Object value4;
        switch (this.f41171a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f41172b;
                C8449k c8449k = this.f41173c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C0908c c0908c = c8449k.f41219i;
                    this.f41172b = 1;
                    objM15705u = ((y5) c0908c.f5574b).m15705u(this);
                    if (objM15705u == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM15705u = obj;
                }
                if (((Boolean) objM15705u).booleanValue()) {
                    m1 m1Var2 = c8449k.f41223m;
                    do {
                        value = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value, C8181v.m15340a((C8181v) value, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, true, null, 0, null, 3932159)));
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f41172b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8449k c8449k2 = this.f41173c;
                    w0 w0Var = c8449k2.f41214d.f42471f;
                    C8442d c8442d = new C8442d(c8449k2, null, 0);
                    this.f41172b = 1;
                    if (c1.m15379j(w0Var, c8442d, this) == enumC7794a2) {
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
                int i12 = this.f41172b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f41173c.f41225o;
                    C8178s c8178s = new C8178s();
                    this.f41172b = 1;
                    if (c7806h.mo14775g(c8178s, this) == enumC7794a3) {
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
                int i13 = this.f41172b;
                C8449k c8449k3 = this.f41173c;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = c8449k3.f41227q;
                    this.f41172b = 1;
                    if (c4531c.m9378b(this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                if (((C8181v) c8449k3.f41224n.f39340a.getValue()).f39122h) {
                    c8449k3.m15752h(C8161b.f39084a);
                }
                m1 m1Var3 = c8449k3.f41223m;
                do {
                    value2 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value2, C8181v.m15340a((C8181v) value2, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4161535)));
                return a0.f30746a;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f41172b;
                a0 a0Var = a0.f30746a;
                C8449k c8449k4 = this.f41173c;
                if (i14 == 0) {
                    od.m10798c(obj);
                    C0908c c0908c2 = c8449k4.f41219i;
                    this.f41172b = 1;
                    Object objM15707w = ((y5) c0908c2.f5574b).m15707w(false, this);
                    if (objM15707w != enumC7794a5) {
                        objM15707w = a0Var;
                    }
                    if (objM15707w == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0Var;
                    }
                    od.m10798c(obj);
                }
                C7105p c7105p = c8449k4.f41217g;
                EnumC3308j enumC3308j = EnumC3308j.Nothing;
                this.f41172b = 2;
                if (c7105p.m13379a(enumC3308j, this) == enumC7794a5) {
                    return enumC7794a5;
                }
                return a0Var;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f41172b;
                C8449k c8449k5 = this.f41173c;
                if (i15 == 0) {
                    od.m10798c(obj);
                    C4367l c4367l = c8449k5.f41212b;
                    this.f41172b = 1;
                    if (((x2) ((g1) c4367l.f21921b).f35448a).m6683c(this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        m1Var = c8449k5.f41223m;
                        do {
                            value3 = m1Var.getValue();
                        } while (!m1Var.m15397i(value3, C8181v.m15340a((C8181v) value3, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194175)));
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                C7806h c7806h2 = c8449k5.f41225o;
                C8177r c8177r = new C8177r();
                this.f41172b = 2;
                if (c7806h2.mo14775g(c8177r, this) == enumC7794a6) {
                    return enumC7794a6;
                }
                m1Var = c8449k5.f41223m;
                do {
                    value3 = m1Var.getValue();
                } while (!m1Var.m15397i(value3, C8181v.m15340a((C8181v) value3, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194175)));
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f41172b;
                C8449k c8449k6 = this.f41173c;
                if (i16 == 0) {
                    od.m10798c(obj);
                    C8181v c8181v = (C8181v) c8449k6.f41224n.f39340a.getValue();
                    if (c8181v.f39119e.isEmpty()) {
                        C7806h c7806h3 = c8449k6.f41225o;
                        C8177r c8177r2 = new C8177r();
                        this.f41172b = 2;
                        if (c7806h3.mo14775g(c8177r2, this) == enumC7794a7) {
                            return enumC7794a7;
                        }
                    } else if (c8449k6.f41214d.m16220b()) {
                        List list = c8181v.f39119e;
                        this.f41172b = 1;
                        if (C8449k.m15749e(c8449k6, list, this) == enumC7794a7) {
                            return enumC7794a7;
                        }
                    }
                } else {
                    if (i16 != 1 && i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                m1 m1Var4 = c8449k6.f41223m;
                do {
                    value4 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value4, C8181v.m15340a((C8181v) value4, null, null, null, false, null, 0, false, false, false, false, false, false, false, false, 0, false, false, null, 0, null, 4194271)));
                return a0.f30746a;
        }
    }
}
