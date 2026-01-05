package mz;

import bk.RunnableC0683n;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4297c;
import kz.AbstractC4299e;
import kz.ThreadFactoryC4298d;
import l4.d0;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mz.d */
/* loaded from: classes3.dex */
public final class C4920d {

    /* renamed from: k */
    public static final Logger f24471k;

    /* renamed from: l */
    public static final C4920d f24472l;

    /* renamed from: a */
    public final d0 f24473a;

    /* renamed from: b */
    public final Logger f24474b;

    /* renamed from: c */
    public int f24475c;

    /* renamed from: d */
    public boolean f24476d;

    /* renamed from: e */
    public long f24477e;

    /* renamed from: f */
    public int f24478f;

    /* renamed from: g */
    public int f24479g;

    /* renamed from: h */
    public final ArrayList f24480h;

    /* renamed from: i */
    public final ArrayList f24481i;

    /* renamed from: j */
    public final RunnableC0683n f24482j;

    static {
        Logger logger = Logger.getLogger(C4920d.class.getName());
        AbstractC4154l.m8922e(logger, "getLogger(...)");
        f24471k = logger;
        String name = AbstractC4299e.f21708b + " TaskRunner";
        AbstractC4154l.m8923f(name, "name");
        f24472l = new C4920d(new d0(new ThreadFactoryC4298d(name, true)));
    }

    public C4920d(d0 d0Var) {
        Logger logger = f24471k;
        AbstractC4154l.m8923f(logger, "logger");
        this.f24473a = d0Var;
        this.f24474b = logger;
        this.f24475c = 10000;
        this.f24480h = new ArrayList();
        this.f24481i = new ArrayList();
        this.f24482j = new RunnableC0683n(7, this);
    }

    /* renamed from: a */
    public static final void m9821a(C4920d c4920d, AbstractC4917a abstractC4917a, long j6, boolean z6) {
        TimeZone timeZone = AbstractC4299e.f21707a;
        C4919c c4919c = abstractC4917a.f24461c;
        AbstractC4154l.m8920c(c4919c);
        if (c4919c.f24468d != abstractC4917a) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z10 = c4919c.f24470f;
        c4919c.f24470f = false;
        c4919c.f24468d = null;
        c4920d.f24480h.remove(c4919c);
        if (j6 != -1 && !z10 && !c4919c.f24467c) {
            c4919c.m9819e(abstractC4917a, j6, true);
        }
        if (c4919c.f24469e.isEmpty()) {
            return;
        }
        c4920d.f24481i.add(c4919c);
        if (z6) {
            return;
        }
        c4920d.m9825e();
    }

    /* renamed from: b */
    public final AbstractC4917a m9822b() {
        long j6;
        AbstractC4917a abstractC4917a;
        boolean z6;
        TimeZone timeZone = AbstractC4299e.f21707a;
        while (true) {
            ArrayList arrayList = this.f24481i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i10 = 0;
            AbstractC4917a abstractC4917a2 = null;
            while (true) {
                if (i10 >= size) {
                    j6 = jNanoTime;
                    abstractC4917a = null;
                    z6 = false;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                AbstractC4917a abstractC4917a3 = (AbstractC4917a) ((C4919c) obj).f24469e.get(0);
                j6 = jNanoTime;
                abstractC4917a = null;
                long jMax = Math.max(0L, abstractC4917a3.f24462d - j6);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (abstractC4917a2 != null) {
                        z6 = true;
                        break;
                    }
                    abstractC4917a2 = abstractC4917a3;
                }
                jNanoTime = j6;
            }
            ArrayList arrayList2 = this.f24480h;
            if (abstractC4917a2 != null) {
                TimeZone timeZone2 = AbstractC4299e.f21707a;
                abstractC4917a2.f24462d = -1L;
                C4919c c4919c = abstractC4917a2.f24461c;
                AbstractC4154l.m8920c(c4919c);
                c4919c.f24469e.remove(abstractC4917a2);
                arrayList.remove(c4919c);
                c4919c.f24468d = abstractC4917a2;
                arrayList2.add(c4919c);
                if (z6 || (!this.f24476d && !arrayList.isEmpty())) {
                    m9825e();
                }
                return abstractC4917a2;
            }
            if (this.f24476d) {
                if (jMin >= this.f24477e - j6) {
                    return abstractC4917a;
                }
                notify();
                return abstractC4917a;
            }
            this.f24476d = true;
            this.f24477e = j6 + jMin;
            try {
                try {
                    TimeZone timeZone3 = AbstractC4299e.f21707a;
                    if (jMin > 0) {
                        long j10 = jMin / 1000000;
                        long j11 = jMin - (1000000 * j10);
                        if (j10 > 0 || jMin > 0) {
                            wait(j10, (int) j11);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = AbstractC4299e.f21707a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((C4919c) arrayList2.get(size2)).m9817b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        C4919c c4919c2 = (C4919c) arrayList.get(size3);
                        c4919c2.m9817b();
                        if (c4919c2.f24469e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.f24476d = false;
            }
        }
    }

    /* renamed from: c */
    public final void m9823c(C4919c taskQueue) {
        AbstractC4154l.m8923f(taskQueue, "taskQueue");
        TimeZone timeZone = AbstractC4299e.f21707a;
        if (taskQueue.f24468d == null) {
            boolean zIsEmpty = taskQueue.f24469e.isEmpty();
            ArrayList arrayList = this.f24481i;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = AbstractC4297c.f21703a;
                AbstractC4154l.m8923f(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f24476d) {
            notify();
        } else {
            m9825e();
        }
    }

    /* renamed from: d */
    public final C4919c m9824d() {
        int i10;
        synchronized (this) {
            i10 = this.f24475c;
            this.f24475c = i10 + 1;
        }
        return new C4919c(this, AbstractC4801l.m9730d(i10, "Q"));
    }

    /* renamed from: e */
    public final void m9825e() {
        TimeZone timeZone = AbstractC4299e.f21707a;
        int i10 = this.f24478f;
        if (i10 > this.f24479g) {
            return;
        }
        this.f24478f = i10 + 1;
        RunnableC0683n runnable = this.f24482j;
        AbstractC4154l.m8923f(runnable, "runnable");
        ((ThreadPoolExecutor) this.f24473a.f21881b).execute(runnable);
    }
}
