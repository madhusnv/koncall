package dy;

import l7.C4417q;
import yx.AbstractC8808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dy.j */
/* loaded from: classes3.dex */
public abstract class AbstractC1862j {

    /* renamed from: b */
    public static final C4417q f8844b;

    /* renamed from: c */
    public static final C4417q f8845c;

    /* renamed from: d */
    public static final C4417q f8846d;

    /* renamed from: e */
    public static final C4417q f8847e;

    /* renamed from: a */
    public static final int f8843a = AbstractC8808b.m16254n(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* renamed from: f */
    public static final int f8848f = AbstractC8808b.m16254n(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i10 = 3;
        f8844b = new C4417q("PERMIT", i10);
        f8845c = new C4417q("TAKEN", i10);
        f8846d = new C4417q("BROKEN", i10);
        f8847e = new C4417q("CANCELLED", i10);
    }

    /* renamed from: a */
    public static C1861i m5494a(int i10) {
        return new C1861i(i10, 0);
    }
}
