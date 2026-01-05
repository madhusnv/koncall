package p001o;

/* loaded from: classes2.dex */
public final class ucd {

    /* renamed from: a */
    public final long f48714a;

    public /* synthetic */ ucd(long j) {
        this.f48714a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ ucd m51363a(long j) {
        return new ucd(j);
    }

    /* renamed from: b */
    public static long m51364b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m51365c(long j, Object obj) {
        return (obj instanceof ucd) && j == ((ucd) obj).m51369g();
    }

    /* renamed from: d */
    public static final boolean m51366d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: e */
    public static int m51367e(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: f */
    public static String m51368f(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m51365c(this.f48714a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m51369g() {
        return this.f48714a;
    }

    public int hashCode() {
        return m51367e(this.f48714a);
    }

    public String toString() {
        return m51368f(this.f48714a);
    }
}
