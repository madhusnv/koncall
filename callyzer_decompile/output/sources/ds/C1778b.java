package ds;

import cs.C1486e;
import ex.InterfaceC2141e;
import fs.C2370a;
import gs.C2721g;
import lv.C4535g;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.b */
/* loaded from: classes3.dex */
public final class C1778b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8650a;

    /* renamed from: b */
    public int f8651b;

    /* renamed from: c */
    public final /* synthetic */ C2721g f8652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1778b(C2721g c2721g, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8650a = i10;
        this.f8652c = c2721g;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8650a) {
            case 0:
                C1778b c1778b = new C1778b(this.f8652c, interfaceC7559c, 0);
                c1778b.f8651b = ((Number) obj).intValue();
                return c1778b;
            case 1:
                return new C1778b(this.f8652c, interfaceC7559c, 1);
            default:
                return new C1778b(this.f8652c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8650a) {
            case 0:
                C1778b c1778b = (C1778b) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c1778b.invokeSuspend(a0Var);
                break;
        }
        return ((C1778b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f8650a;
        a0 a0Var = a0.f30746a;
        C2721g c2721g = this.f8652c;
        switch (i10) {
            case 0:
                int i11 = this.f8651b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                w0 w0Var = c2721g.f15185m;
                w0 w0Var2 = c2721g.f15185m;
                if (!((C2370a) w0Var.f39340a.getValue()).f10786h && ((C2370a) w0Var2.f39340a.getValue()).f10780b.size() > 5 && !((C2370a) w0Var2.f39340a.getValue()).f10779a && ((C2370a) w0Var2.f39340a.getValue()).f10780b.size() - 5 <= i11) {
                    c2721g.m6724h(C1486e.f7565a);
                }
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f8651b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    this.f8651b = 1;
                    return C2721g.m6723g(c2721g, this) == enumC7794a2 ? enumC7794a2 : a0Var;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return a0Var;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f8651b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return a0Var;
                }
                od.m10798c(obj);
                C4535g c4535g = c2721g.f15186n;
                this.f8651b = 1;
                return c4535g.m9387e(this) == enumC7794a3 ? enumC7794a3 : a0Var;
        }
    }
}
