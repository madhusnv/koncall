package p8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import b9.AbstractC0630b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AnimatorListenerAdapter implements InterfaceC5856q {

    /* renamed from: a */
    public final View f28557a;

    /* renamed from: b */
    public final int f28558b;

    /* renamed from: c */
    public final ViewGroup f28559c;

    /* renamed from: e */
    public boolean f28561e;

    /* renamed from: f */
    public boolean f28562f = false;

    /* renamed from: d */
    public final boolean f28560d = true;

    public e0(int i10, View view) {
        this.f28557a = view;
        this.f28558b = i10;
        this.f28559c = (ViewGroup) view.getParent();
        m11425f(true);
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: a */
    public final void mo11420a() {
        m11425f(false);
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: d */
    public final void mo11421d() {
        m11425f(true);
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: e */
    public final void mo11422e(AbstractC5857r abstractC5857r) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f28562f) {
            AbstractC5865z.f28643a.mo10746b(this.f28558b, this.f28557a);
            ViewGroup viewGroup = this.f28559c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m11425f(false);
        abstractC5857r.m11461y(this);
    }

    /* renamed from: f */
    public final void m11425f(boolean z6) {
        ViewGroup viewGroup;
        if (!this.f28560d || this.f28561e == z6 || (viewGroup = this.f28559c) == null) {
            return;
        }
        this.f28561e = z6;
        AbstractC0630b.m1806o(viewGroup, z6);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f28562f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f28562f) {
            AbstractC5865z.f28643a.mo10746b(this.f28558b, this.f28557a);
            ViewGroup viewGroup = this.f28559c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m11425f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (this.f28562f) {
            return;
        }
        AbstractC5865z.f28643a.mo10746b(this.f28558b, this.f28557a);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (this.f28562f) {
            return;
        }
        AbstractC5865z.f28643a.mo10746b(0, this.f28557a);
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: b */
    public final void mo11423b() {
    }

    @Override // p8.InterfaceC5856q
    /* renamed from: c */
    public final void mo11424c(AbstractC5857r abstractC5857r) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
