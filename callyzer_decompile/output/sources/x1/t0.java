package x1;

import ex.InterfaceC2139c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b */
    public static final t0 f39682b = new t0(63, null);

    /* renamed from: a */
    public final InterfaceC2139c f39683a;

    public t0(int i10, InterfaceC2139c interfaceC2139c) {
        this.f39683a = (i10 & 1) != 0 ? null : interfaceC2139c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            return this.f39683a == ((t0) obj).f39683a;
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC2139c interfaceC2139c = this.f39683a;
        return (interfaceC2139c != null ? interfaceC2139c.hashCode() : 0) * 28629151;
    }
}
