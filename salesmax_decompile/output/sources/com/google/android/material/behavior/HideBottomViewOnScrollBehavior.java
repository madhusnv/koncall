package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.objectweb.asm.Opcodes;
import p001o.c64;
import p001o.gh0;
import p001o.tq;
import p001o.umb;
import p001o.x5e;

@Deprecated
/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: H */
    public static final int f12073H = x5e.motionDurationLong2;

    /* renamed from: L */
    public static final int f12074L = x5e.motionDurationMedium4;

    /* renamed from: M */
    public static final int f12075M = x5e.motionEasingEmphasizedInterpolator;

    /* renamed from: a */
    public final LinkedHashSet f12076a;

    /* renamed from: b */
    public int f12077b;

    /* renamed from: c */
    public int f12078c;

    /* renamed from: d */
    public TimeInterpolator f12079d;

    /* renamed from: e */
    public TimeInterpolator f12080e;

    /* renamed from: f */
    public int f12081f;

    /* renamed from: g */
    public AccessibilityManager f12082g;

    /* renamed from: h */
    public AccessibilityManager.TouchExplorationStateChangeListener f12083h;

    /* renamed from: q */
    public boolean f12084q;

    /* renamed from: s */
    public int f12085s;

    /* renamed from: x */
    public int f12086x;

    /* renamed from: y */
    public ViewPropertyAnimator f12087y;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class ViewOnAttachStateChangeListenerC10938a implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC10938a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f12083h == null || HideBottomViewOnScrollBehavior.this.f12082g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f12082g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f12083h);
            HideBottomViewOnScrollBehavior.this.f12083h = null;
        }
    }

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    public class C10939b extends AnimatorListenerAdapter {
        public C10939b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f12087y = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f12076a = new LinkedHashSet();
        this.f12081f = 0;
        this.f12084q = true;
        this.f12085s = 2;
        this.f12086x = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m14081R(View view, boolean z) {
        if (z && m14084P()) {
            m14089V(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: E */
    public boolean mo5764E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    /* renamed from: N */
    public final void m14082N(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f12087y = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C10939b());
    }

    /* renamed from: O */
    public final void m14083O(final View view) {
        if (this.f12082g == null) {
            this.f12082g = (AccessibilityManager) c64.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f12082g == null || this.f12083h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.hy7
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                this.f27789a.m14081R(view, z);
            }
        };
        this.f12083h = touchExplorationStateChangeListener;
        this.f12082g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC10938a());
    }

    /* renamed from: P */
    public boolean m14084P() {
        return this.f12085s == 1;
    }

    /* renamed from: Q */
    public boolean m14085Q() {
        return this.f12085s == 2;
    }

    /* renamed from: S */
    public void m14086S(View view, int i) {
        this.f12086x = i;
        if (this.f12085s == 1) {
            view.setTranslationY(this.f12081f + i);
        }
    }

    /* renamed from: T */
    public void m14087T(View view) {
        m14088U(view, true);
    }

    /* renamed from: U */
    public void m14088U(View view, boolean z) {
        AccessibilityManager accessibilityManager;
        if (m14084P()) {
            return;
        }
        if (this.f12084q && (accessibilityManager = this.f12082g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f12087y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m14091X(view, 1);
        int i = this.f12081f + this.f12086x;
        if (z) {
            m14082N(view, i, this.f12078c, this.f12080e);
        } else {
            view.setTranslationY(i);
        }
    }

    /* renamed from: V */
    public void m14089V(View view) {
        m14090W(view, true);
    }

    /* renamed from: W */
    public void m14090W(View view, boolean z) {
        if (m14085Q()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f12087y;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        m14091X(view, 2);
        if (z) {
            m14082N(view, 0, this.f12077b, this.f12079d);
        } else {
            view.setTranslationY(0);
        }
    }

    /* renamed from: X */
    public final void m14091X(View view, int i) {
        this.f12085s = i;
        Iterator it = this.f12076a.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f12081f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f12077b = umb.m51785f(view.getContext(), f12073H, 225);
        this.f12078c = umb.m51785f(view.getContext(), f12074L, Opcodes.DRETURN);
        Context context = view.getContext();
        int i2 = f12075M;
        this.f12079d = umb.m51786g(context, i2, gh0.f25149d);
        this.f12080e = umb.m51786g(view.getContext(), i2, gh0.f25148c);
        m14083O(view);
        return super.mo5779p(coordinatorLayout, view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: x */
    public void mo5787x(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            m14087T(view);
        } else if (i2 < 0) {
            m14089V(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12076a = new LinkedHashSet();
        this.f12081f = 0;
        this.f12084q = true;
        this.f12085s = 2;
        this.f12086x = 0;
    }
}
