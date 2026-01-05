package p001o;

/* loaded from: classes2.dex */
public final class hue {

    /* renamed from: b */
    public static final C14080a f27559b = new C14080a(null);

    /* renamed from: c */
    public static final int f27560c = m31145i(0);

    /* renamed from: d */
    public static final int f27561d = m31145i(1);

    /* renamed from: e */
    public static final int f27562e = m31145i(2);

    /* renamed from: f */
    public static final int f27563f = m31145i(3);

    /* renamed from: g */
    public static final int f27564g = m31145i(4);

    /* renamed from: h */
    public static final int f27565h = m31145i(5);

    /* renamed from: i */
    public static final int f27566i = m31145i(6);

    /* renamed from: a */
    public final int f27567a;

    /* renamed from: o.hue$a */
    public static final class C14080a {
        public C14080a() {
        }

        public /* synthetic */ C14080a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m31151a() {
            return hue.f27560c;
        }

        /* renamed from: b */
        public final int m31152b() {
            return hue.f27561d;
        }

        /* renamed from: c */
        public final int m31153c() {
            return hue.f27566i;
        }

        /* renamed from: d */
        public final int m31154d() {
            return hue.f27565h;
        }

        /* renamed from: e */
        public final int m31155e() {
            return hue.f27563f;
        }

        /* renamed from: f */
        public final int m31156f() {
            return hue.f27562e;
        }

        /* renamed from: g */
        public final int m31157g() {
            return hue.f27564g;
        }
    }

    public /* synthetic */ hue(int i) {
        this.f27567a = i;
    }

    /* renamed from: h */
    public static final /* synthetic */ hue m31144h(int i) {
        return new hue(i);
    }

    /* renamed from: i */
    public static int m31145i(int i) {
        return i;
    }

    /* renamed from: j */
    public static boolean m31146j(int i, Object obj) {
        return (obj instanceof hue) && i == ((hue) obj).m31150n();
    }

    /* renamed from: k */
    public static final boolean m31147k(int i, int i2) {
        return i == i2;
    }

    /* renamed from: l */
    public static int m31148l(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: m */
    public static String m31149m(int i) {
        return m31147k(i, f27560c) ? "Button" : m31147k(i, f27561d) ? "Checkbox" : m31147k(i, f27562e) ? "Switch" : m31147k(i, f27563f) ? "RadioButton" : m31147k(i, f27564g) ? "Tab" : m31147k(i, f27565h) ? "Image" : m31147k(i, f27566i) ? "DropdownList" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31146j(this.f27567a, obj);
    }

    public int hashCode() {
        return m31148l(this.f27567a);
    }

    /* renamed from: n */
    public final /* synthetic */ int m31150n() {
        return this.f27567a;
    }

    public String toString() {
        return m31149m(this.f27567a);
    }
}
