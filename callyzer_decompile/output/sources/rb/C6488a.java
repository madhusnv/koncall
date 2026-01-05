package rb;

import ec.InterfaceC2004b;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rb.a */
/* loaded from: classes.dex */
public final class C6488a {

    /* renamed from: a */
    public final String f31165a;

    /* renamed from: b */
    public final InterfaceC2004b f31166b;

    public C6488a(String schemeId, InterfaceC2004b interfaceC2004b) {
        AbstractC4154l.m8923f(schemeId, "schemeId");
        this.f31165a = schemeId;
        this.f31166b = interfaceC2004b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6488a)) {
            return false;
        }
        C6488a c6488a = (C6488a) obj;
        return AbstractC4154l.m8918a(this.f31165a, c6488a.f31165a) && AbstractC4154l.m8918a(this.f31166b, c6488a.f31166b);
    }

    public final int hashCode() {
        return this.f31166b.hashCode() + (this.f31165a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthOptionImpl(schemeId=" + ((Object) C6489b.m12497a(this.f31165a)) + ", attributes=" + this.f31166b + ')';
    }
}
