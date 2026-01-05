package ge;

import he.EnumC2913d;
import he.EnumC2915f;
import he.InterfaceC2917h;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.d */
/* loaded from: classes.dex */
public final class C2572d {

    /* renamed from: a */
    public final InterfaceC2917h f13994a;

    /* renamed from: b */
    public final EnumC2915f f13995b;

    /* renamed from: c */
    public final EnumC2913d f13996c;

    public C2572d(InterfaceC2917h interfaceC2917h, EnumC2915f enumC2915f, EnumC2913d enumC2913d) {
        this.f13994a = interfaceC2917h;
        this.f13995b = enumC2915f;
        this.f13996c = enumC2913d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2572d)) {
            return false;
        }
        C2572d c2572d = (C2572d) obj;
        return AbstractC4154l.m8918a(this.f13994a, c2572d.f13994a) && this.f13995b == c2572d.f13995b && this.f13996c == c2572d.f13996c;
    }

    public final int hashCode() {
        InterfaceC2917h interfaceC2917h = this.f13994a;
        int iHashCode = (interfaceC2917h != null ? interfaceC2917h.hashCode() : 0) * 31;
        EnumC2915f enumC2915f = this.f13995b;
        int iHashCode2 = (iHashCode + (enumC2915f != null ? enumC2915f.hashCode() : 0)) * 887503681;
        EnumC2913d enumC2913d = this.f13996c;
        return (iHashCode2 + (enumC2913d != null ? enumC2913d.hashCode() : 0)) * 887503681;
    }
}
