package androidx.fragment.app;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.e */
/* loaded from: classes.dex */
public final class C0340e extends g2 {

    /* renamed from: c */
    public final C0341f f2497c;

    public C0340e(C0341f c0341f) {
        this.f2497c = c0341f;
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: b */
    public final void mo1130b(ViewGroup container) {
        AbstractC4154l.m8923f(container, "container");
        C0341f c0341f = this.f2497c;
        h2 h2Var = c0341f.f2605a;
        View view = h2Var.f2547c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        c0341f.f2605a.m1139c(this);
        if (j1.m1152K(2)) {
            h2Var.toString();
        }
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: c */
    public final void mo1131c(ViewGroup container) throws Resources.NotFoundException {
        AbstractC4154l.m8923f(container, "container");
        C0341f c0341f = this.f2497c;
        h2 h2Var = c0341f.f2605a;
        if (c0341f.m1204a()) {
            h2Var.m1139c(this);
            return;
        }
        Context context = container.getContext();
        View view = h2Var.f2547c.mView;
        AbstractC4154l.m8922e(context, "context");
        p0 p0VarM1133b = c0341f.m1133b(context);
        if (p0VarM1133b == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) p0VarM1133b.f2657a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (h2Var.f2545a != l2.REMOVED) {
            view.startAnimation(animation);
            h2Var.m1139c(this);
            return;
        }
        container.startViewTransition(view);
        q0 q0Var = new q0(animation, container, view);
        q0Var.setAnimationListener(new AnimationAnimationListenerC0339d(h2Var, container, view, this));
        view.startAnimation(q0Var);
        if (j1.m1152K(2)) {
            h2Var.toString();
        }
    }
}
