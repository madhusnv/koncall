package p001o;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public abstract class ol6 {

    /* renamed from: o.ol6$a */
    public static class ExecutorC15835a implements Executor {

        /* renamed from: a */
        public final Handler f38537a;

        public ExecutorC15835a(Handler handler) {
            this.f38537a = (Handler) fgd.m26663g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f38537a.post((Runnable) fgd.m26663g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f38537a + " is shutting down");
        }
    }

    /* renamed from: a */
    public static Executor m42377a(Handler handler) {
        return new ExecutorC15835a(handler);
    }
}
