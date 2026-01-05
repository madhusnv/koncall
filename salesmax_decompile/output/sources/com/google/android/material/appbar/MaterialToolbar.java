package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import p001o.aza;
import p001o.bkh;
import p001o.ebe;
import p001o.fy5;
import p001o.gza;
import p001o.ish;
import p001o.pae;
import p001o.xy5;
import p001o.z5e;
import p001o.zya;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    public static final int Q0 = pae.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] R0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer L0;
    public boolean M0;
    public boolean N0;
    public ImageView.ScaleType O0;
    public Boolean P0;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    /* renamed from: N */
    public final Pair m13925N(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: O */
    public final void m13926O(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : xy5.m56948g(background);
        if (colorStateListValueOf != null) {
            zya zyaVar = new zya();
            zyaVar.g0(colorStateListValueOf);
            zyaVar.m60115U(context);
            zyaVar.f0(getElevation());
            setBackground(zyaVar);
        }
    }

    /* renamed from: P */
    public final void m13927P(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: Q */
    public final void m13928Q() {
        if (this.M0 || this.N0) {
            TextView textViewM32703g = ish.m32703g(this);
            TextView textViewM32701e = ish.m32701e(this);
            if (textViewM32703g == null && textViewM32701e == null) {
                return;
            }
            Pair pairM13925N = m13925N(textViewM32703g, textViewM32701e);
            if (this.M0 && textViewM32703g != null) {
                m13927P(textViewM32703g, pairM13925N);
            }
            if (!this.N0 || textViewM32701e == null) {
                return;
            }
            m13927P(textViewM32701e, pairM13925N);
        }
    }

    /* renamed from: R */
    public final Drawable m13929R(Drawable drawable) {
        if (drawable == null || this.L0 == null) {
            return drawable;
        }
        Drawable drawableM27744r = fy5.m27744r(drawable.mutate());
        drawableM27744r.setTint(this.L0.intValue());
        return drawableM27744r;
    }

    /* renamed from: S */
    public final void m13930S() {
        ImageView imageViewM32699c = ish.m32699c(this);
        if (imageViewM32699c != null) {
            Boolean bool = this.P0;
            if (bool != null) {
                imageViewM32699c.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.O0;
            if (scaleType != null) {
                imageViewM32699c.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.O0;
    }

    public Integer getNavigationIconTint() {
        return this.L0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aza.m18044e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m13928Q();
        m13930S();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        aza.m18043d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.P0;
        if (bool == null || bool.booleanValue() != z) {
            this.P0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.O0 != scaleType) {
            this.O0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m13929R(drawable));
    }

    public void setNavigationIconTint(int i) {
        this.L0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.N0 != z) {
            this.N0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.M0 != z) {
            this.M0 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        int i2 = Q0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayM19305i.hasValue(ebe.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayM19305i.getColor(ebe.MaterialToolbar_navigationIconTint, -1));
        }
        this.M0 = typedArrayM19305i.getBoolean(ebe.MaterialToolbar_titleCentered, false);
        this.N0 = typedArrayM19305i.getBoolean(ebe.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayM19305i.getInt(ebe.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = R0;
            if (i3 < scaleTypeArr.length) {
                this.O0 = scaleTypeArr[i3];
            }
        }
        if (typedArrayM19305i.hasValue(ebe.MaterialToolbar_logoAdjustViewBounds)) {
            this.P0 = Boolean.valueOf(typedArrayM19305i.getBoolean(ebe.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayM19305i.recycle();
        m13926O(context2);
    }
}
