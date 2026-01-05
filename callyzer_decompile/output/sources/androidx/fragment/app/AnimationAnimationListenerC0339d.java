package androidx.fragment.app;

import a1.RunnableC0025x;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.d */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0339d implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ h2 f2484a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f2485b;

    /* renamed from: c */
    public final /* synthetic */ View f2486c;

    /* renamed from: d */
    public final /* synthetic */ C0340e f2487d;

    public AnimationAnimationListenerC0339d(h2 h2Var, ViewGroup viewGroup, View view, C0340e c0340e) {
        this.f2484a = h2Var;
        this.f2485b = viewGroup;
        this.f2486c = view;
        this.f2487d = c0340e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC4154l.m8923f(animation, "animation");
        ViewGroup viewGroup = this.f2485b;
        viewGroup.post(new RunnableC0025x(1, viewGroup, this.f2486c, this.f2487d));
        if (j1.m1152K(2)) {
            Objects.toString(this.f2484a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC4154l.m8923f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC4154l.m8923f(animation, "animation");
        if (j1.m1152K(2)) {
            Objects.toString(this.f2484a);
        }
    }
}
