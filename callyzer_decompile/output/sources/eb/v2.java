package eb;

import kotlin.jvm.internal.AbstractC4154l;
import wj.C8090p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a */
    public final String f9492a;

    /* renamed from: b */
    public final o1 f9493b;

    /* renamed from: c */
    public final a3 f9494c;

    /* renamed from: d */
    public final c3 f9495d;

    public v2(C8090p c8090p) {
        this.f9492a = (String) c8090p.f38723a;
        this.f9493b = (o1) c8090p.f38724b;
        this.f9494c = (a3) c8090p.f38725c;
        this.f9495d = (c3) c8090p.f38726d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v2.class != obj.getClass()) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return AbstractC4154l.m8918a(this.f9492a, v2Var.f9492a) && AbstractC4154l.m8918a(this.f9493b, v2Var.f9493b) && AbstractC4154l.m8918a(this.f9494c, v2Var.f9494c) && AbstractC4154l.m8918a(this.f9495d, v2Var.f9495d);
    }

    public final int hashCode() {
        String str = this.f9492a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        o1 o1Var = this.f9493b;
        int iHashCode2 = (iHashCode + (o1Var != null ? o1Var.hashCode() : 0)) * 31;
        a3 a3Var = this.f9494c;
        int iHashCode3 = (iHashCode2 + (a3Var != null ? a3Var.hashCode() : 0)) * 31;
        c3 c3Var = this.f9495d;
        return iHashCode3 + (c3Var != null ? c3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetUserMfaPreferenceRequest(accessToken=*** Sensitive Data Redacted ***,");
        sb2.append("emailMfaSettings=" + this.f9493b + ',');
        sb2.append("smsMfaSettings=" + this.f9494c + ',');
        StringBuilder sb3 = new StringBuilder("softwareTokenMfaSettings=");
        sb3.append(this.f9495d);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
