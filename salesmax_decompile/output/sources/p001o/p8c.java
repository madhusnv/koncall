package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class p8c extends wtf {

    /* renamed from: a */
    public final x8c f39590a;

    /* renamed from: b */
    public final Object f39591b;

    /* renamed from: c */
    public final jh1 f39592c;

    /* renamed from: o.p8c$a */
    public static final class C16024a implements m9c, su5 {

        /* renamed from: a */
        public final luf f39593a;

        /* renamed from: b */
        public final jh1 f39594b;

        /* renamed from: c */
        public Object f39595c;

        /* renamed from: d */
        public su5 f39596d;

        public C16024a(luf lufVar, jh1 jh1Var, Object obj) {
            this.f39593a = lufVar;
            this.f39595c = obj;
            this.f39594b = jh1Var;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f39596d, su5Var)) {
                this.f39596d = su5Var;
                this.f39593a.mo17881a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f39596d.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            Object obj2 = this.f39595c;
            if (obj2 != null) {
                try {
                    Object objApply = this.f39594b.apply(obj2, obj);
                    Objects.requireNonNull(objApply, "The reducer returned a null value");
                    this.f39595c = objApply;
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    this.f39596d.dispose();
                    onError(th);
                }
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f39596d.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            Object obj = this.f39595c;
            if (obj != null) {
                this.f39595c = null;
                this.f39593a.onSuccess(obj);
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f39595c == null) {
                fwe.m27599r(th);
            } else {
                this.f39595c = null;
                this.f39593a.onError(th);
            }
        }
    }

    public p8c(x8c x8cVar, Object obj, jh1 jh1Var) {
        this.f39590a = x8cVar;
        this.f39591b = obj;
        this.f39592c = jh1Var;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f39590a.mo55724b(new C16024a(lufVar, this.f39592c, this.f39591b));
    }
}
