package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class n0b extends p8 {

    /* renamed from: b */
    public final rl7 f36163b;

    /* renamed from: o.n0b$a */
    public static final class C15455a extends AtomicReference implements q0b, su5 {

        /* renamed from: a */
        public final q0b f36164a;

        /* renamed from: b */
        public final rl7 f36165b;

        /* renamed from: c */
        public su5 f36166c;

        /* renamed from: o.n0b$a$a */
        public final class a implements q0b {
            public a() {
            }

            @Override // p001o.q0b
            /* renamed from: a */
            public void mo34822a(su5 su5Var) {
                zu5.setOnce(C15455a.this, su5Var);
            }

            @Override // p001o.q0b
            public void onComplete() {
                C15455a.this.f36164a.onComplete();
            }

            @Override // p001o.q0b
            public void onError(Throwable th) {
                C15455a.this.f36164a.onError(th);
            }

            @Override // p001o.q0b
            public void onSuccess(Object obj) {
                C15455a.this.f36164a.onSuccess(obj);
            }
        }

        public C15455a(q0b q0bVar, rl7 rl7Var) {
            this.f36164a = q0bVar;
            this.f36165b = rl7Var;
        }

        @Override // p001o.q0b
        /* renamed from: a */
        public void mo34822a(su5 su5Var) {
            if (zu5.validate(this.f36166c, su5Var)) {
                this.f36166c = su5Var;
                this.f36164a.mo34822a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
            this.f36166c.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.q0b
        public void onComplete() {
            this.f36164a.onComplete();
        }

        @Override // p001o.q0b
        public void onError(Throwable th) {
            this.f36164a.onError(th);
        }

        @Override // p001o.q0b
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f36165b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                s0b s0bVar = (s0b) objApply;
                if (isDisposed()) {
                    return;
                }
                s0bVar.mo27839a(new a());
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f36164a.onError(th);
            }
        }
    }

    public n0b(s0b s0bVar, rl7 rl7Var) {
        super(s0bVar);
        this.f36163b = rl7Var;
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        this.f39572a.mo27839a(new C15455a(q0bVar, this.f36163b));
    }
}
