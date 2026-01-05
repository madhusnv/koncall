package p001o;

import java.util.Collection;

/* loaded from: classes6.dex */
public final class c9c extends wtf implements om7 {

    /* renamed from: a */
    public final x8c f17541a;

    /* renamed from: b */
    public final idg f17542b;

    /* renamed from: o.c9c$a */
    public static final class C12592a implements m9c, su5 {

        /* renamed from: a */
        public final luf f17543a;

        /* renamed from: b */
        public Collection f17544b;

        /* renamed from: c */
        public su5 f17545c;

        public C12592a(luf lufVar, Collection collection) {
            this.f17543a = lufVar;
            this.f17544b = collection;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f17545c, su5Var)) {
                this.f17545c = su5Var;
                this.f17543a.mo17881a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f17545c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            this.f17544b.add(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f17545c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            Collection collection = this.f17544b;
            this.f17544b = null;
            this.f17543a.onSuccess(collection);
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f17544b = null;
            this.f17543a.onError(th);
        }
    }

    public c9c(x8c x8cVar, int i) {
        this.f17541a = x8cVar;
        this.f17542b = km7.m35916b(i);
    }

    @Override // p001o.om7
    /* renamed from: b */
    public x6c mo18256b() {
        return fwe.m27595n(new b9c(this.f17541a, this.f17542b));
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        try {
            this.f17541a.mo55724b(new C12592a(lufVar, (Collection) xk6.m56415c(this.f17542b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, lufVar);
        }
    }
}
