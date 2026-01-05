package zi;

import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends b2 {

    /* renamed from: a */
    public final List f43256a;

    /* renamed from: b */
    public final x1 f43257b;

    /* renamed from: c */
    public final p1 f43258c;

    /* renamed from: d */
    public final u0 f43259d;

    /* renamed from: e */
    public final List f43260e;

    public r0(List list, t0 t0Var, p1 p1Var, u0 u0Var, List list2) {
        this.f43256a = list;
        this.f43257b = t0Var;
        this.f43258c = p1Var;
        this.f43259d = u0Var;
        this.f43260e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        List list = this.f43256a;
        if (list == null) {
            if (((r0) b2Var).f43256a != null) {
                return false;
            }
        } else if (!list.equals(((r0) b2Var).f43256a)) {
            return false;
        }
        x1 x1Var = this.f43257b;
        if (x1Var == null) {
            if (((r0) b2Var).f43257b != null) {
                return false;
            }
        } else if (!x1Var.equals(((r0) b2Var).f43257b)) {
            return false;
        }
        p1 p1Var = this.f43258c;
        if (p1Var == null) {
            if (((r0) b2Var).f43258c != null) {
                return false;
            }
        } else if (!p1Var.equals(((r0) b2Var).f43258c)) {
            return false;
        }
        r0 r0Var = (r0) b2Var;
        return this.f43259d.equals(r0Var.f43259d) && this.f43260e.equals(r0Var.f43260e);
    }

    public final int hashCode() {
        List list = this.f43256a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        x1 x1Var = this.f43257b;
        int iHashCode2 = (iHashCode ^ (x1Var == null ? 0 : x1Var.hashCode())) * 1000003;
        p1 p1Var = this.f43258c;
        return (((((p1Var != null ? p1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f43259d.hashCode()) * 1000003) ^ this.f43260e.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Execution{threads=");
        sb2.append(this.f43256a);
        sb2.append(", exception=");
        sb2.append(this.f43257b);
        sb2.append(", appExitInfo=");
        sb2.append(this.f43258c);
        sb2.append(", signal=");
        sb2.append(this.f43259d);
        sb2.append(", binaries=");
        return AbstractC5601a.m11240k("}", sb2, this.f43260e);
    }
}
