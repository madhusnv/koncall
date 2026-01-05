package zi;

import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends p1 {

    /* renamed from: a */
    public final int f43047a;

    /* renamed from: b */
    public final String f43048b;

    /* renamed from: c */
    public final int f43049c;

    /* renamed from: d */
    public final int f43050d;

    /* renamed from: e */
    public final long f43051e;

    /* renamed from: f */
    public final long f43052f;

    /* renamed from: g */
    public final long f43053g;

    /* renamed from: h */
    public final String f43054h;

    /* renamed from: i */
    public final List f43055i;

    public d0(int i10, String str, int i11, int i12, long j6, long j10, long j11, String str2, List list) {
        this.f43047a = i10;
        this.f43048b = str;
        this.f43049c = i11;
        this.f43050d = i12;
        this.f43051e = j6;
        this.f43052f = j10;
        this.f43053g = j11;
        this.f43054h = str2;
        this.f43055i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            d0 d0Var = (d0) ((p1) obj);
            List list2 = d0Var.f43055i;
            String str2 = d0Var.f43054h;
            if (this.f43047a == d0Var.f43047a && this.f43048b.equals(d0Var.f43048b) && this.f43049c == d0Var.f43049c && this.f43050d == d0Var.f43050d && this.f43051e == d0Var.f43051e && this.f43052f == d0Var.f43052f && this.f43053g == d0Var.f43053g && ((str = this.f43054h) != null ? str.equals(str2) : str2 == null) && ((list = this.f43055i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f43047a ^ 1000003) * 1000003) ^ this.f43048b.hashCode()) * 1000003) ^ this.f43049c) * 1000003) ^ this.f43050d) * 1000003;
        long j6 = this.f43051e;
        int i10 = (iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j10 = this.f43052f;
        int i11 = (i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f43053g;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.f43054h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f43055i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationExitInfo{pid=");
        sb2.append(this.f43047a);
        sb2.append(", processName=");
        sb2.append(this.f43048b);
        sb2.append(", reasonCode=");
        sb2.append(this.f43049c);
        sb2.append(", importance=");
        sb2.append(this.f43050d);
        sb2.append(", pss=");
        sb2.append(this.f43051e);
        sb2.append(", rss=");
        sb2.append(this.f43052f);
        sb2.append(", timestamp=");
        sb2.append(this.f43053g);
        sb2.append(", traceFile=");
        sb2.append(this.f43054h);
        sb2.append(", buildIdMappingForArch=");
        return AbstractC5601a.m11240k("}", sb2, this.f43055i);
    }
}
