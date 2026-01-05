package ut;

import b8.C0615j;
import ex.InterfaceC2141e;
import o6.s0;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;
import wx.w0;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.h */
/* loaded from: classes3.dex */
public final class C7544h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f36312a;

    /* renamed from: b */
    public int f36313b;

    /* renamed from: c */
    public final /* synthetic */ C7546j f36314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7544h(C7546j c7546j, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f36312a = i10;
        this.f36314c = c7546j;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f36312a) {
            case 0:
                return new C7544h(this.f36314c, interfaceC7559c, 0);
            default:
                return new C7544h(this.f36314c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f36312a) {
        }
        return ((C7544h) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f36312a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f36313b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C7546j c7546j = this.f36314c;
                    C0615j c0615jM15690f = ((y5) c7546j.f36318c.f5574b).m15690f();
                    s0 s0Var = new s0(c7546j, (InterfaceC7559c) null, 13);
                    this.f36313b = 1;
                    if (c1.m15379j(c0615jM15690f, s0Var, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f36313b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7546j c7546j2 = this.f36314c;
                    w0 w0Var = c7546j2.f36319d;
                    C7545i c7545i = new C7545i(c7546j2, null, 0);
                    this.f36313b = 1;
                    if (c1.m15379j(w0Var, c7545i, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
