package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class xxf {

    /* renamed from: a */
    public final AtomicReference f54464a = new AtomicReference(ukh.m51688a());

    /* renamed from: b */
    public final Object f54465b = new Object();

    /* renamed from: a */
    public final Object m56939a() {
        return ((tkh) this.f54464a.get()).m50144b(Thread.currentThread().getId());
    }

    /* renamed from: b */
    public final void m56940b(Object obj) {
        long id = Thread.currentThread().getId();
        synchronized (this.f54465b) {
            tkh tkhVar = (tkh) this.f54464a.get();
            if (tkhVar.m50146d(id, obj)) {
                return;
            }
            this.f54464a.set(tkhVar.m50145c(id, obj));
            y3i y3iVar = y3i.f54824a;
        }
    }
}
