package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public final class p7c extends wtf implements om7 {

    /* renamed from: a */
    public final x8c f39517a;

    /* renamed from: b */
    public final long f39518b;

    /* renamed from: c */
    public final Object f39519c;

    /* renamed from: o.p7c$a */
    public static final class C16010a implements m9c, su5 {

        /* renamed from: a */
        public final luf f39520a;

        /* renamed from: b */
        public final long f39521b;

        /* renamed from: c */
        public final Object f39522c;

        /* renamed from: d */
        public su5 f39523d;

        /* renamed from: e */
        public long f39524e;

        /* renamed from: f */
        public boolean f39525f;

        public C16010a(luf lufVar, long j, Object obj) {
            this.f39520a = lufVar;
            this.f39521b = j;
            this.f39522c = obj;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f39523d, su5Var)) {
                this.f39523d = su5Var;
                this.f39520a.mo17881a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f39523d.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f39525f) {
                return;
            }
            long j = this.f39524e;
            if (j != this.f39521b) {
                this.f39524e = j + 1;
                return;
            }
            this.f39525f = true;
            this.f39523d.dispose();
            this.f39520a.onSuccess(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f39523d.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f39525f) {
                return;
            }
            this.f39525f = true;
            Object obj = this.f39522c;
            if (obj != null) {
                this.f39520a.onSuccess(obj);
            } else {
                this.f39520a.onError(new NoSuchElementException());
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f39525f) {
                fwe.m27599r(th);
            } else {
                this.f39525f = true;
                this.f39520a.onError(th);
            }
        }
    }

    public p7c(x8c x8cVar, long j, Object obj) {
        this.f39517a = x8cVar;
        this.f39518b = j;
        this.f39519c = obj;
    }

    @Override // p001o.om7
    /* renamed from: b */
    public x6c mo18256b() {
        return fwe.m27595n(new n7c(this.f39517a, this.f39518b, this.f39519c, true));
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f39517a.mo55724b(new C16010a(lufVar, this.f39518b, this.f39519c));
    }
}
