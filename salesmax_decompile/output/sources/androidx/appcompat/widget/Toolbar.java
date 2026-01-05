package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.view.menu.SubMenuC1799l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p001o.anh;
import p001o.bbb;
import p001o.bbe;
import p001o.dv7;
import p001o.e85;
import p001o.jsh;
import p001o.jve;
import p001o.lk0;
import p001o.pg3;
import p001o.tab;
import p001o.wab;
import p001o.wvi;
import p001o.yzi;
import p001o.z5e;
import p001o.zdg;

/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup implements tab {
    public final ActionMenuView.InterfaceC1817d A0;
    public C1884a B0;
    public ActionMenuPresenter C0;
    public C1881f D0;
    public InterfaceC1796i.a E0;
    public C1792e.a F0;
    public boolean G0;

    /* renamed from: H */
    public int f5984H;
    public OnBackInvokedCallback H0;
    public OnBackInvokedDispatcher I0;
    public boolean J0;
    public final Runnable K0;

    /* renamed from: L */
    public int f5985L;

    /* renamed from: M */
    public int f5986M;

    /* renamed from: Q */
    public int f5987Q;

    /* renamed from: a */
    public ActionMenuView f5988a;

    /* renamed from: b */
    public TextView f5989b;

    /* renamed from: c */
    public TextView f5990c;

    /* renamed from: d */
    public ImageButton f5991d;

    /* renamed from: e */
    public ImageView f5992e;

    /* renamed from: f */
    public Drawable f5993f;

    /* renamed from: g */
    public CharSequence f5994g;

    /* renamed from: h */
    public ImageButton f5995h;
    public int h0;
    public int i0;
    public int j0;
    public jve k0;
    public int l0;
    public int m0;
    public int n0;
    public CharSequence o0;
    public CharSequence p0;

    /* renamed from: q */
    public View f5996q;
    public ColorStateList q0;
    public ColorStateList r0;

    /* renamed from: s */
    public Context f5997s;
    public boolean s0;
    public boolean t0;
    public final ArrayList u0;
    public final ArrayList v0;
    public final int[] w0;

    /* renamed from: x */
    public int f5998x;
    public final wab x0;

    /* renamed from: y */
    public int f5999y;
    public ArrayList y0;
    public InterfaceC1882g z0;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C1876a implements ActionMenuView.InterfaceC1817d {
        public C1876a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1817d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.x0.m54145j(menuItem)) {
                return true;
            }
            InterfaceC1882g interfaceC1882g = Toolbar.this.z0;
            if (interfaceC1882g != null) {
                return interfaceC1882g.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC1877b implements Runnable {
        public RunnableC1877b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m4408L();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C1878c implements C1792e.a {
        public C1878c() {
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: a */
        public boolean mo3808a(C1792e c1792e, MenuItem menuItem) {
            C1792e.a aVar = Toolbar.this.F0;
            return aVar != null && aVar.mo3808a(c1792e, menuItem);
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: b */
        public void mo3809b(C1792e c1792e) {
            if (!Toolbar.this.f5988a.m4180J()) {
                Toolbar.this.x0.m54146k(c1792e);
            }
            C1792e.a aVar = Toolbar.this.F0;
            if (aVar != null) {
                aVar.mo3809b(c1792e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class ViewOnClickListenerC1879d implements View.OnClickListener {
        public ViewOnClickListenerC1879d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m4414e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C1880e {
        /* renamed from: a */
        public static OnBackInvokedDispatcher m4440a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        public static OnBackInvokedCallback m4441b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: o.gsh
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        /* renamed from: c */
        public static void m4442c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: d */
        public static void m4443d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public class C1881f implements InterfaceC1796i {

        /* renamed from: a */
        public C1792e f6007a;

        /* renamed from: b */
        public C1794g f6008b;

        public C1881f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: b */
        public void mo3963b(C1792e c1792e, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: c */
        public boolean mo3964c(C1792e c1792e, C1794g c1794g) {
            Toolbar.this.m4416g();
            ViewParent parent = Toolbar.this.f5995h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f5995h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f5995h);
            }
            Toolbar.this.f5996q = c1794g.getActionView();
            this.f6008b = c1794g;
            ViewParent parent2 = Toolbar.this.f5996q.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f5996q);
                }
                LayoutParams layoutParamsGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParamsGenerateDefaultLayoutParams.f5276a = (toolbar4.f5985L & 112) | 8388611;
                layoutParamsGenerateDefaultLayoutParams.f6000b = 2;
                toolbar4.f5996q.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f5996q);
            }
            Toolbar.this.m4405I();
            Toolbar.this.requestLayout();
            c1794g.m4086r(true);
            KeyEvent.Callback callback = Toolbar.this.f5996q;
            if (callback instanceof pg3) {
                ((pg3) callback).mo4363b();
            }
            Toolbar.this.m4409M();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: e */
        public void mo3987e(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: f */
        public boolean mo3966f(SubMenuC1799l subMenuC1799l) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: g */
        public Parcelable mo3988g() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: h */
        public void mo3967h(boolean z) {
            if (this.f6008b != null) {
                C1792e c1792e = this.f6007a;
                boolean z2 = false;
                if (c1792e != null) {
                    int size = c1792e.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f6007a.getItem(i) == this.f6008b) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                mo3968j(this.f6007a, this.f6008b);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: i */
        public boolean mo3989i() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: j */
        public boolean mo3968j(C1792e c1792e, C1794g c1794g) {
            KeyEvent.Callback callback = Toolbar.this.f5996q;
            if (callback instanceof pg3) {
                ((pg3) callback).mo4364f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f5996q);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f5995h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f5996q = null;
            toolbar3.m4410a();
            this.f6008b = null;
            Toolbar.this.requestLayout();
            c1794g.m4086r(false);
            Toolbar.this.m4409M();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i
        /* renamed from: k */
        public void mo3969k(Context context, C1792e c1792e) {
            C1794g c1794g;
            C1792e c1792e2 = this.f6007a;
            if (c1792e2 != null && (c1794g = this.f6008b) != null) {
                c1792e2.mo4045f(c1794g);
            }
            this.f6007a = c1792e;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public interface InterfaceC1882g {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new zdg(getContext());
    }

    /* renamed from: A */
    public boolean m4397A() {
        ActionMenuView actionMenuView = this.f5988a;
        return actionMenuView != null && actionMenuView.m4179I();
    }

    /* renamed from: B */
    public boolean m4398B() {
        ActionMenuView actionMenuView = this.f5988a;
        return actionMenuView != null && actionMenuView.m4180J();
    }

    /* renamed from: C */
    public final int m4399C(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iM4426q = m4426q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM4426q, iMax + measuredWidth, view.getMeasuredHeight() + iM4426q);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    /* renamed from: D */
    public final int m4400D(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM4426q = m4426q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM4426q, iMax, view.getMeasuredHeight() + iM4426q);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    /* renamed from: E */
    public final int m4401E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* renamed from: F */
    public final void m4402F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    public final void m4403G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.x0.m54143h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.y0 = currentMenuItems2;
    }

    /* renamed from: H */
    public final void m4404H() {
        removeCallbacks(this.K0);
        post(this.K0);
    }

    /* renamed from: I */
    public void m4405I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).f6000b != 2 && childAt != this.f5988a) {
                removeViewAt(childCount);
                this.v0.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public final boolean m4406J() {
        if (!this.G0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m4407K(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    public final boolean m4407K(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: L */
    public boolean m4408L() {
        ActionMenuView actionMenuView = this.f5988a;
        return actionMenuView != null && actionMenuView.m4184O();
    }

    /* renamed from: M */
    void m4409M() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM4440a = C1880e.m4440a(this);
            boolean z = m4431v() && onBackInvokedDispatcherM4440a != null && isAttachedToWindow() && this.J0;
            if (z && this.I0 == null) {
                if (this.H0 == null) {
                    this.H0 = C1880e.m4441b(new Runnable() { // from class: o.fsh
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f24041a.m4414e();
                        }
                    });
                }
                C1880e.m4442c(onBackInvokedDispatcherM4440a, this.H0);
                this.I0 = onBackInvokedDispatcherM4440a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.I0) == null) {
                return;
            }
            C1880e.m4443d(onBackInvokedDispatcher, this.H0);
            this.I0 = null;
        }
    }

    /* renamed from: a */
    public void m4410a() {
        for (int size = this.v0.size() - 1; size >= 0; size--) {
            addView((View) this.v0.get(size));
        }
        this.v0.clear();
    }

    @Override // p001o.tab
    public void addMenuProvider(bbb bbbVar) {
        this.x0.m54140c(bbbVar);
    }

    /* renamed from: b */
    public final void m4411b(List list, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iM23889b = dv7.m23889b(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f6000b == 0 && m4407K(childAt) && m4425p(layoutParams.f5276a) == iM23889b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f6000b == 0 && m4407K(childAt2) && m4425p(layoutParams2.f5276a) == iM23889b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void m4412c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParamsGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        layoutParamsGenerateDefaultLayoutParams.f6000b = 1;
        if (!z || this.f5996q == null) {
            addView(view, layoutParamsGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.v0.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: d */
    public boolean m4413d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f5988a) != null && actionMenuView.m4181K();
    }

    /* renamed from: e */
    public void m4414e() {
        C1881f c1881f = this.D0;
        C1794g c1794g = c1881f == null ? null : c1881f.f6008b;
        if (c1794g != null) {
            c1794g.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m4415f() {
        ActionMenuView actionMenuView = this.f5988a;
        if (actionMenuView != null) {
            actionMenuView.m4172B();
        }
    }

    /* renamed from: g */
    public void m4416g() {
        if (this.f5995h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, z5e.toolbarNavigationButtonStyle);
            this.f5995h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f5993f);
            this.f5995h.setContentDescription(this.f5994g);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f5276a = (this.f5985L & 112) | 8388611;
            layoutParamsGenerateDefaultLayoutParams.f6000b = 2;
            this.f5995h.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.f5995h.setOnClickListener(new ViewOnClickListenerC1879d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f5995h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f5995h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        jve jveVar = this.k0;
        if (jveVar != null) {
            return jveVar.m34578a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.m0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        jve jveVar = this.k0;
        if (jveVar != null) {
            return jveVar.m34579b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        jve jveVar = this.k0;
        if (jveVar != null) {
            return jveVar.m34580c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        jve jveVar = this.k0;
        if (jveVar != null) {
            return jveVar.m34581d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.l0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C1792e c1792eM4183N;
        ActionMenuView actionMenuView = this.f5988a;
        return actionMenuView != null && (c1792eM4183N = actionMenuView.m4183N()) != null && c1792eM4183N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.m0, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.l0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f5992e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f5992e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m4419j();
        return this.f5988a.getMenu();
    }

    public View getNavButtonView() {
        return this.f5991d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f5991d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f5991d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.C0;
    }

    public Drawable getOverflowIcon() {
        m4419j();
        return this.f5988a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f5997s;
    }

    public int getPopupTheme() {
        return this.f5998x;
    }

    public CharSequence getSubtitle() {
        return this.p0;
    }

    public final TextView getSubtitleTextView() {
        return this.f5990c;
    }

    public CharSequence getTitle() {
        return this.o0;
    }

    public int getTitleMarginBottom() {
        return this.j0;
    }

    public int getTitleMarginEnd() {
        return this.h0;
    }

    public int getTitleMarginStart() {
        return this.f5987Q;
    }

    public int getTitleMarginTop() {
        return this.i0;
    }

    public final TextView getTitleTextView() {
        return this.f5989b;
    }

    public e85 getWrapper() {
        if (this.B0 == null) {
            this.B0 = new C1884a(this, true);
        }
        return this.B0;
    }

    /* renamed from: h */
    public final void m4417h() {
        if (this.k0 == null) {
            this.k0 = new jve();
        }
    }

    /* renamed from: i */
    public final void m4418i() {
        if (this.f5992e == null) {
            this.f5992e = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    public final void m4419j() {
        m4420k();
        if (this.f5988a.m4183N() == null) {
            C1792e c1792e = (C1792e) this.f5988a.getMenu();
            if (this.D0 == null) {
                this.D0 = new C1881f();
            }
            this.f5988a.setExpandedActionViewsExclusive(true);
            c1792e.m4042c(this.D0, this.f5997s);
            m4409M();
        }
    }

    /* renamed from: k */
    public final void m4420k() {
        if (this.f5988a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f5988a = actionMenuView;
            actionMenuView.setPopupTheme(this.f5998x);
            this.f5988a.setOnMenuItemClickListener(this.A0);
            this.f5988a.setMenuCallbacks(this.E0, new C1878c());
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f5276a = (this.f5985L & 112) | 8388613;
            this.f5988a.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            m4412c(this.f5988a, false);
        }
    }

    /* renamed from: l */
    public final void m4421l() {
        if (this.f5991d == null) {
            this.f5991d = new AppCompatImageButton(getContext(), null, z5e.toolbarNavigationButtonStyle);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.f5276a = (this.f5985L & 112) | 8388611;
            this.f5991d.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4409M();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.K0);
        m4409M();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.t0 = false;
        }
        if (!this.t0) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.t0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.t0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM4399C;
        int iM4400D;
        int iMax;
        boolean zM4407K;
        boolean zM4407K2;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int size;
        int i17;
        int size2;
        int i18;
        int i19;
        int size3;
        boolean z2 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i20 = width - paddingRight;
        int[] iArr = this.w0;
        iArr[1] = 0;
        iArr[0] = 0;
        int iM55088A = wvi.m55088A(this);
        int iMin = iM55088A >= 0 ? Math.min(iM55088A, i4 - i2) : 0;
        if (!m4407K(this.f5991d)) {
            iM4399C = paddingLeft;
        } else {
            if (z2) {
                iM4400D = m4400D(this.f5991d, i20, iArr, iMin);
                iM4399C = paddingLeft;
                if (m4407K(this.f5995h)) {
                    if (z2) {
                        iM4400D = m4400D(this.f5995h, iM4400D, iArr, iMin);
                    } else {
                        iM4399C = m4399C(this.f5995h, iM4399C, iArr, iMin);
                    }
                }
                if (m4407K(this.f5988a)) {
                    if (z2) {
                        iM4399C = m4399C(this.f5988a, iM4399C, iArr, iMin);
                    } else {
                        iM4400D = m4400D(this.f5988a, iM4400D, iArr, iMin);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM4399C);
                iArr[1] = Math.max(0, currentContentInsetRight - (i20 - iM4400D));
                iMax = Math.max(iM4399C, currentContentInsetLeft);
                int iMin2 = Math.min(iM4400D, i20 - currentContentInsetRight);
                if (m4407K(this.f5996q)) {
                    if (z2) {
                        iMin2 = m4400D(this.f5996q, iMin2, iArr, iMin);
                    } else {
                        iMax = m4399C(this.f5996q, iMax, iArr, iMin);
                    }
                }
                if (m4407K(this.f5992e)) {
                    if (z2) {
                        iMin2 = m4400D(this.f5992e, iMin2, iArr, iMin);
                    } else {
                        iMax = m4399C(this.f5992e, iMax, iArr, iMin);
                    }
                }
                zM4407K = m4407K(this.f5989b);
                zM4407K2 = m4407K(this.f5990c);
                if (zM4407K) {
                    i5 = paddingRight;
                    measuredHeight = 0;
                } else {
                    LayoutParams layoutParams = (LayoutParams) this.f5989b.getLayoutParams();
                    i5 = paddingRight;
                    measuredHeight = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.f5989b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + 0;
                }
                if (zM4407K2) {
                    i6 = width;
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) this.f5990c.getLayoutParams();
                    i6 = width;
                    measuredHeight += ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + this.f5990c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                }
                if (!zM4407K || zM4407K2) {
                    TextView textView = !zM4407K ? this.f5989b : this.f5990c;
                    TextView textView2 = !zM4407K2 ? this.f5990c : this.f5989b;
                    LayoutParams layoutParams3 = (LayoutParams) textView.getLayoutParams();
                    LayoutParams layoutParams4 = (LayoutParams) textView2.getLayoutParams();
                    boolean z3 = (zM4407K && this.f5989b.getMeasuredWidth() > 0) || (zM4407K2 && this.f5990c.getMeasuredWidth() > 0);
                    i7 = this.n0 & 112;
                    i8 = paddingLeft;
                    if (i7 == 48) {
                        i9 = iMax;
                        i10 = iMin;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + this.i0;
                    } else if (i7 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin;
                        i10 = iMin;
                        int i22 = this.i0;
                        i9 = iMax;
                        if (iMax2 < i21 + i22) {
                            iMax2 = i21 + i22;
                        } else {
                            int i23 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                            int i24 = ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            int i25 = this.j0;
                            if (i23 < i24 + i25) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin + i25) - i23));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        i9 = iMax;
                        i10 = iMin;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin) - this.j0) - measuredHeight;
                    }
                    if (!z2) {
                        if (z3) {
                            i12 = this.f5987Q;
                            i11 = 0;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        int i26 = i12 - iArr[i11];
                        iMax = i9 + Math.max(i11, i26);
                        iArr[i11] = Math.max(i11, -i26);
                        if (zM4407K) {
                            LayoutParams layoutParams5 = (LayoutParams) this.f5989b.getLayoutParams();
                            int measuredWidth = this.f5989b.getMeasuredWidth() + iMax;
                            int measuredHeight2 = this.f5989b.getMeasuredHeight() + paddingTop;
                            this.f5989b.layout(iMax, paddingTop, measuredWidth, measuredHeight2);
                            i13 = measuredWidth + this.h0;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        } else {
                            i13 = iMax;
                        }
                        if (zM4407K2) {
                            int i27 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f5990c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f5990c.getMeasuredWidth() + iMax;
                            this.f5990c.layout(iMax, i27, measuredWidth2, this.f5990c.getMeasuredHeight() + i27);
                            i14 = measuredWidth2 + this.h0;
                        } else {
                            i14 = iMax;
                        }
                        if (z3) {
                            iMax = Math.max(i13, i14);
                        }
                        m4411b(this.u0, 3);
                        size = this.u0.size();
                        for (i17 = i11; i17 < size; i17++) {
                            iMax = m4399C((View) this.u0.get(i17), iMax, iArr, i10);
                        }
                        int i28 = i10;
                        m4411b(this.u0, 5);
                        size2 = this.u0.size();
                        for (i18 = i11; i18 < size2; i18++) {
                            iMin2 = m4400D((View) this.u0.get(i18), iMin2, iArr, i28);
                        }
                        m4411b(this.u0, 1);
                        int iM4430u = m4430u(this.u0, iArr);
                        i19 = (i8 + (((i6 - i8) - i5) / 2)) - (iM4430u / 2);
                        int i29 = iM4430u + i19;
                        if (i19 >= iMax) {
                            iMax = i29 > iMin2 ? i19 - (i29 - iMin2) : i19;
                        }
                        size3 = this.u0.size();
                        while (i11 < size3) {
                            iMax = m4399C((View) this.u0.get(i11), iMax, iArr, i28);
                            i11++;
                        }
                        this.u0.clear();
                    }
                    int i30 = (z3 ? this.f5987Q : 0) - iArr[1];
                    iMin2 -= Math.max(0, i30);
                    iArr[1] = Math.max(0, -i30);
                    if (zM4407K) {
                        LayoutParams layoutParams6 = (LayoutParams) this.f5989b.getLayoutParams();
                        int measuredWidth3 = iMin2 - this.f5989b.getMeasuredWidth();
                        int measuredHeight3 = this.f5989b.getMeasuredHeight() + paddingTop;
                        this.f5989b.layout(measuredWidth3, paddingTop, iMin2, measuredHeight3);
                        i15 = measuredWidth3 - this.h0;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    } else {
                        i15 = iMin2;
                    }
                    if (zM4407K2) {
                        int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((LayoutParams) this.f5990c.getLayoutParams())).topMargin;
                        this.f5990c.layout(iMin2 - this.f5990c.getMeasuredWidth(), i31, iMin2, this.f5990c.getMeasuredHeight() + i31);
                        i16 = iMin2 - this.h0;
                    } else {
                        i16 = iMin2;
                    }
                    if (z3) {
                        iMin2 = Math.min(i15, i16);
                    }
                    iMax = i9;
                } else {
                    i8 = paddingLeft;
                    i10 = iMin;
                }
                i11 = 0;
                m4411b(this.u0, 3);
                size = this.u0.size();
                while (i17 < size) {
                }
                int i282 = i10;
                m4411b(this.u0, 5);
                size2 = this.u0.size();
                while (i18 < size2) {
                }
                m4411b(this.u0, 1);
                int iM4430u2 = m4430u(this.u0, iArr);
                i19 = (i8 + (((i6 - i8) - i5) / 2)) - (iM4430u2 / 2);
                int i292 = iM4430u2 + i19;
                if (i19 >= iMax) {
                }
                size3 = this.u0.size();
                while (i11 < size3) {
                }
                this.u0.clear();
            }
            iM4399C = m4399C(this.f5991d, paddingLeft, iArr, iMin);
        }
        iM4400D = i20;
        if (m4407K(this.f5995h)) {
        }
        if (m4407K(this.f5988a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM4399C);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i20 - iM4400D));
        iMax = Math.max(iM4399C, currentContentInsetLeft2);
        int iMin22 = Math.min(iM4400D, i20 - currentContentInsetRight2);
        if (m4407K(this.f5996q)) {
        }
        if (m4407K(this.f5992e)) {
        }
        zM4407K = m4407K(this.f5989b);
        zM4407K2 = m4407K(this.f5990c);
        if (zM4407K) {
        }
        if (zM4407K2) {
        }
        if (zM4407K) {
            if (!zM4407K) {
            }
            if (!zM4407K2) {
            }
            LayoutParams layoutParams32 = (LayoutParams) textView.getLayoutParams();
            LayoutParams layoutParams42 = (LayoutParams) textView2.getLayoutParams();
            if (zM4407K) {
                i7 = this.n0 & 112;
                i8 = paddingLeft;
                if (i7 == 48) {
                }
                if (!z2) {
                }
            } else {
                i7 = this.n0 & 112;
                i8 = paddingLeft;
                if (i7 == 48) {
                }
                if (!z2) {
                }
            }
        }
        m4411b(this.u0, 3);
        size = this.u0.size();
        while (i17 < size) {
        }
        int i2822 = i10;
        m4411b(this.u0, 5);
        size2 = this.u0.size();
        while (i18 < size2) {
        }
        m4411b(this.u0, 1);
        int iM4430u22 = m4430u(this.u0, iArr);
        i19 = (i8 + (((i6 - i8) - i5) / 2)) - (iM4430u22 / 2);
        int i2922 = iM4430u22 + i19;
        if (i19 >= iMax) {
        }
        size3 = this.u0.size();
        while (i11 < size3) {
        }
        this.u0.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.w0;
        boolean zM58585b = yzi.m58585b(this);
        int i3 = !zM58585b ? 1 : 0;
        if (m4407K(this.f5991d)) {
            m4402F(this.f5991d, i, 0, i2, 0, this.f5986M);
            measuredWidth = this.f5991d.getMeasuredWidth() + m4428s(this.f5991d);
            iMax = Math.max(0, this.f5991d.getMeasuredHeight() + m4429t(this.f5991d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f5991d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m4407K(this.f5995h)) {
            m4402F(this.f5995h, i, 0, i2, 0, this.f5986M);
            measuredWidth = this.f5995h.getMeasuredWidth() + m4428s(this.f5995h);
            iMax = Math.max(iMax, this.f5995h.getMeasuredHeight() + m4429t(this.f5995h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5995h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[zM58585b ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m4407K(this.f5988a)) {
            m4402F(this.f5988a, i, iMax3, i2, 0, this.f5986M);
            measuredWidth2 = this.f5988a.getMeasuredWidth() + m4428s(this.f5988a);
            iMax = Math.max(iMax, this.f5988a.getMeasuredHeight() + m4429t(this.f5988a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5988a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (m4407K(this.f5996q)) {
            iMax4 += m4401E(this.f5996q, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f5996q.getMeasuredHeight() + m4429t(this.f5996q));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5996q.getMeasuredState());
        }
        if (m4407K(this.f5992e)) {
            iMax4 += m4401E(this.f5992e, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f5992e.getMeasuredHeight() + m4429t(this.f5992e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f5992e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((LayoutParams) childAt.getLayoutParams()).f6000b == 0 && m4407K(childAt)) {
                iMax4 += m4401E(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + m4429t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i5 = this.i0 + this.j0;
        int i6 = this.f5987Q + this.h0;
        if (m4407K(this.f5989b)) {
            m4401E(this.f5989b, i, iMax4 + i6, i2, i5, iArr);
            int measuredWidth3 = this.f5989b.getMeasuredWidth() + m4428s(this.f5989b);
            measuredHeight = this.f5989b.getMeasuredHeight() + m4429t(this.f5989b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f5989b.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m4407K(this.f5990c)) {
            iMax2 = Math.max(iMax2, m4401E(this.f5990c, i, iMax4 + i6, i2, measuredHeight + i5, iArr));
            measuredHeight += this.f5990c.getMeasuredHeight() + m4429t(this.f5990c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f5990c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), m4406J() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        ActionMenuView actionMenuView = this.f5988a;
        C1792e c1792eM4183N = actionMenuView != null ? actionMenuView.m4183N() : null;
        int i = savedState.f6001c;
        if (i != 0 && this.D0 != null && c1792eM4183N != null && (menuItemFindItem = c1792eM4183N.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f6002d) {
            m4404H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m4417h();
        this.k0.m34583f(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C1794g c1794g;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C1881f c1881f = this.D0;
        if (c1881f != null && (c1794g = c1881f.f6008b) != null) {
            savedState.f6001c = c1794g.getItemId();
        }
        savedState.f6002d = m4398B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.s0 = false;
        }
        if (!this.s0) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.s0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.s0 = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m4425p(int i) {
        int layoutDirection = getLayoutDirection();
        int iM23889b = dv7.m23889b(i, layoutDirection) & 7;
        return (iM23889b == 1 || iM23889b == 3 || iM23889b == 5) ? iM23889b : layoutDirection == 1 ? 5 : 3;
    }

    /* renamed from: q */
    public final int m4426q(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iM4427r = m4427r(layoutParams.f5276a);
        if (iM4427r == 48) {
            return getPaddingTop() - i2;
        }
        if (iM4427r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: r */
    public final int m4427r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.n0 & 112;
    }

    @Override // p001o.tab
    public void removeMenuProvider(bbb bbbVar) {
        this.x0.m54147l(bbbVar);
    }

    /* renamed from: s */
    public final int m4428s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.J0 != z) {
            this.J0 = z;
            m4409M();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(lk0.m37353b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.G0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.m0) {
            this.m0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.l0) {
            this.l0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m4417h();
        this.k0.m34582e(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        m4417h();
        this.k0.m34584g(i, i2);
    }

    public void setLogo(int i) {
        setLogo(lk0.m37353b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setMenu(C1792e c1792e, ActionMenuPresenter actionMenuPresenter) {
        if (c1792e == null && this.f5988a == null) {
            return;
        }
        m4420k();
        C1792e c1792eM4183N = this.f5988a.m4183N();
        if (c1792eM4183N == c1792e) {
            return;
        }
        if (c1792eM4183N != null) {
            c1792eM4183N.m4031R(this.C0);
            c1792eM4183N.m4031R(this.D0);
        }
        if (this.D0 == null) {
            this.D0 = new C1881f();
        }
        actionMenuPresenter.m4162J(true);
        if (c1792e != null) {
            c1792e.m4042c(actionMenuPresenter, this.f5997s);
            c1792e.m4042c(this.D0, this.f5997s);
        } else {
            actionMenuPresenter.mo3969k(this.f5997s, null);
            this.D0.mo3969k(this.f5997s, null);
            actionMenuPresenter.mo3967h(true);
            this.D0.mo3967h(true);
        }
        this.f5988a.setPopupTheme(this.f5998x);
        this.f5988a.setPresenter(actionMenuPresenter);
        this.C0 = actionMenuPresenter;
        m4409M();
    }

    public void setMenuCallbacks(InterfaceC1796i.a aVar, C1792e.a aVar2) {
        this.E0 = aVar;
        this.F0 = aVar2;
        ActionMenuView actionMenuView = this.f5988a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(lk0.m37353b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m4421l();
        this.f5991d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC1882g interfaceC1882g) {
        this.z0 = interfaceC1882g;
    }

    public void setOverflowIcon(Drawable drawable) {
        m4419j();
        this.f5988a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f5998x != i) {
            this.f5998x = i;
            if (i == 0) {
                this.f5997s = getContext();
            } else {
                this.f5997s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.f5984H = i;
        TextView textView = this.f5990c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f5987Q = i;
        this.i0 = i2;
        this.h0 = i3;
        this.j0 = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.j0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.h0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f5987Q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.i0 = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.f5999y = i;
        TextView textView = this.f5989b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public final int m4429t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    public final int m4430u(List list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = (View) list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    /* renamed from: v */
    public boolean m4431v() {
        C1881f c1881f = this.D0;
        return (c1881f == null || c1881f.f6008b == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m4432w() {
        ActionMenuView actionMenuView = this.f5988a;
        return actionMenuView != null && actionMenuView.m4178H();
    }

    /* renamed from: x */
    public void mo4433x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public void m4434y() {
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        m4403G();
    }

    /* renamed from: z */
    public final boolean m4435z(View view) {
        return view.getParent() == this || this.v0.contains(view);
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        public int f6000b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6000b = 0;
        }

        /* renamed from: a */
        public void m4436a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f6000b = 0;
            this.f5276a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f6000b = 0;
            this.f6000b = layoutParams.f6000b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6000b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6000b = 0;
            m4436a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6000b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.toolbarStyle);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4416g();
        }
        ImageButton imageButton = this.f5995h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m4416g();
            this.f5995h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f5995h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f5993f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m4418i();
            if (!m4435z(this.f5992e)) {
                m4412c(this.f5992e, true);
            }
        } else {
            ImageView imageView = this.f5992e;
            if (imageView != null && m4435z(imageView)) {
                removeView(this.f5992e);
                this.v0.remove(this.f5992e);
            }
        }
        ImageView imageView2 = this.f5992e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4418i();
        }
        ImageView imageView = this.f5992e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m4421l();
        }
        ImageButton imageButton = this.f5991d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            jsh.m34483a(this.f5991d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m4421l();
            if (!m4435z(this.f5991d)) {
                m4412c(this.f5991d, true);
            }
        } else {
            ImageButton imageButton = this.f5991d;
            if (imageButton != null && m4435z(imageButton)) {
                removeView(this.f5991d);
                this.v0.remove(this.f5991d);
            }
        }
        ImageButton imageButton2 = this.f5991d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f5990c;
            if (textView != null && m4435z(textView)) {
                removeView(this.f5990c);
                this.v0.remove(this.f5990c);
            }
        } else {
            if (this.f5990c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f5990c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f5990c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f5984H;
                if (i != 0) {
                    this.f5990c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.r0;
                if (colorStateList != null) {
                    this.f5990c.setTextColor(colorStateList);
                }
            }
            if (!m4435z(this.f5990c)) {
                m4412c(this.f5990c, true);
            }
        }
        TextView textView2 = this.f5990c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.p0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.r0 = colorStateList;
        TextView textView = this.f5990c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f5989b;
            if (textView != null && m4435z(textView)) {
                removeView(this.f5989b);
                this.v0.remove(this.f5989b);
            }
        } else {
            if (this.f5989b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f5989b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f5989b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f5999y;
                if (i != 0) {
                    this.f5989b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.q0;
                if (colorStateList != null) {
                    this.f5989b.setTextColor(colorStateList);
                }
            }
            if (!m4435z(this.f5989b)) {
                m4412c(this.f5989b, true);
            }
        }
        TextView textView2 = this.f5989b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.o0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.q0 = colorStateList;
        TextView textView = this.f5989b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1875a();

        /* renamed from: c */
        public int f6001c;

        /* renamed from: d */
        public boolean f6002d;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        public class C1875a implements Parcelable.ClassLoaderCreator {
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
            this.f6001c = parcel.readInt();
            this.f6002d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6001c);
            parcel.writeInt(this.f6002d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n0 = 8388627;
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.w0 = new int[2];
        this.x0 = new wab(new Runnable() { // from class: o.esh
            @Override // java.lang.Runnable
            public final void run() {
                this.f22119a.m4434y();
            }
        });
        this.y0 = new ArrayList();
        this.A0 = new C1876a();
        this.K0 = new RunnableC1877b();
        anh anhVarM17525v = anh.m17525v(getContext(), attributeSet, bbe.Toolbar, i, 0);
        wvi.k0(this, context, bbe.Toolbar, attributeSet, anhVarM17525v.m17543r(), i, 0);
        this.f5999y = anhVarM17525v.m17539n(bbe.Toolbar_titleTextAppearance, 0);
        this.f5984H = anhVarM17525v.m17539n(bbe.Toolbar_subtitleTextAppearance, 0);
        this.n0 = anhVarM17525v.m17537l(bbe.Toolbar_android_gravity, this.n0);
        this.f5985L = anhVarM17525v.m17537l(bbe.Toolbar_buttonGravity, 48);
        int iM17530e = anhVarM17525v.m17530e(bbe.Toolbar_titleMargin, 0);
        iM17530e = anhVarM17525v.m17544s(bbe.Toolbar_titleMargins) ? anhVarM17525v.m17530e(bbe.Toolbar_titleMargins, iM17530e) : iM17530e;
        this.j0 = iM17530e;
        this.i0 = iM17530e;
        this.h0 = iM17530e;
        this.f5987Q = iM17530e;
        int iM17530e2 = anhVarM17525v.m17530e(bbe.Toolbar_titleMarginStart, -1);
        if (iM17530e2 >= 0) {
            this.f5987Q = iM17530e2;
        }
        int iM17530e3 = anhVarM17525v.m17530e(bbe.Toolbar_titleMarginEnd, -1);
        if (iM17530e3 >= 0) {
            this.h0 = iM17530e3;
        }
        int iM17530e4 = anhVarM17525v.m17530e(bbe.Toolbar_titleMarginTop, -1);
        if (iM17530e4 >= 0) {
            this.i0 = iM17530e4;
        }
        int iM17530e5 = anhVarM17525v.m17530e(bbe.Toolbar_titleMarginBottom, -1);
        if (iM17530e5 >= 0) {
            this.j0 = iM17530e5;
        }
        this.f5986M = anhVarM17525v.m17531f(bbe.Toolbar_maxButtonHeight, -1);
        int iM17530e6 = anhVarM17525v.m17530e(bbe.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iM17530e7 = anhVarM17525v.m17530e(bbe.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iM17531f = anhVarM17525v.m17531f(bbe.Toolbar_contentInsetLeft, 0);
        int iM17531f2 = anhVarM17525v.m17531f(bbe.Toolbar_contentInsetRight, 0);
        m4417h();
        this.k0.m34582e(iM17531f, iM17531f2);
        if (iM17530e6 != Integer.MIN_VALUE || iM17530e7 != Integer.MIN_VALUE) {
            this.k0.m34584g(iM17530e6, iM17530e7);
        }
        this.l0 = anhVarM17525v.m17530e(bbe.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.m0 = anhVarM17525v.m17530e(bbe.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f5993f = anhVarM17525v.m17532g(bbe.Toolbar_collapseIcon);
        this.f5994g = anhVarM17525v.m17541p(bbe.Toolbar_collapseContentDescription);
        CharSequence charSequenceM17541p = anhVarM17525v.m17541p(bbe.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceM17541p)) {
            setTitle(charSequenceM17541p);
        }
        CharSequence charSequenceM17541p2 = anhVarM17525v.m17541p(bbe.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceM17541p2)) {
            setSubtitle(charSequenceM17541p2);
        }
        this.f5997s = getContext();
        setPopupTheme(anhVarM17525v.m17539n(bbe.Toolbar_popupTheme, 0));
        Drawable drawableM17532g = anhVarM17525v.m17532g(bbe.Toolbar_navigationIcon);
        if (drawableM17532g != null) {
            setNavigationIcon(drawableM17532g);
        }
        CharSequence charSequenceM17541p3 = anhVarM17525v.m17541p(bbe.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceM17541p3)) {
            setNavigationContentDescription(charSequenceM17541p3);
        }
        Drawable drawableM17532g2 = anhVarM17525v.m17532g(bbe.Toolbar_logo);
        if (drawableM17532g2 != null) {
            setLogo(drawableM17532g2);
        }
        CharSequence charSequenceM17541p4 = anhVarM17525v.m17541p(bbe.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceM17541p4)) {
            setLogoDescription(charSequenceM17541p4);
        }
        if (anhVarM17525v.m17544s(bbe.Toolbar_titleTextColor)) {
            setTitleTextColor(anhVarM17525v.m17528c(bbe.Toolbar_titleTextColor));
        }
        if (anhVarM17525v.m17544s(bbe.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(anhVarM17525v.m17528c(bbe.Toolbar_subtitleTextColor));
        }
        if (anhVarM17525v.m17544s(bbe.Toolbar_menu)) {
            mo4433x(anhVarM17525v.m17539n(bbe.Toolbar_menu, 0));
        }
        anhVarM17525v.m17546x();
    }
}
