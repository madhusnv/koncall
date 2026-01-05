package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import p001o.dv7;
import p001o.r8e;
import p001o.wvi;

/* loaded from: classes2.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    /* renamed from: A */
    private void m4200A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: B */
    public static int m4201B(View view) {
        int iM55088A = wvi.m55088A(view);
        if (iM55088A > 0) {
            return iM55088A;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m4201B(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* renamed from: l */
    private void m4202l(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i4;
                }
            }
        }
    }

    /* renamed from: C */
    public final boolean m4203C(int i, int i2) {
        int iCombineMeasuredStates;
        int iM4201B;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == r8e.topPanel) {
                    view = childAt;
                } else if (id == r8e.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != r8e.contentPanel && id != r8e.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iM4201B = m4201B(view2);
            measuredHeight = view2.getMeasuredHeight() - iM4201B;
            paddingTop += iM4201B;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM4201B = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingTop;
        if (view2 != null) {
            int i5 = paddingTop - iM4201B;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iM4201B += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM4201B, 1073741824));
            paddingTop = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        m4202l(childCount, i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int i10 = gravity & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int iM23889b = dv7.m23889b(i12, getLayoutDirection()) & 7;
                if (iM23889b == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                } else if (iM23889b != 5) {
                    i7 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    if (m4275t(i11)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i13 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    m4200A(childAt, i7, i13, measuredWidth, measuredHeight2);
                    paddingTop = i13 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i7 = i5 - i6;
                if (m4275t(i11)) {
                }
                int i132 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                m4200A(childAt, i7, i132, measuredWidth, measuredHeight2);
                paddingTop = i132 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        if (m4203C(i, i2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
