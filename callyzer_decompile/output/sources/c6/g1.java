package c6;

import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.datastore.preferences.protobuf.AbstractC0315j;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 extends h1 {

    /* renamed from: d */
    public final WindowInsetsAnimation f5456d;

    public g1(WindowInsetsAnimation windowInsetsAnimation) {
        super(null, 0L);
        this.f5456d = windowInsetsAnimation;
    }

    /* renamed from: d */
    public static C7340b m2382d(WindowInsetsAnimation.Bounds bounds) {
        return C7340b.m13737c(bounds.getUpperBound());
    }

    /* renamed from: e */
    public static C7340b m2383e(WindowInsetsAnimation.Bounds bounds) {
        return C7340b.m13737c(bounds.getLowerBound());
    }

    /* renamed from: f */
    public static void m2384f(View view, AbstractC0315j abstractC0315j) {
        view.setWindowInsetsAnimationCallback(abstractC0315j != null ? new f1(abstractC0315j) : null);
    }

    @Override // c6.h1
    /* renamed from: a */
    public final long mo2385a() {
        return this.f5456d.getDurationMillis();
    }

    @Override // c6.h1
    /* renamed from: b */
    public final float mo2386b() {
        return this.f5456d.getInterpolatedFraction();
    }

    @Override // c6.h1
    /* renamed from: c */
    public final void mo2387c(float f6) {
        this.f5456d.setFraction(f6);
    }
}
