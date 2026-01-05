package g0;

import d0.AbstractC1545b;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g0.d */
/* loaded from: classes.dex */
public final class C2414d implements InterfaceC2415e {

    /* renamed from: a */
    public final String f10905a;

    /* renamed from: b */
    public final AbstractC1545b f10906b;

    public C2414d(String requiredUseCases, AbstractC1545b featureRequiring) {
        AbstractC4154l.m8923f(requiredUseCases, "requiredUseCases");
        AbstractC4154l.m8923f(featureRequiring, "featureRequiring");
        this.f10905a = requiredUseCases;
        this.f10906b = featureRequiring;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2414d)) {
            return false;
        }
        C2414d c2414d = (C2414d) obj;
        return AbstractC4154l.m8918a(this.f10905a, c2414d.f10905a) && AbstractC4154l.m8918a(this.f10906b, c2414d.f10906b);
    }

    public final int hashCode() {
        return this.f10906b.hashCode() + (this.f10905a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.f10905a + ", featureRequiring=" + this.f10906b + ')';
    }
}
