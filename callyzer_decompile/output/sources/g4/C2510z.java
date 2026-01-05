package g4;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.z */
/* loaded from: classes.dex */
public final class C2510z {

    /* renamed from: a */
    public final C2509y f13733a;

    /* renamed from: b */
    public final C2508x f13734b;

    public C2510z(C2509y c2509y, C2508x c2508x) {
        this.f13733a = c2509y;
        this.f13734b = c2508x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2510z)) {
            return false;
        }
        C2510z c2510z = (C2510z) obj;
        return AbstractC4154l.m8918a(this.f13734b, c2510z.f13734b) && AbstractC4154l.m8918a(this.f13733a, c2510z.f13733a);
    }

    public final int hashCode() {
        C2509y c2509y = this.f13733a;
        int iHashCode = (c2509y != null ? c2509y.hashCode() : 0) * 31;
        C2508x c2508x = this.f13734b;
        return iHashCode + (c2508x != null ? c2508x.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f13733a + ", paragraphSyle=" + this.f13734b + ')';
    }
}
