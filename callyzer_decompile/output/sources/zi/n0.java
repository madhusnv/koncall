package zi;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends v1 {

    /* renamed from: a */
    public final int f43206a;

    /* renamed from: b */
    public final String f43207b;

    /* renamed from: c */
    public final int f43208c;

    /* renamed from: d */
    public final long f43209d;

    /* renamed from: e */
    public final long f43210e;

    /* renamed from: f */
    public final boolean f43211f;

    /* renamed from: g */
    public final int f43212g;

    /* renamed from: h */
    public final String f43213h;

    /* renamed from: i */
    public final String f43214i;

    public n0(int i10, String str, int i11, long j6, long j10, boolean z6, int i12, String str2, String str3) {
        this.f43206a = i10;
        this.f43207b = str;
        this.f43208c = i11;
        this.f43209d = j6;
        this.f43210e = j10;
        this.f43211f = z6;
        this.f43212g = i12;
        this.f43213h = str2;
        this.f43214i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            n0 n0Var = (n0) ((v1) obj);
            if (this.f43206a == n0Var.f43206a && this.f43207b.equals(n0Var.f43207b) && this.f43208c == n0Var.f43208c && this.f43209d == n0Var.f43209d && this.f43210e == n0Var.f43210e && this.f43211f == n0Var.f43211f && this.f43212g == n0Var.f43212g && this.f43213h.equals(n0Var.f43213h) && this.f43214i.equals(n0Var.f43214i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f43206a ^ 1000003) * 1000003) ^ this.f43207b.hashCode()) * 1000003) ^ this.f43208c) * 1000003;
        long j6 = this.f43209d;
        int i10 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f43210e;
        return ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f43211f ? 1231 : 1237)) * 1000003) ^ this.f43212g) * 1000003) ^ this.f43213h.hashCode()) * 1000003) ^ this.f43214i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f43206a);
        sb2.append(", model=");
        sb2.append(this.f43207b);
        sb2.append(", cores=");
        sb2.append(this.f43208c);
        sb2.append(", ram=");
        sb2.append(this.f43209d);
        sb2.append(", diskSpace=");
        sb2.append(this.f43210e);
        sb2.append(", simulator=");
        sb2.append(this.f43211f);
        sb2.append(", state=");
        sb2.append(this.f43212g);
        sb2.append(", manufacturer=");
        sb2.append(this.f43213h);
        sb2.append(", modelClass=");
        return AbstractC1452a.m4564k(sb2, this.f43214i, "}");
    }
}
