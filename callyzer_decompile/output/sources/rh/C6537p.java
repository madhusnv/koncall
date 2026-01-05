package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import com.skydoves.balloon.internals.DefinitionKt;
import p013o.j0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rh.p */
/* loaded from: classes.dex */
public final class C6537p extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f31339a;

    /* renamed from: b */
    public final /* synthetic */ TextView f31340b;

    /* renamed from: c */
    public final /* synthetic */ int f31341c;

    /* renamed from: d */
    public final /* synthetic */ TextView f31342d;

    /* renamed from: e */
    public final /* synthetic */ C6538q f31343e;

    public C6537p(C6538q c6538q, int i10, TextView textView, int i11, TextView textView2) {
        this.f31343e = c6538q;
        this.f31339a = i10;
        this.f31340b = textView;
        this.f31341c = i11;
        this.f31342d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j0 j0Var;
        int i10 = this.f31339a;
        C6538q c6538q = this.f31343e;
        c6538q.f31351h = i10;
        c6538q.f31349f = null;
        TextView textView = this.f31340b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f31341c == 1 && (j0Var = c6538q.f31355l) != null) {
                j0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f31342d;
        if (textView2 != null) {
            textView2.setTranslationY(DefinitionKt.NO_Float_VALUE);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f31342d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
