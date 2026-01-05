package p001o;

import java.util.Collection;

/* loaded from: classes6.dex */
public final class k67 extends wtf implements nm7 {

    /* renamed from: a */
    public final s47 f31527a;

    /* renamed from: b */
    public final idg f31528b;

    /* renamed from: o.k67$a */
    public static final class C14717a implements h67, su5 {

        /* renamed from: a */
        public final luf f31529a;

        /* renamed from: b */
        public rag f31530b;

        /* renamed from: c */
        public Collection f31531c;

        public C14717a(luf lufVar, Collection collection) {
            this.f31529a = lufVar;
            this.f31531c = collection;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f31530b, ragVar)) {
                this.f31530b = ragVar;
                this.f31529a.mo17881a(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f31530b.cancel();
            this.f31530b = wag.CANCELLED;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f31531c.add(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f31530b == wag.CANCELLED;
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f31530b = wag.CANCELLED;
            this.f31529a.onSuccess(this.f31531c);
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f31531c = null;
            this.f31530b = wag.CANCELLED;
            this.f31529a.onError(th);
        }
    }

    public k67(s47 s47Var) {
        this(s47Var, uo0.asSupplier());
    }

    @Override // p001o.nm7
    /* renamed from: c */
    public s47 mo26167c() {
        return fwe.m27593l(new j67(this.f31527a, this.f31528b));
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        try {
            this.f31527a.b0(new C14717a(lufVar, (Collection) xk6.m56415c(this.f31528b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, lufVar);
        }
    }

    public k67(s47 s47Var, idg idgVar) {
        this.f31527a = s47Var;
        this.f31528b = idgVar;
    }
}
