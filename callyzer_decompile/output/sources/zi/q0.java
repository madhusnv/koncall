package zi;

import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends d2 {

    /* renamed from: a */
    public final r0 f43244a;

    /* renamed from: b */
    public final List f43245b;

    /* renamed from: c */
    public final List f43246c;

    /* renamed from: d */
    public final Boolean f43247d;

    /* renamed from: e */
    public final c2 f43248e;

    /* renamed from: f */
    public final List f43249f;

    /* renamed from: g */
    public final int f43250g;

    public q0(r0 r0Var, List list, List list2, Boolean bool, c2 c2Var, List list3, int i10) {
        this.f43244a = r0Var;
        this.f43245b = list;
        this.f43246c = list2;
        this.f43247d = bool;
        this.f43248e = c2Var;
        this.f43249f = list3;
        this.f43250g = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        q0 q0Var = (q0) ((d2) obj);
        List list = q0Var.f43249f;
        c2 c2Var = q0Var.f43248e;
        Boolean bool = q0Var.f43247d;
        List list2 = q0Var.f43246c;
        List list3 = q0Var.f43245b;
        if (!this.f43244a.equals(q0Var.f43244a)) {
            return false;
        }
        List list4 = this.f43245b;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = this.f43246c;
        if (list5 == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list5.equals(list2)) {
            return false;
        }
        Boolean bool2 = this.f43247d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        c2 c2Var2 = this.f43248e;
        if (c2Var2 == null) {
            if (c2Var != null) {
                return false;
            }
        } else if (!c2Var2.equals(c2Var)) {
            return false;
        }
        List list6 = this.f43249f;
        if (list6 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list6.equals(list)) {
            return false;
        }
        return this.f43250g == q0Var.f43250g;
    }

    public final int hashCode() {
        int iHashCode = (this.f43244a.hashCode() ^ 1000003) * 1000003;
        List list = this.f43245b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f43246c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f43247d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        c2 c2Var = this.f43248e;
        int iHashCode5 = (iHashCode4 ^ (c2Var == null ? 0 : c2Var.hashCode())) * 1000003;
        List list3 = this.f43249f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f43250g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f43244a);
        sb2.append(", customAttributes=");
        sb2.append(this.f43245b);
        sb2.append(", internalKeys=");
        sb2.append(this.f43246c);
        sb2.append(", background=");
        sb2.append(this.f43247d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f43248e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f43249f);
        sb2.append(", uiOrientation=");
        return AbstractC5601a.m11233d(this.f43250g, "}", sb2);
    }
}
