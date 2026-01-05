package yr;

import cm.C0983a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.a */
/* loaded from: classes3.dex */
public final class C8742a extends AbstractC8761t {

    /* renamed from: a */
    public final C0983a f42351a;

    public C8742a(C0983a countryData) {
        AbstractC4154l.m8923f(countryData, "countryData");
        this.f42351a = countryData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8742a) && AbstractC4154l.m8918a(this.f42351a, ((C8742a) obj).f42351a);
    }

    public final int hashCode() {
        return this.f42351a.hashCode();
    }

    public final String toString() {
        return "AlterNativeCountryCodeChange(countryData=" + this.f42351a + ")";
    }
}
