package c6;

import android.view.WindowInsets;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class l1 extends o1 {

    /* renamed from: c */
    public final WindowInsets.Builder f5482c;

    public l1() {
        this.f5482c = k1.m2438c();
    }

    @Override // c6.o1
    /* renamed from: b */
    public y1 mo2430b() {
        m2464a();
        y1 y1VarM2537d = y1.m2537d(null, this.f5482c.build());
        y1VarM2537d.f5541a.mo2481r(this.f5493b);
        return y1VarM2537d;
    }

    @Override // c6.o1
    /* renamed from: d */
    public void mo2445d(C7340b c7340b) {
        this.f5482c.setMandatorySystemGestureInsets(c7340b.m13738d());
    }

    @Override // c6.o1
    /* renamed from: e */
    public void mo2431e(C7340b c7340b) {
        this.f5482c.setStableInsets(c7340b.m13738d());
    }

    @Override // c6.o1
    /* renamed from: f */
    public void mo2446f(C7340b c7340b) {
        this.f5482c.setSystemGestureInsets(c7340b.m13738d());
    }

    @Override // c6.o1
    /* renamed from: g */
    public void mo2432g(C7340b c7340b) {
        this.f5482c.setSystemWindowInsets(c7340b.m13738d());
    }

    @Override // c6.o1
    /* renamed from: h */
    public void mo2447h(C7340b c7340b) {
        this.f5482c.setTappableElementInsets(c7340b.m13738d());
    }

    public l1(y1 y1Var) {
        WindowInsets.Builder builderM2438c;
        super(y1Var);
        WindowInsets windowInsetsM2539c = y1Var.m2539c();
        if (windowInsetsM2539c != null) {
            builderM2438c = k1.m2439d(windowInsetsM2539c);
        } else {
            builderM2438c = k1.m2438c();
        }
        this.f5482c = builderM2438c;
    }
}
