package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f13257b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C11180a extends AnimatorListenerAdapter {
        public C11180a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f13257b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: L */
    public boolean mo15591L(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f13257b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo15593N = mo15593N(view, view2, z, z3);
        this.f13257b = animatorSetMo15593N;
        animatorSetMo15593N.addListener(new C11180a());
        this.f13257b.start();
        if (!z2) {
            this.f13257b.end();
        }
        return true;
    }

    /* renamed from: N */
    public abstract AnimatorSet mo15593N(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
