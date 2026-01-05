package gp;

import eo.C2082h;
import ex.InterfaceC2141e;
import lv.C4531c;
import og.od;
import qp.C6266c;
import qw.a0;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import ur.j0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.C8219t;
import wx.c1;
import wx.m1;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gp.e */
/* loaded from: classes3.dex */
public final class C2694e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15031a;

    /* renamed from: b */
    public int f15032b;

    /* renamed from: c */
    public final /* synthetic */ C2703n f15033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2694e(C2703n c2703n, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15031a = i10;
        this.f15033c = c2703n;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15031a) {
            case 0:
                return new C2694e(this.f15033c, interfaceC7559c, 0);
            case 1:
                return new C2694e(this.f15033c, interfaceC7559c, 1);
            case 2:
                return new C2694e(this.f15033c, interfaceC7559c, 2);
            case 3:
                return new C2694e(this.f15033c, interfaceC7559c, 3);
            case 4:
                return new C2694e(this.f15033c, interfaceC7559c, 4);
            case 5:
                return new C2694e(this.f15033c, interfaceC7559c, 5);
            default:
                return new C2694e(this.f15033c, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f15031a) {
        }
        return ((C2694e) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM15700p;
        Object value;
        switch (this.f15031a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f15032b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f15033c.f15096s;
                    this.f15032b = 1;
                    if (c7806h.mo14775g(C2691b.f15028a, this) == enumC7794a) {
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
                int i11 = this.f15032b;
                C2703n c2703n = this.f15033c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C2082h c2082h = c2703n.f15087j;
                    this.f15032b = 1;
                    objM15700p = c2082h.f9747b.m15700p(this);
                    if (objM15700p == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM15700p = obj;
                }
                EnumC7204p enumC7204p = (EnumC7204p) objM15700p;
                m1 m1Var = c2703n.f15094q;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6266c.m12271a((C6266c) value, null, false, null, enumC7204p, null, null, null, false, false, false, false, false, false, 0, false, false, 262111)));
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f15032b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h2 = this.f15033c.f36254d;
                    this.f15032b = 1;
                    if (c7806h2.mo14775g(j0.f36232a, this) == enumC7794a3) {
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
                int i13 = this.f15032b;
                C2703n c2703n2 = this.f15033c;
                if (i13 == 0) {
                    od.m10798c(obj);
                    c2703n2.f15090m.getClass();
                    C8219t c8219t = new C8219t(new C2699j(c2703n2, null, 1), x1.f40990o);
                    C2700k c2700k = new C2700k(c2703n2, null, 0);
                    this.f15032b = 1;
                    if (c1.m15379j(c8219t, c2700k, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                c2703n2.f15098u = true;
                return a0.f30746a;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f15032b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    this.f15032b = 1;
                    if (C2703n.m6710k(this.f15033c, this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f15032b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    this.f15032b = 1;
                    if (C2703n.m6710k(this.f15033c, this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f15032b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = this.f15033c.f15099v;
                    this.f15032b = 1;
                    if (c4531c.m9378b(this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
