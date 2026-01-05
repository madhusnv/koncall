package ey;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ey.a */
/* loaded from: classes3.dex */
public final class ExecutorC2146a implements Executor {

    /* renamed from: a */
    public static final ExecutorC2146a f9993a = new ExecutorC2146a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
