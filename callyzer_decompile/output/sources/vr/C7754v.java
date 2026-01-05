package vr;

import dp.C1737d;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f8.C2206a;
import ks.c0;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vr.v */
/* loaded from: classes3.dex */
public final class C7754v extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37382a;

    /* renamed from: b */
    public int f37383b;

    /* renamed from: c */
    public final /* synthetic */ c0 f37384c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f37385d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7754v(c0 c0Var, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f37382a = i10;
        this.f37384c = c0Var;
        this.f37385d = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f37382a) {
            case 0:
                return new C7754v(this.f37384c, this.f37385d, interfaceC7559c, 0);
            default:
                return new C7754v(this.f37384c, this.f37385d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f37382a) {
        }
        return ((C7754v) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37382a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f37383b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d = this.f37384c.f21381v;
                    C2206a c2206a = new C2206a(this.f37385d, (InterfaceC7559c) null, 6);
                    this.f37383b = 1;
                    if (c1.m15379j(c8203d, c2206a, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f37383b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d2 = this.f37384c.f21363E;
                    C1737d c1737d = new C1737d(7, this.f37385d);
                    this.f37383b = 1;
                    if (c8203d2.collect(c1737d, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
