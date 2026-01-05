package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.g32;

/* loaded from: classes2.dex */
public class qea implements zfa {

    /* renamed from: a */
    public List f41780a;

    /* renamed from: b */
    public List f41781b;

    /* renamed from: c */
    public final boolean f41782c;

    /* renamed from: d */
    public final AtomicInteger f41783d;

    /* renamed from: e */
    public final zfa f41784e = g32.m28002a(new C16362a());

    /* renamed from: f */
    public g32.C13614a f41785f;

    /* renamed from: o.qea$a */
    public class C16362a implements g32.InterfaceC13616c {
        public C16362a() {
        }

        @Override // p001o.g32.InterfaceC13616c
        public Object attachCompleter(g32.C13614a c13614a) {
            fgd.m26666j(qea.this.f41785f == null, "The result can only set once!");
            qea.this.f41785f = c13614a;
            return "ListFuture[" + this + "]";
        }
    }

    /* renamed from: o.qea$b */
    public class RunnableC16363b implements Runnable {
        public RunnableC16363b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qea qeaVar = qea.this;
            qeaVar.f41781b = null;
            qeaVar.f41780a = null;
        }
    }

    /* renamed from: o.qea$c */
    public class RunnableC16364c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f41788a;

        /* renamed from: b */
        public final /* synthetic */ zfa f41789b;

        public RunnableC16364c(int i, zfa zfaVar) {
            this.f41788a = i;
            this.f41789b = zfaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            qea.this.m45278e(this.f41788a, this.f41789b);
        }
    }

    public qea(List list, boolean z, Executor executor) {
        this.f41780a = (List) fgd.m26663g(list);
        this.f41781b = new ArrayList(list.size());
        this.f41782c = z;
        this.f41783d = new AtomicInteger(list.size());
        m45277d(executor);
    }

    /* renamed from: a */
    public final void m45274a() throws InterruptedException {
        List<zfa> list = this.f41780a;
        if (list == null || isDone()) {
            return;
        }
        for (zfa zfaVar : list) {
            while (!zfaVar.isDone()) {
                try {
                    zfaVar.get();
                } catch (Error e) {
                    throw e;
                } catch (InterruptedException e2) {
                    throw e2;
                } catch (Throwable unused) {
                    if (this.f41782c) {
                        return;
                    }
                }
            }
        }
    }

    @Override // p001o.zfa
    public void addListener(Runnable runnable, Executor executor) {
        this.f41784e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List get() throws InterruptedException {
        m45274a();
        return (List) this.f41784e.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List get(long j, TimeUnit timeUnit) {
        return (List) this.f41784e.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List list = this.f41780a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((zfa) it.next()).cancel(z);
            }
        }
        return this.f41784e.cancel(z);
    }

    /* renamed from: d */
    public final void m45277d(Executor executor) {
        addListener(new RunnableC16363b(), gb2.m28293a());
        if (this.f41780a.isEmpty()) {
            this.f41785f.m28005c(new ArrayList(this.f41781b));
            return;
        }
        for (int i = 0; i < this.f41780a.size(); i++) {
            this.f41781b.add(null);
        }
        List list = this.f41780a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zfa zfaVar = (zfa) list.get(i2);
            zfaVar.addListener(new RunnableC16364c(i2, zfaVar), executor);
        }
    }

    /* renamed from: e */
    public void m45278e(int i, Future future) {
        g32.C13614a c13614a;
        ArrayList arrayList;
        int iDecrementAndGet;
        List list = this.f41781b;
        if (isDone() || list == null) {
            fgd.m26666j(this.f41782c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        fgd.m26666j(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i, bn7.m19427m(future));
                        iDecrementAndGet = this.f41783d.decrementAndGet();
                        fgd.m26666j(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                    } catch (ExecutionException e) {
                        if (this.f41782c) {
                            this.f41785f.m28008f(e.getCause());
                        }
                        int iDecrementAndGet2 = this.f41783d.decrementAndGet();
                        fgd.m26666j(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet2 != 0) {
                            return;
                        }
                        List list2 = this.f41781b;
                        if (list2 != null) {
                            c13614a = this.f41785f;
                            arrayList = new ArrayList(list2);
                        }
                    }
                } catch (RuntimeException e2) {
                    if (this.f41782c) {
                        this.f41785f.m28008f(e2);
                    }
                    int iDecrementAndGet3 = this.f41783d.decrementAndGet();
                    fgd.m26666j(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet3 != 0) {
                        return;
                    }
                    List list3 = this.f41781b;
                    if (list3 != null) {
                        c13614a = this.f41785f;
                        arrayList = new ArrayList(list3);
                    }
                }
            } catch (Error e3) {
                this.f41785f.m28008f(e3);
                int iDecrementAndGet4 = this.f41783d.decrementAndGet();
                fgd.m26666j(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet4 != 0) {
                    return;
                }
                List list4 = this.f41781b;
                if (list4 != null) {
                    c13614a = this.f41785f;
                    arrayList = new ArrayList(list4);
                }
            } catch (CancellationException unused) {
                if (this.f41782c) {
                    cancel(false);
                }
                int iDecrementAndGet5 = this.f41783d.decrementAndGet();
                fgd.m26666j(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet5 != 0) {
                    return;
                }
                List list5 = this.f41781b;
                if (list5 != null) {
                    c13614a = this.f41785f;
                    arrayList = new ArrayList(list5);
                }
            }
            if (iDecrementAndGet == 0) {
                List list6 = this.f41781b;
                if (list6 != null) {
                    c13614a = this.f41785f;
                    arrayList = new ArrayList(list6);
                    c13614a.m28005c(arrayList);
                    return;
                }
                fgd.m26665i(isDone());
            }
        } catch (Throwable th) {
            int iDecrementAndGet6 = this.f41783d.decrementAndGet();
            fgd.m26666j(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (iDecrementAndGet6 == 0) {
                List list7 = this.f41781b;
                if (list7 != null) {
                    this.f41785f.m28005c(new ArrayList(list7));
                } else {
                    fgd.m26665i(isDone());
                }
            }
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f41784e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f41784e.isDone();
    }
}
