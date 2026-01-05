package p001o;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class e0f implements Executor {

    /* renamed from: a */
    public final Executor f20715a;

    /* renamed from: o.e0f$a */
    public static class RunnableC13070a implements Runnable {

        /* renamed from: a */
        public final Runnable f20716a;

        public RunnableC13070a(Runnable runnable) {
            this.f20716a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20716a.run();
            } catch (Exception e) {
                aka.m17335d("Executor", "Background execution failure.", e);
            }
        }
    }

    public e0f(Executor executor) {
        this.f20715a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f20715a.execute(new RunnableC13070a(runnable));
    }
}
