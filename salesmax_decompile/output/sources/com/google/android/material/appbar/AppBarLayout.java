package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.cast.MediaError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.aza;
import p001o.b9e;
import p001o.bkh;
import p001o.cbc;
import p001o.cc;
import p001o.db;
import p001o.dtb;
import p001o.ebe;
import p001o.fy5;
import p001o.gh0;
import p001o.gua;
import p001o.gza;
import p001o.l0j;
import p001o.lk0;
import p001o.pae;
import p001o.pza;
import p001o.r9j;
import p001o.s6c;
import p001o.tq;
import p001o.umb;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.xy5;
import p001o.yya;
import p001o.zya;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC2009b {
    public static final int q0 = pae.Widget_Design_AppBarLayout;

    /* renamed from: H */
    public int f11951H;

    /* renamed from: L */
    public WeakReference f11952L;

    /* renamed from: M */
    public final boolean f11953M;

    /* renamed from: Q */
    public ValueAnimator f11954Q;

    /* renamed from: a */
    public int f11955a;

    /* renamed from: b */
    public int f11956b;

    /* renamed from: c */
    public int f11957c;

    /* renamed from: d */
    public int f11958d;

    /* renamed from: e */
    public boolean f11959e;

    /* renamed from: f */
    public int f11960f;

    /* renamed from: g */
    public r9j f11961g;

    /* renamed from: h */
    public List f11962h;
    public ValueAnimator.AnimatorUpdateListener h0;
    public final List i0;
    public final long j0;
    public final TimeInterpolator k0;
    public int[] l0;
    public Drawable m0;
    public Integer n0;
    public final float o0;
    public Behavior p0;

    /* renamed from: q */
    public boolean f11963q;

    /* renamed from: s */
    public boolean f11964s;

    /* renamed from: x */
    public boolean f11965x;

    /* renamed from: y */
    public boolean f11966y;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: H */
        public ValueAnimator f11967H;

        /* renamed from: L */
        public SavedState f11968L;

        /* renamed from: M */
        public WeakReference f11969M;

        /* renamed from: x */
        public int f11970x;

        /* renamed from: y */
        public int f11971y;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C10923a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f11977a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f11978b;

            public C10923a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f11977a = coordinatorLayout;
                this.f11978b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m13917T(this.f11977a, this.f11978b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public class C10924b extends db {

            /* renamed from: d */
            public final /* synthetic */ AppBarLayout f11980d;

            /* renamed from: e */
            public final /* synthetic */ CoordinatorLayout f11981e;

            public C10924b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f11980d = appBarLayout;
                this.f11981e = coordinatorLayout;
            }

            @Override // p001o.db
            /* renamed from: g */
            public void mo5938g(View view, cc ccVar) {
                View viewJ0;
                super.mo5938g(view, ccVar);
                ccVar.o0(ScrollView.class.getName());
                if (this.f11980d.getTotalScrollRange() == 0 || (viewJ0 = BaseBehavior.this.j0(this.f11981e)) == null || !BaseBehavior.this.f0(this.f11980d)) {
                    return;
                }
                if (BaseBehavior.this.mo13862Q() != (-this.f11980d.getTotalScrollRange())) {
                    ccVar.m20778b(cc.C12624a.f17805q);
                    ccVar.P0(true);
                }
                if (BaseBehavior.this.mo13862Q() != 0) {
                    if (!viewJ0.canScrollVertically(-1)) {
                        ccVar.m20778b(cc.C12624a.f17806r);
                        ccVar.P0(true);
                    } else if ((-this.f11980d.getDownNestedPreScrollRange()) != 0) {
                        ccVar.m20778b(cc.C12624a.f17806r);
                        ccVar.P0(true);
                    }
                }
            }

            @Override // p001o.db
            /* renamed from: j */
            public boolean mo5939j(View view, int i, Bundle bundle) {
                if (i == 4096) {
                    this.f11980d.setExpanded(false);
                    return true;
                }
                if (i != 8192) {
                    return super.mo5939j(view, i, bundle);
                }
                if (BaseBehavior.this.mo13862Q() != 0) {
                    View viewJ0 = BaseBehavior.this.j0(this.f11981e);
                    if (!viewJ0.canScrollVertically(-1)) {
                        this.f11980d.setExpanded(true);
                        return true;
                    }
                    int i2 = -this.f11980d.getDownNestedPreScrollRange();
                    if (i2 != 0) {
                        BaseBehavior.this.mo5784u(this.f11981e, this.f11980d, viewJ0, 0, i2, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        public static boolean e0(int i, int i2) {
            return (i & i2) == i2;
        }

        public static View h0(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        public final void A0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iMo13862Q = mo13862Q() - topInset;
            int iI0 = i0(appBarLayout, iMo13862Q);
            if (iI0 >= 0) {
                View childAt = appBarLayout.getChildAt(iI0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int iM13874c = layoutParams.m13874c();
                if ((iM13874c & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iI0 == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (e0(iM13874c, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (e0(iM13874c, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iMo13862Q < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (e0(iM13874c, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    m13866Z(coordinatorLayout, appBarLayout, pza.m44556b(b0(iMo13862Q, minimumHeight, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void B0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View viewH0 = h0(appBarLayout, i);
            boolean zM13830F = false;
            if (viewH0 != null) {
                int iM13874c = ((LayoutParams) viewH0.getLayoutParams()).m13874c();
                if ((iM13874c & 1) != 0) {
                    int minimumHeight = viewH0.getMinimumHeight();
                    if (i2 <= 0 || (iM13874c & 12) == 0 ? !((iM13874c & 2) == 0 || (-i) < (viewH0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i) >= (viewH0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zM13830F = true;
                    }
                }
            }
            if (appBarLayout.m13848q()) {
                zM13830F = appBarLayout.m13830F(g0(coordinatorLayout));
            }
            boolean zM13827C = appBarLayout.m13827C(zM13830F);
            if (z || (zM13827C && z0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: Q */
        public int mo13862Q() {
            return mo13870I() + this.f11970x;
        }

        /* renamed from: Y */
        public final void m13865Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (wvi.m55101N(coordinatorLayout)) {
                return;
            }
            wvi.m0(coordinatorLayout, new C10924b(appBarLayout, coordinatorLayout));
        }

        /* renamed from: Z */
        public final void m13866Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, float f) {
            int iAbs = Math.abs(mo13862Q() - i);
            float fAbs = Math.abs(f);
            a0(coordinatorLayout, appBarLayout, i, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        public final void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            int iMo13862Q = mo13862Q();
            if (iMo13862Q == i) {
                ValueAnimator valueAnimator = this.f11967H;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f11967H.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f11967H;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f11967H = valueAnimator3;
                valueAnimator3.setInterpolator(gh0.f25150e);
                this.f11967H.addUpdateListener(new C10923a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f11967H.setDuration(Math.min(i2, MediaError.DetailedErrorCode.TEXT_UNKNOWN));
            this.f11967H.setIntValues(iMo13862Q, i);
            this.f11967H.start();
        }

        public final int b0(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public boolean mo13859L(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f11969M;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.m13844m() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        public final boolean f0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).f11983a != 0) {
                    return true;
                }
            }
            return false;
        }

        public final View g0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof dtb) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int i0(AppBarLayout appBarLayout, int i) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (e0(layoutParams.m13874c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        public final View j0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C2012e) childAt.getLayoutParams()).m5798f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: k0, reason: merged with bridge method [inline-methods] */
        public int mo13860O(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: l0, reason: merged with bridge method [inline-methods] */
        public int mo13861P(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        public final int m0(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator interpolatorM13875d = layoutParams.m13875d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i2++;
                } else if (interpolatorM13875d != null) {
                    int iM13874c = layoutParams.m13874c();
                    if ((iM13874c & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        if ((iM13874c & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f = topInset;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolatorM13875d.getInterpolation((iAbs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: n0, reason: merged with bridge method [inline-methods] */
        public void mo13863R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            A0(coordinatorLayout, appBarLayout);
            if (appBarLayout.m13848q()) {
                appBarLayout.m13827C(appBarLayout.m13830F(g0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: o0, reason: merged with bridge method [inline-methods] */
        public boolean mo5779p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            boolean zMo5779p = super.mo5779p(coordinatorLayout, appBarLayout, i);
            int pendingAction = appBarLayout.getPendingAction();
            SavedState savedState = this.f11968L;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i2 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z) {
                            m13866Z(coordinatorLayout, appBarLayout, i2, 0.0f);
                        } else {
                            m13917T(coordinatorLayout, appBarLayout, i2);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            m13866Z(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            m13917T(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (savedState.f11972c) {
                m13917T(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (savedState.f11973d) {
                m13917T(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(savedState.f11974e);
                m13917T(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f11968L.f11976g ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f11968L.f11975f)));
            }
            appBarLayout.m13855z();
            this.f11968L = null;
            mo13871K(pza.m44556b(mo13870I(), -appBarLayout.getTotalScrollRange(), 0));
            B0(coordinatorLayout, appBarLayout, mo13870I(), 0, true);
            appBarLayout.m13851v(mo13870I());
            m13865Y(coordinatorLayout, appBarLayout);
            return zMo5779p;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: p0, reason: merged with bridge method [inline-methods] */
        public boolean mo5780q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2012e) appBarLayout.getLayoutParams())).height != -2) {
                return super.mo5780q(coordinatorLayout, appBarLayout, i, i2, i3, i4);
            }
            coordinatorLayout.m5738N(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: q0, reason: merged with bridge method [inline-methods] */
        public void mo5784u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int downNestedPreScrollRange;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -appBarLayout.getTotalScrollRange();
                    downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i5 = i4;
                int i6 = downNestedPreScrollRange;
                if (i5 != i6) {
                    iArr[1] = m13916S(coordinatorLayout, appBarLayout, i2, i5, i6);
                }
            }
            if (appBarLayout.m13848q()) {
                appBarLayout.m13827C(appBarLayout.m13830F(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: r0, reason: merged with bridge method [inline-methods] */
        public void mo5787x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = m13916S(coordinatorLayout, appBarLayout, i4, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m13865Y(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public void mo5761B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                w0((SavedState) parcelable, true);
                super.mo5761B(coordinatorLayout, appBarLayout, this.f11968L.m5953a());
            } else {
                super.mo5761B(coordinatorLayout, appBarLayout, parcelable);
                this.f11968L = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: t0, reason: merged with bridge method [inline-methods] */
        public Parcelable mo5762C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableMo5762C = super.mo5762C(coordinatorLayout, appBarLayout);
            SavedState savedStateX0 = x0(parcelableMo5762C, appBarLayout);
            return savedStateX0 == null ? parcelableMo5762C : savedStateX0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public boolean mo5764E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (appBarLayout.m13848q() || appBarLayout.m13850s() || d0(coordinatorLayout, appBarLayout, view));
            if (z && (valueAnimator = this.f11967H) != null) {
                valueAnimator.cancel();
            }
            this.f11969M = null;
            this.f11971y = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public void mo5766G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.f11971y == 0 || i == 1) {
                A0(coordinatorLayout, appBarLayout);
                if (appBarLayout.m13848q()) {
                    appBarLayout.m13827C(appBarLayout.m13830F(view));
                }
            }
            this.f11969M = new WeakReference(view);
        }

        public void w0(SavedState savedState, boolean z) {
            if (this.f11968L == null || z) {
                this.f11968L = savedState;
            }
        }

        public SavedState x0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iMo13870I = mo13870I();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iMo13870I;
                if (childAt.getTop() + iMo13870I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f7201b;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iMo13870I == 0;
                    savedState.f11973d = z;
                    savedState.f11972c = !z && (-iMo13870I) >= appBarLayout.getTotalScrollRange();
                    savedState.f11974e = i;
                    savedState.f11976g = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    savedState.f11975f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: y0, reason: merged with bridge method [inline-methods] */
        public int mo13864U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3) {
            int iMo13862Q = mo13862Q();
            int i4 = 0;
            if (i2 == 0 || iMo13862Q < i2 || iMo13862Q > i3) {
                this.f11970x = 0;
            } else {
                int iM44556b = pza.m44556b(i, i2, i3);
                if (iMo13862Q != iM44556b) {
                    int iM0 = appBarLayout.m13842k() ? m0(appBarLayout, iM44556b) : iM44556b;
                    boolean zMo13871K = mo13871K(iM0);
                    int i5 = iMo13862Q - iM44556b;
                    this.f11970x = iM44556b - iM0;
                    if (zMo13871K) {
                        while (i4 < appBarLayout.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) appBarLayout.getChildAt(i4).getLayoutParams();
                            AbstractC10927c abstractC10927cM13873b = layoutParams.m13873b();
                            if (abstractC10927cM13873b != null && (layoutParams.m13874c() & 1) != 0) {
                                abstractC10927cM13873b.mo13887a(appBarLayout, appBarLayout.getChildAt(i4), mo13870I());
                            }
                            i4++;
                        }
                    }
                    if (!zMo13871K && appBarLayout.m13842k()) {
                        coordinatorLayout.m5749p(appBarLayout);
                    }
                    appBarLayout.m13851v(mo13870I());
                    B0(coordinatorLayout, appBarLayout, iM44556b, iM44556b < iMo13862Q ? -1 : 1, false);
                    i4 = i5;
                }
            }
            m13865Y(coordinatorLayout, appBarLayout);
            return i4;
        }

        public final boolean z0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listM5756w = coordinatorLayout.m5756w(appBarLayout);
            int size = listM5756w.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior behaviorM5798f = ((CoordinatorLayout.C2012e) ((View) listM5756w.get(i)).getLayoutParams()).m5798f();
                if (behaviorM5798f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behaviorM5798f).m13921O() != 0;
                }
            }
            return false;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C10922a();

            /* renamed from: c */
            public boolean f11972c;

            /* renamed from: d */
            public boolean f11973d;

            /* renamed from: e */
            public int f11974e;

            /* renamed from: f */
            public float f11975f;

            /* renamed from: g */
            public boolean f11976g;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            public class C10922a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f11972c = parcel.readByte() != 0;
                this.f11973d = parcel.readByte() != 0;
                this.f11974e = parcel.readInt();
                this.f11975f = parcel.readFloat();
                this.f11976g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f11972c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f11973d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f11974e);
                parcel.writeFloat(this.f11975f);
                parcel.writeByte(this.f11976g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo5767H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo5767H(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ int mo13870I() {
            return super.mo13870I();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        /* renamed from: K */
        public /* bridge */ /* synthetic */ boolean mo13871K(int i) {
            return super.mo13871K(i);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: o */
        public /* bridge */ /* synthetic */ boolean mo5778o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.mo5778o(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: o0 */
        public /* bridge */ /* synthetic */ boolean mo5779p(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo5779p(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: p0 */
        public /* bridge */ /* synthetic */ boolean mo5780q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo5780q(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: q0 */
        public /* bridge */ /* synthetic */ void mo5784u(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo5784u(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: r0 */
        public /* bridge */ /* synthetic */ void mo5787x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo5787x(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: s0 */
        public /* bridge */ /* synthetic */ void mo5761B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo5761B(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ Parcelable mo5762C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo5762C(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean mo5764E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo5764E(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void mo5766G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo5766G(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: V */
        public static int m13879V(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behaviorM5798f = ((CoordinatorLayout.C2012e) appBarLayout.getLayoutParams()).m5798f();
            if (behaviorM5798f instanceof BaseBehavior) {
                return ((BaseBehavior) behaviorM5798f).mo13862Q();
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: A */
        public boolean mo5760A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutMo13880L = mo13880L(coordinatorLayout.m5755v(view));
            if (appBarLayoutMo13880L != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f12020d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutMo13880L.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: N */
        public float mo13881N(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iM13879V = m13879V(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iM13879V > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iM13879V / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: P */
        public int mo13882P(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo13882P(view);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public AppBarLayout mo13880L(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: W */
        public final void m13884W(View view, View view2) {
            CoordinatorLayout.Behavior behaviorM5798f = ((CoordinatorLayout.C2012e) view2.getLayoutParams()).m5798f();
            if (behaviorM5798f instanceof BaseBehavior) {
                wvi.m55111X(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behaviorM5798f).f11970x) + m13922Q()) - m13920M(view2));
            }
        }

        /* renamed from: X */
        public final void m13885X(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m13848q()) {
                    appBarLayout.m13827C(appBarLayout.m13830F(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: i */
        public boolean mo5772i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: l */
        public boolean mo5775l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m13884W(view, view2);
            m13885X(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: m */
        public void mo5776m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                wvi.m0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: p */
        public /* bridge */ /* synthetic */ boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo5779p(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: q */
        public /* bridge */ /* synthetic */ boolean mo5780q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo5780q(coordinatorLayout, view, i, i2, i3, i4);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.ScrollingViewBehavior_Layout);
            m13923S(typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C10925a implements cbc {
        public C10925a() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            return AppBarLayout.this.m13852w(r9jVar);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface InterfaceC10926b {
        /* renamed from: a */
        void mo13886a(AppBarLayout appBarLayout, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static abstract class AbstractC10927c {
        /* renamed from: a */
        public abstract void mo13887a(AppBarLayout appBarLayout, View view, float f);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C10928d extends AbstractC10927c {

        /* renamed from: a */
        public final Rect f11987a = new Rect();

        /* renamed from: b */
        public final Rect f11988b = new Rect();

        /* renamed from: b */
        public static void m13888b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC10927c
        /* renamed from: a */
        public void mo13887a(AppBarLayout appBarLayout, View view, float f) {
            m13888b(this.f11987a, appBarLayout, view);
            float fAbs = this.f11987a.top - Math.abs(f);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fM44555a = 1.0f - pza.m44555a(Math.abs(fAbs / this.f11987a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f11987a.height() * 0.3f) * (1.0f - (fM44555a * fM44555a)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f11988b);
            this.f11988b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f11988b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f11988b);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface InterfaceC10929e extends InterfaceC10926b {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m13823t(ColorStateList colorStateList, ColorStateList colorStateList2, zya zyaVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int iM29512k = gua.m29512k(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        zyaVar.g0(ColorStateList.valueOf(iM29512k));
        if (this.m0 != null && (num2 = this.n0) != null && num2.equals(num)) {
            this.m0.setTint(iM29512k);
        }
        if (this.i0.isEmpty()) {
            return;
        }
        Iterator it = this.i0.iterator();
        while (it.hasNext()) {
            tq.m50332a(it.next());
            if (zyaVar.m60096B() != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m13824u(zya zyaVar, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        zyaVar.f0(fFloatValue);
        Drawable drawable = this.m0;
        if (drawable instanceof zya) {
            ((zya) drawable).f0(fFloatValue);
        }
        Iterator it = this.i0.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            zyaVar.m60099E();
            throw null;
        }
    }

    /* renamed from: A */
    public final void m13825A(boolean z, boolean z2, boolean z3) {
        this.f11960f = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    /* renamed from: B */
    public final boolean m13826B(boolean z) {
        if (this.f11964s == z) {
            return false;
        }
        this.f11964s = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: C */
    public boolean m13827C(boolean z) {
        return m13828D(z, !this.f11963q);
    }

    /* renamed from: D */
    public boolean m13828D(boolean z, boolean z2) {
        if (!z2 || this.f11965x == z) {
            return false;
        }
        this.f11965x = z;
        refreshDrawableState();
        if (!m13849r()) {
            return true;
        }
        if (this.f11953M) {
            m13832H(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f11966y) {
            return true;
        }
        m13832H(z ? 0.0f : this.o0, z ? this.o0 : 0.0f);
        return true;
    }

    /* renamed from: E */
    public final boolean m13829E() {
        return this.m0 != null && getTopInset() > 0;
    }

    /* renamed from: F */
    public boolean m13830F(View view) {
        View viewM13838g = m13838g(view);
        if (viewM13838g != null) {
            view = viewM13838g;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* renamed from: G */
    public final boolean m13831G() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || childAt.getFitsSystemWindows()) ? false : true;
    }

    /* renamed from: H */
    public final void m13832H(float f, float f2) {
        ValueAnimator valueAnimator = this.f11954Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f11954Q = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.j0);
        this.f11954Q.setInterpolator(this.k0);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.h0;
        if (animatorUpdateListener != null) {
            this.f11954Q.addUpdateListener(animatorUpdateListener);
        }
        this.f11954Q.start();
    }

    /* renamed from: I */
    public final void m13833I() {
        setWillNotDraw(!m13829E());
    }

    /* renamed from: c */
    public void m13834c(InterfaceC10926b interfaceC10926b) {
        if (this.f11962h == null) {
            this.f11962h = new ArrayList();
        }
        if (interfaceC10926b == null || this.f11962h.contains(interfaceC10926b)) {
            return;
        }
        this.f11962h.add(interfaceC10926b);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void m13835d(InterfaceC10929e interfaceC10929e) {
        m13834c(interfaceC10929e);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m13829E()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f11955a);
            this.m0.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.m0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public final void m13836e() {
        WeakReference weakReference = this.f11952L;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11952L = null;
    }

    /* renamed from: f */
    public final Integer m13837f() {
        Drawable drawable = this.m0;
        if (drawable instanceof zya) {
            return Integer.valueOf(((zya) drawable).m60099E());
        }
        ColorStateList colorStateListM56948g = xy5.m56948g(drawable);
        if (colorStateListM56948g != null) {
            return Integer.valueOf(colorStateListM56948g.getDefaultColor());
        }
        return null;
    }

    /* renamed from: g */
    public final View m13838g(View view) {
        int i;
        if (this.f11952L == null && (i = this.f11951H) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f11951H);
            }
            if (viewFindViewById != null) {
                this.f11952L = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f11952L;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC2009b
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.p0 = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i = this.f11957c;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.f11983a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.f11957c = iMax;
        return iMax;
    }

    public int getDownNestedScrollRange() {
        int i = this.f11958d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int i3 = layoutParams.f11983a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f11958d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f11951H;
    }

    public zya getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof zya) {
            return (zya) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f11960f;
    }

    public Drawable getStatusBarForeground() {
        return this.m0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        r9j r9jVar = this.f11961g;
        if (r9jVar != null) {
            return r9jVar.m46397l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f11956b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.f11983a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f11956b = iMax;
        return iMax;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: k */
    public boolean m13842k() {
        return this.f11959e;
    }

    /* renamed from: l */
    public final boolean m13843l() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).m13876e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean m13844m() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: n */
    public final void m13845n(final zya zyaVar, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer numM29507f = gua.m29507f(getContext(), x5e.colorSurface);
        this.h0 = new ValueAnimator.AnimatorUpdateListener() { // from class: o.lj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f33907a.m13823t(colorStateList, colorStateList2, zyaVar, numM29507f, valueAnimator);
            }
        };
        setBackground(zyaVar);
    }

    /* renamed from: o */
    public final void m13846o(Context context, final zya zyaVar) {
        zyaVar.m60115U(context);
        this.h0 = new ValueAnimator.AnimatorUpdateListener() { // from class: o.mj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f35533a.m13824u(zyaVar, valueAnimator);
            }
        };
        setBackground(zyaVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aza.m18044e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.l0 == null) {
            this.l0 = new int[4];
        }
        int[] iArr = this.l0;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f11964s;
        int i2 = x5e.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (z && this.f11965x) ? x5e.state_lifted : -x5e.state_lifted;
        int i3 = x5e.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (z && this.f11965x) ? x5e.state_collapsed : -x5e.state_collapsed;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m13836e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && m13831G()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                wvi.m55111X(getChildAt(childCount), topInset);
            }
        }
        m13847p();
        this.f11959e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).m13875d() != null) {
                this.f11959e = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.m0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f11963q) {
            return;
        }
        if (!this.f11966y && !m13843l()) {
            z2 = false;
        }
        m13826B(z2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && m13831G()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = pza.m44556b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m13847p();
    }

    /* renamed from: p */
    public final void m13847p() {
        Behavior behavior = this.p0;
        BaseBehavior.SavedState savedStateX0 = (behavior == null || this.f11956b == -1 || this.f11960f != 0) ? null : behavior.x0(AbsSavedState.f7201b, this);
        this.f11956b = -1;
        this.f11957c = -1;
        this.f11958d = -1;
        if (savedStateX0 != null) {
            this.p0.w0(savedStateX0, false);
        }
    }

    /* renamed from: q */
    public boolean m13848q() {
        return this.f11966y;
    }

    /* renamed from: r */
    public final boolean m13849r() {
        return getBackground() instanceof zya;
    }

    /* renamed from: s */
    public boolean m13850s() {
        return this.f11965x;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        aza.m18043d(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, isLaidOut());
    }

    public void setLiftOnScroll(boolean z) {
        this.f11966y = z;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f11951H = -1;
        if (view == null) {
            m13836e();
        } else {
            this.f11952L = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f11951H = i;
        m13836e();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f11963q = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    public void setPendingAction(int i) {
        this.f11960f = i;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.m0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.m0 = drawable != null ? drawable.mutate() : null;
            this.n0 = m13837f();
            Drawable drawable3 = this.m0;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.m0.setState(getDrawableState());
                }
                fy5.m27739m(this.m0, getLayoutDirection());
                this.m0.setVisible(getVisibility() == 0, false);
                this.m0.setCallback(this);
            }
            m13833I();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(lk0.m37353b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) throws Resources.NotFoundException {
        l0j.m36442b(this, f);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.m0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: v */
    public void m13851v(int i) {
        this.f11955a = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f11962h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC10926b interfaceC10926b = (InterfaceC10926b) this.f11962h.get(i2);
                if (interfaceC10926b != null) {
                    interfaceC10926b.mo13886a(this, i);
                }
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.m0;
    }

    /* renamed from: w */
    public r9j m13852w(r9j r9jVar) {
        r9j r9jVar2 = getFitsSystemWindows() ? r9jVar : null;
        if (!s6c.m47909a(this.f11961g, r9jVar2)) {
            this.f11961g = r9jVar2;
            m13833I();
            requestLayout();
        }
        return r9jVar;
    }

    /* renamed from: x */
    public void m13853x(InterfaceC10926b interfaceC10926b) {
        List list = this.f11962h;
        if (list == null || interfaceC10926b == null) {
            return;
        }
        list.remove(interfaceC10926b);
    }

    /* renamed from: y */
    public void m13854y(InterfaceC10929e interfaceC10929e) {
        m13853x(interfaceC10929e);
    }

    /* renamed from: z */
    public void m13855z() {
        this.f11960f = 0;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.appBarLayoutStyle);
    }

    public void setExpanded(boolean z, boolean z2) {
        m13825A(z, z2, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int i2 = q0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f11956b = -1;
        this.f11957c = -1;
        this.f11958d = -1;
        this.f11960f = 0;
        this.i0 = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            l0j.m36441a(this);
        }
        l0j.m36443c(this, attributeSet, i, i2);
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.AppBarLayout, i, i2, new int[0]);
        setBackground(typedArrayM19305i.getDrawable(ebe.AppBarLayout_android_background));
        ColorStateList colorStateListM58494a = yya.m58494a(context2, typedArrayM19305i, ebe.AppBarLayout_liftOnScrollColor);
        this.f11953M = colorStateListM58494a != null;
        ColorStateList colorStateListM56948g = xy5.m56948g(getBackground());
        if (colorStateListM56948g != null) {
            zya zyaVar = new zya();
            zyaVar.g0(colorStateListM56948g);
            if (colorStateListM58494a != null) {
                m13845n(zyaVar, colorStateListM56948g, colorStateListM58494a);
            } else {
                m13846o(context2, zyaVar);
            }
        }
        this.j0 = umb.m51785f(context2, x5e.motionDurationMedium2, getResources().getInteger(b9e.app_bar_elevation_anim_duration));
        this.k0 = umb.m51786g(context2, x5e.motionEasingStandardInterpolator, gh0.f25146a);
        if (typedArrayM19305i.hasValue(ebe.AppBarLayout_expanded)) {
            m13825A(typedArrayM19305i.getBoolean(ebe.AppBarLayout_expanded, false), false, false);
        }
        if (typedArrayM19305i.hasValue(ebe.AppBarLayout_elevation)) {
            l0j.m36442b(this, typedArrayM19305i.getDimensionPixelSize(ebe.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (typedArrayM19305i.hasValue(ebe.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(typedArrayM19305i.getBoolean(ebe.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (typedArrayM19305i.hasValue(ebe.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(typedArrayM19305i.getBoolean(ebe.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.o0 = getResources().getDimension(x6e.design_appbar_elevation);
        this.f11966y = typedArrayM19305i.getBoolean(ebe.AppBarLayout_liftOnScroll, false);
        this.f11951H = typedArrayM19305i.getResourceId(ebe.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayM19305i.getDrawable(ebe.AppBarLayout_statusBarForeground));
        typedArrayM19305i.recycle();
        wvi.x0(this, new C10925a());
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f11983a;

        /* renamed from: b */
        public AbstractC10927c f11984b;

        /* renamed from: c */
        public Interpolator f11985c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11983a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.AppBarLayout_Layout);
            this.f11983a = typedArrayObtainStyledAttributes.getInt(ebe.AppBarLayout_Layout_layout_scrollFlags, 0);
            m13877f(typedArrayObtainStyledAttributes.getInt(ebe.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (typedArrayObtainStyledAttributes.hasValue(ebe.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f11985c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(ebe.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final AbstractC10927c m13872a(int i) {
            if (i != 1) {
                return null;
            }
            return new C10928d();
        }

        /* renamed from: b */
        public AbstractC10927c m13873b() {
            return this.f11984b;
        }

        /* renamed from: c */
        public int m13874c() {
            return this.f11983a;
        }

        /* renamed from: d */
        public Interpolator m13875d() {
            return this.f11985c;
        }

        /* renamed from: e */
        public boolean m13876e() {
            int i = this.f11983a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void m13877f(int i) {
            this.f11984b = m13872a(i);
        }

        /* renamed from: g */
        public void m13878g(int i) {
            this.f11983a = i;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f11983a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11983a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11983a = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11983a = 1;
        }
    }
}
