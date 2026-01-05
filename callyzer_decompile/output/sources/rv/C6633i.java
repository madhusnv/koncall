package rv;

import cm.C0983a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.i */
/* loaded from: classes3.dex */
public final class C6633i extends AbstractC6650z {

    /* renamed from: a */
    public final C0983a f31840a;

    public C6633i(C0983a countryCode) {
        AbstractC4154l.m8923f(countryCode, "countryCode");
        this.f31840a = countryCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6633i) && AbstractC4154l.m8918a(this.f31840a, ((C6633i) obj).f31840a);
    }

    public final int hashCode() {
        return this.f31840a.hashCode();
    }

    public final String toString() {
        return "CountryCodeChange(countryCode=" + this.f31840a + ")";
    }
}
