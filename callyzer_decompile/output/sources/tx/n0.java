package tx;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n0 implements o0 {

    /* renamed from: a */
    public final ScheduledFuture f34661a;

    public n0(ScheduledFuture scheduledFuture) {
        this.f34661a = scheduledFuture;
    }

    @Override // tx.o0
    public final void dispose() {
        this.f34661a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f34661a + ']';
    }
}
