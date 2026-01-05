package g2;

import d3.C1565s;
import i1.C3138q;
import j2.AbstractC3540t;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f6 {

    /* renamed from: a */
    public static final float f11573a = AbstractC3540t.f18853b;

    /* renamed from: a */
    public static C3138q m6157a(boolean z6, boolean z10, long j6, long j10, long j11, InterfaceC3962k interfaceC3962k, int i10) {
        if ((i10 & 4) != 0) {
            j6 = y1.m6345d(AbstractC3540t.f18863l, interfaceC3962k);
        }
        long j12 = C1565s.f7816i;
        if ((i10 & 16) != 0) {
            j10 = C1565s.m5186b(0.12f, 14, y1.m6345d(AbstractC3540t.f18856e, interfaceC3962k));
        }
        if ((i10 & 32) != 0) {
            j11 = j12;
        }
        float f6 = AbstractC3540t.f18864m;
        float f10 = AbstractC3540t.f18861j;
        if (!z6) {
            j6 = z10 ? j11 : j10;
        } else if (z10) {
            j6 = j12;
        }
        if (z10) {
            f6 = f10;
        }
        return pg.d0.m11579a(f6, j6);
    }
}
