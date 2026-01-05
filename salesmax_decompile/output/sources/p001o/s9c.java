package p001o;

/* loaded from: classes2.dex */
public final class s9c {

    /* renamed from: b */
    public static final C16789a f45035b = new C16789a(null);

    /* renamed from: c */
    public static final long f45036c = v9c.m52474a(0.0f, 0.0f);

    /* renamed from: d */
    public static final long f45037d = v9c.m52474a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e */
    public static final long f45038e = v9c.m52474a(Float.NaN, Float.NaN);

    /* renamed from: a */
    public final long f45039a;

    /* renamed from: o.s9c$a */
    public static final class C16789a {
        public C16789a() {
        }

        public /* synthetic */ C16789a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m48061a() {
            return s9c.f45037d;
        }

        /* renamed from: b */
        public final long m48062b() {
            return s9c.f45038e;
        }

        /* renamed from: c */
        public final long m48063c() {
            return s9c.f45036c;
        }
    }

    public /* synthetic */ s9c(long j) {
        this.f45039a = j;
    }

    /* renamed from: d */
    public static final /* synthetic */ s9c m48045d(long j) {
        return new s9c(j);
    }

    /* renamed from: e */
    public static final float m48046e(long j) {
        return m48052k(j);
    }

    /* renamed from: f */
    public static final float m48047f(long j) {
        return m48053l(j);
    }

    /* renamed from: g */
    public static long m48048g(long j) {
        return j;
    }

    /* renamed from: h */
    public static boolean m48049h(long j, Object obj) {
        return (obj instanceof s9c) && j == ((s9c) obj).m48060s();
    }

    /* renamed from: i */
    public static final boolean m48050i(long j, long j2) {
        return j == j2;
    }

    /* renamed from: j */
    public static final float m48051j(long j) {
        return (m48052k(j) * m48052k(j)) + (m48053l(j) * m48053l(j));
    }

    /* renamed from: k */
    public static final float m48052k(long j) {
        if (!(j != f45038e)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        e37 e37Var = e37.f20857a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: l */
    public static final float m48053l(long j) {
        if (!(j != f45038e)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        e37 e37Var = e37.f20857a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: m */
    public static int m48054m(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: n */
    public static final boolean m48055n(long j) {
        if ((Float.isNaN(m48052k(j)) || Float.isNaN(m48053l(j))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    /* renamed from: o */
    public static final long m48056o(long j, long j2) {
        return v9c.m52474a(m48052k(j) - m48052k(j2), m48053l(j) - m48053l(j2));
    }

    /* renamed from: p */
    public static final long m48057p(long j, long j2) {
        return v9c.m52474a(m48052k(j) + m48052k(j2), m48053l(j) + m48053l(j2));
    }

    /* renamed from: q */
    public static String m48058q(long j) {
        if (!v9c.m52476c(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + mo7.m39455a(m48052k(j), 1) + ", " + mo7.m39455a(m48053l(j), 1) + ')';
    }

    /* renamed from: r */
    public static final long m48059r(long j) {
        return v9c.m52474a(-m48052k(j), -m48053l(j));
    }

    public boolean equals(Object obj) {
        return m48049h(this.f45039a, obj);
    }

    public int hashCode() {
        return m48054m(this.f45039a);
    }

    /* renamed from: s */
    public final /* synthetic */ long m48060s() {
        return this.f45039a;
    }

    public String toString() {
        return m48058q(this.f45039a);
    }
}
