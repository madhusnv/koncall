package kn;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.f */
/* loaded from: classes3.dex */
public final class C4126f {

    /* renamed from: a */
    public final String f21075a;

    /* renamed from: b */
    public final int f21076b;

    public C4126f(String normalizedPhoneNumber, int i10) {
        AbstractC4154l.m8923f(normalizedPhoneNumber, "normalizedPhoneNumber");
        this.f21075a = normalizedPhoneNumber;
        this.f21076b = i10;
    }

    /* renamed from: a */
    public final String m8899a() {
        return this.f21075a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4126f)) {
            return false;
        }
        C4126f c4126f = (C4126f) obj;
        return AbstractC4154l.m8918a(this.f21075a, c4126f.f21075a) && this.f21076b == c4126f.f21076b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21076b) + (this.f21075a.hashCode() * 31);
    }

    public final String toString() {
        return "NormalizedPhoneNumber(normalizedPhoneNumber=" + this.f21075a + ", countryCode=" + this.f21076b + ")";
    }
}
