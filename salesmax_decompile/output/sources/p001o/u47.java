package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class u47 extends wtf implements nm7 {

    /* renamed from: a */
    public final s47 f48309a;

    /* renamed from: b */
    public final idg f48310b;

    /* renamed from: c */
    public final eh1 f48311c;

    /* renamed from: o.u47$a */
    public static final class C17294a implements h67, su5 {

        /* renamed from: a */
        public final luf f48312a;

        /* renamed from: b */
        public final eh1 f48313b;

        /* renamed from: c */
        public final Object f48314c;

        /* renamed from: d */
        public rag f48315d;

        /* renamed from: e */
        public boolean f48316e;

        public C17294a(luf lufVar, Object obj, eh1 eh1Var) {
            this.f48312a = lufVar;
            this.f48313b = eh1Var;
            this.f48314c = obj;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f48315d, ragVar)) {
                this.f48315d = ragVar;
                this.f48312a.mo17881a(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f48315d.cancel();
            this.f48315d = wag.CANCELLED;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f48316e) {
                return;
            }
            try {
                this.f48313b.accept(this.f48314c, obj);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f48315d.cancel();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f48315d == wag.CANCELLED;
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f48316e) {
                return;
            }
            this.f48316e = true;
            this.f48315d = wag.CANCELLED;
            this.f48312a.onSuccess(this.f48314c);
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f48316e) {
                fwe.m27599r(th);
                return;
            }
            this.f48316e = true;
            this.f48315d = wag.CANCELLED;
            this.f48312a.onError(th);
        }
    }

    public u47(s47 s47Var, idg idgVar, eh1 eh1Var) {
        this.f48309a = s47Var;
        this.f48310b = idgVar;
        this.f48311c = eh1Var;
    }

    @Override // p001o.nm7
    /* renamed from: c */
    public s47 mo26167c() {
        return fwe.m27593l(new t47(this.f48309a, this.f48310b, this.f48311c));
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        try {
            Object obj = this.f48310b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.f48309a.b0(new C17294a(lufVar, obj, this.f48311c));
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, lufVar);
        }
    }
}
