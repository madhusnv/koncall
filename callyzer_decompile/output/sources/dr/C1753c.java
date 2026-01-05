package dr;

import br.C0740c;
import ex.InterfaceC2141e;
import kotlin.KotlinNothingValueException;
import lv.C4531c;
import og.od;
import qw.C6364n;
import rn.h0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import wx.v0;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.c */
/* loaded from: classes3.dex */
public final class C1753c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8488a;

    /* renamed from: b */
    public int f8489b;

    /* renamed from: c */
    public final /* synthetic */ C1775y f8490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1753c(C1775y c1775y, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8488a = i10;
        this.f8490c = c1775y;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8488a) {
            case 0:
                return new C1753c(this.f8490c, interfaceC7559c, 0);
            case 1:
                return new C1753c(this.f8490c, interfaceC7559c, 1);
            case 2:
                return new C1753c(this.f8490c, interfaceC7559c, 2);
            case 3:
                return new C1753c(this.f8490c, interfaceC7559c, 3);
            case 4:
                return new C1753c(this.f8490c, interfaceC7559c, 4);
            case 5:
                return new C1753c(this.f8490c, interfaceC7559c, 5);
            case 6:
                return new C1753c(this.f8490c, interfaceC7559c, 6);
            case 7:
                return new C1753c(this.f8490c, interfaceC7559c, 7);
            case 8:
                return new C1753c(this.f8490c, interfaceC7559c, 8);
            default:
                return new C1753c(this.f8490c, interfaceC7559c, 9);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f8488a) {
        }
        return ((C1753c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        Object objM5451k;
        switch (this.f8488a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f8489b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f8490c.f8638u;
                    this.f8489b = 1;
                    if (c7806h.mo14775g(a0.f8485a, this) == enumC7794a) {
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
                int i11 = this.f8489b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f8489b = 1;
                    objM5451k = C1775y.m5451k(this.f8490c, this);
                    if (objM5451k == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM5451k = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM5451k);
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f8489b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = this.f8490c.f8618B;
                    this.f8489b = 1;
                    if (c4531c.m9378b(this) == enumC7794a3) {
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
                int i13 = this.f8489b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C1775y c1775y = this.f8490c;
                    c1775y.f8630m.getClass();
                    v0 v0Var = x1.f40990o;
                    C1766p c1766p = new C1766p(c1775y, null, 0);
                    this.f8489b = 1;
                    if (c1.m15379j(v0Var, c1766p, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f8489b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    C1775y c1775y2 = this.f8490c;
                    h0 h0Var = c1775y2.f8632o;
                    int i15 = ((C0740c) c1775y2.f8635r.getValue()).f4682p.f21222b;
                    this.f8489b = 1;
                    if (h0Var.m12623r(i15, this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f8489b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c2 = this.f8490c.f8618B;
                    this.f8489b = 1;
                    if (c4531c2.m9378b(this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f8489b;
                if (i17 == 0) {
                    od.m10798c(obj);
                    this.f8489b = 1;
                    if (C1775y.m5453m(this.f8490c, this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f8489b;
                if (i18 == 0) {
                    od.m10798c(obj);
                    this.f8489b = 1;
                    if (C1775y.m5453m(this.f8490c, this) == enumC7794a8) {
                        return enumC7794a8;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 8:
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f8489b;
                if (i19 == 0) {
                    od.m10798c(obj);
                    C1775y c1775y3 = this.f8490c;
                    v0 v0Var2 = c1775y3.f8633p.f22368b;
                    C1772v c1772v = new C1772v(0, c1775y3);
                    this.f8489b = 1;
                    if (v0Var2.f39335a.collect(c1772v, this) == enumC7794a9) {
                        return enumC7794a9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                throw new KotlinNothingValueException();
            default:
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                int i20 = this.f8489b;
                if (i20 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c3 = this.f8490c.f8618B;
                    this.f8489b = 1;
                    if (c4531c3.m9381e(this) == enumC7794a10) {
                        return enumC7794a10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
