package com.razorpay;

import android.animation.ValueAnimator;

/* loaded from: classes6.dex */
final class r__Q_ implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private /* synthetic */ CircularProgressView f13810a;

    public r__Q_(CircularProgressView circularProgressView) {
        this.f13810a = circularProgressView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13810a.indeterminateSweep = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f13810a.invalidate();
    }
}
