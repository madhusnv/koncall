package p001o;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public enum bjj implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fna.m27126a().f23703a.post(runnable);
    }
}
