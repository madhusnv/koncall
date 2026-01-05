package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class NavigationRailFrameLayout extends FrameLayout {

    /* renamed from: a */
    public int f12781a;

    /* renamed from: b */
    public boolean f12782b;

    public NavigationRailFrameLayout(Context context) {
        super(context);
        this.f12781a = 0;
        this.f12782b = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int measuredHeight = this.f12781a;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int iMax = Math.max(measuredHeight, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), iMax, childAt.getRight(), childAt.getMeasuredHeight() + iMax);
            measuredHeight = iMax + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        int measuredHeight = 0;
        View childAt = getChildAt(0);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i, i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            measuredHeight = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int measuredHeight2 = (getMeasuredHeight() - measuredHeight) - this.f12781a;
            childAt = getChildAt(1);
            if (!this.f12782b) {
                i2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), this.f12781a + measuredHeight + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i) {
        this.f12781a = i;
    }

    public void setScrollingEnabled(boolean z) {
        this.f12782b = z;
    }
}
