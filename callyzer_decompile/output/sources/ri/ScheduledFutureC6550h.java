package ri;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l1.C4327p;
import x4.AbstractC8298h;
import x4.C8291a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ri.h */
/* loaded from: classes.dex */
public final class ScheduledFutureC6550h extends AbstractC8298h implements ScheduledFuture {

    /* renamed from: h */
    public final ScheduledFuture f31400h;

    public ScheduledFutureC6550h(InterfaceC6549g interfaceC6549g) {
        this.f31400h = interfaceC6549g.mo5398a(new C4327p(20, this));
    }

    @Override // x4.AbstractC8298h
    /* renamed from: c */
    public final void mo12571c() {
        ScheduledFuture scheduledFuture = this.f31400h;
        Object obj = this.f39841a;
        scheduledFuture.cancel((obj instanceof C8291a) && ((C8291a) obj).f39821a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f31400h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f31400h.getDelay(timeUnit);
    }
}
