package ug;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 extends Thread {

    /* renamed from: a */
    public final Object f35586a;

    /* renamed from: b */
    public final BlockingQueue f35587b;

    /* renamed from: c */
    public boolean f35588c = false;

    /* renamed from: d */
    public final /* synthetic */ m1 f35589d;

    public l1(m1 m1Var, String str, BlockingQueue blockingQueue) {
        this.f35589d = m1Var;
        AbstractC6840z.m13036g(blockingQueue);
        this.f35586a = new Object();
        this.f35587b = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m14027a() {
        m1 m1Var = this.f35589d;
        synchronized (m1Var.f35615j) {
            try {
                if (!this.f35588c) {
                    m1Var.f35616k.release();
                    m1Var.f35615j.notifyAll();
                    if (this == m1Var.f35609c) {
                        m1Var.f35609c = null;
                    } else if (this == m1Var.f35610d) {
                        m1Var.f35610d = null;
                    } else {
                        v0 v0Var = ((n1) m1Var.f482a).f35669f;
                        n1.m14085m(v0Var);
                        v0Var.f35862f.m14140a("Current scheduler thread is neither worker nor network");
                    }
                    this.f35588c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        boolean z6 = false;
        while (!z6) {
            try {
                this.f35589d.f35616k.acquire();
                z6 = true;
            } catch (InterruptedException e2) {
                v0 v0Var = ((n1) this.f35589d.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14141b(e2, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f35587b;
                k1 k1Var = (k1) blockingQueue.poll();
                if (k1Var != null) {
                    Process.setThreadPriority(true != k1Var.f35563b ? 10 : threadPriority);
                    k1Var.run();
                } else {
                    Object obj = this.f35586a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f35589d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e10) {
                                v0 v0Var2 = ((n1) this.f35589d.f482a).f35669f;
                                n1.m14085m(v0Var2);
                                v0Var2.f35865j.m14141b(e10, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f35589d.f35615j) {
                        if (this.f35587b.peek() == null) {
                            m14027a();
                            m14027a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            m14027a();
            throw th2;
        }
    }
}
