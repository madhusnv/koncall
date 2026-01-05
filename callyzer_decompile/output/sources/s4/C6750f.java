package s4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.f */
/* loaded from: classes.dex */
public final class C6750f implements Comparable {

    /* renamed from: a */
    public final float f32201a;

    /* renamed from: a */
    public static final boolean m12935a(float f6, float f10) {
        return Float.compare(f6, f10) == 0;
    }

    /* renamed from: b */
    public static String m12936b(float f6) {
        if (Float.isNaN(f6)) {
            return "Dp.Unspecified";
        }
        return f6 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f32201a, ((C6750f) obj).f32201a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6750f) {
            return Float.compare(this.f32201a, ((C6750f) obj).f32201a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32201a);
    }

    public final String toString() {
        return m12936b(this.f32201a);
    }
}
