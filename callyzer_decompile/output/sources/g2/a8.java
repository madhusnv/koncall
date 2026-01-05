package g2;

import w4.EnumC7932x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a8 {

    /* renamed from: a */
    public final EnumC7932x f11176a = EnumC7932x.Inherit;

    /* renamed from: b */
    public final boolean f11177b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a8) {
            return this.f11176a == ((a8) obj).f11176a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11177b) + (this.f11176a.hashCode() * 31);
    }
}
