package com.google.android.material.button;

import ah.AbstractC0143a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import c6.v0;
import gh.C2613b;
import gh.C2614c;
import gh.C2616e;
import gh.InterfaceC2612a;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lh.AbstractC4475k;
import mb.o3;
import nh.AbstractC5071a;
import og.wb;
import og.y0;
import p013o.AbstractC5229o;
import pg.s8;
import ph.C5946a;
import ph.C5955j;
import ph.InterfaceC5965t;
import sh.AbstractC6844a;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MaterialButton extends AbstractC5229o implements Checkable, InterfaceC5965t {

    /* renamed from: s */
    public static final int[] f6782s = {R.attr.state_checkable};

    /* renamed from: t */
    public static final int[] f6783t = {R.attr.state_checked};

    /* renamed from: d */
    public final C2614c f6784d;

    /* renamed from: e */
    public final LinkedHashSet f6785e;

    /* renamed from: f */
    public InterfaceC2612a f6786f;

    /* renamed from: g */
    public PorterDuff.Mode f6787g;

    /* renamed from: h */
    public ColorStateList f6788h;

    /* renamed from: j */
    public Drawable f6789j;

    /* renamed from: k */
    public int f6790k;

    /* renamed from: l */
    public int f6791l;

    /* renamed from: m */
    public int f6792m;

    /* renamed from: n */
    public int f6793n;

    /* renamed from: p */
    public boolean f6794p;

    /* renamed from: q */
    public boolean f6795q;

    /* renamed from: r */
    public int f6796r;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC6844a.m13042a(context, attributeSet, com.websoptimization.callyzerbiz.R.attr.materialButtonStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Button), attributeSet);
        this.f6785e = new LinkedHashSet();
        this.f6794p = false;
        this.f6795q = false;
        Context context2 = getContext();
        TypedArray typedArrayM9328e = AbstractC4475k.m9328e(context2, attributeSet, AbstractC0143a.f461j, com.websoptimization.callyzerbiz.R.attr.materialButtonStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f6793n = typedArrayM9328e.getDimensionPixelSize(12, 0);
        int i10 = typedArrayM9328e.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f6787g = AbstractC4475k.m9329f(i10, mode);
        this.f6788h = y0.m11057g(getContext(), typedArrayM9328e, 14);
        this.f6789j = y0.m11059i(getContext(), typedArrayM9328e, 10);
        this.f6796r = typedArrayM9328e.getInteger(11, 1);
        this.f6790k = typedArrayM9328e.getDimensionPixelSize(13, 0);
        C2614c c2614c = new C2614c(this, C5955j.m11993b(context2, attributeSet, com.websoptimization.callyzerbiz.R.attr.materialButtonStyle, com.websoptimization.callyzerbiz.R.style.Widget_MaterialComponents_Button).m9582a());
        this.f6784d = c2614c;
        c2614c.f14157c = typedArrayM9328e.getDimensionPixelOffset(1, 0);
        c2614c.f14158d = typedArrayM9328e.getDimensionPixelOffset(2, 0);
        c2614c.f14159e = typedArrayM9328e.getDimensionPixelOffset(3, 0);
        c2614c.f14160f = typedArrayM9328e.getDimensionPixelOffset(4, 0);
        if (typedArrayM9328e.hasValue(8)) {
            int dimensionPixelSize = typedArrayM9328e.getDimensionPixelSize(8, -1);
            c2614c.f14161g = dimensionPixelSize;
            float f6 = dimensionPixelSize;
            o3 o3VarM11996e = c2614c.f14156b.m11996e();
            o3VarM11996e.f23376e = new C5946a(f6);
            o3VarM11996e.f23377f = new C5946a(f6);
            o3VarM11996e.f23378g = new C5946a(f6);
            o3VarM11996e.f23379h = new C5946a(f6);
            c2614c.m6590c(o3VarM11996e.m9582a());
            c2614c.f14170p = true;
        }
        c2614c.f14162h = typedArrayM9328e.getDimensionPixelSize(20, 0);
        c2614c.f14163i = AbstractC4475k.m9329f(typedArrayM9328e.getInt(7, -1), mode);
        c2614c.f14164j = y0.m11057g(getContext(), typedArrayM9328e, 6);
        c2614c.f14165k = y0.m11057g(getContext(), typedArrayM9328e, 19);
        c2614c.f14166l = y0.m11057g(getContext(), typedArrayM9328e, 16);
        c2614c.f14171q = typedArrayM9328e.getBoolean(5, false);
        c2614c.f14173s = typedArrayM9328e.getDimensionPixelSize(9, 0);
        Field field = v0.f5527a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM9328e.hasValue(0)) {
            c2614c.f14169o = true;
            setSupportBackgroundTintList(c2614c.f14164j);
            setSupportBackgroundTintMode(c2614c.f14163i);
        } else {
            c2614c.m6592e();
        }
        setPaddingRelative(paddingStart + c2614c.f14157c, paddingTop + c2614c.f14159e, paddingEnd + c2614c.f14158d, paddingBottom + c2614c.f14160f);
        typedArrayM9328e.recycle();
        setCompoundDrawablePadding(this.f6793n);
        m4070c(this.f6789j != null);
    }

    private String getA11yClassName() {
        C2614c c2614c = this.f6784d;
        return ((c2614c == null || !c2614c.f14171q) ? Button.class : CompoundButton.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    /* renamed from: a */
    public final boolean m4068a() {
        C2614c c2614c = this.f6784d;
        return (c2614c == null || c2614c.f14169o) ? false : true;
    }

    /* renamed from: b */
    public final void m4069b() {
        int i10 = this.f6796r;
        if (i10 == 1 || i10 == 2) {
            setCompoundDrawablesRelative(this.f6789j, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.f6789j, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.f6789j, null, null);
        }
    }

    /* renamed from: c */
    public final void m4070c(boolean z6) {
        Drawable drawable = this.f6789j;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f6789j = drawableMutate;
            drawableMutate.setTintList(this.f6788h);
            PorterDuff.Mode mode = this.f6787g;
            if (mode != null) {
                this.f6789j.setTintMode(mode);
            }
            int intrinsicWidth = this.f6790k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f6789j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f6790k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f6789j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6789j;
            int i10 = this.f6791l;
            int i11 = this.f6792m;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
        }
        if (z6) {
            m4069b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.f6796r;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.f6789j) || (((i12 == 3 || i12 == 4) && drawable5 != this.f6789j) || ((i12 == 16 || i12 == 32) && drawable4 != this.f6789j))) {
            m4069b();
        }
    }

    /* renamed from: d */
    public final void m4071d(int i10, int i11) {
        if (this.f6789j == null || getLayout() == null) {
            return;
        }
        int i12 = this.f6796r;
        if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.f6791l = 0;
                if (i12 == 16) {
                    this.f6792m = 0;
                    m4070c(false);
                    return;
                }
                int intrinsicHeight = this.f6790k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f6789j.getIntrinsicHeight();
                }
                int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f6793n) - getPaddingBottom()) / 2;
                if (this.f6792m != textHeight) {
                    this.f6792m = textHeight;
                    m4070c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f6792m = 0;
        if (i12 == 1 || i12 == 3) {
            this.f6791l = 0;
            m4070c(false);
            return;
        }
        int intrinsicWidth = this.f6790k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f6789j.getIntrinsicWidth();
        }
        int textWidth = i10 - getTextWidth();
        Field field = v0.f5527a;
        int paddingEnd = ((((textWidth - getPaddingEnd()) - intrinsicWidth) - this.f6793n) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.f6796r == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f6791l != paddingEnd) {
            this.f6791l = paddingEnd;
            m4070c(false);
        }
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
        if (m4068a()) {
            return this.f6784d.f14161g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6789j;
    }

    public int getIconGravity() {
        return this.f6796r;
    }

    public int getIconPadding() {
        return this.f6793n;
    }

    public int getIconSize() {
        return this.f6790k;
    }

    public ColorStateList getIconTint() {
        return this.f6788h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6787g;
    }

    public int getInsetBottom() {
        return this.f6784d.f14160f;
    }

    public int getInsetTop() {
        return this.f6784d.f14159e;
    }

    public ColorStateList getRippleColor() {
        if (m4068a()) {
            return this.f6784d.f14166l;
        }
        return null;
    }

    public C5955j getShapeAppearanceModel() {
        if (m4068a()) {
            return this.f6784d.f14156b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m4068a()) {
            return this.f6784d.f14165k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m4068a()) {
            return this.f6784d.f14162h;
        }
        return 0;
    }

    @Override // p013o.AbstractC5229o
    public ColorStateList getSupportBackgroundTintList() {
        return m4068a() ? this.f6784d.f14164j : super.getSupportBackgroundTintList();
    }

    @Override // p013o.AbstractC5229o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m4068a() ? this.f6784d.f14163i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6794p;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m4068a()) {
            wb.m11030c(this, this.f6784d.m6589b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        C2614c c2614c = this.f6784d;
        if (c2614c != null && c2614c.f14171q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6782s);
        }
        if (this.f6794p) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f6783t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p013o.AbstractC5229o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f6794p);
    }

    @Override // p013o.AbstractC5229o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C2614c c2614c = this.f6784d;
        accessibilityNodeInfo.setCheckable(c2614c != null && c2614c.f14171q);
        accessibilityNodeInfo.setChecked(this.f6794p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2613b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2613b c2613b = (C2613b) parcelable;
        super.onRestoreInstanceState(c2613b.f21992a);
        setChecked(c2613b.f14154c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2613b c2613b = new C2613b(super.onSaveInstanceState());
        c2613b.f14154c = this.f6794p;
        return c2613b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m4071d(i10, i11);
    }

    @Override // p013o.AbstractC5229o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m4071d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!m4068a()) {
            super.setBackgroundColor(i10);
            return;
        }
        C2614c c2614c = this.f6784d;
        if (c2614c.m6589b(false) != null) {
            c2614c.m6589b(false).setTint(i10);
        }
    }

    @Override // p013o.AbstractC5229o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m4068a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        C2614c c2614c = this.f6784d;
        c2614c.f14169o = true;
        MaterialButton materialButton = c2614c.f14155a;
        materialButton.setSupportBackgroundTintList(c2614c.f14164j);
        materialButton.setSupportBackgroundTintMode(c2614c.f14163i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p013o.AbstractC5229o, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? s8.m11864b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (m4068a()) {
            this.f6784d.f14171q = z6;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        C2614c c2614c = this.f6784d;
        if (c2614c == null || !c2614c.f14171q || !isEnabled() || this.f6794p == z6) {
            return;
        }
        this.f6794p = z6;
        refreshDrawableState();
        if (this.f6795q) {
            return;
        }
        this.f6795q = true;
        Iterator it = this.f6785e.iterator();
        while (it.hasNext()) {
            C2616e c2616e = (C2616e) it.next();
            boolean z10 = this.f6794p;
            MaterialButtonToggleGroup materialButtonToggleGroup = c2616e.f14176a;
            if (!materialButtonToggleGroup.f6804g) {
                if (materialButtonToggleGroup.f6805h) {
                    materialButtonToggleGroup.f6807k = z10 ? getId() : -1;
                }
                if (materialButtonToggleGroup.m4075d(getId(), z10)) {
                    getId();
                    materialButtonToggleGroup.m4073b();
                }
                materialButtonToggleGroup.invalidate();
            }
        }
        this.f6795q = false;
    }

    public void setCornerRadius(int i10) {
        if (m4068a()) {
            C2614c c2614c = this.f6784d;
            if (c2614c.f14170p && c2614c.f14161g == i10) {
                return;
            }
            c2614c.f14161g = i10;
            c2614c.f14170p = true;
            float f6 = i10;
            o3 o3VarM11996e = c2614c.f14156b.m11996e();
            o3VarM11996e.f23376e = new C5946a(f6);
            o3VarM11996e.f23377f = new C5946a(f6);
            o3VarM11996e.f23378g = new C5946a(f6);
            o3VarM11996e.f23379h = new C5946a(f6);
            c2614c.m6590c(o3VarM11996e.m9582a());
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m4068a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        if (m4068a()) {
            this.f6784d.m6589b(false).m11987h(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6789j != drawable) {
            this.f6789j = drawable;
            m4070c(true);
            m4071d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f6796r != i10) {
            this.f6796r = i10;
            m4071d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f6793n != i10) {
            this.f6793n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? s8.m11864b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f6790k != i10) {
            this.f6790k = i10;
            m4070c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6788h != colorStateList) {
            this.f6788h = colorStateList;
            m4070c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6787g != mode) {
            this.f6787g = mode;
            m4070c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(s8.m11863a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        C2614c c2614c = this.f6784d;
        c2614c.m6591d(c2614c.f14159e, i10);
    }

    public void setInsetTop(int i10) {
        C2614c c2614c = this.f6784d;
        c2614c.m6591d(i10, c2614c.f14160f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC2612a interfaceC2612a) {
        this.f6786f = interfaceC2612a;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        InterfaceC2612a interfaceC2612a = this.f6786f;
        if (interfaceC2612a != null) {
            ((MaterialButtonToggleGroup) ((C8986c) interfaceC2612a).f43336b).invalidate();
        }
        super.setPressed(z6);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m4068a()) {
            C2614c c2614c = this.f6784d;
            MaterialButton materialButton = c2614c.f14155a;
            if (c2614c.f14166l != colorStateList) {
                c2614c.f14166l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC5071a.m10006a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (m4068a()) {
            setRippleColor(s8.m11863a(getContext(), i10));
        }
    }

    @Override // ph.InterfaceC5965t
    public void setShapeAppearanceModel(C5955j c5955j) {
        if (!m4068a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f6784d.m6590c(c5955j);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (m4068a()) {
            C2614c c2614c = this.f6784d;
            c2614c.f14168n = z6;
            c2614c.m6593f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m4068a()) {
            C2614c c2614c = this.f6784d;
            if (c2614c.f14165k != colorStateList) {
                c2614c.f14165k = colorStateList;
                c2614c.m6593f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m4068a()) {
            setStrokeColor(s8.m11863a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m4068a()) {
            C2614c c2614c = this.f6784d;
            if (c2614c.f14162h != i10) {
                c2614c.f14162h = i10;
                c2614c.m6593f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m4068a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // p013o.AbstractC5229o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m4068a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C2614c c2614c = this.f6784d;
        if (c2614c.f14164j != colorStateList) {
            c2614c.f14164j = colorStateList;
            if (c2614c.m6589b(false) != null) {
                c2614c.m6589b(false).setTintList(c2614c.f14164j);
            }
        }
    }

    @Override // p013o.AbstractC5229o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m4068a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C2614c c2614c = this.f6784d;
        if (c2614c.f14163i != mode) {
            c2614c.f14163i = mode;
            if (c2614c.m6589b(false) == null || c2614c.f14163i == null) {
                return;
            }
            c2614c.m6589b(false).setTintMode(c2614c.f14163i);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6794p);
    }
}
