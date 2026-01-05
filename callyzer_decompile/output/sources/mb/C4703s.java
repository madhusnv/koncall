package mb;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.s */
/* loaded from: classes.dex */
public final class C4703s {

    /* renamed from: a */
    public final String f23447a;

    /* renamed from: b */
    public final String f23448b;

    /* renamed from: c */
    public final C4707w f23449c;

    /* renamed from: d */
    public final String f23450d;

    public C4703s(C8090p c8090p) {
        this.f23447a = (String) c8090p.f38723a;
        this.f23448b = (String) c8090p.f38724b;
        this.f23449c = (C4707w) c8090p.f38725c;
        this.f23450d = (String) c8090p.f38726d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4703s.class != obj.getClass()) {
            return false;
        }
        C4703s c4703s = (C4703s) obj;
        return AbstractC4154l.m8918a(this.f23447a, c4703s.f23447a) && AbstractC4154l.m8918a(this.f23448b, c4703s.f23448b) && AbstractC4154l.m8918a(this.f23449c, c4703s.f23449c) && AbstractC4154l.m8918a(this.f23450d, c4703s.f23450d);
    }

    public final int hashCode() {
        String str = this.f23447a;
        int iHashCode = (str != null ? str.hashCode() : 0) * (-1796951359);
        String str2 = this.f23448b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 961;
        C4707w c4707w = this.f23449c;
        int iHashCode3 = (iHashCode2 + (c4707w != null ? c4707w.hashCode() : 0)) * 28629151;
        String str3 = this.f23450d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompleteMultipartUploadRequest(");
        sb2.append("bucket=" + this.f23447a + ',');
        sb2.append("checksumCrc32=null,checksumCrc32C=null,checksumCrc64Nvme=null,checksumSha1=null,checksumSha256=null,checksumType=null,expectedBucketOwner=null,ifMatch=null,ifNoneMatch=null,");
        sb2.append("key=" + this.f23448b + ',');
        sb2.append("mpuObjectSize=null,");
        sb2.append("multipartUpload=" + this.f23449c + ',');
        sb2.append("requestPayer=null,sseCustomerAlgorithm=null,sseCustomerKey=*** Sensitive Data Redacted ***,sseCustomerKeyMd5=null,");
        return AbstractC4801l.m9737k(new StringBuilder("uploadId="), this.f23450d, sb2, ")");
    }
}
