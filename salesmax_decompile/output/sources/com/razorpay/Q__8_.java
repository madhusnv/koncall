package com.razorpay;

import android.animation.ValueAnimator;

/* loaded from: classes6.dex */
final class Q__8_ implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private /* synthetic */ float f13673a;

    /* renamed from: b */
    private /* synthetic */ float f13674b;

    /* renamed from: c */
    private /* synthetic */ CircularProgressView f13675c;

    public Q__8_(CircularProgressView circularProgressView, float f, float f2) {
        this.f13675c = circularProgressView;
        this.f13673a = f;
        this.f13674b = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13675c.startAngle = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        CircularProgressView circularProgressView = this.f13675c;
        circularProgressView.indeterminateSweep = (this.f13673a - circularProgressView.startAngle) + this.f13674b;
        this.f13675c.invalidate();
    }
}
