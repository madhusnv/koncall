package p001o;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class zk3 extends xk3 {

    /* renamed from: a */
    public final Iterable f57305a;

    /* renamed from: o.zk3$a */
    public static final class C18662a extends AtomicInteger implements ml3 {

        /* renamed from: a */
        public final ml3 f57306a;

        /* renamed from: b */
        public final Iterator f57307b;

        /* renamed from: c */
        public final ref f57308c = new ref();

        public C18662a(ml3 ml3Var, Iterator it) {
            this.f57306a = ml3Var;
            this.f57307b = it;
        }

        @Override // p001o.ml3
        /* renamed from: a */
        public void mo16368a(su5 su5Var) {
            this.f57308c.m46621a(su5Var);
        }

        /* renamed from: b */
        public void m59522b() {
            if (!this.f57308c.isDisposed() && getAndIncrement() == 0) {
                Iterator it = this.f57307b;
                while (!this.f57308c.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            this.f57306a.onComplete();
                            return;
                        }
                        try {
                            Object next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            ((ql3) next).mo45628a(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            zk6.m59526b(th);
                            this.f57306a.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        zk6.m59526b(th2);
                        this.f57306a.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // p001o.ml3
        public void onComplete() {
            m59522b();
        }

        @Override // p001o.ml3
        public void onError(Throwable th) {
            this.f57306a.onError(th);
        }
    }

    public zk3(Iterable iterable) {
        this.f57305a = iterable;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        try {
            Iterator it = this.f57305a.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            C18662a c18662a = new C18662a(ml3Var, it);
            ml3Var.mo16368a(c18662a.f57308c);
            c18662a.m59522b();
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, ml3Var);
        }
    }
}
