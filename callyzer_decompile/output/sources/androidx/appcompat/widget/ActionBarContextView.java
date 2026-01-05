package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c6.v0;
import com.websoptimization.callyzerbiz.R;
import mm.AbstractC4801l;
import p009j.AbstractC3500a;
import p013o.l2;
import pg.s8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a */
    public int f1710a;

    /* renamed from: b */
    public boolean f1711b;

    /* renamed from: c */
    public boolean f1712c;

    /* renamed from: d */
    public CharSequence f1713d;

    /* renamed from: e */
    public CharSequence f1714e;

    /* renamed from: f */
    public View f1715f;

    /* renamed from: g */
    public LinearLayout f1716g;

    /* renamed from: h */
    public TextView f1717h;

    /* renamed from: j */
    public TextView f1718j;

    /* renamed from: k */
    public final int f1719k;

    /* renamed from: l */
    public final int f1720l;

    /* renamed from: m */
    public boolean f1721m;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3500a.f18347d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : s8.m11864b(context, resourceId));
        this.f1719k = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f1720l = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1710a = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static int m556b(View view, int i10, int i11, int i12, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iM9727a = AbstractC4801l.m9727a(i12, measuredHeight, 2, i11);
        if (z6) {
            view.layout(i10 - measuredWidth, iM9727a, i10, measuredHeight + iM9727a);
        } else {
            view.layout(i10, iM9727a, i10 + measuredWidth, measuredHeight + iM9727a);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public final void m557a() {
        if (this.f1716g == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1716g = linearLayout;
            this.f1717h = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1718j = (TextView) this.f1716g.findViewById(R.id.action_bar_subtitle);
            int i10 = this.f1719k;
            if (i10 != 0) {
                this.f1717h.setTextAppearance(getContext(), i10);
            }
            int i11 = this.f1720l;
            if (i11 != 0) {
                this.f1718j.setTextAppearance(getContext(), i11);
            }
        }
        this.f1717h.setText(this.f1713d);
        this.f1718j.setText(this.f1714e);
        boolean zIsEmpty = TextUtils.isEmpty(this.f1713d);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f1714e);
        this.f1718j.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f1716g.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f1716g.getParent() == null) {
            addView(this.f1716g);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            super.setVisibility(i10);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1710a;
    }

    public CharSequence getSubtitle() {
        return this.f1714e;
    }

    public CharSequence getTitle() {
        return this.f1713d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC3500a.f18344a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1712c = false;
        }
        if (!this.f1712c) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1712c = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1712c = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        boolean z10 = l2.f25576a;
        boolean z11 = getLayoutDirection() == 1;
        int paddingRight = z11 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f1716g;
        if (linearLayout != null && this.f1715f == null && linearLayout.getVisibility() != 8) {
            paddingRight += m556b(this.f1716g, paddingRight, paddingTop, paddingTop2, z11);
        }
        View view = this.f1715f;
        if (view != null) {
            m556b(view, paddingRight, paddingTop, paddingTop2, z11);
        }
        if (z11) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1710a;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f1716g;
        if (linearLayout != null && this.f1715f == null) {
            if (this.f1721m) {
                this.f1716g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f1716g.getMeasuredWidth();
                boolean z6 = measuredWidth <= paddingLeft;
                if (z6) {
                    paddingLeft -= measuredWidth;
                }
                this.f1716g.setVisibility(z6 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f1715f;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f1715f.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1710a > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1711b = false;
        }
        if (!this.f1711b) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1711b = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1711b = false;
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1710a = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1715f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1715f = view;
        if (view != null && (linearLayout = this.f1716g) != null) {
            removeView(linearLayout);
            this.f1716g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1714e = charSequence;
        m557a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1713d = charSequence;
        m557a();
        v0.m2529k(this, charSequence);
    }

    public void setTitleOptional(boolean z6) {
        if (z6 != this.f1721m) {
            requestLayout();
        }
        this.f1721m = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
