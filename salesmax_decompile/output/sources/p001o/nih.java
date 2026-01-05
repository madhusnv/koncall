package p001o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;

/* loaded from: classes3.dex */
public class nih extends Transition {

    /* renamed from: o.nih$a */
    public class C15592a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f36896a;

        public C15592a(TextView textView) {
            this.f36896a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f36896a.setScaleX(fFloatValue);
            this.f36896a.setScaleY(fFloatValue);
        }
    }

    public final void I0(svh svhVar) {
        View view = svhVar.f46009b;
        if (view instanceof TextView) {
            svhVar.f46008a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        I0(svhVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        I0(svhVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: t */
    public Animator mo9809t(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        if (svhVar == null || svhVar2 == null || !(svhVar.f46009b instanceof TextView)) {
            return null;
        }
        View view = svhVar2.f46009b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = svhVar.f46008a;
        Map map2 = svhVar2.f46008a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new C15592a(textView));
        return valueAnimatorOfFloat;
    }
}
