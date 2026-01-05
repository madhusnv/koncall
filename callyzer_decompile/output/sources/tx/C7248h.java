package tx;

import ex.InterfaceC2139c;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.h */
/* loaded from: classes3.dex */
public final class C7248h implements InterfaceC7249i {

    /* renamed from: a */
    public final /* synthetic */ int f34633a;

    /* renamed from: b */
    public final Object f34634b;

    public /* synthetic */ C7248h(int i10, Object obj) {
        this.f34633a = i10;
        this.f34634b = obj;
    }

    @Override // tx.InterfaceC7249i
    /* renamed from: b */
    public final void mo5077b(Throwable th2) {
        switch (this.f34633a) {
            case 0:
                ((ScheduledFuture) this.f34634b).cancel(false);
                break;
            case 1:
                ((InterfaceC2139c) this.f34634b).invoke(th2);
                break;
            default:
                ((o0) this.f34634b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f34633a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f34634b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((InterfaceC2139c) this.f34634b).getClass().getSimpleName() + '@' + c0.m13494q(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.f34634b) + ']';
        }
    }
}
