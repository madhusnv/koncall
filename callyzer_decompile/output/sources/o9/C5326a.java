package o9;

import eb.i0;
import i0.m0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o9.a */
/* loaded from: classes.dex */
public final class C5326a {

    /* renamed from: a */
    public final String f26214a;

    /* renamed from: b */
    public final String f26215b;

    /* renamed from: c */
    public final String f26216c;

    public C5326a(i0 i0Var) {
        this.f26214a = i0Var.f9333a;
        this.f26215b = i0Var.f9334b;
        this.f26216c = i0Var.f9335c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5326a.class != obj.getClass()) {
            return false;
        }
        C5326a c5326a = (C5326a) obj;
        return AbstractC4154l.m8918a(this.f26214a, c5326a.f26214a) && AbstractC4154l.m8918a(this.f26215b, c5326a.f26215b) && AbstractC4154l.m8918a(this.f26216c, c5326a.f26216c);
    }

    public final int hashCode() {
        String str = this.f26214a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26215b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26216c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetRoleCredentialsRequest(accessToken=*** Sensitive Data Redacted ***,");
        return AbstractC4801l.m9737k(m0.m7385r(new StringBuilder("accountId="), this.f26215b, ',', sb2, "roleName="), this.f26216c, sb2, ")");
    }
}
