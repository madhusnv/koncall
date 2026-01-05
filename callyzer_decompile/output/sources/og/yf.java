package og;

import m4.AbstractC4646a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class yf {

    /* renamed from: a */
    public static final /* synthetic */ int f26966a = 0;

    /* renamed from: a */
    public static final long m11072a(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            AbstractC4646a.m9525a("start and end cannot be negative. [start: " + i10 + ", end: " + i11 + ']');
        }
        long j6 = (i11 & 4294967295L) | (i10 << 32);
        int i12 = g4.n0.f13685c;
        return j6;
    }

    /* renamed from: b */
    public static final long m11073b(int i10, long j6) {
        int i11 = g4.n0.f13685c;
        int i12 = (int) (j6 >> 32);
        int i13 = i12 < 0 ? 0 : i12;
        if (i13 > i10) {
            i13 = i10;
        }
        int i14 = (int) (4294967295L & j6);
        int i15 = i14 >= 0 ? i14 : 0;
        if (i15 <= i10) {
            i10 = i15;
        }
        return (i13 == i12 && i10 == i14) ? j6 : m11072a(i13, i10);
    }
}
