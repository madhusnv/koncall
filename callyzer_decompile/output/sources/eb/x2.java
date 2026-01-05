package eb;

import io.C3328c;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a */
    public final C1978b f9508a;

    /* renamed from: b */
    public final String f9509b;

    /* renamed from: c */
    public final Map f9510c;

    /* renamed from: d */
    public final String f9511d;

    /* renamed from: e */
    public final String f9512e;

    /* renamed from: f */
    public final ArrayList f9513f;

    /* renamed from: g */
    public final l3 f9514g;

    /* renamed from: h */
    public final String f9515h;

    /* renamed from: i */
    public final ArrayList f9516i;

    public x2(C3328c c3328c) {
        this.f9508a = (C1978b) c3328c.f17610b;
        this.f9509b = (String) c3328c.f17609a;
        this.f9510c = (Map) c3328c.f17611c;
        this.f9511d = (String) c3328c.f17612d;
        this.f9512e = (String) c3328c.f17613e;
        this.f9513f = (ArrayList) c3328c.f17614f;
        this.f9514g = (l3) c3328c.f17615g;
        this.f9515h = (String) c3328c.f17616h;
        this.f9516i = (ArrayList) c3328c.f17617i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x2.class != obj.getClass()) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return AbstractC4154l.m8918a(this.f9508a, x2Var.f9508a) && AbstractC4154l.m8918a(this.f9509b, x2Var.f9509b) && AbstractC4154l.m8918a(this.f9510c, x2Var.f9510c) && AbstractC4154l.m8918a(this.f9511d, x2Var.f9511d) && AbstractC4154l.m8918a(this.f9512e, x2Var.f9512e) && AbstractC4154l.m8918a(this.f9513f, x2Var.f9513f) && AbstractC4154l.m8918a(this.f9514g, x2Var.f9514g) && AbstractC4154l.m8918a(this.f9515h, x2Var.f9515h) && AbstractC4154l.m8918a(this.f9516i, x2Var.f9516i);
    }

    public final int hashCode() {
        C1978b c1978b = this.f9508a;
        int iHashCode = (c1978b != null ? c1978b.hashCode() : 0) * 31;
        String str = this.f9509b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f9510c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f9511d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9512e;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ArrayList arrayList = this.f9513f;
        int iHashCode6 = (iHashCode5 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        l3 l3Var = this.f9514g;
        int iHashCode7 = (iHashCode6 + (l3Var != null ? l3Var.hashCode() : 0)) * 31;
        String str4 = this.f9515h;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ArrayList arrayList2 = this.f9516i;
        return iHashCode8 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SignUpRequest(");
        sb2.append("analyticsMetadata=" + this.f9508a + ',');
        sb2.append("clientId=*** Sensitive Data Redacted ***,");
        sb2.append("clientMetadata=" + this.f9510c + ',');
        sb2.append("password=*** Sensitive Data Redacted ***,secretHash=*** Sensitive Data Redacted ***,");
        sb2.append("userAttributes=" + this.f9513f + ',');
        sb2.append("userContextData=*** Sensitive Data Redacted ***,username=*** Sensitive Data Redacted ***,");
        sb2.append("validationData=" + this.f9516i);
        sb2.append(")");
        return sb2.toString();
    }
}
