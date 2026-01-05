package p001o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001o.v6c;

/* loaded from: classes2.dex */
public abstract class e5g implements v6c {

    /* renamed from: b */
    public final AtomicReference f20995b;

    /* renamed from: a */
    public final Object f20994a = new Object();

    /* renamed from: c */
    public int f20996c = 0;

    /* renamed from: d */
    public boolean f20997d = false;

    /* renamed from: e */
    public final Map f20998e = new HashMap();

    /* renamed from: f */
    public final CopyOnWriteArraySet f20999f = new CopyOnWriteArraySet();

    /* renamed from: o.e5g$a */
    public static abstract class AbstractC13105a {
        /* renamed from: b */
        public static AbstractC13105a m24344b(Throwable th) {
            return new m51(th);
        }

        /* renamed from: a */
        public abstract Throwable mo24345a();
    }

    /* renamed from: o.e5g$b */
    public static final class RunnableC13106b implements Runnable {

        /* renamed from: h */
        public static final Object f21000h = new Object();

        /* renamed from: a */
        public final Executor f21001a;

        /* renamed from: b */
        public final v6c.InterfaceC17516a f21002b;

        /* renamed from: d */
        public final AtomicReference f21004d;

        /* renamed from: c */
        public final AtomicBoolean f21003c = new AtomicBoolean(true);

        /* renamed from: e */
        public Object f21005e = f21000h;

        /* renamed from: f */
        public int f21006f = -1;

        /* renamed from: g */
        public boolean f21007g = false;

        public RunnableC13106b(AtomicReference atomicReference, Executor executor, v6c.InterfaceC17516a interfaceC17516a) {
            this.f21004d = atomicReference;
            this.f21001a = executor;
            this.f21002b = interfaceC17516a;
        }

        /* renamed from: a */
        public void m24346a() {
            this.f21003c.set(false);
        }

        /* renamed from: b */
        public void m24347b(int i) {
            synchronized (this) {
                if (!this.f21003c.get()) {
                    return;
                }
                if (i <= this.f21006f) {
                    return;
                }
                this.f21006f = i;
                if (this.f21007g) {
                    return;
                }
                this.f21007g = true;
                try {
                    this.f21001a.execute(this);
                } finally {
                    synchronized (this) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (!this.f21003c.get()) {
                    this.f21007g = false;
                    return;
                }
                Object obj = this.f21004d.get();
                int i = this.f21006f;
                while (true) {
                    if (!Objects.equals(this.f21005e, obj)) {
                        this.f21005e = obj;
                        if (obj instanceof AbstractC13105a) {
                            this.f21002b.onError(((AbstractC13105a) obj).mo24345a());
                        } else {
                            this.f21002b.mo4754a(obj);
                        }
                    }
                    synchronized (this) {
                        if (i == this.f21006f || !this.f21003c.get()) {
                            break;
                        }
                        obj = this.f21004d.get();
                        i = this.f21006f;
                    }
                }
                this.f21007g = false;
            }
        }
    }

    public e5g(Object obj, boolean z) {
        if (!z) {
            this.f20995b = new AtomicReference(obj);
        } else {
            fgd.m26658b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f20995b = new AtomicReference(AbstractC13105a.m24344b((Throwable) obj));
        }
    }

    @Override // p001o.v6c
    /* renamed from: a */
    public void mo24338a(Executor executor, v6c.InterfaceC17516a interfaceC17516a) {
        RunnableC13106b runnableC13106b;
        synchronized (this.f20994a) {
            m24341d(interfaceC17516a);
            runnableC13106b = new RunnableC13106b(this.f20995b, executor, interfaceC17516a);
            this.f20998e.put(interfaceC17516a, runnableC13106b);
            this.f20999f.add(runnableC13106b);
        }
        runnableC13106b.m24347b(0);
    }

    @Override // p001o.v6c
    /* renamed from: b */
    public void mo24339b(v6c.InterfaceC17516a interfaceC17516a) {
        synchronized (this.f20994a) {
            m24341d(interfaceC17516a);
        }
    }

    /* renamed from: c */
    public zfa m24340c() {
        Object obj = this.f20995b.get();
        return obj instanceof AbstractC13105a ? bn7.m19428n(((AbstractC13105a) obj).mo24345a()) : bn7.m19430p(obj);
    }

    /* renamed from: d */
    public final void m24341d(v6c.InterfaceC17516a interfaceC17516a) {
        RunnableC13106b runnableC13106b = (RunnableC13106b) this.f20998e.remove(interfaceC17516a);
        if (runnableC13106b != null) {
            runnableC13106b.m24346a();
            this.f20999f.remove(runnableC13106b);
        }
    }

    /* renamed from: e */
    public void m24342e(Object obj) {
        m24343f(obj);
    }

    /* renamed from: f */
    public final void m24343f(Object obj) {
        Iterator it;
        int i;
        synchronized (this.f20994a) {
            if (Objects.equals(this.f20995b.getAndSet(obj), obj)) {
                return;
            }
            int i2 = this.f20996c + 1;
            this.f20996c = i2;
            if (this.f20997d) {
                return;
            }
            this.f20997d = true;
            Iterator it2 = this.f20999f.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ((RunnableC13106b) it2.next()).m24347b(i2);
                } else {
                    synchronized (this.f20994a) {
                        if (this.f20996c == i2) {
                            this.f20997d = false;
                            return;
                        } else {
                            it = this.f20999f.iterator();
                            i = this.f20996c;
                        }
                    }
                    it2 = it;
                    i2 = i;
                }
            }
        }
    }
}
