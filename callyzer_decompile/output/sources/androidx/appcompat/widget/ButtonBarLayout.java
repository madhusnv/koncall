package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import p009j.AbstractC3500a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f1761a;

    /* renamed from: b */
    public boolean f1762b;

    /* renamed from: c */
    public int f1763c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1763c = -1;
        int[] iArr = AbstractC3500a.f18352i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        v0.m2527i(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f1761a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1761a);
        }
    }

    private void setStacked(boolean z6) {
        if (this.f1762b != z6) {
            if (!z6 || this.f1761a) {
                this.f1762b = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z6;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f1761a) {
            if (size > this.f1763c && this.f1762b) {
                setStacked(false);
            }
            this.f1763c = size;
        }
        if (this.f1762b || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z6 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f1761a && !this.f1762b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (i13 >= childCount) {
                i13 = -1;
                break;
            } else if (getChildAt(i13).getVisibility() == 0) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            View childAt = getChildAt(i13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1762b) {
                int i14 = i13 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i14 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i14).getVisibility() == 0) {
                        i12 = i14;
                        break;
                    }
                    i14++;
                }
                paddingBottom = i12 >= 0 ? getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = v0.f5527a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f1761a != z6) {
            this.f1761a = z6;
            if (!z6 && this.f1762b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
