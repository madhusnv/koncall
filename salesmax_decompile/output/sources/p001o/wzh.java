package p001o;

/* loaded from: classes6.dex */
public final class wzh implements Comparable {

    /* renamed from: b */
    public static final C18015a f52958b = new C18015a(null);

    /* renamed from: a */
    public final byte f52959a;

    /* renamed from: o.wzh$a */
    public static final class C18015a {
        public C18015a() {
        }

        public /* synthetic */ C18015a(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ wzh(byte b) {
        this.f52959a = b;
    }

    /* renamed from: a */
    public static final /* synthetic */ wzh m55510a(byte b) {
        return new wzh(b);
    }

    /* renamed from: c */
    public static byte m55511c(byte b) {
        return b;
    }

    /* renamed from: d */
    public static boolean m55512d(byte b, Object obj) {
        return (obj instanceof wzh) && b == ((wzh) obj).m55515h();
    }

    /* renamed from: e */
    public static int m55513e(byte b) {
        return Byte.hashCode(b);
    }

    /* renamed from: g */
    public static String m55514g(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return sq8.m48651j(m55515h() & 255, ((wzh) obj).m55515h() & 255);
    }

    public boolean equals(Object obj) {
        return m55512d(this.f52959a, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ byte m55515h() {
        return this.f52959a;
    }

    public int hashCode() {
        return m55513e(this.f52959a);
    }

    public String toString() {
        return m55514g(this.f52959a);
    }
}
