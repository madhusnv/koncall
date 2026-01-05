package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;
import p001o.g8e;
import p001o.svh;

/* renamed from: androidx.transition.e */
/* loaded from: classes2.dex */
public abstract class AbstractC2526e {
    /* renamed from: a */
    public static Animator m9959a(View view, svh svhVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) svhVar.f46009b.getTag(g8e.transition_position)) != null) {
            f = (r2[0] - i) + translationX;
            f2 = (r2[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        a aVar = new a(view, svhVar.f46009b, translationX, translationY);
        transition.mo9876c(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* renamed from: androidx.transition.e$a */
    public static class a extends AnimatorListenerAdapter implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final View f10436a;

        /* renamed from: b */
        public final View f10437b;

        /* renamed from: c */
        public int[] f10438c;

        /* renamed from: d */
        public float f10439d;

        /* renamed from: e */
        public float f10440e;

        /* renamed from: f */
        public final float f10441f;

        /* renamed from: g */
        public final float f10442g;

        /* renamed from: h */
        public boolean f10443h;

        public a(View view, View view2, float f, float f2) {
            this.f10437b = view;
            this.f10436a = view2;
            this.f10441f = f;
            this.f10442g = f2;
            int[] iArr = (int[]) view2.getTag(g8e.transition_position);
            this.f10438c = iArr;
            if (iArr != null) {
                view2.setTag(g8e.transition_position, null);
            }
        }

        /* renamed from: a */
        public final void m9960a() {
            if (this.f10438c == null) {
                this.f10438c = new int[2];
            }
            this.f10437b.getLocationOnScreen(this.f10438c);
            this.f10436a.setTag(g8e.transition_position, this.f10438c);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
            this.f10437b.setTranslationX(this.f10439d);
            this.f10437b.setTranslationY(this.f10440e);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
            m9960a();
            this.f10439d = this.f10437b.getTranslationX();
            this.f10440e = this.f10437b.getTranslationY();
            this.f10437b.setTranslationX(this.f10441f);
            this.f10437b.setTranslationY(this.f10442g);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: g */
        public void mo9907g(Transition transition, boolean z) {
            if (this.f10443h) {
                return;
            }
            this.f10436a.setTag(g8e.transition_position, null);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
            mo9907g(transition, false);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
            this.f10443h = true;
            this.f10437b.setTranslationX(this.f10441f);
            this.f10437b.setTranslationY(this.f10442g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10443h = true;
            this.f10437b.setTranslationX(this.f10441f);
            this.f10437b.setTranslationY(this.f10442g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            this.f10437b.setTranslationX(this.f10441f);
            this.f10437b.setTranslationY(this.f10442g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
