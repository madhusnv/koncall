package er;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.j */
/* loaded from: classes3.dex */
public final class C2110j extends AbstractC2111k {

    /* renamed from: a */
    public final String f9864a;

    /* renamed from: b */
    public final String f9865b;

    public C2110j(String countryCode, String number) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(number, "number");
        this.f9864a = countryCode;
        this.f9865b = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2110j)) {
            return false;
        }
        C2110j c2110j = (C2110j) obj;
        return AbstractC4154l.m8918a(this.f9864a, c2110j.f9864a) && AbstractC4154l.m8918a(this.f9865b, c2110j.f9865b);
    }

    public final int hashCode() {
        return this.f9865b.hashCode() + (this.f9864a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("WhatsAppMessage(countryCode=", this.f9864a, ", number=", this.f9865b, ")");
    }
}
