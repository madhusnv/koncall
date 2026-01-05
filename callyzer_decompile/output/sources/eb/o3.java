package eb;

import kotlin.jvm.internal.AbstractC4154l;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a */
    public final String f9397a;

    /* renamed from: b */
    public final s3 f9398b;

    public o3(C7105p c7105p) {
        this.f9397a = (String) c7105p.f34290b;
        this.f9398b = (s3) c7105p.f34291c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o3.class != obj.getClass()) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return AbstractC4154l.m8918a(this.f9397a, o3Var.f9397a) && AbstractC4154l.m8918a(this.f9398b, o3Var.f9398b);
    }

    public final int hashCode() {
        String str = this.f9397a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        s3 s3Var = this.f9398b;
        return iHashCode + (s3Var != null ? s3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerifySoftwareTokenResponse(session=*** Sensitive Data Redacted ***,");
        sb2.append("status=" + this.f9398b);
        sb2.append(")");
        return sb2.toString();
    }
}
