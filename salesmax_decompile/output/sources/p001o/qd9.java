package p001o;

/* loaded from: classes2.dex */
public abstract class qd9 {

    /* renamed from: a */
    public static final C16347a f41694a = new C16347a(null);

    /* renamed from: b */
    public static final int f41695b = m45175j(1);

    /* renamed from: c */
    public static final int f41696c = m45175j(2);

    /* renamed from: d */
    public static final int f41697d = m45175j(3);

    /* renamed from: e */
    public static final int f41698e = m45175j(4);

    /* renamed from: f */
    public static final int f41699f = m45175j(5);

    /* renamed from: g */
    public static final int f41700g = m45175j(6);

    /* renamed from: h */
    public static final int f41701h = m45175j(7);

    /* renamed from: i */
    public static final int f41702i = m45175j(8);

    /* renamed from: j */
    public static final int f41703j = m45175j(9);

    /* renamed from: o.qd9$a */
    public static final class C16347a {
        public C16347a() {
        }

        public /* synthetic */ C16347a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m45179a() {
            return qd9.f41696c;
        }

        /* renamed from: b */
        public final int m45180b() {
            return qd9.f41703j;
        }

        /* renamed from: c */
        public final int m45181c() {
            return qd9.f41700g;
        }

        /* renamed from: d */
        public final int m45182d() {
            return qd9.f41697d;
        }

        /* renamed from: e */
        public final int m45183e() {
            return qd9.f41702i;
        }

        /* renamed from: f */
        public final int m45184f() {
            return qd9.f41701h;
        }

        /* renamed from: g */
        public final int m45185g() {
            return qd9.f41698e;
        }

        /* renamed from: h */
        public final int m45186h() {
            return qd9.f41695b;
        }

        /* renamed from: i */
        public final int m45187i() {
            return qd9.f41699f;
        }
    }

    /* renamed from: j */
    public static int m45175j(int i) {
        return i;
    }

    /* renamed from: k */
    public static final boolean m45176k(int i, int i2) {
        return i == i2;
    }

    /* renamed from: l */
    public static int m45177l(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: m */
    public static String m45178m(int i) {
        return m45176k(i, f41695b) ? "Text" : m45176k(i, f41696c) ? "Ascii" : m45176k(i, f41697d) ? "Number" : m45176k(i, f41698e) ? "Phone" : m45176k(i, f41699f) ? "Uri" : m45176k(i, f41700g) ? "Email" : m45176k(i, f41701h) ? "Password" : m45176k(i, f41702i) ? "NumberPassword" : m45176k(i, f41703j) ? "Decimal" : "Invalid";
    }
}
