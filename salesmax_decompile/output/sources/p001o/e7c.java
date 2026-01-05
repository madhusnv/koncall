package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class e7c extends wtf implements om7 {

    /* renamed from: a */
    public final x8c f21118a;

    /* renamed from: b */
    public final idg f21119b;

    /* renamed from: c */
    public final eh1 f21120c;

    /* renamed from: o.e7c$a */
    public static final class C13121a implements m9c, su5 {

        /* renamed from: a */
        public final luf f21121a;

        /* renamed from: b */
        public final eh1 f21122b;

        /* renamed from: c */
        public final Object f21123c;

        /* renamed from: d */
        public su5 f21124d;

        /* renamed from: e */
        public boolean f21125e;

        public C13121a(luf lufVar, Object obj, eh1 eh1Var) {
            this.f21121a = lufVar;
            this.f21122b = eh1Var;
            this.f21123c = obj;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f21124d, su5Var)) {
                this.f21124d = su5Var;
                this.f21121a.mo17881a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f21124d.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f21125e) {
                return;
            }
            try {
                this.f21122b.accept(this.f21123c, obj);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f21124d.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f21124d.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f21125e) {
                return;
            }
            this.f21125e = true;
            this.f21121a.onSuccess(this.f21123c);
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f21125e) {
                fwe.m27599r(th);
            } else {
                this.f21125e = true;
                this.f21121a.onError(th);
            }
        }
    }

    public e7c(x8c x8cVar, idg idgVar, eh1 eh1Var) {
        this.f21118a = x8cVar;
        this.f21119b = idgVar;
        this.f21120c = eh1Var;
    }

    @Override // p001o.om7
    /* renamed from: b */
    public x6c mo18256b() {
        return fwe.m27595n(new d7c(this.f21118a, this.f21119b, this.f21120c));
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        try {
            Object obj = this.f21119b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.f21118a.mo55724b(new C13121a(lufVar, obj, this.f21120c));
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, lufVar);
        }
    }
}
