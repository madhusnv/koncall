package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class p0b extends p8 {

    /* renamed from: b */
    public final rl7 f39154b;

    /* renamed from: o.p0b$a */
    public static final class C15935a implements q0b, su5 {

        /* renamed from: a */
        public final q0b f39155a;

        /* renamed from: b */
        public final rl7 f39156b;

        /* renamed from: c */
        public su5 f39157c;

        public C15935a(q0b q0bVar, rl7 rl7Var) {
            this.f39155a = q0bVar;
            this.f39156b = rl7Var;
        }

        @Override // p001o.q0b
        /* renamed from: a */
        public void mo34822a(su5 su5Var) {
            if (zu5.validate(this.f39157c, su5Var)) {
                this.f39157c = su5Var;
                this.f39155a.mo34822a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            su5 su5Var = this.f39157c;
            this.f39157c = zu5.DISPOSED;
            su5Var.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f39157c.isDisposed();
        }

        @Override // p001o.q0b
        public void onComplete() {
            this.f39155a.onComplete();
        }

        @Override // p001o.q0b
        public void onError(Throwable th) {
            this.f39155a.onError(th);
        }

        @Override // p001o.q0b
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f39156b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null item");
                this.f39155a.onSuccess(objApply);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f39155a.onError(th);
            }
        }
    }

    public p0b(s0b s0bVar, rl7 rl7Var) {
        super(s0bVar);
        this.f39154b = rl7Var;
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        this.f39572a.mo27839a(new C15935a(q0bVar, this.f39154b));
    }
}
