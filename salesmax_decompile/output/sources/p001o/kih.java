package p001o;

/* loaded from: classes2.dex */
public final class kih {

    /* renamed from: b */
    public static final C14844a f32287b = new C14844a(null);

    /* renamed from: c */
    public static final long f32288c = lih.m37333a(0);

    /* renamed from: a */
    public final long f32289a;

    /* renamed from: o.kih$a */
    public static final class C14844a {
        public C14844a() {
        }

        public /* synthetic */ C14844a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m35767a() {
            return kih.f32288c;
        }
    }

    public /* synthetic */ kih(long j) {
        this.f32289a = j;
    }

    /* renamed from: b */
    public static final /* synthetic */ kih m35755b(long j) {
        return new kih(j);
    }

    /* renamed from: c */
    public static long m35756c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m35757d(long j, Object obj) {
        return (obj instanceof kih) && j == ((kih) obj).m35766m();
    }

    /* renamed from: e */
    public static final boolean m35758e(long j, long j2) {
        return j == j2;
    }

    /* renamed from: f */
    public static final boolean m35759f(long j) {
        return m35763j(j) == m35760g(j);
    }

    /* renamed from: g */
    public static final int m35760g(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: h */
    public static final int m35761h(long j) {
        return m35763j(j) > m35760g(j) ? m35763j(j) : m35760g(j);
    }

    /* renamed from: i */
    public static final int m35762i(long j) {
        return m35763j(j) > m35760g(j) ? m35760g(j) : m35763j(j);
    }

    /* renamed from: j */
    public static final int m35763j(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: k */
    public static int m35764k(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: l */
    public static String m35765l(long j) {
        return "TextRange(" + m35763j(j) + ", " + m35760g(j) + ')';
    }

    public boolean equals(Object obj) {
        return m35757d(this.f32289a, obj);
    }

    public int hashCode() {
        return m35764k(this.f32289a);
    }

    /* renamed from: m */
    public final /* synthetic */ long m35766m() {
        return this.f32289a;
    }

    public String toString() {
        return m35765l(this.f32289a);
    }
}
