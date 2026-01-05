package bt;

import aq.C0404g;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import og.od;
import q1.C6097y;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.y */
/* loaded from: classes3.dex */
public final class C0780y extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4951a;

    /* renamed from: b */
    public int f4952b;

    /* renamed from: c */
    public final /* synthetic */ C6097y f4953c;

    /* renamed from: d */
    public final /* synthetic */ List f4954d;

    /* renamed from: e */
    public final /* synthetic */ k2.w0 f4955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0780y(C6097y c6097y, List list, k2.w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4951a = i10;
        this.f4953c = c6097y;
        this.f4954d = list;
        this.f4955e = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4951a) {
            case 0:
                return new C0780y(this.f4953c, this.f4954d, this.f4955e, interfaceC7559c, 0);
            default:
                return new C0780y(this.f4953c, this.f4954d, this.f4955e, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f4951a) {
        }
        return ((C0780y) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4951a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f4952b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jM15382m = c1.m15382m(new C0779x(C3953b.m8522y(new C0404g(this.f4953c, 1)), 0));
                    C0776u c0776u = new C0776u(this.f4954d, this.f4955e, null, 0);
                    this.f4952b = 1;
                    if (c1.m15379j(interfaceC8209jM15382m, c0776u, this) == enumC7794a) {
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
                int i11 = this.f4952b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jM15382m2 = c1.m15382m(new C0779x(C3953b.m8522y(new C0404g(this.f4953c, 11)), 2));
                    C0776u c0776u2 = new C0776u(this.f4954d, this.f4955e, null, 1);
                    this.f4952b = 1;
                    if (c1.m15379j(interfaceC8209jM15382m2, c0776u2, this) == enumC7794a2) {
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
