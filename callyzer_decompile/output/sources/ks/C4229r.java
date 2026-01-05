package ks;

import ap.C0395h;
import aw.C0473m;
import ex.InterfaceC2141e;
import gs.C2715a;
import is.C3348b;
import lv.C4531c;
import og.od;
import rw.C6668r;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8219t;
import wx.c1;
import wx.m1;
import wx.w0;
import xm.r3;
import xm.x1;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.r */
/* loaded from: classes3.dex */
public final class C4229r extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21516a;

    /* renamed from: b */
    public int f21517b;

    /* renamed from: c */
    public final /* synthetic */ c0 f21518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4229r(c0 c0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f21516a = i10;
        this.f21518c = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21516a) {
            case 0:
                return new C4229r(this.f21518c, interfaceC7559c, 0);
            case 1:
                return new C4229r(this.f21518c, interfaceC7559c, 1);
            case 2:
                return new C4229r(this.f21518c, interfaceC7559c, 2);
            case 3:
                return new C4229r(this.f21518c, interfaceC7559c, 3);
            case 4:
                return new C4229r(this.f21518c, interfaceC7559c, 4);
            default:
                return new C4229r(this.f21518c, interfaceC7559c, 5);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f21516a) {
        }
        return ((C4229r) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f21516a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f21517b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    c0 c0Var = this.f21518c;
                    h2.f0 f0Var = ((y5) c0Var.f21365f.f38724b).f41057i;
                    C4228q c4228q = new C4228q(c0Var, null, 0);
                    this.f21517b = 1;
                    if (c1.m15379j(f0Var, c4228q, this) == enumC7794a) {
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
                int i11 = this.f21517b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    c0 c0Var2 = this.f21518c;
                    w0 w0Var = c0Var2.f21367h;
                    C2715a c2715a = new C2715a(c0Var2, (InterfaceC7559c) null, 25);
                    this.f21517b = 1;
                    if (c1.m15379j(w0Var, c2715a, this) == enumC7794a2) {
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
                int i12 = this.f21517b;
                c0 c0Var3 = this.f21518c;
                try {
                    if (i12 == 0) {
                        od.m10798c(obj);
                        c0Var3.f21370k.getClass();
                        C8219t c8219t = new C8219t(new C0473m(2, 5, null), x1.f40990o);
                        C4228q c4228q2 = new C4228q(c0Var3, null, 1);
                        this.f21517b = 1;
                        if (c1.m15379j(c8219t, c4228q2, this) == enumC7794a3) {
                            return enumC7794a3;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                    }
                } catch (Exception e2) {
                    c0Var3.f21376q.m16232g(c0Var3.f21378s, "observerCallLogSyncEvent: Exception " + e2);
                }
                return qw.a0.f30746a;
            case 3:
                c0 c0Var4 = this.f21518c;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f21517b;
                try {
                    if (i13 == 0) {
                        od.m10798c(obj);
                        c0Var4.f21372m.getClass();
                        C8219t c8219t2 = new C8219t(new C0473m(2, 6, null), r3.f40780k);
                        C0395h c0395h = new C0395h(3, c0Var4, null, false);
                        this.f21517b = 1;
                        if (c1.m15379j(c8219t2, c0395h, this) == enumC7794a4) {
                            return enumC7794a4;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                    }
                } catch (Exception unused) {
                }
                return qw.a0.f30746a;
            case 4:
                c0 c0Var5 = this.f21518c;
                w0 w0Var2 = c0Var5.f21361C;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f21517b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    if (((C3348b) w0Var2.f39340a.getValue()).f17713a.size() < ((C3348b) w0Var2.f39340a.getValue()).f17717e) {
                        C4531c c4531c = c0Var5.f21364F;
                        this.f21517b = 1;
                        if (c4531c.m9378b(this) == enumC7794a5) {
                            return enumC7794a5;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f21517b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    c0 c0Var6 = this.f21518c;
                    m1 m1Var = c0Var6.f21359A;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, C6668r.f31943a, false, 0, null, 0, false, false, false, null, null, true, null, null, null, null, null, false, null, 1045498)));
                    C4531c c4531c2 = c0Var6.f21364F;
                    this.f21517b = 1;
                    if (c4531c2.m9381e(this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
