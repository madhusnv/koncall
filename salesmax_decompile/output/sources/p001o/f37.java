package p001o;

/* loaded from: classes2.dex */
public final class f37 {

    /* renamed from: a */
    public final long f22616a;

    public /* synthetic */ f37(long j) {
        this.f22616a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ f37 m26028a(long j) {
        return new f37(j);
    }

    /* renamed from: b */
    public static long m26029b(float f, float f2) {
        return m26030c((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* renamed from: c */
    public static long m26030c(long j) {
        return j;
    }

    /* renamed from: d */
    public static boolean m26031d(long j, Object obj) {
        return (obj instanceof f37) && j == ((f37) obj).m26034g();
    }

    /* renamed from: e */
    public static int m26032e(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: f */
    public static String m26033f(long j) {
        return '(' + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m26031d(this.f22616a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long m26034g() {
        return this.f22616a;
    }

    public int hashCode() {
        return m26032e(this.f22616a);
    }

    public String toString() {
        return m26033f(this.f22616a);
    }
}
