package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.material.appbar.AppBarLayout;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import p001o.aza;
import p001o.bkh;
import p001o.ebe;
import p001o.fy5;
import p001o.gjh;
import p001o.gua;
import p001o.gza;
import p001o.ish;
import p001o.lk0;
import p001o.n8e;
import p001o.n9e;
import p001o.pae;
import p001o.u7e;
import p001o.x5e;
import p001o.x6e;
import p001o.x8f;
import p001o.ykf;
import p001o.z5e;
import p001o.zya;

/* loaded from: classes3.dex */
public class SearchBar extends Toolbar {
    public static final int b1 = pae.Widget_Material3_SearchBar;
    public final TextView L0;
    public final boolean M0;
    public final boolean N0;
    public final x8f O0;
    public final Drawable P0;
    public final boolean Q0;
    public final boolean R0;
    public final int S0;
    public int T0;
    public View U0;
    public Integer V0;
    public Drawable W0;
    public int X0;
    public boolean Y0;
    public zya Z0;
    public boolean a1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11091a();

        /* renamed from: c */
        public String f12834c;

        /* renamed from: com.google.android.material.search.SearchBar$SavedState$a */
        public class C11091a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
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

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f12834c);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12834c = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButtonM32700d = ish.m32700d(this);
        if (imageButtonM32700d == null) {
            return;
        }
        imageButtonM32700d.setClickable(!z);
        imageButtonM32700d.setFocusable(!z);
        Drawable background = imageButtonM32700d.getBackground();
        if (background != null) {
            this.W0 = background;
        }
        imageButtonM32700d.setBackgroundDrawable(z ? null : this.W0);
        m14924X();
    }

    /* renamed from: N */
    public final int m14914N(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    /* renamed from: O */
    public final int m14915O(int i) {
        int measuredWidth = getLayoutDirection() == 1 ? getMeasuredWidth() - this.L0.getRight() : this.L0.getLeft();
        int iMax = Math.max(this.S0 - measuredWidth, 0);
        int i2 = this.T0;
        return (i2 == 0 || i != i2 || measuredWidth - i >= this.S0) ? iMax : i;
    }

    /* renamed from: P */
    public final void m14916P(ykf ykfVar, int i, float f, float f2, int i2) {
        zya zyaVar = new zya(ykfVar);
        this.Z0 = zyaVar;
        zyaVar.m60115U(getContext());
        this.Z0.f0(f);
        if (f2 >= 0.0f) {
            this.Z0.p0(f2, i2);
        }
        int iM29505d = gua.m29505d(this, z5e.colorControlHighlight);
        this.Z0.g0(ColorStateList.valueOf(i));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM29505d);
        zya zyaVar2 = this.Z0;
        setBackground(new RippleDrawable(colorStateListValueOf, zyaVar2, zyaVar2));
    }

    /* renamed from: Q */
    public final void m14917Q() {
        setNavigationIcon(getNavigationIcon() == null ? this.P0 : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    /* renamed from: R */
    public final void m14918R(int i, String str, String str2) {
        if (i != -1) {
            gjh.m28914m(this.L0, i);
        }
        setText(str);
        setHint(str2);
        setTextCentered(this.a1);
    }

    /* renamed from: S */
    public final void m14919S() {
        View view = this.U0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i = measuredWidth2 + measuredWidth;
        int measuredHeight = this.U0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        m14920T(this.U0, measuredWidth2, measuredHeight2, i, measuredHeight2 + measuredHeight);
    }

    /* renamed from: T */
    public final void m14920T(View view, int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    /* renamed from: U */
    public final Drawable m14921U(Drawable drawable) {
        int iM29505d;
        if (!this.Q0 || drawable == null) {
            return drawable;
        }
        Integer num = this.V0;
        if (num != null) {
            iM29505d = num.intValue();
        } else {
            iM29505d = gua.m29505d(this, drawable == this.P0 ? x5e.colorOnSurfaceVariant : x5e.colorOnSurface);
        }
        Drawable drawableM27744r = fy5.m27744r(drawable.mutate());
        drawableM27744r.setTint(iM29505d);
        return drawableM27744r;
    }

    /* renamed from: V */
    public final void m14922V(int i, int i2) {
        View view = this.U0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    /* renamed from: W */
    public final void m14923W() throws Resources.NotFoundException {
        if (this.N0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(x6e.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = m14914N(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = m14914N(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = m14914N(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = m14914N(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    /* renamed from: X */
    public final void m14924X() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton imageButtonM32700d = ish.m32700d(this);
        int width = (imageButtonM32700d == null || !imageButtonM32700d.isClickable()) ? 0 : z ? getWidth() - imageButtonM32700d.getLeft() : imageButtonM32700d.getRight();
        ActionMenuView actionMenuViewM32697a = ish.m32697a(this);
        int right = actionMenuViewM32697a != null ? z ? actionMenuViewM32697a.getRight() : getWidth() - actionMenuViewM32697a.getLeft() : 0;
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    /* renamed from: Y */
    public final void m14925Y() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.Y0) {
                if (layoutParams.m13874c() == 0) {
                    layoutParams.m13878g(53);
                }
            } else if (layoutParams.m13874c() == 53) {
                layoutParams.m13878g(0);
            }
        }
    }

    /* renamed from: Z */
    public void m14926Z() {
        this.O0.m55845b(this);
    }

    public final void a0(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE) != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", MediaTrack.ROLE_SUBTITLE) != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.M0 && this.U0 == null && !(view instanceof ActionMenuView)) {
            this.U0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public View getCenterView() {
        return this.U0;
    }

    public float getCompatElevation() {
        zya zyaVar = this.Z0;
        return zyaVar != null ? zyaVar.m60095A() : getElevation();
    }

    public float getCornerSize() {
        return this.Z0.m60108N();
    }

    public int getDefaultMarginVerticalResource() {
        return x6e.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return u7e.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.L0.getHint();
    }

    public int getMenuResId() {
        return this.X0;
    }

    public int getStrokeColor() {
        return this.Z0.m60104J().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.Z0.m60106L();
    }

    public CharSequence getText() {
        return this.L0.getText();
    }

    public boolean getTextCentered() {
        return this.a1;
    }

    public TextView getTextView() {
        return this.L0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        aza.m18045f(this, this.Z0);
        m14923W();
        m14925Y();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Toolbar.LayoutParams layoutParams;
        int marginStart;
        int iM14915O;
        super.onLayout(z, i, i2, i3, i4);
        m14919S();
        m14924X();
        TextView textView = this.L0;
        if (textView == null || marginStart == (iM14915O = m14915O((marginStart = (layoutParams = (Toolbar.LayoutParams) textView.getLayoutParams()).getMarginStart())))) {
            return;
        }
        layoutParams.setMarginStart(iM14915O);
        this.T0 = iM14915O;
        this.L0.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m14922V(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        setText(savedState.f12834c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f12834c = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.U0;
        if (view2 != null) {
            removeView(view2);
            this.U0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.Y0 = z;
        m14925Y();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        zya zyaVar = this.Z0;
        if (zyaVar != null) {
            zyaVar.f0(f);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.L0.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m14921U(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.R0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.O0.m55844a(z);
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.Z0.r0(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            this.Z0.s0(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.L0.setText(charSequence);
    }

    public void setTextCentered(boolean z) {
        this.a1 = z;
        TextView textView = this.L0;
        if (textView == null) {
            return;
        }
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) textView.getLayoutParams();
        if (z) {
            this.L0.setGravity(1);
            layoutParams.f5276a = 1;
        } else {
            this.L0.setGravity(0);
            layoutParams.f5276a = 0;
        }
        this.L0.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: x */
    public void mo4433x(int i) {
        super.mo4433x(i);
        this.X0 = i;
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h */
        public boolean f12835h;

        public ScrollingViewBehavior() {
            this.f12835h = false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: T */
        public boolean mo13924T() {
            return true;
        }

        /* renamed from: Y */
        public final void m14930Y(AppBarLayout appBarLayout) throws Resources.NotFoundException {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: l */
        public boolean mo5775l(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            boolean zMo5775l = super.mo5775l(coordinatorLayout, view, view2);
            if (!this.f12835h && (view2 instanceof AppBarLayout)) {
                this.f12835h = true;
                m14930Y((AppBarLayout) view2);
            }
            return zMo5775l;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12835h = false;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialSearchBarStyle);
    }

    public void setHint(int i) {
        this.L0.setHint(i);
    }

    public void setText(int i) {
        this.L0.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        int i2 = b1;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.X0 = -1;
        Context context2 = getContext();
        a0(attributeSet);
        this.S0 = getResources().getDimensionPixelSize(x6e.m3_searchbar_text_margin_start_no_navigation_icon);
        this.P0 = lk0.m37353b(context2, getDefaultNavigationIconResource());
        this.O0 = new x8f();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.SearchBar, i, i2, new int[0]);
        ykf ykfVarM57970m = ykf.m57925e(context2, attributeSet, i, i2).m57970m();
        int color = typedArrayM19305i.getColor(ebe.SearchBar_backgroundTint, 0);
        float dimension = typedArrayM19305i.getDimension(ebe.SearchBar_elevation, 0.0f);
        this.N0 = typedArrayM19305i.getBoolean(ebe.SearchBar_defaultMarginsEnabled, true);
        this.Y0 = typedArrayM19305i.getBoolean(ebe.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = typedArrayM19305i.getBoolean(ebe.SearchBar_hideNavigationIcon, false);
        this.R0 = typedArrayM19305i.getBoolean(ebe.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.Q0 = typedArrayM19305i.getBoolean(ebe.SearchBar_tintNavigationIcon, true);
        if (typedArrayM19305i.hasValue(ebe.SearchBar_navigationIconTint)) {
            this.V0 = Integer.valueOf(typedArrayM19305i.getColor(ebe.SearchBar_navigationIconTint, -1));
        }
        int resourceId = typedArrayM19305i.getResourceId(ebe.SearchBar_android_textAppearance, -1);
        String string = typedArrayM19305i.getString(ebe.SearchBar_android_text);
        String string2 = typedArrayM19305i.getString(ebe.SearchBar_android_hint);
        float dimension2 = typedArrayM19305i.getDimension(ebe.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayM19305i.getColor(ebe.SearchBar_strokeColor, 0);
        this.a1 = typedArrayM19305i.getBoolean(ebe.SearchBar_textCentered, false);
        typedArrayM19305i.recycle();
        if (!z) {
            m14917Q();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(n9e.mtrl_search_bar, this);
        this.M0 = true;
        this.L0 = (TextView) findViewById(n8e.open_search_bar_text_view);
        setElevation(dimension);
        m14918R(resourceId, string, string2);
        m14916P(ykfVarM57970m, color, dimension, dimension2, color2);
    }
}
