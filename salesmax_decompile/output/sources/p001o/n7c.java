package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class n7c extends a9 {

    /* renamed from: b */
    public final long f36514b;

    /* renamed from: c */
    public final Object f36515c;

    /* renamed from: d */
    public final boolean f36516d;

    /* renamed from: o.n7c$a */
    public static final class C15524a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f36517a;

        /* renamed from: b */
        public final long f36518b;

        /* renamed from: c */
        public final Object f36519c;

        /* renamed from: d */
        public final boolean f36520d;

        /* renamed from: e */
        public su5 f36521e;

        /* renamed from: f */
        public long f36522f;

        /* renamed from: g */
        public boolean f36523g;

        public C15524a(m9c m9cVar, long j, Object obj, boolean z) {
            this.f36517a = m9cVar;
            this.f36518b = j;
            this.f36519c = obj;
            this.f36520d = z;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f36521e, su5Var)) {
                this.f36521e = su5Var;
                this.f36517a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f36521e.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f36523g) {
                return;
            }
            long j = this.f36522f;
            if (j != this.f36518b) {
                this.f36522f = j + 1;
                return;
            }
            this.f36523g = true;
            this.f36521e.dispose();
            this.f36517a.mo16560e(obj);
            this.f36517a.onComplete();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f36521e.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f36523g) {
                return;
            }
            this.f36523g = true;
            Object obj = this.f36519c;
            if (obj == null && this.f36520d) {
                this.f36517a.onError(new NoSuchElementException());
                return;
            }
            if (obj != null) {
                this.f36517a.mo16560e(obj);
            }
            this.f36517a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f36523g) {
                fwe.m27599r(th);
            } else {
                this.f36523g = true;
                this.f36517a.onError(th);
            }
        }
    }

    public n7c(x8c x8cVar, long j, Object obj, boolean z) {
        super(x8cVar);
        this.f36514b = j;
        this.f36515c = obj;
        this.f36516d = z;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C15524a(m9cVar, this.f36514b, this.f36515c, this.f36516d));
    }
}
