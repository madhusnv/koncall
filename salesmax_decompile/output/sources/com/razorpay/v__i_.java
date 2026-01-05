package com.razorpay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes6.dex */
final class v__i_ extends AnimatorListenerAdapter {

    /* renamed from: a */
    private boolean f13815a = false;

    /* renamed from: b */
    private /* synthetic */ CircularProgressView f13816b;

    public v__i_(CircularProgressView circularProgressView) {
        this.f13816b = circularProgressView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f13815a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f13815a) {
            return;
        }
        this.f13816b.resetAnimation();
    }
}
