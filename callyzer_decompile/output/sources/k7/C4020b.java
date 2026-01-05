package k7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.CallableC3892b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k7.b */
/* loaded from: classes.dex */
public final class C4020b extends FutureTask {

    /* renamed from: a */
    public final /* synthetic */ RunnableC4019a f20797a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4020b(RunnableC4019a runnableC4019a, CallableC3892b callableC3892b) {
        super(callableC3892b);
        this.f20797a = runnableC4019a;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC4019a runnableC4019a = this.f20797a;
        AtomicBoolean atomicBoolean = runnableC4019a.f20794e;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            runnableC4019a.m8822b(obj);
        } catch (InterruptedException unused) {
        } catch (CancellationException unused2) {
            if (atomicBoolean.get()) {
                return;
            }
            runnableC4019a.m8822b(null);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
