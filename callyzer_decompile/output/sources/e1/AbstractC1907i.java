package e1;

import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.i */
/* loaded from: classes.dex */
public abstract class AbstractC1907i {

    /* renamed from: a */
    public static final float[] f8994a;

    static {
        long[] jArr = r0.f9045a;
        int iM5612e = r0.m5612e(0);
        int iMax = iM5612e > 0 ? Math.max(7, r0.m5611d(iM5612e)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC6662l.m12727q(jArr, -9187201950435737472L);
        }
        int i10 = iMax >> 3;
        long j6 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j6)) | j6;
        float[] fArr = new float[iMax];
        f8994a = new float[0];
    }
}
