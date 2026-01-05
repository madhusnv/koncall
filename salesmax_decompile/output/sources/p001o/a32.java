package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class a32 extends AtomicReference implements ml3, su5, gu3 {

    /* renamed from: a */
    public final gu3 f14083a;

    /* renamed from: b */
    public final jm f14084b;

    public a32(jm jmVar) {
        this.f14083a = this;
        this.f14084b = jmVar;
    }

    @Override // p001o.ml3
    /* renamed from: a */
    public void mo16368a(su5 su5Var) {
        zu5.setOnce(this, su5Var);
    }

    @Override // p001o.gu3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th) {
        fwe.m27599r(new pbc(th));
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
        try {
            this.f14084b.run();
        } catch (Throwable th) {
            zk6.m59526b(th);
            fwe.m27599r(th);
        }
        lazySet(zu5.DISPOSED);
    }

    @Override // p001o.ml3
    public void onError(Throwable th) {
        try {
            this.f14083a.accept(th);
        } catch (Throwable th2) {
            zk6.m59526b(th2);
            fwe.m27599r(th2);
        }
        lazySet(zu5.DISPOSED);
    }

    public a32(gu3 gu3Var, jm jmVar) {
        this.f14083a = gu3Var;
        this.f14084b = jmVar;
    }
}
