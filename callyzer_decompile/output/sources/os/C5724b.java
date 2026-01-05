package os;

import ex.InterfaceC2141e;
import ls.C4511b;
import lv.C4531c;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.c1;
import wx.m1;
import wx.w0;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: os.b */
/* loaded from: classes3.dex */
public final class C5724b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f28208a;

    /* renamed from: b */
    public int f28209b;

    /* renamed from: c */
    public final /* synthetic */ C5731i f28210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5724b(C5731i c5731i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f28208a = i10;
        this.f28210c = c5731i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f28208a) {
            case 0:
                return new C5724b(this.f28210c, interfaceC7559c, 0);
            case 1:
                return new C5724b(this.f28210c, interfaceC7559c, 1);
            case 2:
                return new C5724b(this.f28210c, interfaceC7559c, 2);
            default:
                return new C5724b(this.f28210c, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f28208a) {
        }
        return ((C5724b) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.f28208a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f28209b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f28209b = 1;
                    if (C5731i.m11282f(this.f28210c, this) == enumC7794a) {
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
                int i11 = this.f28209b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C5731i c5731i = this.f28210c;
                    w0 w0Var = c5731i.f28245c.f42471f;
                    C5725c c5725c = new C5725c(c5731i, null, 0);
                    this.f28209b = 1;
                    if (c1.m15379j(w0Var, c5725c, this) == enumC7794a2) {
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
                int i12 = this.f28209b;
                C5731i c5731i2 = this.f28210c;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = c5731i2.f28255m;
                    this.f28209b = 1;
                    if (c4531c.m9378b(this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                if (((C4511b) c5731i2.f28252j.f39340a.getValue()).f22453c) {
                    m1 m1Var = c5731i2.f28251i;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C4511b.m9347a((C4511b) value, null, false, false, false, 0, false, false, false, false, null, false, null, null, 65531)));
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f28209b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C5731i c5731i3 = this.f28210c;
                    c5731i3.f28244b.getClass();
                    InterfaceC8209j interfaceC8209jM15381l = c1.m15381l(x1.f40990o, 300L);
                    C5725c c5725c2 = new C5725c(c5731i3, null, 1);
                    this.f28209b = 1;
                    if (c1.m15379j(interfaceC8209jM15381l, c5725c2, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
