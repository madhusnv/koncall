package yr;

import cm.C0983a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.k */
/* loaded from: classes3.dex */
public final class C8752k extends AbstractC8761t {

    /* renamed from: a */
    public final C0983a f42371a;

    public C8752k(C0983a countryData) {
        AbstractC4154l.m8923f(countryData, "countryData");
        this.f42371a = countryData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8752k) && AbstractC4154l.m8918a(this.f42371a, ((C8752k) obj).f42371a);
    }

    public final int hashCode() {
        return this.f42371a.hashCode();
    }

    public final String toString() {
        return "CountryCodeChange(countryData=" + this.f42371a + ")";
    }
}
