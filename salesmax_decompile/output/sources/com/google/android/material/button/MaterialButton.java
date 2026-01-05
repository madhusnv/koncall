package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001o.aza;
import p001o.bkh;
import p001o.ebe;
import p001o.fy5;
import p001o.gza;
import p001o.l37;
import p001o.lk0;
import p001o.pae;
import p001o.rlf;
import p001o.umb;
import p001o.w4g;
import p001o.wta;
import p001o.x4g;
import p001o.x5e;
import p001o.xzi;
import p001o.y0g;
import p001o.ykf;
import p001o.yya;
import p001o.z0g;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, rlf {
    public static final int[] s0 = {R.attr.state_checkable};
    public static final int[] t0 = {R.attr.state_checked};
    public static final int u0 = pae.Widget_MaterialComponents_Button;
    public static final int v0 = x5e.materialSizeOverlay;
    public static final l37 w0 = new C10975a("widthIncrease");

    /* renamed from: H */
    public int f12226H;

    /* renamed from: L */
    public int f12227L;

    /* renamed from: M */
    public boolean f12228M;

    /* renamed from: Q */
    public boolean f12229Q;

    /* renamed from: d */
    public final wta f12230d;

    /* renamed from: e */
    public final LinkedHashSet f12231e;

    /* renamed from: f */
    public InterfaceC10977c f12232f;

    /* renamed from: g */
    public PorterDuff.Mode f12233g;

    /* renamed from: h */
    public ColorStateList f12234h;
    public int h0;
    public int i0;
    public float j0;
    public int k0;
    public int l0;
    public int m0;
    public x4g n0;
    public int o0;
    public float p0;

    /* renamed from: q */
    public Drawable f12235q;
    public float q0;
    public y0g r0;

    /* renamed from: s */
    public String f12236s;

    /* renamed from: x */
    public int f12237x;

    /* renamed from: y */
    public int f12238y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10974a();

        /* renamed from: c */
        public boolean f12239c;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        public class C10974a implements Parcelable.ClassLoaderCreator {
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
        public final void m14226b(Parcel parcel) {
            this.f12239c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12239c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m14226b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public class C10975a extends l37 {
        public C10975a(String str) {
            super(str);
        }

        @Override // p001o.l37
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float mo14230a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // p001o.l37
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo14231b(MaterialButton materialButton, float f) {
            materialButton.setDisplayedWidthIncrease(f);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC10976b {
        /* renamed from: a */
        void mo14234a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public interface InterfaceC10977c {
        /* renamed from: a */
        void mo14235a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.p0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    /* renamed from: j */
    private boolean m14212j() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            m14225p();
            invalidate();
            if (getParent() instanceof MaterialButtonGroup) {
                ((MaterialButtonGroup) getParent()).m14247l(this, (int) this.p0);
            }
        }
    }

    /* renamed from: c */
    public void m14213c(InterfaceC10976b interfaceC10976b) {
        this.f12231e.add(interfaceC10976b);
    }

    /* renamed from: d */
    public final z0g m14214d() {
        return umb.m51787h(getContext(), x5e.motionSpringFastSpatial, pae.Motion_Material3_Spring_Standard_Fast_Spatial);
    }

    /* renamed from: e */
    public final void m14215e() {
        y0g y0gVar = new y0g(this, w0);
        this.r0 = y0gVar;
        y0gVar.m57093w(m14214d());
    }

    /* renamed from: f */
    public boolean m14216f() {
        wta wtaVar = this.f12230d;
        return wtaVar != null && wtaVar.m54990r();
    }

    /* renamed from: g */
    public final boolean m14217g() {
        int i = this.h0;
        return i == 3 || i == 4;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f12236s)) {
            return (m14216f() ? CompoundButton.class : Button.class).getName();
        }
        return this.f12236s;
    }

    public int getAllowedWidthDecrease() {
        return this.m0;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m14220k()) {
            return this.f12230d.m54974b();
        }
        return 0;
    }

    public z0g getCornerSpringForce() {
        return this.f12230d.m54975c();
    }

    public Drawable getIcon() {
        return this.f12235q;
    }

    public int getIconGravity() {
        return this.h0;
    }

    public int getIconPadding() {
        return this.f12227L;
    }

    public int getIconSize() {
        return this.f12237x;
    }

    public ColorStateList getIconTint() {
        return this.f12234h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f12233g;
    }

    public int getInsetBottom() {
        return this.f12230d.m54976d();
    }

    public int getInsetTop() {
        return this.f12230d.m54977e();
    }

    public ColorStateList getRippleColor() {
        if (m14220k()) {
            return this.f12230d.m54981i();
        }
        return null;
    }

    public ykf getShapeAppearanceModel() {
        if (m14220k()) {
            return this.f12230d.m54982j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public w4g getStateListShapeAppearanceModel() {
        if (m14220k()) {
            return this.f12230d.m54983k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m14220k()) {
            return this.f12230d.m54984l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m14220k()) {
            return this.f12230d.m54985m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return m14220k() ? this.f12230d.m54986n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m14220k() ? this.f12230d.m54987o() : super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public final boolean m14218h() {
        int i = this.h0;
        return i == 1 || i == 2;
    }

    /* renamed from: i */
    public final boolean m14219i() {
        int i = this.h0;
        return i == 16 || i == 32;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f12228M;
    }

    /* renamed from: k */
    public final boolean m14220k() {
        wta wtaVar = this.f12230d;
        return (wtaVar == null || wtaVar.m54989q()) ? false : true;
    }

    /* renamed from: l */
    public final void m14221l(boolean z) {
        if (this.n0 == null) {
            return;
        }
        if (this.r0 == null) {
            m14215e();
        }
        if ((getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0) {
            this.r0.m57089s(Math.min(this.o0, this.n0.m55634e(getDrawableState()).f53194a.m55638a(getWidth())));
            if (z) {
                this.r0.m57094x();
            }
        }
    }

    /* renamed from: m */
    public final void m14222m() {
        if (m14218h()) {
            setCompoundDrawablesRelative(this.f12235q, null, null, null);
        } else if (m14217g()) {
            setCompoundDrawablesRelative(null, null, this.f12235q, null);
        } else if (m14219i()) {
            setCompoundDrawablesRelative(null, this.f12235q, null, null);
        }
    }

    /* renamed from: n */
    public final void m14223n(boolean z) {
        Drawable drawable = this.f12235q;
        boolean z2 = true;
        if (drawable != null) {
            Drawable drawableMutate = fy5.m27744r(drawable).mutate();
            this.f12235q = drawableMutate;
            drawableMutate.setTintList(this.f12234h);
            PorterDuff.Mode mode = this.f12233g;
            if (mode != null) {
                this.f12235q.setTintMode(mode);
            }
            int intrinsicWidth = this.f12237x;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f12235q.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f12237x;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f12235q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f12235q;
            int i = this.f12238y;
            int i2 = this.f12226H;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f12235q.setVisible(true, z);
        }
        if (z) {
            m14222m();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!m14218h() || drawable3 == this.f12235q) && ((!m14217g() || drawable5 == this.f12235q) && (!m14219i() || drawable4 == this.f12235q))) {
            z2 = false;
        }
        if (z2) {
            m14222m();
        }
    }

    /* renamed from: o */
    public final void m14224o(int i, int i2) {
        if (this.f12235q == null || getLayout() == null) {
            return;
        }
        if (!m14218h() && !m14217g()) {
            if (m14219i()) {
                this.f12238y = 0;
                if (this.h0 == 16) {
                    this.f12226H = 0;
                    m14223n(false);
                    return;
                }
                int intrinsicHeight = this.f12237x;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f12235q.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f12227L) - getPaddingBottom()) / 2);
                if (this.f12226H != iMax) {
                    this.f12226H = iMax;
                    m14223n(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f12226H = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i3 = this.h0;
        if (i3 == 1 || i3 == 3 || ((i3 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i3 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f12238y = 0;
            m14223n(false);
            return;
        }
        int intrinsicWidth = this.f12237x;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f12235q.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f12227L) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (m14212j() != (this.h0 == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f12238y != textLayoutWidth) {
            this.f12238y = textLayoutWidth;
            m14223n(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m14220k()) {
            aza.m18045f(this, this.f12230d.m54979g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m14216f()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, s0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, t0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m14216f());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        m14224o(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.i0 != i6) {
            this.i0 = i6;
            this.j0 = -1.0f;
        }
        if (this.j0 == -1.0f) {
            this.j0 = i3 - i;
        }
        if (this.m0 == -1) {
            if (this.f12235q == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f12237x;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f12235q.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.m0 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.k0 == -1) {
            this.k0 = getPaddingStart();
        }
        if (this.l0 == -1) {
            this.l0 = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        setChecked(savedState.f12239c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12239c = this.f12228M;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m14224o(getMeasuredWidth(), getMeasuredHeight());
    }

    /* renamed from: p */
    public final void m14225p() {
        int i = (int) (this.p0 - this.q0);
        int i2 = i / 2;
        setPaddingRelative(this.k0 + i2, getPaddingTop(), (this.l0 + i) - i2, getPaddingBottom());
        getLayoutParams().width = (int) (this.j0 + i);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f12230d.m54991s()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f12235q != null) {
            if (this.f12235q.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f12236s = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m14220k()) {
            this.f12230d.m54993u(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m14220k()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            this.f12230d.m54994v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m14220k()) {
            this.f12230d.m54995w(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!m14216f() || this.f12228M == z) {
            return;
        }
        this.f12228M = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).m14264y(this, this.f12228M);
        }
        if (this.f12229Q) {
            return;
        }
        this.f12229Q = true;
        Iterator it = this.f12231e.iterator();
        while (it.hasNext()) {
            ((InterfaceC10976b) it.next()).mo14234a(this, this.f12228M);
        }
        this.f12229Q = false;
    }

    public void setCornerRadius(int i) {
        if (m14220k()) {
            this.f12230d.m54996x(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m14220k()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(z0g z0gVar) {
        this.f12230d.m54997y(z0gVar);
    }

    public void setDisplayedWidthDecrease(int i) {
        this.q0 = Math.min(i, this.m0);
        m14225p();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m14220k()) {
            this.f12230d.m54979g().f0(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f12235q != drawable) {
            this.f12235q = drawable;
            m14223n(true);
            m14224o(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.h0 != i) {
            this.h0 = i;
            m14224o(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f12227L != i) {
            this.f12227L = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? lk0.m37353b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f12237x != i) {
            this.f12237x = i;
            m14223n(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f12234h != colorStateList) {
            this.f12234h = colorStateList;
            m14223n(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f12233g != mode) {
            this.f12233g = mode;
            m14223n(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(lk0.m37352a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f12230d.m54998z(i);
    }

    public void setInsetTop(int i) {
        this.f12230d.m54958A(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC10977c interfaceC10977c) {
        this.f12232f = interfaceC10977c;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC10977c interfaceC10977c = this.f12232f;
        if (interfaceC10977c != null) {
            interfaceC10977c.mo14235a(this, z);
        }
        super.setPressed(z);
        m14221l(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m14220k()) {
            this.f12230d.m54959B(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m14220k()) {
            setRippleColor(lk0.m37352a(getContext(), i));
        }
    }

    @Override // p001o.rlf
    public void setShapeAppearanceModel(ykf ykfVar) {
        if (!m14220k()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f12230d.m54960C(ykfVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m14220k()) {
            this.f12230d.m54961D(z);
        }
    }

    public void setSizeChange(x4g x4gVar) {
        if (this.n0 != x4gVar) {
            this.n0 = x4gVar;
            m14221l(true);
        }
    }

    public void setStateListShapeAppearanceModel(w4g w4gVar) {
        if (!m14220k()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f12230d.m54975c() == null && w4gVar.m53945f()) {
            this.f12230d.m54997y(m14214d());
        }
        this.f12230d.m54962E(w4gVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m14220k()) {
            this.f12230d.m54963F(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m14220k()) {
            setStrokeColor(lk0.m37352a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m14220k()) {
            this.f12230d.m54964G(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m14220k()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m14220k()) {
            this.f12230d.m54965H(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m14220k()) {
            this.f12230d.m54966I(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m14224o(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f12230d.m54967J(z);
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.j0 = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            m14221l(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f12228M);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        ykf ykfVarM57970m;
        int i2 = u0;
        super(gza.m29681e(context, attributeSet, i, i2, new int[]{v0}), attributeSet, i);
        this.f12231e = new LinkedHashSet();
        this.f12228M = false;
        this.f12229Q = false;
        this.i0 = -1;
        this.j0 = -1.0f;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        Context context2 = getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.MaterialButton, i, i2, new int[0]);
        this.f12227L = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialButton_iconPadding, 0);
        this.f12233g = xzi.m57081q(typedArrayM19305i.getInt(ebe.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f12234h = yya.m58494a(getContext(), typedArrayM19305i, ebe.MaterialButton_iconTint);
        this.f12235q = yya.m58498e(getContext(), typedArrayM19305i, ebe.MaterialButton_icon);
        this.h0 = typedArrayM19305i.getInteger(ebe.MaterialButton_iconGravity, 1);
        this.f12237x = typedArrayM19305i.getDimensionPixelSize(ebe.MaterialButton_iconSize, 0);
        w4g w4gVarM53939b = w4g.m53939b(context2, typedArrayM19305i, ebe.MaterialButton_shapeAppearance);
        if (w4gVarM53939b != null) {
            ykfVarM57970m = w4gVarM53939b.m53942c(true);
        } else {
            ykfVarM57970m = ykf.m57925e(context2, attributeSet, i, i2).m57970m();
        }
        wta wtaVar = new wta(this, ykfVarM57970m);
        this.f12230d = wtaVar;
        wtaVar.m54992t(typedArrayM19305i);
        if (w4gVarM53939b != null) {
            wtaVar.m54997y(m14214d());
            wtaVar.m54962E(w4gVarM53939b);
        }
        typedArrayM19305i.recycle();
        setCompoundDrawablePadding(this.f12227L);
        m14223n(this.f12235q != null);
    }
}
