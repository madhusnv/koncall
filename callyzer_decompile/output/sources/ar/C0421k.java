package ar;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ar.k */
/* loaded from: classes3.dex */
public final class C0421k extends AbstractC0427q {

    /* renamed from: a */
    public final String f3140a;

    /* renamed from: b */
    public final String f3141b;

    public C0421k(String str, String str2) {
        this.f3140a = str;
        this.f3141b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0421k)) {
            return false;
        }
        C0421k c0421k = (C0421k) obj;
        return AbstractC4154l.m8918a(this.f3140a, c0421k.f3140a) && AbstractC4154l.m8918a(this.f3141b, c0421k.f3141b);
    }

    public final int hashCode() {
        return this.f3141b.hashCode() + (this.f3140a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("PlaceCall(countryCode=", this.f3140a, ", phoneNumber=", this.f3141b, ")");
    }
}
