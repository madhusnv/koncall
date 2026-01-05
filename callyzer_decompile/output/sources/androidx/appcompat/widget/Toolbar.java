package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.a1;
import bk.RunnableC0683n;
import c6.C0887q;
import c6.InterfaceC0883m;
import c6.InterfaceC0888r;
import c6.v0;
import com.google.android.material.datepicker.ViewOnClickListenerC1348l;
import com.websoptimization.callyzerbiz.R;
import java.util.ArrayList;
import java.util.Iterator;
import k4.C4001v;
import l1.C4327p;
import l4.C4367l;
import og.ia;
import p009j.AbstractC3500a;
import p011m.C4606d;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;
import p013o.C5220f;
import p013o.C5223i;
import p013o.C5236v;
import p013o.C5237w;
import p013o.a2;
import p013o.b2;
import p013o.c2;
import p013o.d2;
import p013o.e2;
import p013o.j0;
import p013o.l2;
import p013o.q0;
import p013o.s1;
import p013o.y1;
import p013o.z1;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0883m {

    /* renamed from: B */
    public CharSequence f1774B;

    /* renamed from: C */
    public CharSequence f1775C;

    /* renamed from: D */
    public ColorStateList f1776D;

    /* renamed from: E */
    public ColorStateList f1777E;

    /* renamed from: F */
    public boolean f1778F;

    /* renamed from: G */
    public boolean f1779G;

    /* renamed from: H */
    public final ArrayList f1780H;

    /* renamed from: I */
    public final ArrayList f1781I;

    /* renamed from: K */
    public final int[] f1782K;

    /* renamed from: L */
    public final C0887q f1783L;

    /* renamed from: M */
    public ArrayList f1784M;

    /* renamed from: N */
    public final C4001v f1785N;

    /* renamed from: O */
    public e2 f1786O;

    /* renamed from: T */
    public a2 f1787T;

    /* renamed from: V */
    public boolean f1788V;
    public boolean X0;
    public final RunnableC0683n Y0;

    /* renamed from: a */
    public ActionMenuView f1789a;

    /* renamed from: b */
    public j0 f1790b;

    /* renamed from: c */
    public j0 f1791c;

    /* renamed from: d */
    public C5236v f1792d;

    /* renamed from: e */
    public C5237w f1793e;

    /* renamed from: f */
    public final Drawable f1794f;

    /* renamed from: g */
    public final CharSequence f1795g;

    /* renamed from: h */
    public C5236v f1796h;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f43685h0;

    /* renamed from: j */
    public View f1797j;

    /* renamed from: k */
    public Context f1798k;

    /* renamed from: l */
    public int f1799l;

    /* renamed from: m */
    public int f1800m;

    /* renamed from: n */
    public int f1801n;

    /* renamed from: p */
    public final int f1802p;

    /* renamed from: q */
    public final int f1803q;

    /* renamed from: r */
    public int f1804r;

    /* renamed from: s */
    public int f1805s;

    /* renamed from: t */
    public int f1806t;

    /* renamed from: t0, reason: collision with root package name */
    public OnBackInvokedDispatcher f43686t0;

    /* renamed from: v */
    public int f1807v;

    /* renamed from: w */
    public s1 f1808w;

    /* renamed from: x */
    public int f1809x;

    /* renamed from: y */
    public int f1810y;

    /* renamed from: z */
    public final int f1811z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: g */
    public static b2 m576g() {
        b2 b2Var = new b2(-2, -2);
        b2Var.f25461b = 0;
        b2Var.f25460a = 8388627;
        return b2Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C4606d(getContext());
    }

    /* renamed from: h */
    public static b2 m577h(ViewGroup.LayoutParams layoutParams) {
        boolean z6 = layoutParams instanceof b2;
        if (z6) {
            b2 b2Var = (b2) layoutParams;
            b2 b2Var2 = new b2(b2Var);
            b2Var2.f25461b = 0;
            b2Var2.f25461b = b2Var.f25461b;
            return b2Var2;
        }
        if (z6) {
            b2 b2Var3 = new b2((b2) layoutParams);
            b2Var3.f25461b = 0;
            return b2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            b2 b2Var4 = new b2(layoutParams);
            b2Var4.f25461b = 0;
            return b2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        b2 b2Var5 = new b2(marginLayoutParams);
        b2Var5.f25461b = 0;
        ((ViewGroup.MarginLayoutParams) b2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) b2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) b2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) b2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return b2Var5;
    }

    /* renamed from: j */
    public static int m578j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: k */
    public static int m579k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m580a(int i10, ArrayList arrayList) {
        boolean z6 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z6) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                b2 b2Var = (b2) childAt.getLayoutParams();
                if (b2Var.f25461b == 0 && m593r(childAt)) {
                    int i12 = b2Var.f25460a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            b2 b2Var2 = (b2) childAt2.getLayoutParams();
            if (b2Var2.f25461b == 0 && m593r(childAt2)) {
                int i14 = b2Var2.f25460a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // c6.InterfaceC0883m
    public final void addMenuProvider(InterfaceC0888r interfaceC0888r) {
        C0887q c0887q = this.f1783L;
        c0887q.f5508b.add(interfaceC0888r);
        c0887q.f5507a.run();
    }

    /* renamed from: b */
    public final void m581b(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        b2 b2VarM576g = layoutParams == null ? m576g() : !checkLayoutParams(layoutParams) ? m577h(layoutParams) : (b2) layoutParams;
        b2VarM576g.f25461b = 1;
        if (!z6 || this.f1797j == null) {
            addView(view, b2VarM576g);
        } else {
            view.setLayoutParams(b2VarM576g);
            this.f1781I.add(view);
        }
    }

    /* renamed from: c */
    public final void m582c() {
        if (this.f1796h == null) {
            C5236v c5236v = new C5236v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1796h = c5236v;
            c5236v.setImageDrawable(this.f1794f);
            this.f1796h.setContentDescription(this.f1795g);
            b2 b2VarM576g = m576g();
            b2VarM576g.f25460a = (this.f1802p & 112) | 8388611;
            b2VarM576g.f25461b = 2;
            this.f1796h.setLayoutParams(b2VarM576g);
            this.f1796h.setOnClickListener(new ViewOnClickListenerC1348l(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b2);
    }

    /* renamed from: d */
    public final void m583d() {
        if (this.f1808w == null) {
            s1 s1Var = new s1();
            s1Var.f25633a = 0;
            s1Var.f25634b = 0;
            s1Var.f25635c = Integer.MIN_VALUE;
            s1Var.f25636d = Integer.MIN_VALUE;
            s1Var.f25637e = 0;
            s1Var.f25638f = 0;
            s1Var.f25639g = false;
            s1Var.f25640h = false;
            this.f1808w = s1Var;
        }
    }

    /* renamed from: e */
    public final void m584e() {
        if (this.f1789a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1789a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1799l);
            this.f1789a.setOnMenuItemClickListener(this.f1785N);
            ActionMenuView actionMenuView2 = this.f1789a;
            C4327p c4327p = new C4327p(10, this);
            actionMenuView2.getClass();
            actionMenuView2.f1756w = c4327p;
            b2 b2VarM576g = m576g();
            b2VarM576g.f25460a = (this.f1802p & 112) | 8388613;
            this.f1789a.setLayoutParams(b2VarM576g);
            m581b(this.f1789a, false);
        }
        ActionMenuView actionMenuView3 = this.f1789a;
        if (actionMenuView3.f1752r == null) {
            MenuC4929i menuC4929i = (MenuC4929i) actionMenuView3.getMenu();
            if (this.f1787T == null) {
                this.f1787T = new a2(this);
            }
            this.f1789a.setExpandedActionViewsExclusive(true);
            menuC4929i.m9853b(this.f1787T, this.f1798k);
            m594s();
        }
    }

    /* renamed from: f */
    public final void m585f() {
        if (this.f1792d == null) {
            this.f1792d = new C5236v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            b2 b2VarM576g = m576g();
            b2VarM576g.f25460a = (this.f1802p & 112) | 8388611;
            this.f1792d.setLayoutParams(b2VarM576g);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m576g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m577h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C5236v c5236v = this.f1796h;
        if (c5236v != null) {
            return c5236v.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C5236v c5236v = this.f1796h;
        if (c5236v != null) {
            return c5236v.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        s1 s1Var = this.f1808w;
        if (s1Var != null) {
            return s1Var.f25639g ? s1Var.f25633a : s1Var.f25634b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1810y;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        s1 s1Var = this.f1808w;
        if (s1Var != null) {
            return s1Var.f25633a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        s1 s1Var = this.f1808w;
        if (s1Var != null) {
            return s1Var.f25634b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        s1 s1Var = this.f1808w;
        if (s1Var != null) {
            return s1Var.f25639g ? s1Var.f25634b : s1Var.f25633a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1809x;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC4929i menuC4929i;
        ActionMenuView actionMenuView = this.f1789a;
        return (actionMenuView == null || (menuC4929i = actionMenuView.f1752r) == null || !menuC4929i.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1810y, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1809x, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C5237w c5237w = this.f1793e;
        if (c5237w != null) {
            return c5237w.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C5237w c5237w = this.f1793e;
        if (c5237w != null) {
            return c5237w.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m584e();
        return this.f1789a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1792d;
    }

    public CharSequence getNavigationContentDescription() {
        C5236v c5236v = this.f1792d;
        if (c5236v != null) {
            return c5236v.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C5236v c5236v = this.f1792d;
        if (c5236v != null) {
            return c5236v.getDrawable();
        }
        return null;
    }

    public C5223i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        m584e();
        return this.f1789a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1798k;
    }

    public int getPopupTheme() {
        return this.f1799l;
    }

    public CharSequence getSubtitle() {
        return this.f1775C;
    }

    public final TextView getSubtitleTextView() {
        return this.f1791c;
    }

    public CharSequence getTitle() {
        return this.f1774B;
    }

    public int getTitleMarginBottom() {
        return this.f1807v;
    }

    public int getTitleMarginEnd() {
        return this.f1805s;
    }

    public int getTitleMarginStart() {
        return this.f1804r;
    }

    public int getTitleMarginTop() {
        return this.f1806t;
    }

    public final TextView getTitleTextView() {
        return this.f1790b;
    }

    public q0 getWrapper() {
        Drawable drawable;
        if (this.f1786O == null) {
            e2 e2Var = new e2();
            e2Var.f25476l = 0;
            e2Var.f25465a = this;
            e2Var.f25472h = getTitle();
            e2Var.f25473i = getSubtitle();
            e2Var.f25471g = e2Var.f25472h != null;
            e2Var.f25470f = getNavigationIcon();
            C4367l c4367lM9117H = C4367l.m9117H(getContext(), null, AbstractC3500a.f18344a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) c4367lM9117H.f21922c;
            e2Var.f25477m = c4367lM9117H.m9145y(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                e2Var.f25471g = true;
                e2Var.f25472h = text;
                if ((e2Var.f25466b & 8) != 0) {
                    setTitle(text);
                    if (e2Var.f25471g) {
                        v0.m2529k(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                e2Var.f25473i = text2;
                if ((e2Var.f25466b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM9145y = c4367lM9117H.m9145y(20);
            if (drawableM9145y != null) {
                e2Var.f25469e = drawableM9145y;
                e2Var.m10225c();
            }
            Drawable drawableM9145y2 = c4367lM9117H.m9145y(17);
            if (drawableM9145y2 != null) {
                e2Var.f25468d = drawableM9145y2;
                e2Var.m10225c();
            }
            if (e2Var.f25470f == null && (drawable = e2Var.f25477m) != null) {
                e2Var.f25470f = drawable;
                if ((e2Var.f25466b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            e2Var.m10223a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = e2Var.f25467c;
                if (view != null && (e2Var.f25466b & 16) != 0) {
                    removeView(view);
                }
                e2Var.f25467c = viewInflate;
                if (viewInflate != null && (e2Var.f25466b & 16) != 0) {
                    addView(viewInflate);
                }
                e2Var.m10223a(e2Var.f25466b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m583d();
                this.f1808w.m10289a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1800m = resourceId2;
                j0 j0Var = this.f1790b;
                if (j0Var != null) {
                    j0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1801n = resourceId3;
                j0 j0Var2 = this.f1791c;
                if (j0Var2 != null) {
                    j0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c4367lM9117H.m9124I();
            if (R.string.abc_action_bar_up_description != e2Var.f25476l) {
                e2Var.f25476l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = e2Var.f25476l;
                    e2Var.f25474j = i10 != 0 ? getContext().getString(i10) : null;
                    e2Var.m10224b();
                }
            }
            e2Var.f25474j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1348l(e2Var));
            this.f1786O = e2Var;
        }
        return this.f1786O;
    }

    /* renamed from: i */
    public final int m586i(int i10, View view) {
        b2 b2Var = (b2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = b2Var.f25460a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f1811z & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) b2Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) b2Var).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) b2Var).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: l */
    public final void m587l() {
        ArrayList arrayList = this.f1784M;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = this.f1783L.f5508b.iterator();
        while (it.hasNext()) {
            ((a1) ((InterfaceC0888r) it.next())).f2456a.m1186k(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1784M = currentMenuItems2;
    }

    /* renamed from: m */
    public final boolean m588m(View view) {
        return view.getParent() == this || this.f1781I.contains(view);
    }

    /* renamed from: n */
    public final int m589n(View view, int i10, int i11, int[] iArr) {
        b2 b2Var = (b2) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) b2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int iM586i = m586i(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM586i, iMax + measuredWidth, view.getMeasuredHeight() + iM586i);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) b2Var).rightMargin + iMax;
    }

    /* renamed from: o */
    public final int m590o(View view, int i10, int i11, int[] iArr) {
        b2 b2Var = (b2) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) b2Var).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iM586i = m586i(i11, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM586i, iMax, view.getMeasuredHeight() + iM586i);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) b2Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m594s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Y0);
        m594s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1779G = false;
        }
        if (!this.f1779G) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1779G = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1779G = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        char c2;
        Object[] objArr;
        int iM578j;
        int iMax;
        int iCombineMeasuredStates;
        int iM578j2;
        int iM579k;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z6 = l2.f25576a;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c2 = 0;
        } else {
            c2 = 1;
            objArr = false;
        }
        if (m593r(this.f1792d)) {
            m592q(this.f1792d, i10, 0, i11, this.f1803q);
            iM578j = m578j(this.f1792d) + this.f1792d.getMeasuredWidth();
            iMax = Math.max(0, m579k(this.f1792d) + this.f1792d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1792d.getMeasuredState());
        } else {
            iM578j = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m593r(this.f1796h)) {
            m592q(this.f1796h, i10, 0, i11, this.f1803q);
            iM578j = m578j(this.f1796h) + this.f1796h.getMeasuredWidth();
            iMax = Math.max(iMax, m579k(this.f1796h) + this.f1796h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1796h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM578j);
        int iMax4 = Math.max(0, currentContentInsetStart - iM578j);
        Object[] objArr2 = objArr;
        int[] iArr = this.f1782K;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m593r(this.f1789a)) {
            m592q(this.f1789a, i10, iMax3, i11, this.f1803q);
            iM578j2 = m578j(this.f1789a) + this.f1789a.getMeasuredWidth();
            iMax = Math.max(iMax, m579k(this.f1789a) + this.f1789a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1789a.getMeasuredState());
        } else {
            iM578j2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM578j2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - iM578j2);
        if (m593r(this.f1797j)) {
            iMax5 += m591p(this.f1797j, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, m579k(this.f1797j) + this.f1797j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1797j.getMeasuredState());
        }
        if (m593r(this.f1793e)) {
            iMax5 += m591p(this.f1793e, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, m579k(this.f1793e) + this.f1793e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1793e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((b2) childAt.getLayoutParams()).f25461b == 0 && m593r(childAt)) {
                iMax5 += m591p(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, m579k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.f1806t + this.f1807v;
        int i16 = this.f1804r + this.f1805s;
        if (m593r(this.f1790b)) {
            m591p(this.f1790b, i10, i14 + i16, i11, i15, iArr);
            int iM578j3 = m578j(this.f1790b) + this.f1790b.getMeasuredWidth();
            iM579k = m579k(this.f1790b) + this.f1790b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1790b.getMeasuredState());
            iMax2 = iM578j3;
        } else {
            iM579k = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m593r(this.f1791c)) {
            iMax2 = Math.max(iMax2, m591p(this.f1791c, i10, i14 + i16, i11, i15 + iM579k, iArr));
            iM579k += m579k(this.f1791c) + this.f1791c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1791c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iM579k);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f1788V) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (m593r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof d2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d2 d2Var = (d2) parcelable;
        super.onRestoreInstanceState(d2Var.f21992a);
        ActionMenuView actionMenuView = this.f1789a;
        MenuC4929i menuC4929i = actionMenuView != null ? actionMenuView.f1752r : null;
        int i10 = d2Var.f25463c;
        if (i10 != 0 && this.f1787T != null && menuC4929i != null && (menuItemFindItem = menuC4929i.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (d2Var.f25464d) {
            RunnableC0683n runnableC0683n = this.Y0;
            removeCallbacks(runnableC0683n);
            post(runnableC0683n);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        m583d();
        s1 s1Var = this.f1808w;
        boolean z6 = i10 == 1;
        if (z6 == s1Var.f25639g) {
            return;
        }
        s1Var.f25639g = z6;
        if (!s1Var.f25640h) {
            s1Var.f25633a = s1Var.f25637e;
            s1Var.f25634b = s1Var.f25638f;
            return;
        }
        if (z6) {
            int i11 = s1Var.f25636d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = s1Var.f25637e;
            }
            s1Var.f25633a = i11;
            int i12 = s1Var.f25635c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = s1Var.f25638f;
            }
            s1Var.f25634b = i12;
            return;
        }
        int i13 = s1Var.f25635c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = s1Var.f25637e;
        }
        s1Var.f25633a = i13;
        int i14 = s1Var.f25636d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = s1Var.f25638f;
        }
        s1Var.f25634b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C5223i c5223i;
        C5220f c5220f;
        MenuItemC4930j menuItemC4930j;
        d2 d2Var = new d2(super.onSaveInstanceState());
        a2 a2Var = this.f1787T;
        if (a2Var != null && (menuItemC4930j = a2Var.f25437b) != null) {
            d2Var.f25463c = menuItemC4930j.f24555a;
        }
        ActionMenuView actionMenuView = this.f1789a;
        d2Var.f25464d = (actionMenuView == null || (c5223i = actionMenuView.f1755v) == null || (c5220f = c5223i.f25531t) == null || !c5220f.m9881b()) ? false : true;
        return d2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1778F = false;
        }
        if (!this.f1778F) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1778F = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1778F = false;
        return true;
    }

    /* renamed from: p */
    public final int m591p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* renamed from: q */
    public final void m592q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: r */
    public final boolean m593r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // c6.InterfaceC0883m
    public final void removeMenuProvider(InterfaceC0888r interfaceC0888r) {
        this.f1783L.m2487b(interfaceC0888r);
    }

    /* renamed from: s */
    public final void m594s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM10307a = z1.m10307a(this);
            a2 a2Var = this.f1787T;
            boolean z6 = (a2Var == null || a2Var.f25437b == null || onBackInvokedDispatcherM10307a == null || !isAttachedToWindow() || !this.X0) ? false : true;
            if (z6 && this.f43686t0 == null) {
                if (this.f43685h0 == null) {
                    this.f43685h0 = z1.m10308b(new y1(this, 0));
                }
                z1.m10309c(onBackInvokedDispatcherM10307a, this.f43685h0);
                this.f43686t0 = onBackInvokedDispatcherM10307a;
                return;
            }
            if (z6 || (onBackInvokedDispatcher = this.f43686t0) == null) {
                return;
            }
            z1.m10310d(onBackInvokedDispatcher, this.f43685h0);
            this.f43686t0 = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.X0 != z6) {
            this.X0 = z6;
            m594s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(s8.m11864b(getContext(), i10));
    }

    public void setCollapsible(boolean z6) {
        this.f1788V = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1810y) {
            this.f1810y = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1809x) {
            this.f1809x = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(s8.m11864b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(s8.m11864b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m585f();
        this.f1792d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        m584e();
        this.f1789a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1799l != i10) {
            this.f1799l = i10;
            if (i10 == 0) {
                this.f1798k = getContext();
            } else {
                this.f1798k = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1807v = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1805s = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1804r = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1806t = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1811z = 8388627;
        this.f1780H = new ArrayList();
        this.f1781I = new ArrayList();
        this.f1782K = new int[2];
        this.f1783L = new C0887q(new y1(this, 1));
        this.f1784M = new ArrayList();
        this.f1785N = new C4001v(14, this);
        this.Y0 = new RunnableC0683n(10, this);
        Context context2 = getContext();
        int[] iArr = AbstractC3500a.f18363t;
        C4367l c4367lM9117H = C4367l.m9117H(context2, attributeSet, iArr, R.attr.toolbarStyle);
        v0.m2527i(this, context, iArr, attributeSet, (TypedArray) c4367lM9117H.f21922c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c4367lM9117H.f21922c;
        this.f1800m = typedArray.getResourceId(28, 0);
        this.f1801n = typedArray.getResourceId(19, 0);
        this.f1811z = typedArray.getInteger(0, 8388627);
        this.f1802p = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1807v = dimensionPixelOffset;
        this.f1806t = dimensionPixelOffset;
        this.f1805s = dimensionPixelOffset;
        this.f1804r = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1804r = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1805s = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1806t = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1807v = dimensionPixelOffset5;
        }
        this.f1803q = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m583d();
        s1 s1Var = this.f1808w;
        s1Var.f25640h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            s1Var.f25637e = dimensionPixelSize;
            s1Var.f25633a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            s1Var.f25638f = dimensionPixelSize2;
            s1Var.f25634b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            s1Var.m10289a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1809x = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1810y = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1794f = c4367lM9117H.m9145y(4);
        this.f1795g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1798k = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM9145y = c4367lM9117H.m9145y(16);
        if (drawableM9145y != null) {
            setNavigationIcon(drawableM9145y);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM9145y2 = c4367lM9117H.m9145y(11);
        if (drawableM9145y2 != null) {
            setLogo(drawableM9145y2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c4367lM9117H.m9140t(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c4367lM9117H.m9140t(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c4367lM9117H.m9124I();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        b2 b2Var = new b2(context, attributeSet);
        b2Var.f25460a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3500a.f18345b);
        b2Var.f25460a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        b2Var.f25461b = 0;
        return b2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m582c();
        }
        C5236v c5236v = this.f1796h;
        if (c5236v != null) {
            c5236v.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m582c();
            this.f1796h.setImageDrawable(drawable);
        } else {
            C5236v c5236v = this.f1796h;
            if (c5236v != null) {
                c5236v.setImageDrawable(this.f1794f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1793e == null) {
                this.f1793e = new C5237w(getContext(), 0);
            }
            if (!m588m(this.f1793e)) {
                m581b(this.f1793e, true);
            }
        } else {
            C5237w c5237w = this.f1793e;
            if (c5237w != null && m588m(c5237w)) {
                removeView(this.f1793e);
                this.f1781I.remove(this.f1793e);
            }
        }
        C5237w c5237w2 = this.f1793e;
        if (c5237w2 != null) {
            c5237w2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1793e == null) {
            this.f1793e = new C5237w(getContext(), 0);
        }
        C5237w c5237w = this.f1793e;
        if (c5237w != null) {
            c5237w.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m585f();
        }
        C5236v c5236v = this.f1792d;
        if (c5236v != null) {
            c5236v.setContentDescription(charSequence);
            ia.m10698b(this.f1792d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m585f();
            if (!m588m(this.f1792d)) {
                m581b(this.f1792d, true);
            }
        } else {
            C5236v c5236v = this.f1792d;
            if (c5236v != null && m588m(c5236v)) {
                removeView(this.f1792d);
                this.f1781I.remove(this.f1792d);
            }
        }
        C5236v c5236v2 = this.f1792d;
        if (c5236v2 != null) {
            c5236v2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            j0 j0Var = this.f1791c;
            if (j0Var != null && m588m(j0Var)) {
                removeView(this.f1791c);
                this.f1781I.remove(this.f1791c);
            }
        } else {
            if (this.f1791c == null) {
                Context context = getContext();
                j0 j0Var2 = new j0(context, null);
                this.f1791c = j0Var2;
                j0Var2.setSingleLine();
                this.f1791c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1801n;
                if (i10 != 0) {
                    this.f1791c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1777E;
                if (colorStateList != null) {
                    this.f1791c.setTextColor(colorStateList);
                }
            }
            if (!m588m(this.f1791c)) {
                m581b(this.f1791c, true);
            }
        }
        j0 j0Var3 = this.f1791c;
        if (j0Var3 != null) {
            j0Var3.setText(charSequence);
        }
        this.f1775C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1777E = colorStateList;
        j0 j0Var = this.f1791c;
        if (j0Var != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            j0 j0Var = this.f1790b;
            if (j0Var != null && m588m(j0Var)) {
                removeView(this.f1790b);
                this.f1781I.remove(this.f1790b);
            }
        } else {
            if (this.f1790b == null) {
                Context context = getContext();
                j0 j0Var2 = new j0(context, null);
                this.f1790b = j0Var2;
                j0Var2.setSingleLine();
                this.f1790b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1800m;
                if (i10 != 0) {
                    this.f1790b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1776D;
                if (colorStateList != null) {
                    this.f1790b.setTextColor(colorStateList);
                }
            }
            if (!m588m(this.f1790b)) {
                m581b(this.f1790b, true);
            }
        }
        j0 j0Var3 = this.f1790b;
        if (j0Var3 != null) {
            j0Var3.setText(charSequence);
        }
        this.f1774B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1776D = colorStateList;
        j0 j0Var = this.f1790b;
        if (j0Var != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(c2 c2Var) {
    }
}
