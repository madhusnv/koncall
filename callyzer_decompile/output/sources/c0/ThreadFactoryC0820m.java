package c0;

import a1.RunnableC0024w;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import wi.RunnableC8070t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.m */
/* loaded from: classes.dex */
public final class ThreadFactoryC0820m implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f5155a;

    /* renamed from: b */
    public final Number f5156b;

    public ThreadFactoryC0820m(int i10) {
        this.f5155a = i10;
        switch (i10) {
            case 1:
                this.f5156b = new AtomicInteger(0);
                break;
            case 2:
                this.f5156b = new AtomicInteger(1);
                break;
            case 3:
                this.f5156b = new AtomicInteger(0);
                break;
            default:
                this.f5156b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f5155a) {
            case 0:
                Thread thread = new Thread(new RunnableC0024w(2, runnable));
                thread.setPriority(7);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + ((AtomicInteger) this.f5156b).getAndIncrement());
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread2.setName("CameraX-camerax_io_" + ((AtomicInteger) this.f5156b).getAndIncrement());
                return thread2;
            case 2:
                return new Thread(runnable, "ModernAsyncTask #" + ((AtomicInteger) this.f5156b).getAndIncrement());
            case 3:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + ((AtomicInteger) this.f5156b).getAndIncrement());
                return thread3;
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new RunnableC8070t(runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f5156b).getAndIncrement());
                return threadNewThread;
        }
    }

    public ThreadFactoryC0820m(AtomicLong atomicLong) {
        this.f5155a = 4;
        this.f5156b = atomicLong;
    }
}
