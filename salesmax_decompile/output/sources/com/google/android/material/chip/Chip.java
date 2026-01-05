package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.C11001a;
import java.util.List;
import p001o.ap6;
import p001o.aua;
import p001o.aza;
import p001o.bkh;
import p001o.cc;
import p001o.ebe;
import p001o.gue;
import p001o.gza;
import p001o.mgh;
import p001o.ogh;
import p001o.pae;
import p001o.rlf;
import p001o.smb;
import p001o.v9e;
import p001o.wvi;
import p001o.x5e;
import p001o.xzi;
import p001o.ykf;

/* loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements C11001a.a, rlf, aua {
    public static final int o0 = pae.Widget_MaterialComponents_Chip_Action;
    public static final Rect p0 = new Rect();
    public static final int[] q0 = {R.attr.state_selected};
    public static final int[] r0 = {R.attr.state_checkable};

    /* renamed from: H */
    public boolean f12331H;

    /* renamed from: L */
    public boolean f12332L;

    /* renamed from: M */
    public boolean f12333M;

    /* renamed from: Q */
    public int f12334Q;

    /* renamed from: e */
    public C11001a f12335e;

    /* renamed from: f */
    public InsetDrawable f12336f;

    /* renamed from: g */
    public RippleDrawable f12337g;

    /* renamed from: h */
    public View.OnClickListener f12338h;
    public int h0;
    public CharSequence i0;
    public final C10995c j0;
    public boolean k0;
    public final Rect l0;
    public final RectF m0;
    public final ogh n0;

    /* renamed from: q */
    public CompoundButton.OnCheckedChangeListener f12339q;

    /* renamed from: s */
    public aua.InterfaceC12251a f12340s;

    /* renamed from: x */
    public boolean f12341x;

    /* renamed from: y */
    public boolean f12342y;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C10993a extends ogh {
        public C10993a() {
        }

        @Override // p001o.ogh
        /* renamed from: a */
        public void mo14396a(int i) {
        }

        @Override // p001o.ogh
        /* renamed from: b */
        public void mo14397b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f12335e.c3() ? Chip.this.f12335e.w1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C10994b extends ViewOutlineProvider {
        public C10994b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f12335e != null) {
                Chip.this.f12335e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    public class C10995c extends ap6 {
        public C10995c(Chip chip) {
            super(chip);
        }

        @Override // p001o.ap6
        /* renamed from: B */
        public int mo14398B(float f, float f2) {
            return (Chip.this.m14384n() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
        }

        @Override // p001o.ap6
        /* renamed from: C */
        public void mo14399C(List list) {
            list.add(0);
            if (Chip.this.m14384n() && Chip.this.m14389s() && Chip.this.f12338h != null) {
                list.add(1);
            }
        }

        @Override // p001o.ap6
        /* renamed from: L */
        public boolean mo14400L(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.m14390u();
            }
            return false;
        }

        @Override // p001o.ap6
        /* renamed from: O */
        public void mo14401O(cc ccVar) {
            ccVar.m0(Chip.this.m14388r());
            ccVar.p0(Chip.this.isClickable());
            ccVar.o0(Chip.this.getAccessibilityClassName());
            ccVar.V0(Chip.this.getText());
        }

        @Override // p001o.ap6
        /* renamed from: P */
        public void mo14402P(int i, cc ccVar) {
            if (i != 1) {
                ccVar.s0("");
                ccVar.j0(Chip.p0);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                ccVar.s0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                int i2 = v9e.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                ccVar.s0(context.getString(i2, objArr).trim());
            }
            ccVar.j0(Chip.this.getCloseIconTouchBoundsInt());
            ccVar.m20778b(cc.C12624a.f17797i);
            ccVar.w0(Chip.this.isEnabled());
            ccVar.o0(Button.class.getName());
        }

        @Override // p001o.ap6
        /* renamed from: Q */
        public void mo14403Q(int i, boolean z) {
            if (i == 1) {
                Chip.this.f12332L = z;
            }
            if (Chip.this.f12335e.M1(Chip.this.f12332L)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.m0.setEmpty();
        if (m14384n() && this.f12338h != null) {
            this.f12335e.n1(this.m0);
        }
        return this.m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.l0.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.l0;
    }

    private mgh getTextAppearance() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.x1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f12331H != z) {
            this.f12331H = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f12342y != z) {
            this.f12342y = z;
            refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m14375t(CompoundButton compoundButton, boolean z) {
        aua.InterfaceC12251a interfaceC12251a = this.f12340s;
        if (interfaceC12251a != null) {
            interfaceC12251a.mo17841a(this, z);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f12339q;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    /* renamed from: A */
    public final void m14376A() {
        this.f12337g = new RippleDrawable(gue.m29519d(this.f12335e.u1()), getBackgroundDrawable(), null);
        this.f12335e.b3(false);
        setBackground(this.f12337g);
        m14377B();
    }

    /* renamed from: B */
    public final void m14377B() {
        C11001a c11001a;
        if (TextUtils.isEmpty(getText()) || (c11001a = this.f12335e) == null) {
            return;
        }
        int iY0 = (int) (c11001a.Y0() + this.f12335e.y1() + this.f12335e.F0());
        int iD1 = (int) (this.f12335e.d1() + this.f12335e.z1() + this.f12335e.B0());
        if (this.f12336f != null) {
            Rect rect = new Rect();
            this.f12336f.getPadding(rect);
            iD1 += rect.left;
            iY0 += rect.right;
        }
        setPaddingRelative(iD1, getPaddingTop(), iY0, getPaddingBottom());
    }

    /* renamed from: C */
    public final void m14378C() {
        TextPaint paint = getPaint();
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            paint.drawableState = c11001a.getState();
        }
        mgh textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m39033p(getContext(), paint, this.n0);
        }
    }

    /* renamed from: D */
    public final void m14379D(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
    }

    @Override // com.google.android.material.chip.C11001a.a
    /* renamed from: a */
    public void mo14380a() {
        m14383m(this.h0);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.k0 ? super.dispatchHoverEvent(motionEvent) : this.j0.m17620v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.k0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.j0.m17621w(keyEvent) || this.j0.m17596A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C11001a c11001a = this.f12335e;
        if ((c11001a == null || !c11001a.E1()) ? false : this.f12335e.B2(m14382l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.i0)) {
            return this.i0;
        }
        if (!m14388r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).m14411k()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f12336f;
        return insetDrawable == null ? this.f12335e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.U0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.V0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.W0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return Math.max(0.0f, c11001a.X0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f12335e;
    }

    public float getChipEndPadding() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.Y0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.Z0();
        }
        return null;
    }

    public float getChipIconSize() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.a1();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.b1();
        }
        return null;
    }

    public float getChipMinHeight() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.c1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.d1();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.e1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.f1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.g1();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.h1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.i1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.j1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.k1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.m1();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.q1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.k0 && (this.j0.m17596A() == 1 || this.j0.m17622x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public smb getHideMotionSpec() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.r1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.s1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.t1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.u1();
        }
        return null;
    }

    public ykf getShapeAppearanceModel() {
        return this.f12335e.m60103I();
    }

    public smb getShowMotionSpec() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.v1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.y1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            return c11001a.z1();
        }
        return 0.0f;
    }

    /* renamed from: k */
    public final void m14381k(C11001a c11001a) {
        c11001a.F2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: l */
    public final int[] m14382l() {
        ?? IsEnabled = isEnabled();
        int i = IsEnabled;
        if (this.f12332L) {
            i = IsEnabled + 1;
        }
        int i2 = i;
        if (this.f12331H) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.f12342y) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.f12332L) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.f12331H) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.f12342y) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    /* renamed from: m */
    public boolean m14383m(int i) {
        this.h0 = i;
        if (!m14392w()) {
            if (this.f12336f != null) {
                m14391v();
            } else {
                m14395z();
            }
            return false;
        }
        int iMax = Math.max(0, i - this.f12335e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i - this.f12335e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f12336f != null) {
                m14391v();
            } else {
                m14395z();
            }
            return false;
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.f12336f != null) {
            Rect rect = new Rect();
            this.f12336f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m14395z();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        m14387q(i2, i3, i2, i3);
        m14395z();
        return true;
    }

    /* renamed from: n */
    public final boolean m14384n() {
        C11001a c11001a = this.f12335e;
        return (c11001a == null || c11001a.g1() == null) ? false : true;
    }

    /* renamed from: o */
    public final void m14385o(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayM19305i = bkh.m19305i(context, attributeSet, ebe.Chip, i, o0, new int[0]);
        this.f12333M = typedArrayM19305i.getBoolean(ebe.Chip_ensureMinTouchTargetSize, false);
        this.h0 = (int) Math.ceil(typedArrayM19305i.getDimension(ebe.Chip_chipMinTouchTargetSize, (float) Math.ceil(xzi.m57071g(getContext(), 48))));
        typedArrayM19305i.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aza.m18045f(this, this.f12335e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q0);
        }
        if (m14388r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.k0) {
            this.j0.m17602K(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m14388r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            cc.d1(accessibilityNodeInfo).r0(cc.C12629f.m20832a(chipGroup.m14753b(this), 1, chipGroup.mo14406c() ? chipGroup.m14409i(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f12334Q != i) {
            this.f12334Q = i;
            m14377B();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f12342y) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else {
                if (this.f12342y) {
                    m14390u();
                    z = true;
                }
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m14386p() {
        setOutlineProvider(new C10994b());
    }

    /* renamed from: q */
    public final void m14387q(int i, int i2, int i3, int i4) {
        this.f12336f = new InsetDrawable((Drawable) this.f12335e, i, i2, i3, i4);
    }

    /* renamed from: r */
    public boolean m14388r() {
        C11001a c11001a = this.f12335e;
        return c11001a != null && c11001a.D1();
    }

    /* renamed from: s */
    public boolean m14389s() {
        C11001a c11001a = this.f12335e;
        return c11001a != null && c11001a.F1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.i0 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12337g) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f12337g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.N1(z);
        }
    }

    public void setCheckableResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.O1(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C11001a c11001a = this.f12335e;
        if (c11001a == null) {
            this.f12341x = z;
        } else if (c11001a.D1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.P1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.Q1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.R1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.S1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.T1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.V1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.W1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.X1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.Y1(i);
        }
    }

    public void setChipDrawable(C11001a c11001a) {
        C11001a c11001a2 = this.f12335e;
        if (c11001a2 != c11001a) {
            m14393x(c11001a2);
            this.f12335e = c11001a;
            c11001a.Q2(false);
            m14381k(this.f12335e);
            m14383m(this.h0);
        }
    }

    public void setChipEndPadding(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.Z1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.a2(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.b2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.c2(i);
        }
    }

    public void setChipIconSize(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.d2(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.e2(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.f2(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.g2(i);
        }
    }

    public void setChipIconVisible(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.h2(i);
        }
    }

    public void setChipMinHeight(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.j2(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.k2(i);
        }
    }

    public void setChipStartPadding(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.l2(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.m2(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.n2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.o2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.p2(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.q2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.s2(drawable);
        }
        m14394y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.t2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.u2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.v2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.w2(i);
        }
        m14394y();
    }

    public void setCloseIconSize(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.x2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.y2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.z2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.A2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.C2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.D2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.f0(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f12335e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.G2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f12333M = z;
        m14383m(this.h0);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(smb smbVar) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.H2(smbVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.I2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.J2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.K2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.L2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.M2(i);
        }
    }

    @Override // p001o.aua
    public void setInternalOnCheckedChangeListener(aua.InterfaceC12251a interfaceC12251a) {
        this.f12340s = interfaceC12251a;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f12335e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.N2(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12339q = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f12338h = onClickListener;
        m14394y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.O2(colorStateList);
        }
        if (this.f12335e.B1()) {
            return;
        }
        m14376A();
    }

    public void setRippleColorResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.P2(i);
            if (this.f12335e.B1()) {
                return;
            }
            m14376A();
        }
    }

    @Override // p001o.rlf
    public void setShapeAppearanceModel(ykf ykfVar) {
        this.f12335e.setShapeAppearanceModel(ykfVar);
    }

    public void setShowMotionSpec(smb smbVar) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.R2(smbVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.S2(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C11001a c11001a = this.f12335e;
        if (c11001a == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c11001a.c3() ? null : charSequence, bufferType);
        C11001a c11001a2 = this.f12335e;
        if (c11001a2 != null) {
            c11001a2.T2(charSequence);
        }
    }

    public void setTextAppearance(mgh mghVar) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.U2(mghVar);
        }
        m14378C();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.W2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.X2(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.Y2(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        m14378C();
    }

    public void setTextStartPadding(float f) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.Z2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.a3(i);
        }
    }

    /* renamed from: u */
    public boolean m14390u() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f12338h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.k0) {
            this.j0.m17610W(1, 1);
        }
        return z;
    }

    /* renamed from: v */
    public final void m14391v() {
        if (this.f12336f != null) {
            this.f12336f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m14395z();
        }
    }

    /* renamed from: w */
    public boolean m14392w() {
        return this.f12333M;
    }

    /* renamed from: x */
    public final void m14393x(C11001a c11001a) {
        if (c11001a != null) {
            c11001a.F2(null);
        }
    }

    /* renamed from: y */
    public final void m14394y() {
        if (m14384n() && m14389s() && this.f12338h != null) {
            wvi.m0(this, this.j0);
            this.k0 = true;
        } else {
            wvi.m0(this, null);
            this.k0 = false;
        }
    }

    /* renamed from: z */
    public final void m14395z() {
        m14376A();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.E2(z);
        }
        m14394y();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        int i2 = o0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.l0 = new Rect();
        this.m0 = new RectF();
        this.n0 = new C10993a();
        Context context2 = getContext();
        m14379D(attributeSet);
        C11001a c11001aK0 = C11001a.K0(context2, attributeSet, i, i2);
        m14385o(context2, attributeSet, i);
        setChipDrawable(c11001aK0);
        c11001aK0.f0(getElevation());
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.Chip, i, i2, new int[0]);
        boolean zHasValue = typedArrayM19305i.hasValue(ebe.Chip_shapeAppearance);
        typedArrayM19305i.recycle();
        this.j0 = new C10995c(this);
        m14394y();
        if (!zHasValue) {
            m14386p();
        }
        setChecked(this.f12341x);
        setText(c11001aK0.w1());
        setEllipsize(c11001aK0.q1());
        m14378C();
        if (!this.f12335e.c3()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m14377B();
        if (m14392w()) {
            setMinHeight(this.h0);
        }
        this.f12334Q = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.j93
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f29977a.m14375t(compoundButton, z);
            }
        });
    }

    public void setCheckedIconVisible(boolean z) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.U1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.i2(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.V2(i);
        }
        m14378C();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C11001a c11001a = this.f12335e;
        if (c11001a != null) {
            c11001a.V2(i);
        }
        m14378C();
    }
}
