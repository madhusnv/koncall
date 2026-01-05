package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class euf extends x6c {

    /* renamed from: a */
    public final xuf f22195a;

    /* renamed from: b */
    public final rl7 f22196b;

    /* renamed from: o.euf$a */
    public static final class C13262a extends AtomicReference implements m9c, luf, su5 {

        /* renamed from: a */
        public final m9c f22197a;

        /* renamed from: b */
        public final rl7 f22198b;

        public C13262a(m9c m9cVar, rl7 rl7Var) {
            this.f22197a = m9cVar;
            this.f22198b = rl7Var;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            zu5.replace(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            this.f22197a.mo16560e(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f22197a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f22197a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f22198b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                x8c x8cVar = (x8c) objApply;
                if (isDisposed()) {
                    return;
                }
                x8cVar.mo55724b(this);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f22197a.onError(th);
            }
        }
    }

    public euf(xuf xufVar, rl7 rl7Var) {
        this.f22195a = xufVar;
        this.f22196b = rl7Var;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C13262a c13262a = new C13262a(m9cVar, this.f22196b);
        m9cVar.mo16559a(c13262a);
        this.f22195a.mo55011a(c13262a);
    }
}
