package p001o;

/* loaded from: classes2.dex */
public final class umh {

    /* renamed from: a */
    public long f49145a;

    /* renamed from: b */
    public long f49146b;

    /* renamed from: c */
    public long f49147c;

    /* renamed from: d */
    public final ThreadLocal f49148d = new ThreadLocal();

    public umh(long j) {
        m51801i(j);
    }

    /* renamed from: h */
    public static long m51792h(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: j */
    public static long m51793j(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public synchronized long m51794a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!m51800g()) {
            long jLongValue = this.f49145a;
            if (jLongValue == 9223372036854775806L) {
                jLongValue = ((Long) op0.m42515e((Long) this.f49148d.get())).longValue();
            }
            this.f49146b = jLongValue - j;
            notifyAll();
        }
        this.f49147c = j;
        return j + this.f49146b;
    }

    /* renamed from: b */
    public synchronized long m51795b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f49147c;
        if (j2 != -9223372036854775807L) {
            long jM51793j = m51793j(j2);
            long j3 = (4294967296L + jM51793j) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - jM51793j) < Math.abs(j - jM51793j)) {
                j = j4;
            }
        }
        return m51794a(m51792h(j));
    }

    /* renamed from: c */
    public synchronized long m51796c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f49147c;
        if (j2 != -9223372036854775807L) {
            long jM51793j = m51793j(j2);
            long j3 = jM51793j / 8589934592L;
            long j4 = (j3 * 8589934592L) + j;
            j += (j3 + 1) * 8589934592L;
            if (j4 >= jM51793j) {
                j = j4;
            }
        }
        return m51794a(m51792h(j));
    }

    /* renamed from: d */
    public synchronized long m51797d() {
        long j;
        j = this.f49145a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: e */
    public synchronized long m51798e() {
        long j;
        j = this.f49147c;
        return j != -9223372036854775807L ? j + this.f49146b : m51797d();
    }

    /* renamed from: f */
    public synchronized long m51799f() {
        return this.f49146b;
    }

    /* renamed from: g */
    public synchronized boolean m51800g() {
        return this.f49146b != -9223372036854775807L;
    }

    /* renamed from: i */
    public synchronized void m51801i(long j) {
        this.f49145a = j;
        this.f49146b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f49147c = -9223372036854775807L;
    }
}
