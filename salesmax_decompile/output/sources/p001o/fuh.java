package p001o;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class fuh extends c5f {

    /* renamed from: b */
    public static final fuh f24098b = new fuh();

    /* renamed from: o.fuh$a */
    public static final class RunnableC13559a implements Runnable {

        /* renamed from: a */
        public final Runnable f24099a;

        /* renamed from: b */
        public final C13561c f24100b;

        /* renamed from: c */
        public final long f24101c;

        public RunnableC13559a(Runnable runnable, C13561c c13561c, long j) {
            this.f24099a = runnable;
            this.f24100b = c13561c;
            this.f24101c = j;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            if (this.f24100b.f24109d) {
                return;
            }
            long jM20306a = this.f24100b.m20306a(TimeUnit.MILLISECONDS);
            long j = this.f24101c;
            if (j > jM20306a) {
                try {
                    Thread.sleep(j - jM20306a);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    fwe.m27599r(e);
                    return;
                }
            }
            if (this.f24100b.f24109d) {
                return;
            }
            this.f24099a.run();
        }
    }

    /* renamed from: o.fuh$b */
    public static final class C13560b implements Comparable {

        /* renamed from: a */
        public final Runnable f24102a;

        /* renamed from: b */
        public final long f24103b;

        /* renamed from: c */
        public final int f24104c;

        /* renamed from: d */
        public volatile boolean f24105d;

        public C13560b(Runnable runnable, Long l, int i) {
            this.f24102a = runnable;
            this.f24103b = l.longValue();
            this.f24104c = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C13560b c13560b) {
            int iCompare = Long.compare(this.f24103b, c13560b.f24103b);
            return iCompare == 0 ? Integer.compare(this.f24104c, c13560b.f24104c) : iCompare;
        }
    }

    /* renamed from: o.fuh$c */
    public static final class C13561c extends c5f.AbstractC12571c {

        /* renamed from: a */
        public final PriorityBlockingQueue f24106a = new PriorityBlockingQueue();

        /* renamed from: b */
        public final AtomicInteger f24107b = new AtomicInteger();

        /* renamed from: c */
        public final AtomicInteger f24108c = new AtomicInteger();

        /* renamed from: d */
        public volatile boolean f24109d;

        /* renamed from: o.fuh$c$a */
        public final class a implements Runnable {

            /* renamed from: a */
            public final C13560b f24110a;

            public a(C13560b c13560b) {
                this.f24110a = c13560b;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f24110a.f24105d = true;
                C13561c.this.f24106a.remove(this.f24110a);
            }
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: b */
        public su5 mo20307b(Runnable runnable) {
            return m27527f(runnable, m20306a(TimeUnit.MILLISECONDS));
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: d */
        public su5 mo20308d(Runnable runnable, long j, TimeUnit timeUnit) {
            long jM20306a = m20306a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return m27527f(new RunnableC13559a(runnable, this, jM20306a), jM20306a);
        }

        @Override // p001o.su5
        public void dispose() {
            this.f24109d = true;
        }

        /* renamed from: f */
        public su5 m27527f(Runnable runnable, long j) {
            if (this.f24109d) {
                return h66.INSTANCE;
            }
            C13560b c13560b = new C13560b(runnable, Long.valueOf(j), this.f24108c.incrementAndGet());
            this.f24106a.add(c13560b);
            if (this.f24107b.getAndIncrement() != 0) {
                return su5.m48921m(new a(c13560b));
            }
            int iAddAndGet = 1;
            while (!this.f24109d) {
                C13560b c13560b2 = (C13560b) this.f24106a.poll();
                if (c13560b2 == null) {
                    iAddAndGet = this.f24107b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return h66.INSTANCE;
                    }
                } else if (!c13560b2.f24105d) {
                    c13560b2.f24102a.run();
                }
            }
            this.f24106a.clear();
            return h66.INSTANCE;
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f24109d;
        }
    }

    /* renamed from: g */
    public static fuh m27525g() {
        return f24098b;
    }

    @Override // p001o.c5f
    /* renamed from: b */
    public c5f.AbstractC12571c mo20301b() {
        return new C13561c();
    }

    @Override // p001o.c5f
    /* renamed from: c */
    public su5 mo20302c(Runnable runnable) {
        fwe.m27602u(runnable).run();
        return h66.INSTANCE;
    }

    @Override // p001o.c5f
    /* renamed from: d */
    public su5 mo20303d(Runnable runnable, long j, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j);
            fwe.m27602u(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            fwe.m27599r(e);
        }
        return h66.INSTANCE;
    }
}
