package com.google.android.material.appbar;

import ah.AbstractC0143a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c6.n0;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import lh.AbstractC4475k;
import og.wb;
import ph.C5952g;
import sh.AbstractC6844a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public Integer Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f43884a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f43885b1;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC6844a.m13042a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM9328e = AbstractC4475k.m9328e(context2, attributeSet, AbstractC0143a.f468q, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayM9328e.hasValue(0)) {
            setNavigationIconTint(typedArrayM9328e.getColor(0, -1));
        }
        this.f43884a1 = typedArrayM9328e.getBoolean(2, false);
        this.f43885b1 = typedArrayM9328e.getBoolean(1, false);
        typedArrayM9328e.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C5952g c5952g = new C5952g();
            c5952g.m11988i(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c5952g.m11986g(context2);
            Field field = v0.f5527a;
            c5952g.m11987h(n0.m2453e(this));
            setBackground(c5952g);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C5952g) {
            wb.m11030c(this, (C5952g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        if (this.f43884a1 || this.f43885b1) {
            TextView textViewM9327d = AbstractC4475k.m9327d(this, getTitle());
            TextView textViewM9327d2 = AbstractC4475k.m9327d(this, getSubtitle());
            if (textViewM9327d == null && textViewM9327d2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i14 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() != 8 && childAt != textViewM9327d && childAt != textViewM9327d2) {
                    if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.f43884a1 && textViewM9327d != null) {
                m4047t(textViewM9327d, pair);
            }
            if (!this.f43885b1 || textViewM9327d2 == null) {
                return;
            }
            m4047t(textViewM9327d2, pair);
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof C5952g) {
            ((C5952g) background).m11987h(f6);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.Z0) != null) {
            drawable.setTint(num.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.Z0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f43885b1 != z6) {
            this.f43885b1 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f43884a1 != z6) {
            this.f43884a1 = z6;
            requestLayout();
        }
    }

    /* renamed from: t */
    public final void m4047t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
