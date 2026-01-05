package x4;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x4.l */
/* loaded from: classes.dex */
public final class C8302l implements InterfaceFutureC8957d {

    /* renamed from: a */
    public final WeakReference f39849a;

    /* renamed from: b */
    public final C8301k f39850b = new C8301k(this);

    public C8302l(C8299i c8299i) {
        this.f39849a = new WeakReference(c8299i);
    }

    @Override // zh.InterfaceFutureC8957d
    /* renamed from: a */
    public final void mo9026a(Runnable runnable, Executor executor) {
        this.f39850b.mo9026a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        C8299i c8299i = (C8299i) this.f39849a.get();
        boolean zCancel = this.f39850b.cancel(z6);
        if (zCancel && c8299i != null) {
            c8299i.f39844a = null;
            c8299i.f39845b = null;
            c8299i.f39846c.m15504j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f39850b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f39850b.f39841a instanceof C8291a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f39850b.isDone();
    }

    public final String toString() {
        return this.f39850b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f39850b.get(j6, timeUnit);
    }
}
