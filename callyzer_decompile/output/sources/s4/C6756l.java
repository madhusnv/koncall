package s4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.l */
/* loaded from: classes.dex */
public final class C6756l {

    /* renamed from: a */
    public final long f32210a;

    /* renamed from: a */
    public static final boolean m12948a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static String m12949b(long j6) {
        return ((int) (j6 >> 32)) + " x " + ((int) (j6 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6756l) {
            return this.f32210a == ((C6756l) obj).f32210a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32210a);
    }

    public final String toString() {
        return m12949b(this.f32210a);
    }
}
