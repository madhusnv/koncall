package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.onesignal.inAppMessages.internal.display.impl.OneSignalAnimate;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OneSignalAnimate {
    public static final OneSignalAnimate INSTANCE = new OneSignalAnimate();

    private OneSignalAnimate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: animateViewColor$lambda-0, reason: not valid java name */
    public static final void m68762animateViewColor$lambda0(View view, ValueAnimator valueAnimator) {
        sq8.m48649h(view, "$view");
        sq8.m48649h(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        sq8.m48647f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    public final Animation animateViewByTranslation(View view, float f, float f2, int i, Interpolator interpolator, Animation.AnimationListener animationListener) {
        sq8.m48649h(view, "view");
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
        translateAnimation.setDuration(i);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    public final ValueAnimator animateViewColor(final View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        sq8.m48649h(view, "view");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(i);
        valueAnimator.setIntValues(i2, i3);
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.qcc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                OneSignalAnimate.m68762animateViewColor$lambda0(view, valueAnimator2);
            }
        });
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    public final Animation animateViewSmallToLarge(View view, int i, Interpolator interpolator, Animation.AnimationListener animationListener) {
        sq8.m48649h(view, "view");
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
