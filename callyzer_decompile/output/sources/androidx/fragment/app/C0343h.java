package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import p004e.C1866a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public final class C0343h extends g2 {

    /* renamed from: c */
    public final C0341f f2541c;

    /* renamed from: d */
    public AnimatorSet f2542d;

    public C0343h(C0341f c0341f) {
        this.f2541c = c0341f;
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: b */
    public final void mo1130b(ViewGroup container) {
        AbstractC4154l.m8923f(container, "container");
        AnimatorSet animatorSet = this.f2542d;
        C0341f c0341f = this.f2541c;
        if (animatorSet == null) {
            c0341f.f2605a.m1139c(this);
            return;
        }
        h2 h2Var = c0341f.f2605a;
        if (!h2Var.f2551g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0345j.f2562a.m1142a(animatorSet);
        }
        if (j1.m1152K(2)) {
            h2Var.toString();
        }
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: c */
    public final void mo1131c(ViewGroup container) {
        AbstractC4154l.m8923f(container, "container");
        h2 h2Var = this.f2541c.f2605a;
        AnimatorSet animatorSet = this.f2542d;
        if (animatorSet == null) {
            h2Var.m1139c(this);
            return;
        }
        animatorSet.start();
        if (j1.m1152K(2)) {
            Objects.toString(h2Var);
        }
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: d */
    public final void mo1135d(C1866a backEvent, ViewGroup container) {
        AbstractC4154l.m8923f(backEvent, "backEvent");
        AbstractC4154l.m8923f(container, "container");
        h2 h2Var = this.f2541c.f2605a;
        AnimatorSet animatorSet = this.f2542d;
        if (animatorSet == null) {
            h2Var.m1139c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !h2Var.f2547c.mTransitioning) {
            return;
        }
        if (j1.m1152K(2)) {
            h2Var.toString();
        }
        long jM1141a = C0344i.f2557a.m1141a(animatorSet);
        long j6 = (long) (backEvent.f8857c * jM1141a);
        if (j6 == 0) {
            j6 = 1;
        }
        if (j6 == jM1141a) {
            j6 = jM1141a - 1;
        }
        if (j1.m1152K(2)) {
            animatorSet.toString();
            h2Var.toString();
        }
        C0345j.f2562a.m1143b(animatorSet, j6);
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: e */
    public final void mo1136e(ViewGroup container) throws Resources.NotFoundException {
        C0343h c0343h;
        AbstractC4154l.m8923f(container, "container");
        C0341f c0341f = this.f2541c;
        if (c0341f.m1204a()) {
            return;
        }
        Context context = container.getContext();
        AbstractC4154l.m8922e(context, "context");
        p0 p0VarM1133b = c0341f.m1133b(context);
        this.f2542d = p0VarM1133b != null ? (AnimatorSet) p0VarM1133b.f2658b : null;
        h2 h2Var = c0341f.f2605a;
        j0 j0Var = h2Var.f2547c;
        boolean z6 = h2Var.f2545a == l2.GONE;
        View view = j0Var.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f2542d;
        if (animatorSet != null) {
            c0343h = this;
            animatorSet.addListener(new C0342g(container, view, z6, h2Var, c0343h));
        } else {
            c0343h = this;
        }
        AnimatorSet animatorSet2 = c0343h.f2542d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
