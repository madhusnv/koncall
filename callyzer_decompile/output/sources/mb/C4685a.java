package mb;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.a */
/* loaded from: classes.dex */
public final class C4685a {

    /* renamed from: a */
    public final String f23157a;

    /* renamed from: b */
    public final String f23158b;

    /* renamed from: c */
    public final String f23159c;

    public C4685a(eb.i0 i0Var) {
        this.f23157a = i0Var.f9333a;
        this.f23158b = i0Var.f9334b;
        this.f23159c = i0Var.f9335c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4685a.class != obj.getClass()) {
            return false;
        }
        C4685a c4685a = (C4685a) obj;
        return AbstractC4154l.m8918a(this.f23157a, c4685a.f23157a) && AbstractC4154l.m8918a(this.f23158b, c4685a.f23158b) && AbstractC4154l.m8918a(this.f23159c, c4685a.f23159c);
    }

    public final int hashCode() {
        String str = this.f23157a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 29791;
        String str2 = this.f23158b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 961;
        String str3 = this.f23159c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AbortMultipartUploadRequest(");
        sb2.append("bucket=" + this.f23157a + ',');
        sb2.append("expectedBucketOwner=null,ifMatchInitiatedTime=null,");
        sb2.append("key=" + this.f23158b + ',');
        sb2.append("requestPayer=null,");
        return AbstractC4801l.m9737k(new StringBuilder("uploadId="), this.f23159c, sb2, ")");
    }
}
