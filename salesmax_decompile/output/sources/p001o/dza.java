package p001o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class dza extends pta {

    /* renamed from: g */
    public final float f20667g;

    /* renamed from: h */
    public final float f20668h;

    /* renamed from: i */
    public final float f20669i;

    /* renamed from: o.dza$a */
    public class C13065a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f20670a;

        /* renamed from: b */
        public final /* synthetic */ int f20671b;

        public C13065a(boolean z, int i) {
            this.f20670a = z;
            this.f20671b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            dza.this.f40541b.setTranslationX(0.0f);
            dza.this.m23968k(0.0f, this.f20670a, this.f20671b);
        }
    }

    public dza(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f20667g = resources.getDimension(x6e.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f20668h = resources.getDimension(x6e.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f20669i = resources.getDimension(x6e.m3_back_progress_side_container_max_scale_y_distance);
    }

    /* renamed from: f */
    public void m23963f() {
        if (super.m44147b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f40541b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f40541b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f40544e);
        animatorSet.start();
    }

    /* renamed from: g */
    public final boolean m23964g(int i, int i2) {
        return (Gravity.getAbsoluteGravity(i, this.f40541b.getLayoutDirection()) & i2) == i2;
    }

    /* renamed from: h */
    public void m23965h(l91 l91Var, int i, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z = l91Var.m36807b() == 0;
        boolean zM23964g = m23964g(i, 3);
        float width = (this.f40541b.getWidth() * this.f40541b.getScaleX()) + m23966i(zM23964g);
        View view = this.f40541b;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (zM23964g) {
            width = -width;
        }
        fArr[0] = width;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new at6());
        objectAnimatorOfFloat.setDuration(gh0.m28649c(this.f40542c, this.f40543d, l91Var.m36806a()));
        objectAnimatorOfFloat.addListener(new C13065a(z, i));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    /* renamed from: i */
    public final int m23966i(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f40541b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    /* renamed from: j */
    public void m23967j(l91 l91Var) {
        super.m44149d(l91Var);
    }

    /* renamed from: k */
    public void m23968k(float f, boolean z, int i) {
        float fM44146a = m44146a(f);
        boolean zM23964g = m23964g(i, 3);
        boolean z2 = z == zM23964g;
        int width = this.f40541b.getWidth();
        int height = this.f40541b.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.f20667g / f2;
            float f5 = this.f20668h / f2;
            float f6 = this.f20669i / f3;
            View view = this.f40541b;
            if (zM23964g) {
                f2 = 0.0f;
            }
            view.setPivotX(f2);
            if (!z2) {
                f5 = -f4;
            }
            float fM28647a = gh0.m28647a(0.0f, f5, fM44146a);
            float f7 = fM28647a + 1.0f;
            float fM28647a2 = 1.0f - gh0.m28647a(0.0f, f6, fM44146a);
            if (Float.isNaN(f7) || Float.isNaN(fM28647a2)) {
                return;
            }
            this.f40541b.setScaleX(f7);
            this.f40541b.setScaleY(fM28647a2);
            View view2 = this.f40541b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(zM23964g ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z2 ? 1.0f - fM28647a : 1.0f;
                    float f9 = fM28647a2 != 0.0f ? (f7 / fM28647a2) * f8 : 1.0f;
                    if (!Float.isNaN(f8) && !Float.isNaN(f9)) {
                        childAt.setScaleX(f8);
                        childAt.setScaleY(f9);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public void m23969l(l91 l91Var, int i) {
        if (super.m44150e(l91Var) == null) {
            return;
        }
        m23968k(l91Var.m36806a(), l91Var.m36807b() == 0, i);
    }
}
