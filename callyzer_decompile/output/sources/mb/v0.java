package mb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a */
    public final String f23497a;

    /* renamed from: b */
    public final String f23498b;

    /* renamed from: c */
    public final String f23499c;

    /* renamed from: d */
    public final Integer f23500d;

    /* renamed from: e */
    public final String f23501e;

    public v0(u0 u0Var) {
        this.f23497a = u0Var.f23489a;
        this.f23498b = u0Var.f23490b;
        this.f23499c = u0Var.f23491c;
        this.f23500d = u0Var.f23492d;
        this.f23501e = u0Var.f23493e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return AbstractC4154l.m8918a(this.f23497a, v0Var.f23497a) && AbstractC4154l.m8918a(this.f23498b, v0Var.f23498b) && AbstractC4154l.m8918a(this.f23499c, v0Var.f23499c) && AbstractC4154l.m8918a(this.f23500d, v0Var.f23500d) && AbstractC4154l.m8918a(this.f23501e, v0Var.f23501e);
    }

    public final int hashCode() {
        String str = this.f23497a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23498b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23499c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 923521;
        Integer num = this.f23500d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 961;
        String str4 = this.f23501e;
        return (iIntValue + (str4 != null ? str4.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListObjectsV2Request(");
        StringBuilder sbM7385r = i0.m0.m7385r(i0.m0.m7385r(new StringBuilder("bucket="), this.f23497a, ',', sb2, "continuationToken="), this.f23498b, ',', sb2, "delimiter=");
        sbM7385r.append(this.f23499c);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("encodingType=null,expectedBucketOwner=null,fetchOwner=null,");
        sb2.append("maxKeys=" + this.f23500d + ',');
        sb2.append("optionalObjectAttributes=null,");
        sb2.append("prefix=" + this.f23501e + ',');
        sb2.append("requestPayer=null,startAfter=null)");
        return sb2.toString();
    }
}
