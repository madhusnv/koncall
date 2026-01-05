package c6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import e1.C1903e;
import p8.AbstractC5857r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f5418a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f5419b;

    /* renamed from: c */
    public final /* synthetic */ Object f5420c;

    public a1(View view, i1 i1Var) {
        this.f5419b = i1Var;
        this.f5420c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5418a) {
            case 0:
                i1 i1Var = (i1) this.f5419b;
                i1Var.f5469a.mo2387c(1.0f);
                d1.m2348d((View) this.f5420c, i1Var);
                break;
            default:
                ((C1903e) this.f5419b).remove(animator);
                ((AbstractC5857r) this.f5420c).f28617l.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f5418a) {
            case 1:
                ((AbstractC5857r) this.f5420c).f28617l.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public a1(AbstractC5857r abstractC5857r, C1903e c1903e) {
        this.f5420c = abstractC5857r;
        this.f5419b = c1903e;
    }
}
