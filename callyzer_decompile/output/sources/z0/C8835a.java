package z0;

import c0.C0823p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z0.a */
/* loaded from: classes.dex */
public final class C8835a {

    /* renamed from: a */
    public final int f42538a;

    /* renamed from: b */
    public final C0823p f42539b;

    public C8835a(int i10, C0823p c0823p) {
        this.f42538a = i10;
        if (c0823p == null) {
            throw new NullPointerException("Null cameraIdentifier");
        }
        this.f42539b = c0823p;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8835a) {
            C8835a c8835a = (C8835a) obj;
            if (this.f42538a == c8835a.f42538a && this.f42539b.equals(c8835a.f42539b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f42538a ^ 1000003) * 1000003) ^ this.f42539b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.f42538a + ", cameraIdentifier=" + this.f42539b + "}";
    }
}
