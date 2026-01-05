package g2;

import ex.InterfaceC2141e;
import q1.C6097y;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c3 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11293a;

    /* renamed from: b */
    public int f11294b;

    /* renamed from: c */
    public final /* synthetic */ C6097y f11295c;

    /* renamed from: d */
    public final /* synthetic */ int f11296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(C6097y c6097y, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(2, interfaceC7559c);
        this.f11293a = i11;
        this.f11295c = c6097y;
        this.f11296d = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f11293a) {
            case 0:
                return new c3(this.f11295c, this.f11296d, interfaceC7559c, 0);
            default:
                return new c3(this.f11295c, this.f11296d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f11293a) {
        }
        return ((c3) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f11293a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f11294b;
                if (i10 == 0) {
                    og.od.m10798c(obj);
                    C6097y c6097y = this.f11295c;
                    if (!c6097y.f29777h.mo7520a()) {
                        int iM8526f = c6097y.f29773d.f29752b.m8526f();
                        int i11 = this.f11296d;
                        if (iM8526f != i11) {
                            this.f11294b = 1;
                            if (C6097y.m12132j(c6097y, i11, this) == enumC7794a) {
                                return enumC7794a;
                            }
                        }
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
                int i12 = this.f11294b;
                if (i12 == 0) {
                    og.od.m10798c(obj);
                    C6097y c6097y2 = this.f11295c;
                    int iM8526f2 = c6097y2.f29773d.f29752b.m8526f();
                    int i13 = this.f11296d;
                    if (iM8526f2 != i13) {
                        this.f11294b = 1;
                        if (C6097y.m12132j(c6097y2, i13, this) == enumC7794a2) {
                            return enumC7794a2;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
