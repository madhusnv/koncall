package b6;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b6.b */
/* loaded from: classes.dex */
public final class C0601b {

    /* renamed from: a */
    public final Object f3985a;

    /* renamed from: b */
    public final Object f3986b;

    public C0601b(Object obj, Object obj2) {
        this.f3985a = obj;
        this.f3986b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0601b)) {
            return false;
        }
        C0601b c0601b = (C0601b) obj;
        return Objects.equals(c0601b.f3985a, this.f3985a) && Objects.equals(c0601b.f3986b, this.f3986b);
    }

    public final int hashCode() {
        Object obj = this.f3985a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3986b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f3985a + " " + this.f3986b + "}";
    }
}
