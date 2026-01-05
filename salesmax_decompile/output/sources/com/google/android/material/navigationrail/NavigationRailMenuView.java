package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import p001o.osb;

/* loaded from: classes3.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    public int P0;
    public int Q0;
    public final FrameLayout.LayoutParams R0;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.P0 = -1;
        this.Q0 = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.R0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    public int getItemMinimumHeight() {
        return this.P0;
    }

    public int getItemSpacing() {
        return this.Q0;
    }

    public int getMenuGravity() {
        return this.R0.gravity;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    /* renamed from: h */
    public NavigationBarItemView mo14149h(Context context) {
        return new osb(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        int measuredHeight = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                measuredHeight += childAt.getMeasuredHeight();
                i6++;
            }
        }
        int iMax = i6 <= 1 ? 0 : Math.max(0, Math.min((getMeasuredHeight() - measuredHeight) / (i6 - 1), this.Q0));
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                childAt2.layout(0, i8, i5, measuredHeight2 + i8);
                i8 += measuredHeight2 + iMax;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState((currentVisibleContentItemCount <= 1 || !m14823l(getLabelVisibilityMode(), currentVisibleContentItemCount)) ? m14874w(i, size, currentVisibleContentItemCount, null) : m14875x(i, size, currentVisibleContentItemCount), i2, 0));
    }

    public void setItemMinimumHeight(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            requestLayout();
        }
    }

    public void setItemSpacing(int i) {
        if (this.Q0 != i) {
            this.Q0 = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.R0;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: u */
    public final int m14872u(int i, int i2, int i3) {
        int iMax = i2 / Math.max(1, i3);
        int size = this.P0;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    /* renamed from: v */
    public final int m14873v(View view, int i, int i2) {
        view.measure(i, i2);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: w */
    public final int m14874w(int i, int i2, int i3, View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 0);
        int childCount = getChildCount();
        int iM14873v = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!(childAt instanceof NavigationBarItemView)) {
                int iM14873v2 = m14873v(childAt, i, iMakeMeasureSpec);
                i2 -= iM14873v2;
                iM14873v += iM14873v2;
            }
        }
        int iM14872u = view == null ? m14872u(i, Math.max(i2, 0), i3) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() == 0) {
                i5++;
            }
            if ((childAt2 instanceof NavigationBarItemView) && childAt2 != view) {
                iM14873v += m14873v(childAt2, i, iM14872u);
            }
        }
        return iM14873v + (Math.max(0, i5 - 1) * this.Q0);
    }

    /* renamed from: x */
    public final int m14875x(int i, int i2, int i3) {
        int iM14873v;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iM14873v = m14873v(childAt, i, m14872u(i, i2, i3));
            i2 -= iM14873v;
            i3--;
        } else {
            iM14873v = 0;
        }
        return iM14873v + m14874w(i, i2, i3, childAt);
    }
}
