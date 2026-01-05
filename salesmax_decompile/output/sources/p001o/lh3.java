package p001o;

/* loaded from: classes2.dex */
public final class lh3 {

    /* renamed from: b */
    public static final C15075a f33793b = new C15075a(null);

    /* renamed from: c */
    public static final long f33794c = rh3.m46768c(4278190080L);

    /* renamed from: d */
    public static final long f33795d = rh3.m46768c(4282664004L);

    /* renamed from: e */
    public static final long f33796e = rh3.m46768c(4287137928L);

    /* renamed from: f */
    public static final long f33797f = rh3.m46768c(4291611852L);

    /* renamed from: g */
    public static final long f33798g = rh3.m46768c(4294967295L);

    /* renamed from: h */
    public static final long f33799h = rh3.m46768c(4294901760L);

    /* renamed from: i */
    public static final long f33800i = rh3.m46768c(4278255360L);

    /* renamed from: j */
    public static final long f33801j = rh3.m46768c(4278190335L);

    /* renamed from: k */
    public static final long f33802k = rh3.m46768c(4294967040L);

    /* renamed from: l */
    public static final long f33803l = rh3.m46768c(4278255615L);

    /* renamed from: m */
    public static final long f33804m = rh3.m46768c(4294902015L);

    /* renamed from: n */
    public static final long f33805n = rh3.m46767b(0);

    /* renamed from: o */
    public static final long f33806o = rh3.m46766a(0.0f, 0.0f, 0.0f, 0.0f, ii3.f28698a.m32169j());

    /* renamed from: a */
    public final long f33807a;

    /* renamed from: o.lh3$a */
    public static final class C15075a {
        public C15075a() {
        }

        public /* synthetic */ C15075a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m37209a() {
            return lh3.f33794c;
        }

        /* renamed from: b */
        public final long m37210b() {
            return lh3.f33801j;
        }

        /* renamed from: c */
        public final long m37211c() {
            return lh3.f33799h;
        }

        /* renamed from: d */
        public final long m37212d() {
            return lh3.f33806o;
        }
    }

    public /* synthetic */ lh3(long j) {
        this.f33807a = j;
    }

    /* renamed from: e */
    public static final /* synthetic */ lh3 m37196e(long j) {
        return new lh3(j);
    }

    /* renamed from: f */
    public static long m37197f(long j) {
        return j;
    }

    /* renamed from: g */
    public static final long m37198g(long j, ei3 ei3Var) {
        sq8.m48649h(ei3Var, "colorSpace");
        ei3 ei3VarM37203l = m37203l(j);
        return sq8.m48644c(ei3Var, ei3VarM37203l) ? j : fi3.m26721i(ei3VarM37203l, ei3Var, 0, 2, null).mo36194e(m37205n(j), m37204m(j), m37202k(j), m37201j(j));
    }

    /* renamed from: h */
    public static boolean m37199h(long j, Object obj) {
        return (obj instanceof lh3) && j == ((lh3) obj).m37208q();
    }

    /* renamed from: i */
    public static final boolean m37200i(long j, long j2) {
        return p0i.m42843e(j, j2);
    }

    /* renamed from: j */
    public static final float m37201j(long j) {
        float fM20312c;
        float f;
        if (p0i.m42841c(63 & j) == 0) {
            fM20312c = (float) c5i.m20312c(p0i.m42841c(p0i.m42841c(j >>> 56) & 255));
            f = 255.0f;
        } else {
            fM20312c = (float) c5i.m20312c(p0i.m42841c(p0i.m42841c(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return fM20312c / f;
    }

    /* renamed from: k */
    public static final float m37202k(long j) {
        return p0i.m42841c(63 & j) == 0 ? ((float) c5i.m20312c(p0i.m42841c(p0i.m42841c(j >>> 32) & 255))) / 255.0f : y27.m57136d(y27.m57135c((short) p0i.m42841c(p0i.m42841c(j >>> 16) & 65535)));
    }

    /* renamed from: l */
    public static final ei3 m37203l(long j) {
        ii3 ii3Var = ii3.f28698a;
        return ii3Var.m32164e()[(int) p0i.m42841c(j & 63)];
    }

    /* renamed from: m */
    public static final float m37204m(long j) {
        return p0i.m42841c(63 & j) == 0 ? ((float) c5i.m20312c(p0i.m42841c(p0i.m42841c(j >>> 40) & 255))) / 255.0f : y27.m57136d(y27.m57135c((short) p0i.m42841c(p0i.m42841c(j >>> 32) & 65535)));
    }

    /* renamed from: n */
    public static final float m37205n(long j) {
        return p0i.m42841c(63 & j) == 0 ? ((float) c5i.m20312c(p0i.m42841c(p0i.m42841c(j >>> 48) & 255))) / 255.0f : y27.m57136d(y27.m57135c((short) p0i.m42841c(p0i.m42841c(j >>> 48) & 65535)));
    }

    /* renamed from: o */
    public static int m37206o(long j) {
        return p0i.m42844g(j);
    }

    /* renamed from: p */
    public static String m37207p(long j) {
        return "Color(" + m37205n(j) + ", " + m37204m(j) + ", " + m37202k(j) + ", " + m37201j(j) + ", " + m37203l(j).m25095f() + ')';
    }

    public boolean equals(Object obj) {
        return m37199h(this.f33807a, obj);
    }

    public int hashCode() {
        return m37206o(this.f33807a);
    }

    /* renamed from: q */
    public final /* synthetic */ long m37208q() {
        return this.f33807a;
    }

    public String toString() {
        return m37207p(this.f33807a);
    }
}
