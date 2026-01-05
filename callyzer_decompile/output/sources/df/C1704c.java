package df;

import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: df.c */
/* loaded from: classes.dex */
public final class C1704c {

    /* renamed from: a */
    public final long f8311a;

    /* renamed from: b */
    public final long f8312b;

    /* renamed from: c */
    public final Set f8313c;

    public C1704c(long j6, long j10, Set set) {
        this.f8311a = j6;
        this.f8312b = j10;
        this.f8313c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1704c) {
            C1704c c1704c = (C1704c) obj;
            if (this.f8311a == c1704c.f8311a && this.f8312b == c1704c.f8312b && this.f8313c.equals(c1704c.f8313c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f8311a;
        int i10 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f8312b;
        return ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f8313c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f8311a + ", maxAllowedDelay=" + this.f8312b + ", flags=" + this.f8313c + "}";
    }
}
