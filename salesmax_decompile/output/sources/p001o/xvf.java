package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class xvf implements z0j {

    /* renamed from: a */
    public int f54372a;

    /* renamed from: b */
    public int f54373b = -1;

    /* renamed from: o.xvf$a */
    public class C18252a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f54374a;

        /* renamed from: b */
        public final /* synthetic */ float f54375b;

        public C18252a(View view, float f) {
            this.f54374a = view;
            this.f54375b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54374a.setTranslationX(this.f54375b);
        }
    }

    /* renamed from: o.xvf$b */
    public class C18253b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f54376a;

        /* renamed from: b */
        public final /* synthetic */ float f54377b;

        public C18253b(View view, float f) {
            this.f54376a = view;
            this.f54377b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54376a.setTranslationY(this.f54377b);
        }
    }

    public xvf(int i) {
        this.f54372a = i;
    }

    /* renamed from: c */
    public static Animator m56868c(View view, View view2, int i, int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m56870e(view2, i2 + translationX, translationX, translationX);
        }
        if (i == 5) {
            return m56870e(view2, translationX - i2, translationX, translationX);
        }
        if (i == 48) {
            return m56871f(view2, translationY - i2, translationY, translationY);
        }
        if (i == 80) {
            return m56871f(view2, i2 + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return m56870e(view2, m56872h(view) ? i2 + translationX : translationX - i2, translationX, translationX);
        }
        if (i == 8388613) {
            return m56870e(view2, m56872h(view) ? translationX - i2 : i2 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i);
    }

    /* renamed from: d */
    public static Animator m56869d(View view, View view2, int i, int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m56870e(view2, translationX, translationX - i2, translationX);
        }
        if (i == 5) {
            return m56870e(view2, translationX, i2 + translationX, translationX);
        }
        if (i == 48) {
            return m56871f(view2, translationY, i2 + translationY, translationY);
        }
        if (i == 80) {
            return m56871f(view2, translationY, translationY - i2, translationY);
        }
        if (i == 8388611) {
            return m56870e(view2, translationX, m56872h(view) ? translationX - i2 : i2 + translationX, translationX);
        }
        if (i == 8388613) {
            return m56870e(view2, translationX, m56872h(view) ? i2 + translationX : translationX - i2, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i);
    }

    /* renamed from: e */
    public static Animator m56870e(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new C18252a(view, f3));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* renamed from: f */
    public static Animator m56871f(View view, float f, float f2, float f3) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f, f2));
        objectAnimatorOfPropertyValuesHolder.addListener(new C18253b(view, f3));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* renamed from: h */
    public static boolean m56872h(View view) {
        return view.getLayoutDirection() == 1;
    }

    @Override // p001o.z0j
    /* renamed from: a */
    public Animator mo38355a(ViewGroup viewGroup, View view) {
        return m56869d(viewGroup, view, this.f54372a, m56873g(view.getContext()));
    }

    @Override // p001o.z0j
    /* renamed from: b */
    public Animator mo38356b(ViewGroup viewGroup, View view) {
        return m56868c(viewGroup, view, this.f54372a, m56873g(view.getContext()));
    }

    /* renamed from: g */
    public final int m56873g(Context context) {
        int i = this.f54373b;
        return i != -1 ? i : context.getResources().getDimensionPixelSize(x6e.mtrl_transition_shared_axis_slide_distance);
    }
}
