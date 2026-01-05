package p001o;

import p001o.dk3;

/* loaded from: classes6.dex */
public interface fmh {

    /* renamed from: o.fmh$a */
    public static final class C13489a implements InterfaceC13490b {

        /* renamed from: a */
        public static final C13489a f23681a = new C13489a();

        /* renamed from: o.fmh$a$a */
        public static final class a implements dk3 {

            /* renamed from: a */
            public final long f23682a;

            public /* synthetic */ a(long j) {
                this.f23682a = j;
            }

            /* renamed from: d */
            public static final /* synthetic */ a m27093d(long j) {
                return new a(j);
            }

            /* renamed from: g */
            public static long m27094g(long j) {
                return j;
            }

            /* renamed from: h */
            public static long m27095h(long j) {
                return rlb.f43779a.m46944d(j);
            }

            /* renamed from: j */
            public static boolean m27096j(long j, Object obj) {
                return (obj instanceof a) && j == ((a) obj).m27109x();
            }

            /* renamed from: m */
            public static boolean m27097m(long j) {
                return !k16.m34867M(m27095h(j));
            }

            /* renamed from: n */
            public static int m27098n(long j) {
                return Long.hashCode(j);
            }

            /* renamed from: o */
            public static final long m27099o(long j, long j2) {
                return rlb.f43779a.m46943c(j, j2);
            }

            /* renamed from: s */
            public static long m27100s(long j, long j2) {
                return rlb.f43779a.m46942b(j, k16.m34877W(j2));
            }

            /* renamed from: t */
            public static long m27101t(long j, dk3 dk3Var) {
                sq8.m48649h(dk3Var, "other");
                if (dk3Var instanceof a) {
                    return m27099o(j, ((a) dk3Var).m27109x());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m27103w(j)) + " and " + dk3Var);
            }

            /* renamed from: v */
            public static long m27102v(long j, long j2) {
                return rlb.f43779a.m46942b(j, j2);
            }

            /* renamed from: w */
            public static String m27103w(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            @Override // p001o.ulh
            /* renamed from: a */
            public long mo27104a() {
                return m27095h(this.f23682a);
            }

            @Override // p001o.dk3, p001o.ulh
            /* renamed from: b */
            public /* bridge */ /* synthetic */ dk3 mo23355b(long j) {
                return m27093d(m27108u(j));
            }

            @Override // p001o.ulh
            /* renamed from: c */
            public boolean mo27105c() {
                return m27097m(this.f23682a);
            }

            @Override // java.lang.Comparable
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compareTo(dk3 dk3Var) {
                return dk3.C12977a.m23358a(this, dk3Var);
            }

            public boolean equals(Object obj) {
                return m27096j(this.f23682a, obj);
            }

            @Override // p001o.dk3
            public int hashCode() {
                return m27098n(this.f23682a);
            }

            @Override // p001o.dk3
            /* renamed from: i */
            public long mo23356i(dk3 dk3Var) {
                sq8.m48649h(dk3Var, "other");
                return m27101t(this.f23682a, dk3Var);
            }

            @Override // p001o.dk3
            /* renamed from: p */
            public /* bridge */ /* synthetic */ dk3 mo23357p(long j) {
                return m27093d(m27107r(j));
            }

            /* renamed from: r */
            public long m27107r(long j) {
                return m27100s(this.f23682a, j);
            }

            public String toString() {
                return m27103w(this.f23682a);
            }

            /* renamed from: u */
            public long m27108u(long j) {
                return m27102v(this.f23682a, j);
            }

            /* renamed from: x */
            public final /* synthetic */ long m27109x() {
                return this.f23682a;
            }

            @Override // p001o.ulh
            /* renamed from: b */
            public /* bridge */ /* synthetic */ ulh mo23355b(long j) {
                return m27093d(m27108u(j));
            }
        }

        @Override // p001o.fmh.InterfaceC13490b, p001o.fmh
        /* renamed from: a */
        public /* bridge */ /* synthetic */ dk3 mo27091a() {
            return a.m27093d(m27092b());
        }

        /* renamed from: b */
        public long m27092b() {
            return rlb.f43779a.m46945e();
        }

        public String toString() {
            return rlb.f43779a.toString();
        }

        @Override // p001o.fmh
        /* renamed from: a */
        public /* bridge */ /* synthetic */ ulh mo27091a() {
            return a.m27093d(m27092b());
        }
    }

    /* renamed from: o.fmh$b */
    public interface InterfaceC13490b extends fmh {
        @Override // p001o.fmh
        /* renamed from: a */
        dk3 mo27091a();
    }

    /* renamed from: a */
    ulh mo27091a();
}
