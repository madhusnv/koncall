package s4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.g */
/* loaded from: classes.dex */
public final class C6751g {

    /* renamed from: a */
    public final long f32202a;

    /* renamed from: a */
    public static String m12937a(long j6) {
        if (j6 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C6750f.m12936b(Float.intBitsToFloat((int) (j6 >> 32)))) + ", " + ((Object) C6750f.m12936b(Float.intBitsToFloat((int) (j6 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6751g) {
            return this.f32202a == ((C6751g) obj).f32202a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32202a);
    }

    public final String toString() {
        return m12937a(this.f32202a);
    }
}
