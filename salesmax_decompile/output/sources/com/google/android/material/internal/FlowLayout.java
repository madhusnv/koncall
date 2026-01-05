package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import p001o.ebe;
import p001o.n8e;

/* loaded from: classes3.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    public int f12686a;

    /* renamed from: b */
    public int f12687b;

    /* renamed from: c */
    public boolean f12688c;

    /* renamed from: d */
    public int f12689d;

    public FlowLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static int m14752a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: b */
    public int m14753b(View view) {
        Object tag = view.getTag(n8e.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo14406c() {
        return this.f12688c;
    }

    /* renamed from: d */
    public final void m14754d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ebe.FlowLayout, 0, 0);
        this.f12686a = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.FlowLayout_lineSpacing, 0);
        this.f12687b = typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.FlowLayout_horizontalItemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f12687b;
    }

    public int getLineSpacing() {
        return this.f12686a;
    }

    public int getRowCount() {
        return this.f12689d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.f12689d = 0;
            return;
        }
        this.f12689d = 1;
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(n8e.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                if (!this.f12688c && measuredWidth2 > i5) {
                    i6 = this.f12686a + paddingTop;
                    this.f12689d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(n8e.row_index_key, Integer.valueOf(this.f12689d - 1));
                int i8 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, i6, (i5 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(i8, i6, measuredWidth3, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.f12687b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i5 - getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin + 0;
                    i4 = marginLayoutParams.rightMargin + 0;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i9 = paddingLeft2;
                if (paddingLeft2 + i3 + childAt.getMeasuredWidth() <= paddingRight || mo14406c()) {
                    paddingLeft = i9;
                } else {
                    paddingLeft = getPaddingLeft();
                    i6 = this.f12686a + paddingTop;
                }
                int measuredWidth = paddingLeft + i3 + childAt.getMeasuredWidth();
                int measuredHeight = i6 + childAt.getMeasuredHeight();
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i3 + i4 + childAt.getMeasuredWidth() + this.f12687b;
                if (i8 == getChildCount() - 1) {
                    i7 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m14752a(size, mode, i7 + getPaddingRight()), m14752a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.f12687b = i;
    }

    public void setLineSpacing(int i) {
        this.f12686a = i;
    }

    public void setSingleLine(boolean z) {
        this.f12688c = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12688c = false;
        m14754d(context, attributeSet);
    }
}
