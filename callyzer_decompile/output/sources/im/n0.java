package im;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a */
    public final String f17568a;

    /* renamed from: b */
    public final String f17569b;

    public n0(String leadId, String dialedNumber) {
        AbstractC4154l.m8923f(leadId, "leadId");
        AbstractC4154l.m8923f(dialedNumber, "dialedNumber");
        this.f17568a = leadId;
        this.f17569b = dialedNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return AbstractC4154l.m8918a(this.f17568a, n0Var.f17568a) && AbstractC4154l.m8918a(this.f17569b, n0Var.f17569b);
    }

    public final int hashCode() {
        return this.f17569b.hashCode() + AbstractC0030c.m113d(Boolean.hashCode(true) * 31, 31, this.f17568a);
    }

    public final String toString() {
        return p020v.a1.m14333m("LeadPlaceCallData(isPlaceCall=true, leadId=", this.f17568a, ", dialedNumber=", this.f17569b, ")");
    }
}
