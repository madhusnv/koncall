package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class iu3 extends AtomicReference implements luf, su5 {

    /* renamed from: a */
    public final gu3 f29231a;

    /* renamed from: b */
    public final gu3 f29232b;

    public iu3(gu3 gu3Var, gu3 gu3Var2) {
        this.f29231a = gu3Var;
        this.f29232b = gu3Var2;
    }

    @Override // p001o.luf
    /* renamed from: a */
    public void mo17881a(su5 su5Var) {
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

    @Override // p001o.luf
    public void onError(Throwable th) {
        lazySet(zu5.DISPOSED);
        try {
            this.f29232b.accept(th);
        } catch (Throwable th2) {
            zk6.m59526b(th2);
            fwe.m27599r(new mo3(th, th2));
        }
    }

    @Override // p001o.luf
    public void onSuccess(Object obj) {
        lazySet(zu5.DISPOSED);
        try {
            this.f29231a.accept(obj);
        } catch (Throwable th) {
            zk6.m59526b(th);
            fwe.m27599r(th);
        }
    }
}
