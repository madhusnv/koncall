package aa;

import i0.m0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import p020v.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aa.a */
/* loaded from: classes.dex */
public final class C0074a {

    /* renamed from: a */
    public final Integer f269a;

    /* renamed from: b */
    public final String f270b;

    /* renamed from: c */
    public final ArrayList f271c;

    /* renamed from: d */
    public final String f272d;

    /* renamed from: e */
    public final String f273e;

    /* renamed from: f */
    public final ArrayList f274f;

    public C0074a(x0 x0Var) {
        this.f269a = (Integer) x0Var.f36754b;
        this.f270b = (String) x0Var.f36755c;
        this.f271c = (ArrayList) x0Var.f36756d;
        this.f272d = (String) x0Var.f36757e;
        this.f273e = (String) x0Var.f36758f;
        this.f274f = (ArrayList) x0Var.f36759g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0074a.class != obj.getClass()) {
            return false;
        }
        C0074a c0074a = (C0074a) obj;
        return AbstractC4154l.m8918a(this.f269a, c0074a.f269a) && AbstractC4154l.m8918a(this.f270b, c0074a.f270b) && AbstractC4154l.m8918a(this.f271c, c0074a.f271c) && AbstractC4154l.m8918a(this.f272d, c0074a.f272d) && AbstractC4154l.m8918a(this.f273e, c0074a.f273e) && AbstractC4154l.m8918a(this.f274f, c0074a.f274f);
    }

    public final int hashCode() {
        Integer num = this.f269a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        String str = this.f270b;
        int iHashCode = (iIntValue + (str != null ? str.hashCode() : 0)) * 961;
        ArrayList arrayList = this.f271c;
        int iHashCode2 = (iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 961;
        String str2 = this.f272d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f273e;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 29791;
        ArrayList arrayList2 = this.f274f;
        return (iHashCode4 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssumeRoleRequest(");
        sb2.append("durationSeconds=" + this.f269a + ',');
        sb2.append("externalId=" + this.f270b + ',');
        sb2.append("policy=null,");
        sb2.append("policyArns=" + this.f271c + ',');
        sb2.append("providedContexts=null,");
        StringBuilder sbM7385r = m0.m7385r(new StringBuilder("roleArn="), this.f272d, ',', sb2, "roleSessionName=");
        sbM7385r.append(this.f273e);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("serialNumber=null,sourceIdentity=null,");
        sb2.append("tags=" + this.f274f + ',');
        sb2.append("tokenCode=null,transitiveTagKeys=null)");
        return sb2.toString();
    }
}
