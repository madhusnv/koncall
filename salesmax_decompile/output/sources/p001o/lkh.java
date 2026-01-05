package p001o;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class lkh {

    /* renamed from: a */
    public String f33967a = null;

    /* renamed from: b */
    public Boolean f33968b = null;

    /* renamed from: c */
    public Integer f33969c = null;

    /* renamed from: d */
    public Thread.UncaughtExceptionHandler f33970d = null;

    /* renamed from: e */
    public ThreadFactory f33971e = null;

    /* renamed from: o.lkh$a */
    public class ThreadFactoryC15097a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ ThreadFactory f33972a;

        /* renamed from: b */
        public final /* synthetic */ String f33973b;

        /* renamed from: c */
        public final /* synthetic */ AtomicLong f33974c;

        /* renamed from: d */
        public final /* synthetic */ Boolean f33975d;

        /* renamed from: e */
        public final /* synthetic */ Integer f33976e;

        /* renamed from: f */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f33977f;

        public ThreadFactoryC15097a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f33972a = threadFactory;
            this.f33973b = str;
            this.f33974c = atomicLong;
            this.f33975d = bool;
            this.f33976e = num;
            this.f33977f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f33972a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f33973b;
            if (str != null) {
                AtomicLong atomicLong = this.f33974c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(lkh.m37393d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f33975d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f33976e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f33977f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    /* renamed from: c */
    public static ThreadFactory m37392c(lkh lkhVar) {
        String str = lkhVar.f33967a;
        Boolean bool = lkhVar.f33968b;
        Integer num = lkhVar.f33969c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = lkhVar.f33970d;
        ThreadFactory threadFactoryDefaultThreadFactory = lkhVar.f33971e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new ThreadFactoryC15097a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* renamed from: d */
    public static String m37393d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* renamed from: b */
    public ThreadFactory m37394b() {
        return m37392c(this);
    }

    /* renamed from: e */
    public lkh m37395e(boolean z) {
        this.f33968b = Boolean.valueOf(z);
        return this;
    }
}
