package mb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    public final String f23230a;

    /* renamed from: b */
    public final String f23231b;

    public e0(d0 d0Var) {
        this.f23230a = d0Var.f23224a;
        this.f23231b = d0Var.f23225b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return AbstractC4154l.m8918a(this.f23230a, e0Var.f23230a) && AbstractC4154l.m8918a(this.f23231b, e0Var.f23231b);
    }

    public final int hashCode() {
        String str = this.f23230a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 887503681;
        String str2 = this.f23231b;
        return (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteObjectRequest(");
        sb2.append("bucket=" + this.f23230a + ',');
        sb2.append("bypassGovernanceRetention=null,expectedBucketOwner=null,ifMatch=null,ifMatchLastModifiedTime=null,ifMatchSize=null,");
        sb2.append("key=" + this.f23231b + ',');
        sb2.append("mfa=null,requestPayer=null,versionId=null)");
        return sb2.toString();
    }
}
