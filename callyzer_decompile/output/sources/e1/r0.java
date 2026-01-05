package e1;

import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a */
    public static final long[] f9045a = {-9187201950435737345L, -1};

    static {
        new j0(0);
    }

    /* renamed from: a */
    public static final int m5608a(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    /* renamed from: b */
    public static final j0 m5609b() {
        return new j0();
    }

    /* renamed from: c */
    public static final int m5610c(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    /* renamed from: d */
    public static final int m5611d(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    /* renamed from: e */
    public static final int m5612e(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return AbstractC4801l.m9727a(i10, 1, 7, i10);
    }
}
