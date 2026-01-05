package r4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.a */
/* loaded from: classes.dex */
public final class C6446a {

    /* renamed from: a */
    public final float f31100a;

    public final boolean equals(Object obj) {
        if (obj instanceof C6446a) {
            return Float.compare(this.f31100a, ((C6446a) obj).f31100a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31100a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f31100a + ')';
    }
}
