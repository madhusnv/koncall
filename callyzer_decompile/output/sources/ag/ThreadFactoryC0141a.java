package ag;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ag.a */
/* loaded from: classes.dex */
public final class ThreadFactoryC0141a implements ThreadFactory {

    /* renamed from: a */
    public final String f448a;

    /* renamed from: b */
    public final ThreadFactory f449b = Executors.defaultThreadFactory();

    public ThreadFactoryC0141a(String str) {
        this.f448a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f449b.newThread(new RunnableC0142b(runnable, 0));
        threadNewThread.setName(this.f448a);
        return threadNewThread;
    }
}
