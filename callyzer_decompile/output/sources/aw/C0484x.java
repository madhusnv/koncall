package aw;

import com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager;
import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.x */
/* loaded from: classes3.dex */
public final class C0484x extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3459a;

    /* renamed from: b */
    public int f3460b;

    /* renamed from: c */
    public final /* synthetic */ RetrieveWebSubscriptionWorkManager f3461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0484x(RetrieveWebSubscriptionWorkManager retrieveWebSubscriptionWorkManager, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3459a = i10;
        this.f3461c = retrieveWebSubscriptionWorkManager;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3459a) {
            case 0:
                return new C0484x(this.f3461c, interfaceC7559c, 0);
            default:
                return new C0484x(this.f3461c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3459a) {
        }
        return ((C0484x) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3459a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f3460b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    rn.h0 h0Var = this.f3461c.f7490e;
                    this.f3460b = 1;
                    if (h0Var.m12604E(this) == enumC7794a) {
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
                int i11 = this.f3460b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f3460b = 1;
                    if (RetrieveWebSubscriptionWorkManager.m5051a(this.f3461c, this) == enumC7794a2) {
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
