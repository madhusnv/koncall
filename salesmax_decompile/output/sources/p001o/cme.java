package p001o;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public abstract class cme {

    /* renamed from: o.cme$a */
    public static class ThreadFactoryC12711a implements ThreadFactory {

        /* renamed from: a */
        public String f18348a;

        /* renamed from: b */
        public int f18349b;

        /* renamed from: o.cme$a$a */
        public static class a extends Thread {

            /* renamed from: a */
            public final int f18350a;

            public a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f18350a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f18350a);
                super.run();
            }
        }

        public ThreadFactoryC12711a(String str, int i) {
            this.f18348a = str;
            this.f18349b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable, this.f18348a, this.f18349b);
        }
    }

    /* renamed from: o.cme$b */
    public static class RunnableC12712b implements Runnable {

        /* renamed from: a */
        public Callable f18351a;

        /* renamed from: b */
        public hu3 f18352b;

        /* renamed from: c */
        public Handler f18353c;

        /* renamed from: o.cme$b$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ hu3 f18354a;

            /* renamed from: b */
            public final /* synthetic */ Object f18355b;

            public a(hu3 hu3Var, Object obj) {
                this.f18354a = hu3Var;
                this.f18355b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18354a.accept(this.f18355b);
            }
        }

        public RunnableC12712b(Handler handler, Callable callable, hu3 hu3Var) {
            this.f18351a = callable;
            this.f18352b = hu3Var;
            this.f18353c = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f18351a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f18353c.post(new a(this.f18352b, objCall));
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m21432a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC12711a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static void m21433b(Executor executor, Callable callable, hu3 hu3Var) {
        executor.execute(new RunnableC12712b(i32.m31406a(), callable, hu3Var));
    }

    /* renamed from: c */
    public static Object m21434c(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
