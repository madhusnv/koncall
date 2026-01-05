package c0;

import android.util.Size;
import android.view.Surface;
import l0.AbstractC4308h;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u1 extends i0.v0 {

    /* renamed from: o */
    public final /* synthetic */ int f5223o = 1;

    /* renamed from: p */
    public final Object f5224p;

    public u1(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f5224p = surface;
    }

    @Override // i0.v0
    /* renamed from: f */
    public final InterfaceFutureC8957d mo2229f() {
        switch (this.f5223o) {
            case 0:
                return ((x1) this.f5224p).f5263f;
            default:
                return AbstractC4308h.m9033c((Surface) this.f5224p);
        }
    }

    public u1(Surface surface) {
        super(i0.v0.f16596k, 0);
        this.f5224p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(x1 x1Var, Size size) {
        super(size, 34);
        this.f5224p = x1Var;
    }
}
