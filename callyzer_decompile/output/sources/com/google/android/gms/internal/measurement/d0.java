package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: b */
    public static final /* synthetic */ int f6105b = 0;

    /* renamed from: a */
    public final int f6106a;

    public d0(int i10) {
        this.f6106a = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        int i10 = ((d0) obj).f6106a;
        int i11 = this.f6106a;
        if (i11 != 0) {
            return i11 == i10;
        }
        throw null;
    }

    public final int hashCode() {
        int i10 = this.f6106a;
        if (i10 != 0) {
            return ((i10 ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f6106a;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        StringBuilder sb2 = new StringBuilder("READ_AND_WRITE".length() + str.length() + "".length() + 73 + 91 + 1);
        p020v.a1.m14319B(sb2, "FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", "READ_AND_WRITE");
        sb2.append("}");
        return sb2.toString();
    }
}
