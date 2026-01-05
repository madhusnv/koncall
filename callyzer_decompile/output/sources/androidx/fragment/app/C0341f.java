package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.websoptimization.callyzerbiz.R;
import fb.AbstractC2234h;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public final class C0341f extends AbstractC0346k {

    /* renamed from: b */
    public final boolean f2506b;

    /* renamed from: c */
    public boolean f2507c;

    /* renamed from: d */
    public p0 f2508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0341f(h2 operation, boolean z6) {
        super(operation);
        AbstractC4154l.m8923f(operation, "operation");
        this.f2506b = z6;
    }

    /* renamed from: b */
    public final p0 m1133b(Context context) throws Resources.NotFoundException {
        Animation animationLoadAnimation;
        p0 p0Var;
        if (this.f2507c) {
            return this.f2508d;
        }
        h2 h2Var = this.f2605a;
        j0 j0Var = h2Var.f2547c;
        boolean z6 = h2Var.f2545a == l2.VISIBLE;
        int nextTransition = j0Var.getNextTransition();
        int popEnterAnim = this.f2506b ? z6 ? j0Var.getPopEnterAnim() : j0Var.getPopExitAnim() : z6 ? j0Var.getEnterAnim() : j0Var.getExitAnim();
        j0Var.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = j0Var.mContainer;
        p0 p0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            j0Var.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = j0Var.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = j0Var.onCreateAnimation(nextTransition, z6, popEnterAnim);
            if (animationOnCreateAnimation != null) {
                p0Var2 = new p0(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = j0Var.onCreateAnimator(nextTransition, z6, popEnterAnim);
                if (animatorOnCreateAnimator != null) {
                    p0Var2 = new p0(animatorOnCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z6 ? AbstractC2234h.m5946b(context, android.R.attr.activityOpenEnterAnimation) : AbstractC2234h.m5946b(context, android.R.attr.activityOpenExitAnimation) : z6 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z6 ? AbstractC2234h.m5946b(context, android.R.attr.activityCloseEnterAnimation) : AbstractC2234h.m5946b(context, android.R.attr.activityCloseExitAnimation) : z6 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z6 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        if (zEquals) {
                            try {
                                animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                            } catch (Resources.NotFoundException e2) {
                                throw e2;
                            } catch (RuntimeException unused) {
                            }
                            if (animationLoadAnimation != null) {
                                p0Var = new p0(animationLoadAnimation);
                                p0Var2 = p0Var;
                            }
                        } else {
                            try {
                                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                if (animatorLoadAnimator != null) {
                                    p0Var = new p0(animatorLoadAnimator);
                                    p0Var2 = p0Var;
                                }
                            } catch (RuntimeException e10) {
                                if (zEquals) {
                                    throw e10;
                                }
                                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                if (animationLoadAnimation2 != null) {
                                    p0Var2 = new p0(animationLoadAnimation2);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f2508d = p0Var2;
        this.f2507c = true;
        return p0Var2;
    }
}
