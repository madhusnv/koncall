package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class yuf extends wtf {

    /* renamed from: a */
    public final xuf f56073a;

    /* renamed from: b */
    public final c5f f56074b;

    /* renamed from: o.yuf$a */
    public static final class RunnableC18498a extends AtomicReference implements luf, su5, Runnable {

        /* renamed from: a */
        public final luf f56075a;

        /* renamed from: b */
        public final ref f56076b = new ref();

        /* renamed from: c */
        public final xuf f56077c;

        public RunnableC18498a(luf lufVar, xuf xufVar) {
            this.f56075a = lufVar;
            this.f56077c = xufVar;
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            zu5.setOnce(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
            this.f56076b.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            this.f56075a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            this.f56075a.onSuccess(obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f56077c.mo55011a(this);
        }
    }

    public yuf(xuf xufVar, c5f c5fVar) {
        this.f56073a = xufVar;
        this.f56074b = c5fVar;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        RunnableC18498a runnableC18498a = new RunnableC18498a(lufVar, this.f56073a);
        lufVar.mo17881a(runnableC18498a);
        runnableC18498a.f56076b.m46621a(this.f56074b.mo20302c(runnableC18498a));
    }
}
