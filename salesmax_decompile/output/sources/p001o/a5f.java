package p001o;

import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class a5f extends l7 implements Callable {
    public a5f(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f33336b = Thread.currentThread();
        try {
            try {
                this.f33335a.run();
                return null;
            } finally {
                lazySet(l7.f33333c);
                this.f33336b = null;
            }
        } catch (Throwable th) {
            fwe.m27599r(th);
            throw th;
        }
    }
}
