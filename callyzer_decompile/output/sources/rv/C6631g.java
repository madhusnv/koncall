package rv;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.g */
/* loaded from: classes3.dex */
public final class C6631g extends AbstractC6650z {

    /* renamed from: a */
    public final List f31832a;

    /* renamed from: b */
    public final String f31833b;

    public C6631g(List addDeviceRequest, String str) {
        AbstractC4154l.m8923f(addDeviceRequest, "addDeviceRequest");
        this.f31832a = addDeviceRequest;
        this.f31833b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6631g)) {
            return false;
        }
        C6631g c6631g = (C6631g) obj;
        return AbstractC4154l.m8918a(this.f31832a, c6631g.f31832a) && AbstractC4154l.m8918a(this.f31833b, c6631g.f31833b);
    }

    public final int hashCode() {
        return this.f31833b.hashCode() + (this.f31832a.hashCode() * 31);
    }

    public final String toString() {
        return "ConnectSIMWithApp(addDeviceRequest=" + this.f31832a + ", dcc=" + this.f31833b + ")";
    }
}
