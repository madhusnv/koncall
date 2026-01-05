package p001o;

/* loaded from: classes2.dex */
public abstract class pd9 {

    /* renamed from: a */
    public static final C16072a f39900a = new C16072a(null);

    /* renamed from: b */
    public static final int f39901b = m43458e(0);

    /* renamed from: c */
    public static final int f39902c = m43458e(1);

    /* renamed from: d */
    public static final int f39903d = m43458e(2);

    /* renamed from: e */
    public static final int f39904e = m43458e(3);

    /* renamed from: o.pd9$a */
    public static final class C16072a {
        public C16072a() {
        }

        public /* synthetic */ C16072a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m43462a() {
            return pd9.f39902c;
        }

        /* renamed from: b */
        public final int m43463b() {
            return pd9.f39901b;
        }

        /* renamed from: c */
        public final int m43464c() {
            return pd9.f39904e;
        }

        /* renamed from: d */
        public final int m43465d() {
            return pd9.f39903d;
        }
    }

    /* renamed from: e */
    public static int m43458e(int i) {
        return i;
    }

    /* renamed from: f */
    public static final boolean m43459f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m43460g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m43461h(int i) {
        return m43459f(i, f39901b) ? "None" : m43459f(i, f39902c) ? "Characters" : m43459f(i, f39903d) ? "Words" : m43459f(i, f39904e) ? "Sentences" : "Invalid";
    }
}
