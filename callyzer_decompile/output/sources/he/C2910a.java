package he;

import pg.AbstractC5935p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: he.a */
/* loaded from: classes.dex */
public final class C2910a extends AbstractC5935p {

    /* renamed from: b */
    public final int f15944b;

    public C2910a(int i10) {
        this.f15944b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2910a) {
            return this.f15944b == ((C2910a) obj).f15944b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15944b;
    }

    public final String toString() {
        return String.valueOf(this.f15944b);
    }
}
