package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import p001o.pcc;
import p001o.u5e;
import p001o.y8e;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2117c {
    /* renamed from: a */
    public static int m6328a(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* renamed from: b */
    public static a m6329b(Context context, Fragment fragment, boolean z, boolean z2) throws Resources.NotFoundException {
        int nextTransition = fragment.getNextTransition();
        int iM6328a = m6328a(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(y8e.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(y8e.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, iM6328a);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, iM6328a);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iM6328a == 0 && nextTransition != 0) {
            iM6328a = m6331d(context, nextTransition, z);
        }
        if (iM6328a != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iM6328a));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iM6328a);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iM6328a);
                    if (animatorLoadAnimator != null) {
                        return new a(animatorLoadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (zEquals) {
                        throw e2;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iM6328a);
                    if (animationLoadAnimation2 != null) {
                        return new a(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m6330c(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: d */
    public static int m6331d(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? u5e.fragment_open_enter : u5e.fragment_open_exit;
        }
        if (i == 8194) {
            return z ? u5e.fragment_close_enter : u5e.fragment_close_exit;
        }
        if (i == 8197) {
            return z ? m6330c(context, R.attr.activityCloseEnterAnimation) : m6330c(context, R.attr.activityCloseExitAnimation);
        }
        if (i == 4099) {
            return z ? u5e.fragment_fade_enter : u5e.fragment_fade_exit;
        }
        if (i != 4100) {
            return -1;
        }
        return z ? m6330c(context, R.attr.activityOpenEnterAnimation) : m6330c(context, R.attr.activityOpenExitAnimation);
    }

    /* renamed from: androidx.fragment.app.c$a */
    public static class a {

        /* renamed from: a */
        public final Animation f7544a;

        /* renamed from: b */
        public final AnimatorSet f7545b;

        public a(Animation animation) {
            this.f7544a = animation;
            this.f7545b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f7544a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7545b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a */
        public final ViewGroup f7546a;

        /* renamed from: b */
        public final View f7547b;

        /* renamed from: c */
        public boolean f7548c;

        /* renamed from: d */
        public boolean f7549d;

        /* renamed from: e */
        public boolean f7550e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f7550e = true;
            this.f7546a = viewGroup;
            this.f7547b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f7550e = true;
            if (this.f7548c) {
                return !this.f7549d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f7548c = true;
                pcc.m43344a(this.f7546a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7548c || !this.f7550e) {
                this.f7546a.endViewTransition(this.f7547b);
                this.f7549d = true;
            } else {
                this.f7550e = false;
                this.f7546a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f7550e = true;
            if (this.f7548c) {
                return !this.f7549d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f7548c = true;
                pcc.m43344a(this.f7546a, this);
            }
            return true;
        }
    }
}
