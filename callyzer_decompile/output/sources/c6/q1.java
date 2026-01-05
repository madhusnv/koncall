package c6;

import android.view.WindowInsets;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class q1 extends p1 {

    /* renamed from: n */
    public C7340b f5510n;

    public q1(y1 y1Var, WindowInsets windowInsets) {
        super(y1Var, windowInsets);
        this.f5510n = null;
    }

    @Override // c6.v1
    /* renamed from: b */
    public y1 mo2493b() {
        return y1.m2537d(null, this.f5501c.consumeStableInsets());
    }

    @Override // c6.v1
    /* renamed from: c */
    public y1 mo2494c() {
        return y1.m2537d(null, this.f5501c.consumeSystemWindowInsets());
    }

    @Override // c6.v1
    /* renamed from: j */
    public final C7340b mo2495j() {
        if (this.f5510n == null) {
            WindowInsets windowInsets = this.f5501c;
            this.f5510n = C7340b.m13736b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f5510n;
    }

    @Override // c6.v1
    /* renamed from: o */
    public boolean mo2496o() {
        return this.f5501c.isConsumed();
    }

    @Override // c6.v1
    /* renamed from: u */
    public void mo2497u(C7340b c7340b) {
        this.f5510n = c7340b;
    }

    public q1(y1 y1Var, q1 q1Var) {
        super(y1Var, q1Var);
        this.f5510n = null;
        this.f5510n = q1Var.f5510n;
    }
}
