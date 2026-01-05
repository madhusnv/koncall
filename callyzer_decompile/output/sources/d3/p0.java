package d3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b */
    public static final long f7805b = h0.m5136h(0.5f, 0.5f);

    /* renamed from: c */
    public static final /* synthetic */ int f7806c = 0;

    /* renamed from: a */
    public final long f7807a;

    /* renamed from: a */
    public static final boolean m5180a(long j6, long j10) {
        return j6 == j10;
    }

    /* renamed from: b */
    public static final float m5181b(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* renamed from: c */
    public static final float m5182c(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: d */
    public static String m5183d(long j6) {
        return "TransformOrigin(packedValue=" + j6 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f7807a == ((p0) obj).f7807a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7807a);
    }

    public final String toString() {
        return m5183d(this.f7807a);
    }
}
