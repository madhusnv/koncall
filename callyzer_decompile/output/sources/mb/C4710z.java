package mb;

import a9.C0073l;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.z */
/* loaded from: classes.dex */
public final class C4710z {

    /* renamed from: a */
    public final a1 f23573a;

    /* renamed from: b */
    public final String f23574b;

    /* renamed from: c */
    public final String f23575c;

    /* renamed from: d */
    public final Map f23576d;

    /* renamed from: e */
    public final String f23577e;

    public C4710z(C0073l c0073l) {
        this.f23573a = (a1) c0073l.f264a;
        this.f23574b = (String) c0073l.f265b;
        this.f23575c = (String) c0073l.f266c;
        this.f23576d = (Map) c0073l.f267d;
        this.f23577e = (String) c0073l.f268e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4710z.class != obj.getClass()) {
            return false;
        }
        C4710z c4710z = (C4710z) obj;
        return AbstractC4154l.m8918a(this.f23573a, c4710z.f23573a) && AbstractC4154l.m8918a(this.f23574b, c4710z.f23574b) && AbstractC4154l.m8918a(this.f23575c, c4710z.f23575c) && AbstractC4154l.m8918a(this.f23576d, c4710z.f23576d) && AbstractC4154l.m8918a(this.f23577e, c4710z.f23577e);
    }

    public final int hashCode() {
        a1 a1Var = this.f23573a;
        int iHashCode = (a1Var != null ? a1Var.hashCode() : 0) * 31;
        String str = this.f23574b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * (-510534177);
        String str2 = this.f23575c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map map = this.f23576d;
        int iHashCode4 = (iHashCode3 + (map != null ? map.hashCode() : 0)) * (-293403007);
        String str3 = this.f23577e;
        return (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateMultipartUploadRequest(");
        sb2.append("acl=" + this.f23573a + ',');
        sb2.append("bucket=" + this.f23574b + ',');
        sb2.append("bucketKeyEnabled=null,cacheControl=null,checksumAlgorithm=null,checksumType=null,contentDisposition=null,contentEncoding=null,contentLanguage=null,contentType=null,expectedBucketOwner=null,expires=null,grantFullControl=null,grantRead=null,grantReadAcp=null,grantWriteAcp=null,");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("key="), this.f23575c, ',', sb2, "metadata=");
        sbM7385r.append(this.f23576d);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("objectLockLegalHoldStatus=null,objectLockMode=null,objectLockRetainUntilDate=null,requestPayer=null,serverSideEncryption=null,sseCustomerAlgorithm=null,sseCustomerKey=*** Sensitive Data Redacted ***,sseCustomerKeyMd5=null,ssekmsEncryptionContext=*** Sensitive Data Redacted ***,ssekmsKeyId=*** Sensitive Data Redacted ***,storageClass=null,");
        sb2.append("tagging=" + this.f23577e + ',');
        sb2.append("websiteRedirectLocation=null)");
        return sb2.toString();
    }
}
