package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;
import p001o.x6e;

/* loaded from: classes3.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {
    public final int P0;
    public final int Q0;
    public final int R0;
    public final int S0;
    public boolean T0;
    public final List U0;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.U0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.P0 = resources.getDimensionPixelSize(x6e.design_bottom_navigation_item_max_width);
        this.Q0 = resources.getDimensionPixelSize(x6e.design_bottom_navigation_item_min_width);
        this.R0 = resources.getDimensionPixelSize(x6e.design_bottom_navigation_active_item_max_width);
        this.S0 = resources.getDimensionPixelSize(x6e.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    /* renamed from: h */
    public NavigationBarItemView mo14149h(Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i8 = i5 - measuredWidth;
                    childAt.layout(i8 - childAt.getMeasuredWidth(), 0, i8, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.U0.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i5 = 0;
        if (getItemIconGravity() == 0) {
            if (m14823l(getLabelVisibilityMode(), currentVisibleContentItemCount) && m14150u()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int iMax2 = this.S0;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.R0, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i6 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin = Math.min(size - (this.Q0 * i6), Math.min(iMax2, this.R0));
                int i7 = size - iMin;
                int iMin2 = Math.min(i7 / (i6 != 0 ? i6 : 1), this.P0);
                int i8 = i7 - (i6 * iMin2);
                int i9 = 0;
                while (i9 < childCount) {
                    if (getChildAt(i9).getVisibility() != 8) {
                        i4 = i9 == getSelectedItemPosition() ? iMin : iMin2;
                        if (i8 > 0) {
                            i4++;
                            i8--;
                        }
                    } else {
                        i4 = 0;
                    }
                    this.U0.add(Integer.valueOf(i4));
                    i9++;
                }
            } else {
                int iMin3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), this.R0);
                int i10 = size - (currentVisibleContentItemCount * iMin3);
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (getChildAt(i11).getVisibility() == 8) {
                        i3 = 0;
                    } else if (i10 > 0) {
                        i3 = iMin3 + 1;
                        i10--;
                    } else {
                        i3 = iMin3;
                    }
                    this.U0.add(Integer.valueOf(i3));
                }
            }
            measuredWidth = 0;
            iMax = 0;
            while (i5 < childCount) {
                View childAt2 = getChildAt(i5);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) this.U0.get(i5)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    measuredWidth += childAt2.getMeasuredWidth();
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                }
                i5++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f;
            float f2 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f2);
            int iRound2 = Math.round(f / f2);
            int measuredWidth2 = 0;
            int iMax3 = 0;
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    measuredWidth2 += childAt3.getMeasuredWidth();
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                }
                i5++;
            }
            measuredWidth = measuredWidth2;
            iMax = iMax3;
        }
        setMeasuredDimension(measuredWidth, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.T0 = z;
    }

    /* renamed from: u */
    public boolean m14150u() {
        return this.T0;
    }
}
