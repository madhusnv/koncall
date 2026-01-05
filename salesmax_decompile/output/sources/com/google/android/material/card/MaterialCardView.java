package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import p001o.aza;
import p001o.bkh;
import p001o.ebe;
import p001o.gza;
import p001o.lk0;
import p001o.pae;
import p001o.rlf;
import p001o.x5e;
import p001o.ykf;
import p001o.yta;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, rlf {

    /* renamed from: L */
    public static final int[] f12259L = {R.attr.state_checkable};

    /* renamed from: M */
    public static final int[] f12260M = {R.attr.state_checked};

    /* renamed from: Q */
    public static final int[] f12261Q = {x5e.state_dragged};
    public static final int h0 = pae.Widget_MaterialComponents_CardView;

    /* renamed from: H */
    public boolean f12262H;

    /* renamed from: s */
    public final yta f12263s;

    /* renamed from: x */
    public boolean f12264x;

    /* renamed from: y */
    public boolean f12265y;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface InterfaceC10982a {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f12263s.m58239j().getBounds());
        return rectF;
    }

    /* renamed from: g */
    public final void m14270g() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f12263s.m58238i();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f12263s.m58240k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f12263s.m58241l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f12263s.m58242m();
    }

    public int getCheckedIconGravity() {
        return this.f12263s.m58243n();
    }

    public int getCheckedIconMargin() {
        return this.f12263s.m58244o();
    }

    public int getCheckedIconSize() {
        return this.f12263s.m58245p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f12263s.m58246q();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f12263s.m58206A().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f12263s.m58206A().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f12263s.m58206A().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f12263s.m58206A().top;
    }

    public float getProgress() {
        return this.f12263s.m58250u();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f12263s.m58248s();
    }

    public ColorStateList getRippleColor() {
        return this.f12263s.m58251v();
    }

    public ykf getShapeAppearanceModel() {
        return this.f12263s.m58252w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f12263s.m58253x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f12263s.m58254y();
    }

    public int getStrokeWidth() {
        return this.f12263s.m58255z();
    }

    /* renamed from: h */
    public boolean m14271h() {
        yta ytaVar = this.f12263s;
        return ytaVar != null && ytaVar.m58209D();
    }

    /* renamed from: i */
    public boolean m14272i() {
        return this.f12262H;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f12265y;
    }

    /* renamed from: j */
    public void m14273j(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12263s.e0();
        aza.m18045f(this, this.f12263s.m58239j());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m14271h()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12259L);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12260M);
        }
        if (m14272i()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12261Q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m14271h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12263s.m58213I(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f12264x) {
            if (!this.f12263s.m58208C()) {
                this.f12263s.m58214J(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.f12263s.m58215K(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f12263s.g0();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f12263s.m58216L(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f12263s.m58217M(z);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f12265y != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f12263s.m58220P(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f12263s.m58243n() != i) {
            this.f12263s.m58221Q(i);
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f12263s.m58222R(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f12263s.m58222R(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f12263s.m58220P(lk0.m37353b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f12263s.m58223S(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f12263s.m58223S(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f12263s.m58224T(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        yta ytaVar = this.f12263s;
        if (ytaVar != null) {
            ytaVar.e0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f12263s.a0(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f12262H != z) {
            this.f12262H = z;
            refreshDrawableState();
            m14270g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f12263s.i0();
    }

    public void setOnCheckedChangeListener(InterfaceC10982a interfaceC10982a) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f12263s.i0();
        this.f12263s.f0();
    }

    public void setProgress(float f) {
        this.f12263s.m58226V(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.f12263s.m58225U(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f12263s.m58227W(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f12263s.m58227W(lk0.m37352a(getContext(), i));
    }

    @Override // p001o.rlf
    public void setShapeAppearanceModel(ykf ykfVar) {
        setClipToOutline(ykfVar.m57942v(getBoundsAsRectF()));
        this.f12263s.m58228X(ykfVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f12263s.m58230Z(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f12263s.i0();
        this.f12263s.f0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m14271h() && isEnabled()) {
            this.f12265y = !this.f12265y;
            refreshDrawableState();
            m14270g();
            this.f12263s.m58219O(this.f12265y, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f12263s.m58215K(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f12263s.m58229Y(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        int i2 = h0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f12265y = false;
        this.f12262H = false;
        this.f12264x = true;
        TypedArray typedArrayM19305i = bkh.m19305i(getContext(), attributeSet, ebe.MaterialCardView, i, i2, new int[0]);
        yta ytaVar = new yta(this, attributeSet, i, i2);
        this.f12263s = ytaVar;
        ytaVar.m58215K(super.getCardBackgroundColor());
        ytaVar.a0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        ytaVar.m58212H(typedArrayM19305i);
        typedArrayM19305i.recycle();
    }
}
