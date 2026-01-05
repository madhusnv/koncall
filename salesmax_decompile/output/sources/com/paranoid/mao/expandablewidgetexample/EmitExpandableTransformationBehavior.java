package com.paranoid.mao.expandablewidgetexample;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import java.util.List;
import p001o.id5;
import p001o.kf9;
import p001o.kh3;
import p001o.lwi;
import p001o.nl7;
import p001o.qef;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class EmitExpandableTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public static final C11890a f13580c = new C11890a(null);

    /* renamed from: com.paranoid.mao.expandablewidgetexample.EmitExpandableTransformationBehavior$a */
    public static final class C11890a {
        public C11890a() {
        }

        public /* synthetic */ C11890a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.paranoid.mao.expandablewidgetexample.EmitExpandableTransformationBehavior$b */
    public static final class C11891b extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ PropertyValuesHolder f13581a;

        /* renamed from: b */
        public final /* synthetic */ PropertyValuesHolder f13582b;

        /* renamed from: c */
        public final /* synthetic */ PropertyValuesHolder f13583c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11891b(PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2, PropertyValuesHolder propertyValuesHolder3) {
            super(2);
            this.f13581a = propertyValuesHolder;
            this.f13582b = propertyValuesHolder2;
            this.f13583c = propertyValuesHolder3;
        }

        /* renamed from: a */
        public final ObjectAnimator m15963a(View view, long j) {
            sq8.m48649h(view, "view");
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, this.f13581a, this.f13582b, this.f13583c);
            objectAnimatorOfPropertyValuesHolder.setDuration(150L);
            objectAnimatorOfPropertyValuesHolder.setStartDelay(j);
            return objectAnimatorOfPropertyValuesHolder;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m15963a((View) obj, ((Number) obj2).longValue());
        }
    }

    /* renamed from: com.paranoid.mao.expandablewidgetexample.EmitExpandableTransformationBehavior$c */
    public static final class C11892c extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ PropertyValuesHolder f13584a;

        /* renamed from: b */
        public final /* synthetic */ PropertyValuesHolder f13585b;

        /* renamed from: c */
        public final /* synthetic */ PropertyValuesHolder f13586c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11892c(PropertyValuesHolder propertyValuesHolder, PropertyValuesHolder propertyValuesHolder2, PropertyValuesHolder propertyValuesHolder3) {
            super(2);
            this.f13584a = propertyValuesHolder;
            this.f13585b = propertyValuesHolder2;
            this.f13586c = propertyValuesHolder3;
        }

        /* renamed from: a */
        public final ObjectAnimator m15964a(View view, long j) {
            sq8.m48649h(view, "view");
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, this.f13584a, this.f13585b, this.f13586c);
            objectAnimatorOfPropertyValuesHolder.setDuration(150L);
            objectAnimatorOfPropertyValuesHolder.setStartDelay(j);
            return objectAnimatorOfPropertyValuesHolder;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m15964a((View) obj, ((Number) obj2).longValue());
        }
    }

    /* renamed from: com.paranoid.mao.expandablewidgetexample.EmitExpandableTransformationBehavior$d */
    public static final class C11893d implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f13587a;

        /* renamed from: b */
        public final /* synthetic */ View f13588b;

        /* renamed from: c */
        public final /* synthetic */ boolean f13589c;

        /* renamed from: d */
        public final /* synthetic */ View f13590d;

        public C11893d(boolean z, View view, boolean z2, View view2) {
            this.f13587a = z;
            this.f13588b = view;
            this.f13589c = z2;
            this.f13590d = view2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13587a) {
                return;
            }
            this.f13588b.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f13589c) {
                this.f13590d.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmitExpandableTransformationBehavior() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: N */
    public AnimatorSet mo15593N(View view, View view2, boolean z, boolean z2) {
        sq8.m48649h(view, "dependency");
        sq8.m48649h(view2, "child");
        if (!(view2 instanceof ViewGroup)) {
            return new AnimatorSet();
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            m15962P((ViewGroup) view2, z2, arrayList);
        } else {
            m15961O((ViewGroup) view2, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C11893d(z, view2, z, view2));
        return animatorSet;
    }

    /* renamed from: O */
    public final void m15961O(ViewGroup viewGroup, List list) {
        int childCount = viewGroup.getChildCount();
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            arrayList.add(Long.valueOf(i * 60));
        }
        List listM45302A = qef.m45302A(qef.m45305D(lwi.m38080a(viewGroup), kh3.m35706V(arrayList), new C11891b(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.4f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.4f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f))));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listM45302A);
        list.add(animatorSet);
    }

    /* renamed from: P */
    public final void m15962P(ViewGroup viewGroup, boolean z, List list) {
        if (!z) {
            for (View view : lwi.m38080a(viewGroup)) {
                view.setAlpha(0.0f);
                view.setScaleX(0.4f);
                view.setScaleY(0.4f);
            }
        }
        int childCount = viewGroup.getChildCount();
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            arrayList.add(Long.valueOf(i * 60));
        }
        List listM45302A = qef.m45302A(qef.m45305D(lwi.m38080a(viewGroup), kh3.m35706V(kh3.B0(arrayList)), new C11892c(PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f))));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listM45302A);
        list.add(animatorSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: i */
    public boolean mo5772i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        sq8.m48649h(coordinatorLayout, "parent");
        sq8.m48649h(view, "child");
        sq8.m48649h(view2, "dependency");
        return (view2 instanceof FloatingActionButton) && (view instanceof ViewGroup);
    }

    public /* synthetic */ EmitExpandableTransformationBehavior(Context context, AttributeSet attributeSet, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : context, (i & 2) != 0 ? null : attributeSet);
    }

    public EmitExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
