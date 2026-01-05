package p001o;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes6.dex */
public abstract class nj1 extends CountDownLatch implements h67 {

    /* renamed from: a */
    public Object f36900a;

    /* renamed from: b */
    public Throwable f36901b;

    /* renamed from: c */
    public rag f36902c;

    /* renamed from: d */
    public volatile boolean f36903d;

    public nj1() {
        super(1);
    }

    /* renamed from: a */
    public final Object m40673a() throws InterruptedException {
        if (getCount() != 0) {
            try {
                tj1.m49950a();
                await();
            } catch (InterruptedException e) {
                rag ragVar = this.f36902c;
                this.f36902c = wag.CANCELLED;
                if (ragVar != null) {
                    ragVar.cancel();
                }
                throw xk6.m56420h(e);
            }
        }
        Throwable th = this.f36901b;
        if (th == null) {
            return this.f36900a;
        }
        throw xk6.m56420h(th);
    }

    @Override // p001o.h67, p001o.qag
    /* renamed from: b */
    public final void mo18165b(rag ragVar) {
        if (wag.validate(this.f36902c, ragVar)) {
            this.f36902c = ragVar;
            if (this.f36903d) {
                return;
            }
            ragVar.request(Long.MAX_VALUE);
            if (this.f36903d) {
                this.f36902c = wag.CANCELLED;
                ragVar.cancel();
            }
        }
    }

    @Override // p001o.qag
    public final void onComplete() {
        countDown();
    }
}
