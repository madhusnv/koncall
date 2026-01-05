package mb;

import a9.C0073l;
import hc.C2888k;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a */
    public final C2888k f23362a;

    /* renamed from: b */
    public final String f23363b;

    /* renamed from: c */
    public final String f23364c;

    /* renamed from: d */
    public final Integer f23365d;

    /* renamed from: e */
    public final String f23366e;

    public n3(C0073l c0073l) {
        this.f23362a = (C2888k) c0073l.f264a;
        this.f23363b = (String) c0073l.f265b;
        this.f23364c = (String) c0073l.f266c;
        this.f23365d = (Integer) c0073l.f267d;
        this.f23366e = (String) c0073l.f268e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return AbstractC4154l.m8918a(this.f23362a, n3Var.f23362a) && AbstractC4154l.m8918a(this.f23363b, n3Var.f23363b) && AbstractC4154l.m8918a(this.f23364c, n3Var.f23364c) && AbstractC4154l.m8918a(this.f23365d, n3Var.f23365d) && AbstractC4154l.m8918a(this.f23366e, n3Var.f23366e);
    }

    public final int hashCode() {
        C2888k c2888k = this.f23362a;
        int iHashCode = (c2888k != null ? c2888k.hashCode() : 0) * 31;
        String str = this.f23363b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * (-1796951359);
        String str2 = this.f23364c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f23365d;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 28629151;
        String str3 = this.f23366e;
        return iIntValue + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UploadPartRequest(");
        sb2.append("body=" + this.f23362a + ',');
        sb2.append("bucket=" + this.f23363b + ',');
        sb2.append("checksumAlgorithm=null,checksumCrc32=null,checksumCrc32C=null,checksumCrc64Nvme=null,checksumSha1=null,checksumSha256=null,contentLength=null,contentMd5=null,expectedBucketOwner=null,");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("key="), this.f23364c, ',', sb2, "partNumber=");
        sbM7385r.append(this.f23365d);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("requestPayer=null,sseCustomerAlgorithm=null,sseCustomerKey=*** Sensitive Data Redacted ***,sseCustomerKeyMd5=null,");
        return AbstractC4801l.m9737k(new StringBuilder("uploadId="), this.f23366e, sb2, ")");
    }
}
