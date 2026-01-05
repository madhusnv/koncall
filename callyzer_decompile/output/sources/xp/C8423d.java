package xp;

import aq.C0404g;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f9.C2222e;
import k2.C3953b;
import og.od;
import q1.C6097y;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xp.d */
/* loaded from: classes3.dex */
public final class C8423d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41115a;

    /* renamed from: b */
    public int f41116b;

    /* renamed from: c */
    public final /* synthetic */ C6097y f41117c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC7266z f41118d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2137a f41119e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2139c f41120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8423d(C6097y c6097y, InterfaceC7266z interfaceC7266z, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41115a = i10;
        this.f41117c = c6097y;
        this.f41118d = interfaceC7266z;
        this.f41119e = interfaceC2137a;
        this.f41120f = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41115a) {
            case 0:
                return new C8423d(this.f41117c, this.f41118d, this.f41119e, this.f41120f, interfaceC7559c, 0);
            default:
                return new C8423d(this.f41117c, this.f41118d, this.f41119e, this.f41120f, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41115a) {
        }
        return ((C8423d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41115a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f41116b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2222e c2222eM8522y = C3953b.m8522y(new C0404g(this.f41117c, 18));
                    C8422c c8422c = new C8422c(this.f41118d, this.f41119e, this.f41120f, null, 0);
                    this.f41116b = 1;
                    if (c1.m15379j(c2222eM8522y, c8422c, this) == enumC7794a) {
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
                int i11 = this.f41116b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C2222e c2222eM8522y2 = C3953b.m8522y(new C0404g(this.f41117c, 20));
                    C8422c c8422c2 = new C8422c(this.f41118d, this.f41119e, this.f41120f, null, 1);
                    this.f41116b = 1;
                    if (c1.m15379j(c2222eM8522y2, c8422c2, this) == enumC7794a2) {
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
