package p001o;

/* loaded from: classes6.dex */
public final class d1i implements Comparable {

    /* renamed from: b */
    public static final C12784a f19007b = new C12784a(null);

    /* renamed from: a */
    public final short f19008a;

    /* renamed from: o.d1i$a */
    public static final class C12784a {
        public C12784a() {
        }

        public /* synthetic */ C12784a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ d1i(short s) {
        this.f19008a = s;
    }

    /* renamed from: a */
    public static final /* synthetic */ d1i m22245a(short s) {
        return new d1i(s);
    }

    /* renamed from: c */
    public static short m22246c(short s) {
        return s;
    }

    /* renamed from: d */
    public static boolean m22247d(short s, Object obj) {
        return (obj instanceof d1i) && s == ((d1i) obj).m22250h();
    }

    /* renamed from: e */
    public static int m22248e(short s) {
        return Short.hashCode(s);
    }

    /* renamed from: g */
    public static String m22249g(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return sq8.m48651j(m22250h() & 65535, ((d1i) obj).m22250h() & 65535);
    }

    public boolean equals(Object obj) {
        return m22247d(this.f19008a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ short m22250h() {
        return this.f19008a;
    }

    public int hashCode() {
        return m22248e(this.f19008a);
    }

    public String toString() {
        return m22249g(this.f19008a);
    }
}
