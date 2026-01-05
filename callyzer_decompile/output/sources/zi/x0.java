package zi;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 extends z1 {

    /* renamed from: a */
    public final long f43308a;

    /* renamed from: b */
    public final String f43309b;

    /* renamed from: c */
    public final String f43310c;

    /* renamed from: d */
    public final long f43311d;

    /* renamed from: e */
    public final int f43312e;

    public x0(long j6, String str, String str2, long j10, int i10) {
        this.f43308a = j6;
        this.f43309b = str;
        this.f43310c = str2;
        this.f43311d = j10;
        this.f43312e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof z1) {
            x0 x0Var = (x0) ((z1) obj);
            String str2 = x0Var.f43310c;
            if (this.f43308a == x0Var.f43308a && this.f43309b.equals(x0Var.f43309b) && ((str = this.f43310c) != null ? str.equals(str2) : str2 == null) && this.f43311d == x0Var.f43311d && this.f43312e == x0Var.f43312e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f43308a;
        int iHashCode = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f43309b.hashCode()) * 1000003;
        String str = this.f43310c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f43311d;
        return ((iHashCode2 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f43312e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f43308a);
        sb2.append(", symbol=");
        sb2.append(this.f43309b);
        sb2.append(", file=");
        sb2.append(this.f43310c);
        sb2.append(", offset=");
        sb2.append(this.f43311d);
        sb2.append(", importance=");
        return AbstractC5601a.m11233d(this.f43312e, "}", sb2);
    }
}
