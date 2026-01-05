package com.google.android.material.textview;

import ah.AbstractC0143a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import og.v0;
import p013o.j0;
import sh.AbstractC6844a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MaterialTextView extends j0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(AbstractC6844a.m13042a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        TypedValue typedValueM11009b = v0.m11009b(context2, com.websoptimization.callyzerbiz.R.attr.textAppearanceLineHeightEnabled);
        if (typedValueM11009b != null && typedValueM11009b.type == 18 && typedValueM11009b.data == 0) {
            return;
        }
        Resources.Theme theme = context2.getTheme();
        int[] iArr = AbstractC0143a.f467p;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int iM4142d = m4142d(context2, typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iM4142d != -1) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0143a.f466o);
            int iM4142d2 = m4142d(getContext(), typedArrayObtainStyledAttributes3, 1, 2);
            typedArrayObtainStyledAttributes3.recycle();
            if (iM4142d2 >= 0) {
                setLineHeight(iM4142d2);
            }
        }
    }

    /* renamed from: d */
    public static int m4142d(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i10 = 0; i10 < iArr.length && dimensionPixelSize < 0; i10++) {
            int i11 = iArr[i10];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i11, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // p013o.j0, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        TypedValue typedValueM11009b = v0.m11009b(context, com.websoptimization.callyzerbiz.R.attr.textAppearanceLineHeightEnabled);
        if (typedValueM11009b != null && typedValueM11009b.type == 18 && typedValueM11009b.data == 0) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, AbstractC0143a.f466o);
        int iM4142d = m4142d(getContext(), typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iM4142d >= 0) {
            setLineHeight(iM4142d);
        }
    }
}
