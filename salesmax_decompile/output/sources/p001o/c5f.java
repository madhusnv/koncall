package p001o;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public abstract class c5f {

    /* renamed from: a */
    public static final long f17377a = m20300a(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue(), System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes"));

    /* renamed from: o.c5f$a */
    public static final class RunnableC12569a implements su5, Runnable {

        /* renamed from: a */
        public final Runnable f17378a;

        /* renamed from: b */
        public final AbstractC12571c f17379b;

        /* renamed from: c */
        public Thread f17380c;

        public RunnableC12569a(Runnable runnable, AbstractC12571c abstractC12571c) {
            this.f17378a = runnable;
            this.f17379b = abstractC12571c;
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f17380c == Thread.currentThread()) {
                AbstractC12571c abstractC12571c = this.f17379b;
                if (abstractC12571c instanceof tyb) {
                    ((tyb) abstractC12571c).m50785k();
                    return;
                }
            }
            this.f17379b.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f17379b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17380c = Thread.currentThread();
            try {
                this.f17378a.run();
            } finally {
            }
        }
    }

    /* renamed from: o.c5f$b */
    public static final class RunnableC12570b implements su5, Runnable {

        /* renamed from: a */
        public final Runnable f17381a;

        /* renamed from: b */
        public final AbstractC12571c f17382b;

        /* renamed from: c */
        public volatile boolean f17383c;

        public RunnableC12570b(Runnable runnable, AbstractC12571c abstractC12571c) {
            this.f17381a = runnable;
            this.f17382b = abstractC12571c;
        }

        @Override // p001o.su5
        public void dispose() {
            this.f17383c = true;
            this.f17382b.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f17383c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17383c) {
                return;
            }
            try {
                this.f17381a.run();
            } catch (Throwable th) {
                dispose();
                fwe.m27599r(th);
                throw th;
            }
        }
    }

    /* renamed from: o.c5f$c */
    public static abstract class AbstractC12571c implements su5 {

        /* renamed from: o.c5f$c$a */
        public final class a implements Runnable {

            /* renamed from: a */
            public final Runnable f17384a;

            /* renamed from: b */
            public final ref f17385b;

            /* renamed from: c */
            public final long f17386c;

            /* renamed from: d */
            public long f17387d;

            /* renamed from: e */
            public long f17388e;

            /* renamed from: f */
            public long f17389f;

            public a(long j, Runnable runnable, long j2, ref refVar, long j3) {
                this.f17384a = runnable;
                this.f17385b = refVar;
                this.f17386c = j3;
                this.f17388e = j2;
                this.f17389f = j;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                long j;
                this.f17384a.run();
                if (this.f17385b.isDisposed()) {
                    return;
                }
                AbstractC12571c abstractC12571c = AbstractC12571c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jM20306a = abstractC12571c.m20306a(timeUnit);
                long j2 = c5f.f17377a;
                long j3 = jM20306a + j2;
                long j4 = this.f17388e;
                if (j3 >= j4) {
                    long j5 = this.f17386c;
                    if (jM20306a >= j4 + j5 + j2) {
                        long j6 = this.f17386c;
                        long j7 = jM20306a + j6;
                        long j8 = this.f17387d + 1;
                        this.f17387d = j8;
                        this.f17389f = j7 - (j6 * j8);
                        j = j7;
                    } else {
                        long j9 = this.f17389f;
                        long j10 = this.f17387d + 1;
                        this.f17387d = j10;
                        j = j9 + (j10 * j5);
                    }
                }
                this.f17388e = jM20306a;
                this.f17385b.m46621a(AbstractC12571c.this.mo20308d(this, j - jM20306a, timeUnit));
            }
        }

        /* renamed from: a */
        public long m20306a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: b */
        public su5 mo20307b(Runnable runnable) {
            return mo20308d(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        /* renamed from: d */
        public abstract su5 mo20308d(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: e */
        public su5 m20309e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            ref refVar = new ref();
            ref refVar2 = new ref(refVar);
            Runnable runnableM27602u = fwe.m27602u(runnable);
            long nanos = timeUnit.toNanos(j2);
            long jM20306a = m20306a(TimeUnit.NANOSECONDS);
            su5 su5VarMo20308d = mo20308d(new a(jM20306a + timeUnit.toNanos(j), runnableM27602u, jM20306a, refVar2, nanos), j, timeUnit);
            if (su5VarMo20308d == h66.INSTANCE) {
                return su5VarMo20308d;
            }
            refVar.m46621a(su5VarMo20308d);
            return refVar2;
        }
    }

    /* renamed from: a */
    public static long m20300a(long j, String str) {
        return "seconds".equalsIgnoreCase(str) ? TimeUnit.SECONDS.toNanos(j) : "milliseconds".equalsIgnoreCase(str) ? TimeUnit.MILLISECONDS.toNanos(j) : TimeUnit.MINUTES.toNanos(j);
    }

    /* renamed from: b */
    public abstract AbstractC12571c mo20301b();

    /* renamed from: c */
    public su5 mo20302c(Runnable runnable) {
        return mo20303d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    /* renamed from: d */
    public su5 mo20303d(Runnable runnable, long j, TimeUnit timeUnit) {
        AbstractC12571c abstractC12571cMo20301b = mo20301b();
        RunnableC12569a runnableC12569a = new RunnableC12569a(fwe.m27602u(runnable), abstractC12571cMo20301b);
        abstractC12571cMo20301b.mo20308d(runnableC12569a, j, timeUnit);
        return runnableC12569a;
    }

    /* renamed from: e */
    public su5 mo20304e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        AbstractC12571c abstractC12571cMo20301b = mo20301b();
        RunnableC12570b runnableC12570b = new RunnableC12570b(fwe.m27602u(runnable), abstractC12571cMo20301b);
        su5 su5VarM20309e = abstractC12571cMo20301b.m20309e(runnableC12570b, j, j2, timeUnit);
        return su5VarM20309e == h66.INSTANCE ? su5VarM20309e : runnableC12570b;
    }

    /* renamed from: f */
    public void mo20305f() {
    }
}
