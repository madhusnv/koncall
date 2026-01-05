package p001o;

import java.util.Collection;

/* loaded from: classes6.dex */
public final class b9c extends a9 {

    /* renamed from: b */
    public final idg f15804b;

    /* renamed from: o.b9c$a */
    public static final class C12330a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f15805a;

        /* renamed from: b */
        public su5 f15806b;

        /* renamed from: c */
        public Collection f15807c;

        public C12330a(m9c m9cVar, Collection collection) {
            this.f15805a = m9cVar;
            this.f15807c = collection;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f15806b, su5Var)) {
                this.f15806b = su5Var;
                this.f15805a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f15806b.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            this.f15807c.add(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f15806b.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            Collection collection = this.f15807c;
            this.f15807c = null;
            this.f15805a.mo16560e(collection);
            this.f15805a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f15807c = null;
            this.f15805a.onError(th);
        }
    }

    public b9c(x8c x8cVar, idg idgVar) {
        super(x8cVar);
        this.f15804b = idgVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        try {
            this.f14302a.mo55724b(new C12330a(m9cVar, (Collection) xk6.m56415c(this.f15804b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, m9cVar);
        }
    }
}
