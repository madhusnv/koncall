package p001o;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class tw7 extends c5f {

    /* renamed from: b */
    public final Handler f47977b;

    /* renamed from: c */
    public final boolean f47978c;

    /* renamed from: o.tw7$a */
    public static final class C17242a extends c5f.AbstractC12571c {

        /* renamed from: a */
        public final Handler f47979a;

        /* renamed from: b */
        public final boolean f47980b;

        /* renamed from: c */
        public volatile boolean f47981c;

        public C17242a(Handler handler, boolean z) {
            this.f47979a = handler;
            this.f47980b = z;
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: d */
        public su5 mo20308d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f47981c) {
                return su5.m48920j();
            }
            RunnableC17243b runnableC17243b = new RunnableC17243b(this.f47979a, fwe.m27602u(runnable));
            Message messageObtain = Message.obtain(this.f47979a, runnableC17243b);
            messageObtain.obj = this;
            if (this.f47980b) {
                messageObtain.setAsynchronous(true);
            }
            this.f47979a.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.f47981c) {
                return runnableC17243b;
            }
            this.f47979a.removeCallbacks(runnableC17243b);
            return su5.m48920j();
        }

        @Override // p001o.su5
        public void dispose() {
            this.f47981c = true;
            this.f47979a.removeCallbacksAndMessages(this);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f47981c;
        }
    }

    /* renamed from: o.tw7$b */
    public static final class RunnableC17243b implements Runnable, su5 {

        /* renamed from: a */
        public final Handler f47982a;

        /* renamed from: b */
        public final Runnable f47983b;

        /* renamed from: c */
        public volatile boolean f47984c;

        public RunnableC17243b(Handler handler, Runnable runnable) {
            this.f47982a = handler;
            this.f47983b = runnable;
        }

        @Override // p001o.su5
        public void dispose() {
            this.f47982a.removeCallbacks(this);
            this.f47984c = true;
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f47984c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f47983b.run();
            } catch (Throwable th) {
                fwe.m27599r(th);
            }
        }
    }

    public tw7(Handler handler, boolean z) {
        this.f47977b = handler;
        this.f47978c = z;
    }

    @Override // p001o.c5f
    /* renamed from: b */
    public c5f.AbstractC12571c mo20301b() {
        return new C17242a(this.f47977b, this.f47978c);
    }

    @Override // p001o.c5f
    /* renamed from: d */
    public su5 mo20303d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC17243b runnableC17243b = new RunnableC17243b(this.f47977b, fwe.m27602u(runnable));
        Message messageObtain = Message.obtain(this.f47977b, runnableC17243b);
        if (this.f47978c) {
            messageObtain.setAsynchronous(true);
        }
        this.f47977b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
        return runnableC17243b;
    }
}
