package mb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a */
    public final String f23194a;

    public b0(eb.g2 g2Var) {
        this.f23194a = g2Var.f9320a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b0.class == obj.getClass() && AbstractC4154l.m8918a(this.f23194a, ((b0) obj).f23194a);
    }

    public final int hashCode() {
        String str = this.f23194a;
        return (str != null ? str.hashCode() : 0) * 28629151;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateSessionRequest(");
        sb2.append("bucket=" + this.f23194a + ',');
        sb2.append("bucketKeyEnabled=null,serverSideEncryption=null,sessionMode=null,ssekmsEncryptionContext=*** Sensitive Data Redacted ***,ssekmsKeyId=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
