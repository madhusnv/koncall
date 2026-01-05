package s4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.h */
/* loaded from: classes.dex */
public final class C6752h {

    /* renamed from: a */
    public final long f32203a;

    public final boolean equals(Object obj) {
        if (obj instanceof C6752h) {
            return this.f32203a == ((C6752h) obj).f32203a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32203a);
    }

    public final String toString() {
        long j6 = this.f32203a;
        if (j6 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C6750f.m12936b(Float.intBitsToFloat((int) (j6 >> 32)))) + " x " + ((Object) C6750f.m12936b(Float.intBitsToFloat((int) (j6 & 4294967295L))));
    }
}
