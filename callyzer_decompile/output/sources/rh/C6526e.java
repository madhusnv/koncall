package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.e */
/* loaded from: classes.dex */
public final class C6526e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f31303a;

    /* renamed from: b */
    public final /* synthetic */ C6528g f31304b;

    public /* synthetic */ C6526e(C6528g c6528g, int i10) {
        this.f31303a = i10;
        this.f31304b = c6528g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        switch (this.f31303a) {
            case 1:
                this.f31304b.f31336a.setEndIconVisible(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) throws Resources.NotFoundException {
        switch (this.f31303a) {
            case 0:
                this.f31304b.f31336a.setEndIconVisible(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
