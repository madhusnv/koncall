package p001o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes3.dex */
public class jf9 extends Transition {
    public static /* synthetic */ void J0(View view, ValueAnimator valueAnimator) {
        view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        svhVar.f46008a.put("NavigationRailLabelVisibility", Integer.valueOf(svhVar.f46009b.getVisibility()));
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        svhVar.f46008a.put("NavigationRailLabelVisibility", Integer.valueOf(svhVar.f46009b.getVisibility()));
    }

    @Override // androidx.transition.Transition
    /* renamed from: t */
    public Animator mo9809t(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        if (svhVar == null || svhVar2 == null || svhVar.f46008a.get("NavigationRailLabelVisibility") == null || svhVar2.f46008a.get("NavigationRailLabelVisibility") == null) {
            return super.mo9809t(viewGroup, svhVar, svhVar2);
        }
        if (((Integer) svhVar.f46008a.get("NavigationRailLabelVisibility")).intValue() != 8 || ((Integer) svhVar2.f46008a.get("NavigationRailLabelVisibility")).intValue() != 0) {
            return super.mo9809t(viewGroup, svhVar, svhVar2);
        }
        final View view = svhVar2.f46009b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.if9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                jf9.J0(view, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }
}
