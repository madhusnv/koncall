package mb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p3 {

    /* renamed from: a */
    public final Boolean f23427a;

    /* renamed from: b */
    public final String f23428b;

    /* renamed from: c */
    public final String f23429c;

    /* renamed from: d */
    public final String f23430d;

    /* renamed from: e */
    public final String f23431e;

    /* renamed from: f */
    public final String f23432f;

    /* renamed from: g */
    public final String f23433g;

    /* renamed from: h */
    public final l2 f23434h;

    /* renamed from: i */
    public final w2 f23435i;

    /* renamed from: j */
    public final String f23436j;

    /* renamed from: k */
    public final String f23437k;

    /* renamed from: l */
    public final String f23438l;

    public p3(o3 o3Var) {
        this.f23427a = (Boolean) o3Var.f23372a;
        this.f23428b = (String) o3Var.f23373b;
        this.f23429c = (String) o3Var.f23374c;
        this.f23430d = (String) o3Var.f23375d;
        this.f23431e = (String) o3Var.f23376e;
        this.f23432f = (String) o3Var.f23377f;
        this.f23433g = (String) o3Var.f23378g;
        this.f23434h = (l2) o3Var.f23382k;
        this.f23435i = (w2) o3Var.f23383l;
        this.f23436j = (String) o3Var.f23379h;
        this.f23437k = (String) o3Var.f23380i;
        this.f23438l = (String) o3Var.f23381j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p3.class != obj.getClass()) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return AbstractC4154l.m8918a(this.f23427a, p3Var.f23427a) && AbstractC4154l.m8918a(this.f23428b, p3Var.f23428b) && AbstractC4154l.m8918a(this.f23429c, p3Var.f23429c) && AbstractC4154l.m8918a(this.f23430d, p3Var.f23430d) && AbstractC4154l.m8918a(this.f23431e, p3Var.f23431e) && AbstractC4154l.m8918a(this.f23432f, p3Var.f23432f) && AbstractC4154l.m8918a(this.f23433g, p3Var.f23433g) && AbstractC4154l.m8918a(this.f23434h, p3Var.f23434h) && AbstractC4154l.m8918a(this.f23435i, p3Var.f23435i) && AbstractC4154l.m8918a(this.f23436j, p3Var.f23436j) && AbstractC4154l.m8918a(this.f23437k, p3Var.f23437k) && AbstractC4154l.m8918a(this.f23438l, p3Var.f23438l);
    }

    public final int hashCode() {
        Boolean bool = this.f23427a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f23428b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23429c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23430d;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f23431e;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f23432f;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f23433g;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        l2 l2Var = this.f23434h;
        int iHashCode8 = (iHashCode7 + (l2Var != null ? l2Var.hashCode() : 0)) * 31;
        w2 w2Var = this.f23435i;
        int iHashCode9 = (iHashCode8 + (w2Var != null ? w2Var.hashCode() : 0)) * 31;
        String str7 = this.f23436j;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f23437k;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f23438l;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UploadPartResponse(");
        StringBuilder sbM7385r = i0.m0.m7385r(i0.m0.m7385r(i0.m0.m7385r(i0.m0.m7385r(i0.m0.m7385r(i0.m0.m7385r(i0.m0.m7384q(new StringBuilder("bucketKeyEnabled="), this.f23427a, ',', sb2, "checksumCrc32="), this.f23428b, ',', sb2, "checksumCrc32C="), this.f23429c, ',', sb2, "checksumCrc64Nvme="), this.f23430d, ',', sb2, "checksumSha1="), this.f23431e, ',', sb2, "checksumSha256="), this.f23432f, ',', sb2, "eTag="), this.f23433g, ',', sb2, "requestCharged=");
        sbM7385r.append(this.f23434h);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("serverSideEncryption=" + this.f23435i + ',');
        StringBuilder sbM7385r2 = i0.m0.m7385r(new StringBuilder("sseCustomerAlgorithm="), this.f23436j, ',', sb2, "sseCustomerKeyMd5=");
        sbM7385r2.append(this.f23437k);
        sbM7385r2.append(',');
        sb2.append(sbM7385r2.toString());
        sb2.append("ssekmsKeyId=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
