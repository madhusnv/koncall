package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class juf extends wtf {

    /* renamed from: a */
    public final xuf f31114a;

    /* renamed from: b */
    public final rl7 f31115b;

    /* renamed from: o.juf$a */
    public static final class C14666a implements luf {

        /* renamed from: a */
        public final luf f31116a;

        /* renamed from: b */
        public final rl7 f31117b;

        public C14666a(luf lufVar, rl7 rl7Var) {
            this.f31116a = lufVar;
            this.f31117b = rl7Var;
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            this.f31116a.mo17881a(su5Var);
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            this.f31116a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f31117b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                this.f31116a.onSuccess(objApply);
            } catch (Throwable th) {
                zk6.m59526b(th);
                onError(th);
            }
        }
    }

    public juf(xuf xufVar, rl7 rl7Var) {
        this.f31114a = xufVar;
        this.f31115b = rl7Var;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f31114a.mo55011a(new C14666a(lufVar, this.f31115b));
    }
}
