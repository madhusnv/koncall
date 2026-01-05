package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class d66 extends AtomicReference implements ml3, su5 {
    @Override // p001o.ml3
    /* renamed from: a */
    public void mo16368a(su5 su5Var) {
        zu5.setOnce(this, su5Var);
    }

    @Override // p001o.su5
    public void dispose() {
        zu5.dispose(this);
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return get() == zu5.DISPOSED;
    }

    @Override // p001o.ml3
    public void onComplete() {
        lazySet(zu5.DISPOSED);
    }

    @Override // p001o.ml3
    public void onError(Throwable th) {
        lazySet(zu5.DISPOSED);
        fwe.m27599r(new pbc(th));
    }
}
