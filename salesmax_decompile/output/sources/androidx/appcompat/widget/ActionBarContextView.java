package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1792e;
import p001o.anh;
import p001o.bbe;
import p001o.g9e;
import p001o.n6;
import p001o.r8e;
import p001o.vm;
import p001o.wvi;
import p001o.xyi;
import p001o.yzi;
import p001o.z5e;

/* loaded from: classes2.dex */
public class ActionBarContextView extends n6 {

    /* renamed from: H */
    public View f5702H;

    /* renamed from: L */
    public LinearLayout f5703L;

    /* renamed from: M */
    public TextView f5704M;

    /* renamed from: Q */
    public TextView f5705Q;
    public int h0;
    public int i0;
    public boolean j0;
    public int k0;

    /* renamed from: q */
    public CharSequence f5706q;

    /* renamed from: s */
    public CharSequence f5707s;

    /* renamed from: x */
    public View f5708x;

    /* renamed from: y */
    public View f5709y;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC1801a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ vm f5710a;

        public ViewOnClickListenerC1801a(vm vmVar) {
            this.f5710a = vmVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f5710a.mo3931c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // p001o.n6
    /* renamed from: f */
    public /* bridge */ /* synthetic */ xyi mo4113f(int i, long j) {
        return super.mo4113f(i, j);
    }

    /* renamed from: g */
    public void m4114g() {
        if (this.f5708x == null) {
            m4118k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p001o.n6
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p001o.n6
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f5707s;
    }

    public CharSequence getTitle() {
        return this.f5706q;
    }

    /* renamed from: h */
    public void m4115h(vm vmVar) {
        View view = this.f5708x;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.k0, (ViewGroup) this, false);
            this.f5708x = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f5708x);
        }
        View viewFindViewById = this.f5708x.findViewById(r8e.action_mode_close_button);
        this.f5709y = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC1801a(vmVar));
        C1792e c1792e = (C1792e) vmVar.mo3933e();
        ActionMenuPresenter actionMenuPresenter = this.f36422d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m4154B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f36422d = actionMenuPresenter2;
        actionMenuPresenter2.m4165M(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c1792e.m4042c(this.f36422d, this.f36420b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f36422d.mo3976r(this);
        this.f36421c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f36421c, layoutParams);
    }

    /* renamed from: i */
    public final void m4116i() {
        if (this.f5703L == null) {
            LayoutInflater.from(getContext()).inflate(g9e.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f5703L = linearLayout;
            this.f5704M = (TextView) linearLayout.findViewById(r8e.action_bar_title);
            this.f5705Q = (TextView) this.f5703L.findViewById(r8e.action_bar_subtitle);
            if (this.h0 != 0) {
                this.f5704M.setTextAppearance(getContext(), this.h0);
            }
            if (this.i0 != 0) {
                this.f5705Q.setTextAppearance(getContext(), this.i0);
            }
        }
        this.f5704M.setText(this.f5706q);
        this.f5705Q.setText(this.f5707s);
        boolean z = !TextUtils.isEmpty(this.f5706q);
        boolean z2 = !TextUtils.isEmpty(this.f5707s);
        int i = 0;
        this.f5705Q.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f5703L;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f5703L.getParent() == null) {
            addView(this.f5703L);
        }
    }

    /* renamed from: j */
    public boolean m4117j() {
        return this.j0;
    }

    /* renamed from: k */
    public void m4118k() {
        removeAllViews();
        this.f5702H = null;
        this.f36421c = null;
        this.f36422d = null;
        View view = this.f5709y;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m4119l() {
        ActionMenuPresenter actionMenuPresenter = this.f36422d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m4166N();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f36422d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m4157E();
            this.f36422d.m4158F();
        }
    }

    @Override // p001o.n6, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM58585b = yzi.m58585b(this);
        int paddingRight = zM58585b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f5708x;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5708x.getLayoutParams();
            int i5 = zM58585b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM58585b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iM40135d = n6.m40135d(paddingRight, i5, zM58585b);
            paddingRight = n6.m40135d(iM40135d + m40137e(this.f5708x, iM40135d, paddingTop, paddingTop2, zM58585b), i6, zM58585b);
        }
        int iM40137e = paddingRight;
        LinearLayout linearLayout = this.f5703L;
        if (linearLayout != null && this.f5702H == null && linearLayout.getVisibility() != 8) {
            iM40137e += m40137e(this.f5703L, iM40137e, paddingTop, paddingTop2, zM58585b);
        }
        int i7 = iM40137e;
        View view2 = this.f5702H;
        if (view2 != null) {
            m40137e(view2, i7, paddingTop, paddingTop2, zM58585b);
        }
        int paddingLeft = zM58585b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f36421c;
        if (actionMenuView != null) {
            m40137e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM58585b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f36423e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f5708x;
        if (view != null) {
            int iM40136c = m40136c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5708x.getLayoutParams();
            paddingLeft = iM40136c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f36421c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m40136c(this.f36421c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f5703L;
        if (linearLayout != null && this.f5702H == null) {
            if (this.j0) {
                this.f5703L.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f5703L.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f5703L.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m40136c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f5702H;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f5702H.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f36423e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // p001o.n6, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p001o.n6
    public void setContentHeight(int i) {
        this.f36423e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f5702H;
        if (view2 != null) {
            removeView(view2);
        }
        this.f5702H = view;
        if (view != null && (linearLayout = this.f5703L) != null) {
            removeView(linearLayout);
            this.f5703L = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f5707s = charSequence;
        m4116i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f5706q = charSequence;
        m4116i();
        wvi.o0(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.j0) {
            requestLayout();
        }
        this.j0 = z;
    }

    @Override // p001o.n6, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, z5e.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        anh anhVarM17525v = anh.m17525v(context, attributeSet, bbe.ActionMode, i, 0);
        setBackground(anhVarM17525v.m17532g(bbe.ActionMode_background));
        this.h0 = anhVarM17525v.m17539n(bbe.ActionMode_titleTextStyle, 0);
        this.i0 = anhVarM17525v.m17539n(bbe.ActionMode_subtitleTextStyle, 0);
        this.f36423e = anhVarM17525v.m17538m(bbe.ActionMode_height, 0);
        this.k0 = anhVarM17525v.m17539n(bbe.ActionMode_closeItemLayout, g9e.abc_action_mode_close_item_material);
        anhVarM17525v.m17546x();
    }
}
