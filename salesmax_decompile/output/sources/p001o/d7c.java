package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class d7c extends a9 {

    /* renamed from: b */
    public final idg f19197b;

    /* renamed from: c */
    public final eh1 f19198c;

    /* renamed from: o.d7c$a */
    public static final class C12806a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f19199a;

        /* renamed from: b */
        public final eh1 f19200b;

        /* renamed from: c */
        public final Object f19201c;

        /* renamed from: d */
        public su5 f19202d;

        /* renamed from: e */
        public boolean f19203e;

        public C12806a(m9c m9cVar, Object obj, eh1 eh1Var) {
            this.f19199a = m9cVar;
            this.f19200b = eh1Var;
            this.f19201c = obj;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f19202d, su5Var)) {
                this.f19202d = su5Var;
                this.f19199a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f19202d.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f19203e) {
                return;
            }
            try {
                this.f19200b.accept(this.f19201c, obj);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f19202d.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f19202d.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f19203e) {
                return;
            }
            this.f19203e = true;
            this.f19199a.mo16560e(this.f19201c);
            this.f19199a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f19203e) {
                fwe.m27599r(th);
            } else {
                this.f19203e = true;
                this.f19199a.onError(th);
            }
        }
    }

    public d7c(x8c x8cVar, idg idgVar, eh1 eh1Var) {
        super(x8cVar);
        this.f19197b = idgVar;
        this.f19198c = eh1Var;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        try {
            Object obj = this.f19197b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.f14302a.mo55724b(new C12806a(m9cVar, obj, this.f19198c));
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, m9cVar);
        }
    }
}
