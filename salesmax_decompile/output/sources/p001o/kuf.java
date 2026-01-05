package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class kuf extends wtf {

    /* renamed from: a */
    public final xuf f32727a;

    /* renamed from: b */
    public final c5f f32728b;

    /* renamed from: o.kuf$a */
    public static final class RunnableC14929a extends AtomicReference implements luf, su5, Runnable {

        /* renamed from: a */
        public final luf f32729a;

        /* renamed from: b */
        public final c5f f32730b;

        /* renamed from: c */
        public Object f32731c;

        /* renamed from: d */
        public Throwable f32732d;

        public RunnableC14929a(luf lufVar, c5f c5fVar) {
            this.f32729a = lufVar;
            this.f32730b = c5fVar;
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            if (zu5.setOnce(this, su5Var)) {
                this.f32729a.mo17881a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            this.f32732d = th;
            zu5.replace(this, this.f32730b.mo20302c(this));
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            this.f32731c = obj;
            zu5.replace(this, this.f32730b.mo20302c(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f32732d;
            if (th != null) {
                this.f32729a.onError(th);
            } else {
                this.f32729a.onSuccess(this.f32731c);
            }
        }
    }

    public kuf(xuf xufVar, c5f c5fVar) {
        this.f32727a = xufVar;
        this.f32728b = c5fVar;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f32727a.mo55011a(new RunnableC14929a(lufVar, this.f32728b));
    }
}
