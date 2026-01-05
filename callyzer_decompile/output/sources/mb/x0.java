package mb;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a */
    public final List f23522a;

    /* renamed from: b */
    public final List f23523b;

    /* renamed from: c */
    public final String f23524c;

    /* renamed from: d */
    public final String f23525d;

    /* renamed from: e */
    public final i0 f23526e;

    /* renamed from: f */
    public final Boolean f23527f;

    /* renamed from: g */
    public final Integer f23528g;

    /* renamed from: h */
    public final Integer f23529h;

    /* renamed from: i */
    public final String f23530i;

    /* renamed from: j */
    public final String f23531j;

    /* renamed from: k */
    public final String f23532k;

    /* renamed from: l */
    public final l2 f23533l;

    /* renamed from: m */
    public final String f23534m;

    public x0(w0 w0Var) {
        this.f23522a = w0Var.f23505a;
        this.f23523b = w0Var.f23506b;
        this.f23524c = w0Var.f23507c;
        this.f23525d = w0Var.f23508d;
        this.f23526e = w0Var.f23509e;
        this.f23527f = w0Var.f23510f;
        this.f23528g = w0Var.f23511g;
        this.f23529h = w0Var.f23512h;
        this.f23530i = w0Var.f23513i;
        this.f23531j = w0Var.f23514j;
        this.f23532k = w0Var.f23515k;
        this.f23533l = w0Var.f23516l;
        this.f23534m = w0Var.f23517m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return AbstractC4154l.m8918a(this.f23522a, x0Var.f23522a) && AbstractC4154l.m8918a(this.f23523b, x0Var.f23523b) && AbstractC4154l.m8918a(this.f23524c, x0Var.f23524c) && AbstractC4154l.m8918a(this.f23525d, x0Var.f23525d) && AbstractC4154l.m8918a(this.f23526e, x0Var.f23526e) && AbstractC4154l.m8918a(this.f23527f, x0Var.f23527f) && AbstractC4154l.m8918a(this.f23528g, x0Var.f23528g) && AbstractC4154l.m8918a(this.f23529h, x0Var.f23529h) && AbstractC4154l.m8918a(this.f23530i, x0Var.f23530i) && AbstractC4154l.m8918a(this.f23531j, x0Var.f23531j) && AbstractC4154l.m8918a(this.f23532k, x0Var.f23532k) && AbstractC4154l.m8918a(this.f23533l, x0Var.f23533l) && AbstractC4154l.m8918a(this.f23534m, x0Var.f23534m);
    }

    public final int hashCode() {
        List list = this.f23522a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.f23523b;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f23524c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23525d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        i0 i0Var = this.f23526e;
        int iHashCode5 = (iHashCode4 + (i0Var != null ? i0Var.hashCode() : 0)) * 31;
        Boolean bool = this.f23527f;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.f23528g;
        int iIntValue = (iHashCode6 + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.f23529h;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        String str3 = this.f23530i;
        int iHashCode7 = (iIntValue2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f23531j;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f23532k;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        l2 l2Var = this.f23533l;
        int iHashCode10 = (iHashCode9 + (l2Var != null ? l2Var.hashCode() : 0)) * 31;
        String str6 = this.f23534m;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListObjectsV2Response(");
        sb2.append("commonPrefixes=" + this.f23522a + ',');
        sb2.append("contents=" + this.f23523b + ',');
        StringBuilder sbM7385r = i0.m0.m7385r(i0.m0.m7385r(new StringBuilder("continuationToken="), this.f23524c, ',', sb2, "delimiter="), this.f23525d, ',', sb2, "encodingType=");
        sbM7385r.append(this.f23526e);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        StringBuilder sbM7384q = i0.m0.m7384q(new StringBuilder("isTruncated="), this.f23527f, ',', sb2, "keyCount=");
        sbM7384q.append(this.f23528g);
        sbM7384q.append(',');
        sb2.append(sbM7384q.toString());
        sb2.append("maxKeys=" + this.f23529h + ',');
        StringBuilder sbM7385r2 = i0.m0.m7385r(i0.m0.m7385r(i0.m0.m7385r(new StringBuilder("name="), this.f23530i, ',', sb2, "nextContinuationToken="), this.f23531j, ',', sb2, "prefix="), this.f23532k, ',', sb2, "requestCharged=");
        sbM7385r2.append(this.f23533l);
        sbM7385r2.append(',');
        sb2.append(sbM7385r2.toString());
        return AbstractC4801l.m9737k(new StringBuilder("startAfter="), this.f23534m, sb2, ")");
    }
}
