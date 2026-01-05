package c6;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ i1 f5543a;

    /* renamed from: b */
    public final /* synthetic */ y1 f5544b;

    /* renamed from: c */
    public final /* synthetic */ y1 f5545c;

    /* renamed from: d */
    public final /* synthetic */ int f5546d;

    /* renamed from: e */
    public final /* synthetic */ View f5547e;

    public z0(i1 i1Var, y1 y1Var, y1 y1Var2, int i10, View view) {
        this.f5543a = i1Var;
        this.f5544b = y1Var;
        this.f5545c = y1Var2;
        this.f5546d = i10;
        this.f5547e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        i1 i1Var = this.f5543a;
        h1 h1Var = i1Var.f5469a;
        h1Var.mo2387c(animatedFraction);
        y1 y1Var = this.f5544b;
        v1 v1Var = y1Var.f5541a;
        float fMo2386b = h1Var.mo2386b();
        PathInterpolator pathInterpolator = d1.f5436d;
        int i10 = Build.VERSION.SDK_INT;
        o1 n1Var = i10 >= 34 ? new n1(y1Var) : i10 >= 30 ? new m1(y1Var) : i10 >= 29 ? new l1(y1Var) : new j1(y1Var);
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.f5546d & i11) == 0) {
                n1Var.mo2448c(i11, v1Var.mo2475g(i11));
            } else {
                C7340b c7340bMo2475g = v1Var.mo2475g(i11);
                C7340b c7340bMo2475g2 = this.f5545c.f5541a.mo2475g(i11);
                float f6 = 1.0f - fMo2386b;
                n1Var.mo2448c(i11, y1.m2536b(c7340bMo2475g, (int) (((c7340bMo2475g.f34957a - c7340bMo2475g2.f34957a) * f6) + 0.5d), (int) (((c7340bMo2475g.f34958b - c7340bMo2475g2.f34958b) * f6) + 0.5d), (int) (((c7340bMo2475g.f34959c - c7340bMo2475g2.f34959c) * f6) + 0.5d), (int) (((c7340bMo2475g.f34960d - c7340bMo2475g2.f34960d) * f6) + 0.5d)));
            }
        }
        d1.m2350f(this.f5547e, n1Var.mo2430b(), Collections.singletonList(i1Var));
    }
}
