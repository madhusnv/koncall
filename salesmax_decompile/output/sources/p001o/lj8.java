package p001o;

/* loaded from: classes2.dex */
public final class lj8 {

    /* renamed from: b */
    public static final C15087a f33918b = new C15087a(null);

    /* renamed from: c */
    public static final int f33919c = m37341d(1);

    /* renamed from: d */
    public static final int f33920d = m37341d(2);

    /* renamed from: a */
    public final int f33921a;

    /* renamed from: o.lj8$a */
    public static final class C15087a {
        public C15087a() {
        }

        public /* synthetic */ C15087a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m37347a() {
            return lj8.f33920d;
        }

        /* renamed from: b */
        public final int m37348b() {
            return lj8.f33919c;
        }
    }

    public /* synthetic */ lj8(int i) {
        this.f33921a = i;
    }

    /* renamed from: c */
    public static final /* synthetic */ lj8 m37340c(int i) {
        return new lj8(i);
    }

    /* renamed from: d */
    public static int m37341d(int i) {
        return i;
    }

    /* renamed from: e */
    public static boolean m37342e(int i, Object obj) {
        return (obj instanceof lj8) && i == ((lj8) obj).m37346i();
    }

    /* renamed from: f */
    public static final boolean m37343f(int i, int i2) {
        return i == i2;
    }

    /* renamed from: g */
    public static int m37344g(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: h */
    public static String m37345h(int i) {
        return m37343f(i, f33919c) ? "Touch" : m37343f(i, f33920d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m37342e(this.f33921a, obj);
    }

    public int hashCode() {
        return m37344g(this.f33921a);
    }

    /* renamed from: i */
    public final /* synthetic */ int m37346i() {
        return this.f33921a;
    }

    public String toString() {
        return m37345h(this.f33921a);
    }
}
