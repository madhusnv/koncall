package zi;

import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 extends x1 {

    /* renamed from: a */
    public final String f43279a;

    /* renamed from: b */
    public final String f43280b;

    /* renamed from: c */
    public final List f43281c;

    /* renamed from: d */
    public final x1 f43282d;

    /* renamed from: e */
    public final int f43283e;

    public t0(String str, String str2, List list, x1 x1Var, int i10) {
        this.f43279a = str;
        this.f43280b = str2;
        this.f43281c = list;
        this.f43282d = x1Var;
        this.f43283e = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        x1 x1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            x1 x1Var2 = t0Var.f43282d;
            String str2 = t0Var.f43280b;
            if (this.f43279a.equals(t0Var.f43279a) && ((str = this.f43280b) != null ? str.equals(str2) : str2 == null) && this.f43281c.equals(t0Var.f43281c) && ((x1Var = this.f43282d) != null ? x1Var.equals(x1Var2) : x1Var2 == null) && this.f43283e == t0Var.f43283e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f43279a.hashCode() ^ 1000003) * 1000003;
        String str = this.f43280b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f43281c.hashCode()) * 1000003;
        x1 x1Var = this.f43282d;
        return ((iHashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003) ^ this.f43283e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f43279a);
        sb2.append(", reason=");
        sb2.append(this.f43280b);
        sb2.append(", frames=");
        sb2.append(this.f43281c);
        sb2.append(", causedBy=");
        sb2.append(this.f43282d);
        sb2.append(", overflowCount=");
        return AbstractC5601a.m11233d(this.f43283e, "}", sb2);
    }
}
