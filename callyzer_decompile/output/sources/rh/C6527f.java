package rh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.f */
/* loaded from: classes.dex */
public final class C6527f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f31305a;

    /* renamed from: b */
    public final /* synthetic */ C6528g f31306b;

    public /* synthetic */ C6527f(C6528g c6528g, int i10) {
        this.f31305a = i10;
        this.f31306b = c6528g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f31305a) {
            case 0:
                this.f31306b.f31338c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C6528g c6528g = this.f31306b;
                c6528g.f31338c.setScaleX(fFloatValue);
                c6528g.f31338c.setScaleY(fFloatValue);
                break;
        }
    }
}
