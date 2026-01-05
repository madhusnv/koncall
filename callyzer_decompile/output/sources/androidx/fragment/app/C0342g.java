package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public final class C0342g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2531a;

    /* renamed from: b */
    public final /* synthetic */ View f2532b;

    /* renamed from: c */
    public final /* synthetic */ boolean f2533c;

    /* renamed from: d */
    public final /* synthetic */ h2 f2534d;

    /* renamed from: e */
    public final /* synthetic */ C0343h f2535e;

    public C0342g(ViewGroup viewGroup, View view, boolean z6, h2 h2Var, C0343h c0343h) {
        this.f2531a = viewGroup;
        this.f2532b = view;
        this.f2533c = z6;
        this.f2534d = h2Var;
        this.f2535e = c0343h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        AbstractC4154l.m8923f(anim, "anim");
        ViewGroup viewGroup = this.f2531a;
        View viewToAnimate = this.f2532b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z6 = this.f2533c;
        h2 h2Var = this.f2534d;
        if (z6) {
            l2 l2Var = h2Var.f2545a;
            AbstractC4154l.m8922e(viewToAnimate, "viewToAnimate");
            l2Var.applyState(viewToAnimate, viewGroup);
        }
        C0343h c0343h = this.f2535e;
        c0343h.f2541c.f2605a.m1139c(c0343h);
        if (j1.m1152K(2)) {
            Objects.toString(h2Var);
        }
    }
}
