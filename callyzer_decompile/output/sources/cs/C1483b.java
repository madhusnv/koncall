package cs;

import kotlin.jvm.internal.AbstractC4154l;
import og.hb;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.b */
/* loaded from: classes3.dex */
public final class C1483b extends hb {

    /* renamed from: a */
    public final String f7560a;

    /* renamed from: b */
    public final String f7561b;

    public C1483b(String countryCode, String number) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(number, "number");
        this.f7560a = countryCode;
        this.f7561b = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1483b)) {
            return false;
        }
        C1483b c1483b = (C1483b) obj;
        return AbstractC4154l.m8918a(this.f7560a, c1483b.f7560a) && AbstractC4154l.m8918a(this.f7561b, c1483b.f7561b);
    }

    public final int hashCode() {
        return this.f7561b.hashCode() + (this.f7560a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("OnCallPressed(countryCode=", this.f7560a, ", number=", this.f7561b, ")");
    }
}
