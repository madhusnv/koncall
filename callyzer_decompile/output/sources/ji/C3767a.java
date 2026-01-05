package ji;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ji.a */
/* loaded from: classes.dex */
public final class C3767a {

    /* renamed from: a */
    public final long f19650a;

    /* renamed from: b */
    public final long f19651b;

    /* renamed from: c */
    public final long f19652c;

    public C3767a(long j6, long j10, long j11) {
        this.f19650a = j6;
        this.f19651b = j10;
        this.f19652c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3767a) {
            C3767a c3767a = (C3767a) obj;
            if (this.f19650a == c3767a.f19650a && this.f19651b == c3767a.f19651b && this.f19652c == c3767a.f19652c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f19650a;
        long j10 = this.f19651b;
        int i10 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f19652c;
        return i10 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f19650a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f19651b);
        sb2.append(", uptimeMillis=");
        return AbstractC0030c.m116g(this.f19652c, "}", sb2);
    }
}
