package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.InterfaceC11004c;

/* renamed from: com.google.android.material.circularreveal.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11002a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11004c f12362a;

        public a(InterfaceC11004c interfaceC11004c) {
            this.f12362a = interfaceC11004c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12362a.mo14417b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f12362a.mo14416a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Animator m14420a(InterfaceC11004c interfaceC11004c, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC11004c, (Property<InterfaceC11004c, V>) InterfaceC11004c.c.f12373a, InterfaceC11004c.b.f12371b, new InterfaceC11004c.e(f, f2, f3));
        InterfaceC11004c.e revealInfo = interfaceC11004c.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC11004c, (int) f, (int) f2, revealInfo.f12377c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
        return animatorSet;
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m14421b(InterfaceC11004c interfaceC11004c) {
        return new a(interfaceC11004c);
    }
}
