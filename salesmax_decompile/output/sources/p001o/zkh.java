package p001o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class zkh {
    /* renamed from: b */
    public static final ql6 m59569b(final int i, final String str) {
        if (i >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return vl6.m52909b(Executors.newScheduledThreadPool(i, new ThreadFactory() { // from class: o.ykh
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return zkh.m59570c(i, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
    }

    /* renamed from: c */
    public static final Thread m59570c(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
