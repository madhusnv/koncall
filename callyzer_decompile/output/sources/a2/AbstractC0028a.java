package a2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0028a {

    /* renamed from: a */
    public static final long f103a = m104a(Float.NaN, Float.NaN);

    /* renamed from: b */
    public static final /* synthetic */ int f104b = 0;

    /* renamed from: a */
    public static long m104a(float f6, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }
}
