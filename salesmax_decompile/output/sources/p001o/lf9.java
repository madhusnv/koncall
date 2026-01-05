package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class lf9 extends AtomicReference implements m9c, su5 {

    /* renamed from: a */
    public final gu3 f33712a;

    /* renamed from: b */
    public final gu3 f33713b;

    /* renamed from: c */
    public final jm f33714c;

    /* renamed from: d */
    public final gu3 f33715d;

    public lf9(gu3 gu3Var, gu3 gu3Var2, jm jmVar, gu3 gu3Var3) {
        this.f33712a = gu3Var;
        this.f33713b = gu3Var2;
        this.f33714c = jmVar;
        this.f33715d = gu3Var3;
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        if (zu5.setOnce(this, su5Var)) {
            try {
                this.f33715d.accept(this);
            } catch (Throwable th) {
                zk6.m59526b(th);
                su5Var.dispose();
                onError(th);
            }
        }
    }

    @Override // p001o.su5
    public void dispose() {
        zu5.dispose(this);
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f33712a.accept(obj);
        } catch (Throwable th) {
            zk6.m59526b(th);
            ((su5) get()).dispose();
            onError(th);
        }
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return get() == zu5.DISPOSED;
    }

    @Override // p001o.m9c
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(zu5.DISPOSED);
        try {
            this.f33714c.run();
        } catch (Throwable th) {
            zk6.m59526b(th);
            fwe.m27599r(th);
        }
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        if (isDisposed()) {
            fwe.m27599r(th);
            return;
        }
        lazySet(zu5.DISPOSED);
        try {
            this.f33713b.accept(th);
        } catch (Throwable th2) {
            zk6.m59526b(th2);
            fwe.m27599r(new mo3(th, th2));
        }
    }
}
