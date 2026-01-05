package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class v8c extends wtf {

    /* renamed from: a */
    public final x8c f50016a;

    /* renamed from: b */
    public final Object f50017b;

    /* renamed from: o.v8c$a */
    public static final class C17527a implements m9c, su5 {

        /* renamed from: a */
        public final luf f50018a;

        /* renamed from: b */
        public final Object f50019b;

        /* renamed from: c */
        public su5 f50020c;

        /* renamed from: d */
        public Object f50021d;

        /* renamed from: e */
        public boolean f50022e;

        public C17527a(luf lufVar, Object obj) {
            this.f50018a = lufVar;
            this.f50019b = obj;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f50020c, su5Var)) {
                this.f50020c = su5Var;
                this.f50018a.mo17881a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f50020c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f50022e) {
                return;
            }
            if (this.f50021d == null) {
                this.f50021d = obj;
                return;
            }
            this.f50022e = true;
            this.f50020c.dispose();
            this.f50018a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f50020c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f50022e) {
                return;
            }
            this.f50022e = true;
            Object obj = this.f50021d;
            this.f50021d = null;
            if (obj == null) {
                obj = this.f50019b;
            }
            if (obj != null) {
                this.f50018a.onSuccess(obj);
            } else {
                this.f50018a.onError(new NoSuchElementException());
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f50022e) {
                fwe.m27599r(th);
            } else {
                this.f50022e = true;
                this.f50018a.onError(th);
            }
        }
    }

    public v8c(x8c x8cVar, Object obj) {
        this.f50016a = x8cVar;
        this.f50017b = obj;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f50016a.mo55724b(new C17527a(lufVar, this.f50017b));
    }
}
