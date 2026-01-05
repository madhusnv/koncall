package gz;

import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gz.a */
/* loaded from: classes3.dex */
public final class C2748a {

    /* renamed from: a */
    public final String f15292a;

    public C2748a(String str) {
        this.f15292a = m0.m7378k("uploaduser@", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2748a)) {
            return false;
        }
        String str = ((C2748a) obj).f15292a;
        String str2 = this.f15292a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f15292a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "[" + C2748a.class.getSimpleName() + "] " + ((Object) this.f15292a);
    }
}
