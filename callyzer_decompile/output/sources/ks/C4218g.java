package ks;

import ap.C0388a;
import ex.InterfaceC2141e;
import is.C3348b;
import lv.C4531c;
import og.od;
import rw.C6668r;
import rw.C6669s;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8219t;
import wx.c1;
import wx.m1;
import wx.v0;
import wx.w0;
import xm.r3;
import xm.x1;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.g */
/* loaded from: classes3.dex */
public final class C4218g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21405a;

    /* renamed from: b */
    public int f21406b;

    /* renamed from: c */
    public final /* synthetic */ C4223l f21407c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4218g(int i10, C4223l c4223l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21405a = i10;
        this.f21407c = c4223l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21405a) {
            case 0:
                return new C4218g(0, this.f21407c, interfaceC7559c);
            case 1:
                return new C4218g(1, this.f21407c, interfaceC7559c);
            case 2:
                return new C4218g(2, this.f21407c, interfaceC7559c);
            case 3:
                return new C4218g(3, this.f21407c, interfaceC7559c);
            case 4:
                return new C4218g(4, this.f21407c, interfaceC7559c);
            case 5:
                return new C4218g(5, this.f21407c, interfaceC7559c);
            default:
                return new C4218g(6, this.f21407c, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f21405a) {
        }
        return ((C4218g) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        switch (this.f21405a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f21406b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f21406b = 1;
                    if (this.f21407c.m8962i(this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f21406b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f21406b = 1;
                    if (this.f21407c.m8962i(this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f21406b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C4223l c4223l = this.f21407c;
                    h2.f0 f0Var = ((y5) c4223l.f21442b.f38724b).f41057i;
                    C0388a c0388a = new C0388a(c4223l, null, 25);
                    this.f21406b = 1;
                    if (c1.m15379j(f0Var, c0388a, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f21406b;
                C4223l c4223l2 = this.f21407c;
                try {
                } catch (Exception e2) {
                    c4223l2.f21452l.m16234i("LeadViewModel", e2);
                    m1 m1Var = c4223l2.f21456p;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, C6668r.f31943a, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, C6669s.f31944a, 524282)));
                    C4531c c4531c = c4223l2.f21461u;
                    this.f21406b = 2;
                    if (c4531c.m9381e(this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                }
                if (i13 == 0) {
                    od.m10798c(obj);
                    c4223l2.f21447g.getClass();
                    InterfaceC7559c interfaceC7559c = null;
                    C8219t c8219t = new C8219t(new C4217f(1, c4223l2, interfaceC7559c), x1.f40990o);
                    C4213b c4213b = new C4213b(1, c4223l2, interfaceC7559c);
                    this.f21406b = 1;
                    if (c1.m15379j(c8219t, c4213b, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return qw.a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 4:
                C4223l c4223l3 = this.f21407c;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f21406b;
                try {
                    if (i14 == 0) {
                        od.m10798c(obj);
                        c4223l3.f21450j.getClass();
                        v0 v0Var = r3.f40780k;
                        C4213b c4213b2 = new C4213b(2, c4223l3, null);
                        this.f21406b = 1;
                        if (c1.m15379j(v0Var, c4213b2, this) == enumC7794a5) {
                            return enumC7794a5;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                    }
                } catch (Exception unused) {
                }
                return qw.a0.f30746a;
            case 5:
                C4223l c4223l4 = this.f21407c;
                w0 w0Var = c4223l4.f21457q;
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f21406b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    if (((C3348b) w0Var.f39340a.getValue()).f17713a.size() < ((C3348b) w0Var.f39340a.getValue()).f17717e) {
                        C4531c c4531c2 = c4223l4.f21461u;
                        this.f21406b = 1;
                        if (c4531c2.m9378b(this) == enumC7794a6) {
                            return enumC7794a6;
                        }
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f21406b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    C4223l c4223l5 = this.f21407c;
                    m1 m1Var2 = c4223l5.f21456p;
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C3348b.m7669a((C3348b) value2, C6668r.f31943a, false, 0, null, 0, false, false, false, null, null, true, null, null, null, null, null, false, C6669s.f31944a, 521210)));
                    C4531c c4531c3 = c4223l5.f21461u;
                    this.f21406b = 1;
                    if (c4531c3.m9381e(this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
