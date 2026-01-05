package pt;

import cj.C0979e;
import ex.InterfaceC2141e;
import km.C4120o;
import lu.C4525k;
import nn.C5113e;
import nt.C5137a;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.c1;
import wx.m1;
import yv.C8803r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pt.a */
/* loaded from: classes3.dex */
public final class C6027a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29442a;

    /* renamed from: b */
    public int f29443b;

    /* renamed from: c */
    public final /* synthetic */ C6032f f29444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6027a(C6032f c6032f, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29442a = i10;
        this.f29444c = c6032f;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29442a) {
            case 0:
                return new C6027a(this.f29444c, interfaceC7559c, 0);
            default:
                return new C6027a(this.f29444c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f29442a) {
        }
        return ((C6027a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objM8879a;
        Object value;
        switch (this.f29442a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f29443b;
                C6032f c6032f = this.f29444c;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C0979e c0979e = c6032f.f29472c;
                    this.f29443b = 1;
                    obj2 = ((C8803r) c0979e.f5806e).f42471f;
                    if (obj2 == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                    obj2 = obj;
                }
                C4525k c4525k = new C4525k(c6032f, null, 7);
                this.f29443b = 2;
                if (c1.m15379j((InterfaceC8209j) obj2, c4525k, this) == enumC7794a) {
                    return enumC7794a;
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f29443b;
                C6032f c6032f2 = this.f29444c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C5113e c5113e = c6032f2.f29473d;
                    this.f29443b = 1;
                    objM8879a = ((C4120o) c5113e.f25030a.f41069a.f10585a).m8879a("manualSendConfirmation", this);
                    if (objM8879a == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM8879a = obj;
                }
                if (((Boolean) objM8879a).booleanValue() || ((C5137a) c6032f2.f29479j.f39340a.getValue()).f25156f.isEmpty()) {
                    C6032f.m12046f(c6032f2);
                } else {
                    m1 m1Var = c6032f2.f29478i;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C5137a.m10057a((C5137a) value, null, null, null, false, !((C5137a) c6032f2.f29479j.f39340a.getValue()).f25155e, null, null, null, false, null, null, false, false, null, false, null, 1048559)));
                }
                return a0.f30746a;
        }
    }
}
