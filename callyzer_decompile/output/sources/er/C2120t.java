package er;

import aq.C0404g;
import dr.C1772v;
import ex.InterfaceC2141e;
import f9.C2222e;
import gr.C2713i;
import k2.C3953b;
import og.od;
import q1.C6097y;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.t */
/* loaded from: classes3.dex */
public final class C2120t extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9913a = 0;

    /* renamed from: b */
    public int f9914b;

    /* renamed from: c */
    public final /* synthetic */ C6097y f9915c;

    /* renamed from: d */
    public final /* synthetic */ C2713i f9916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2120t(C2713i c2713i, C6097y c6097y, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f9916d = c2713i;
        this.f9915c = c6097y;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9913a) {
            case 0:
                return new C2120t(this.f9916d, this.f9915c, interfaceC7559c);
            default:
                return new C2120t(this.f9915c, this.f9916d, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9913a) {
        }
        return ((C2120t) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9913a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f9914b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d = this.f9916d.f15140o;
                    C1772v c1772v = new C1772v(2, this.f9915c);
                    this.f9914b = 1;
                    if (c8203d.collect(c1772v, this) == enumC7794a) {
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
                int i11 = this.f9914b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C2222e c2222eM8522y = C3953b.m8522y(new C0404g(this.f9915c, 4));
                    C2121u c2121u = new C2121u(this.f9916d, null, 0);
                    this.f9914b = 1;
                    if (c1.m15379j(c2222eM8522y, c2121u, this) == enumC7794a2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2120t(C6097y c6097y, C2713i c2713i, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f9915c = c6097y;
        this.f9916d = c2713i;
    }
}
