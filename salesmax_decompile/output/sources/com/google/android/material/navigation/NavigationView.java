package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import java.util.Objects;
import p001o.anh;
import p001o.aza;
import p001o.bkh;
import p001o.cz5;
import p001o.dbj;
import p001o.dza;
import p001o.ebe;
import p001o.gh0;
import p001o.gue;
import p001o.gza;
import p001o.l64;
import p001o.l91;
import p001o.lk0;
import p001o.msb;
import p001o.nc2;
import p001o.nsb;
import p001o.pae;
import p001o.qta;
import p001o.r9j;
import p001o.rta;
import p001o.slf;
import p001o.x5e;
import p001o.x6e;
import p001o.xy5;
import p001o.ykf;
import p001o.yya;
import p001o.z5e;
import p001o.zdg;
import p001o.zya;

/* loaded from: classes3.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements qta {
    public static final int[] p0 = {R.attr.state_checked};
    public static final int[] q0 = {-16842910};
    public static final int r0 = pae.Widget_Design_NavigationView;

    /* renamed from: H */
    public ViewTreeObserver.OnGlobalLayoutListener f12768H;

    /* renamed from: L */
    public boolean f12769L;

    /* renamed from: M */
    public boolean f12770M;

    /* renamed from: Q */
    public boolean f12771Q;

    /* renamed from: h */
    public final msb f12772h;
    public boolean h0;
    public int i0;
    public final boolean j0;
    public final int k0;
    public final slf l0;
    public final dza m0;
    public final rta n0;
    public final DrawerLayout.InterfaceC2057e o0;

    /* renamed from: q */
    public final nsb f12773q;

    /* renamed from: s */
    public final int f12774s;

    /* renamed from: x */
    public final int[] f12775x;

    /* renamed from: y */
    public MenuInflater f12776y;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public class C11082a extends DrawerLayout.AbstractC2058f {
        public C11082a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2057e
        /* renamed from: a */
        public void mo17a(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final rta rtaVar = navigationView.n0;
                Objects.requireNonNull(rtaVar);
                view.post(new Runnable() { // from class: o.usb
                    @Override // java.lang.Runnable
                    public final void run() {
                        rtaVar.m47156e();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2057e
        /* renamed from: b */
        public void mo18b(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.n0.m47157f();
                NavigationView.this.m14865v();
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public class C11083b implements C1792e.a {
        public C11083b() {
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: a */
        public boolean mo3808a(C1792e c1792e, MenuItem menuItem) {
            NavigationView.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: b */
        public void mo3809b(C1792e c1792e) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC11084c implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC11084c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f12775x);
            boolean z = true;
            boolean z2 = NavigationView.this.f12775x[1] == 0;
            NavigationView.this.f12773q.m41037D(z2);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z2 && navigationView2.m14864t());
            boolean z3 = NavigationView.this.getLayoutDirection() == 1;
            boolean z4 = NavigationView.this.f12775x[0] == 0 || NavigationView.this.f12775x[0] + NavigationView.this.getWidth() == 0;
            NavigationView navigationView3 = NavigationView.this;
            navigationView3.setDrawLeftInsetForeground(z4 && (!z3 ? !navigationView3.m14863s() : !navigationView3.m14862r()));
            Activity activityM36609a = l64.m36609a(NavigationView.this.getContext());
            if (activityM36609a != null) {
                Rect rectM22763a = dbj.m22763a(activityM36609a);
                boolean z5 = rectM22763a.height() - NavigationView.this.getHeight() == NavigationView.this.f12775x[1];
                boolean z6 = Color.alpha(activityM36609a.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView4 = NavigationView.this;
                navigationView4.setDrawBottomInsetForeground(z5 && z6 && navigationView4.m14861q());
                boolean z7 = rectM22763a.width() == NavigationView.this.f12775x[0] || rectM22763a.width() - NavigationView.this.getWidth() == NavigationView.this.f12775x[0];
                NavigationView navigationView5 = NavigationView.this;
                if (!z7 || (!z3 ? !navigationView5.m14862r() : !navigationView5.m14863s())) {
                    z = false;
                }
                navigationView5.setDrawRightInsetForeground(z);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$d */
    public interface InterfaceC11085d {
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f12776y == null) {
            this.f12776y = new zdg(getContext());
        }
        return this.f12776y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m14854u(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // p001o.qta
    /* renamed from: a */
    public void mo14172a() {
        m14867x();
        this.m0.m23963f();
        m14865v();
    }

    @Override // p001o.qta
    /* renamed from: b */
    public void mo14173b(l91 l91Var) {
        m14867x();
        this.m0.m23967j(l91Var);
    }

    @Override // p001o.qta
    /* renamed from: c */
    public void mo14174c(l91 l91Var) {
        this.m0.m23969l(l91Var, ((DrawerLayout.LayoutParams) m14867x().second).f7232a);
        if (this.j0) {
            this.i0 = gh0.m28649c(0, this.k0, this.m0.m44146a(l91Var.m36806a()));
            m14866w(getWidth(), getHeight());
        }
    }

    @Override // p001o.qta
    /* renamed from: d */
    public void mo14175d() {
        Pair pairM14867x = m14867x();
        DrawerLayout drawerLayout = (DrawerLayout) pairM14867x.first;
        l91 l91VarM44148c = this.m0.m44148c();
        if (l91VarM44148c == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.m6010h(this);
            return;
        }
        this.m0.m23965h(l91VarM44148c, ((DrawerLayout.LayoutParams) pairM14867x.second).f7232a, cz5.m22127b(drawerLayout, this), cz5.m22128c(drawerLayout));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.l0.m48493e(canvas, new nc2.InterfaceC15542a() { // from class: o.tsb
            @Override // p001o.nc2.InterfaceC15542a
            /* renamed from: a */
            public final void mo40312a(Canvas canvas2) {
                this.f47673a.m14854u(canvas2);
            }
        });
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    /* renamed from: e */
    public void mo14767e(r9j r9jVar) {
        this.f12773q.m41061m(r9jVar);
    }

    public dza getBackHelper() {
        return this.m0;
    }

    public MenuItem getCheckedItem() {
        return this.f12773q.m41062n();
    }

    public int getDividerInsetEnd() {
        return this.f12773q.m41063o();
    }

    public int getDividerInsetStart() {
        return this.f12773q.m41064p();
    }

    public int getHeaderCount() {
        return this.f12773q.m41065q();
    }

    public Drawable getItemBackground() {
        return this.f12773q.m41066r();
    }

    public int getItemHorizontalPadding() {
        return this.f12773q.m41067s();
    }

    public int getItemIconPadding() {
        return this.f12773q.m41068t();
    }

    public ColorStateList getItemIconTintList() {
        return this.f12773q.m41071w();
    }

    public int getItemMaxLines() {
        return this.f12773q.m41069u();
    }

    public ColorStateList getItemTextColor() {
        return this.f12773q.m41070v();
    }

    public int getItemVerticalPadding() {
        return this.f12773q.m41072x();
    }

    public Menu getMenu() {
        return this.f12772h;
    }

    public int getSubheaderInsetEnd() {
        return this.f12773q.m41074z();
    }

    public int getSubheaderInsetStart() {
        return this.f12773q.m41034A();
    }

    /* renamed from: k */
    public final ColorStateList m14855k(int i) {
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
        int[] iArr = q0;
        return new ColorStateList(new int[][]{iArr, p0, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM37352a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: l */
    public final Drawable m14856l(anh anhVar) {
        return m14857m(anhVar, yya.m58495b(getContext(), anhVar, ebe.NavigationView_itemShapeFillColor));
    }

    /* renamed from: m */
    public final Drawable m14857m(anh anhVar, ColorStateList colorStateList) {
        zya zyaVar = new zya(ykf.m57922b(getContext(), anhVar.m17539n(ebe.NavigationView_itemShapeAppearance, 0), anhVar.m17539n(ebe.NavigationView_itemShapeAppearanceOverlay, 0)).m57970m());
        zyaVar.g0(colorStateList);
        return new InsetDrawable((Drawable) zyaVar, anhVar.m17531f(ebe.NavigationView_itemShapeInsetStart, 0), anhVar.m17531f(ebe.NavigationView_itemShapeInsetTop, 0), anhVar.m17531f(ebe.NavigationView_itemShapeInsetEnd, 0), anhVar.m17531f(ebe.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: n */
    public final boolean m14858n(anh anhVar) {
        return anhVar.m17544s(ebe.NavigationView_itemShapeAppearance) || anhVar.m17544s(ebe.NavigationView_itemShapeAppearanceOverlay);
    }

    /* renamed from: o */
    public View m14859o(int i) {
        return this.f12773q.m41036C(i);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aza.m18044e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.n0.m47153b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.m5995O(this.o0);
            drawerLayout.m6004b(this.o0);
            if (drawerLayout.m5985E(this)) {
                this.n0.m47156e();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f12768H);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).m5995O(this.o0);
        }
        this.n0.m47157f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f12774s), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f12774s, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        this.f12772h.m4033T(savedState.f12777c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f12777c = bundle;
        this.f12772h.m4035V(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m14866w(i, i2);
    }

    /* renamed from: p */
    public void m14860p(int i) {
        this.f12773q.m41058Y(true);
        getMenuInflater().inflate(i, this.f12772h);
        this.f12773q.m41058Y(false);
        this.f12773q.mo3967h(false);
    }

    /* renamed from: q */
    public boolean m14861q() {
        return this.f12770M;
    }

    /* renamed from: r */
    public boolean m14862r() {
        return this.h0;
    }

    /* renamed from: s */
    public boolean m14863s() {
        return this.f12771Q;
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f12770M = z;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.f12772h.findItem(i);
        if (menuItemFindItem != null) {
            this.f12773q.m41038E((C1794g) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        this.f12773q.m41039F(i);
    }

    public void setDividerInsetStart(int i) {
        this.f12773q.m41040G(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        aza.m18043d(this, f);
    }

    public void setEndInsetScrimEnabled(boolean z) {
        this.h0 = z;
    }

    public void setForceCompatClippingEnabled(boolean z) {
        this.l0.m48496h(this, z);
    }

    public void setItemBackground(Drawable drawable) {
        this.f12773q.m41042I(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f12773q.m41044K(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f12773q.m41044K(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f12773q.m41045L(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f12773q.m41045L(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f12773q.m41046M(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f12773q.m41047N(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f12773q.m41048O(i);
    }

    public void setItemTextAppearance(int i) {
        this.f12773q.m41049P(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.f12773q.m41050Q(z);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f12773q.m41051R(colorStateList);
    }

    public void setItemVerticalPadding(int i) {
        this.f12773q.m41052S(i);
    }

    public void setItemVerticalPaddingResource(int i) {
        this.f12773q.m41052S(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(InterfaceC11085d interfaceC11085d) {
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        nsb nsbVar = this.f12773q;
        if (nsbVar != null) {
            nsbVar.m41053T(i);
        }
    }

    public void setStartInsetScrimEnabled(boolean z) {
        this.f12771Q = z;
    }

    public void setSubheaderInsetEnd(int i) {
        this.f12773q.m41055V(i);
    }

    public void setSubheaderInsetStart(int i) {
        this.f12773q.m41056W(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f12769L = z;
    }

    /* renamed from: t */
    public boolean m14864t() {
        return this.f12769L;
    }

    /* renamed from: v */
    public final void m14865v() {
        if (!this.j0 || this.i0 == 0) {
            return;
        }
        this.i0 = 0;
        m14866w(getWidth(), getHeight());
    }

    /* renamed from: w */
    public final void m14866w(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.i0 > 0 || this.j0) && (getBackground() instanceof zya)) {
                boolean z = Gravity.getAbsoluteGravity(((DrawerLayout.LayoutParams) getLayoutParams()).f7232a, getLayoutDirection()) == 3;
                zya zyaVar = (zya) getBackground();
                ykf.C18426b c18426bM57971o = zyaVar.m60103I().m57943w().m57971o(this.i0);
                if (z) {
                    c18426bM57971o.m57964E(0.0f);
                    c18426bM57971o.m57978v(0.0f);
                } else {
                    c18426bM57971o.m57968I(0.0f);
                    c18426bM57971o.m57982z(0.0f);
                }
                ykf ykfVarM57970m = c18426bM57971o.m57970m();
                zyaVar.setShapeAppearanceModel(ykfVarM57970m);
                this.l0.m48495g(this, ykfVarM57970m);
                this.l0.m48494f(this, new RectF(0.0f, 0.0f, i, i2));
                this.l0.m48497i(this, true);
            }
        }
    }

    /* renamed from: x */
    public final Pair m14867x() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    /* renamed from: y */
    public final void m14868y() {
        this.f12768H = new ViewTreeObserverOnGlobalLayoutListenerC11084c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f12768H);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11081a();

        /* renamed from: c */
        public Bundle f12777c;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        public class C11081a implements Parcelable.ClassLoaderCreator {
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
            this.f12777c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f12777c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM14855k;
        int i2;
        int i3;
        int i4 = r0;
        super(gza.m29680d(context, attributeSet, i, i4), attributeSet, i);
        nsb nsbVar = new nsb();
        this.f12773q = nsbVar;
        this.f12775x = new int[2];
        this.f12769L = true;
        this.f12770M = true;
        this.f12771Q = true;
        this.h0 = true;
        this.i0 = 0;
        this.l0 = slf.m48489a(this);
        this.m0 = new dza(this);
        this.n0 = new rta(this);
        this.o0 = new C11082a();
        Context context2 = getContext();
        msb msbVar = new msb(context2);
        this.f12772h = msbVar;
        anh anhVarM19306j = bkh.m19306j(context2, attributeSet, ebe.NavigationView, i, i4, new int[0]);
        if (anhVarM19306j.m17544s(ebe.NavigationView_android_background)) {
            setBackground(anhVarM19306j.m17532g(ebe.NavigationView_android_background));
        }
        int iM17531f = anhVarM19306j.m17531f(ebe.NavigationView_drawerLayoutCornerSize, 0);
        this.i0 = iM17531f;
        this.j0 = iM17531f == 0;
        this.k0 = getResources().getDimensionPixelSize(x6e.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListM56948g = xy5.m56948g(background);
        if (background == null || colorStateListM56948g != null) {
            zya zyaVar = new zya(ykf.m57925e(context2, attributeSet, i, i4).m57970m());
            if (colorStateListM56948g != null) {
                zyaVar.g0(colorStateListM56948g);
            }
            zyaVar.m60115U(context2);
            setBackground(zyaVar);
        }
        if (anhVarM19306j.m17544s(ebe.NavigationView_elevation)) {
            setElevation(anhVarM19306j.m17531f(ebe.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(anhVarM19306j.m17526a(ebe.NavigationView_android_fitsSystemWindows, false));
        this.f12774s = anhVarM19306j.m17531f(ebe.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateListM17528c = anhVarM19306j.m17544s(ebe.NavigationView_subheaderColor) ? anhVarM19306j.m17528c(ebe.NavigationView_subheaderColor) : null;
        int iM17539n = anhVarM19306j.m17544s(ebe.NavigationView_subheaderTextAppearance) ? anhVarM19306j.m17539n(ebe.NavigationView_subheaderTextAppearance, 0) : 0;
        if (iM17539n == 0 && colorStateListM17528c == null) {
            colorStateListM17528c = m14855k(R.attr.textColorSecondary);
        }
        if (anhVarM19306j.m17544s(ebe.NavigationView_itemIconTint)) {
            colorStateListM14855k = anhVarM19306j.m17528c(ebe.NavigationView_itemIconTint);
        } else {
            colorStateListM14855k = m14855k(R.attr.textColorSecondary);
        }
        int iM17539n2 = anhVarM19306j.m17544s(ebe.NavigationView_itemTextAppearance) ? anhVarM19306j.m17539n(ebe.NavigationView_itemTextAppearance, 0) : 0;
        boolean zM17526a = anhVarM19306j.m17526a(ebe.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if (anhVarM19306j.m17544s(ebe.NavigationView_itemIconSize)) {
            setItemIconSize(anhVarM19306j.m17531f(ebe.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateListM17528c2 = anhVarM19306j.m17544s(ebe.NavigationView_itemTextColor) ? anhVarM19306j.m17528c(ebe.NavigationView_itemTextColor) : null;
        if (iM17539n2 == 0 && colorStateListM17528c2 == null) {
            colorStateListM17528c2 = m14855k(R.attr.textColorPrimary);
        }
        Drawable drawableM17532g = anhVarM19306j.m17532g(ebe.NavigationView_itemBackground);
        if (drawableM17532g == null && m14858n(anhVarM19306j)) {
            drawableM17532g = m14856l(anhVarM19306j);
            ColorStateList colorStateListM58495b = yya.m58495b(context2, anhVarM19306j, ebe.NavigationView_itemRippleColor);
            if (colorStateListM58495b != null) {
                nsbVar.m41043J(new RippleDrawable(gue.m29519d(colorStateListM58495b), null, m14857m(anhVarM19306j, null)));
            }
        }
        if (anhVarM19306j.m17544s(ebe.NavigationView_itemHorizontalPadding)) {
            i2 = 0;
            setItemHorizontalPadding(anhVarM19306j.m17531f(ebe.NavigationView_itemHorizontalPadding, 0));
        } else {
            i2 = 0;
        }
        if (anhVarM19306j.m17544s(ebe.NavigationView_itemVerticalPadding)) {
            setItemVerticalPadding(anhVarM19306j.m17531f(ebe.NavigationView_itemVerticalPadding, i2));
        }
        setDividerInsetStart(anhVarM19306j.m17531f(ebe.NavigationView_dividerInsetStart, i2));
        setDividerInsetEnd(anhVarM19306j.m17531f(ebe.NavigationView_dividerInsetEnd, i2));
        setSubheaderInsetStart(anhVarM19306j.m17531f(ebe.NavigationView_subheaderInsetStart, i2));
        setSubheaderInsetEnd(anhVarM19306j.m17531f(ebe.NavigationView_subheaderInsetEnd, i2));
        setTopInsetScrimEnabled(anhVarM19306j.m17526a(ebe.NavigationView_topInsetScrimEnabled, this.f12769L));
        setBottomInsetScrimEnabled(anhVarM19306j.m17526a(ebe.NavigationView_bottomInsetScrimEnabled, this.f12770M));
        setStartInsetScrimEnabled(anhVarM19306j.m17526a(ebe.NavigationView_startInsetScrimEnabled, this.f12771Q));
        setEndInsetScrimEnabled(anhVarM19306j.m17526a(ebe.NavigationView_endInsetScrimEnabled, this.h0));
        int iM17531f2 = anhVarM19306j.m17531f(ebe.NavigationView_itemIconPadding, 0);
        setItemMaxLines(anhVarM19306j.m17536k(ebe.NavigationView_itemMaxLines, 1));
        msbVar.mo4036W(new C11083b());
        nsbVar.m41041H(1);
        nsbVar.mo3969k(context2, msbVar);
        if (iM17539n != 0) {
            nsbVar.m41057X(iM17539n);
        }
        nsbVar.m41054U(colorStateListM17528c);
        nsbVar.m41047N(colorStateListM14855k);
        nsbVar.m41053T(getOverScrollMode());
        if (iM17539n2 != 0) {
            nsbVar.m41049P(iM17539n2);
        }
        nsbVar.m41050Q(zM17526a);
        nsbVar.m41051R(colorStateListM17528c2);
        nsbVar.m41042I(drawableM17532g);
        nsbVar.m41045L(iM17531f2);
        msbVar.m4041b(nsbVar);
        addView((View) nsbVar.m41073y(this));
        if (anhVarM19306j.m17544s(ebe.NavigationView_menu)) {
            i3 = 0;
            m14860p(anhVarM19306j.m17539n(ebe.NavigationView_menu, 0));
        } else {
            i3 = 0;
        }
        if (anhVarM19306j.m17544s(ebe.NavigationView_headerLayout)) {
            m14859o(anhVarM19306j.m17539n(ebe.NavigationView_headerLayout, i3));
        }
        anhVarM19306j.m17546x();
        m14868y();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f12772h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.f12773q.m41038E((C1794g) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
