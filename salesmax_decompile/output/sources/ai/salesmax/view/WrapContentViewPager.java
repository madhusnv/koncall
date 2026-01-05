package ai.salesmax.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import p001o.bce;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class WrapContentViewPager extends ViewPager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentViewPager(Context context) {
        super(context);
        sq8.m48649h(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bce.m18601d(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i));
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            sq8.m48648g(childAt, "getChildAt(...)");
            childAt.measure(iMakeMeasureSpec, 0);
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        if (i3 != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sq8.m48649h(context, "context");
    }
}
