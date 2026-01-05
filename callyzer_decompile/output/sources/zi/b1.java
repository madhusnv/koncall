package zi;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 extends e2 {

    /* renamed from: a */
    public final Double f43014a;

    /* renamed from: b */
    public final int f43015b;

    /* renamed from: c */
    public final boolean f43016c;

    /* renamed from: d */
    public final int f43017d;

    /* renamed from: e */
    public final long f43018e;

    /* renamed from: f */
    public final long f43019f;

    public b1(Double d2, int i10, boolean z6, int i11, long j6, long j10) {
        this.f43014a = d2;
        this.f43015b = i10;
        this.f43016c = z6;
        this.f43017d = i11;
        this.f43018e = j6;
        this.f43019f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            e2 e2Var = (e2) obj;
            Double d2 = this.f43014a;
            if (d2 != null ? d2.equals(((b1) e2Var).f43014a) : ((b1) e2Var).f43014a == null) {
                b1 b1Var = (b1) e2Var;
                if (this.f43015b == b1Var.f43015b && this.f43016c == b1Var.f43016c && this.f43017d == b1Var.f43017d && this.f43018e == b1Var.f43018e && this.f43019f == b1Var.f43019f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d2 = this.f43014a;
        int iHashCode = ((((((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.f43015b) * 1000003) ^ (this.f43016c ? 1231 : 1237)) * 1000003) ^ this.f43017d) * 1000003;
        long j6 = this.f43018e;
        long j10 = this.f43019f;
        return ((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f43014a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f43015b);
        sb2.append(", proximityOn=");
        sb2.append(this.f43016c);
        sb2.append(", orientation=");
        sb2.append(this.f43017d);
        sb2.append(", ramUsed=");
        sb2.append(this.f43018e);
        sb2.append(", diskUsed=");
        return AbstractC0030c.m116g(this.f43019f, "}", sb2);
    }
}
