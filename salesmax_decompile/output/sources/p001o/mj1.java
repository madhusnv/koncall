package p001o;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
public abstract class mj1 extends CountDownLatch implements m9c, su5 {

    /* renamed from: a */
    public Object f35535a;

    /* renamed from: b */
    public Throwable f35536b;

    /* renamed from: c */
    public su5 f35537c;

    /* renamed from: d */
    public volatile boolean f35538d;

    public mj1() {
        super(1);
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public final void mo16559a(su5 su5Var) {
        this.f35537c = su5Var;
        if (this.f35538d) {
            su5Var.dispose();
        }
    }

    /* renamed from: b */
    public final Object m39177b() throws InterruptedException {
        if (getCount() != 0) {
            try {
                tj1.m49950a();
                await();
            } catch (InterruptedException e) {
                dispose();
                throw xk6.m56420h(e);
            }
        }
        Throwable th = this.f35536b;
        if (th == null) {
            return this.f35535a;
        }
        throw xk6.m56420h(th);
    }

    @Override // p001o.su5
    public final void dispose() {
        this.f35538d = true;
        su5 su5Var = this.f35537c;
        if (su5Var != null) {
            su5Var.dispose();
        }
    }

    @Override // p001o.su5
    public final boolean isDisposed() {
        return this.f35538d;
    }

    @Override // p001o.m9c
    public final void onComplete() {
        countDown();
    }
}
