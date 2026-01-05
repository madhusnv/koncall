package p001o;

/* loaded from: classes6.dex */
public abstract class od4 {

    /* renamed from: o.od4$b */
    public static final class C15764b implements e6f {

        /* renamed from: a */
        public final y54 f38139a;

        /* renamed from: b */
        public final pzf f38140b;

        /* renamed from: c */
        public final boolean f38141c;

        @Override // p001o.e6f, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            y54.m57217f().m57222g(this.f38139a);
            if (this.f38141c) {
                this.f38140b.m44564d();
            }
        }

        public C15764b(pzf pzfVar, boolean z) {
            this.f38140b = pzfVar;
            this.f38141c = z;
            this.f38139a = k64.m35029b(y54.m57217f(), pzfVar).m57221a();
        }
    }

    /* renamed from: a */
    public static pzf m42070a() {
        return k64.m35028a(y54.m57217f());
    }

    /* renamed from: b */
    public static e6f m42071b(pzf pzfVar, boolean z) {
        return new C15764b(pzfVar, z);
    }
}
