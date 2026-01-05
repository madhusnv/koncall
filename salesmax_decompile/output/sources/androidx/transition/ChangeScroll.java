package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p001o.svh;

/* loaded from: classes2.dex */
public class ChangeScroll extends Transition {
    public static final String[] E0 = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void I0(svh svhVar) {
        svhVar.f46008a.put("android:changeScroll:x", Integer.valueOf(svhVar.f46009b.getScrollX()));
        svhVar.f46008a.put("android:changeScroll:y", Integer.valueOf(svhVar.f46009b.getScrollY()));
    }

    @Override // androidx.transition.Transition
    /* renamed from: R */
    public String[] mo9805R() {
        return E0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        return true;
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
        ObjectAnimator objectAnimatorOfInt;
        ObjectAnimator objectAnimatorOfInt2 = null;
        if (svhVar == null || svhVar2 == null) {
            return null;
        }
        View view = svhVar2.f46009b;
        int iIntValue = ((Integer) svhVar.f46008a.get("android:changeScroll:x")).intValue();
        int iIntValue2 = ((Integer) svhVar2.f46008a.get("android:changeScroll:x")).intValue();
        int iIntValue3 = ((Integer) svhVar.f46008a.get("android:changeScroll:y")).intValue();
        int iIntValue4 = ((Integer) svhVar2.f46008a.get("android:changeScroll:y")).intValue();
        if (iIntValue != iIntValue2) {
            view.setScrollX(iIntValue);
            objectAnimatorOfInt = ObjectAnimator.ofInt(view, "scrollX", iIntValue, iIntValue2);
        } else {
            objectAnimatorOfInt = null;
        }
        if (iIntValue3 != iIntValue4) {
            view.setScrollY(iIntValue3);
            objectAnimatorOfInt2 = ObjectAnimator.ofInt(view, "scrollY", iIntValue3, iIntValue4);
        }
        return AbstractC2525d.m9956c(objectAnimatorOfInt, objectAnimatorOfInt2);
    }
}
