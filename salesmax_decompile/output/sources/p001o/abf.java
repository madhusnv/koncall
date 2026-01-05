package p001o;

/* loaded from: classes2.dex */
public final class abf {

    /* renamed from: c */
    public static final abf f14448c;

    /* renamed from: d */
    public static final abf f14449d;

    /* renamed from: e */
    public static final abf f14450e;

    /* renamed from: f */
    public static final abf f14451f;

    /* renamed from: g */
    public static final abf f14452g;

    /* renamed from: a */
    public final long f14453a;

    /* renamed from: b */
    public final long f14454b;

    static {
        abf abfVar = new abf(0L, 0L);
        f14448c = abfVar;
        f14449d = new abf(Long.MAX_VALUE, Long.MAX_VALUE);
        f14450e = new abf(Long.MAX_VALUE, 0L);
        f14451f = new abf(0L, Long.MAX_VALUE);
        f14452g = abfVar;
    }

    public abf(long j, long j2) {
        op0.m42511a(j >= 0);
        op0.m42511a(j2 >= 0);
        this.f14453a = j;
        this.f14454b = j2;
    }

    /* renamed from: a */
    public long m16823a(long j, long j2, long j3) {
        long j4 = this.f14453a;
        if (j4 == 0 && this.f14454b == 0) {
            return j;
        }
        long jM1 = sqi.m1(j, j4, Long.MIN_VALUE);
        long jM48723b = sqi.m48723b(j, this.f14454b, Long.MAX_VALUE);
        boolean z = jM1 <= j2 && j2 <= jM48723b;
        boolean z2 = jM1 <= j3 && j3 <= jM48723b;
        return (z && z2) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z ? j2 : z2 ? j3 : jM1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || abf.class != obj.getClass()) {
            return false;
        }
        abf abfVar = (abf) obj;
        return this.f14453a == abfVar.f14453a && this.f14454b == abfVar.f14454b;
    }

    public int hashCode() {
        return (((int) this.f14453a) * 31) + ((int) this.f14454b);
    }
}
