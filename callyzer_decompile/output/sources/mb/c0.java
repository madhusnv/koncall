package mb;

import a9.C0073l;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a */
    public final Boolean f23215a;

    /* renamed from: b */
    public final y2 f23216b;

    /* renamed from: c */
    public final w2 f23217c;

    /* renamed from: d */
    public final String f23218d;

    /* renamed from: e */
    public final String f23219e;

    public c0(C0073l c0073l) {
        this.f23215a = (Boolean) c0073l.f264a;
        this.f23216b = (y2) c0073l.f265b;
        this.f23217c = (w2) c0073l.f266c;
        this.f23218d = (String) c0073l.f267d;
        this.f23219e = (String) c0073l.f268e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return AbstractC4154l.m8918a(this.f23215a, c0Var.f23215a) && AbstractC4154l.m8918a(this.f23216b, c0Var.f23216b) && AbstractC4154l.m8918a(this.f23217c, c0Var.f23217c) && AbstractC4154l.m8918a(this.f23218d, c0Var.f23218d) && AbstractC4154l.m8918a(this.f23219e, c0Var.f23219e);
    }

    public final int hashCode() {
        Boolean bool = this.f23215a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        y2 y2Var = this.f23216b;
        int iHashCode2 = (iHashCode + (y2Var != null ? y2Var.hashCode() : 0)) * 31;
        w2 w2Var = this.f23217c;
        int iHashCode3 = (iHashCode2 + (w2Var != null ? w2Var.hashCode() : 0)) * 31;
        String str = this.f23218d;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23219e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateSessionResponse(");
        StringBuilder sbM7384q = i0.m0.m7384q(new StringBuilder("bucketKeyEnabled="), this.f23215a, ',', sb2, "credentials=");
        sbM7384q.append(this.f23216b);
        sbM7384q.append(',');
        sb2.append(sbM7384q.toString());
        sb2.append("serverSideEncryption=" + this.f23217c + ',');
        sb2.append("ssekmsEncryptionContext=*** Sensitive Data Redacted ***,ssekmsKeyId=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
