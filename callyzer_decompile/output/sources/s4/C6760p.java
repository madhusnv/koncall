package s4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.p */
/* loaded from: classes.dex */
public final class C6760p {

    /* renamed from: a */
    public final long f32215a;

    /* renamed from: a */
    public static final boolean m12956a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static String m12957b(long j6) {
        return m12956a(j6, 0L) ? "Unspecified" : m12956a(j6, 4294967296L) ? "Sp" : m12956a(j6, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6760p) {
            return this.f32215a == ((C6760p) obj).f32215a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32215a);
    }

    public final String toString() {
        return m12957b(this.f32215a);
    }
}
