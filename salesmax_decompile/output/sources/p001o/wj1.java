package p001o;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class wj1 extends AtomicReference implements m9c, su5 {

    /* renamed from: b */
    public static final Object f52221b = new Object();

    /* renamed from: a */
    public final Queue f52222a;

    public wj1(Queue queue) {
        this.f52222a = queue;
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        zu5.setOnce(this, su5Var);
    }

    @Override // p001o.su5
    public void dispose() {
        if (zu5.dispose(this)) {
            this.f52222a.offer(f52221b);
        }
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        this.f52222a.offer(d3c.next(obj));
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return get() == zu5.DISPOSED;
    }

    @Override // p001o.m9c
    public void onComplete() {
        this.f52222a.offer(d3c.complete());
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        this.f52222a.offer(d3c.error(th));
    }
}
