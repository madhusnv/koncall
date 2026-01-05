package p001o;

/* loaded from: classes2.dex */
public final class df8 {

    /* renamed from: b */
    public static final C12897a f19732b = new C12897a(null);

    /* renamed from: c */
    public static final int f19733c = m22970j(1);

    /* renamed from: d */
    public static final int f19734d = m22970j(0);

    /* renamed from: e */
    public static final int f19735e = m22970j(2);

    /* renamed from: f */
    public static final int f19736f = m22970j(3);

    /* renamed from: g */
    public static final int f19737g = m22970j(4);

    /* renamed from: h */
    public static final int f19738h = m22970j(5);

    /* renamed from: i */
    public static final int f19739i = m22970j(6);

    /* renamed from: j */
    public static final int f19740j = m22970j(7);

    /* renamed from: a */
    public final int f19741a;

    /* renamed from: o.df8$a */
    public static final class C12897a {
        public C12897a() {
        }

        public /* synthetic */ C12897a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m22976a() {
            return df8.f19733c;
        }

        /* renamed from: b */
        public final int m22977b() {
            return df8.f19740j;
        }

        /* renamed from: c */
        public final int m22978c() {
            return df8.f19735e;
        }

        /* renamed from: d */
        public final int m22979d() {
            return df8.f19739i;
        }

        /* renamed from: e */
        public final int m22980e() {
            return df8.f19734d;
        }

        /* renamed from: f */
        public final int m22981f() {
            return df8.f19738h;
        }

        /* renamed from: g */
        public final int m22982g() {
            return df8.f19736f;
        }

        /* renamed from: h */
        public final int m22983h() {
            return df8.f19737g;
        }
    }

    public /* synthetic */ df8(int i) {
        this.f19741a = i;
    }

    /* renamed from: i */
    public static final /* synthetic */ df8 m22969i(int i) {
        return new df8(i);
    }

    /* renamed from: j */
    public static int m22970j(int i) {
        return i;
    }

    /* renamed from: k */
    public static boolean m22971k(int i, Object obj) {
        return (obj instanceof df8) && i == ((df8) obj).m22975o();
    }

    /* renamed from: l */
    public static final boolean m22972l(int i, int i2) {
        return i == i2;
    }

    /* renamed from: m */
    public static int m22973m(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: n */
    public static String m22974n(int i) {
        return m22972l(i, f19734d) ? "None" : m22972l(i, f19733c) ? "Default" : m22972l(i, f19735e) ? "Go" : m22972l(i, f19736f) ? "Search" : m22972l(i, f19737g) ? "Send" : m22972l(i, f19738h) ? "Previous" : m22972l(i, f19739i) ? "Next" : m22972l(i, f19740j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m22971k(this.f19741a, obj);
    }

    public int hashCode() {
        return m22973m(this.f19741a);
    }

    /* renamed from: o */
    public final /* synthetic */ int m22975o() {
        return this.f19741a;
    }

    public String toString() {
        return m22974n(this.f19741a);
    }
}
