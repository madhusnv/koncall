package ks;

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
/* loaded from: classes3.dex */
public final class f0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21402a;

    /* renamed from: b */
    public int f21403b;

    /* renamed from: c */
    public final /* synthetic */ q0 f21404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(q0 q0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f21402a = i10;
        this.f21404c = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21402a) {
            case 0:
                return new f0(this.f21404c, interfaceC7559c, 0);
            case 1:
                return new f0(this.f21404c, interfaceC7559c, 1);
            case 2:
                return new f0(this.f21404c, interfaceC7559c, 2);
            case 3:
                return new f0(this.f21404c, interfaceC7559c, 3);
            case 4:
                return new f0(this.f21404c, interfaceC7559c, 4);
            default:
                return new f0(this.f21404c, interfaceC7559c, 5);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f21402a) {
        }
        return ((f0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f21402a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f21403b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    q0 q0Var = this.f21404c;
                    h2.f0 f0Var = ((y5) q0Var.f21495f.f38724b).f41057i;
                    e0 e0Var = new e0(q0Var, null, 0);
                    this.f21403b = 1;
                    if (c1.m15379j(f0Var, e0Var, this) == enumC7794a) {
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
                int i11 = this.f21403b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    q0 q0Var2 = this.f21404c;
                    w0 w0Var = q0Var2.f21497h;
                    g0 g0Var = new g0(q0Var2, null, 0);
                    this.f21403b = 1;
                    if (c1.m15379j(w0Var, g0Var, this) == enumC7794a2) {
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
                int i12 = this.f21403b;
                q0 q0Var3 = this.f21404c;
                try {
                    if (i12 == 0) {
                        od.m10798c(obj);
                        q0Var3.f21499j.getClass();
                        C8219t c8219t = new C8219t(new m0(q0Var3, null, 1), x1.f40990o);
                        g0 g0Var2 = new g0(q0Var3, null, 1);
                        this.f21403b = 1;
                        if (c1.m15379j(c8219t, g0Var2, this) == enumC7794a3) {
                            return enumC7794a3;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                    }
                } catch (Exception unused) {
                    q0Var3.m8973p();
                }
                return qw.a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f21403b;
                q0 q0Var4 = this.f21404c;
                try {
                    if (i13 == 0) {
                        od.m10798c(obj);
                        q0Var4.f21502m.getClass();
                        v0 v0Var = r3.f40780k;
                        e0 e0Var2 = new e0(q0Var4, null, 1);
                        this.f21403b = 1;
                        if (c1.m15379j(v0Var, e0Var2, this) == enumC7794a4) {
                            return enumC7794a4;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                    }
                } catch (Exception e2) {
                    q0Var4.f21505p.m16234i("LeadViewModel", e2);
                }
                return qw.a0.f30746a;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f21403b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    q0 q0Var5 = this.f21404c;
                    if (((C3348b) q0Var5.f21513x.f39340a.getValue()).f17713a.size() < ((C3348b) q0Var5.f21513x.f39340a.getValue()).f17717e) {
                        C4531c c4531c = q0Var5.f21494E;
                        this.f21403b = 1;
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
                int i15 = this.f21403b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    q0 q0Var6 = this.f21404c;
                    m1 m1Var = q0Var6.f21512w;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, C6668r.f31943a, false, 0, null, 0, false, false, false, null, null, true, null, null, null, null, null, false, C6669s.f31944a, 521210)));
                    C4531c c4531c2 = q0Var6.f21494E;
                    this.f21403b = 1;
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
