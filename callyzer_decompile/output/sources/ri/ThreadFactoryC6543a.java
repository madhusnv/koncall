package ri;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import qi.RunnableC6224g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ri.a */
/* loaded from: classes.dex */
public final class ThreadFactoryC6543a implements ThreadFactory {

    /* renamed from: e */
    public static final ThreadFactory f31376e = Executors.defaultThreadFactory();

    /* renamed from: a */
    public final AtomicLong f31377a = new AtomicLong();

    /* renamed from: b */
    public final String f31378b;

    /* renamed from: c */
    public final int f31379c;

    /* renamed from: d */
    public final StrictMode.ThreadPolicy f31380d;

    public ThreadFactoryC6543a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f31378b = str;
        this.f31379c = i10;
        this.f31380d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f31376e.newThread(new RunnableC6224g(3, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f31378b + " Thread #" + this.f31377a.getAndIncrement());
        return threadNewThread;
    }
}
