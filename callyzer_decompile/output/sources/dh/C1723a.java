package dh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import p8.AbstractC5857r;
import rh.C6535n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dh.a */
/* loaded from: classes.dex */
public final class C1723a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f8364a;

    /* renamed from: b */
    public final /* synthetic */ Object f8365b;

    public /* synthetic */ C1723a(int i10, Object obj) {
        this.f8364a = i10;
        this.f8365b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f8364a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f8365b;
                actionBarOverlayLayout.f1746w = null;
                actionBarOverlayLayout.f1735j = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8364a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f8365b).f6726c = null;
                break;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f8365b;
                actionBarOverlayLayout.f1746w = null;
                actionBarOverlayLayout.f1735j = false;
                break;
            case 2:
                ((AbstractC5857r) this.f8365b).m11456o();
                animator.removeListener(this);
                break;
            default:
                C6535n c6535n = (C6535n) this.f8365b;
                c6535n.f31338c.setChecked(c6535n.f31329j);
                c6535n.f31335p.start();
                break;
        }
    }
}
