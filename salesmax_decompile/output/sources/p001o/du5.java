package p001o;

import com.google.android.gms.common.api.Api;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001o.yce;

/* loaded from: classes6.dex */
public final class du5 {

    /* renamed from: c */
    public Runnable f20533c;

    /* renamed from: d */
    public ExecutorService f20534d;

    /* renamed from: a */
    public int f20531a = 64;

    /* renamed from: b */
    public int f20532b = 5;

    /* renamed from: e */
    public final ArrayDeque f20535e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f20536f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f20537g = new ArrayDeque();

    /* renamed from: a */
    public final void m23821a(yce.RunnableC18377a runnableC18377a) {
        yce.RunnableC18377a runnableC18377aM23824d;
        sq8.m48649h(runnableC18377a, "call");
        synchronized (this) {
            this.f20535e.add(runnableC18377a);
            if (!runnableC18377a.m57602d().m57588n() && (runnableC18377aM23824d = m23824d(runnableC18377a.m57604f())) != null) {
                runnableC18377a.m57605g(runnableC18377aM23824d);
            }
            y3i y3iVar = y3i.f54824a;
        }
        m23828h();
    }

    /* renamed from: b */
    public final synchronized void m23822b(yce yceVar) {
        sq8.m48649h(yceVar, "call");
        this.f20537g.add(yceVar);
    }

    /* renamed from: c */
    public final synchronized ExecutorService m23823c() {
        ExecutorService executorService;
        if (this.f20534d == null) {
            this.f20534d = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), jgj.m33821o(jgj.f30422f + " Dispatcher", false));
        }
        executorService = this.f20534d;
        sq8.m48646e(executorService);
        return executorService;
    }

    /* renamed from: d */
    public final yce.RunnableC18377a m23824d(String str) {
        Iterator it = this.f20536f.iterator();
        while (it.hasNext()) {
            yce.RunnableC18377a runnableC18377a = (yce.RunnableC18377a) it.next();
            if (sq8.m48644c(runnableC18377a.m57604f(), str)) {
                return runnableC18377a;
            }
        }
        Iterator it2 = this.f20535e.iterator();
        while (it2.hasNext()) {
            yce.RunnableC18377a runnableC18377a2 = (yce.RunnableC18377a) it2.next();
            if (sq8.m48644c(runnableC18377a2.m57604f(), str)) {
                return runnableC18377a2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m23825e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f20533c;
            y3i y3iVar = y3i.f54824a;
        }
        if (m23828h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: f */
    public final void m23826f(yce.RunnableC18377a runnableC18377a) {
        sq8.m48649h(runnableC18377a, "call");
        runnableC18377a.m57603e().decrementAndGet();
        m23825e(this.f20536f, runnableC18377a);
    }

    /* renamed from: g */
    public final void m23827g(yce yceVar) {
        sq8.m48649h(yceVar, "call");
        m23825e(this.f20537g, yceVar);
    }

    /* renamed from: h */
    public final boolean m23828h() {
        int i;
        boolean z;
        if (jgj.f30421e && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f20535e.iterator();
            sq8.m48648g(it, "iterator(...)");
            while (it.hasNext()) {
                yce.RunnableC18377a runnableC18377a = (yce.RunnableC18377a) it.next();
                if (this.f20536f.size() >= this.f20531a) {
                    break;
                }
                if (runnableC18377a.m57603e().get() < this.f20532b) {
                    it.remove();
                    runnableC18377a.m57603e().incrementAndGet();
                    sq8.m48646e(runnableC18377a);
                    arrayList.add(runnableC18377a);
                    this.f20536f.add(runnableC18377a);
                }
            }
            i = 0;
            z = m23830j() > 0;
            y3i y3iVar = y3i.f54824a;
        }
        if (m23823c().isShutdown()) {
            int size = arrayList.size();
            while (i < size) {
                yce.RunnableC18377a runnableC18377a2 = (yce.RunnableC18377a) arrayList.get(i);
                runnableC18377a2.m57603e().decrementAndGet();
                synchronized (this) {
                    this.f20536f.remove(runnableC18377a2);
                }
                yce.RunnableC18377a.m57599c(runnableC18377a2, null, 1, null);
                i++;
            }
            Runnable runnable = this.f20533c;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            int size2 = arrayList.size();
            while (i < size2) {
                ((yce.RunnableC18377a) arrayList.get(i)).m57600a(m23823c());
                i++;
            }
        }
        return z;
    }

    /* renamed from: i */
    public final synchronized int m23829i() {
        return this.f20535e.size();
    }

    /* renamed from: j */
    public final synchronized int m23830j() {
        return this.f20536f.size() + this.f20537g.size();
    }

    /* renamed from: k */
    public final void m23831k(int i) {
        if (!(i >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i).toString());
        }
        synchronized (this) {
            this.f20531a = i;
            y3i y3iVar = y3i.f54824a;
        }
        m23828h();
    }

    /* renamed from: l */
    public final void m23832l(int i) {
        if (!(i >= 1)) {
            throw new IllegalArgumentException(("max < 1: " + i).toString());
        }
        synchronized (this) {
            this.f20532b = i;
            y3i y3iVar = y3i.f54824a;
        }
        m23828h();
    }
}
