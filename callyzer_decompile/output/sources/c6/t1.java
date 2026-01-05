package c6;

import android.view.View;
import android.view.WindowInsets;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class t1 extends s1 {

    /* renamed from: r */
    public static final y1 f5519r = y1.m2537d(null, WindowInsets.CONSUMED);

    public t1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
    }

    @Override // c6.p1, c6.v1
    /* renamed from: g */
    public C7340b mo2475g(int i10) {
        return C7340b.m13737c(this.f5501c.getInsets(w1.m2533a(i10)));
    }

    @Override // c6.p1, c6.v1
    /* renamed from: h */
    public C7340b mo2476h(int i10) {
        return C7340b.m13737c(this.f5501c.getInsetsIgnoringVisibility(w1.m2533a(i10)));
    }

    @Override // c6.p1, c6.v1
    /* renamed from: q */
    public boolean mo2480q(int i10) {
        return this.f5501c.isVisible(w1.m2533a(i10));
    }

    public t1(y1 y1Var, t1 t1Var) {
        super(y1Var, t1Var);
    }

    @Override // c6.p1, c6.v1
    /* renamed from: d */
    public final void mo2473d(View view) {
    }
}
