package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class f67 extends wtf implements nm7 {

    /* renamed from: a */
    public final s47 f22789a;

    /* renamed from: b */
    public final Object f22790b;

    /* renamed from: o.f67$a */
    public static final class C13348a implements h67, su5 {

        /* renamed from: a */
        public final luf f22791a;

        /* renamed from: b */
        public final Object f22792b;

        /* renamed from: c */
        public rag f22793c;

        /* renamed from: d */
        public boolean f22794d;

        /* renamed from: e */
        public Object f22795e;

        public C13348a(luf lufVar, Object obj) {
            this.f22791a = lufVar;
            this.f22792b = obj;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f22793c, ragVar)) {
                this.f22793c = ragVar;
                this.f22791a.mo17881a(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f22793c.cancel();
            this.f22793c = wag.CANCELLED;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f22794d) {
                return;
            }
            if (this.f22795e == null) {
                this.f22795e = obj;
                return;
            }
            this.f22794d = true;
            this.f22793c.cancel();
            this.f22793c = wag.CANCELLED;
            this.f22791a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f22793c == wag.CANCELLED;
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f22794d) {
                return;
            }
            this.f22794d = true;
            this.f22793c = wag.CANCELLED;
            Object obj = this.f22795e;
            this.f22795e = null;
            if (obj == null) {
                obj = this.f22792b;
            }
            if (obj != null) {
                this.f22791a.onSuccess(obj);
            } else {
                this.f22791a.onError(new NoSuchElementException());
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f22794d) {
                fwe.m27599r(th);
                return;
            }
            this.f22794d = true;
            this.f22793c = wag.CANCELLED;
            this.f22791a.onError(th);
        }
    }

    public f67(s47 s47Var, Object obj) {
        this.f22789a = s47Var;
        this.f22790b = obj;
    }

    @Override // p001o.nm7
    /* renamed from: c */
    public s47 mo26167c() {
        return fwe.m27593l(new e67(this.f22789a, this.f22790b, true));
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f22789a.b0(new C13348a(lufVar, this.f22790b));
    }
}
