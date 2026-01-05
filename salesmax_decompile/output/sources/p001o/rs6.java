package p001o;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes3.dex */
public class rs6 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final View f44008a;

    /* renamed from: b */
    public final View f44009b;

    /* renamed from: c */
    public final float[] f44010c = new float[2];

    public rs6(View view, View view2) {
        this.f44008a = view;
        this.f44009b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ss6.m48834a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f44010c);
        View view = this.f44008a;
        if (view != null) {
            view.setAlpha(this.f44010c[0]);
        }
        View view2 = this.f44009b;
        if (view2 != null) {
            view2.setAlpha(this.f44010c[1]);
        }
    }
}
