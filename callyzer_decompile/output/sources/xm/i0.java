package xm;

import ex.InterfaceC2141e;
import mm.C4791b;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40399a;

    /* renamed from: b */
    public int f40400b;

    /* renamed from: c */
    public final /* synthetic */ x1 f40401c;

    /* renamed from: d */
    public final /* synthetic */ C4791b f40402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(x1 x1Var, C4791b c4791b, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40399a = i10;
        this.f40401c = x1Var;
        this.f40402d = c4791b;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40399a) {
            case 0:
                return new i0(this.f40401c, this.f40402d, interfaceC7559c, 0);
            default:
                return new i0(this.f40401c, this.f40402d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40399a) {
        }
        return ((i0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40399a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f40400b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C4791b c4791bM9712a = C4791b.m9712a(this.f40402d, null, null, null, null, null, null, null, null, false, 4031);
                    this.f40400b = 1;
                    if (this.f40401c.m15657H(c4791bM9712a, this) == enumC7794a) {
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
                int i11 = this.f40400b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var = this.f40401c.f40991a;
                this.f40400b = 1;
                Object objM487y = x2Var.f14941a.m487y(this.f40402d, this);
                return objM487y == enumC7794a2 ? enumC7794a2 : objM487y;
        }
    }
}
