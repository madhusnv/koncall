package jakarta.mail;

import jakarta.mail.event.AbstractC3642e;
import java.security.AccessController;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.f */
/* loaded from: classes3.dex */
public final class RunnableC3648f implements Runnable {

    /* renamed from: c */
    public static WeakHashMap f19305c;

    /* renamed from: a */
    public volatile LinkedBlockingQueue f19306a;

    /* renamed from: b */
    public final Executor f19307b;

    public RunnableC3648f(Executor executor) {
        this.f19307b = executor;
    }

    /* renamed from: b */
    public static synchronized RunnableC3648f m8191b(Executor executor) {
        RunnableC3648f runnableC3648f;
        try {
            c0 c0Var = c0.f19285k;
            ClassLoader classLoader = (ClassLoader) AccessController.doPrivileged(new C3696x(1));
            if (f19305c == null) {
                f19305c = new WeakHashMap();
            }
            runnableC3648f = (RunnableC3648f) f19305c.get(classLoader);
            if (runnableC3648f == null) {
                runnableC3648f = new RunnableC3648f(executor);
                f19305c.put(classLoader, runnableC3648f);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return runnableC3648f;
    }

    /* renamed from: a */
    public final synchronized void m8192a(AbstractC3642e abstractC3642e, Vector vector) {
        try {
            if (this.f19306a == null) {
                this.f19306a = new LinkedBlockingQueue();
                Executor executor = this.f19307b;
                if (executor != null) {
                    executor.execute(this);
                } else {
                    Thread thread = new Thread(this, "Jakarta-Mail-EventQueue");
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            this.f19306a.add(new C3636d(abstractC3642e, vector));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final synchronized void m8193c() {
        if (this.f19306a != null) {
            Vector vector = new Vector();
            vector.setSize(1);
            this.f19306a.add(new C3636d(new C3637e(0, new Object()), vector));
            this.f19306a = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedBlockingQueue linkedBlockingQueue = this.f19306a;
        if (linkedBlockingQueue == null) {
            return;
        }
        while (true) {
            try {
                C3636d c3636d = (C3636d) linkedBlockingQueue.take();
                AbstractC3642e abstractC3642e = c3636d.f19297a;
                Vector vector = c3636d.f19298b;
                for (int i10 = 0; i10 < vector.size(); i10++) {
                    try {
                        abstractC3642e.dispatch(vector.elementAt(i10));
                    } catch (Throwable th2) {
                        if (th2 instanceof InterruptedException) {
                            return;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
