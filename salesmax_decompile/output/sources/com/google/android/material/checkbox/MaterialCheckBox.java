package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.gms.cast.CredentialsData;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p001o.anh;
import p001o.bkh;
import p001o.dg0;
import p001o.ebe;
import p001o.fd0;
import p001o.gd0;
import p001o.gua;
import p001o.gza;
import p001o.lk0;
import p001o.n8e;
import p001o.op3;
import p001o.pae;
import p001o.tq;
import p001o.u7e;
import p001o.v9e;
import p001o.wg0;
import p001o.x5e;
import p001o.xy5;
import p001o.xzi;
import p001o.yya;
import p001o.z5e;

/* loaded from: classes3.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int p0 = pae.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] q0 = {x5e.state_indeterminate};
    public static final int[] r0;
    public static final int[][] s0;
    public static final int t0;

    /* renamed from: H */
    public Drawable f12317H;

    /* renamed from: L */
    public boolean f12318L;

    /* renamed from: M */
    public ColorStateList f12319M;

    /* renamed from: Q */
    public ColorStateList f12320Q;

    /* renamed from: e */
    public final LinkedHashSet f12321e;

    /* renamed from: f */
    public final LinkedHashSet f12322f;

    /* renamed from: g */
    public ColorStateList f12323g;

    /* renamed from: h */
    public boolean f12324h;
    public PorterDuff.Mode h0;
    public int i0;
    public int[] j0;
    public boolean k0;
    public CharSequence l0;
    public CompoundButton.OnCheckedChangeListener m0;
    public final wg0 n0;
    public final dg0 o0;

    /* renamed from: q */
    public boolean f12325q;

    /* renamed from: s */
    public boolean f12326s;

    /* renamed from: x */
    public CharSequence f12327x;

    /* renamed from: y */
    public Drawable f12328y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10991a();

        /* renamed from: a */
        public int f12329a;

        /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$a */
        public class C10991a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, C10992a c10992a) {
            this(parcel);
        }

        /* renamed from: a */
        public final String m14361a() {
            int i = this.f12329a;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + m14361a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f12329a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f12329a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    public class C10992a extends dg0 {
        public C10992a() {
        }

        @Override // p001o.dg0
        /* renamed from: b */
        public void mo14364b(Drawable drawable) {
            super.mo14364b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f12319M;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // p001o.dg0
        /* renamed from: c */
        public void mo14365c(Drawable drawable) {
            super.mo14365c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f12319M;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.j0, MaterialCheckBox.this.f12319M.getDefaultColor()));
            }
        }
    }

    static {
        int i = x5e.state_error;
        r0 = new int[]{i};
        s0 = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        t0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", CredentialsData.CREDENTIALS_TYPE_ANDROID);
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i = this.i0;
        return i == 1 ? getResources().getString(v9e.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(v9e.mtrl_checkbox_state_description_unchecked) : getResources().getString(v9e.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12323g == null) {
            int[][] iArr = s0;
            int[] iArr2 = new int[iArr.length];
            int iM29505d = gua.m29505d(this, z5e.colorControlActivated);
            int iM29505d2 = gua.m29505d(this, z5e.colorError);
            int iM29505d3 = gua.m29505d(this, x5e.colorSurface);
            int iM29505d4 = gua.m29505d(this, x5e.colorOnSurface);
            iArr2[0] = gua.m29512k(iM29505d3, iM29505d2, 1.0f);
            iArr2[1] = gua.m29512k(iM29505d3, iM29505d, 1.0f);
            iArr2[2] = gua.m29512k(iM29505d3, iM29505d4, 0.54f);
            iArr2[3] = gua.m29512k(iM29505d3, iM29505d4, 0.38f);
            iArr2[4] = gua.m29512k(iM29505d3, iM29505d4, 0.38f);
            this.f12323g = new ColorStateList(iArr, iArr2);
        }
        return this.f12323g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f12319M;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: c */
    public final boolean m14355c(anh anhVar) {
        return anhVar.m17539n(ebe.MaterialCheckBox_android_button, 0) == t0 && anhVar.m17539n(ebe.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    /* renamed from: d */
    public boolean m14356d() {
        return this.f12326s;
    }

    /* renamed from: e */
    public final void m14357e() {
        this.f12328y = xy5.m56945d(this.f12328y, this.f12319M, op3.m42525c(this));
        this.f12317H = xy5.m56945d(this.f12317H, this.f12320Q, this.h0);
        m14359g();
        m14360h();
        super.setButtonDrawable(xy5.m56942a(this.f12328y, this.f12317H));
        refreshDrawableState();
    }

    /* renamed from: f */
    public final void m14358f() {
        if (Build.VERSION.SDK_INT < 30 || this.l0 != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    /* renamed from: g */
    public final void m14359g() {
        wg0 wg0Var;
        if (this.f12318L) {
            wg0 wg0Var2 = this.n0;
            if (wg0Var2 != null) {
                wg0Var2.m54354f(this.o0);
                this.n0.m54351b(this.o0);
            }
            Drawable drawable = this.f12328y;
            if (!(drawable instanceof AnimatedStateListDrawable) || (wg0Var = this.n0) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(n8e.checked, n8e.unchecked, wg0Var, false);
            ((AnimatedStateListDrawable) this.f12328y).addTransition(n8e.indeterminate, n8e.unchecked, this.n0, false);
        }
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f12328y;
    }

    public Drawable getButtonIconDrawable() {
        return this.f12317H;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f12320Q;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.h0;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f12319M;
    }

    public int getCheckedState() {
        return this.i0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f12327x;
    }

    /* renamed from: h */
    public final void m14360h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f12328y;
        if (drawable != null && (colorStateList2 = this.f12319M) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f12317H;
        if (drawable2 == null || (colorStateList = this.f12320Q) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.i0 == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12324h && this.f12319M == null && this.f12320Q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, q0);
        }
        if (m14356d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, r0);
        }
        this.j0 = xy5.m56947f(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableM42523a;
        if (!this.f12325q || !TextUtils.isEmpty(getText()) || (drawableM42523a = op3.m42523a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM42523a.getIntrinsicWidth()) / 2) * (xzi.m57079o(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM42523a.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && m14356d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f12327x));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f12329a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12329a = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(lk0.m37353b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f12317H = drawable;
        m14357e();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(lk0.m37353b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f12320Q == colorStateList) {
            return;
        }
        this.f12320Q = colorStateList;
        m14357e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.h0 == mode) {
            return;
        }
        this.h0 = mode;
        m14357e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f12319M == colorStateList) {
            return;
        }
        this.f12319M = colorStateList;
        m14357e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m14357e();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f12325q = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManagerM28458a;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.i0 != i) {
            this.i0 = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            m14358f();
            if (this.k0) {
                return;
            }
            this.k0 = true;
            LinkedHashSet linkedHashSet = this.f12322f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    tq.m50332a(it.next());
                    throw null;
                }
            }
            if (this.i0 != 2 && (onCheckedChangeListener = this.m0) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerM28458a = gd0.m28458a(getContext().getSystemService(fd0.m26459a()))) != null) {
                autofillManagerM28458a.notifyValueChanged(this);
            }
            this.k0 = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f12327x = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f12326s == z) {
            return;
        }
        this.f12326s = z;
        refreshDrawableState();
        Iterator it = this.f12321e.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.m0 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.l0 = charSequence;
        if (charSequence == null) {
            m14358f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f12324h = z;
        if (z) {
            op3.m42526d(this, getMaterialThemeColorsTintList());
        } else {
            op3.m42526d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f12328y = drawable;
        this.f12318L = false;
        m14357e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        int i2 = p0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f12321e = new LinkedHashSet();
        this.f12322f = new LinkedHashSet();
        this.n0 = wg0.m54348a(getContext(), u7e.mtrl_checkbox_button_checked_unchecked);
        this.o0 = new C10992a();
        Context context2 = getContext();
        this.f12328y = op3.m42523a(this);
        this.f12319M = getSuperButtonTintList();
        setSupportButtonTintList(null);
        anh anhVarM19306j = bkh.m19306j(context2, attributeSet, ebe.MaterialCheckBox, i, i2, new int[0]);
        this.f12317H = anhVarM19306j.m17532g(ebe.MaterialCheckBox_buttonIcon);
        if (this.f12328y != null && bkh.m19303g(context2) && m14355c(anhVarM19306j)) {
            super.setButtonDrawable((Drawable) null);
            this.f12328y = lk0.m37353b(context2, u7e.mtrl_checkbox_button);
            this.f12318L = true;
            if (this.f12317H == null) {
                this.f12317H = lk0.m37353b(context2, u7e.mtrl_checkbox_button_icon);
            }
        }
        this.f12320Q = yya.m58495b(context2, anhVarM19306j, ebe.MaterialCheckBox_buttonIconTint);
        this.h0 = xzi.m57081q(anhVarM19306j.m17536k(ebe.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f12324h = anhVarM19306j.m17526a(ebe.MaterialCheckBox_useMaterialThemeColors, false);
        this.f12325q = anhVarM19306j.m17526a(ebe.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f12326s = anhVarM19306j.m17526a(ebe.MaterialCheckBox_errorShown, false);
        this.f12327x = anhVarM19306j.m17541p(ebe.MaterialCheckBox_errorAccessibilityLabel);
        if (anhVarM19306j.m17544s(ebe.MaterialCheckBox_checkedState)) {
            setCheckedState(anhVarM19306j.m17536k(ebe.MaterialCheckBox_checkedState, 0));
        }
        anhVarM19306j.m17546x();
        m14357e();
    }
}
