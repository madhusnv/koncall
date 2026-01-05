package eb;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a */
    public final C1978b f9458a;

    /* renamed from: b */
    public final String f9459b;

    /* renamed from: c */
    public final Map f9460c;

    /* renamed from: d */
    public final String f9461d;

    /* renamed from: e */
    public final String f9462e;

    /* renamed from: f */
    public final String f9463f;

    /* renamed from: g */
    public final l3 f9464g;

    /* renamed from: h */
    public final String f9465h;

    public t0(s0 s0Var) {
        this.f9458a = s0Var.f9439a;
        this.f9459b = s0Var.f9440b;
        this.f9460c = s0Var.f9441c;
        this.f9461d = s0Var.f9442d;
        this.f9462e = s0Var.f9443e;
        this.f9463f = s0Var.f9444f;
        this.f9464g = s0Var.f9445g;
        this.f9465h = s0Var.f9446h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return AbstractC4154l.m8918a(this.f9458a, t0Var.f9458a) && AbstractC4154l.m8918a(this.f9459b, t0Var.f9459b) && AbstractC4154l.m8918a(this.f9460c, t0Var.f9460c) && AbstractC4154l.m8918a(this.f9461d, t0Var.f9461d) && AbstractC4154l.m8918a(this.f9462e, t0Var.f9462e) && AbstractC4154l.m8918a(this.f9463f, t0Var.f9463f) && AbstractC4154l.m8918a(this.f9464g, t0Var.f9464g) && AbstractC4154l.m8918a(this.f9465h, t0Var.f9465h);
    }

    public final int hashCode() {
        C1978b c1978b = this.f9458a;
        int iHashCode = (c1978b != null ? c1978b.hashCode() : 0) * 31;
        String str = this.f9459b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f9460c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f9461d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9462e;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9463f;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        l3 l3Var = this.f9464g;
        int iHashCode7 = (iHashCode6 + (l3Var != null ? l3Var.hashCode() : 0)) * 31;
        String str5 = this.f9465h;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmForgotPasswordRequest(");
        sb2.append("analyticsMetadata=" + this.f9458a + ',');
        sb2.append("clientId=*** Sensitive Data Redacted ***,");
        sb2.append("clientMetadata=" + this.f9460c + ',');
        sb2.append("confirmationCode=" + this.f9461d + ',');
        sb2.append("password=*** Sensitive Data Redacted ***,secretHash=*** Sensitive Data Redacted ***,userContextData=*** Sensitive Data Redacted ***,username=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
