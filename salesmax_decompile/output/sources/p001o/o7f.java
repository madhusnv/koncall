package p001o;

/* loaded from: classes3.dex */
public abstract class o7f implements n7f {

    /* renamed from: a */
    public final C15724a f37877a = new C15724a();

    /* renamed from: o.o7f$a */
    public static final class C15724a {

        /* renamed from: a */
        public int f37878a;

        /* renamed from: b */
        public boolean f37879b;

        /* renamed from: a */
        public final int m41713a() {
            return this.f37878a;
        }

        /* renamed from: b */
        public final boolean m41714b() {
            return this.f37879b;
        }

        /* renamed from: c */
        public final void m41715c(int i) {
            this.f37878a = i;
        }

        /* renamed from: d */
        public final void m41716d(boolean z) {
            this.f37879b = z;
        }
    }

    @Override // p001o.n7f
    /* renamed from: a */
    public boolean mo40230a() {
        synchronized (this.f37877a) {
            if (this.f37877a.m41714b()) {
                return false;
            }
            this.f37877a.m41715c(r1.m41713a() - 1);
            if (this.f37877a.m41713a() > 0) {
                return false;
            }
            this.f37877a.m41716d(true);
            return true;
        }
    }

    @Override // p001o.n7f
    /* renamed from: c */
    public void mo40231c() {
        synchronized (this.f37877a) {
            if (!(!this.f37877a.m41714b())) {
                throw new IllegalStateException("caller attempted to share() a fully unshared object".toString());
            }
            C15724a c15724a = this.f37877a;
            c15724a.m41715c(c15724a.m41713a() + 1);
        }
    }
}
