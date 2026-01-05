package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p001o.ebe;
import p001o.gza;
import p001o.ota;
import p001o.x5e;
import p001o.yya;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    /* renamed from: t */
    public static boolean m15445t(Context context) {
        return ota.m42658b(context, x5e.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: u */
    public static int m15446u(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, ebe.MaterialTextView, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ebe.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: w */
    public static int m15447w(Context context, TypedArray typedArray, int... iArr) {
        int iM58497d = -1;
        for (int i = 0; i < iArr.length && iM58497d < 0; i++) {
            iM58497d = yya.m58497d(context, typedArray, iArr[i], -1);
        }
        return iM58497d;
    }

    /* renamed from: x */
    public static boolean m15448x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, ebe.MaterialTextView, i, i2);
        int iM15447w = m15447w(context, typedArrayObtainStyledAttributes, ebe.MaterialTextView_android_lineHeight, ebe.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return iM15447w != -1;
    }

    /* renamed from: s */
    public final void m15449s(Resources.Theme theme, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, ebe.MaterialTextAppearance);
        int iM15447w = m15447w(getContext(), typedArrayObtainStyledAttributes, ebe.MaterialTextAppearance_android_lineHeight, ebe.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (iM15447w >= 0) {
            setLineHeight(iM15447w);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (m15445t(context)) {
            m15449s(context.getTheme(), i);
        }
    }

    /* renamed from: v */
    public final void m15450v(AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        int iM15446u;
        Context context = getContext();
        if (m15445t(context)) {
            Resources.Theme theme = context.getTheme();
            if (m15448x(context, theme, attributeSet, i, i2) || (iM15446u = m15446u(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            m15449s(theme, iM15446u);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(gza.m29680d(context, attributeSet, i, 0), attributeSet, i);
        m15450v(attributeSet, i, 0);
    }
}
