package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
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
import p001o.iy7;
import p001o.jy7;
import p001o.ky7;
import p001o.my7;
import p001o.tq;
import p001o.umb;
import p001o.x5e;

/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: L */
    public static final int f12090L = x5e.motionDurationLong2;

    /* renamed from: M */
    public static final int f12091M = x5e.motionDurationMedium4;

    /* renamed from: Q */
    public static final int f12092Q = x5e.motionEasingEmphasizedInterpolator;

    /* renamed from: H */
    public ViewPropertyAnimator f12093H;

    /* renamed from: a */
    public my7 f12094a;

    /* renamed from: b */
    public AccessibilityManager f12095b;

    /* renamed from: c */
    public AccessibilityManager.TouchExplorationStateChangeListener f12096c;

    /* renamed from: d */
    public boolean f12097d;

    /* renamed from: e */
    public final LinkedHashSet f12098e;

    /* renamed from: f */
    public int f12099f;

    /* renamed from: g */
    public int f12100g;

    /* renamed from: h */
    public TimeInterpolator f12101h;

    /* renamed from: q */
    public TimeInterpolator f12102q;

    /* renamed from: s */
    public int f12103s;

    /* renamed from: x */
    public int f12104x;

    /* renamed from: y */
    public int f12105y;

    /* renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$a */
    public class ViewOnAttachStateChangeListenerC10940a implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC10940a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f12096c == null || HideViewOnScrollBehavior.this.f12095b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f12095b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f12096c);
            HideViewOnScrollBehavior.this.f12096c = null;
        }
    }

    /* renamed from: com.google.android.material.behavior.HideViewOnScrollBehavior$b */
    public class C10941b extends AnimatorListenerAdapter {
        public C10941b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f12093H = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f12097d = true;
        this.f12098e = new LinkedHashSet();
        this.f12103s = 0;
        this.f12104x = 2;
        this.f12105y = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m14097T(View view, boolean z) {
        if (this.f12097d && z && m14103S()) {
            m14106W(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: E */
    public boolean mo5764E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    /* renamed from: N */
    public final void m14098N(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f12093H = this.f12094a.mo32912d(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C10941b());
    }

    /* renamed from: O */
    public final void m14099O(final View view) {
        if (this.f12095b == null) {
            this.f12095b = (AccessibilityManager) c64.getSystemService(view.getContext(), AccessibilityManager.class);
        }
        if (this.f12095b == null || this.f12096c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.ly7
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                this.f34512a.m14097T(view, z);
            }
        };
        this.f12096c = touchExplorationStateChangeListener;
        this.f12095b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC10940a());
    }

    /* renamed from: P */
    public final boolean m14100P(int i) {
        return i == 80 || i == 81;
    }

    /* renamed from: Q */
    public final boolean m14101Q(int i) {
        return i == 3 || i == 19;
    }

    /* renamed from: R */
    public boolean m14102R() {
        return this.f12104x == 2;
    }

    /* renamed from: S */
    public boolean m14103S() {
        return this.f12104x == 1;
    }

    /* renamed from: U */
    public void m14104U(int i) {
        my7 my7Var = this.f12094a;
        if (my7Var == null || my7Var.mo32911c() != i) {
            if (i == 0) {
                this.f12094a = new ky7();
                return;
            }
            if (i == 1) {
                this.f12094a = new iy7();
                return;
            }
            if (i == 2) {
                this.f12094a = new jy7();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0, 1 or 2.");
        }
    }

    /* renamed from: V */
    public final void m14105V(View view, int i) {
        int i2 = ((CoordinatorLayout.C2012e) view.getLayoutParams()).f7097c;
        if (m14100P(i2)) {
            m14104U(1);
        } else {
            m14104U(m14101Q(Gravity.getAbsoluteGravity(i2, i)) ? 2 : 0);
        }
    }

    /* renamed from: W */
    public void m14106W(View view) {
        m14107X(view, true);
    }

    /* renamed from: X */
    public void m14107X(View view, boolean z) {
        if (m14102R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f12093H;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        a0(view, 2);
        int iMo32910b = this.f12094a.mo32910b();
        if (z) {
            m14098N(view, iMo32910b, this.f12099f, this.f12101h);
        } else {
            this.f12094a.mo32913e(view, iMo32910b);
        }
    }

    /* renamed from: Y */
    public void m14108Y(View view) {
        m14109Z(view, true);
    }

    /* renamed from: Z */
    public void m14109Z(View view, boolean z) {
        AccessibilityManager accessibilityManager;
        if (m14103S()) {
            return;
        }
        if (this.f12097d && (accessibilityManager = this.f12095b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f12093H;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        a0(view, 1);
        int i = this.f12103s + this.f12105y;
        if (z) {
            m14098N(view, i, this.f12100g, this.f12102q);
        } else {
            view.setTranslationY(i);
        }
    }

    public final void a0(View view, int i) {
        this.f12104x = i;
        Iterator it = this.f12098e.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
        m14099O(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        m14105V(view, i);
        this.f12103s = this.f12094a.mo32909a(view, marginLayoutParams);
        this.f12099f = umb.m51785f(view.getContext(), f12090L, 225);
        this.f12100g = umb.m51785f(view.getContext(), f12091M, Opcodes.DRETURN);
        Context context = view.getContext();
        int i2 = f12092Q;
        this.f12101h = umb.m51786g(context, i2, gh0.f25149d);
        this.f12102q = umb.m51786g(view.getContext(), i2, gh0.f25148c);
        return super.mo5779p(coordinatorLayout, view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: x */
    public void mo5787x(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            m14108Y(view);
        } else if (i2 < 0) {
            m14106W(view);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12097d = true;
        this.f12098e = new LinkedHashSet();
        this.f12103s = 0;
        this.f12104x = 2;
        this.f12105y = 0;
    }
}
