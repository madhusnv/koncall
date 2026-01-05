package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.InterfaceC1797j;
import androidx.transition.AbstractC2524c;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.C10936a;
import java.util.HashSet;
import p001o.b9e;
import p001o.cc;
import p001o.ged;
import p001o.gh0;
import p001o.jsb;
import p001o.ked;
import p001o.ksb;
import p001o.lk0;
import p001o.nih;
import p001o.nv5;
import p001o.umb;
import p001o.x5e;
import p001o.ykf;
import p001o.z5e;
import p001o.zya;

/* loaded from: classes3.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements InterfaceC1797j {
    public static final int[] N0 = {R.attr.state_checked};
    public static final int[] O0 = {-16842910};
    public boolean A0;
    public ColorStateList B0;
    public NavigationBarPresenter C0;
    public jsb D0;
    public boolean E0;
    public boolean F0;
    public int G0;

    /* renamed from: H */
    public final ColorStateList f12734H;
    public int H0;
    public boolean I0;
    public MenuItem J0;
    public int K0;

    /* renamed from: L */
    public int f12735L;
    public boolean L0;

    /* renamed from: M */
    public int f12736M;
    public final Rect M0;

    /* renamed from: Q */
    public int f12737Q;

    /* renamed from: a */
    public final TransitionSet f12738a;

    /* renamed from: b */
    public final View.OnClickListener f12739b;

    /* renamed from: c */
    public ged f12740c;

    /* renamed from: d */
    public final SparseArray f12741d;

    /* renamed from: e */
    public int f12742e;

    /* renamed from: f */
    public int f12743f;

    /* renamed from: g */
    public ksb[] f12744g;

    /* renamed from: h */
    public int f12745h;
    public int h0;
    public boolean i0;
    public Drawable j0;
    public ColorStateList k0;
    public int l0;
    public final SparseArray m0;
    public int n0;
    public int o0;
    public int p0;

    /* renamed from: q */
    public int f12746q;
    public int q0;
    public boolean r0;

    /* renamed from: s */
    public ColorStateList f12747s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;

    /* renamed from: x */
    public int f12748x;
    public int x0;

    /* renamed from: y */
    public ColorStateList f12749y;
    public int y0;
    public ykf z0;

    /* renamed from: com.google.android.material.navigation.NavigationBarMenuView$a */
    public class ViewOnClickListenerC11075a implements View.OnClickListener {
        public ViewOnClickListenerC11075a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1794g itemData = ((NavigationBarItemView) view).getItemData();
            boolean zM34480e = NavigationBarMenuView.this.D0.m34480e(itemData, NavigationBarMenuView.this.C0, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!zM34480e || itemData.isChecked()) {
                NavigationBarMenuView.this.setCheckedItem(itemData);
            }
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        this.f12741d = new SparseArray();
        this.f12745h = -1;
        this.f12746q = -1;
        this.m0 = new SparseArray();
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.y0 = 49;
        this.A0 = false;
        this.G0 = 1;
        this.H0 = 0;
        this.J0 = null;
        this.K0 = 7;
        this.L0 = false;
        this.M0 = new Rect();
        this.f12734H = m14817e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f12738a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.f12738a = autoTransition;
            autoTransition.X0(0);
            autoTransition.mo9889y(TextView.class, true);
            autoTransition.w0(umb.m51785f(getContext(), x5e.motionDurationMedium4, getResources().getInteger(b9e.material_motion_duration_long_1)));
            autoTransition.z0(umb.m51786g(getContext(), x5e.motionEasingStandard, gh0.f25147b));
            autoTransition.L0(new nih());
        }
        this.f12739b = new ViewOnClickListenerC11075a();
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.K0, this.D0.m34479d());
    }

    private NavigationBarItemView getNewItem() {
        ged gedVar = this.f12740c;
        NavigationBarItemView navigationBarItemView = gedVar != null ? (NavigationBarItemView) gedVar.mo28526b() : null;
        return navigationBarItemView == null ? mo14149h(getContext()) : navigationBarItemView;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        C10936a c10936a;
        int id = navigationBarItemView.getId();
        if (m14824m(id) && (c10936a = (C10936a) this.m0.get(id)) != null) {
            navigationBarItemView.setBadge(c10936a);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j
    /* renamed from: a */
    public void mo3956a(C1792e c1792e) {
        this.D0 = new jsb(c1792e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public void m14816d() throws Resources.NotFoundException {
        NavigationBarItemView navigationBarItemViewM14819g;
        removeAllViews();
        m14825n();
        this.C0.m14834m(true);
        this.D0.m34481f();
        this.C0.m14834m(false);
        int iM34476a = this.D0.m34476a();
        if (iM34476a == 0) {
            this.f12745h = 0;
            this.f12746q = 0;
            this.f12744g = null;
            this.f12740c = null;
            return;
        }
        if (this.f12740c == null || this.H0 != iM34476a) {
            this.H0 = iM34476a;
            this.f12740c = new ked(iM34476a);
        }
        m14826o();
        int iM34482g = this.D0.m34482g();
        this.f12744g = new ksb[iM34482g];
        boolean zM14823l = m14823l(this.f12742e, getCurrentVisibleContentItemCount());
        int size = 0;
        int i = 0;
        for (int i2 = 0; i2 < iM34482g; i2++) {
            MenuItem menuItemM34477b = this.D0.m34477b(i2);
            boolean z = menuItemM34477b instanceof nv5;
            if (z) {
                NavigationBarDividerView navigationBarDividerView = new NavigationBarDividerView(getContext());
                navigationBarDividerView.setOnlyShowWhenExpanded(true);
                navigationBarDividerView.setDividersEnabled(this.L0);
                navigationBarItemViewM14819g = navigationBarDividerView;
            } else if (menuItemM34477b.hasSubMenu()) {
                if (size > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                NavigationBarSubheaderView navigationBarSubheaderView = new NavigationBarSubheaderView(getContext());
                int i3 = this.h0;
                if (i3 == 0) {
                    i3 = this.f12736M;
                }
                navigationBarSubheaderView.setTextAppearance(i3);
                navigationBarSubheaderView.setTextColor(this.f12749y);
                navigationBarSubheaderView.setOnlyShowWhenExpanded(true);
                navigationBarSubheaderView.mo3948c((C1794g) menuItemM34477b, 0);
                size = menuItemM34477b.getSubMenu().size();
                navigationBarItemViewM14819g = navigationBarSubheaderView;
            } else if (size > 0) {
                size--;
                navigationBarItemViewM14819g = m14819g(i2, (C1794g) menuItemM34477b, zM14823l, true);
            } else {
                C1794g c1794g = (C1794g) menuItemM34477b;
                boolean z2 = i >= this.K0;
                i++;
                navigationBarItemViewM14819g = m14819g(i2, c1794g, zM14823l, z2);
            }
            if (!z && menuItemM34477b.isCheckable() && this.f12746q == -1) {
                this.f12746q = i2;
            }
            this.f12744g[i2] = navigationBarItemViewM14819g;
            addView(navigationBarItemViewM14819g);
        }
        int iMin = Math.min(iM34482g - 1, this.f12746q);
        this.f12746q = iMin;
        setCheckedItem(this.f12744g[iMin].getItemData());
    }

    /* renamed from: e */
    public ColorStateList m14817e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM37352a = lk0.m37352a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(z5e.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM37352a.getDefaultColor();
        int[] iArr = O0;
        return new ColorStateList(new int[][]{iArr, N0, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateListM37352a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: f */
    public final Drawable m14818f() {
        if (this.z0 == null || this.B0 == null) {
            return null;
        }
        zya zyaVar = new zya(this.z0);
        zyaVar.g0(this.B0);
        return zyaVar;
    }

    /* renamed from: g */
    public final NavigationBarItemView m14819g(int i, C1794g c1794g, boolean z, boolean z2) throws Resources.NotFoundException {
        this.C0.m14834m(true);
        c1794g.setCheckable(true);
        this.C0.m14834m(false);
        NavigationBarItemView newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.G0);
        newItem.setIconTintList(this.f12747s);
        newItem.setIconSize(this.f12748x);
        newItem.setTextColor(this.f12734H);
        newItem.setTextAppearanceInactive(this.f12735L);
        newItem.setTextAppearanceActive(this.f12736M);
        newItem.setHorizontalTextAppearanceInactive(this.f12737Q);
        newItem.setHorizontalTextAppearanceActive(this.h0);
        newItem.setTextAppearanceActiveBoldEnabled(this.i0);
        newItem.setTextColor(this.f12749y);
        int i2 = this.n0;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.o0;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.E0);
        newItem.setLabelFontScalingEnabled(this.F0);
        int i4 = this.p0;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.q0;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.s0);
        newItem.setActiveIndicatorHeight(this.t0);
        newItem.setActiveIndicatorExpandedWidth(this.u0);
        newItem.setActiveIndicatorExpandedHeight(this.v0);
        newItem.setActiveIndicatorMarginHorizontal(this.w0);
        newItem.setItemGravity(this.y0);
        newItem.setActiveIndicatorExpandedPadding(this.M0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.x0);
        newItem.setActiveIndicatorDrawable(m14818f());
        newItem.setActiveIndicatorResizeable(this.A0);
        newItem.setActiveIndicatorEnabled(this.r0);
        Drawable drawable = this.j0;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.l0);
        }
        newItem.setItemRippleColor(this.k0);
        newItem.setLabelVisibilityMode(this.f12742e);
        newItem.setItemIconGravity(this.f12743f);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.I0);
        newItem.mo3948c(c1794g, 0);
        newItem.setItemPosition(i);
        int itemId = c1794g.getItemId();
        newItem.setOnTouchListener((View.OnTouchListener) this.f12741d.get(itemId));
        newItem.setOnClickListener(this.f12739b);
        int i6 = this.f12745h;
        if (i6 != 0 && itemId == i6) {
            this.f12746q = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.p0;
    }

    public SparseArray<C10936a> getBadgeDrawables() {
        return this.m0;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.I0 ? this.D0.m34478c() : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.h0;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f12737Q;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.q0;
    }

    public ColorStateList getIconTintList() {
        return this.f12747s;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.B0;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.r0;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.v0;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.x0;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.u0;
    }

    public int getItemActiveIndicatorHeight() {
        return this.t0;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.w0;
    }

    public ykf getItemActiveIndicatorShapeAppearance() {
        return this.z0;
    }

    public int getItemActiveIndicatorWidth() {
        return this.s0;
    }

    public Drawable getItemBackground() {
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null && ksbVarArr.length > 0) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    return ((NavigationBarItemView) ksbVar).getBackground();
                }
            }
        }
        return this.j0;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.l0;
    }

    public int getItemGravity() {
        return this.y0;
    }

    public int getItemIconGravity() {
        return this.f12743f;
    }

    public int getItemIconSize() {
        return this.f12748x;
    }

    public int getItemPaddingBottom() {
        return this.o0;
    }

    public int getItemPaddingTop() {
        return this.n0;
    }

    public ColorStateList getItemRippleColor() {
        return this.k0;
    }

    public int getItemTextAppearanceActive() {
        return this.f12736M;
    }

    public int getItemTextAppearanceInactive() {
        return this.f12735L;
    }

    public ColorStateList getItemTextColor() {
        return this.f12749y;
    }

    public int getLabelMaxLines() {
        return this.G0;
    }

    public int getLabelVisibilityMode() {
        return this.f12742e;
    }

    public jsb getMenu() {
        return this.D0;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.F0;
    }

    public int getSelectedItemId() {
        return this.f12745h;
    }

    public int getSelectedItemPosition() {
        return this.f12746q;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public abstract NavigationBarItemView mo14149h(Context context);

    /* renamed from: i */
    public NavigationBarItemView m14820i(int i) {
        m14831t(i);
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr == null) {
            return null;
        }
        for (ksb ksbVar : ksbVarArr) {
            if (ksbVar instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) ksbVar;
                if (navigationBarItemView.getId() == i) {
                    return navigationBarItemView;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    public C10936a m14821j(int i) {
        m14831t(i);
        C10936a c10936aM14020f = (C10936a) this.m0.get(i);
        if (c10936aM14020f == null) {
            c10936aM14020f = C10936a.m14020f(getContext());
            this.m0.put(i, c10936aM14020f);
        }
        NavigationBarItemView navigationBarItemViewM14820i = m14820i(i);
        if (navigationBarItemViewM14820i != null) {
            navigationBarItemViewM14820i.setBadge(c10936aM14020f);
        }
        return c10936aM14020f;
    }

    /* renamed from: k */
    public final boolean m14822k() {
        jsb jsbVar;
        if (this.f12744g == null || (jsbVar = this.D0) == null || jsbVar.m34482g() != this.f12744g.length) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i >= this.f12744g.length) {
                return true;
            }
            if ((this.D0.m34477b(i) instanceof nv5) && !(this.f12744g[i] instanceof NavigationBarDividerView)) {
                return false;
            }
            boolean z = this.D0.m34477b(i).hasSubMenu() && !(this.f12744g[i] instanceof NavigationBarSubheaderView);
            boolean z2 = (this.D0.m34477b(i).hasSubMenu() || (this.f12744g[i] instanceof NavigationBarItemView)) ? false : true;
            if (!(this.D0.m34477b(i) instanceof nv5) && (z || z2)) {
                break;
            }
            i++;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m14823l(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m14824m(int i) {
        return i != -1;
    }

    /* renamed from: n */
    public final void m14825n() {
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr == null || this.f12740c == null) {
            return;
        }
        for (ksb ksbVar : ksbVarArr) {
            if (ksbVar instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) ksbVar;
                this.f12740c.mo28525a(navigationBarItemView);
                navigationBarItemView.m14795g();
            }
        }
    }

    /* renamed from: o */
    public final void m14826o() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.D0.m34482g(); i++) {
            hashSet.add(Integer.valueOf(this.D0.m34477b(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.m0.size(); i2++) {
            int iKeyAt = this.m0.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                this.m0.delete(iKeyAt);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cc.d1(accessibilityNodeInfo).q0(cc.C12628e.m20831b(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    /* renamed from: p */
    public void m14827p(SparseArray sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (this.m0.indexOfKey(iKeyAt) < 0) {
                this.m0.append(iKeyAt, (C10936a) sparseArray.get(iKeyAt));
            }
        }
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) ksbVar;
                    C10936a c10936a = (C10936a) this.m0.get(navigationBarItemView.getId());
                    if (c10936a != null) {
                        navigationBarItemView.setBadge(c10936a);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void m14828q(int i) {
        int iM34482g = this.D0.m34482g();
        for (int i2 = 0; i2 < iM34482g; i2++) {
            MenuItem menuItemM34477b = this.D0.m34477b(i2);
            if (i == menuItemM34477b.getItemId()) {
                this.f12745h = i;
                this.f12746q = i2;
                setCheckedItem(menuItemM34477b);
                return;
            }
        }
    }

    /* renamed from: r */
    public void m14829r(int i) {
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).m14786B(i);
                }
            }
        }
    }

    /* renamed from: s */
    public void m14830s() throws Resources.NotFoundException {
        TransitionSet transitionSet;
        if (this.D0 == null || this.f12744g == null) {
            return;
        }
        this.C0.m14834m(true);
        this.D0.m34481f();
        this.C0.m14834m(false);
        if (!m14822k()) {
            m14816d();
            return;
        }
        int i = this.f12745h;
        int iM34482g = this.D0.m34482g();
        for (int i2 = 0; i2 < iM34482g; i2++) {
            MenuItem menuItemM34477b = this.D0.m34477b(i2);
            if (menuItemM34477b.isChecked()) {
                setCheckedItem(menuItemM34477b);
                this.f12745h = menuItemM34477b.getItemId();
                this.f12746q = i2;
            }
        }
        if (i != this.f12745h && (transitionSet = this.f12738a) != null) {
            AbstractC2524c.m9945b(this, transitionSet);
        }
        boolean zM14823l = m14823l(this.f12742e, getCurrentVisibleContentItemCount());
        for (int i3 = 0; i3 < iM34482g; i3++) {
            this.C0.m14834m(true);
            this.f12744g[i3].setExpanded(this.I0);
            ksb ksbVar = this.f12744g[i3];
            if (ksbVar instanceof NavigationBarItemView) {
                NavigationBarItemView navigationBarItemView = (NavigationBarItemView) ksbVar;
                navigationBarItemView.setLabelVisibilityMode(this.f12742e);
                navigationBarItemView.setItemIconGravity(this.f12743f);
                navigationBarItemView.setItemGravity(this.y0);
                navigationBarItemView.setShifting(zM14823l);
            }
            if (this.D0.m34477b(i3) instanceof C1794g) {
                this.f12744g[i3].mo3948c((C1794g) this.D0.m34477b(i3), 0);
            }
            this.C0.m14834m(false);
        }
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.p0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.J0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.J0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.J0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.J0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.K0 = i;
    }

    public void setExpanded(boolean z) {
        this.I0 = z;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                ksbVar.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.h0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f12737Q = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.q0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f12747s = colorStateList;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.B0 = colorStateList;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorDrawable(m14818f());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.r0 = z;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.v0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.x0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedPadding(int i, int i2, int i3, int i4) {
        Rect rect = this.M0;
        rect.left = i;
        rect.top = i2;
        rect.right = i3;
        rect.bottom = i4;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorExpandedPadding(this.M0);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.u0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.t0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.w0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.A0 = z;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(ykf ykfVar) {
        this.z0 = ykfVar;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorDrawable(m14818f());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.s0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.j0 = drawable;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.l0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.y0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.f12743f = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f12748x = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setIconSize(i);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f12741d.remove(i);
        } else {
            this.f12741d.put(i, onTouchListener);
        }
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if ((ksbVar instanceof NavigationBarItemView) && ksbVar.getItemData() != null && ksbVar.getItemData().getItemId() == i) {
                    ((NavigationBarItemView) ksbVar).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.o0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setItemPaddingBottom(this.o0);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.n0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f12736M = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) throws Resources.NotFoundException {
        this.i0 = z;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f12735L = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f12749y = colorStateList;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) throws Resources.NotFoundException {
        this.F0 = z;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.G0 = i;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f12742e = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.E0 = z;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) ksbVar).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.C0 = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.L0 == z) {
            return;
        }
        this.L0 = z;
        ksb[] ksbVarArr = this.f12744g;
        if (ksbVarArr != null) {
            for (ksb ksbVar : ksbVarArr) {
                if (ksbVar instanceof NavigationBarDividerView) {
                    ((NavigationBarDividerView) ksbVar).setDividersEnabled(z);
                }
            }
        }
    }

    /* renamed from: t */
    public final void m14831t(int i) {
        if (m14824m(i)) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }
}
