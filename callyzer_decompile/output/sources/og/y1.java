package og;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class y1 {
    /* renamed from: a */
    public static long m11061a(float f6) {
        return (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
    }

    /* renamed from: b */
    public static int m11062b(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }
}
