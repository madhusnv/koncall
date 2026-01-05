package p001o;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p001o.ig6;

/* loaded from: classes5.dex */
public final class an {

    /* renamed from: a */
    public final boolean f15025a;

    /* renamed from: b */
    public final Executor f15026b;

    /* renamed from: c */
    public final Map f15027c;

    /* renamed from: d */
    public final ReferenceQueue f15028d;

    /* renamed from: e */
    public ig6.InterfaceC14285a f15029e;

    /* renamed from: f */
    public volatile boolean f15030f;

    /* renamed from: o.an$a */
    public class ThreadFactoryC12225a implements ThreadFactory {

        /* renamed from: o.an$a$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f15031a;

            public a(Runnable runnable) {
                this.f15031a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f15031a.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: o.an$b */
    public class RunnableC12226b implements Runnable {
        public RunnableC12226b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            an.this.m17507b();
        }
    }

    /* renamed from: o.an$c */
    public static final class C12227c extends WeakReference {

        /* renamed from: a */
        public final ic9 f15034a;

        /* renamed from: b */
        public final boolean f15035b;

        /* renamed from: c */
        public zne f15036c;

        public C12227c(ic9 ic9Var, ig6 ig6Var, ReferenceQueue referenceQueue, boolean z) {
            super(ig6Var, referenceQueue);
            this.f15034a = (ic9) bgd.m18886d(ic9Var);
            this.f15036c = (ig6Var.m32107d() && z) ? (zne) bgd.m18886d(ig6Var.m32106c()) : null;
            this.f15035b = ig6Var.m32107d();
        }

        /* renamed from: a */
        public void m17512a() {
            this.f15036c = null;
            clear();
        }
    }

    public an(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC12225a()));
    }

    /* renamed from: a */
    public synchronized void m17506a(ic9 ic9Var, ig6 ig6Var) {
        C12227c c12227c = (C12227c) this.f15027c.put(ic9Var, new C12227c(ic9Var, ig6Var, this.f15028d, this.f15025a));
        if (c12227c != null) {
            c12227c.m17512a();
        }
    }

    /* renamed from: b */
    public void m17507b() {
        while (!this.f15030f) {
            try {
                m17508c((C12227c) this.f15028d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void m17508c(C12227c c12227c) {
        zne zneVar;
        synchronized (this) {
            this.f15027c.remove(c12227c.f15034a);
            if (c12227c.f15035b && (zneVar = c12227c.f15036c) != null) {
                this.f15029e.mo32109b(c12227c.f15034a, new ig6(zneVar, true, false, c12227c.f15034a, this.f15029e));
            }
        }
    }

    /* renamed from: d */
    public synchronized void m17509d(ic9 ic9Var) {
        C12227c c12227c = (C12227c) this.f15027c.remove(ic9Var);
        if (c12227c != null) {
            c12227c.m17512a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public synchronized ig6 m17510e(ic9 ic9Var) {
        C12227c c12227c = (C12227c) this.f15027c.get(ic9Var);
        if (c12227c == null) {
            return null;
        }
        ig6 ig6Var = (ig6) c12227c.get();
        if (ig6Var == null) {
            m17508c(c12227c);
        }
        return ig6Var;
    }

    /* renamed from: f */
    public void m17511f(ig6.InterfaceC14285a interfaceC14285a) {
        synchronized (interfaceC14285a) {
            synchronized (this) {
                this.f15029e = interfaceC14285a;
            }
        }
    }

    public an(boolean z, Executor executor) {
        this.f15027c = new HashMap();
        this.f15028d = new ReferenceQueue();
        this.f15025a = z;
        this.f15026b = executor;
        executor.execute(new RunnableC12226b());
    }
}
