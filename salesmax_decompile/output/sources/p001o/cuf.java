package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class cuf extends wtf {

    /* renamed from: a */
    public final xuf f18663a;

    /* renamed from: b */
    public final rl7 f18664b;

    /* renamed from: o.cuf$a */
    public static final class C12751a extends AtomicReference implements luf, su5 {

        /* renamed from: a */
        public final luf f18665a;

        /* renamed from: b */
        public final rl7 f18666b;

        /* renamed from: o.cuf$a$a */
        public static final class a implements luf {

            /* renamed from: a */
            public final AtomicReference f18667a;

            /* renamed from: b */
            public final luf f18668b;

            public a(AtomicReference atomicReference, luf lufVar) {
                this.f18667a = atomicReference;
                this.f18668b = lufVar;
            }

            @Override // p001o.luf
            /* renamed from: a */
            public void mo17881a(su5 su5Var) {
                zu5.replace(this.f18667a, su5Var);
            }

            @Override // p001o.luf
            public void onError(Throwable th) {
                this.f18668b.onError(th);
            }

            @Override // p001o.luf
            public void onSuccess(Object obj) {
                this.f18668b.onSuccess(obj);
            }
        }

        public C12751a(luf lufVar, rl7 rl7Var) {
            this.f18665a = lufVar;
            this.f18666b = rl7Var;
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            if (zu5.setOnce(this, su5Var)) {
                this.f18665a.mo17881a(this);
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
            this.f18665a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f18666b.apply(obj);
                Objects.requireNonNull(objApply, "The single returned by the mapper is null");
                xuf xufVar = (xuf) objApply;
                if (isDisposed()) {
                    return;
                }
                xufVar.mo55011a(new a(this, this.f18665a));
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f18665a.onError(th);
            }
        }
    }

    public cuf(xuf xufVar, rl7 rl7Var) {
        this.f18664b = rl7Var;
        this.f18663a = xufVar;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f18663a.mo55011a(new C12751a(lufVar, this.f18664b));
    }
}
