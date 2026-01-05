package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import p001o.anh;
import p001o.bkh;
import p001o.ebe;
import p001o.gza;
import p001o.lk0;
import p001o.ni3;
import p001o.pae;
import p001o.x5e;
import p001o.xy5;
import p001o.xzi;

/* loaded from: classes3.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int Y0 = pae.Widget_Material3_CompoundButton_MaterialSwitch;
    public static final int[] Z0 = {x5e.state_with_icon};
    public Drawable L0;
    public Drawable M0;
    public int N0;
    public Drawable O0;
    public Drawable P0;
    public ColorStateList Q0;
    public ColorStateList R0;
    public PorterDuff.Mode S0;
    public ColorStateList T0;
    public ColorStateList U0;
    public PorterDuff.Mode V0;
    public int[] W0;
    public int[] X0;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    /* renamed from: r */
    public static void m14772r(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(ni3.m40612d(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.L0;
    }

    public Drawable getThumbIconDrawable() {
        return this.M0;
    }

    public int getThumbIconSize() {
        return this.N0;
    }

    public ColorStateList getThumbIconTintList() {
        return this.R0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.S0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.Q0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.P0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.U0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.V0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.O0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.T0;
    }

    @Override // android.view.View
    public void invalidate() {
        m14775s();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.M0 != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, Z0);
        }
        this.W0 = xy5.m56951j(iArrOnCreateDrawableState);
        this.X0 = xy5.m56947f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    /* renamed from: p */
    public final void m14773p() {
        this.L0 = xy5.m56944c(this.L0, this.Q0, getThumbTintMode());
        this.M0 = xy5.m56944c(this.M0, this.R0, this.S0);
        m14775s();
        Drawable drawable = this.L0;
        Drawable drawable2 = this.M0;
        int i = this.N0;
        super.setThumbDrawable(xy5.m56943b(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    /* renamed from: q */
    public final void m14774q() {
        this.O0 = xy5.m56944c(this.O0, this.T0, getTrackTintMode());
        this.P0 = xy5.m56944c(this.P0, this.U0, this.V0);
        m14775s();
        Drawable layerDrawable = this.O0;
        if (layerDrawable != null && this.P0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.O0, this.P0});
        } else if (layerDrawable == null) {
            layerDrawable = this.P0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    /* renamed from: s */
    public final void m14775s() {
        if (this.Q0 == null && this.R0 == null && this.T0 == null && this.U0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.Q0;
        if (colorStateList != null) {
            m14772r(this.L0, colorStateList, this.W0, this.X0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.R0;
        if (colorStateList2 != null) {
            m14772r(this.M0, colorStateList2, this.W0, this.X0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.T0;
        if (colorStateList3 != null) {
            m14772r(this.O0, colorStateList3, this.W0, this.X0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.U0;
        if (colorStateList4 != null) {
            m14772r(this.P0, colorStateList4, this.W0, this.X0, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.L0 = drawable;
        m14773p();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.M0 = drawable;
        m14773p();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(lk0.m37353b(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.N0 != i) {
            this.N0 = i;
            m14773p();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.R0 = colorStateList;
        m14773p();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.S0 = mode;
        m14773p();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.Q0 = colorStateList;
        m14773p();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        m14773p();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.P0 = drawable;
        m14774q();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(lk0.m37353b(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.U0 = colorStateList;
        m14774q();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.V0 = mode;
        m14774q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.O0 = drawable;
        m14774q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.T0 = colorStateList;
        m14774q();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        m14774q();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        int i2 = Y0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.N0 = -1;
        Context context2 = getContext();
        this.L0 = super.getThumbDrawable();
        this.Q0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.O0 = super.getTrackDrawable();
        this.T0 = super.getTrackTintList();
        super.setTrackTintList(null);
        anh anhVarM19306j = bkh.m19306j(context2, attributeSet, ebe.MaterialSwitch, i, i2, new int[0]);
        this.M0 = anhVarM19306j.m17532g(ebe.MaterialSwitch_thumbIcon);
        this.N0 = anhVarM19306j.m17531f(ebe.MaterialSwitch_thumbIconSize, -1);
        this.R0 = anhVarM19306j.m17528c(ebe.MaterialSwitch_thumbIconTint);
        this.S0 = xzi.m57081q(anhVarM19306j.m17536k(ebe.MaterialSwitch_thumbIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.P0 = anhVarM19306j.m17532g(ebe.MaterialSwitch_trackDecoration);
        this.U0 = anhVarM19306j.m17528c(ebe.MaterialSwitch_trackDecorationTint);
        this.V0 = xzi.m57081q(anhVarM19306j.m17536k(ebe.MaterialSwitch_trackDecorationTintMode, -1), PorterDuff.Mode.SRC_IN);
        anhVarM19306j.m17546x();
        setEnforceSwitchWidth(false);
        m14773p();
        m14774q();
    }
}
