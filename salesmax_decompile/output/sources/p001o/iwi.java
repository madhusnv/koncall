package p001o;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import p001o.iwi;

/* loaded from: classes2.dex */
public abstract class iwi {

    /* renamed from: o.iwi$a */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC14383a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ BottomNavigationView f29297a;

        /* renamed from: o.iwi$a$a */
        public static final class a implements Animator.AnimatorListener {

            /* renamed from: a */
            public final /* synthetic */ ViewGroup f29298a;

            /* renamed from: b */
            public final /* synthetic */ BitmapDrawable f29299b;

            public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable) {
                this.f29298a = viewGroup;
                this.f29299b = bitmapDrawable;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.f29298a.getOverlay().remove(this.f29299b);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC14383a(BottomNavigationView bottomNavigationView) {
            this.f29297a = bottomNavigationView;
        }

        /* renamed from: b */
        public static final void m32873b(BitmapDrawable bitmapDrawable, BottomNavigationView bottomNavigationView, ValueAnimator valueAnimator) {
            sq8.m48649h(bitmapDrawable, "$drawable");
            sq8.m48649h(bottomNavigationView, "$this_hide");
            sq8.m48649h(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            sq8.m48647f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            bitmapDrawable.setBounds(bottomNavigationView.getLeft(), iIntValue, bottomNavigationView.getRight(), bottomNavigationView.getHeight() + iIntValue);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f29297a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewParent parent = this.f29297a.getParent();
            sq8.m48647f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            if (this.f29297a.getWidth() <= 0 || this.f29297a.getHeight() <= 0) {
                return;
            }
            final BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f29297a.getContext().getResources(), vwi.m53510b(this.f29297a, null, 1, null));
            bitmapDrawable.setBounds(this.f29297a.getLeft(), this.f29297a.getTop(), this.f29297a.getRight(), this.f29297a.getBottom());
            viewGroup.getOverlay().add(bitmapDrawable);
            this.f29297a.setVisibility(8);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f29297a.getTop(), viewGroup.getHeight());
            final BottomNavigationView bottomNavigationView = this.f29297a;
            valueAnimatorOfInt.setStartDelay(100L);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.setInterpolator(AnimationUtils.loadInterpolator(bottomNavigationView.getContext(), R.interpolator.fast_out_linear_in));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.hwi
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    iwi.ViewTreeObserverOnGlobalLayoutListenerC14383a.m32873b(bitmapDrawable, bottomNavigationView, valueAnimator);
                }
            });
            sq8.m48646e(valueAnimatorOfInt);
            valueAnimatorOfInt.addListener(new a(viewGroup, bitmapDrawable));
            valueAnimatorOfInt.start();
        }
    }

    /* renamed from: o.iwi$b */
    public static final class ViewTreeObserverOnGlobalLayoutListenerC14384b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public final /* synthetic */ BottomNavigationView f29300a;

        /* renamed from: o.iwi$b$a */
        public static final class a implements Animator.AnimatorListener {

            /* renamed from: a */
            public final /* synthetic */ ViewGroup f29301a;

            /* renamed from: b */
            public final /* synthetic */ BitmapDrawable f29302b;

            /* renamed from: c */
            public final /* synthetic */ BottomNavigationView f29303c;

            public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, BottomNavigationView bottomNavigationView) {
                this.f29301a = viewGroup;
                this.f29302b = bitmapDrawable;
                this.f29303c = bottomNavigationView;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.f29301a.getOverlay().remove(this.f29302b);
                this.f29303c.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC14384b(BottomNavigationView bottomNavigationView) {
            this.f29300a = bottomNavigationView;
        }

        /* renamed from: b */
        public static final void m32875b(BitmapDrawable bitmapDrawable, BottomNavigationView bottomNavigationView, ValueAnimator valueAnimator) {
            sq8.m48649h(bitmapDrawable, "$drawable");
            sq8.m48649h(bottomNavigationView, "$this_show");
            sq8.m48649h(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            sq8.m48647f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            bitmapDrawable.setBounds(bottomNavigationView.getLeft(), iIntValue, bottomNavigationView.getRight(), bottomNavigationView.getHeight() + iIntValue);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f29300a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ViewParent parent = this.f29300a.getParent();
            sq8.m48647f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            if (!this.f29300a.isLaidOut()) {
                this.f29300a.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), Integer.MIN_VALUE));
                this.f29300a.layout(viewGroup.getLeft(), viewGroup.getHeight() - this.f29300a.getMeasuredHeight(), viewGroup.getRight(), viewGroup.getHeight());
            }
            if (this.f29300a.getWidth() <= 0 || this.f29300a.getHeight() <= 0) {
                return;
            }
            final BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f29300a.getContext().getResources(), vwi.m53510b(this.f29300a, null, 1, null));
            bitmapDrawable.setBounds(this.f29300a.getLeft(), viewGroup.getHeight(), this.f29300a.getRight(), viewGroup.getHeight() + this.f29300a.getHeight());
            viewGroup.getOverlay().add(bitmapDrawable);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(viewGroup.getHeight(), this.f29300a.getTop());
            final BottomNavigationView bottomNavigationView = this.f29300a;
            valueAnimatorOfInt.setStartDelay(100L);
            valueAnimatorOfInt.setDuration(300L);
            valueAnimatorOfInt.setInterpolator(AnimationUtils.loadInterpolator(bottomNavigationView.getContext(), R.interpolator.linear_out_slow_in));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.jwi
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    iwi.ViewTreeObserverOnGlobalLayoutListenerC14384b.m32875b(bitmapDrawable, bottomNavigationView, valueAnimator);
                }
            });
            sq8.m48646e(valueAnimatorOfInt);
            valueAnimatorOfInt.addListener(new a(viewGroup, bitmapDrawable, bottomNavigationView));
            valueAnimatorOfInt.start();
        }
    }

    /* renamed from: a */
    public static final void m32870a(BottomNavigationView bottomNavigationView) {
        sq8.m48649h(bottomNavigationView, "<this>");
        if (bottomNavigationView.getVisibility() == 8) {
            return;
        }
        bottomNavigationView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC14383a(bottomNavigationView));
    }

    /* renamed from: b */
    public static final void m32871b(BottomNavigationView bottomNavigationView) {
        sq8.m48649h(bottomNavigationView, "<this>");
        if (bottomNavigationView.getVisibility() == 0) {
            if (bottomNavigationView.getAlpha() == 1.0f) {
                return;
            }
        }
        bottomNavigationView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC14384b(bottomNavigationView));
    }
}
