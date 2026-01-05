package p001o;

/* loaded from: classes3.dex */
public final class es1 {

    /* renamed from: a */
    public final long f22096a;

    /* renamed from: b */
    public final long f22097b;

    /* renamed from: c */
    public final long f22098c;

    /* renamed from: d */
    public final long f22099d;

    /* renamed from: e */
    public final long f22100e;

    /* renamed from: f */
    public final long f22101f;

    public es1(long j, long j2, long j3, long j4, long j5, long j6) {
        dgd.m23051d(j >= 0);
        dgd.m23051d(j2 >= 0);
        dgd.m23051d(j3 >= 0);
        dgd.m23051d(j4 >= 0);
        dgd.m23051d(j5 >= 0);
        dgd.m23051d(j6 >= 0);
        this.f22096a = j;
        this.f22097b = j2;
        this.f22098c = j3;
        this.f22099d = j4;
        this.f22100e = j5;
        this.f22101f = j6;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof es1)) {
            return false;
        }
        es1 es1Var = (es1) obj;
        return this.f22096a == es1Var.f22096a && this.f22097b == es1Var.f22097b && this.f22098c == es1Var.f22098c && this.f22099d == es1Var.f22099d && this.f22100e == es1Var.f22100e && this.f22101f == es1Var.f22101f;
    }

    public int hashCode() {
        return r6c.m46256b(Long.valueOf(this.f22096a), Long.valueOf(this.f22097b), Long.valueOf(this.f22098c), Long.valueOf(this.f22099d), Long.valueOf(this.f22100e), Long.valueOf(this.f22101f));
    }

    public String toString() {
        return cmb.m21421b(this).m21424b("hitCount", this.f22096a).m21424b("missCount", this.f22097b).m21424b("loadSuccessCount", this.f22098c).m21424b("loadExceptionCount", this.f22099d).m21424b("totalLoadTime", this.f22100e).m21424b("evictionCount", this.f22101f).toString();
    }
}
