package ht;

import ex.InterfaceC2141e;
import k2.w0;
import m1.InterfaceC4630l;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ht.g */
/* loaded from: classes3.dex */
public final class C3032g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16354a;

    /* renamed from: b */
    public int f16355b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC4630l f16356c;

    /* renamed from: d */
    public final /* synthetic */ w0 f16357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3032g(InterfaceC4630l interfaceC4630l, w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f16354a = i10;
        this.f16356c = interfaceC4630l;
        this.f16357d = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f16354a) {
            case 0:
                return new C3032g(this.f16356c, this.f16357d, interfaceC7559c, 0);
            case 1:
                return new C3032g(this.f16356c, this.f16357d, interfaceC7559c, 1);
            default:
                return new C3032g(this.f16356c, this.f16357d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f16354a) {
        }
        return ((C3032g) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f16354a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f16355b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jMo6892c = this.f16356c.mo6892c();
                    C3031f c3031f = new C3031f(this.f16357d, 0);
                    this.f16355b = 1;
                    if (interfaceC8209jMo6892c.collect(c3031f, this) == enumC7794a) {
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
                int i11 = this.f16355b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jMo6892c2 = this.f16356c.mo6892c();
                    C3031f c3031f2 = new C3031f(this.f16357d, 1);
                    this.f16355b = 1;
                    if (interfaceC8209jMo6892c2.collect(c3031f2, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f16355b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jMo6892c3 = this.f16356c.mo6892c();
                    C3031f c3031f3 = new C3031f(this.f16357d, 2);
                    this.f16355b = 1;
                    if (interfaceC8209jMo6892c3.collect(c3031f3, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
