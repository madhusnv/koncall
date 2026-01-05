package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import c6.ViewTreeObserverOnPreDrawListenerC0895y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends AnimationSet implements Runnable {

    /* renamed from: a */
    public final ViewGroup f2680a;

    /* renamed from: b */
    public final View f2681b;

    /* renamed from: c */
    public boolean f2682c;

    /* renamed from: d */
    public boolean f2683d;

    /* renamed from: e */
    public boolean f2684e;

    public q0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2684e = true;
        this.f2680a = viewGroup;
        this.f2681b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation) {
        this.f2684e = true;
        if (this.f2682c) {
            return !this.f2683d;
        }
        if (!super.getTransformation(j6, transformation)) {
            this.f2682c = true;
            ViewTreeObserverOnPreDrawListenerC0895y.m2535a(this.f2680a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6 = this.f2682c;
        ViewGroup viewGroup = this.f2680a;
        if (z6 || !this.f2684e) {
            viewGroup.endViewTransition(this.f2681b);
            this.f2683d = true;
        } else {
            this.f2684e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j6, Transformation transformation, float f6) {
        this.f2684e = true;
        if (this.f2682c) {
            return !this.f2683d;
        }
        if (!super.getTransformation(j6, transformation, f6)) {
            this.f2682c = true;
            ViewTreeObserverOnPreDrawListenerC0895y.m2535a(this.f2680a, this);
        }
        return true;
    }
}
