package lh;

import android.view.View;
import android.view.ViewGroup;
import c6.v0;
import com.google.android.material.chip.ChipGroup;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lh.d */
/* loaded from: classes.dex */
public abstract class AbstractC4468d extends ViewGroup {

    /* renamed from: a */
    public int f22271a;

    /* renamed from: b */
    public int f22272b;

    /* renamed from: c */
    public boolean f22273c;

    /* renamed from: d */
    public int f22274d;

    public int getItemSpacing() {
        return this.f22272b;
    }

    public int getLineSpacing() {
        return this.f22271a;
    }

    public int getRowCount() {
        return this.f22274d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.f22274d = 0;
            return;
        }
        this.f22274d = 1;
        Field field = v0.f5527a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i14 = (i12 - i10) - paddingLeft;
        int measuredWidth = paddingRight;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
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
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                if (!this.f22273c && measuredWidth2 > i14) {
                    i15 = this.f22271a + paddingTop;
                    this.f22274d++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f22274d - 1));
                int i17 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z10) {
                    childAt.layout(i14 - measuredWidth3, i15, (i14 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(i17, i15, measuredWidth3, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f22272b;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i19 = i13;
                if (childAt.getMeasuredWidth() + paddingLeft + i14 > paddingRight && !((ChipGroup) this).f22273c) {
                    paddingLeft = getPaddingLeft();
                    i16 = paddingTop + this.f22271a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i14 + i19 + this.f22272b + paddingLeft;
                if (i18 == getChildCount() - 1) {
                    i17 += i19;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i17;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i12 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i12 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i12) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f22272b = i10;
    }

    public void setLineSpacing(int i10) {
        this.f22271a = i10;
    }

    public void setSingleLine(boolean z6) {
        this.f22273c = z6;
    }
}
