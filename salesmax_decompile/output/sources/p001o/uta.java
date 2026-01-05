package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class uta extends pta {

    /* renamed from: g */
    public final float f49474g;

    /* renamed from: h */
    public final float f49475h;

    /* renamed from: o.uta$a */
    public class C17449a extends AnimatorListenerAdapter {
        public C17449a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            uta.this.f40541b.setTranslationY(0.0f);
            uta.this.m52019k(0.0f);
        }
    }

    public uta(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f49474g = resources.getDimension(x6e.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f49475h = resources.getDimension(x6e.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    /* renamed from: f */
    public void m52014f() {
        if (super.m44147b() == null) {
            return;
        }
        Animator animatorM52015g = m52015g();
        animatorM52015g.setDuration(this.f40544e);
        animatorM52015g.start();
    }

    /* renamed from: g */
    public final Animator m52015g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f40541b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new at6());
        return animatorSet;
    }

    /* renamed from: h */
    public void m52016h(l91 l91Var, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.TRANSLATION_Y, this.f40541b.getHeight() * this.f40541b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new at6());
        objectAnimatorOfFloat.setDuration(gh0.m28649c(this.f40542c, this.f40543d, l91Var.m36806a()));
        objectAnimatorOfFloat.addListener(new C17449a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* renamed from: i */
    public void m52017i(l91 l91Var, Animator.AnimatorListener animatorListener) {
        Animator animatorM52015g = m52015g();
        animatorM52015g.setDuration(gh0.m28649c(this.f40542c, this.f40543d, l91Var.m36806a()));
        if (animatorListener != null) {
            animatorM52015g.addListener(animatorListener);
        }
        animatorM52015g.start();
    }

    /* renamed from: j */
    public void m52018j(l91 l91Var) {
        super.m44149d(l91Var);
    }

    /* renamed from: k */
    public void m52019k(float f) {
        float fM44146a = m44146a(f);
        float width = this.f40541b.getWidth();
        float height = this.f40541b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.f49474g / width;
        float f3 = this.f49475h / height;
        float fM28647a = 1.0f - gh0.m28647a(0.0f, f2, fM44146a);
        float fM28647a2 = 1.0f - gh0.m28647a(0.0f, f3, fM44146a);
        if (Float.isNaN(fM28647a) || Float.isNaN(fM28647a2)) {
            return;
        }
        this.f40541b.setScaleX(fM28647a);
        this.f40541b.setPivotY(height);
        this.f40541b.setScaleY(fM28647a2);
        View view = this.f40541b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fM28647a2 != 0.0f ? fM28647a / fM28647a2 : 1.0f);
            }
        }
    }

    /* renamed from: l */
    public void m52020l(l91 l91Var) {
        if (super.m44150e(l91Var) == null) {
            return;
        }
        m52019k(l91Var.m36806a());
    }
}
