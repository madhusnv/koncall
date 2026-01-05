package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import p001o.bkh;
import p001o.ebe;
import p001o.gua;
import p001o.gza;
import p001o.o46;
import p001o.pae;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;
import p001o.z5e;

/* loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int P0 = pae.Widget_MaterialComponents_CompoundButton_Switch;
    public static final int[][] Q0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final o46 L0;
    public ColorStateList M0;
    public ColorStateList N0;
    public boolean O0;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() throws Resources.NotFoundException {
        if (this.M0 == null) {
            int iM29505d = gua.m29505d(this, x5e.colorSurface);
            int iM29505d2 = gua.m29505d(this, z5e.colorControlActivated);
            float dimension = getResources().getDimension(x6e.mtrl_switch_thumb_elevation);
            if (this.L0.m41516e()) {
                dimension += xzi.m57077m(this);
            }
            int iM41514c = this.L0.m41514c(iM29505d, dimension);
            int[][] iArr = Q0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = gua.m29512k(iM29505d, iM29505d2, 1.0f);
            iArr2[1] = iM41514c;
            iArr2[2] = gua.m29512k(iM29505d, iM29505d2, 0.38f);
            iArr2[3] = iM41514c;
            this.M0 = new ColorStateList(iArr, iArr2);
        }
        return this.M0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.N0 == null) {
            int[][] iArr = Q0;
            int[] iArr2 = new int[iArr.length];
            int iM29505d = gua.m29505d(this, x5e.colorSurface);
            int iM29505d2 = gua.m29505d(this, z5e.colorControlActivated);
            int iM29505d3 = gua.m29505d(this, x5e.colorOnSurface);
            iArr2[0] = gua.m29512k(iM29505d, iM29505d2, 0.54f);
            iArr2[1] = gua.m29512k(iM29505d, iM29505d3, 0.32f);
            iArr2[2] = gua.m29512k(iM29505d, iM29505d2, 0.12f);
            iArr2[3] = gua.m29512k(iM29505d, iM29505d3, 0.12f);
            this.N0 = new ColorStateList(iArr, iArr2);
        }
        return this.N0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.O0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.O0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.O0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        int i2 = P0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.L0 = new o46(context2);
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.SwitchMaterial, i, i2, new int[0]);
        this.O0 = typedArrayM19305i.getBoolean(ebe.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayM19305i.recycle();
    }
}
