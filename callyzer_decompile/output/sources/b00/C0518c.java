package b00;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;
import oj.C5392d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b00.c */
/* loaded from: classes3.dex */
public final class C0518c extends Thread {

    /* renamed from: a */
    public final /* synthetic */ int f3594a = 0;

    public /* synthetic */ C0518c(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        switch (this.f3594a) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C0521f.f3614h;
                reentrantLock = C0521f.f3614h;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                C0521f c0521fM11110i = C5392d.m11110i();
                if (c0521fM11110i == C0521f.f3618l) {
                    C0521f.f3618l = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (c0521fM11110i != null) {
                        c0521fM11110i.mo1558j();
                    }
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public /* synthetic */ C0518c(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
