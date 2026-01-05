package y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.e */
/* loaded from: classes.dex */
public final class C8570e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f41604a;

    /* renamed from: b */
    public final /* synthetic */ C8571f f41605b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f41606c;

    /* renamed from: d */
    public final /* synthetic */ View f41607d;

    /* renamed from: e */
    public final /* synthetic */ C8573h f41608e;

    public /* synthetic */ C8570e(C8573h c8573h, C8571f c8571f, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f41604a = i10;
        this.f41608e = c8573h;
        this.f41605b = c8571f;
        this.f41606c = viewPropertyAnimator;
        this.f41607d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41604a) {
            case 0:
                this.f41606c.setListener(null);
                View view = this.f41607d;
                view.setAlpha(1.0f);
                view.setTranslationX(DefinitionKt.NO_Float_VALUE);
                view.setTranslationY(DefinitionKt.NO_Float_VALUE);
                C8571f c8571f = this.f41605b;
                t0 t0Var = c8571f.f41613a;
                C8573h c8573h = this.f41608e;
                c8573h.m15837c(t0Var);
                c8573h.f41655r.remove(c8571f.f41613a);
                c8573h.m15862i();
                break;
            default:
                this.f41606c.setListener(null);
                View view2 = this.f41607d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(DefinitionKt.NO_Float_VALUE);
                view2.setTranslationY(DefinitionKt.NO_Float_VALUE);
                C8571f c8571f2 = this.f41605b;
                t0 t0Var2 = c8571f2.f41614b;
                C8573h c8573h2 = this.f41608e;
                c8573h2.m15837c(t0Var2);
                c8573h2.f41655r.remove(c8571f2.f41614b);
                c8573h2.m15862i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f41604a) {
            case 0:
                t0 t0Var = this.f41605b.f41613a;
                this.f41608e.getClass();
                break;
            default:
                t0 t0Var2 = this.f41605b.f41614b;
                this.f41608e.getClass();
                break;
        }
    }
}
