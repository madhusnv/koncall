package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.InterfaceC1797j;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.C10936a;
import p001o.anh;
import p001o.aza;
import p001o.bkh;
import p001o.ebe;
import p001o.gza;
import p001o.isb;
import p001o.x6e;
import p001o.xy5;
import p001o.ykf;
import p001o.yya;
import p001o.zdg;
import p001o.zya;

/* loaded from: classes3.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: a */
    public final isb f12761a;

    /* renamed from: b */
    public final NavigationBarMenuView f12762b;

    /* renamed from: c */
    public final NavigationBarPresenter f12763c;

    /* renamed from: d */
    public MenuInflater f12764d;

    /* renamed from: e */
    public InterfaceC11080c f12765e;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11077a();

        /* renamed from: c */
        public Bundle f12766c;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        public class C11077a implements Parcelable.ClassLoaderCreator {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void m14844b(Parcel parcel, ClassLoader classLoader) {
            this.f12766c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f12766c);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m14844b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    public class C11078a implements C1792e.a {
        public C11078a() {
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: a */
        public boolean mo3808a(C1792e c1792e, MenuItem menuItem) {
            NavigationBarView.m14838a(NavigationBarView.this);
            return (NavigationBarView.this.f12765e == null || NavigationBarView.this.f12765e.mo14848a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: b */
        public void mo3809b(C1792e c1792e) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public interface InterfaceC11079b {
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface InterfaceC11080c {
        /* renamed from: a */
        boolean mo14848a(MenuItem menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f12763c = navigationBarPresenter;
        Context context2 = getContext();
        anh anhVarM19306j = bkh.m19306j(context2, attributeSet, ebe.NavigationBarView, i, i2, ebe.NavigationBarView_itemTextAppearanceInactive, ebe.NavigationBarView_itemTextAppearanceActive);
        isb isbVar = new isb(context2, getClass(), getMaxItemCount(), mo14842f());
        this.f12761a = isbVar;
        NavigationBarMenuView navigationBarMenuViewMo14151c = mo14151c(context2);
        this.f12762b = navigationBarMenuViewMo14151c;
        navigationBarMenuViewMo14151c.setMinimumHeight(getSuggestedMinimumHeight());
        navigationBarMenuViewMo14151c.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        navigationBarPresenter.m14833l(navigationBarMenuViewMo14151c);
        navigationBarPresenter.m14832a(1);
        navigationBarMenuViewMo14151c.setPresenter(navigationBarPresenter);
        isbVar.m4041b(navigationBarPresenter);
        navigationBarPresenter.mo3969k(getContext(), isbVar);
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_itemIconTint)) {
            navigationBarMenuViewMo14151c.setIconTintList(anhVarM19306j.m17528c(ebe.NavigationBarView_itemIconTint));
        } else {
            navigationBarMenuViewMo14151c.setIconTintList(navigationBarMenuViewMo14151c.m14817e(R.attr.textColorSecondary));
        }
        setItemIconSize(anhVarM19306j.m17531f(ebe.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(x6e.mtrl_navigation_bar_item_default_icon_size)));
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(anhVarM19306j.m17539n(ebe.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(anhVarM19306j.m17539n(ebe.NavigationBarView_itemTextAppearanceActive, 0));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_horizontalItemTextAppearanceInactive)) {
            setHorizontalItemTextAppearanceInactive(anhVarM19306j.m17539n(ebe.NavigationBarView_horizontalItemTextAppearanceInactive, 0));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_horizontalItemTextAppearanceActive)) {
            setHorizontalItemTextAppearanceActive(anhVarM19306j.m17539n(ebe.NavigationBarView_horizontalItemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(anhVarM19306j.m17526a(ebe.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_itemTextColor)) {
            setItemTextColor(anhVarM19306j.m17528c(ebe.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListM56948g = xy5.m56948g(background);
        if (background == null || colorStateListM56948g != null) {
            zya zyaVar = new zya(ykf.m57925e(context2, attributeSet, i, i2).m57970m());
            if (colorStateListM56948g != null) {
                zyaVar.g0(colorStateListM56948g);
            }
            zyaVar.m60115U(context2);
            setBackground(zyaVar);
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(anhVarM19306j.m17531f(ebe.NavigationBarView_itemPaddingTop, 0));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(anhVarM19306j.m17531f(ebe.NavigationBarView_itemPaddingBottom, 0));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_activeIndicatorLabelPadding)) {
            setActiveIndicatorLabelPadding(anhVarM19306j.m17531f(ebe.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_iconLabelHorizontalSpacing)) {
            setIconLabelHorizontalSpacing(anhVarM19306j.m17531f(ebe.NavigationBarView_iconLabelHorizontalSpacing, 0));
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_elevation)) {
            setElevation(anhVarM19306j.m17531f(ebe.NavigationBarView_elevation, 0));
        }
        getBackground().mutate().setTintList(yya.m58495b(context2, anhVarM19306j, ebe.NavigationBarView_backgroundTint));
        int dimensionPixelSize = -1;
        setLabelVisibilityMode(anhVarM19306j.m17537l(ebe.NavigationBarView_labelVisibilityMode, -1));
        setItemIconGravity(anhVarM19306j.m17537l(ebe.NavigationBarView_itemIconGravity, 0));
        setItemGravity(anhVarM19306j.m17537l(ebe.NavigationBarView_itemGravity, 49));
        int iM17539n = anhVarM19306j.m17539n(ebe.NavigationBarView_itemBackground, 0);
        if (iM17539n != 0) {
            navigationBarMenuViewMo14151c.setItemBackgroundRes(iM17539n);
        } else {
            setItemRippleColor(yya.m58495b(context2, anhVarM19306j, ebe.NavigationBarView_itemRippleColor));
        }
        setMeasureBottomPaddingFromLabelBaseline(anhVarM19306j.m17526a(ebe.NavigationBarView_measureBottomPaddingFromLabelBaseline, true));
        setLabelFontScalingEnabled(anhVarM19306j.m17526a(ebe.NavigationBarView_labelFontScalingEnabled, false));
        setLabelMaxLines(anhVarM19306j.m17537l(ebe.NavigationBarView_labelMaxLines, 1));
        int iM17539n2 = anhVarM19306j.m17539n(ebe.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (iM17539n2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iM17539n2, ebe.NavigationBarActiveIndicator);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.NavigationBarActiveIndicator_android_width, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize2);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.NavigationBarActiveIndicator_android_height, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_marginHorizontal, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(ebe.NavigationBarActiveIndicator_expandedWidth);
            if (string == null) {
                dimensionPixelSize = -2;
                setItemActiveIndicatorExpandedWidth(dimensionPixelSize);
                setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize2));
                setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(x6e.m3_navigation_item_leading_trailing_space);
                int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize3);
                int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize3);
                setItemActiveIndicatorExpandedPadding(getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.f21329x19991881, 0));
                setItemActiveIndicatorColor(yya.m58494a(context2, typedArrayObtainStyledAttributes, ebe.NavigationBarActiveIndicator_android_color));
                setItemActiveIndicatorShapeAppearance(ykf.m57922b(context2, typedArrayObtainStyledAttributes.getResourceId(ebe.NavigationBarActiveIndicator_shapeAppearance, 0), 0).m57970m());
                typedArrayObtainStyledAttributes.recycle();
            } else {
                if (!String.valueOf(-1).equals(string)) {
                    if (!String.valueOf(-2).equals(string)) {
                        dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.NavigationBarActiveIndicator_expandedWidth, -2);
                    }
                }
                setItemActiveIndicatorExpandedWidth(dimensionPixelSize);
                setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.NavigationBarActiveIndicator_expandedHeight, dimensionPixelSize2));
                setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_expandedMarginHorizontal, dimensionPixelOffset));
                int dimensionPixelSize32 = getResources().getDimensionPixelSize(x6e.m3_navigation_item_leading_trailing_space);
                int dimensionPixelOffset22 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingStart, dimensionPixelSize32);
                int dimensionPixelOffset32 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingEnd, dimensionPixelSize32);
                setItemActiveIndicatorExpandedPadding(getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.NavigationBarActiveIndicator_expandedActiveIndicatorPaddingTop, 0), getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.f21329x19991881, 0));
                setItemActiveIndicatorColor(yya.m58494a(context2, typedArrayObtainStyledAttributes, ebe.NavigationBarActiveIndicator_android_color));
                setItemActiveIndicatorShapeAppearance(ykf.m57922b(context2, typedArrayObtainStyledAttributes.getResourceId(ebe.NavigationBarActiveIndicator_shapeAppearance, 0), 0).m57970m());
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        if (anhVarM19306j.m17544s(ebe.NavigationBarView_menu)) {
            m14841e(anhVarM19306j.m17539n(ebe.NavigationBarView_menu, 0));
        }
        anhVarM19306j.m17546x();
        if (!mo14843g()) {
            addView(navigationBarMenuViewMo14151c);
        }
        isbVar.mo4036W(new C11078a());
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC11079b m14838a(NavigationBarView navigationBarView) {
        navigationBarView.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f12764d == null) {
            this.f12764d = new zdg(getContext());
        }
        return this.f12764d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.f12762b.setMeasurePaddingFromLabelBaseline(z);
    }

    /* renamed from: c */
    public abstract NavigationBarMenuView mo14151c(Context context);

    /* renamed from: d */
    public C10936a m14840d(int i) {
        return this.f12762b.m14821j(i);
    }

    /* renamed from: e */
    public void m14841e(int i) throws Resources.NotFoundException {
        this.f12763c.m14834m(true);
        getMenuInflater().inflate(i, this.f12761a);
        this.f12763c.m14834m(false);
        this.f12763c.mo3967h(true);
    }

    /* renamed from: f */
    public boolean mo14842f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo14843g() {
        return false;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f12762b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f12762b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f12762b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f12762b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f12762b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f12762b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f12762b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f12762b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f12762b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f12762b.getItemActiveIndicatorMarginHorizontal();
    }

    public ykf getItemActiveIndicatorShapeAppearance() {
        return this.f12762b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f12762b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f12762b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f12762b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f12762b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f12762b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f12762b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f12762b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f12762b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f12762b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f12762b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f12762b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f12762b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f12762b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f12762b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f12761a;
    }

    public InterfaceC1797j getMenuView() {
        return this.f12762b;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f12762b;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f12763c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f12762b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f12762b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aza.m18044e(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        this.f12761a.m4033T(savedState.f12766c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f12766c = bundle;
        this.f12761a.m4035V(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f12762b.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        aza.m18043d(this, f);
    }

    public void setHorizontalItemTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f12762b.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f12762b.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.f12762b.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f12762b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.f12762b.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.f12762b.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f12762b.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedPadding(int i, int i2, int i3, int i4) {
        this.f12762b.setItemActiveIndicatorExpandedPadding(i, i2, i3, i4);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.f12762b.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f12762b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f12762b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(ykf ykfVar) {
        this.f12762b.setItemActiveIndicatorShapeAppearance(ykfVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f12762b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f12762b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f12762b.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) throws Resources.NotFoundException {
        if (this.f12762b.getItemGravity() != i) {
            this.f12762b.setItemGravity(i);
            this.f12763c.mo3967h(false);
        }
    }

    public void setItemIconGravity(int i) throws Resources.NotFoundException {
        if (this.f12762b.getItemIconGravity() != i) {
            this.f12762b.setItemIconGravity(i);
            this.f12763c.mo3967h(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f12762b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f12762b.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        this.f12762b.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemPaddingBottom(int i) {
        this.f12762b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f12762b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f12762b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f12762b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) throws Resources.NotFoundException {
        this.f12762b.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f12762b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f12762b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z) throws Resources.NotFoundException {
        this.f12762b.setLabelFontScalingEnabled(z);
    }

    public void setLabelMaxLines(int i) {
        this.f12762b.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) throws Resources.NotFoundException {
        if (this.f12762b.getLabelVisibilityMode() != i) {
            this.f12762b.setLabelVisibilityMode(i);
            this.f12763c.mo3967h(false);
        }
    }

    public void setOnItemReselectedListener(InterfaceC11079b interfaceC11079b) {
    }

    public void setOnItemSelectedListener(InterfaceC11080c interfaceC11080c) {
        this.f12765e = interfaceC11080c;
    }

    public void setSelectedItemId(int i) {
        MenuItem menuItemFindItem = this.f12761a.findItem(i);
        if (menuItemFindItem != null) {
            boolean zM4029P = this.f12761a.m4029P(menuItemFindItem, this.f12763c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zM4029P || menuItemFindItem.isChecked()) {
                    this.f12762b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }
}
