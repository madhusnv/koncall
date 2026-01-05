package ay;

import a2.AbstractC0030c;
import tx.c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.k */
/* loaded from: classes3.dex */
public final class C0501k extends AbstractRunnableC0500j {

    /* renamed from: c */
    public final Runnable f3545c;

    public C0501k(Runnable runnable, long j6, boolean z6) {
        super(z6, j6);
        this.f3545c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3545c.run();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f3545c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(c0.m13494q(runnable));
        sb2.append(", ");
        sb2.append(this.f3543a);
        sb2.append(", ");
        return AbstractC0030c.m123n(sb2, this.f3544b ? "Blocking" : "Non-blocking", ']');
    }
}
