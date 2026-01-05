package zi;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends w1 {

    /* renamed from: a */
    public final long f43268a;

    /* renamed from: b */
    public final long f43269b;

    /* renamed from: c */
    public final String f43270c;

    /* renamed from: d */
    public final String f43271d;

    public s0(long j6, long j10, String str, String str2) {
        this.f43268a = j6;
        this.f43269b = j10;
        this.f43270c = str;
        this.f43271d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            s0 s0Var = (s0) ((w1) obj);
            String str2 = s0Var.f43271d;
            if (this.f43268a == s0Var.f43268a && this.f43269b == s0Var.f43269b && this.f43270c.equals(s0Var.f43270c) && ((str = this.f43271d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f43268a;
        long j10 = this.f43269b;
        int iHashCode = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f43270c.hashCode()) * 1000003;
        String str = this.f43271d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f43268a);
        sb2.append(", size=");
        sb2.append(this.f43269b);
        sb2.append(", name=");
        sb2.append(this.f43270c);
        sb2.append(", uuid=");
        return AbstractC1452a.m4564k(sb2, this.f43271d, "}");
    }
}
