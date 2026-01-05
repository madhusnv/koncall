package ik;

import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.m */
/* loaded from: classes.dex */
public final class C3289m extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f17508a;

    /* renamed from: b */
    public int f17509b;

    /* renamed from: c */
    public final /* synthetic */ C3291o f17510c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3289m(C3291o c3291o, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f17508a = i10;
        this.f17510c = c3291o;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f17508a) {
            case 0:
                return new C3289m(this.f17510c, interfaceC7559c, 0);
            default:
                return new C3289m(this.f17510c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f17508a) {
        }
        return ((C3289m) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17508a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f17509b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C3291o c3291o = this.f17510c;
                    InterfaceC8209j data = c3291o.f17515b.getData();
                    C3288l c3288l = new C3288l(0, c3291o.f17516c);
                    this.f17509b = 1;
                    if (data.collect(c3288l, this) == enumC7794a) {
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
                int i11 = this.f17509b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                InterfaceC8209j data2 = this.f17510c.f17515b.getData();
                this.f17509b = 1;
                Object objM15385p = c1.m15385p(data2, this);
                return objM15385p == enumC7794a2 ? enumC7794a2 : objM15385p;
        }
    }
}
