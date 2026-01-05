package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import p001o.dzh;
import p001o.g8e;
import p001o.kag;
import p001o.svh;
import p001o.zzi;

/* loaded from: classes2.dex */
public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    public static class C2496a extends AnimatorListenerAdapter implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final View f10340a;

        /* renamed from: b */
        public boolean f10341b = false;

        public C2496a(View view) {
            this.f10340a = view;
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
            this.f10340a.setTag(g8e.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
            this.f10340a.setTag(g8e.transition_pause_alpha, Float.valueOf(this.f10340a.getVisibility() == 0 ? zzi.m60169b(this.f10340a) : 0.0f));
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: l */
        public void mo9843l(Transition transition, boolean z) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            zzi.m60173f(this.f10340a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10340a.hasOverlappingRendering() && this.f10340a.getLayerType() == 0) {
                this.f10341b = true;
                this.f10340a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.f10341b) {
                this.f10340a.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            zzi.m60173f(this.f10340a, 1.0f);
            zzi.m60168a(this.f10340a);
        }
    }

    public Fade(int i) {
        Q0(i);
    }

    public static float T0(svh svhVar, float f) {
        Float f2;
        return (svhVar == null || (f2 = (Float) svhVar.f46008a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // androidx.transition.Visibility
    public Animator M0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        zzi.m60170c(view);
        return S0(view, T0(svhVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator O0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        zzi.m60170c(view);
        Animator animatorS0 = S0(view, T0(svhVar, 1.0f), 0.0f);
        if (animatorS0 == null) {
            zzi.m60173f(view, T0(svhVar2, 1.0f));
        }
        return animatorS0;
    }

    public final Animator S0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        zzi.m60173f(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) zzi.f57935b, f2);
        C2496a c2496a = new C2496a(view);
        objectAnimatorOfFloat.addListener(c2496a);
        m9864J().mo9876c(c2496a);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        return true;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        super.mo9808n(svhVar);
        Float fValueOf = (Float) svhVar.f46009b.getTag(g8e.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = svhVar.f46009b.getVisibility() == 0 ? Float.valueOf(zzi.m60169b(svhVar.f46009b)) : Float.valueOf(0.0f);
        }
        svhVar.f46008a.put("android:fade:transitionAlpha", fValueOf);
    }

    public Fade() {
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31776f);
        Q0(dzh.m23978g(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, J0()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
