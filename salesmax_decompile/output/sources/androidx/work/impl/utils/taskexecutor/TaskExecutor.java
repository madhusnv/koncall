package androidx.work.impl.utils.taskexecutor;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface TaskExecutor {
    default void executeOnTaskThread(Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    Executor getMainThreadExecutor();

    SerialExecutor getSerialTaskExecutor();
}
