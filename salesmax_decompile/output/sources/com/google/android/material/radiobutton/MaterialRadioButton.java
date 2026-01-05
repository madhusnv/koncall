package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import p001o.bkh;
import p001o.ebe;
import p001o.gua;
import p001o.gza;
import p001o.op3;
import p001o.pae;
import p001o.x5e;
import p001o.yya;
import p001o.z5e;

/* loaded from: classes3.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: g */
    public static final int f12830g = pae.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h */
    public static final int[][] f12831h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f12832e;

    /* renamed from: f */
    public boolean f12833f;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12832e == null) {
            int iM29505d = gua.m29505d(this, z5e.colorControlActivated);
            int iM29505d2 = gua.m29505d(this, x5e.colorOnSurface);
            int iM29505d3 = gua.m29505d(this, x5e.colorSurface);
            int[][] iArr = f12831h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = gua.m29512k(iM29505d3, iM29505d, 1.0f);
            iArr2[1] = gua.m29512k(iM29505d3, iM29505d2, 0.54f);
            iArr2[2] = gua.m29512k(iM29505d3, iM29505d2, 0.38f);
            iArr2[3] = gua.m29512k(iM29505d3, iM29505d2, 0.38f);
            this.f12832e = new ColorStateList(iArr, iArr2);
        }
        return this.f12832e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12833f && op3.m42524b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f12833f = z;
        if (z) {
            op3.m42526d(this, getMaterialThemeColorsTintList());
        } else {
            op3.m42526d(this, null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12830g;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayM19305i.hasValue(ebe.MaterialRadioButton_buttonTint)) {
            op3.m42526d(this, yya.m58494a(context2, typedArrayM19305i, ebe.MaterialRadioButton_buttonTint));
        }
        this.f12833f = typedArrayM19305i.getBoolean(ebe.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayM19305i.recycle();
    }
}
