package cs;

import kotlin.jvm.internal.AbstractC4154l;
import og.hb;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cs.f */
/* loaded from: classes3.dex */
public final class C1487f extends hb {

    /* renamed from: a */
    public final String f7566a;

    /* renamed from: b */
    public final String f7567b;

    public C1487f(String countryCode, String number) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(number, "number");
        this.f7566a = countryCode;
        this.f7567b = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1487f)) {
            return false;
        }
        C1487f c1487f = (C1487f) obj;
        return AbstractC4154l.m8918a(this.f7566a, c1487f.f7566a) && AbstractC4154l.m8918a(this.f7567b, c1487f.f7567b);
    }

    public final int hashCode() {
        return this.f7567b.hashCode() + (this.f7566a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("OnWhatsAppPressed(countryCode=", this.f7566a, ", number=", this.f7567b, ")");
    }
}
