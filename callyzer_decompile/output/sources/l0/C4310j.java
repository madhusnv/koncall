package l0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import og.u1;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l0.j */
/* loaded from: classes.dex */
public class C4310j implements InterfaceFutureC8957d {

    /* renamed from: c */
    public static final C4310j f21736c = new C4310j(0, null);

    /* renamed from: a */
    public final /* synthetic */ int f21737a;

    /* renamed from: b */
    public final Object f21738b;

    public /* synthetic */ C4310j(int i10, Object obj) {
        this.f21737a = i10;
        this.f21738b = obj;
    }

    @Override // zh.InterfaceFutureC8957d
    /* renamed from: a */
    public final void mo9026a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
            u1.m10944c("ImmediateFuture");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f21737a) {
            case 0:
                return this.f21738b;
            default:
                throw new ExecutionException((Throwable) this.f21738b);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.f21737a) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f21738b + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f21738b) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
