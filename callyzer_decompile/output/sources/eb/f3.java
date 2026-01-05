package eb;

import a1.C0005d;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a */
    public final String f9313a;

    /* renamed from: b */
    public final String f9314b;

    /* renamed from: c */
    public final i1 f9315c;

    public f3(C0005d c0005d) {
        this.f9313a = (String) c0005d.f24b;
        this.f9314b = (String) c0005d.f25c;
        this.f9315c = (i1) c0005d.f26d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f3.class != obj.getClass()) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return AbstractC4154l.m8918a(this.f9313a, f3Var.f9313a) && AbstractC4154l.m8918a(this.f9314b, f3Var.f9314b) && AbstractC4154l.m8918a(this.f9315c, f3Var.f9315c);
    }

    public final int hashCode() {
        String str = this.f9313a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9314b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        i1 i1Var = this.f9315c;
        return iHashCode2 + (i1Var != null ? i1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateDeviceStatusRequest(accessToken=*** Sensitive Data Redacted ***,");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("deviceKey="), this.f9314b, ',', sb2, "deviceRememberedStatus=");
        sbM7385r.append(this.f9315c);
        sb2.append(sbM7385r.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
