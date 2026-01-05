package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import p013o.a1;
import p013o.b1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class AlertDialogLayout extends b1 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: i */
    public static int m575i(View view) {
        Field field = v0.f5527a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m575i(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    @Override // p013o.b1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r11
            int r0 = r10.getPaddingRight()
            int r14 = r14 - r0
            int r0 = r10.getMeasuredHeight()
            int r1 = r10.getChildCount()
            int r2 = r10.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            r5 = 2
            if (r3 == r4) goto L3a
            r4 = 80
            if (r3 == r4) goto L31
            int r13 = r10.getPaddingTop()
            goto L43
        L31:
            int r3 = r10.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r3 - r0
            goto L43
        L3a:
            int r3 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r0
            int r15 = r15 / r5
            int r13 = r15 + r3
        L43:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r0 = 0
            if (r15 != 0) goto L4c
            r15 = r0
            goto L50
        L4c:
            int r15 = r15.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Laf
            android.view.View r3 = r10.getChildAt(r0)
            if (r3 == 0) goto Lac
            int r4 = r3.getVisibility()
            r6 = 8
            if (r4 == r6) goto Lac
            int r4 = r3.getMeasuredWidth()
            int r6 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            o.a1 r7 = (p013o.a1) r7
            int r8 = r7.gravity
            if (r8 >= 0) goto L73
            r8 = r2
        L73:
            int r9 = r10.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r9)
            r8 = r8 & 7
            r9 = 1
            if (r8 == r9) goto L8d
            r9 = 5
            if (r8 == r9) goto L87
            int r8 = r7.leftMargin
            int r8 = r8 + r11
            goto L97
        L87:
            int r8 = r12 - r4
            int r9 = r7.rightMargin
        L8b:
            int r8 = r8 - r9
            goto L97
        L8d:
            int r8 = mm.AbstractC4801l.m9727a(r14, r4, r5, r11)
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
            goto L8b
        L97:
            boolean r9 = r10.m10212h(r0)
            if (r9 == 0) goto L9e
            int r13 = r13 + r15
        L9e:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r4 = r4 + r8
            int r9 = r13 + r6
            r3.layout(r8, r13, r4, r9)
            int r3 = r7.bottomMargin
            int r6 = r6 + r3
            int r6 = r6 + r13
            r13 = r6
        Lac:
            int r0 = r0 + 1
            goto L50
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // p013o.b1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iCombineMeasuredStates;
        int iM575i;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = alertDialogLayout.getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i10, i11);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i10, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            iM575i = m575i(view2);
            measuredHeight = view2.getMeasuredHeight() - iM575i;
            paddingBottom += iM575i;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM575i = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i13 = size - paddingBottom;
        if (view2 != null) {
            int i14 = paddingBottom - iM575i;
            int iMin = Math.min(i13, measuredHeight);
            if (iMin > 0) {
                i13 -= iMin;
                iM575i += iMin;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(iM575i, 1073741824));
            paddingBottom = i14 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i13, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = alertDialogLayout.getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i16 = i11;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i10, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i16, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i17 = 0;
            while (i17 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i17);
                if (childAt3.getVisibility() != 8) {
                    a1 a1Var = (a1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) a1Var).width == -1) {
                        int i18 = ((LinearLayout.LayoutParams) a1Var).height;
                        ((LinearLayout.LayoutParams) a1Var).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i16, 0);
                        ((LinearLayout.LayoutParams) a1Var).height = i18;
                    }
                }
                i17++;
                alertDialogLayout = this;
                i16 = i11;
            }
        }
    }
}
