package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class qs6 implements z0j {

    /* renamed from: a */
    public float f42358a = 0.35f;

    /* renamed from: o.qs6$a */
    public class C16453a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f42359a;

        /* renamed from: b */
        public final /* synthetic */ float f42360b;

        /* renamed from: c */
        public final /* synthetic */ float f42361c;

        /* renamed from: d */
        public final /* synthetic */ float f42362d;

        /* renamed from: e */
        public final /* synthetic */ float f42363e;

        public C16453a(View view, float f, float f2, float f3, float f4) {
            this.f42359a = view;
            this.f42360b = f;
            this.f42361c = f2;
            this.f42362d = f3;
            this.f42363e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f42359a.setAlpha(rvh.m47188b(this.f42360b, this.f42361c, this.f42362d, this.f42363e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: o.qs6$b */
    public class C16454b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f42364a;

        /* renamed from: b */
        public final /* synthetic */ float f42365b;

        public C16454b(View view, float f) {
            this.f42364a = view;
            this.f42365b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f42364a.setAlpha(this.f42365b);
        }
    }

    /* renamed from: c */
    public static Animator m45824c(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C16453a(view, f, f2, f3, f4));
        valueAnimatorOfFloat.addListener(new C16454b(view, f5));
        return valueAnimatorOfFloat;
    }

    @Override // p001o.z0j
    /* renamed from: a */
    public Animator mo38355a(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m45824c(view, alpha, 0.0f, 0.0f, this.f42358a, alpha);
    }

    @Override // p001o.z0j
    /* renamed from: b */
    public Animator mo38356b(ViewGroup viewGroup, View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m45824c(view, 0.0f, alpha, this.f42358a, 1.0f, alpha);
    }
}
