package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a */
    public final String f9405a;

    /* renamed from: b */
    public final String f9406b;

    /* renamed from: c */
    public final String f9407c;

    /* renamed from: d */
    public final l1 f9408d;

    public p0(o0 o0Var) {
        this.f9405a = o0Var.f9390a;
        this.f9406b = o0Var.f9391b;
        this.f9407c = o0Var.f9392c;
        this.f9408d = o0Var.f9393d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0.class != obj.getClass()) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return AbstractC4154l.m8918a(this.f9405a, p0Var.f9405a) && AbstractC4154l.m8918a(this.f9406b, p0Var.f9406b) && AbstractC4154l.m8918a(this.f9407c, p0Var.f9407c) && AbstractC4154l.m8918a(this.f9408d, p0Var.f9408d);
    }

    public final int hashCode() {
        String str = this.f9405a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9406b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9407c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        l1 l1Var = this.f9408d;
        return iHashCode3 + (l1Var != null ? l1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmDeviceRequest(accessToken=*** Sensitive Data Redacted ***,");
        StringBuilder sbM7385r = i0.m0.m7385r(i0.m0.m7385r(new StringBuilder("deviceKey="), this.f9406b, ',', sb2, "deviceName="), this.f9407c, ',', sb2, "deviceSecretVerifierConfig=");
        sbM7385r.append(this.f9408d);
        sb2.append(sbM7385r.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
