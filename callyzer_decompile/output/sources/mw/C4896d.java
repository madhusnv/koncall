package mw;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mw.d */
/* loaded from: classes3.dex */
public final class C4896d implements InterfaceC4893a {

    /* renamed from: a */
    public final double f24423a;

    public final boolean equals(Object obj) {
        if (obj instanceof C4896d) {
            return Double.compare(this.f24423a, ((C4896d) obj).f24423a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f24423a);
    }

    public final String toString() {
        return String.valueOf(this.f24423a);
    }
}
