package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class mf9 extends AtomicReference implements h67, rag, su5 {

    /* renamed from: a */
    public final gu3 f35344a;

    /* renamed from: b */
    public final gu3 f35345b;

    /* renamed from: c */
    public final jm f35346c;

    /* renamed from: d */
    public final gu3 f35347d;

    public mf9(gu3 gu3Var, gu3 gu3Var2, jm jmVar, gu3 gu3Var3) {
        this.f35344a = gu3Var;
        this.f35345b = gu3Var2;
        this.f35346c = jmVar;
        this.f35347d = gu3Var3;
    }

    @Override // p001o.h67, p001o.qag
    /* renamed from: b */
    public void mo18165b(rag ragVar) {
        if (wag.setOnce(this, ragVar)) {
            try {
                this.f35347d.accept(this);
            } catch (Throwable th) {
                zk6.m59526b(th);
                ragVar.cancel();
                onError(th);
            }
        }
    }

    @Override // p001o.rag
    public void cancel() {
        wag.cancel(this);
    }

    @Override // p001o.su5
    public void dispose() {
        cancel();
    }

    @Override // p001o.qag
    /* renamed from: e */
    public void mo18166e(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f35344a.accept(obj);
        } catch (Throwable th) {
            zk6.m59526b(th);
            ((rag) get()).cancel();
            onError(th);
        }
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return get() == wag.CANCELLED;
    }

    @Override // p001o.qag
    public void onComplete() {
        Object obj = get();
        wag wagVar = wag.CANCELLED;
        if (obj != wagVar) {
            lazySet(wagVar);
            try {
                this.f35346c.run();
            } catch (Throwable th) {
                zk6.m59526b(th);
                fwe.m27599r(th);
            }
        }
    }

    @Override // p001o.qag
    public void onError(Throwable th) {
        Object obj = get();
        wag wagVar = wag.CANCELLED;
        if (obj == wagVar) {
            fwe.m27599r(th);
            return;
        }
        lazySet(wagVar);
        try {
            this.f35345b.accept(th);
        } catch (Throwable th2) {
            zk6.m59526b(th2);
            fwe.m27599r(new mo3(th, th2));
        }
    }

    @Override // p001o.rag
    public void request(long j) {
        ((rag) get()).request(j);
    }
}
