package com.google.android.material.navigationrail;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.transition.AbstractC2524c;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.google.android.gms.common.api.Api;
import com.google.android.material.navigation.NavigationBarDividerView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;
import p001o.anh;
import p001o.bkh;
import p001o.ebe;
import p001o.gh0;
import p001o.jf9;
import p001o.pae;
import p001o.r9j;
import p001o.sj8;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;
import p001o.yya;

/* loaded from: classes3.dex */
public class NavigationRailView extends NavigationBarView {
    public static final TimeInterpolator q0 = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);

    /* renamed from: H */
    public Boolean f12783H;

    /* renamed from: L */
    public Boolean f12784L;

    /* renamed from: M */
    public Boolean f12785M;

    /* renamed from: Q */
    public boolean f12786Q;

    /* renamed from: f */
    public final int f12787f;

    /* renamed from: g */
    public final int f12788g;

    /* renamed from: h */
    public final int f12789h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public NavigationRailFrameLayout p0;

    /* renamed from: q */
    public final int f12790q;

    /* renamed from: s */
    public final boolean f12791s;

    /* renamed from: x */
    public boolean f12792x;

    /* renamed from: y */
    public View f12793y;

    /* renamed from: com.google.android.material.navigationrail.NavigationRailView$a */
    public class C11086a implements xzi.InterfaceC18287d {
        public C11086a() {
        }

        @Override // p001o.xzi.InterfaceC18287d
        /* renamed from: a */
        public r9j mo14146a(View view, r9j r9jVar, xzi.C18288e c18288e) {
            sj8 sj8VarM46391f = r9jVar.m46391f(r9j.C16576m.m46449e());
            sj8 sj8VarM46391f2 = r9jVar.m46391f(r9j.C16576m.m46445a());
            NavigationRailView navigationRailView = NavigationRailView.this;
            if (navigationRailView.m14888t(navigationRailView.f12783H)) {
                c18288e.f54659b += sj8VarM46391f.f45478b;
            }
            NavigationRailView navigationRailView2 = NavigationRailView.this;
            if (navigationRailView2.m14888t(navigationRailView2.f12784L)) {
                c18288e.f54661d += sj8VarM46391f.f45480d;
            }
            NavigationRailView navigationRailView3 = NavigationRailView.this;
            if (navigationRailView3.m14888t(navigationRailView3.f12785M)) {
                if (xzi.m57079o(view)) {
                    c18288e.f54658a += Math.max(sj8VarM46391f.f45479c, sj8VarM46391f2.f45479c);
                } else {
                    c18288e.f54658a += Math.max(sj8VarM46391f.f45477a, sj8VarM46391f2.f45477a);
                }
            }
            c18288e.m57085a(view);
            return r9jVar;
        }
    }

    public NavigationRailView(Context context) {
        this(context, null);
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int iMax = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = getNavigationRailMenuView().getChildAt(i);
            if (childAt.getVisibility() != 8 && !(childAt instanceof NavigationBarDividerView)) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
        }
        return iMax;
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private void setExpanded(boolean z) throws Resources.NotFoundException {
        if (this.f12786Q == z) {
            return;
        }
        m14889u();
        this.f12786Q = z;
        int i = this.j0;
        int i2 = this.h0;
        int i3 = this.i0;
        int i4 = this.k0;
        if (z) {
            i = this.m0;
            i2 = this.o0;
            i3 = this.l0;
            i4 = this.n0;
        }
        getNavigationRailMenuView().setItemGravity(i4);
        super.setItemIconGravity(i);
        getNavigationRailMenuView().setItemSpacing(i2);
        getNavigationRailMenuView().setItemMinimumHeight(i3);
        getNavigationRailMenuView().setExpanded(z);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: f */
    public boolean mo14842f() {
        return true;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: g */
    public boolean mo14843g() {
        return true;
    }

    public int getCollapsedItemMinimumHeight() {
        return this.i0;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.l0;
    }

    public View getHeaderView() {
        return this.f12793y;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.f12792x;
    }

    /* renamed from: l */
    public final void m14880l() {
        View view = (View) getMenuView();
        NavigationRailFrameLayout navigationRailFrameLayout = new NavigationRailFrameLayout(getContext());
        this.p0 = navigationRailFrameLayout;
        navigationRailFrameLayout.setPaddingTop(this.f12787f);
        this.p0.setScrollingEnabled(this.f12791s);
        this.p0.setClipChildren(false);
        this.p0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.p0.addView(view);
        if (!this.f12791s) {
            addView(this.p0);
            return;
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(this.p0);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(scrollView);
    }

    /* renamed from: m */
    public void m14881m(int i) {
        m14882n(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    /* renamed from: n */
    public void m14882n(View view) {
        m14887s();
        this.f12793y = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = this.f12788g;
        this.p0.addView(view, 0, layoutParams);
    }

    /* renamed from: o */
    public final void m14883o() {
        xzi.m57070f(this, new C11086a());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM14886r = m14886r(i);
        if (this.f12786Q) {
            measureChild(getNavigationRailMenuView(), i, i2);
            View view = this.f12793y;
            if (view != null) {
                measureChild(view, i, i2);
            }
            iM14886r = m14885q(i, getMaxChildWidth());
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                getNavigationRailMenuView().m14829r(View.MeasureSpec.getSize(iM14886r));
            }
        }
        super.onMeasure(iM14886r, i2);
        if (this.p0.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.p0, iM14886r, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public NavigationRailMenuView mo14151c(Context context) {
        return new NavigationRailMenuView(context);
    }

    /* renamed from: q */
    public final int m14885q(int i, int i2) {
        int iMin = Math.min(this.f12789h, View.MeasureSpec.getSize(i));
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            return i;
        }
        int iMax = Math.max(i2, iMin);
        View view = this.f12793y;
        if (view != null) {
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(iMax, this.f12790q)), 1073741824);
    }

    /* renamed from: r */
    public final int m14886r(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* renamed from: s */
    public void m14887s() {
        View view = this.f12793y;
        if (view != null) {
            this.p0.removeView(view);
            this.f12793y = null;
        }
    }

    public void setCollapsedItemMinimumHeight(int i) {
        this.i0 = i;
        if (this.f12786Q) {
            return;
        }
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setCollapsedItemSpacing(int i) {
        this.h0 = i;
        if (this.f12786Q) {
            return;
        }
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setExpandedItemMinimumHeight(int i) {
        this.l0 = i;
        if (this.f12786Q) {
            ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemGravity(int i) throws Resources.NotFoundException {
        this.k0 = i;
        this.n0 = i;
        super.setItemGravity(i);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setItemIconGravity(int i) throws Resources.NotFoundException {
        this.j0 = i;
        this.m0 = i;
        super.setItemIconGravity(i);
    }

    public void setItemMinimumHeight(int i) {
        this.i0 = i;
        this.l0 = i;
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setItemSpacing(int i) {
        this.h0 = i;
        this.o0 = i;
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.f12792x == z) {
            return;
        }
        this.f12792x = z;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z);
    }

    /* renamed from: t */
    public final boolean m14888t(Boolean bool) {
        return bool != null ? bool.booleanValue() : getFitsSystemWindows();
    }

    /* renamed from: u */
    public final void m14889u() {
        if (isLaidOut()) {
            Transition transitionZ0 = new ChangeBounds().w0(500L).z0(q0);
            Transition transitionW0 = new Fade().w0(100L);
            Transition transitionW02 = new Fade().w0(100L);
            jf9 jf9Var = new jf9();
            Transition transitionW03 = new Fade().w0(100L);
            int childCount = getNavigationRailMenuView().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getNavigationRailMenuView().getChildAt(i);
                if (childAt instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) childAt;
                    transitionZ0.mo9888x(navigationBarItemView.getLabelGroup(), true);
                    transitionZ0.mo9888x(navigationBarItemView.getExpandedLabelGroup(), true);
                    if (this.f12786Q) {
                        transitionW02.mo9877f(navigationBarItemView.getExpandedLabelGroup());
                        transitionW0.mo9877f(navigationBarItemView.getLabelGroup());
                    } else {
                        transitionW02.mo9877f(navigationBarItemView.getLabelGroup());
                        transitionW0.mo9877f(navigationBarItemView.getExpandedLabelGroup());
                    }
                    jf9Var.mo9877f(navigationBarItemView.getExpandedLabelGroup());
                }
                transitionW03.mo9877f(childAt);
            }
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.X0(0);
            transitionSet.L0(transitionZ0).L0(transitionW0).L0(jf9Var);
            if (!this.f12786Q) {
                transitionSet.L0(transitionW03);
            }
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.X0(0);
            transitionSet2.L0(transitionW02);
            if (this.f12786Q) {
                transitionSet2.L0(transitionW03);
            }
            TransitionSet transitionSet3 = new TransitionSet();
            transitionSet3.X0(1);
            transitionSet3.L0(transitionSet2).L0(transitionSet);
            AbstractC2524c.m9945b((ViewGroup) getParent(), transitionSet3);
        }
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, pae.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        this.f12783H = null;
        this.f12784L = null;
        this.f12785M = null;
        this.f12786Q = false;
        this.i0 = -1;
        this.j0 = 0;
        this.k0 = 49;
        Context context2 = getContext();
        this.o0 = getContext().getResources().getDimensionPixelSize(x6e.m3_navigation_rail_expanded_item_spacing);
        this.n0 = 8388627;
        this.m0 = 1;
        anh anhVarM19306j = bkh.m19306j(context2, attributeSet, ebe.NavigationRailView, i, i2, new int[0]);
        this.f12787f = anhVarM19306j.m17531f(ebe.NavigationRailView_contentMarginTop, getResources().getDimensionPixelSize(x6e.mtrl_navigation_rail_margin));
        this.f12788g = anhVarM19306j.m17531f(ebe.NavigationRailView_headerMarginBottom, getResources().getDimensionPixelSize(x6e.mtrl_navigation_rail_margin));
        this.f12791s = anhVarM19306j.m17526a(ebe.NavigationRailView_scrollingEnabled, false);
        setSubmenuDividersEnabled(anhVarM19306j.m17526a(ebe.NavigationRailView_submenuDividersEnabled, false));
        m14880l();
        int iM17539n = anhVarM19306j.m17539n(ebe.NavigationRailView_headerLayout, 0);
        if (iM17539n != 0) {
            m14881m(iM17539n);
        }
        setMenuGravity(anhVarM19306j.m17536k(ebe.NavigationRailView_menuGravity, 49));
        int iM17531f = anhVarM19306j.m17531f(ebe.NavigationRailView_itemMinHeight, -1);
        int iM17531f2 = anhVarM19306j.m17531f(ebe.NavigationRailView_itemMinHeight, -1);
        iM17531f = anhVarM19306j.m17544s(ebe.NavigationRailView_collapsedItemMinHeight) ? anhVarM19306j.m17531f(ebe.NavigationRailView_collapsedItemMinHeight, -1) : iM17531f;
        iM17531f2 = anhVarM19306j.m17544s(ebe.NavigationRailView_expandedItemMinHeight) ? anhVarM19306j.m17531f(ebe.NavigationRailView_expandedItemMinHeight, -1) : iM17531f2;
        setCollapsedItemMinimumHeight(iM17531f);
        setExpandedItemMinimumHeight(iM17531f2);
        this.f12789h = anhVarM19306j.m17531f(ebe.NavigationRailView_expandedMinWidth, context2.getResources().getDimensionPixelSize(x6e.m3_navigation_rail_min_expanded_width));
        this.f12790q = anhVarM19306j.m17531f(ebe.NavigationRailView_expandedMaxWidth, context2.getResources().getDimensionPixelSize(x6e.m3_navigation_rail_max_expanded_width));
        if (anhVarM19306j.m17544s(ebe.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.f12783H = Boolean.valueOf(anhVarM19306j.m17526a(ebe.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.f12784L = Boolean.valueOf(anhVarM19306j.m17526a(ebe.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.f12785M = Boolean.valueOf(anhVarM19306j.m17526a(ebe.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(x6e.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(x6e.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fM28648b = gh0.m28648b(0.0f, 1.0f, 0.3f, 1.0f, yya.m58499f(context2) - 1.0f);
        float fM28649c = gh0.m28649c(getItemPaddingTop(), dimensionPixelOffset, fM28648b);
        float fM28649c2 = gh0.m28649c(getItemPaddingBottom(), dimensionPixelOffset2, fM28648b);
        setItemPaddingTop(Math.round(fM28649c));
        setItemPaddingBottom(Math.round(fM28649c2));
        setCollapsedItemSpacing(anhVarM19306j.m17531f(ebe.NavigationRailView_itemSpacing, 0));
        setExpanded(anhVarM19306j.m17526a(ebe.NavigationRailView_expanded, false));
        anhVarM19306j.m17546x();
        m14883o();
    }
}
