package p001o;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class ul6 {

    /* renamed from: a */
    public static final Executor f49065a = new ExecutorC17394a();

    /* renamed from: b */
    public static final Executor f49066b = new ExecutorC17395b();

    /* renamed from: o.ul6$a */
    public class ExecutorC17394a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            uqi.m51939t(runnable);
        }
    }

    /* renamed from: o.ul6$b */
    public class ExecutorC17395b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m51707a() {
        return f49066b;
    }

    /* renamed from: b */
    public static Executor m51708b() {
        return f49065a;
    }
}
