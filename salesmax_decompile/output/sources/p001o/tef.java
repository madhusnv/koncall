package p001o;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class tef implements Executor {

    /* renamed from: b */
    public final Executor f46964b;

    /* renamed from: a */
    public final Deque f46963a = new ArrayDeque();

    /* renamed from: c */
    public final RunnableC17071b f46965c = new RunnableC17071b();

    /* renamed from: d */
    public EnumC17072c f46966d = EnumC17072c.IDLE;

    /* renamed from: e */
    public long f46967e = 0;

    /* renamed from: o.tef$a */
    public class RunnableC17070a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f46968a;

        public RunnableC17070a(Runnable runnable) {
            this.f46968a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46968a.run();
        }
    }

    /* renamed from: o.tef$b */
    public final class RunnableC17071b implements Runnable {
        public RunnableC17071b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        
            p001o.wja.m54630d("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m49794a() {
            boolean z = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (tef.this.f46963a) {
                        if (!z) {
                            tef tefVar = tef.this;
                            EnumC17072c enumC17072c = tefVar.f46966d;
                            EnumC17072c enumC17072c2 = EnumC17072c.RUNNING;
                            if (enumC17072c != enumC17072c2) {
                                tefVar.f46967e++;
                                tefVar.f46966d = enumC17072c2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) tef.this.f46963a.poll();
                        if (runnable == null) {
                            tef.this.f46966d = EnumC17072c.IDLE;
                        }
                    }
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } finally {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m49794a();
            } catch (Error e) {
                synchronized (tef.this.f46963a) {
                    tef.this.f46966d = EnumC17072c.IDLE;
                    throw e;
                }
            }
        }
    }

    /* renamed from: o.tef$c */
    public enum EnumC17072c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public tef(Executor executor) {
        this.f46964b = (Executor) fgd.m26663g(executor);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        EnumC17072c enumC17072c;
        fgd.m26663g(runnable);
        synchronized (this.f46963a) {
            EnumC17072c enumC17072c2 = this.f46966d;
            if (enumC17072c2 != EnumC17072c.RUNNING && enumC17072c2 != (enumC17072c = EnumC17072c.QUEUED)) {
                long j = this.f46967e;
                RunnableC17070a runnableC17070a = new RunnableC17070a(runnable);
                this.f46963a.add(runnableC17070a);
                EnumC17072c enumC17072c3 = EnumC17072c.QUEUING;
                this.f46966d = enumC17072c3;
                try {
                    this.f46964b.execute(this.f46965c);
                    if (this.f46966d != enumC17072c3) {
                        return;
                    }
                    synchronized (this.f46963a) {
                        if (this.f46967e == j && this.f46966d == enumC17072c3) {
                            this.f46966d = enumC17072c;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f46963a) {
                        EnumC17072c enumC17072c4 = this.f46966d;
                        if ((enumC17072c4 != EnumC17072c.IDLE && enumC17072c4 != EnumC17072c.QUEUING) || !this.f46963a.removeLastOccurrence(runnableC17070a)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f46963a.add(runnable);
        }
    }
}
