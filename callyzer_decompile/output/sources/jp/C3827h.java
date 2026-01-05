package jp;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jp.h */
/* loaded from: classes3.dex */
public final class C3827h extends AbstractC3828i {

    /* renamed from: a */
    public final String f19779a;

    /* renamed from: b */
    public final String f19780b;

    public C3827h(String countryCode, String number) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        AbstractC4154l.m8923f(number, "number");
        this.f19779a = countryCode;
        this.f19780b = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3827h)) {
            return false;
        }
        C3827h c3827h = (C3827h) obj;
        return AbstractC4154l.m8918a(this.f19779a, c3827h.f19779a) && AbstractC4154l.m8918a(this.f19780b, c3827h.f19780b);
    }

    public final int hashCode() {
        return this.f19780b.hashCode() + (this.f19779a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("WhatsAppMessage(countryCode=", this.f19779a, ", number=", this.f19780b, ")");
    }
}
