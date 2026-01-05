package mq;

import ex.InterfaceC2141e;
import f9.C2222e;
import lv.C4531c;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8219t;
import wx.c1;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24343a;

    /* renamed from: b */
    public int f24344b;

    /* renamed from: c */
    public final /* synthetic */ a1 f24345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(a1 a1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24343a = i10;
        this.f24345c = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24343a) {
            case 0:
                return new w0(this.f24345c, interfaceC7559c, 0);
            case 1:
                return new w0(this.f24345c, interfaceC7559c, 1);
            case 2:
                return new w0(this.f24345c, interfaceC7559c, 2);
            default:
                return new w0(this.f24345c, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f24343a) {
        }
        return ((w0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24343a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f24344b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = this.f24345c.f24155v;
                    this.f24344b = 1;
                    if (c4531c.m9378b(this) == enumC7794a) {
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
                int i11 = this.f24344b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    a1 a1Var = this.f24345c;
                    a1Var.f24139f.getClass();
                    InterfaceC7559c interfaceC7559c = null;
                    C8219t c8219t = new C8219t(new u0(a1Var, interfaceC7559c, 3), x1.f40990o);
                    x0 x0Var = new x0(a1Var, interfaceC7559c, 0);
                    this.f24344b = 1;
                    if (c1.m15379j(c8219t, x0Var, this) == enumC7794a2) {
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
                int i12 = this.f24344b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    a1 a1Var2 = this.f24345c;
                    C2222e c2222eM10041d = a1Var2.f24138e.m10041d();
                    x0 x0Var2 = new x0(a1Var2, null, 1);
                    this.f24344b = 1;
                    if (c1.m15379j(c2222eM10041d, x0Var2, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f24344b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c2 = this.f24345c.f24155v;
                    this.f24344b = 1;
                    if (c4531c2.m9378b(this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
