package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p001o.lh0;
import p001o.tmb;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final tmb f13278c;

    /* renamed from: d */
    public final tmb f13279d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C11186a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f13280a;

        /* renamed from: b */
        public final /* synthetic */ View f13281b;

        public C11186a(boolean z, View view) {
            this.f13280a = z;
            this.f13281b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13280a) {
                return;
            }
            this.f13281b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f13280a) {
                this.f13281b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f13278c = new tmb(75L, 150L);
        this.f13279d = new tmb(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: H */
    public boolean mo5767H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo5767H(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: N */
    public AnimatorSet mo15593N(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m15606O(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        lh0.m37166a(animatorSet, arrayList);
        animatorSet.addListener(new C11186a(z, view2));
        return animatorSet;
    }

    /* renamed from: O */
    public final void m15606O(View view, boolean z, boolean z2, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        tmb tmbVar = z ? this.f13278c : this.f13279d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        tmbVar.m50200a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: i */
    public boolean mo5772i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13278c = new tmb(75L, 150L);
        this.f13279d = new tmb(0L, 150L);
    }
}
