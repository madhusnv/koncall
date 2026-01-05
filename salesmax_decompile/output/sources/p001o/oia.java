package p001o;

import com.facebook.C10773c;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* loaded from: classes5.dex */
public final class oia {

    /* renamed from: a */
    public Object f38402a;

    /* renamed from: b */
    public CountDownLatch f38403b;

    public oia(final Callable callable) {
        sq8.m48649h(callable, "callable");
        this.f38403b = new CountDownLatch(1);
        C10773c.m13028u().execute(new FutureTask(new Callable() { // from class: o.nia
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oia.m42264b(this.f36879a, callable);
            }
        }));
    }

    /* renamed from: b */
    public static final Void m42264b(oia oiaVar, Callable callable) {
        sq8.m48649h(oiaVar, "this$0");
        sq8.m48649h(callable, "$callable");
        try {
            oiaVar.f38402a = callable.call();
        } finally {
            CountDownLatch countDownLatch = oiaVar.f38403b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    /* renamed from: c */
    public final Object m42265c() throws InterruptedException {
        m42266d();
        return this.f38402a;
    }

    /* renamed from: d */
    public final void m42266d() throws InterruptedException {
        CountDownLatch countDownLatch = this.f38403b;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }
}
