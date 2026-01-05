package androidx.work;

import java.util.concurrent.Executor;
import p001o.sq8;

/* loaded from: classes2.dex */
public enum DirectExecutor implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        sq8.m48649h(runnable, "command");
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
