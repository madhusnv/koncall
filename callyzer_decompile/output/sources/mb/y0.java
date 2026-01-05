package mb;

import io.C3328c;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a */
    public final List f23543a;

    /* renamed from: b */
    public final AbstractC4701q f23544b;

    /* renamed from: c */
    public final String f23545c;

    /* renamed from: d */
    public final String f23546d;

    /* renamed from: e */
    public final C7126c f23547e;

    /* renamed from: f */
    public final x1 f23548f;

    /* renamed from: g */
    public final p2 f23549g;

    /* renamed from: h */
    public final Long f23550h;

    /* renamed from: i */
    public final w1 f23551i;

    public y0(C3328c c3328c) {
        this.f23543a = (List) c3328c.f17613e;
        this.f23544b = (AbstractC4701q) c3328c.f17610b;
        this.f23545c = (String) c3328c.f17609a;
        this.f23546d = (String) c3328c.f17611c;
        this.f23547e = (C7126c) c3328c.f17612d;
        this.f23548f = (x1) c3328c.f17614f;
        this.f23549g = (p2) c3328c.f17615g;
        this.f23550h = (Long) c3328c.f17616h;
        this.f23551i = (w1) c3328c.f17617i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y0.class != obj.getClass()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return AbstractC4154l.m8918a(this.f23543a, y0Var.f23543a) && AbstractC4154l.m8918a(this.f23544b, y0Var.f23544b) && AbstractC4154l.m8918a(this.f23545c, y0Var.f23545c) && AbstractC4154l.m8918a(this.f23546d, y0Var.f23546d) && AbstractC4154l.m8918a(this.f23547e, y0Var.f23547e) && AbstractC4154l.m8918a(this.f23548f, y0Var.f23548f) && AbstractC4154l.m8918a(this.f23549g, y0Var.f23549g) && AbstractC4154l.m8918a(this.f23550h, y0Var.f23550h) && AbstractC4154l.m8918a(this.f23551i, y0Var.f23551i);
    }

    public final int hashCode() {
        List list = this.f23543a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        AbstractC4701q abstractC4701q = this.f23544b;
        int iHashCode2 = (iHashCode + (abstractC4701q != null ? abstractC4701q.hashCode() : 0)) * 31;
        String str = this.f23545c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23546d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        C7126c c7126c = this.f23547e;
        int iHashCode5 = (iHashCode4 + (c7126c != null ? c7126c.f34346a.hashCode() : 0)) * 31;
        x1 x1Var = this.f23548f;
        int iHashCode6 = (iHashCode5 + (x1Var != null ? x1Var.hashCode() : 0)) * 31;
        p2 p2Var = this.f23549g;
        int iHashCode7 = (iHashCode6 + (p2Var != null ? p2Var.hashCode() : 0)) * 31;
        Long l9 = this.f23550h;
        int iHashCode8 = (iHashCode7 + (l9 != null ? l9.hashCode() : 0)) * 31;
        w1 w1Var = this.f23551i;
        return iHashCode8 + (w1Var != null ? w1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Object(");
        sb2.append("checksumAlgorithm=" + this.f23543a + ',');
        sb2.append("checksumType=" + this.f23544b + ',');
        StringBuilder sbM7385r = i0.m0.m7385r(i0.m0.m7385r(new StringBuilder("eTag="), this.f23545c, ',', sb2, "key="), this.f23546d, ',', sb2, "lastModified=");
        sbM7385r.append(this.f23547e);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("owner=" + this.f23548f + ',');
        sb2.append("restoreStatus=" + this.f23549g + ',');
        sb2.append("size=" + this.f23550h + ',');
        StringBuilder sb3 = new StringBuilder("storageClass=");
        sb3.append(this.f23551i);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
