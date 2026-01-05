package p001o;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class vj1 extends CountDownLatch implements luf, ml3, q0b {

    /* renamed from: a */
    public Object f50429a;

    /* renamed from: b */
    public Throwable f50430b;

    /* renamed from: c */
    public su5 f50431c;

    /* renamed from: d */
    public volatile boolean f50432d;

    public vj1() {
        super(1);
    }

    @Override // p001o.luf
    /* renamed from: a */
    public void mo17881a(su5 su5Var) {
        this.f50431c = su5Var;
        if (this.f50432d) {
            su5Var.dispose();
        }
    }

    /* renamed from: b */
    public boolean m52871b(long j, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                tj1.m49950a();
                if (!await(j, timeUnit)) {
                    m52873d();
                    return false;
                }
            } catch (InterruptedException e) {
                m52873d();
                throw xk6.m56420h(e);
            }
        }
        Throwable th = this.f50430b;
        if (th == null) {
            return true;
        }
        throw xk6.m56420h(th);
    }

    /* renamed from: c */
    public Object m52872c() throws InterruptedException {
        if (getCount() != 0) {
            try {
                tj1.m49950a();
                await();
            } catch (InterruptedException e) {
                m52873d();
                throw xk6.m56420h(e);
            }
        }
        Throwable th = this.f50430b;
        if (th == null) {
            return this.f50429a;
        }
        throw xk6.m56420h(th);
    }

    /* renamed from: d */
    public void m52873d() {
        this.f50432d = true;
        su5 su5Var = this.f50431c;
        if (su5Var != null) {
            su5Var.dispose();
        }
    }

    @Override // p001o.ml3
    public void onComplete() {
        countDown();
    }

    @Override // p001o.luf
    public void onError(Throwable th) {
        this.f50430b = th;
        countDown();
    }

    @Override // p001o.luf
    public void onSuccess(Object obj) {
        this.f50429a = obj;
        countDown();
    }
}
