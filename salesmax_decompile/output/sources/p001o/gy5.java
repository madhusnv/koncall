package p001o;

/* loaded from: classes5.dex */
public class gy5 implements nvh {

    /* renamed from: a */
    public final int f25935a;

    /* renamed from: b */
    public final boolean f25936b;

    /* renamed from: c */
    public hy5 f25937c;

    /* renamed from: o.gy5$a */
    public static class C13833a {

        /* renamed from: a */
        public final int f25938a;

        /* renamed from: b */
        public boolean f25939b;

        public C13833a() {
            this(300);
        }

        /* renamed from: a */
        public gy5 m29640a() {
            return new gy5(this.f25938a, this.f25939b);
        }

        public C13833a(int i) {
            this.f25938a = i;
        }
    }

    public gy5(int i, boolean z) {
        this.f25935a = i;
        this.f25936b = z;
    }

    @Override // p001o.nvh
    /* renamed from: a */
    public mvh mo29638a(ez4 ez4Var, boolean z) {
        return ez4Var == ez4.MEMORY_CACHE ? rzb.m47354b() : m29639b();
    }

    /* renamed from: b */
    public final mvh m29639b() {
        if (this.f25937c == null) {
            this.f25937c = new hy5(this.f25935a, this.f25936b);
        }
        return this.f25937c;
    }
}
