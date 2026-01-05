package xm;

import ex.InterfaceC2141e;
import mm.C4802m;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l5 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40543a;

    /* renamed from: b */
    public int f40544b;

    /* renamed from: c */
    public final /* synthetic */ y5 f40545c;

    /* renamed from: d */
    public final /* synthetic */ C4802m f40546d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5(y5 y5Var, C4802m c4802m, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40543a = i10;
        this.f40545c = y5Var;
        this.f40546d = c4802m;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40543a) {
            case 0:
                return new l5(this.f40545c, this.f40546d, interfaceC7559c, 0);
            default:
                return new l5(this.f40545c, this.f40546d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40543a) {
        }
        return ((l5) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40543a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f40544b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    gn.x2 x2Var = this.f40545c.f41049a;
                    this.f40544b = 1;
                    if (x2Var.g0(this.f40546d, this) == enumC7794a) {
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
                int i11 = this.f40544b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    gn.x2 x2Var2 = this.f40545c.f41049a;
                    this.f40544b = 1;
                    if (x2Var2.Q0(this.f40546d, this) == enumC7794a2) {
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
