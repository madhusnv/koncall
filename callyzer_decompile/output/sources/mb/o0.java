package mb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a */
    public final String f23368a;

    /* renamed from: b */
    public final String f23369b;

    public o0(n0 n0Var) {
        this.f23368a = n0Var.f23358a;
        this.f23369b = n0Var.f23359b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return AbstractC4154l.m8918a(this.f23368a, o0Var.f23368a) && AbstractC4154l.m8918a(this.f23369b, o0Var.f23369b);
    }

    public final int hashCode() {
        String str = this.f23368a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 1742810335;
        String str2 = this.f23369b;
        return (iHashCode + (str2 != null ? str2.hashCode() : 0)) * (-505558625);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeadObjectRequest(");
        sb2.append("bucket=" + this.f23368a + ',');
        sb2.append("checksumMode=null,expectedBucketOwner=null,ifMatch=null,ifModifiedSince=null,ifNoneMatch=null,ifUnmodifiedSince=null,");
        sb2.append("key=" + this.f23369b + ',');
        sb2.append("partNumber=null,range=null,requestPayer=null,responseCacheControl=null,responseContentDisposition=null,responseContentEncoding=null,responseContentLanguage=null,responseContentType=null,responseExpires=null,sseCustomerAlgorithm=null,sseCustomerKey=*** Sensitive Data Redacted ***,sseCustomerKeyMd5=null,versionId=null)");
        return sb2.toString();
    }
}
