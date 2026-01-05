package zi;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 extends h2 {

    /* renamed from: a */
    public final g2 f43067a;

    /* renamed from: b */
    public final String f43068b;

    /* renamed from: c */
    public final String f43069c;

    /* renamed from: d */
    public final long f43070d;

    public e1(f1 f1Var, String str, String str2, long j6) {
        this.f43067a = f1Var;
        this.f43068b = str;
        this.f43069c = str2;
        this.f43070d = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h2) {
            e1 e1Var = (e1) ((h2) obj);
            if (this.f43067a.equals(e1Var.f43067a) && this.f43068b.equals(e1Var.f43068b) && this.f43069c.equals(e1Var.f43069c) && this.f43070d == e1Var.f43070d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f43067a.hashCode() ^ 1000003) * 1000003) ^ this.f43068b.hashCode()) * 1000003) ^ this.f43069c.hashCode()) * 1000003;
        long j6 = this.f43070d;
        return iHashCode ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f43067a);
        sb2.append(", parameterKey=");
        sb2.append(this.f43068b);
        sb2.append(", parameterValue=");
        sb2.append(this.f43069c);
        sb2.append(", templateVersion=");
        return AbstractC0030c.m116g(this.f43070d, "}", sb2);
    }
}
