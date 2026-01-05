package gr;

import ex.InterfaceC2141e;
import fr.C2369a;
import kotlin.KotlinNothingValueException;
import lv.C4531c;
import og.od;
import qw.a0;
import rw.C6668r;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.InterfaceC8209j;
import wx.c1;
import wx.m1;
import wx.v0;
import wx.w0;
import xm.w2;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gr.d */
/* loaded from: classes3.dex */
public final class C2708d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15112a;

    /* renamed from: b */
    public int f15113b;

    /* renamed from: c */
    public final /* synthetic */ C2713i f15114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2708d(C2713i c2713i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15112a = i10;
        this.f15114c = c2713i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15112a) {
            case 0:
                return new C2708d(this.f15114c, interfaceC7559c, 0);
            case 1:
                return new C2708d(this.f15114c, interfaceC7559c, 1);
            case 2:
                return new C2708d(this.f15114c, interfaceC7559c, 2);
            case 3:
                return new C2708d(this.f15114c, interfaceC7559c, 3);
            case 4:
                return new C2708d(this.f15114c, interfaceC7559c, 4);
            case 5:
                return new C2708d(this.f15114c, interfaceC7559c, 5);
            case 6:
                return new C2708d(this.f15114c, interfaceC7559c, 6);
            case 7:
                return new C2708d(this.f15114c, interfaceC7559c, 7);
            default:
                return new C2708d(this.f15114c, interfaceC7559c, 8);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15112a) {
        }
        return ((C2708d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f15112a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f15113b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d = w2.f40961c;
                    C2707c c2707c = new C2707c(this.f15114c, 0);
                    this.f15113b = 1;
                    if (c8203d.collect(c2707c, this) == enumC7794a) {
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
                int i11 = this.f15113b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C2713i c2713i = this.f15114c;
                    InterfaceC7564h interfaceC7564h = c2713i.f15134i.f42488a;
                    C2708d c2708d = new C2708d(c2713i, null, 7);
                    this.f15113b = 1;
                    if (c0.m13475K(interfaceC7564h, c2708d, this) == enumC7794a2) {
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
                int i12 = this.f15113b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C2713i c2713i2 = this.f15114c;
                    w0 w0Var = c2713i2.f15130e.f22371e;
                    C2709e c2709e = new C2709e(c2713i2, null, 0);
                    this.f15113b = 1;
                    if (c1.m15379j(w0Var, c2709e, this) == enumC7794a3) {
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
                int i13 = this.f15113b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C2713i c2713i3 = this.f15114c;
                    c2713i3.f15129d.getClass();
                    v0 v0Var = x1.f40990o;
                    C2707c c2707c2 = new C2707c(c2713i3, 1);
                    this.f15113b = 1;
                    if (v0Var.f39335a.collect(c2707c2, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                throw new KotlinNothingValueException();
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f15113b;
                C2713i c2713i4 = this.f15114c;
                if (i14 == 0) {
                    od.m10798c(obj);
                    m1 m1Var = c2713i4.f15135j;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C2369a.m6056a((C2369a) value, C6668r.f31943a, null, false, false, false, 0, 126)));
                    C4531c c4531c = c2713i4.f15144s;
                    this.f15113b = 1;
                    if (c4531c.m9381e(this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                C7806h c7806h = c2713i4.f15139n;
                this.f15113b = 2;
                if (c7806h.mo14775g(C2714j.f15145a, this) == enumC7794a5) {
                    return enumC7794a5;
                }
                return a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f15113b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    C2713i c2713i5 = this.f15114c;
                    InterfaceC8209j interfaceC8209jM15381l = c1.m15381l(c2713i5.f15138m, 500L);
                    C2708d c2708d2 = new C2708d(c2713i5, null, 4);
                    this.f15113b = 1;
                    if (c1.m15379j(interfaceC8209jM15381l, c2708d2, this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f15113b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c2 = this.f15114c.f15144s;
                    this.f15113b = 1;
                    if (c4531c2.m9378b(this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f15113b;
                if (i17 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c3 = this.f15114c.f15144s;
                    this.f15113b = 1;
                    if (c4531c3.m9380d(this) == enumC7794a8) {
                        return enumC7794a8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f15113b;
                if (i18 == 0) {
                    od.m10798c(obj);
                    this.f15113b = 1;
                    if (c0.m13489l(1000L, this) == enumC7794a9) {
                        return enumC7794a9;
                    }
                } else {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                C7806h c7806h2 = this.f15114c.f15139n;
                this.f15113b = 2;
                if (c7806h2.mo14775g(C2714j.f15145a, this) == enumC7794a9) {
                    return enumC7794a9;
                }
                return a0.f30746a;
        }
    }
}
