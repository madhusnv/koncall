package mb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    public final String f23265a;

    /* renamed from: b */
    public final String f23266b;

    /* renamed from: c */
    public final String f23267c;

    public k0(j0 j0Var) {
        this.f23265a = j0Var.f23258a;
        this.f23266b = j0Var.f23259b;
        this.f23267c = j0Var.f23260c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return AbstractC4154l.m8918a(this.f23265a, k0Var.f23265a) && AbstractC4154l.m8918a(this.f23266b, k0Var.f23266b) && AbstractC4154l.m8918a(this.f23267c, k0Var.f23267c);
    }

    public final int hashCode() {
        String str = this.f23265a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 1742810335;
        String str2 = this.f23266b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 961;
        String str3 = this.f23267c;
        return (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 129082719;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetObjectRequest(");
        sb2.append("bucket=" + this.f23265a + ',');
        sb2.append("checksumMode=null,expectedBucketOwner=null,ifMatch=null,ifModifiedSince=null,ifNoneMatch=null,ifUnmodifiedSince=null,");
        sb2.append("key=" + this.f23266b + ',');
        sb2.append("partNumber=null,");
        sb2.append("range=" + this.f23267c + ',');
        sb2.append("requestPayer=null,responseCacheControl=null,responseContentDisposition=null,responseContentEncoding=null,responseContentLanguage=null,responseContentType=null,responseExpires=null,sseCustomerAlgorithm=null,sseCustomerKey=*** Sensitive Data Redacted ***,sseCustomerKeyMd5=null,versionId=null)");
        return sb2.toString();
    }
}
