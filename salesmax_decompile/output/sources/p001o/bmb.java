package p001o;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public abstract class bmb {

    /* renamed from: o.bmb$a */
    public class ExecutorC12454a implements Executor {

        /* renamed from: a */
        public final /* synthetic */ Executor f16532a;

        /* renamed from: b */
        public final /* synthetic */ p7 f16533b;

        public ExecutorC12454a(Executor executor, p7 p7Var) {
            this.f16532a = executor;
            this.f16533b = p7Var;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                this.f16532a.execute(runnable);
            } catch (RejectedExecutionException e) {
                this.f16533b.mo43036C(e);
            }
        }
    }

    /* renamed from: a */
    public static Executor m19375a() {
        return jt5.INSTANCE;
    }

    /* renamed from: b */
    public static Executor m19376b(Executor executor, p7 p7Var) {
        dgd.m23062o(executor);
        dgd.m23062o(p7Var);
        return executor == m19375a() ? executor : new ExecutorC12454a(executor, p7Var);
    }
}
