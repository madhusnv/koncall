package aa;

import a9.C0073l;
import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aa.c */
/* loaded from: classes.dex */
public final class C0076c {

    /* renamed from: a */
    public final Integer f279a;

    /* renamed from: b */
    public final List f280b;

    /* renamed from: c */
    public final String f281c;

    /* renamed from: d */
    public final String f282d;

    /* renamed from: e */
    public final String f283e;

    public C0076c(C0073l c0073l) {
        this.f279a = (Integer) c0073l.f264a;
        this.f280b = (List) c0073l.f265b;
        this.f281c = (String) c0073l.f266c;
        this.f282d = (String) c0073l.f267d;
        this.f283e = (String) c0073l.f268e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0076c.class != obj.getClass()) {
            return false;
        }
        C0076c c0076c = (C0076c) obj;
        return AbstractC4154l.m8918a(this.f279a, c0076c.f279a) && AbstractC4154l.m8918a(this.f280b, c0076c.f280b) && AbstractC4154l.m8918a(this.f281c, c0076c.f281c) && AbstractC4154l.m8918a(this.f282d, c0076c.f282d) && AbstractC4154l.m8918a(this.f283e, c0076c.f283e);
    }

    public final int hashCode() {
        Integer num = this.f279a;
        int iIntValue = (num != null ? num.intValue() : 0) * 961;
        List list = this.f280b;
        int iHashCode = (iIntValue + (list != null ? list.hashCode() : 0)) * 961;
        String str = this.f281c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f282d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f283e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssumeRoleWithWebIdentityRequest(");
        sb2.append("durationSeconds=" + this.f279a + ',');
        sb2.append("policy=null,");
        sb2.append("policyArns=" + this.f280b + ',');
        sb2.append("providerId=null,");
        StringBuilder sbM7385r = m0.m7385r(new StringBuilder("roleArn="), this.f281c, ',', sb2, "roleSessionName=");
        sbM7385r.append(this.f282d);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("webIdentityToken=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
