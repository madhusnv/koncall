package p001o;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes3.dex */
public class oma {

    /* renamed from: e */
    public static Executor f38585e = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final Set f38586a;

    /* renamed from: b */
    public final Set f38587b;

    /* renamed from: c */
    public final Handler f38588c;

    /* renamed from: d */
    public volatile nma f38589d;

    /* renamed from: o.oma$a */
    public class RunnableC15840a implements Runnable {
        public RunnableC15840a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (oma.this.f38589d == null) {
                return;
            }
            nma nmaVar = oma.this.f38589d;
            if (nmaVar.m40788b() != null) {
                oma.this.m42434i(nmaVar.m40788b());
            } else {
                oma.this.m42432g(nmaVar.m40787a());
            }
        }
    }

    /* renamed from: o.oma$b */
    public class C15841b extends FutureTask {
        public C15841b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                oma.this.m42437l((nma) get());
            } catch (InterruptedException | ExecutionException e) {
                oma.this.m42437l(new nma(e));
            }
        }
    }

    public oma(Callable callable) {
        this(callable, false);
    }

    /* renamed from: e */
    public synchronized oma m42430e(ima imaVar) {
        if (this.f38589d != null && this.f38589d.m40787a() != null) {
            imaVar.onResult(this.f38589d.m40787a());
        }
        this.f38587b.add(imaVar);
        return this;
    }

    /* renamed from: f */
    public synchronized oma m42431f(ima imaVar) {
        if (this.f38589d != null && this.f38589d.m40788b() != null) {
            imaVar.onResult(this.f38589d.m40788b());
        }
        this.f38586a.add(imaVar);
        return this;
    }

    /* renamed from: g */
    public final synchronized void m42432g(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f38587b);
        if (arrayList.isEmpty()) {
            rja.m46867d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ima) it.next()).onResult(th);
        }
    }

    /* renamed from: h */
    public final void m42433h() {
        this.f38588c.post(new RunnableC15840a());
    }

    /* renamed from: i */
    public final synchronized void m42434i(Object obj) {
        Iterator it = new ArrayList(this.f38586a).iterator();
        while (it.hasNext()) {
            ((ima) it.next()).onResult(obj);
        }
    }

    /* renamed from: j */
    public synchronized oma m42435j(ima imaVar) {
        this.f38587b.remove(imaVar);
        return this;
    }

    /* renamed from: k */
    public synchronized oma m42436k(ima imaVar) {
        this.f38586a.remove(imaVar);
        return this;
    }

    /* renamed from: l */
    public final void m42437l(nma nmaVar) {
        if (this.f38589d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f38589d = nmaVar;
        m42433h();
    }

    public oma(Callable callable, boolean z) {
        this.f38586a = new LinkedHashSet(1);
        this.f38587b = new LinkedHashSet(1);
        this.f38588c = new Handler(Looper.getMainLooper());
        this.f38589d = null;
        if (!z) {
            f38585e.execute(new C15841b(callable));
            return;
        }
        try {
            m42437l((nma) callable.call());
        } catch (Throwable th) {
            m42437l(new nma(th));
        }
    }
}
