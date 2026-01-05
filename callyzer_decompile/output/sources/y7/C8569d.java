package y7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.d */
/* loaded from: classes.dex */
public final class C8569d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ t0 f41594a;

    /* renamed from: b */
    public final /* synthetic */ int f41595b;

    /* renamed from: c */
    public final /* synthetic */ View f41596c;

    /* renamed from: d */
    public final /* synthetic */ int f41597d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f41598e;

    /* renamed from: f */
    public final /* synthetic */ C8573h f41599f;

    public C8569d(C8573h c8573h, t0 t0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f41599f = c8573h;
        this.f41594a = t0Var;
        this.f41595b = i10;
        this.f41596c = view;
        this.f41597d = i11;
        this.f41598e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f41595b;
        View view = this.f41596c;
        if (i10 != 0) {
            view.setTranslationX(DefinitionKt.NO_Float_VALUE);
        }
        if (this.f41597d != 0) {
            view.setTranslationY(DefinitionKt.NO_Float_VALUE);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f41598e.setListener(null);
        C8573h c8573h = this.f41599f;
        t0 t0Var = this.f41594a;
        c8573h.m15837c(t0Var);
        c8573h.f41653p.remove(t0Var);
        c8573h.m15862i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f41599f.getClass();
    }
}
