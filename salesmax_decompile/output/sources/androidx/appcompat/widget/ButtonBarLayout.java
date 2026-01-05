package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p001o.bbe;
import p001o.r8e;
import p001o.wvi;

/* loaded from: classes2.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f5863a;

    /* renamed from: b */
    public boolean f5864b;

    /* renamed from: c */
    public int f5865c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5865c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bbe.ButtonBarLayout);
        wvi.k0(this, context, bbe.ButtonBarLayout, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f5863a = typedArrayObtainStyledAttributes.getBoolean(bbe.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f5863a);
        }
    }

    private void setStacked(boolean z) {
        if (this.f5864b != z) {
            if (!z || this.f5863a) {
                this.f5864b = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(r8e.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* renamed from: a */
    public final int m4262a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean m4263b() {
        return this.f5864b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f5863a) {
            if (size > this.f5865c && m4263b()) {
                setStacked(false);
            }
            this.f5865c = size;
        }
        if (m4263b() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f5863a && !m4263b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int iM4262a = m4262a(0);
        if (iM4262a >= 0) {
            View childAt = getChildAt(iM4262a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m4263b()) {
                int iM4262a2 = m4262a(iM4262a + 1);
                if (iM4262a2 >= 0) {
                    paddingTop += getChildAt(iM4262a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (wvi.m55088A(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f5863a != z) {
            this.f5863a = z;
            if (!z && m4263b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
