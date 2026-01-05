package mm;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.j */
/* loaded from: classes3.dex */
public final class C4799j {

    /* renamed from: a */
    public final String f23881a;

    /* renamed from: b */
    public final String f23882b;

    /* renamed from: c */
    public final String f23883c;

    /* renamed from: d */
    public final String f23884d;

    public C4799j(String leadId, String number, String simNumber, String leadName) {
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(number, "number");
        AbstractC4154l.m8923f(simNumber, "simNumber");
        AbstractC4154l.m8923f(leadName, "leadName");
        this.f23881a = leadId;
        this.f23882b = number;
        this.f23883c = simNumber;
        this.f23884d = leadName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4799j)) {
            return false;
        }
        C4799j c4799j = (C4799j) obj;
        return AbstractC4154l.m8918a(this.f23881a, c4799j.f23881a) && AbstractC4154l.m8918a(this.f23882b, c4799j.f23882b) && AbstractC4154l.m8918a(this.f23883c, c4799j.f23883c) && AbstractC4154l.m8918a(this.f23884d, c4799j.f23884d);
    }

    public final int hashCode() {
        return this.f23884d.hashCode() + AbstractC0030c.m113d(AbstractC0030c.m113d(AbstractC0030c.m113d(Boolean.hashCode(true) * 31, 31, this.f23881a), 31, this.f23882b), 31, this.f23883c);
    }

    public final String toString() {
        return AbstractC0030c.m124o(AbstractC0030c.m127r("LeadNumberDetails(isLead=true, leadId=", this.f23881a, ", number=", this.f23882b, ", simNumber="), this.f23883c, ", leadName=", this.f23884d, ")");
    }
}
