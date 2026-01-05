package er;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.e */
/* loaded from: classes3.dex */
public final class C2105e extends AbstractC2111k {

    /* renamed from: a */
    public final String f9857a;

    /* renamed from: b */
    public final String f9858b;

    public C2105e(String countryCode, String phoneNumber) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
        this.f9857a = countryCode;
        this.f9858b = phoneNumber;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2105e)) {
            return false;
        }
        C2105e c2105e = (C2105e) obj;
        return AbstractC4154l.m8918a(this.f9857a, c2105e.f9857a) && AbstractC4154l.m8918a(this.f9858b, c2105e.f9858b);
    }

    public final int hashCode() {
        return this.f9858b.hashCode() + (this.f9857a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("PlaceCall(countryCode=", this.f9857a, ", phoneNumber=", this.f9858b, ")");
    }
}
