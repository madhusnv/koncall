package androidx.room;

import androidx.room.TransactionExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p001o.sq8;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class TransactionExecutor implements Executor {
    private Runnable active;
    private final Executor executor;
    private final Object syncLock;
    private final ArrayDeque<Runnable> tasks;

    public TransactionExecutor(Executor executor) {
        sq8.m48649h(executor, "executor");
        this.executor = executor;
        this.tasks = new ArrayDeque<>();
        this.syncLock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1$lambda$0(Runnable runnable, TransactionExecutor transactionExecutor) {
        sq8.m48649h(runnable, "$command");
        sq8.m48649h(transactionExecutor, "this$0");
        try {
            runnable.run();
        } finally {
            transactionExecutor.scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        sq8.m48649h(runnable, "command");
        synchronized (this.syncLock) {
            this.tasks.offer(new Runnable() { // from class: o.guh
                @Override // java.lang.Runnable
                public final void run() {
                    TransactionExecutor.execute$lambda$1$lambda$0(runnable, this);
                }
            });
            if (this.active == null) {
                scheduleNext();
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    public final void scheduleNext() {
        synchronized (this.syncLock) {
            Runnable runnablePoll = this.tasks.poll();
            Runnable runnable = runnablePoll;
            this.active = runnable;
            if (runnablePoll != null) {
                this.executor.execute(runnable);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }
}
