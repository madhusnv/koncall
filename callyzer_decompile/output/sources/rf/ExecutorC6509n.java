package rf;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.n */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC6509n implements Executor {

    /* renamed from: a */
    public final /* synthetic */ int f31252a;

    /* renamed from: b */
    public final Handler f31253b;

    public /* synthetic */ ExecutorC6509n(Handler handler, int i10) {
        this.f31252a = i10;
        this.f31253b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f31252a) {
            case 0:
                this.f31253b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f31253b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.f31253b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
