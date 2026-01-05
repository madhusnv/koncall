package b2;

import d4.C1595w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a */
    public static final float f3745a;

    /* renamed from: b */
    public static final float f3746b;

    /* renamed from: c */
    public static final C1595w f3747c = new C1595w("SelectionHandleInfo");

    static {
        float f6 = 25;
        f3745a = f6;
        f3746b = f6;
    }

    /* renamed from: a */
    public static final long m1629a(long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - 1.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
