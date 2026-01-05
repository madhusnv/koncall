package nu;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.common.exception.SimStateException;
import ex.InterfaceC2141e;
import io.C3328c;
import kotlin.NoWhenBranchMatchedException;
import ln.C4490c;
import og.od;
import pg.f9;
import pu.C6035c;
import pu.C6036d;
import pu.C6037e;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nu.g */
/* loaded from: classes3.dex */
public final class C5146g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f25201a;

    /* renamed from: b */
    public final /* synthetic */ C3328c f25202b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5146g(C3328c c3328c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f25202b = c3328c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C5146g(this.f25202b, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C5146g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f25201a;
        C3328c c3328c = this.f25202b;
        try {
            if (i10 == 0) {
                od.m10798c(obj);
                C4490c c4490c = (C4490c) c3328c.f17614f;
                this.f25201a = 1;
                obj = c4490c.m9334a(this);
                if (obj == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return ((Boolean) obj).booleanValue() ? new C6036d(f9.m11628b((Context) c3328c.f17617i, R.string.ts_sim_card_error_msg_1), new C6035c(SimStateException.EnumC1456a.NO_AVAILABLE_SIM_IN_DB)) : new C6037e(f9.m11628b((Context) c3328c.f17617i, R.string.ts_sim_card_success_msg));
        } catch (SimStateException e2) {
            C8805t c8805t = (C8805t) c3328c.f17613e;
            Context context = (Context) c3328c.f17617i;
            c8805t.m16233h("TroubleshootingManager", "isSimCardPresent: " + e2.getMessage(), e2);
            int[] iArr = AbstractC5145f.f25200a;
            SimStateException.EnumC1456a enumC1456a = e2.f7329a;
            switch (iArr[enumC1456a.ordinal()]) {
                case 1:
                    return new C6036d(f9.m11628b(context, R.string.ts_sim_card_error_msg_2), new C6035c(SimStateException.EnumC1456a.NO_SIM_FOUND));
                case 2:
                case 3:
                    return new C6036d(f9.m11628b(context, R.string.ts_sim_card_error_msg_3), new C6035c(SimStateException.EnumC1456a.NO_AVAILABLE_SIM_IN_DB));
                case 4:
                    return new C6036d(f9.m11628b(context, R.string.ts_sim_card_error_msg_4), new C6035c(SimStateException.EnumC1456a.CONNECTED_SIM_NOT_EXIST_ON_DEVICE));
                case 5:
                case 6:
                    return new C6036d(f9.m11628b(context, R.string.ts_sim_card_error_msg_5), new C6035c(enumC1456a));
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e10) {
            ((C8805t) c3328c.f17613e).m16233h("TroubleshootingManager", "isSimCardPresent: " + e10.getMessage(), e10);
            return new C6036d(f9.m11628b((Context) c3328c.f17617i, R.string.ts_sim_card_error_msg_6), null);
        }
    }
}
