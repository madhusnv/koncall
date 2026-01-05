package c6;

import android.view.WindowInsets;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u1 extends t1 {

    /* renamed from: s */
    public static final y1 f5524s = y1.m2537d(null, WindowInsets.CONSUMED);

    public u1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
    }

    @Override // c6.t1, c6.p1, c6.v1
    /* renamed from: g */
    public C7340b mo2475g(int i10) {
        return C7340b.m13737c(this.f5501c.getInsets(x1.m2534a(i10)));
    }

    @Override // c6.t1, c6.p1, c6.v1
    /* renamed from: h */
    public C7340b mo2476h(int i10) {
        return C7340b.m13737c(this.f5501c.getInsetsIgnoringVisibility(x1.m2534a(i10)));
    }

    @Override // c6.t1, c6.p1, c6.v1
    /* renamed from: q */
    public boolean mo2480q(int i10) {
        return this.f5501c.isVisible(x1.m2534a(i10));
    }

    public u1(y1 y1Var, u1 u1Var) {
        super(y1Var, u1Var);
    }
}
