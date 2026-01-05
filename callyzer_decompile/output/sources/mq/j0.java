package mq;

import a2.AbstractC0030c;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a */
    public final String f24293a;

    /* renamed from: b */
    public final String f24294b;

    /* renamed from: c */
    public final int f24295c;

    /* renamed from: d */
    public final String f24296d;

    public j0(String simNumber, String leadNumber, int i10, String leadNamePrefilled) {
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(leadNumber, "leadNumber");
        AbstractC4154l.m8923f(leadNamePrefilled, "leadNamePrefilled");
        this.f24293a = simNumber;
        this.f24294b = leadNumber;
        this.f24295c = i10;
        this.f24296d = leadNamePrefilled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return AbstractC4154l.m8918a(this.f24293a, j0Var.f24293a) && AbstractC4154l.m8918a(this.f24294b, j0Var.f24294b) && this.f24295c == j0Var.f24295c && AbstractC4154l.m8918a(this.f24296d, j0Var.f24296d);
    }

    public final int hashCode() {
        return this.f24296d.hashCode() + AbstractC1452a.m4556c(this.f24295c, AbstractC0030c.m113d(this.f24293a.hashCode() * 31, 31, this.f24294b), 31);
    }

    public final String toString() {
        StringBuilder sbM127r = AbstractC0030c.m127r("AddLead(simNumber=", this.f24293a, ", leadNumber=", this.f24294b, ", leadCountryCode=");
        sbM127r.append(this.f24295c);
        sbM127r.append(", leadNamePrefilled=");
        sbM127r.append(this.f24296d);
        sbM127r.append(")");
        return sbM127r.toString();
    }
}
