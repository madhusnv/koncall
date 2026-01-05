package p001o;

/* loaded from: classes5.dex */
public abstract class h5g {

    /* renamed from: o.h5g$b */
    public static class C13855b extends h5g {

        /* renamed from: a */
        public volatile boolean f26222a;

        public C13855b() {
            super();
        }

        @Override // p001o.h5g
        /* renamed from: b */
        public void mo29828b(boolean z) {
            this.f26222a = z;
        }

        @Override // p001o.h5g
        /* renamed from: c */
        public void mo29829c() {
            if (this.f26222a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public h5g() {
    }

    /* renamed from: a */
    public static h5g m29827a() {
        return new C13855b();
    }

    /* renamed from: b */
    public abstract void mo29828b(boolean z);

    /* renamed from: c */
    public abstract void mo29829c();
}
