package p001o;

/* loaded from: classes6.dex */
public final class j0i implements Comparable {

    /* renamed from: b */
    public static final C14422a f29524b = new C14422a(null);

    /* renamed from: a */
    public final int f29525a;

    /* renamed from: o.j0i$a */
    public static final class C14422a {
        public C14422a() {
        }

        public /* synthetic */ C14422a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ j0i(int i) {
        this.f29525a = i;
    }

    /* renamed from: a */
    public static final /* synthetic */ j0i m33017a(int i) {
        return new j0i(i);
    }

    /* renamed from: c */
    public static int m33018c(int i) {
        return i;
    }

    /* renamed from: d */
    public static boolean m33019d(int i, Object obj) {
        return (obj instanceof j0i) && i == ((j0i) obj).m33022h();
    }

    /* renamed from: e */
    public static int m33020e(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: g */
    public static String m33021g(int i) {
        return String.valueOf(i & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return c5i.m20310a(m33022h(), ((j0i) obj).m33022h());
    }

    public boolean equals(Object obj) {
        return m33019d(this.f29525a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ int m33022h() {
        return this.f29525a;
    }

    public int hashCode() {
        return m33020e(this.f29525a);
    }

    public String toString() {
        return m33021g(this.f29525a);
    }
}
