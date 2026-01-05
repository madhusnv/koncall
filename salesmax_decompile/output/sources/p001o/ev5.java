package p001o;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class ev5 implements Future {

    /* renamed from: a */
    public final su5 f22215a;

    public ev5(su5 su5Var) {
        this.f22215a = su5Var;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f22215a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
