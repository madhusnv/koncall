package p020v;

import i0.a1;
import i0.j1;
import i0.s0;
import i0.w2;
import i0.y2;
import java.util.UUID;
import m0.InterfaceC4617k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 implements w2 {

    /* renamed from: a */
    public final j1 f36750a;

    public w0() {
        j1 j1VarM7349b = j1.m7349b();
        j1VarM7349b.m7352n(w2.f44345u0, new d0());
        j1VarM7349b.m7352n(a1.f44329d0, 34);
        j1VarM7349b.m7352n(InterfaceC4617k.N0, x0.class);
        j1VarM7349b.m7352n(InterfaceC4617k.M0, x0.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.f36750a = j1VarM7349b;
    }

    @Override // i0.w2
    /* renamed from: E */
    public final y2 mo7421E() {
        return y2.METERING_REPEATING;
    }

    @Override // i0.w1
    /* renamed from: d */
    public final s0 mo2241d() {
        return this.f36750a;
    }
}
