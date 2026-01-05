package et;

import cm.C0983a;
import kotlin.jvm.internal.AbstractC4154l;
import og.de;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: et.b */
/* loaded from: classes3.dex */
public final class C2130b extends de {

    /* renamed from: a */
    public final C0983a f9963a;

    public C2130b(C0983a countryData) {
        AbstractC4154l.m8923f(countryData, "countryData");
        this.f9963a = countryData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2130b) && AbstractC4154l.m8918a(this.f9963a, ((C2130b) obj).f9963a);
    }

    public final int hashCode() {
        return this.f9963a.hashCode();
    }

    public final String toString() {
        return "CountryCodeChange(countryData=" + this.f9963a + ")";
    }
}
