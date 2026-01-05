package y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.c */
/* loaded from: classes.dex */
public final class C8568c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f41583a = 1;

    /* renamed from: b */
    public final /* synthetic */ t0 f41584b;

    /* renamed from: c */
    public final /* synthetic */ View f41585c;

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f41586d;

    /* renamed from: e */
    public final /* synthetic */ C8573h f41587e;

    public C8568c(C8573h c8573h, t0 t0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f41587e = c8573h;
        this.f41584b = t0Var;
        this.f41586d = viewPropertyAnimator;
        this.f41585c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f41583a) {
            case 1:
                this.f41585c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41583a) {
            case 0:
                this.f41586d.setListener(null);
                this.f41585c.setAlpha(1.0f);
                C8573h c8573h = this.f41587e;
                t0 t0Var = this.f41584b;
                c8573h.m15837c(t0Var);
                c8573h.f41654q.remove(t0Var);
                c8573h.m15862i();
                break;
            default:
                this.f41586d.setListener(null);
                C8573h c8573h2 = this.f41587e;
                t0 t0Var2 = this.f41584b;
                c8573h2.m15837c(t0Var2);
                c8573h2.f41652o.remove(t0Var2);
                c8573h2.m15862i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f41583a) {
            case 0:
                this.f41587e.getClass();
                break;
            default:
                this.f41587e.getClass();
                break;
        }
    }

    public C8568c(C8573h c8573h, t0 t0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f41587e = c8573h;
        this.f41584b = t0Var;
        this.f41585c = view;
        this.f41586d = viewPropertyAnimator;
    }
}
