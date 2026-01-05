package eb;

import al.C0182j;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a */
    public final l0 f9520a;

    /* renamed from: b */
    public final String f9521b;

    /* renamed from: c */
    public final boolean f9522c;

    /* renamed from: d */
    public final String f9523d;

    public y2(C0182j c0182j) {
        this.f9520a = (l0) c0182j.f555b;
        this.f9521b = (String) c0182j.f556c;
        this.f9522c = c0182j.f554a;
        String str = (String) c0182j.f557d;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for userSub");
        }
        this.f9523d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y2.class != obj.getClass()) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return AbstractC4154l.m8918a(this.f9520a, y2Var.f9520a) && AbstractC4154l.m8918a(this.f9521b, y2Var.f9521b) && this.f9522c == y2Var.f9522c && AbstractC4154l.m8918a(this.f9523d, y2Var.f9523d);
    }

    public final int hashCode() {
        l0 l0Var = this.f9520a;
        int iHashCode = (l0Var != null ? l0Var.hashCode() : 0) * 31;
        String str = this.f9521b;
        return this.f9523d.hashCode() + AbstractC1452a.m4558e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f9522c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SignUpResponse(");
        sb2.append("codeDeliveryDetails=" + this.f9520a + ',');
        sb2.append("session=*** Sensitive Data Redacted ***,");
        sb2.append("userConfirmed=" + this.f9522c + ',');
        return AbstractC4801l.m9737k(new StringBuilder("userSub="), this.f9523d, sb2, ")");
    }
}
