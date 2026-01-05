package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class ns6 implements z0j {

    /* renamed from: a */
    public float f37225a = 1.0f;

    /* renamed from: o.ns6$a */
    public class C15649a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f37226a;

        /* renamed from: b */
        public final /* synthetic */ float f37227b;

        /* renamed from: c */
        public final /* synthetic */ float f37228c;

        /* renamed from: d */
        public final /* synthetic */ float f37229d;

        /* renamed from: e */
        public final /* synthetic */ float f37230e;

        public C15649a(View view, float f, float f2, float f3, float f4) {
            this.f37226a = view;
            this.f37227b = f;
            this.f37228c = f2;
            this.f37229d = f3;
            this.f37230e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f37226a.setAlpha(rvh.m47188b(this.f37227b, this.f37228c, this.f37229d, this.f37230e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: o.ns6$b */
    public class C15650b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f37231a;

        /* renamed from: b */
        public final /* synthetic */ float f37232b;

        public C15650b(View view, float f) {
            this.f37231a = view;
            this.f37232b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f37231a.setAlpha(this.f37232b);
        }
    }

    /* renamed from: c */
    public static Animator m41023c(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C15649a(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new C15650b(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // p001o.z0j
    /* renamed from: a */
    public Animator mo38355a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m41023c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // p001o.z0j
    /* renamed from: b */
    public Animator mo38356b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m41023c(view, 0.0f, alpha, 0.0f, this.f37225a, alpha);
    }

    /* renamed from: d */
    public void m41024d(float f) {
        this.f37225a = f;
    }
}
