package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class y7c extends a9 {

    /* renamed from: b */
    public final rl7 f55027b;

    /* renamed from: o.y7c$a */
    public static final class C18347a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f55028a;

        /* renamed from: b */
        public final rl7 f55029b;

        /* renamed from: c */
        public su5 f55030c;

        public C18347a(m9c m9cVar, rl7 rl7Var) {
            this.f55028a = m9cVar;
            this.f55029b = rl7Var;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f55030c, su5Var)) {
                this.f55030c = su5Var;
                this.f55028a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f55030c.dispose();
            this.f55030c = zu5.DISPOSED;
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f55030c == zu5.DISPOSED) {
                return;
            }
            try {
                m9c m9cVar = this.f55028a;
                for (Object obj2 : (Iterable) this.f55029b.apply(obj)) {
                    try {
                        try {
                            Objects.requireNonNull(obj2, "The iterator returned a null value");
                            m9cVar.mo16560e(obj2);
                        } catch (Throwable th) {
                            zk6.m59526b(th);
                            this.f55030c.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        zk6.m59526b(th2);
                        this.f55030c.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                zk6.m59526b(th3);
                this.f55030c.dispose();
                onError(th3);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f55030c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            su5 su5Var = this.f55030c;
            zu5 zu5Var = zu5.DISPOSED;
            if (su5Var == zu5Var) {
                return;
            }
            this.f55030c = zu5Var;
            this.f55028a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            su5 su5Var = this.f55030c;
            zu5 zu5Var = zu5.DISPOSED;
            if (su5Var == zu5Var) {
                fwe.m27599r(th);
            } else {
                this.f55030c = zu5Var;
                this.f55028a.onError(th);
            }
        }
    }

    public y7c(x8c x8cVar, rl7 rl7Var) {
        super(x8cVar);
        this.f55027b = rl7Var;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C18347a(m9cVar, this.f55027b));
    }
}
