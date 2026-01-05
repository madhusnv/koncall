package g2;

import ex.InterfaceC2141e;
import h1.C2772c;
import s4.C6750f;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ib extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11819a;

    /* renamed from: b */
    public int f11820b;

    /* renamed from: c */
    public final /* synthetic */ C2772c f11821c;

    /* renamed from: d */
    public final /* synthetic */ float f11822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib(C2772c c2772c, float f6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f11819a = i10;
        this.f11821c = c2772c;
        this.f11822d = f6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f11819a) {
            case 0:
                return new ib(this.f11821c, this.f11822d, interfaceC7559c, 0);
            default:
                return new ib(this.f11821c, this.f11822d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f11819a) {
        }
        return ((ib) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11819a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f11820b;
                if (i10 == 0) {
                    og.od.m10798c(obj);
                    C6750f c6750f = new C6750f(this.f11822d);
                    h1.w1 w1Var = dc.f11413c;
                    this.f11820b = 1;
                    if (C2772c.m6774c(this.f11821c, c6750f, w1Var, this, 12) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f11820b;
                if (i11 == 0) {
                    og.od.m10798c(obj);
                    C6750f c6750f2 = new C6750f(this.f11822d);
                    h1.w1 w1Var2 = dc.f11413c;
                    this.f11820b = 1;
                    if (C2772c.m6774c(this.f11821c, c6750f2, w1Var2, this, 12) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
