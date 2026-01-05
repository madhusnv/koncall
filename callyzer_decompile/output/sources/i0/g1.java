package i0;

import a1.C0007f;
import a1.RunnableC0012k;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 implements d7.h0 {

    /* renamed from: a */
    public final AtomicBoolean f16463a = new AtomicBoolean(true);

    /* renamed from: b */
    public final C0007f f16464b;

    /* renamed from: c */
    public final Executor f16465c;

    public g1(Executor executor, C0007f c0007f) {
        this.f16465c = executor;
        this.f16464b = c0007f;
    }

    @Override // d7.h0
    public final void onChanged(Object obj) {
        this.f16465c.execute(new RunnableC0012k(23, this, (h1) obj));
    }
}
