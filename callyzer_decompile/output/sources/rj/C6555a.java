package rj;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rj.a */
/* loaded from: classes.dex */
public final class C6555a {

    /* renamed from: a */
    public final String f31407a;

    /* renamed from: b */
    public final long f31408b;

    /* renamed from: c */
    public final long f31409c;

    public C6555a(String str, long j6, long j10) {
        this.f31407a = str;
        this.f31408b = j6;
        this.f31409c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6555a) {
            C6555a c6555a = (C6555a) obj;
            if (this.f31407a.equals(c6555a.f31407a) && this.f31408b == c6555a.f31408b && this.f31409c == c6555a.f31409c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f31407a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f31408b;
        long j10 = this.f31409c;
        return ((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f31407a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f31408b);
        sb2.append(", tokenCreationTimestamp=");
        return AbstractC0030c.m116g(this.f31409c, "}", sb2);
    }
}
