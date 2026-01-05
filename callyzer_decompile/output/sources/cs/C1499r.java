package cs;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.r */
/* loaded from: classes3.dex */
public final class C1499r extends AbstractC1500s {

    /* renamed from: a */
    public final String f7586a;

    /* renamed from: b */
    public final String f7587b;

    public C1499r(String countryCode, String number) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(number, "number");
        this.f7586a = countryCode;
        this.f7587b = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1499r)) {
            return false;
        }
        C1499r c1499r = (C1499r) obj;
        return AbstractC4154l.m8918a(this.f7586a, c1499r.f7586a) && AbstractC4154l.m8918a(this.f7587b, c1499r.f7587b);
    }

    public final int hashCode() {
        return this.f7587b.hashCode() + (this.f7586a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("WhatsAppMessage(countryCode=", this.f7586a, ", number=", this.f7587b, ")");
    }
}
