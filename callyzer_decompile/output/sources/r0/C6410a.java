package r0;

import s0.C6698b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r0.a */
/* loaded from: classes.dex */
public final class C6410a {

    /* renamed from: a */
    public final C6698b f30919a;

    /* renamed from: b */
    public final C6698b f30920b;

    public C6410a(C6698b c6698b, C6698b c6698b2) {
        this.f30919a = c6698b;
        this.f30920b = c6698b2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6410a) {
            C6410a c6410a = (C6410a) obj;
            if (this.f30919a.equals(c6410a.f30919a) && this.f30920b.equals(c6410a.f30920b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30919a.hashCode() ^ 1000003) * 1000003) ^ this.f30920b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f30919a + ", secondaryOutConfig=" + this.f30920b + "}";
    }
}
