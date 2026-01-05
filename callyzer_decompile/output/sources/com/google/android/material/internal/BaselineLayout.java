package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: a */
    public int f6918a;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6918a = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f6918a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i12 - i10) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int iM9727a = AbstractC4801l.m9727a(paddingRight, measuredWidth, 2, paddingLeft);
                int baseline = (this.f6918a == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f6918a + paddingTop) - childAt.getBaseline();
                childAt.layout(iM9727a, baseline, measuredWidth + iM9727a, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        int iCombineMeasuredStates = 0;
        int iMax3 = -1;
        int iMax4 = -1;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    iMax3 = Math.max(iMax3, baseline);
                    iMax4 = Math.max(iMax4, childAt.getMeasuredHeight() - baseline);
                }
                iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        if (iMax3 != -1) {
            iMax = Math.max(iMax, Math.max(iMax4, getPaddingBottom()) + iMax3);
            this.f6918a = iMax3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax2, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates << 16));
    }
}
