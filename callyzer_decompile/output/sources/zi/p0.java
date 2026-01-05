package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends j2 {

    /* renamed from: a */
    public final long f43232a;

    /* renamed from: b */
    public final String f43233b;

    /* renamed from: c */
    public final d2 f43234c;

    /* renamed from: d */
    public final e2 f43235d;

    /* renamed from: e */
    public final f2 f43236e;

    /* renamed from: f */
    public final i2 f43237f;

    public p0(long j6, String str, d2 d2Var, e2 e2Var, f2 f2Var, i2 i2Var) {
        this.f43232a = j6;
        this.f43233b = str;
        this.f43234c = d2Var;
        this.f43235d = e2Var;
        this.f43236e = f2Var;
        this.f43237f = i2Var;
    }

    /* renamed from: a */
    public final o0 m16453a() {
        o0 o0Var = new o0();
        o0Var.f43221a = this.f43232a;
        o0Var.f43222b = this.f43233b;
        o0Var.f43223c = this.f43234c;
        o0Var.f43224d = this.f43235d;
        o0Var.f43225e = this.f43236e;
        o0Var.f43226f = this.f43237f;
        o0Var.f43227g = (byte) 1;
        return o0Var;
    }

    public final boolean equals(Object obj) {
        f2 f2Var;
        i2 i2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j2) {
            p0 p0Var = (p0) ((j2) obj);
            i2 i2Var2 = p0Var.f43237f;
            f2 f2Var2 = p0Var.f43236e;
            if (this.f43232a == p0Var.f43232a && this.f43233b.equals(p0Var.f43233b) && this.f43234c.equals(p0Var.f43234c) && this.f43235d.equals(p0Var.f43235d) && ((f2Var = this.f43236e) != null ? f2Var.equals(f2Var2) : f2Var2 == null) && ((i2Var = this.f43237f) != null ? i2Var.equals(i2Var2) : i2Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f43232a;
        int iHashCode = (((((((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f43233b.hashCode()) * 1000003) ^ this.f43234c.hashCode()) * 1000003) ^ this.f43235d.hashCode()) * 1000003;
        f2 f2Var = this.f43236e;
        int iHashCode2 = (iHashCode ^ (f2Var == null ? 0 : f2Var.hashCode())) * 1000003;
        i2 i2Var = this.f43237f;
        return iHashCode2 ^ (i2Var != null ? i2Var.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f43232a + ", type=" + this.f43233b + ", app=" + this.f43234c + ", device=" + this.f43235d + ", log=" + this.f43236e + ", rollouts=" + this.f43237f + "}";
    }
}
